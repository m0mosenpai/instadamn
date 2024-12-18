package X;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class AWZ implements InterfaceC199678sJ {
    public int A00;
    public long A01;
    public SurfaceTexture A02;
    public AnonymousClass810 A03;
    public int A04;
    public final AbstractC224239v7 A08;
    public final EnumC197748ol A09;
    public final InterfaceC197758om A0A;
    public final EnumC197888oz A0C;
    public final C23577AcW A0D;
    public volatile InterfaceC197808or A0H;
    public final C197778oo A0B = new C197778oo();
    public final AtomicInteger A06 = new AtomicInteger(0);
    public final Object A05 = new Object();
    public volatile C197738ok A0G = new C197738ok(0, 0, 0, 0, 0, 0);
    public final SurfaceTexture.OnFrameAvailableListener A07 = new APD(this, 0);
    public final boolean A0F = true;
    public final String A0E = "IgCameraVideoInputV1";
    public volatile boolean A0I = true;

    public AWZ(AbstractC224239v7 abstractC224239v7, EnumC197748ol enumC197748ol, InterfaceC197758om interfaceC197758om, EnumC197888oz enumC197888oz, C23577AcW c23577AcW) {
        this.A0D = c23577AcW;
        this.A0A = interfaceC197758om;
        this.A08 = abstractC224239v7;
        this.A09 = enumC197748ol;
        this.A0C = enumC197888oz;
    }

    @Override // X.InterfaceC199678sJ
    public final InterfaceC197758om Aoh() {
        return this.A0A;
    }

    @Override // X.InterfaceC199678sJ
    public final int ApO() {
        return this.A0G.A00;
    }

    @Override // X.InterfaceC199678sJ
    public final C197778oo B8Y() {
        this.A03.getClass();
        this.A02.getClass();
        int andSet = this.A06.getAndSet(0);
        try {
            synchronized (this.A05) {
                if (this.A0I) {
                    for (int i = 0; i < andSet; i++) {
                        this.A02.updateTexImage();
                    }
                }
            }
            if (andSet > 0) {
                this.A04 = 0;
            }
        } catch (RuntimeException e) {
            int i2 = this.A04 + 1;
            this.A04 = i2;
            if (i2 >= 10) {
                throw e;
            }
        }
        AbstractC180237zD.A02("SurfaceVideoInput::updateTexImage", new Object[0]);
        C197778oo c197778oo = this.A0B;
        c197778oo.A06(this, this.A03);
        return c197778oo;
    }

    @Override // X.InterfaceC199678sJ
    public final int BI0() {
        return this.A0G.A01;
    }

    @Override // X.InterfaceC199678sJ
    public final int BIB() {
        return this.A0G.A02;
    }

    @Override // X.InterfaceC199678sJ
    public final String BOj() {
        return this.A0E;
    }

    @Override // X.InterfaceC199678sJ
    public final long Bff() {
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture == null) {
            return 0L;
        }
        return this.A08.A00(surfaceTexture.getTimestamp());
    }

    @Override // X.InterfaceC199678sJ
    public final int Bfo() {
        return this.A0G.A03;
    }

    @Override // X.InterfaceC199678sJ
    public final int Bfz() {
        return this.A0G.A04;
    }

    @Override // X.InterfaceC199678sJ
    public final EnumC197888oz BoW() {
        return this.A0C;
    }

    @Override // X.InterfaceC199678sJ
    public final void CAY(float[] fArr) {
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture == null) {
            Matrix.setIdentityM(fArr, 0);
        } else {
            surfaceTexture.getTransformMatrix(fArr);
        }
    }

    @Override // X.InterfaceC199678sJ
    public final boolean CLp() {
        return false;
    }

    @Override // X.InterfaceC199678sJ
    public final void CNf(InterfaceC197808or interfaceC197808or) {
        SurfaceTexture surfaceTexture;
        boolean z = false;
        if (this.A02 == null) {
            z = true;
        }
        C0J8.A07(z);
        synchronized (this.A05) {
            interfaceC197808or.EUo(this.A09, this);
            this.A01 = 0L;
            this.A00 = 0;
            if (C178607wY.A00()) {
                C9YQ c9yq = new C9YQ("SurfaceVideoInput");
                this.A03 = c9yq;
                c9yq.A00(this.A0G.A02, this.A0G.A01);
                surfaceTexture = new SurfaceTexture(c9yq.A00.A00);
            } else {
                AnonymousClass811 anonymousClass811 = new AnonymousClass811("SurfaceVideoInput");
                anonymousClass811.A03 = 36197;
                AnonymousClass810 anonymousClass810 = new AnonymousClass810(anonymousClass811);
                this.A03 = anonymousClass810;
                anonymousClass810.A00(this.A0G.A02, this.A0G.A01);
                surfaceTexture = new SurfaceTexture(this.A03.A00);
            }
            this.A02 = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this.A07);
            this.A0H = interfaceC197808or;
            try {
                this.A0I = true;
                C23577AcW c23577AcW = this.A0D;
                SurfaceTexture surfaceTexture2 = this.A02;
                Object obj = c23577AcW.A03;
                synchronized (obj) {
                    try {
                        c23577AcW.A00 = surfaceTexture2;
                        obj.notifyAll();
                    } catch (Throwable th) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC199678sJ
    public final boolean EGx() {
        return this.A0F;
    }

    @Override // X.InterfaceC199678sJ
    public final boolean EGy() {
        return !this.A0F;
    }

    @Override // X.InterfaceC199678sJ
    public final void release() {
        synchronized (this.A05) {
            try {
                this.A0I = false;
                if (this.A02 != null) {
                    this.A03.getClass();
                    C23577AcW c23577AcW = this.A0D;
                    synchronized (c23577AcW.A03) {
                        try {
                            c23577AcW.A00 = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.A02.setOnFrameAvailableListener(null);
                    this.A02.release();
                    this.A02 = null;
                    this.A06.set(0);
                    this.A03.A01();
                    this.A03 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC199678sJ
    public final void destroy() {
        release();
    }
}
