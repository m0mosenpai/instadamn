package X;

import android.content.Context;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.session.UserSession;
import java.io.File;

/* loaded from: classes7.dex */
public final class HY2 extends C40321u0 {
    public static final void A00(UserSession userSession, String str) {
        Integer num;
        String str2;
        Integer[] A00 = C05F.A00(10);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                switch (num.intValue()) {
                    case 1:
                        str2 = "author_self_add";
                        break;
                    case 2:
                        str2 = "reach_to_max_media_limit";
                        break;
                    case 3:
                        str2 = "reach_to_max_pending_media_limit";
                        break;
                    case 4:
                        str2 = "reach_to_max_submitted_media_per_user";
                        break;
                    case 5:
                        str2 = "fail_macsa_check";
                        break;
                    case 6:
                        str2 = "fail_experiment_check";
                        break;
                    case 7:
                        str2 = "Transcode not finished yet.";
                        break;
                    case 8:
                        str2 = "viewer_not_follow_private_author";
                        break;
                    case 9:
                        str2 = "unknown";
                        break;
                    default:
                        str2 = "not_open_carousel_post";
                        break;
                }
                if (!str2.equals(str)) {
                    i++;
                }
            } else {
                num = C05F.A1I;
            }
        }
        if (7 - num.intValue() != 0) {
            AbstractC25651Mw.A00(userSession).E4s(new C42241InR(num));
        }
    }

    @Override // X.C40321u0, X.InterfaceC40181tm
    public final C38321qM DqT(Context context, InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
        Object c114645Fu;
        String str;
        boolean A1a = AbstractC167017dG.A1a(userSession, c47z);
        C14360o3.A0C(interfaceC40821up, AbstractC111324zv.A00(2791));
        C38321qM c38321qM = ((N3A) interfaceC40821up).A00;
        if (c38321qM != null) {
            String BZ4 = c38321qM.A0C.BZ4();
            if (BZ4 != null) {
                A00(userSession, BZ4);
            } else {
                if (C18U.A06(C06090Tz.A05, userSession, 2342163254126387397L) && (str = c47z.A3V) != null) {
                    try {
                        File file = new File(str);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Exception unused) {
                    }
                }
                InterfaceC114655Fv A1k = c38321qM.A1k(userSession);
                if (A1k != null) {
                    InterfaceC38831rF interfaceC38831rF = c38321qM.A0C;
                    Boolean BCb = A1k.BCb();
                    Boolean CZi = A1k.CZi();
                    Boolean Ca3 = A1k.Ca3();
                    Boolean CbI = A1k.CbI();
                    A1k.BWL();
                    Boolean valueOf = Boolean.valueOf(A1a);
                    if (A1k instanceof HW5) {
                        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
                        c114645Fu = AbstractC37303Gc4.A06(A1k, new C09530e4[]{AbstractC166987dD.A1L(AbstractC111324zv.A00(429), BCb), AbstractC166987dD.A1L("is_open_carousel", CZi), AbstractC166987dD.A1L("is_parent_media", Ca3), AbstractC166987dD.A1L("is_prompt_page", CbI), AbstractC166987dD.A1L(AbstractC111324zv.A00(475), valueOf)});
                    } else {
                        c114645Fu = new C114645Fu(BCb, CZi, Ca3, CbI, valueOf);
                    }
                    interfaceC38831rF.Ea7((InterfaceC114655Fv) c114645Fu);
                    return c38321qM;
                }
            }
            return c38321qM;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C40321u0, X.InterfaceC40181tm
    public final N3A E3U(C3JY c3jy, UserSession userSession) {
        AbstractC167017dG.A1N(userSession, c3jy);
        N3A E3U = super.E3U(c3jy, userSession);
        String errorMessage = E3U.getErrorMessage();
        if (errorMessage != null) {
            A00(userSession, errorMessage);
        }
        return E3U;
    }
}
