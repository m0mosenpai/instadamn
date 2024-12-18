package org.webrtc;

import X.AbstractC166997dE;
import X.AnonymousClass001;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase10;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14;
import org.webrtc.EglBase14Impl;

/* loaded from: classes11.dex */
public interface EglBase {
    public static final int[] CONFIG_PIXEL_BUFFER;
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER;
    public static final int[] CONFIG_PLAIN;
    public static final int[] CONFIG_RECORDABLE;
    public static final int[] CONFIG_RGBA;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final Object lock = new Object();

    /* renamed from: org.webrtc.EglBase$-CC, reason: invalid class name */
    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class CC {
        public static final CC $redex_init_class = null;

        static {
            int i = EglBase.EGL_OPENGL_ES2_BIT;
        }

        public static EglBase10 createEgl10(int[] iArr) {
            return new EglBase10Impl(null, iArr);
        }

        public static EglBase14 createEgl14(int[] iArr) {
            return new EglBase14Impl(null, iArr);
        }

        public static int getOpenGlesVersionFromConfig(int[] iArr) {
            int i = 0;
            while (i < iArr.length - 1) {
                int i2 = iArr[i];
                i++;
                if (i2 == 12352) {
                    int i3 = iArr[i];
                    if (i3 != 4) {
                        if (i3 != 64) {
                            return 1;
                        }
                        return 3;
                    }
                    return 2;
                }
            }
            return 1;
        }

        public static ConfigBuilder configBuilder() {
            return new ConfigBuilder();
        }

        public static EglBase create(EglConnection eglConnection) {
            if (eglConnection == null) {
                return create(null, EglBase.CONFIG_PLAIN);
            }
            if (eglConnection instanceof EglBase14Impl.EglConnection) {
                return new EglBase14Impl((EglBase14Impl.EglConnection) eglConnection);
            }
            if (eglConnection instanceof EglBase10Impl.EglConnection) {
                return new EglBase10Impl((EglBase10Impl.EglConnection) eglConnection);
            }
            throw new IllegalArgumentException("Unrecognized EglConnection");
        }

        public static EglBase create(Context context, int[] iArr) {
            if (context == null) {
                if (EglBase14Impl.isEGL14Supported()) {
                    return new EglBase14Impl(null, iArr);
                }
                return new EglBase10Impl(null, iArr);
            }
            if (context instanceof EglBase14.Context) {
                return createEgl14((EglBase14.Context) context, iArr);
            }
            if (context instanceof EglBase10.Context) {
                return createEgl10((EglBase10.Context) context, iArr);
            }
            throw new IllegalArgumentException("Unrecognized Context");
        }

        public static EglBase10 createEgl10(EglBase10.Context context, int[] iArr) {
            EGLContext rawContext;
            int i = EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION;
            if (context == null) {
                rawContext = null;
            } else {
                rawContext = context.getRawContext();
            }
            return new EglBase10Impl(rawContext, iArr);
        }

        public static EglBase14 createEgl14(EglBase14.Context context, int[] iArr) {
            android.opengl.EGLContext rawContext;
            if (context == null) {
                rawContext = null;
            } else {
                rawContext = context.getRawContext();
            }
            return new EglBase14Impl(rawContext, iArr);
        }

        public static EglBase create(Context context) {
            return create(context, EglBase.CONFIG_PLAIN);
        }

        public static EglBase10 createEgl10(EGLContext eGLContext, int[] iArr) {
            return new EglBase10Impl(eGLContext, iArr);
        }

        public static EglBase14 createEgl14(android.opengl.EGLContext eGLContext, int[] iArr) {
            return new EglBase14Impl(eGLContext, iArr);
        }

        public static EglBase create() {
            return create(null, EglBase.CONFIG_PLAIN);
        }
    }

    /* loaded from: classes11.dex */
    public class ConfigBuilder {
        public boolean hasAlphaChannel;
        public boolean isRecordable;
        public int openGlesVersion = 2;
        public boolean supportsPixelBuffer;

