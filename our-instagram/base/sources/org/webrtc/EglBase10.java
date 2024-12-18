package org.webrtc;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import org.webrtc.EglBase;

/* loaded from: classes11.dex */
public interface EglBase10 extends EglBase {

    /* loaded from: classes11.dex */
    public interface Context extends EglBase.Context {
        EGLContext getRawContext();
    }

    /* loaded from: classes11.dex */
    public interface EglConnection extends EglBase.EglConnection {
        EGLConfig getConfig();

        EGLContext getContext();

        EGLDisplay getDisplay();

        EGL10 getEgl();
    }
}
