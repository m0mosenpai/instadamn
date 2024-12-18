package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This client storage of representing Fb linkage is deprecated, please see FxIGMasterAccountCache.kt")
/* renamed from: X.Dq6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31341Dq6 implements CallerContextable {
    public static final String __redex_internal_original_name = "FacebookLinkageHelper";
    public final UserSession A00;

    public C31341Dq6(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }
}
