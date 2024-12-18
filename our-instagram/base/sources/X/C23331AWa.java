package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;

/* renamed from: X.AWa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23331AWa implements InterfaceC199678sJ {
    public C200688uB A00;
    public AbstractC180277zH A01;
    public AnonymousClass810 A02;
    public C201608vp A03;
    public int A04;
    public final C179877yd A07;
    public final float[] A08;
    public final EnumC197748ol A09;
    public final InterfaceC197758om A0A;
    public final EnumC197888oz A0B;
    public volatile Handler A0D;
    public volatile Surface A0E;
    public volatile Surface A0F;
    public volatile InterfaceC197808or A0H;
    public volatile boolean A0J;
    public final C197778oo A06 = new C197778oo();
    public final Object A0C = new Object();
    public volatile C197738ok A0G = new C197738ok(0, 0, 0, 0, 0, 0);
    public final C197778oo A05 = new C197778oo();
    public volatile C23578AcX A0I = null;

    public C23331AWa(Context context, EnumC197748ol enumC197748ol, InterfaceC197758om interfaceC197758om, EnumC197888oz enumC197888oz) {
        float[] fArr = new float[16];
        this.A08 = fArr;
        this.A0A = interfaceC197758om;
        this.A09 = enumC197748ol;
        this.A0B = enumC197888oz;
        this.A07 = new C179877yd(context.getResources());
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public final void A00(C23578AcX c23578AcX) {
        synchronized (this.A0C) {
            if (this.A0I != c23578AcX) {
                if (c23578AcX != null) {
                    this.A0I = null;
                    Handler handler = this.A0D;
                    if (handler != null) {
                        handler.post(new RunnableC24541Aty(this, c23578AcX));
                    } else {
                        this.A0I = c23578AcX;
                    }
                } else {
                    this.A0I = null;
                }
            }
        }
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
        int i;
        C23578AcX c23578AcX;
        AbstractC180277zH abstractC180277zH;
        C197778oo c197778oo;
        int i2;
        this.A02.getClass();
        AbstractC09790fc.A01("getFrame", 1808078228);
        try {
            try {
                c23578AcX = this.A0I;
            } catch (RuntimeException e) {
                int i3 = this.A04 + 1;
                this.A04 = i3;
                if (i3 < 10) {
                    i = 1044036461;
                } else {
                    throw e;
                }
            }
            if (c23578AcX == null) {
                c197778oo = this.A06;
                i2 = -710820308;
            } else {
                AbstractC09790fc.A01("copyFrame", -1860196744);
                this.A02.getClass();
                if (this.A0F != null) {
                    if (Bff() != 0 && !this.A0J) {
                        if (this.A03 == null) {
                            C201608vp c201608vp = new C201608vp(true);
                            this.A03 = c201608vp;
                            c201608vp.A00 = this.A07;
                        }
                        int i4 = this.A0G.A02;
                        int i5 = this.A0G.A01;
                        C200688uB c200688uB = this.A00;
                        if (c200688uB != null) {
                            if (c200688uB.A02 != i4 || c200688uB.A01 != i5) {
                                c200688uB.A01();
                                this.A00 = null;
                            }
                            GLES20.glBindFramebuffer(36160, c200688uB.A00);
                            C200688uB c200688uB2 = this.A00;
                            GLES20.glViewport(0, 0, c200688uB2.A02, c200688uB2.A01);
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            GLES20.glClear(16640);
                            C197778oo c197778oo2 = this.A05;
                            c197778oo2.A06(this, this.A02);
                            this.A03.DCH(c197778oo2, 0L);
                            GLES20.glBindFramebuffer(36160, 0);
                            this.A06.A01(this.A00.A03, null, ((C201278vB) c197778oo2).A00);
                        }
                        c200688uB = new C200688uB(i4, i5);
                        this.A00 = c200688uB;
                        GLES20.glBindFramebuffer(36160, c200688uB.A00);
                        C200688uB c200688uB22 = this.A00;
                        GLES20.glViewport(0, 0, c200688uB22.A02, c200688uB22.A01);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                        GLES20.glClear(16640);
                        C197778oo c197778oo22 = this.A05;
                        c197778oo22.A06(this, this.A02);
                        this.A03.DCH(c197778oo22, 0L);
                        GLES20.glBindFramebuffer(36160, 0);
                        this.A06.A01(this.A00.A03, null, ((C201278vB) c197778oo22).A00);
                    }
                } else {
                    C200688uB c200688uB3 = this.A00;
                    if (c200688uB3 != null) {
                        c200688uB3.A01();
                        this.A00 = null;
                    }
                }
                AbstractC09790fc.A00(-1225627957);
                synchronized (c23578AcX.A06) {
                    InterfaceC176367st interfaceC176367st = c23578AcX.A05;
                    if (c23578AcX.A0C && interfaceC176367st != null) {
                        interfaceC176367st.update();
                    } else {
                        SurfaceTexture surfaceTexture = c23578AcX.A01;
                        if (surfaceTexture != null) {
                            surfaceTexture.updateTexImage();
                        }
                    }
                }
                if (c23578AcX.A01() == 0) {
                    c197778oo = this.A06;
                    i2 = -135253848;
                } else {
                    AbstractC09790fc.A01("copyPreviewFrame", -2022064914);
                    this.A02.getClass();
                    InterfaceC197808or interfaceC197808or = this.A0H;
                    if (interfaceC197808or != null) {
                        Surface surface = this.A0F;
                        if (surface == null) {
                            AbstractC180277zH abstractC180277zH2 = this.A01;
                            if (abstractC180277zH2 != null) {
                                abstractC180277zH2.A02();
                                this.A01 = null;
                                this.A0E = null;
                            }
                        } else {
                            if (surface != this.A0E && (abstractC180277zH = this.A01) != null) {
                                abstractC180277zH.A02();
                                this.A01 = null;
                                this.A0E = null;
                            }
                            InterfaceC178897x1 B09 = interfaceC197808or.B09();
                            if (B09 != null) {
                                if (this.A03 == null) {
                                    C201608vp c201608vp2 = new C201608vp(true);
                                    this.A03 = c201608vp2;
                                    c201608vp2.A00 = this.A07;
                                }
                                if (this.A01 == null) {
                                    this.A01 = B09.AMi(surface);
                                    this.A0E = surface;
                                }
                                this.A01.A05();
                                GLES20.glViewport(0, 0, this.A01.A01(), this.A01.A00());
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                GLES20.glClear(16640);
                                C197778oo c197778oo3 = this.A05;
                                c197778oo3.A02(this.A02, this.A08, null, null, Bff());
                                this.A03.DCH(c197778oo3, 0L);
                                this.A01.A04(((C201278vB) c197778oo3).A00);
                                this.A01.A03();
                            }
                        }
                    }
                    AbstractC09790fc.A00(-1940969362);
                    this.A04 = 0;
                    i = -2002040914;
                    AbstractC09790fc.A00(i);
                    if (this.A0F != null && !this.A0J) {
                        return this.A06;
                    }
                    this.A0J = false;
                    C197778oo c197778oo4 = this.A06;
                    c197778oo4.A06(this, this.A02);
                    return c197778oo4;
                }
            }
            AbstractC09790fc.A00(i2);
            return c197778oo;
        } catch (Throwable th) {
            AbstractC09790fc.A00(-998966424);
            throw th;
        }
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
        return "IgCameraVideoInputV2";
    }

    @Override // X.InterfaceC199678sJ
    public final long Bff() {
        C23578AcX c23578AcX = this.A0I;
        if (c23578AcX != null) {
            return c23578AcX.A01();
        }
        return 0L;
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
        return this.A0B;
    }

    @Override // X.InterfaceC199678sJ
    public final void CAY(float[] fArr) {
        SurfaceTexture surfaceTexture;
        C23578AcX c23578AcX = this.A0I;
        if (c23578AcX != null) {
            synchronized (c23578AcX.A06) {
                if (c23578AcX.A0C) {
                    surfaceTexture = c23578AcX.A00;
                } else {
                    surfaceTexture = c23578AcX.A01;
                }
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(fArr);
                } else {
                    Matrix.setIdentityM(fArr, 0);
                }
            }
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    @Override // X.InterfaceC199678sJ
    public final boolean CLp() {
        return true;
    }

    @Override // X.InterfaceC199678sJ
    public final void CNf(InterfaceC197808or interfaceC197808or) {
        AnonymousClass810 anonymousClass810;
        AnonymousClass810 anonymousClass8102;
        synchronized (this.A0C) {
            this.A0J = true;
            interfaceC197808or.EUo(this.A09, this);
            if (C178607wY.A00()) {
                anonymousClass810 = new C9YQ("TextureVideoInput");
            } else {
                AnonymousClass811 anonymousClass811 = new AnonymousClass811("TextureVideoInput");
                anonymousClass811.A03 = 36197;
                anonymousClass810 = new AnonymousClass810(anonymousClass811);
            }
            this.A02 = anonymousClass810;
            anonymousClass810.A00(this.A0G.A02, this.A0G.A01);
            this.A0H = interfaceC197808or;
            C23578AcX c23578AcX = this.A0I;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.A0D = new Handler(myLooper);
            }
            if (c23578AcX != null) {
                if (C178607wY.A00()) {
                    anonymousClass8102 = ((C9YQ) this.A02).A00;
                } else {
                    anonymousClass8102 = this.A02;
                }
                c23578AcX.A02(anonymousClass8102);
            }
        }
    }

    @Override // X.InterfaceC199678sJ
    public final boolean EGx() {
        return true;
    }

    @Override // X.InterfaceC199678sJ
    public final boolean EGy() {
        return false;
    }

    @Override // X.InterfaceC199678sJ
    public final void release() {
        synchronized (this.A0C) {
            C200688uB c200688uB = this.A00;
            if (c200688uB != null) {
                c200688uB.A01();
                this.A00 = null;
            }
            AbstractC180277zH abstractC180277zH = this.A01;
            if (abstractC180277zH != null) {
                abstractC180277zH.A02();
                this.A01 = null;
                this.A0E = null;
            }
            C201608vp c201608vp = this.A03;
            if (c201608vp != null) {
                c201608vp.DrA();
                this.A03 = null;
            }
            if (this.A02 != null) {
                C23578AcX c23578AcX = this.A0I;
                if (c23578AcX != null) {
                    C23578AcX.A00(c23578AcX);
                }
                this.A02.A01();
                this.A02 = null;
            }
            this.A0D = null;
        }
    }

    @Override // X.InterfaceC199678sJ
    public final void destroy() {
        release();
        C23578AcX c23578AcX = this.A0I;
        if (c23578AcX != null) {
            C23578AcX.A00(c23578AcX);
        }
    }
}
