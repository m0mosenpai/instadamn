package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.9FV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FV extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FV(int i, Object obj, Object obj2, Object obj3, boolean z) {
        super(2);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A04 = z;
        this.A02 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        ME1 me1;
        switch (this.A00) {
            case 0:
                C5Tl c5Tl = (C5Tl) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(-2011396973, "com.instagram.feed.tifu.ui.Header.<anonymous> (TifuUnit.kt:192)");
                    }
                    InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
                    InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                    boolean z = this.A04;
                    Object obj3 = this.A02;
                    C132335yC c132335yC = (C132335yC) this.A03;
                    C1130158n c1130158n = Modifier.A00;
                    InterfaceC118275Wp interfaceC118275Wp = AbstractC118255Wn.A01;
                    InterfaceC1127857k A01 = AbstractC118375Wz.A01(interfaceC118275Wp, c5Tl, interfaceC118225Wj);
                    int A00 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A012 = C5X3.A01(c5Tl, c1130158n);
                    InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
                    c5Tl.Ent();
                    if (c117505Tk.A0K) {
                        c5Tl.AMd(interfaceC16820sZ2);
                    } else {
                        c5Tl.FDO();
                    }
                    InterfaceC16620sF interfaceC16620sF = C5X8.A03;
                    C5XJ.A00(c5Tl, A01, interfaceC16620sF);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A05;
                    C5XJ.A00(c5Tl, A04, interfaceC16620sF2);
                    InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
                    if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A00))) {
                        Integer valueOf = Integer.valueOf(A00);
                        c5Tl.FBy(valueOf);
                        c5Tl.ABx(valueOf, interfaceC16620sF3);
                    }
                    InterfaceC16620sF interfaceC16620sF4 = C5X8.A04;
                    C5XJ.A00(c5Tl, A012, interfaceC16620sF4);
                    c5Tl.Eno(-240003703);
                    Object EEc = c5Tl.EEc();
                    Object obj4 = C5UI.A00;
                    if (EEc == obj4) {
                        EEc = new C5XN();
                        c5Tl.FBy(EEc);
                    }
                    C5XO c5xo = (C5XO) EEc;
                    C117505Tk.A0L(c117505Tk, false);
                    c5Tl.Eno(-239998074);
                    boolean AH4 = c5Tl.AH4(interfaceC16820sZ);
                    Object EEc2 = c5Tl.EEc();
                    if (AH4 || EEc2 == obj4) {
                        EEc2 = new C207019Eg(interfaceC16820sZ, 31);
                        c5Tl.FBy(EEc2);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    Modifier A042 = C5XR.A04(c5xo, c1130158n, (InterfaceC16820sZ) EEc2);
                    float f = 0.0f;
                    if (z) {
                        f = 16.0f;
                    }
                    Modifier A0E = AbstractC118175Wb.A0E(A042, 0.0f, 0.0f, f, 0.0f);
                    InterfaceC1127857k A02 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, C118195Wf.A05, 0);
                    int A002 = C5X2.A00(c5Tl);
                    C59P A043 = C117505Tk.A04(c117505Tk);
                    Modifier A013 = C5X3.A01(c5Tl, A0E);
                    c5Tl.Ent();
                    if (c117505Tk.A0K) {
                        c5Tl.AMd(interfaceC16820sZ2);
                    } else {
                        c5Tl.FDO();
                    }
                    C5XJ.A00(c5Tl, A02, interfaceC16620sF);
                    C5XJ.A00(c5Tl, A043, interfaceC16620sF2);
                    if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A002))) {
                        Integer valueOf2 = Integer.valueOf(A002);
                        c5Tl.FBy(valueOf2);
                        c5Tl.ABx(valueOf2, interfaceC16620sF3);
                    }
                    C5XJ.A00(c5Tl, A013, interfaceC16620sF4);
                    int intValue = c132335yC.A02.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            c5Tl.Eno(773811384);
                            if (c132335yC.A09) {
                                c5Tl.Eno(773813168);
                                i = 2131975616;
                            } else {
                                c5Tl.Eno(773815817);
                                i = 2131975577;
                            }
                        } else {
                            c5Tl.Eno(773799816);
                            C117505Tk.A0L(c117505Tk, false);
                            throw new RuntimeException();
                        }
                    } else {
                        c5Tl.Eno(773802934);
                        if (c132335yC.A09) {
                            c5Tl.Eno(773804719);
                            i = 2131975615;
                        } else {
                            c5Tl.Eno(773807336);
                            i = 2131975575;
                        }
                    }
                    String A003 = C5YD.A00(c5Tl, i);
                    C117505Tk.A0L(c117505Tk, false);
                    C117505Tk.A0L(c117505Tk, false);
                    C6GE.A08(c5Tl, C6GD.A03, C6GA.A01(c5Tl), A003, interfaceC16820sZ, 1572864, 412);
                    c5Tl.ASW();
                    c5Tl.Eno(-239965104);
                    if (z) {
                        C2DC A004 = C5Y7.A00(c5Tl, R.drawable.instagram_more_vertical_pano_outline_24, 0);
                        String A005 = C5YD.A00(c5Tl, 2131975579);
                        c5Tl.Eno(-239955491);
                        boolean AH42 = c5Tl.AH4(obj3);
                        Object EEc3 = c5Tl.EEc();
                        if (AH42 || EEc3 == obj4) {
                            EEc3 = new C207019Eg(obj3, 32);
                            c5Tl.FBy(EEc3);
                        }
                        C117505Tk.A0L(c117505Tk, false);
                        C5YS.A07(c5Tl, AbstractC118635Yc.A04(c5Tl, c1130158n, (InterfaceC16820sZ) EEc3), A004, null, A005, 0, 24, 0L);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    c5Tl.ASW();
                    if (C0fH.A02()) {
                        C0fH.A00(-1825885029);
                    }
                }
                return C0eB.A00;
            case 1:
                SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) obj2;
                C14360o3.A0B(simpleZoomableViewContainer, 1);
                C99154cc c99154cc = (C99154cc) this.A03;
                C79743hP A044 = C99154cc.A04(simpleZoomableViewContainer, c99154cc);
                MediaFrameLayout A014 = A044.A01();
                IgProgressImageView A006 = A044.A00();
                C79723hN c79723hN = c99154cc.A03;
                A014.A00 = c79723hN.A00;
                AbstractC80203i9.A0A(c99154cc.A02, (C80143i3) this.A01, c79723hN, c99154cc.A04, A006, (InterfaceC16820sZ) this.A02, this.A04);
                C79743hP A045 = C99154cc.A04(simpleZoomableViewContainer, c99154cc);
                if (Systrace.A0E(1L)) {
                    C0fO.A01("setMediaGestureDetector", -858227447);
                }
                try {
                    A045.A01().setOnTouchListener(new Y8L(2, (InterfaceC81103jf) c79723hN.A0A.A0J.invoke(A045), c99154cc));
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1976197178);
                    }
                    me1 = new ME1(9, A006, A014);
                    return new C79773hS(me1);
                } finally {
                }
            default:
                C14360o3.A0B(obj2, 1);
                C79743hP c79743hP = (C79743hP) ((InterfaceC16660sJ) this.A02).invoke(obj2);
                final IgProgressImageView A007 = c79743hP.A00();
                final C3YD c3yd = c79743hP.A0A.A01;
                if (c3yd != null) {
                    if (this.A04) {
                        if (A007.getIgImageView().A0G()) {
                            AbstractC80203i9.A01((Context) this.A01, (C79723hN) this.A03, A007, c3yd);
                        } else {
                            final C79723hN c79723hN2 = (C79723hN) this.A03;
                            final Context context = (Context) this.A01;
                            A007.A0A(new InterfaceC80653iu() { // from class: X.5iH
                                @Override // X.InterfaceC80653iu
                                public final /* synthetic */ void DFp() {
                                }

                                @Override // X.InterfaceC80653iu
                                public final void DPX(C73083Pj c73083Pj) {
                                    AbstractC80203i9.A01(context, c79723hN2, A007, c3yd);
                                }
                            }, R.id.listener_id_for_media_tag_indicator);
                        }
                    }
                    me1 = new ME1(11, A007, c3yd);
                    return new C79773hS(me1);
                }
                throw new IllegalStateException("tag indicator holder should not be null");
        }
    }
}
