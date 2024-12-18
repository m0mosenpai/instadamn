package com.facebook.cameracore.mediapipeline.engine;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class ScriptThreadExecutor implements Executor {
    @Override // java.util.concurrent.Executor
    public abstract void execute(Runnable runnable);

    public abstract void quit();
}
