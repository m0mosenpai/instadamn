package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kmw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46801Kmw {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        if (A0x.getInt("ai_sticker_disclosure_sheet_seen_count", 0) >= ((int) C18U.A01(C06090Tz.A05, userSession, 36599181561761239L))) {
            return false;
        }
        AbstractC167007dF.A18(A0x, "ai_sticker_disclosure_sheet_seen_count", A0x.getInt("ai_sticker_disclosure_sheet_seen_count", 0) + 1);
        return true;
    }
}
