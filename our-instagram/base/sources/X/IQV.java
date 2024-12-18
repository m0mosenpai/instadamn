package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* loaded from: classes7.dex */
public abstract class IQV {
    public static final void A00(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1, int i, int i2, int i3) {
        String str;
        AbstractC167027dH.A12(context, userSession, c38321qM);
        C32U.A0Q(userSession, c38321qM, interfaceC60442pS, null, Integer.valueOf(i2), Integer.valueOf(i3), "share_button", i);
        if (c1m1 != null) {
            str = c1m1.getSessionId();
        } else {
            str = null;
        }
        IQF.A00(interfaceC60442pS, userSession, c38321qM, null, null, null, null, null, null, str, null, 0);
        C2EY A00 = AbstractC40650I0i.A00(c38321qM);
        if (c38321qM.getId() != null) {
            C34726FRp A07 = C28531Zo.A04.A02.A07(interfaceC60442pS, userSession, A00);
            String id = c38321qM.getId();
            if (id != null) {
                A07.A06(id);
                A07.A04(interfaceC60442pS);
                A07.A07.putInt(AbstractC111324zv.A00(42), i);
                DirectShareSheetFragment A002 = A07.A00();
                C3DN A003 = C3DN.A00.A00((Activity) AbstractC13320mI.A00(context, Activity.class));
                if (A003 != null) {
                    A003.A0K(A002);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public static final void A01(Fragment fragment, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC43428JGs interfaceC43428JGs) {
        AbstractC167017dG.A1N(userSession, fragment);
        WEz A01 = AbstractC69993VzD.A01(fragment.requireActivity(), interfaceC60442pS, userSession, EnumC65855TvH.A0a, VG2.A0d, c38321qM.getId());
        A01.A01 = c38321qM.A2E(userSession);
        AbstractC37301Gc2.A1R(A01, new C53024Ncw(2, interfaceC43428JGs, fragment));
    }
}
