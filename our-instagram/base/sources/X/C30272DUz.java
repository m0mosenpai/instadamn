package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.DUz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30272DUz extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30272DUz(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        super(2);
        this.A00 = i;
        this.A06 = obj4;
        this.A01 = obj3;
        this.A07 = z;
        this.A05 = obj6;
        this.A03 = obj5;
        this.A04 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float f;
        if (this.A00 != 0) {
            SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) obj2;
            C14360o3.A0B(simpleZoomableViewContainer, 1);
            XVc xVc = (XVc) this.A06;
            C79743hP A04 = XVc.A04(simpleZoomableViewContainer, xVc);
            MediaFrameLayout A01 = A04.A01();
            IgProgressImageView A00 = A04.A00();
            if (xVc.A08) {
                f = xVc.A03.A00;
            } else {
                AbstractC13880nE.A0W(A01, -1);
                f = -1.0f;
            }
            A01.A00 = f;
            InterfaceC60442pS interfaceC60442pS = xVc.A02;
            C79723hN c79723hN = xVc.A03;
            AbstractC80203i9.A0A(interfaceC60442pS, (C80143i3) this.A01, c79723hN, xVc.A04, A00, (InterfaceC16820sZ) this.A05, this.A07);
            C65502xm c65502xm = (C65502xm) this.A03;
            AbstractC80203i9.A02((C9BD) this.A02, (C38321qM) this.A04, interfaceC60442pS, A04, c79723hN.A0E, c65502xm, c79723hN.A0G);
            if (Systrace.A0E(1L)) {
                C0fO.A01("setMediaGestureDetector", 1574986571);
            }
            try {
                A04.A01().setOnTouchListener(new Y8L(0, (InterfaceC81103jf) c79723hN.A0A.A0J.invoke(A04), xVc));
                if (Systrace.A0E(1L)) {
                    C0fO.A00(638008500);
                }
                return AbstractC25225BEi.A0q(new ME1(7, A00, A01));
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1562266530);
                }
                throw th;
            }
        }
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0C(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-778022407, "com.instagram.creation.genai.magicmod.common.ui.MagicModToolbar.<anonymous>.<anonymous> (MagicModToolbar.kt:114)");
            }
            int A0H = AbstractC166987dD.A0H(((C51760Mtj) this.A06).A02);
            if (A0H != 0) {
                if (A0H != 1) {
                    if (A0H != 3) {
                        if (A0H == 2) {
                            c5Tl.Eno(1468840338);
                            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.instagram_x_pano_filled_24, 0);
                            String A003 = AbstractC136736Hc.A00(c5Tl, 2131954754);
                            Modifier A0A = AbstractC118175Wb.A0A(AbstractC118175Wb.A0E(Modifier.A00, 0.0f, 0.0f, 12.0f, 0.0f), 0.0f, 12.0f);
                            c5Tl.Eno(1468851433);
                            Object obj3 = this.A02;
                            boolean AH4 = c5Tl.AH4(obj3);
                            Object EEc = c5Tl.EEc();
                            if (AH4 || EEc == C5UI.A00) {
                                EEc = DH4.A01(c5Tl, obj3, 45);
                            }
                            AbstractC25225BEi.A1V(c5Tl, false);
                            C5YS.A08(c5Tl, AbstractC118635Yc.A04(c5Tl, A0A, (InterfaceC16820sZ) EEc), A002, A003, 8, AbstractC25225BEi.A0C(c5Tl));
                        } else {
                            throw AbstractC25233BEq.A0r(c5Tl, 1468811768);
                        }
                    } else {
                        c5Tl.Eno(1468837748);
                    }
                } else {
                    c5Tl.Eno(-1711057690);
                    String A004 = AbstractC136736Hc.A00(c5Tl, 2131961124);
                    long A08 = AbstractC25226BEj.A08(c5Tl);
                    C118125Vw A0h = AbstractC25226BEj.A0h(c5Tl);
                    C1130158n c1130158n = Modifier.A00;
                    boolean z = this.A07;
                    c5Tl.Eno(1468834524);
                    Object obj4 = this.A03;
                    boolean AH42 = c5Tl.AH4(obj4);
                    Object EEc2 = c5Tl.EEc();
                    if (AH42 || EEc2 == C5UI.A00) {
                        EEc2 = DH4.A01(c5Tl, obj4, 44);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    C5WR.A0R(c5Tl, AbstractC118175Wb.A01(AbstractC118635Yc.A01(c5Tl, c1130158n, null, null, (InterfaceC16820sZ) EEc2, 6, z)), A0h, A004, A08);
                }
            } else {
                CHD.A00(c5Tl, AbstractC118175Wb.A0B(AbstractC25225BEi.A0N(c5Tl, -1711399310), 0.0f, 0.0f, 12.0f), (C61) this.A01, (InterfaceC16820sZ) this.A05, (InterfaceC16660sJ) this.A04, 3072, 0);
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(-89206395);
            }
        }
        return C0eB.A00;
    }
}
