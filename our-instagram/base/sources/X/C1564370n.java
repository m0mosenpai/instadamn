package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fxcal.upsell.common.FxIgLogoutACUpsellImpl;

/* renamed from: X.70n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1564370n {
    public static final FxIgLogoutACUpsellImpl A00(UserSession userSession, Context context, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(str, 2);
        return (FxIgLogoutACUpsellImpl) userSession.A01(FxIgLogoutACUpsellImpl.class, new C9G2(userSession, context, str, 19));
    }
}
