package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.notifications.impl.DirectNotificationActionService;

/* loaded from: classes8.dex */
public final class M7J implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Capabilities A01;
    public final /* synthetic */ EnumC92794Ds A02;
    public final /* synthetic */ DirectNotificationActionService A03;
    public final /* synthetic */ C3o9 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public M7J(UserSession userSession, Capabilities capabilities, EnumC92794Ds enumC92794Ds, DirectNotificationActionService directNotificationActionService, C3o9 c3o9, String str, String str2, String str3, String str4) {
        this.A03 = directNotificationActionService;
        this.A00 = userSession;
        this.A02 = enumC92794Ds;
        this.A01 = capabilities;
        this.A04 = c3o9;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A05 = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7TH A00;
        DirectNotificationActionService directNotificationActionService = this.A03;
        UserSession userSession = this.A00;
        if (this.A02.A00()) {
            A00 = AbstractC44138Jf3.A00(userSession);
        } else {
            A00 = AbstractC165967bO.A00(userSession);
        }
        C7TH c7th = A00;
        C27741Wc A01 = C27741Wc.A01();
        C14360o3.A07(A01);
        C14360o3.A0B(c7th, 1);
        Context A0O = AbstractC166987dD.A0O(directNotificationActionService);
        Capabilities capabilities = this.A01;
        C3o9 c3o9 = this.A04;
        String str = this.A07;
        String str2 = this.A06;
        String str3 = this.A08;
        if (str3 != null) {
            String str4 = this.A05;
            if (str4 != null) {
                AbstractC167017dG.A1R(capabilities, c3o9);
                if (str2 == null) {
                    C0w9.A03("notification_action_inline_like_null_client_context", AnonymousClass001.A0L("message client context should not be null (is messageId null?: ", ')', AbstractC25229BEm.A1Z(str)));
                }
                c7th.ENY(capabilities, c3o9, str, str2, "push_notif", "push_notification_action", null);
                C9GR.A01(A0O, null, 2131973312, 1);
                AbstractC46883KoQ.A00(A0O, userSession, A01, str3, str4);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