        public ConfigBuilder setOpenGlesVersion(int i) {
            if (i >= 1 && i <= 3) {
                this.openGlesVersion = i;
                return this;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0c("OpenGL ES version ", " not supported", i));
        }

        public int[] createConfigAttributes() {
            ArrayList arrayList = new ArrayList();
            AbstractC166997dE.A1W(arrayList, 12324);
            arrayList.add(8);
            AbstractC166997dE.A1W(arrayList, 12323);
            arrayList.add(8);
            AbstractC166997dE.A1W(arrayList, 12322);
            arrayList.add(8);
            if (this.hasAlphaChannel) {
                AbstractC166997dE.A1W(arrayList, 12321);
                arrayList.add(8);
            }
            int i = this.openGlesVersion;
            if (i == 2 || i == 3) {
                AbstractC166997dE.A1W(arrayList, 12352);
                int i2 = 4;
                if (i == 3) {
                    i2 = 64;
                }
                AbstractC166997dE.A1W(arrayList, i2);
            }
            if (this.supportsPixelBuffer) {
                AbstractC166997dE.A1W(arrayList, 12339);
                AbstractC166997dE.A1W(arrayList, 1);
            }
            if (this.isRecordable) {
                AbstractC166997dE.A1W(arrayList, EglBase.EGL_RECORDABLE_ANDROID);
                AbstractC166997dE.A1W(arrayList, 1);
            }
            AbstractC166997dE.A1W(arrayList, 12344);
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                iArr[i3] = ((Number) arrayList.get(i3)).intValue();
            }
            return iArr;
        }

        public ConfigBuilder setHasAlphaChannel(boolean z) {
            this.hasAlphaChannel = z;
            return this;
        }

        public ConfigBuilder setIsRecordable(boolean z) {
            this.isRecordable = z;
            return this;
        }

        public ConfigBuilder setSupportsPixelBuffer(boolean z) {
            this.supportsPixelBuffer = z;
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public interface Context {
        public static final long NO_CONTEXT = 0;

        long getNativeEglContext();
    }

    /* loaded from: classes11.dex */
    public interface EglConnection extends RefCounted {

        /* renamed from: org.webrtc.EglBase$EglConnection$-CC, reason: invalid class name */
        /* loaded from: classes11.dex */
        public abstract /* synthetic */ class CC {
            public static EglConnection createEgl10(int[] iArr) {
                return new EglBase10Impl.EglConnection(null, iArr);
            }

            public static EglConnection createEgl14(int[] iArr) {
                return new EglBase14Impl.EglConnection(null, iArr);
            }

            public static EglConnection create(Context context, int[] iArr) {
                if (context == null) {
                    return new EglBase14Impl.EglConnection(null, iArr);
                }
                if (context instanceof EglBase14.Context) {
                    return new EglBase14Impl.EglConnection(((EglBase14.Context) context).getRawContext(), iArr);
                }
                if (context instanceof EglBase10.Context) {
                    return new EglBase10Impl.EglConnection(((EglBase10.Context) context).getRawContext(), iArr);
                }
                throw new IllegalArgumentException("Unrecognized Context");
            }
        }
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);

    static {
        CC cc = CC.$redex_init_class;
        CONFIG_PLAIN = new ConfigBuilder().createConfigAttributes();
        ConfigBuilder configBuilder = new ConfigBuilder();
        configBuilder.hasAlphaChannel = true;
        CONFIG_RGBA = configBuilder.createConfigAttributes();
        ConfigBuilder configBuilder2 = new ConfigBuilder();
        configBuilder2.supportsPixelBuffer = true;
        CONFIG_PIXEL_BUFFER = configBuilder2.createConfigAttributes();
        ConfigBuilder configBuilder3 = new ConfigBuilder();
        configBuilder3.hasAlphaChannel = true;
        configBuilder3.supportsPixelBuffer = true;
        CONFIG_PIXEL_RGBA_BUFFER = configBuilder3.createConfigAttributes();
        ConfigBuilder configBuilder4 = new ConfigBuilder();
        configBuilder4.isRecordable = true;
        CONFIG_RECORDABLE = configBuilder4.createConfigAttributes();
    }
}
