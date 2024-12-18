package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Akc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23998Akc implements C5OV {
    public final Context A00;
    public final UserSession A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        return AbstractC166987dD.A1b(AMd.A01(context, userSession, "ig_qp_fx_native_auth_token_existence_filter", "IGNativeAuthTokenExistenceFilter", userSession.userId));
    }

    public C23998Akc(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
