package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.IKt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41180IKt {
    public final void A00(Activity activity, Context context, UserSession userSession, String str, boolean z) {
        AbstractC167017dG.A1R(userSession, str);
        C38927HBz c38927HBz = new C38927HBz();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("media_id", str);
        A0b.putBoolean("is_story", z);
        C189448aO A0W = AbstractC31174DnI.A0W(A0b, c38927HBz, userSession);
        AbstractC25225BEi.A1Q(A0W, false);
        A0W.A06 = context.getColor(AbstractC53242c7.A02(context));
        AbstractC31173DnH.A0w(activity, c38927HBz, A0W);
    }
}
