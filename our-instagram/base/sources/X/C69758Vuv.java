package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vuv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69758Vuv {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC19630xq A02;

    public C69758Vuv(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = C1AT.A01(userSession).A03(C1AV.A0x);
    }

    public final long A00() {
        String str = this.A01.userId;
        if (str != null) {
            return this.A02.getLong(AnonymousClass001.A0R(str, "LAST_UPLOAD_SUCCESS_TS"), 0L);
        }
        return 0L;
    }

    public final String A01() {
        String str = this.A01.userId;
        if (str == null) {
            return "";
        }
        String string = this.A02.getString(AnonymousClass001.A0R(str, "last_upload_client_root_hash"), "");
        C14360o3.A0A(string);
        return string;
    }

    public final void A02(long j) {
        UserSession userSession = this.A01;
        String str = userSession.userId;
        if (str != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36311972802790223L);
            InterfaceC19610xo ARD = this.A02.ARD();
            if (A06) {
                ARD.E7G(AnonymousClass001.A0R(str, "LAST_UPLOAD_SUCCESS_TS"), j);
            } else {
                ARD.E7G(AnonymousClass001.A0R(str, "LAST_UPLOAD_SUCCESS_TS"), 0L);
            }
            ARD.apply();
        }
    }
}
