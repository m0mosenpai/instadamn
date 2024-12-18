package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hxk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40502Hxk {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        UserSession userSession;
        C38321qM A02;
        C59952od c59952od;
        C120985dq A00;
        String str2;
        C60662pp c60662pp;
        C685736u c685736u;
        InterfaceC65282xQ B5p;
        C75113Zb BRZ;
        Object A03 = c6fw.A03(0);
        if (!(A03 instanceof String)) {
            A03 = null;
        }
        if (C14360o3.A0K(A03, "manage_interests")) {
            FragmentActivity A04 = C6BQ.A04(c6fq);
            AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putBoolean("IS_SIGN_UP_FLOW", false);
            C140966Yy A0P = AbstractC31173DnH.A0P(A04, A0J);
            C3BH.A00().A01();
            AbstractC31175DnJ.A0v(A0b, new C32269EJe(), A0P);
        } else if (C14360o3.A0K(A03, "not_interested")) {
            Object A002 = c6fw.A00();
            if ((A002 instanceof String) && (str = (String) A002) != null) {
                AbstractC12990ll A0B = C6BQ.A0B(c6fq);
                if ((A0B instanceof UserSession) && (userSession = (UserSession) A0B) != null && (A02 = C1DX.A03.A02(userSession, "DidTapWAISTOptionV3", str)) != null) {
                    List A042 = C6BQ.A05(c6fq).A0U.A04();
                    C14360o3.A07(A042);
                    Fragment fragment = (Fragment) AbstractC001800i.A0K(A042);
                    if (fragment != null) {
                        if (fragment instanceof C114485Es) {
                            InterfaceC686036x interfaceC686036x = ((C114485Es) fragment).A04().A01().A00;
                            if (interfaceC686036x != null && (B5p = interfaceC686036x.B5p()) != null && (BRZ = B5p.BRZ(A02)) != null) {
                                interfaceC686036x.BDf().DKd(null, A02, EnumC75193Zm.A0N, BRZ);
                            }
                        } else if ((fragment instanceof C59952od) && (A00 = C37624GhJ.A00((c59952od = (C59952od) fragment))) != null) {
                            C37546Gg2 c37546Gg2 = c59952od.A0C;
                            if (c37546Gg2 == null) {
                                str2 = "viewerAdapter";
                            } else {
                                C37644Ghd C09 = c37546Gg2.A0A.C09(A00);
                                C3DO c3do = C3DN.A00;
                                C3DN A003 = c3do.A00(c59952od.requireActivity());
                                if (A003 != null && ((C3DP) A003).A0h) {
                                    C3DN A004 = c3do.A00(c59952od.requireActivity());
                                    if (A004 != null) {
                                        ((C3DP) A004).A0H = new C43028J0t(A00, C09, A004, c59952od);
                                    }
                                } else {
                                    C37540Gfw c37540Gfw = c59952od.A09;
                                    if (c37540Gfw == null) {
                                        str2 = "clipsViewerFragmentViewModel";
                                    } else {
                                        c37540Gfw.A0J(A00, C09);
                                    }
                                }
                            }
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        if ((fragment instanceof C60662pp) && (c60662pp = (C60662pp) fragment) != null && (c685736u = c60662pp.A0H) != null) {
                            c685736u.BDf().DKd(null, A02, EnumC75193Zm.A0N, c685736u.A0L.BRZ(A02));
                            return null;
                        }
                    }
                }
            }
        }
        return null;
    }
}
