package com.facebook.react.bridge.queue;

import X.C62155S0c;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes10.dex */
public interface MessageQueueThread {
    void assertIsOnThread();

    void assertIsOnThread(String str);

    Future callOnQueue(Callable callable);

    C62155S0c getPerfStats();

    boolean isIdle();

    boolean isOnThread();

    void quitSynchronous();

    void resetPerfStats();

    boolean runOnQueue(Runnable runnable);
}
