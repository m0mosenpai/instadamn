package X;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8on, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197768on implements InterfaceC199678sJ {
    public SurfaceTexture A00;
    public C197738ok A01;
    public AnonymousClass810 A02;
    public InterfaceC197808or A04;
    public boolean A05;
    public final Object A06;
    public final boolean A08;
    public final boolean A09;
    public final EnumC197748ol A0A;
    public final InterfaceC197758om A0B;
    public final EnumC197888oz A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public volatile boolean A0I;
    public final C197778oo A0C = new C197778oo();
    public CountDownLatch A03 = new CountDownLatch(1);
    public final Object A07 = new Object();

    @Override // X.InterfaceC199678sJ
    public final boolean CLp() {
        return false;
    }

    @Override // X.InterfaceC199678sJ
    public final boolean EGx() {
        return true;
    }

    public static void A00(int i, int i2, float[] fArr, int i3) {
        float f = fArr[i];
        float abs = Math.abs(f);
        float f2 = fArr[i2];
        float f3 = 0.0f;
        if (abs > 0.0f && abs < 1.0f && i3 > 2) {
            float f4 = i3 - 2;
            float f5 = f2 * (f4 / abs);
            float f6 = i3;
            if (Math.abs(f5 - 1.0f) < 0.01f) {
                fArr[i] = (f * f6) / f4;
            } else {
                if (Math.abs((f6 - f5) - 1.0f) >= 0.01f) {
                    return;
                }
                fArr[i] = (f * f6) / f4;
                f3 = (fArr[i2] * f6) / (i3 - 1);
            }
            fArr[i2] = f3;
        }
    }

    public final SurfaceTexture A01(boolean z) {
        int i;
        SurfaceTexture surfaceTexture;
        C18C.A0G(this.A09, "VideoInput hasn't set to use internal SurfaceTexture!");
        if (this.A0G) {
            return null;
        }
        if (this.A0F) {
            this.A05 = z;
            if (this.A00 == null || z) {
                synchronized (this.A07) {
                    this.A0I = false;
                    AnonymousClass810 anonymousClass810 = this.A02;
                    if (anonymousClass810 != null) {
                        i = anonymousClass810.A00;
                    } else {
                        i = 0;
                    }
                    surfaceTexture = new SurfaceTexture(i);
                    C197738ok c197738ok = this.A01;
                    surfaceTexture.setDefaultBufferSize(c197738ok.A02, c197738ok.A01);
                    this.A00 = surfaceTexture;
                }
                return surfaceTexture;
            }
        } else {
            this.A03.await(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
        }
        return this.A00;
    }

    public final void A02(AnonymousClass810 anonymousClass810) {
        if (this.A04 == null) {
            this.A03.await(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
        }
        if (anonymousClass810 == null) {
            anonymousClass810 = this.A02;
        }
        this.A02 = anonymousClass810;
        InterfaceC197808or interfaceC197808or = this.A04;
        if (interfaceC197808or != null) {
            interfaceC197808or.CtB(this);
        }
    }

    @Override // X.InterfaceC199678sJ
    public final InterfaceC197758om Aoh() {
        return this.A0B;
    }

    @Override // X.InterfaceC199678sJ
    public final int ApO() {
        return this.A01.A00;
    }

    @Override // X.InterfaceC199678sJ
    public final C197778oo B8Y() {
        SurfaceTexture surfaceTexture;
        synchronized (this.A07) {
            if (!this.A0I && (surfaceTexture = this.A00) != null && this.A08) {
                synchronized (this.A06) {
                    surfaceTexture.updateTexImage();
                }
            }
        }
        C197778oo c197778oo = this.A0C;
        c197778oo.A06(this, this.A02);
        return c197778oo;
    }

    @Override // X.InterfaceC199678sJ
    public final int BI0() {
        return this.A01.A01;
    }

    @Override // X.InterfaceC199678sJ
    public final int BIB() {
        return this.A01.A02;
    }

    @Override // X.InterfaceC199678sJ
    public final String BOj() {
        return this.A0E;
    }

    @Override // X.InterfaceC199678sJ
    public final long Bff() {
        return this.A0B.ANc();
    }

    @Override // X.InterfaceC199678sJ
    public final int Bfo() {
        return this.A01.A03;
    }

    @Override // X.InterfaceC199678sJ
    public final int Bfz() {
        return this.A01.A04;
    }

    @Override // X.InterfaceC199678sJ
    public final EnumC197888oz BoW() {
        return this.A0D;
    }

    @Override // X.InterfaceC199678sJ
    public final void CAY(float[] fArr) {
        if (this.A0G) {
            Matrix.setIdentityM(fArr, 0);
            AbstractC197988p9.A02(fArr, -this.A01.A05);
            AbstractC197988p9.A00(fArr);
            AbstractC197988p9.A02(fArr, 180.0f);
            return;
        }
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
            C197738ok c197738ok = this.A01;
            int i = c197738ok.A02;
            int i2 = c197738ok.A01;
            int i3 = i;
            int i4 = c197738ok.A05 % 180;
            if (i4 != 0) {
                i3 = i2;
            }
            A00(0, 12, fArr, i3);
            if (i4 != 0) {
                i2 = i;
            }
            A00(4, 12, fArr, i2);
            A00(1, 13, fArr, i3);
            A00(5, 13, fArr, i2);
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    @Override // X.InterfaceC199678sJ
    public final void CNf(InterfaceC197808or interfaceC197808or) {
        AnonymousClass810 anonymousClass810;
        interfaceC197808or.EUo(this.A0A, this);
        this.A04 = interfaceC197808or;
        if (this.A09) {
            if (this.A0G) {
                AnonymousClass811 anonymousClass811 = new AnonymousClass811("SharedTextureVideoInputForBitmap");
                anonymousClass811.A03 = 3553;
                anonymousClass810 = new AnonymousClass810(anonymousClass811);
            } else {
                AnonymousClass811 anonymousClass8112 = new AnonymousClass811("SharedTextureVideoInput");
                anonymousClass8112.A03 = 36197;
                anonymousClass810 = new AnonymousClass810(anonymousClass8112);
                if (this.A0F) {
                    SurfaceTexture surfaceTexture = this.A00;
                    if (surfaceTexture != null) {
                        surfaceTexture.detachFromGLContext();
                        surfaceTexture.attachToGLContext(anonymousClass810.A00);
                        C197738ok c197738ok = this.A01;
                        surfaceTexture.setDefaultBufferSize(c197738ok.A02, c197738ok.A01);
                        surfaceTexture.updateTexImage();
                    }
                } else {
                    SurfaceTexture surfaceTexture2 = new SurfaceTexture(anonymousClass810.A00);
                    C197738ok c197738ok2 = this.A01;
                    surfaceTexture2.setDefaultBufferSize(c197738ok2.A02, c197738ok2.A01);
                    this.A00 = surfaceTexture2;
                }
            }
            this.A02 = anonymousClass810;
            C197738ok c197738ok3 = this.A01;
            anonymousClass810.A00(c197738ok3.A02, c197738ok3.A01);
        }
        this.A03.countDown();
    }

    @Override // X.InterfaceC199678sJ
    public final boolean EGy() {
        return !this.A0H;
    }

    @Override // X.InterfaceC199678sJ
    public final void release() {
        if (this.A09) {
            SurfaceTexture surfaceTexture = this.A00;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null);
                if (!this.A05) {
                    surfaceTexture.release();
                }
            }
            AnonymousClass810 anonymousClass810 = this.A02;
            if (anonymousClass810 != null) {
                anonymousClass810.A01();
            }
            this.A03 = new CountDownLatch(1);
        }
        this.A00 = null;
        this.A02 = null;
    }

    public C197768on(EnumC197748ol enumC197748ol, C197738ok c197738ok, InterfaceC197758om interfaceC197758om, EnumC197888oz enumC197888oz, Object obj, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = c197738ok;
        this.A0A = enumC197748ol;
        this.A0D = enumC197888oz;
        this.A0H = z2;
        this.A0E = str;
        this.A0B = interfaceC197758om;
        this.A09 = z;
        this.A08 = z3;
        this.A0G = z4;
        this.A06 = obj;
        this.A0F = z5;
    }

    @Override // X.InterfaceC199678sJ
    public final void destroy() {
        release();
        this.A04 = null;
    }
}
