package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HL4 extends AbstractC37439GeJ {
    public C154796xU A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Fragment A07;
    public final UserSession A08;
    public final JIJ A09;
    public final C6WQ A0A;
    public final String A0B;
    public final InterfaceC09390do A0C;
    public final String A0D;
    public final boolean A0E;

    public HL4(Fragment fragment, UserSession userSession, JIJ jij, String str, String str2, List list, boolean z) {
        List A0m;
        this.A07 = fragment;
        this.A08 = userSession;
        this.A09 = jij;
        this.A0D = str;
        this.A0E = z;
        this.A03 = list;
        this.A01 = str2;
        String str3 = null;
        if (str != null && (A0m = AbstractC167007dF.A0m(str, "_", 0)) != null) {
            str3 = (String) AbstractC001800i.A0J(A0m);
        }
        this.A0B = str3;
        this.A04 = this.A01 != null;
        this.A0A = new C6WQ(fragment.requireContext(), true);
        this.A0C = AbstractC09440dt.A00(EnumC09460dv.A02, new C43203J8a(this, 33));
    }

    public static final void A02(HL4 hl4, boolean z) {
        String str = hl4.A0B;
        if (str != null) {
            new C41627IbI(hl4.A08).A02(new C37476Geu(5, hl4, z), EnumC46210Kcm.A04, str, hl4.A01);
        }
    }

    public static final void A03(HL4 hl4, boolean z) {
        String str;
        FragmentActivity activity = hl4.A07.getActivity();
        if (activity != null && (str = hl4.A0B) != null) {
            if (z) {
                UserSession userSession = hl4.A08;
                C38321qM A02 = C1DW.A00(userSession).A02(hl4.A0D);
                if (A02 != null) {
                    A02.A40();
                    A02.AEH(userSession);
                }
            }
            if (hl4.A0E) {
                activity.onBackPressed();
                UserSession userSession2 = hl4.A08;
                C35028Fc1 A00 = C35028Fc1.A00(str);
                A00.A0E = "open_carousel_review_page";
                A00.A0N = true;
                AbstractC31177DnL.A0o(activity, A00.A01(), userSession2, "single_media_feed");
                return;
            }
            activity.onBackPressed();
        }
    }
}
