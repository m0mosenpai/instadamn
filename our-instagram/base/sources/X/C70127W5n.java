package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* renamed from: X.W5n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70127W5n {
    public final int A00;
    public final float[] A01 = new float[16];
    public final W68 A02;
    public final Object A03;
    public volatile int A04;
    public volatile int A05;
    public volatile int A06;
    public volatile int A07;
    public volatile long A08;
    public volatile C176507t8 A09;
    public volatile boolean A0A;
    public volatile boolean A0B;

    public final void A01() {
        C176507t8 c176507t8 = this.A09;
        this.A09 = null;
        if (c176507t8 != null) {
            synchronized (c176507t8) {
                try {
                    SurfaceTexture surfaceTexture = c176507t8.A0B;
                    if (surfaceTexture != null) {
                        this.A02.A01();
                        synchronized (this.A03) {
                            surfaceTexture.detachFromGLContext();
                        }
                        if (this.A0A) {
                            surfaceTexture.setOnFrameAvailableListener(null);
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
            this.A0A = false;
        }
    }

    public final void A02(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, C176507t8 c176507t8) {
        SurfaceTexture surfaceTexture;
        if (c176507t8 != this.A09) {
            A01();
            synchronized (c176507t8) {
                try {
                    surfaceTexture = c176507t8.A0B;
                } catch (RuntimeException unused) {
                }
                if (surfaceTexture == null) {
                    return;
                }
                if (onFrameAvailableListener != null) {
                    this.A02.A01();
                    surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener);
                    synchronized (this.A03) {
                        surfaceTexture.updateTexImage();
                    }
                }
                this.A09 = c176507t8;
                this.A0A = AbstractC167007dF.A1W(onFrameAvailableListener);
            }
        }
    }

    public final boolean A03(SurfaceTexture surfaceTexture) {
        long j;
        C176507t8 c176507t8 = this.A09;
        if (c176507t8 != null) {
            if (surfaceTexture == null) {
                surfaceTexture = c176507t8.A0B;
            }
            if (c176507t8.A0B == surfaceTexture) {
                try {
                    this.A02.A01();
                    synchronized (this.A03) {
                        try {
                            synchronized (c176507t8) {
                                SurfaceTexture surfaceTexture2 = c176507t8.A0B;
                                if (surfaceTexture2 != null) {
                                    surfaceTexture2.updateTexImage();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    synchronized (c176507t8) {
                        try {
                            SurfaceTexture surfaceTexture3 = c176507t8.A0B;
                            if (surfaceTexture3 != null) {
                                j = surfaceTexture3.getTimestamp();
                            } else {
                                j = 0;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    this.A08 = j;
                    this.A07 = c176507t8.A0A;
                    this.A06 = c176507t8.A05;
                    this.A05 = c176507t8.A04;
                    this.A04 = c176507t8.A03;
                    this.A0B = c176507t8.A0F;
                    float[] fArr = this.A01;
                    synchronized (c176507t8) {
                        SurfaceTexture surfaceTexture4 = c176507t8.A0B;
                        if (surfaceTexture4 != null) {
                            surfaceTexture4.getTransformMatrix(fArr);
                        } else {
                            Matrix.setIdentityM(fArr, 0);
                        }
                        c176507t8.A03(fArr);
                    }
                    return true;
                } catch (RuntimeException unused) {
                    return false;
                }
            }
        }
        return false;
    }

    public C70127W5n(W68 w68, Object obj) {
        this.A02 = w68;
        this.A03 = obj;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        A00("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        A00(AnonymousClass001.A0O("glBindTexture ", i));
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        A00("glTexParameter");
        this.A00 = i;
    }

    public static void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String A0g = AnonymousClass001.A0g(str, ": glError 0x", Integer.toHexString(glGetError));
        android.util.Log.e("EglSurfaceInput", A0g);
        throw new RuntimeException(A0g);
    }
}
