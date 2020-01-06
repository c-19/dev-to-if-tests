/*
 * Copyright (c) 2018 - 2020, C19, all rights reserved.
 *
 * This software is licensed under under GPL-3.0-only or GPL-3.0-or-later, https://opensource.org/licenses/GPL-3.0
 */

package benchmarks;

import io.c19.test.Inputs;
import io.c19.test.Mapper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

public class MapperTests
{
    @State( Scope.Benchmark)
    public static class ExecutionPlan {

        @Param({ Inputs.VALUE_0,
                Inputs.VALUE_1,
                Inputs.VALUE_2,
                Inputs.VALUE_3,
                Inputs.VALUE_4,
                Inputs.VALUE_5,
                Inputs.VALUE_6,
                Inputs.VALUE_7,
                Inputs.VALUE_8,
                Inputs.VALUE_9,
                Inputs.VALUE_10,
                Inputs.VALUE_11,
                Inputs.VALUE_12,
                Inputs.VALUE_13,
                Inputs.VALUE_14,
                Inputs.VALUE_15})
        public String input;

        public Mapper ifImpl = new io.c19.test.ifversion.MapperImpl();
        public Mapper switchImpl = new io.c19.test.switchversion.MapperImpl();
        public Mapper mapImpl = new io.c19.test.mapversion.MapperImpl();
    }

    @Benchmark
    @Fork(value = 1, warmups = 0)
    @Warmup(iterations = 2 )
    @BenchmarkMode( Mode.Throughput)
    public void ifImpl( ExecutionPlan plan )
    {
        doTest( plan.ifImpl, plan.input );
    }

    @Benchmark
    @Fork(value = 1, warmups = 0)
    @Warmup(iterations = 2 )
    @BenchmarkMode( Mode.Throughput)
    public void switchImpl( ExecutionPlan plan )
    {
        doTest( plan.switchImpl, plan.input );
    }

    @Benchmark
    @Fork(value = 1, warmups = 0)
    @Warmup(iterations = 2 )
    @BenchmarkMode( Mode.Throughput)
    public void mapImpl( ExecutionPlan plan )
    {
        doTest( plan.mapImpl, plan.input );
    }

    private void doTest( Mapper mapper, String input )
    {
        mapper.getValue( input );
    }
}
