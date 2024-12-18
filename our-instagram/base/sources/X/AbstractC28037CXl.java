package X;

import android.app.Activity;
import com.instagram.api.schemas.IntegrityInterstitialType;
import com.instagram.common.session.UserSession;

/* renamed from: X.CXl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28037CXl {
    public static final void A01(C5Tl c5Tl, C27958CUc c27958CUc, C47255KuS c47255KuS, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        String str;
        C14360o3.A0B(c47255KuS, 0);
        C14360o3.A0B(c27958CUc, 1);
        c5Tl.Enr(-1869171000);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c47255KuS) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c27958CUc);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(359870795, "com.instagram.barcelona.weblink.WebLinkNavigator (WebLinkNavigator.kt:47)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            C14360o3.A0C(A19, AbstractC43591JPw.A00(4));
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1273891626);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, null);
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C45174JzF c45174JzF = (C45174JzF) interfaceC74953Yl.getValue();
            c5Tl.Eno(-1273887600);
            if (c45174JzF != null) {
                IntegrityInterstitialType integrityInterstitialType = c45174JzF.A01;
                int ordinal = integrityInterstitialType.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        str = c45174JzF.A05;
                    } else {
                        str = AbstractC111324zv.A00(2457);
                    }
                } else {
                    str = "https://transparency.fb.com/data/content-restrictions/content-violating-local-law/";
                }
                boolean A1a = AbstractC25232BEp.A1a(c5Tl, str, c45174JzF, AbstractC25233BEq.A1W(c5Tl, A19, A11, -1651490485));
                Object EEc = c5Tl.EEc();
                if (A1a || EEc == obj) {
                    EEc = new ME8(A19, A11, c45174JzF, str, 5);
                    c5Tl.FBy(EEc);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc, false);
                Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1651479879);
                if (A0q2 == obj) {
                    A0q2 = new C50150MDd(interfaceC74953Yl, 5);
                    c5Tl.FBy(A0q2);
                }
                AbstractC27573CEs.A00(c5Tl, integrityInterstitialType, c45174JzF.A03, A1A, AbstractC25225BEi.A1A(A0K, A0q2, false), 384);
            }
            C117505Tk.A0L(A0K, false);
            Object value = c47255KuS.A00.getValue();
            if (value == null) {
                if (C0fH.A02()) {
                    C0fH.A00(-1735077631);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 26;
                C30507Dbq.A01(ASZ, c27958CUc, c47255KuS, i, i3);
            }
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A11, AbstractC25232BEp.A1Y(c5Tl, value, A19, -1273851002)) | AbstractC25231BEo.A1K(i2) | AbstractC25228BEl.A1R(i2);
            Object EEc2 = c5Tl.EEc();
            if (A1X || EEc2 == obj) {
                EEc2 = new MCR(A11, interfaceC74953Yl, A19, c47255KuS, value, c27958CUc, (InterfaceC23621Ds) null, 9);
                c5Tl.FBy(EEc2);
            }
            if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc2, value, false)) {
                C0fH.A00(-403320979);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 25;
            C30507Dbq.A01(ASZ, c27958CUc, c47255KuS, i, i3);
        }
    }

    public static final void A00(Activity activity, UserSession userSession, C2Fb c2Fb, Long l, String str, String str2) {
        C63397SjR A0y = AbstractC25228BEl.A0y(activity, userSession, c2Fb, str);
        A0y.A0S = str2;
        A0y.A0C(String.valueOf(l));
        A0y.A0A();
    }
}
