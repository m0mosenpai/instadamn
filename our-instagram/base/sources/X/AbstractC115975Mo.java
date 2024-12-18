package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.5Mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115975Mo {
    public static final C19270xB A00 = new C19270xB("reel_loading_error_logger");

    public static final void A00(UserSession userSession, String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(userSession, 2);
        C15790qZ A04 = AbstractC15820qc.A04();
        C18920wW A01 = AbstractC12220kQ.A01(A00, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "reel_loading_error");
        A002.AAP("error_type", str2);
        A002.AAP("network_connection_cellular_type", AbstractC15770qX.A00(A04.A00));
        A002.AAP("network_connection_state", AbstractC15820qc.A06());
        A002.AAP("network_connection_type", AbstractC15780qY.A00(A04.A01));
        A002.AAP("reel_module_source", str);
        String str3 = userSession.userId;
        C14360o3.A0B(str3, 0);
        A002.A9K(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC003100w.A0k(10, str3));
        A002.Cht();
    }

    public static final void A01(UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(str3, 2);
        C14360o3.A0B(userSession, 3);
        C15790qZ A04 = AbstractC15820qc.A04();
        C18920wW A01 = AbstractC12220kQ.A01(A00, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "reel_loading_error");
        A002.AAP("error_type", str2);
        A002.AAP("network_connection_cellular_type", AbstractC15770qX.A00(A04.A00));
        A002.AAP("network_connection_state", AbstractC15820qc.A06());
        A002.AAP("network_connection_type", AbstractC15780qY.A00(A04.A01));
        A002.AAP("reel_module_source", str3);
        if (str == null) {
            str = "";
        }
        A002.AAP("reel_id", str);
        String str4 = userSession.userId;
        C14360o3.A0B(str4, 0);
        A002.A9K(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC003100w.A0k(10, str4));
        A002.Cht();
    }
}
