package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OPB {
    public static final void A01(Fragment fragment, UserSession userSession, C38321qM c38321qM, EnumC39625Hej enumC39625Hej, String str) {
        if (EnumC39625Hej.A07 != enumC39625Hej && EnumC39625Hej.A06 != enumC39625Hej && EnumC39625Hej.A0G != enumC39625Hej) {
            if (EnumC39625Hej.A0H == enumC39625Hej) {
                F0J.A00().A02(fragment.requireActivity(), userSession, str, null, false);
            }
        } else {
            C1Y6 A00 = AbstractC69888VxF.A00();
            C1Y5 A002 = VRF.A00();
            String id = c38321qM.getId();
            if (id != null) {
                A00.A0B(A002.A00(fragment.requireContext(), userSession, id, str));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final EnumC39625Hej A00(C38321qM c38321qM) {
        switch (c38321qM.A1b().ordinal()) {
            case 0:
            case 9:
                return EnumC39625Hej.A07;
            case 1:
            case 4:
                return EnumC39625Hej.A0H;
            case 2:
            case 3:
            case 6:
            case 8:
            default:
                return null;
            case 5:
                return EnumC39625Hej.A06;
            case 7:
                return EnumC39625Hej.A0G;
        }
    }
}
