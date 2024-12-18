package com.facebook.mediastreaming.opt.source.video;

import X.InterfaceC57904Pm8;
import X.X7X;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;

/* loaded from: classes11.dex */
public interface AndroidVideoInput {
    boolean enableCaptureRenderer();

    X7X getFrameSchedulerFactory();

    void pauseOutputSurface(int i);

    void removeErrorListener(InterfaceC57904Pm8 interfaceC57904Pm8);

    void resumeOutputSurface(int i);

    void setErrorListener(InterfaceC57904Pm8 interfaceC57904Pm8);

    void setOutputSurface(int i, SurfaceHolder surfaceHolder);

    void setOutputSurface(SurfaceTextureHolder surfaceTextureHolder, boolean z);

    void startRenderingToOutput();

    void stopRenderingToOutput();
}
