# If Test

JMH benchmark throughput comparison of performance of difference approaches mapping values.

Performance after reading https://dev.to/tomazlemos/keeping-your-code-clean-by-sweeping-out-if-statements-4in8

Three implementation, `if else if...`, `map` (hashmap) and a `switch`.

With one notable exception, the results were as I had expected:

* The `if else if...` approach became slower for matches against the "later" input options i.e. proportional to the number of comparisons performed before a match was found.
* The `map` approach provided constant performance for all input options,
* The `switch` approach also provided constant performance for all input options, not expected but I'll assume some compiler optimisations there.
* The `switch` approach was slightly faster than the `map` approach.
* The `switch` and `map` approaches were both slower than the `if else if...` **until you test the 3rd or 4th input options** respectively.
* The `if else if...` approach degraded in performance until the 11th input when it improved slightly and then continued to degrade again. (I can't explain this).

In general, I prefer the `map` approach over a large `if else if...` block and 3 or 4 branches seems like a nice rule of thumb for when you  might want to look at moving to the `map` or `switch` approach, both in terms of performance and readability, IMHO.

```
Benchmark               (input)   Mode  Cnt          Score         Error  Units
MapperTests.ifImpl       value0  thrpt    5  225391654.785 ± 3290306.715  ops/s
MapperTests.ifImpl       value1  thrpt    5  137626847.272 ±  368944.076  ops/s
MapperTests.ifImpl       value2  thrpt    5  108679300.029 ± 3299310.284  ops/s
MapperTests.ifImpl       value3  thrpt    5   86237514.251 ± 1052735.135  ops/s
MapperTests.ifImpl       value4  thrpt    5   69846500.397 ±   96096.744  ops/s
MapperTests.ifImpl       value5  thrpt    5   61801196.907 ±  447615.691  ops/s
MapperTests.ifImpl       value6  thrpt    5   45586366.536 ± 1311782.917  ops/s
MapperTests.ifImpl       value7  thrpt    5   40547835.196 ±  601046.774  ops/s
MapperTests.ifImpl       value8  thrpt    5   36543064.119 ±  360208.524  ops/s
MapperTests.ifImpl       value9  thrpt    5   33102331.522 ± 1508720.970  ops/s
MapperTests.ifImpl      value10  thrpt    5   79657826.043 ± 3917631.998  ops/s
MapperTests.ifImpl      value11  thrpt    5   69926632.944 ± 2298541.222  ops/s
MapperTests.ifImpl      value12  thrpt    5   57850585.050 ±  298264.430  ops/s
MapperTests.ifImpl      value13  thrpt    5   49052412.415 ±  684120.388  ops/s
MapperTests.ifImpl      value14  thrpt    5   42669844.467 ±  389865.530  ops/s
MapperTests.ifImpl      value15  thrpt    5   37628886.485 ± 1017955.318  ops/s
MapperTests.mapImpl      value0  thrpt    5  113958609.374 ± 1134282.617  ops/s
MapperTests.mapImpl      value1  thrpt    5  113985273.332 ± 1214821.373  ops/s
MapperTests.mapImpl      value2  thrpt    5  113480216.182 ± 1600608.326  ops/s
MapperTests.mapImpl      value3  thrpt    5  113649067.777 ± 1565823.964  ops/s
MapperTests.mapImpl      value4  thrpt    5  113898990.164 ± 1402779.208  ops/s
MapperTests.mapImpl      value5  thrpt    5  113637571.320 ±  505975.224  ops/s
MapperTests.mapImpl      value6  thrpt    5  113355138.316 ±  479705.282  ops/s
MapperTests.mapImpl      value7  thrpt    5  113968525.926 ± 2417268.956  ops/s
MapperTests.mapImpl      value8  thrpt    5  116975067.618 ± 3477953.993  ops/s
MapperTests.mapImpl      value9  thrpt    5  113566437.305 ± 2096013.205  ops/s
MapperTests.mapImpl     value10  thrpt    5  109748822.972 ± 1803152.916  ops/s
MapperTests.mapImpl     value11  thrpt    5  113741818.520 ± 1331202.350  ops/s
MapperTests.mapImpl     value12  thrpt    5  109164776.582 ± 3809473.640  ops/s
MapperTests.mapImpl     value13  thrpt    5  110408351.205 ±  587733.025  ops/s
MapperTests.mapImpl     value14  thrpt    5  113899863.382 ± 2163418.194  ops/s
MapperTests.mapImpl     value15  thrpt    5  110488695.855 ±  909644.752  ops/s
MapperTests.switchImpl   value0  thrpt    5  147313906.613 ± 4442483.745  ops/s
MapperTests.switchImpl   value1  thrpt    5  147812229.197 ± 1241026.620  ops/s
MapperTests.switchImpl   value2  thrpt    5  141179106.457 ± 1744724.525  ops/s
MapperTests.switchImpl   value3  thrpt    5  140898884.244 ± 1072571.789  ops/s
MapperTests.switchImpl   value4  thrpt    5  140553087.462 ± 1153754.158  ops/s
MapperTests.switchImpl   value5  thrpt    5  147244206.471 ± 3327814.038  ops/s
MapperTests.switchImpl   value6  thrpt    5  141019484.294 ± 1173909.237  ops/s
MapperTests.switchImpl   value7  thrpt    5  147887831.522 ± 1508045.545  ops/s
MapperTests.switchImpl   value8  thrpt    5  148146866.817 ± 2328535.276  ops/s
MapperTests.switchImpl   value9  thrpt    5  147108615.588 ± 5732294.730  ops/s
MapperTests.switchImpl  value10  thrpt    5  133949614.842 ± 1199268.891  ops/s
MapperTests.switchImpl  value11  thrpt    5  139758382.256 ± 2345725.444  ops/s
MapperTests.switchImpl  value12  thrpt    5  141110898.690 ± 2514375.445  ops/s
MapperTests.switchImpl  value13  thrpt    5  140177616.112 ± 5352625.890  ops/s
MapperTests.switchImpl  value14  thrpt    5  134449800.546 ±  649498.406  ops/s
MapperTests.switchImpl  value15  thrpt    5  140783657.921 ± 1503688.188  ops/s
``` 