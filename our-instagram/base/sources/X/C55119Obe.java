package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.Obe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55119Obe {
    public static final C55119Obe A00 = new Object();

    public static final void A01(Context context, UserSession userSession, C47Z c47z, boolean z) {
        if (C18U.A06(C06090Tz.A05, userSession, 2342163254124159148L)) {
            AbstractC25651Mw.A00(userSession).E4s(new LYL(c47z, false));
            return;
        }
        SimpleImageUrl A01 = AbstractC81033jX.A01(AbstractC166987dD.A11(c47z.A33));
        Resources resources = context.getResources();
        int i = 2131969109;
        if (z) {
            i = 2131969110;
        }
        String string = resources.getString(i);
        C14360o3.A0A(string);
        IQU.A01(context, null, string, A01.getUrl());
    }

    public static final void A00(Context context, UserSession userSession, C47Z c47z) {
        C40121td A01 = C40121td.A0G.A01(context, userSession);
        if (c47z.A11()) {
            A01.A0D(c47z);
        } else {
            A01.A0C(c47z);
        }
        C25A.A00(userSession).A0B(AbstractC166987dD.A0O(context));
        A01.A09(c47z);
    }
}
