package org.webrtc;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import org.webrtc.EglBase;

/* loaded from: classes11.dex */
public interface EglBase14 extends EglBase {

    /* loaded from: classes11.dex */
    public interface Context extends EglBase.Context {
        EGLContext getRawContext();
    }

    /* loaded from: classes11.dex */
    public interface EglConnection extends EglBase.EglConnection {
        EGLConfig getConfig();

        EGLContext getContext();

        EGLDisplay getDisplay();
    }
}
