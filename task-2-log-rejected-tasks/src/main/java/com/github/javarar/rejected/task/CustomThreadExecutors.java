package com.github.javarar.rejected.task;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.concurrent.Executor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CustomThreadExecutors {

    public static Executor logRejectedThreadPoolExecutor(/*можно передать такие аргументы, которые помогут вам сконструировать нужный пул*/) {
        throw new UnsupportedOperationException("реализуй меня");
    }
}
