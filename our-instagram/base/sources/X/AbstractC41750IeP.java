package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IeP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41750IeP {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Fragment fragment, UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 2);
        FragmentActivity activity = fragment.getActivity();
        if ((fragment instanceof InterfaceC11380iw) && activity != null) {
            C55772hI.A00(userSession).A08(activity, (InterfaceC11380iw) fragment, AbstractC111324zv.A00(3307), c38321qM.BqK());
        }
    }

    public static final void A03(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, boolean z) {
        String str2;
        C14360o3.A0B(c38321qM, 2);
        C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, "hashtag");
        A0F.A5Z = str;
        if (z) {
            str2 = "caption";
        } else {
            str2 = "user_comment";
        }
        A0F.A5R = str2;
        C11520jB A0B = AbstractC37300Gc1.A0B();
        A0B.A04(AbstractC128995sK.A02, str);
        A0B.A04(AbstractC128995sK.A06, AbstractC37303Gc4.A0X("HASHTAG"));
        A0F.A0E(A0B);
        int i = -1;
        if (c38321qM.A5M()) {
            i = 0;
        }
        C32U.A0E(userSession, A0F, c38321qM, interfaceC60442pS, i);
    }

    public static final void A04(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, boolean z) {
        String str2;
        C14360o3.A0B(c38321qM, 2);
        C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, "tag");
        A0F.A7I = str;
        if (z) {
            str2 = "caption";
        } else {
            str2 = "user_comment";
        }
        A0F.A5R = str2;
        C11520jB A0B = AbstractC37300Gc1.A0B();
        A0B.A04(AbstractC128995sK.A02, str);
        A0B.A04(AbstractC128995sK.A06, AbstractC37303Gc4.A0X("USER"));
        A0F.A0E(A0B);
        int i = -1;
        if (c38321qM.A5M()) {
            i = 0;
        }
        C32U.A0E(userSession, A0F, c38321qM, interfaceC60442pS, i);
    }

    public static final void A05(C38321qM c38321qM, InterfaceC65232xL interfaceC65232xL, C6T6 c6t6, InterfaceC61432r6 interfaceC61432r6, AnonymousClass317 anonymousClass317) {
        C14360o3.A0B(c38321qM, 2);
        if (interfaceC65232xL != null && interfaceC61432r6 != null) {
            interfaceC61432r6.DVi(c6t6, anonymousClass317, c38321qM, interfaceC65232xL.BRZ(c38321qM));
        }
    }

    public static final void A01(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str) {
        C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, AbstractC111324zv.A00(3201));
        A0F.A7I = str;
        int i = -1;
        if (c38321qM.A5M()) {
            i = 0;
        }
        C32U.A0E(userSession, A0F, c38321qM, interfaceC60442pS, i);
    }

    public static final void A02(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        if (AbstractC75423a9.A00(c38321qM, interfaceC60442pS)) {
            C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, "number_of_comments");
            A0F.A80 = c38321qM.A0d.A00(c38321qM.A1X()).A00;
            A0F.A4p = str;
            A0F.A7J = str2;
            C32U.A0E(userSession, A0F, c38321qM, interfaceC60442pS, -1);
        }
        C5M8.A02(userSession, AbstractC25233BEq.A0o(c38321qM), "number_of_comments_tapped");
    }
}
