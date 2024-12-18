package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.3ZC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZC {
    public static int A01 = -1;
    public final UserSession A00;

    public C3ZC(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Integer num, String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36316843295838914L)) {
            String A00 = AbstractC72647Xjd.A00(num);
            C1ZX A012 = C1ZV.A00(userSession).A01(C05F.A03, C05F.A01, false);
            A012.A03("PRIMARY_REASON", A00);
            A012.A03("ADS_SURFACE", str);
            if (str2 == null) {
                str2 = "";
            }
            A012.A03("ad_id", str2);
            if (str3 == null) {
                str3 = "";
            }
            A012.A03("media_id", str3);
            A012.A03("logview_group_by", "PRIMARY_REASON");
            A012.A00();
        }
    }

    public final void A01(String str, int i, long j, boolean z) {
        C14360o3.A0B(str, 3);
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36316843295642303L) && i != 0) {
            C1ZX A012 = C1ZV.A00(userSession).A01(C05F.A03, C05F.A0C, false);
            A012.A03("ADS_SURFACE", str);
            A012.A03("is_first_request", String.valueOf(z));
            A012.A03("time_elapsed_since_request_start_ms", String.valueOf(j));
            A012.A03(TraceFieldType.StatusCode, String.valueOf(i));
            A012.A03("logview_group_by", "ADS_SURFACE");
            A012.A00();
        }
    }

    public final void A02(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36316843295838914L)) {
            C1ZX A012 = C1ZV.A00(userSession).A01(C05F.A03, C05F.A01, false);
            A012.A03("PRIMARY_REASON", str);
            A012.A03("ADS_SURFACE", str2);
            if (str3 == null) {
                str3 = "";
            }
            A012.A03("ad_id", str3);
            if (str4 == null) {
                str4 = "";
            }
            A012.A03("media_id", str4);
            A012.A03("logview_group_by", "PRIMARY_REASON");
            A012.A00();
        }
    }
}
