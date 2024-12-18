package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.FrJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35781FrJ implements CallerContextable {
    public static final String __redex_internal_original_name = "PendingSessionDelegate";
    public UserSession A00;
    public EnumC33445EqI A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;

    public final boolean A00() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return AbstractC49092Nc.A00(userSession).A00(CallerContext.A00(C35781FrJ.class), "ig_pending_session_delegate");
        }
        return false;
    }
}
