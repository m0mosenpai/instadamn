package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.FeH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35115FeH {
    public static boolean A00;
    public static final C35115FeH A01 = new Object();

    public static final void A00(Context context, UserSession userSession, int i) {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(AbstractC111324zv.A00(3344), userSession.userId);
        C14360o3.A07(formatStrLocaleSafe);
        Context applicationContext = context.getApplicationContext();
        String A002 = AbstractC111324zv.A00(3757);
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(A002, 0);
        C14360o3.A07(sharedPreferences);
        InterfaceC19610xo ARD = new C17320tT(sharedPreferences, A002).ARD();
        ARD.E7D(formatStrLocaleSafe, i);
        ARD.apply();
    }
}
