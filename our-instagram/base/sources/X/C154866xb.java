package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.6xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154866xb {
    public final long A00;
    public final C18920wW A01;
    public final String A02;

    public C154866xb(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 3);
        this.A02 = str;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A00 = Long.parseLong(userSession.userId);
    }

    public final void A00(String str, String str2, String str3, String str4, String str5) {
        long j;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        C14360o3.A0B(str5, 4);
        Long A0k = AbstractC003100w.A0k(10, str4);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_smb_partner_flow_consumer");
        long j2 = this.A00;
        A00.A9K("igid", Long.valueOf(j2));
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "open_deeplink");
        A00.AAP("action", "open");
        A00.AAP(AbstractC31581Du9.A00(), this.A02);
        boolean z = false;
        if (j2 == j) {
            z = true;
        }
        A00.A7v("is_profile_owner", Boolean.valueOf(z));
        A00.A9K("profile_owner_id", Long.valueOf(j));
        A00.AAP("service_type", str5);
        A00.A9K("partner_id", AbstractC003100w.A0k(10, str));
        A00.AAP("partner_name", str2);
        A00.AAP("url", str3);
        A00.Cht();
    }
}
