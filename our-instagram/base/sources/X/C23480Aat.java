package X;

import android.graphics.drawable.Drawable;
import com.instagram.camera.capture.IgCameraFocusView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Aat, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23480Aat implements InterfaceC55932he {
    public int A00;
    public C8HI A01;
    public BE6 A02;
    public C22924A8u A03;
    public AbstractC172157lk A04;
    public C202278x7 A05;
    public float A06;
    public int A07;
    public int A08;
    public final AbstractC23475Aao A09;
    public final InteractiveDrawableContainer A0A;
    public final C55982hj A0B;
    public final C89F A0C;
    public final C1816283r A0D;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        this.A09.Dnj(c55982hj);
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        this.A09.Dnk(c55982hj);
        String str = "thumbnailDrawable";
        if (this.A02 != null) {
            if (this.A04 == null) {
                str = "animatingDisplayMode";
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C22924A8u c22924A8u;
        double d;
        float A00;
        C14360o3.A0B(c55982hj, 0);
        C202278x7 c202278x7 = this.A05;
        if (c202278x7 != null && (c22924A8u = this.A03) != null) {
            double d2 = c55982hj.A01;
            C55992hk c55992hk = c55982hj.A09;
            if (d2 == 1.0d) {
                d = c55992hk.A00;
            } else {
                d = 1.0d - c55992hk.A00;
            }
            AGC agc = c22924A8u.A03;
            BAP bap = new BAP(d);
            String str = "thumbnailDrawable";
            EnumC209589Ot enumC209589Ot = null;
            if (this.A02 != null) {
                float A002 = A00(bap, Float.valueOf(c202278x7.A06), agc.A01);
                float f = c202278x7.A01;
                Object obj = this.A02;
                if (obj != null) {
                    float A003 = A00(bap, Float.valueOf(f + ((Drawable) obj).getBounds().exactCenterX()), agc.A02);
                    float f2 = c202278x7.A02;
                    Object obj2 = this.A02;
                    if (obj2 != null) {
                        float A004 = A00(bap, Float.valueOf(f2 + ((Drawable) obj2).getBounds().exactCenterY()), agc.A03);
                        float A005 = A00(bap, Float.valueOf(c202278x7.A05), agc.A00);
                        InteractiveDrawableContainer interactiveDrawableContainer = this.A0A;
                        Object obj3 = this.A02;
                        if (obj3 != null) {
                            interactiveDrawableContainer.A0m((Drawable) obj3, A002);
                            Object obj4 = this.A02;
                            if (obj4 != null) {
                                AHh.A02(InteractiveDrawableContainer.A00((Drawable) obj4, interactiveDrawableContainer), A003, A004);
                                Object obj5 = this.A02;
                                if (obj5 != null) {
                                    interactiveDrawableContainer.A0l((Drawable) obj5, A005 % 360.0f);
                                    Object obj6 = this.A02;
                                    if (obj6 != null) {
                                        if (!(obj6 instanceof C9SZ) && !(obj6 instanceof C9SY)) {
                                            interactiveDrawableContainer.A0k((Drawable) obj6);
                                        }
                                        if (this.A02 != null) {
                                            C22963AAh c22963AAh = AbstractC22791A3j.A00;
                                            AbstractC172157lk abstractC172157lk = this.A04;
                                            if (abstractC172157lk == null) {
                                                str = "animatingDisplayMode";
                                            } else {
                                                C1816283r c1816283r = this.A0D;
                                                if (c1816283r != null) {
                                                    enumC209589Ot = c1816283r.A02;
                                                }
                                                if (c22963AAh.A00(enumC209589Ot, abstractC172157lk) != C05F.A0u) {
                                                    A00 = 0.0f;
                                                } else {
                                                    A00 = A00(bap, Float.valueOf(this.A06), c22924A8u.A00);
                                                }
                                                int A006 = (int) A00(bap, Float.valueOf(this.A08), c22924A8u.A01);
                                                int A007 = (int) A00(bap, Float.valueOf(this.A07), 255.0f);
                                                BE6 be6 = this.A02;
                                                if (be6 != null) {
                                                    be6.ESD(A00);
                                                    C89F c89f = this.A0C;
                                                    C206169Az c206169Az = new C206169Az(1, A00, A00, A00, A00);
                                                    if (c89f.A0B()) {
                                                        c89f.A0U.A01(c206169Az.A02, c206169Az.A03, c206169Az.A00, c206169Az.A01);
                                                    }
                                                    BE6 be62 = this.A02;
                                                    if (be62 != null) {
                                                        be62.Egd(A006);
                                                        BE6 be63 = this.A02;
                                                        if (be63 != null) {
                                                            be63.EQ8(A007);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(C23480Aat c23480Aat, C22924A8u c22924A8u, AbstractC172157lk abstractC172157lk, C202278x7 c202278x7) {
        c23480Aat.A04 = abstractC172157lk;
        c23480Aat.A03 = c22924A8u;
        BE6 be6 = c23480Aat.A02;
        if (be6 == 0) {
            C14360o3.A0F("thumbnailDrawable");
            throw C00O.createAndThrow();
        }
        if (be6 instanceof C194808jg) {
            ((C194808jg) be6).A0B(0);
        }
        double d = 0.0d;
        c23480Aat.A06 = be6.Arr();
        c23480Aat.A08 = be6.CE8();
        c23480Aat.A07 = be6.AeQ();
        if (c22924A8u != null) {
            AGJ agj = c22924A8u.A02;
            C8HI c8hi = c23480Aat.A01;
            if (c8hi != null) {
                int i = (int) agj.A01;
                int i2 = (int) agj.A02;
                float f = agj.A03;
                float f2 = agj.A04;
                C174757qB c174757qB = c8hi.A06;
                if (c174757qB != null) {
                    AbstractC185998Mt.A01(c174757qB.A0H.A00(), 0.0f, 0);
                    C174747qA c174747qA = c174757qB.A0H;
                    AbstractC125325le A01 = AbstractC125325le.A01(c174747qA.A00(), 0);
                    A01.A0G();
                    AbstractC125325le A0A = A01.A0A();
                    float f3 = i;
                    A0A.A0J(f3);
                    float f4 = i2;
                    A0A.A0K(f4);
                    A0A.A0P(f, AbstractC166987dD.A07(c174747qA.A00()) / 2.0f);
                    A0A.A0Q(f2, AbstractC166987dD.A08(c174747qA.A00()) / 2.0f);
                    A0A.A0H();
                    IgCameraFocusView igCameraFocusView = c174757qB.A05;
                    if (igCameraFocusView != null) {
                        AbstractC185998Mt.A01(igCameraFocusView, 0.0f, 0);
                        AbstractC125325le A012 = AbstractC125325le.A01(igCameraFocusView, 0);
                        A012.A0G();
                        AbstractC125325le A0A2 = A012.A0A();
                        A0A2.A0J(f3);
                        A0A2.A0K(f4);
                        A0A2.A0P(f, AbstractC166987dD.A07(igCameraFocusView) / 2.0f);
                        A0A2.A0Q(f2, AbstractC166987dD.A08(igCameraFocusView) / 2.0f);
                        A0A2.A0H();
                    }
                }
            }
        }
        c23480Aat.A05 = c202278x7;
        C55982hj c55982hj = c23480Aat.A0B;
        if (c55982hj.A01 == 0.0d) {
            d = 1.0d;
        }
        c55982hj.A06(d);
    }

    public C23480Aat(C89F c89f, AbstractC23475Aao abstractC23475Aao, C1816283r c1816283r, InteractiveDrawableContainer interactiveDrawableContainer) {
        AbstractC167017dG.A1R(interactiveDrawableContainer, c89f);
        this.A09 = abstractC23475Aao;
        this.A0A = interactiveDrawableContainer;
        this.A0C = c89f;
        this.A0D = c1816283r;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(C150956qv.A02);
        A0R.A06 = true;
        A0R.A0A(this);
        this.A0B = A0R;
    }

    public static float A00(BAP bap, Object obj, float f) {
        return ((Number) bap.invoke(obj, Float.valueOf(f))).floatValue();
    }
}
