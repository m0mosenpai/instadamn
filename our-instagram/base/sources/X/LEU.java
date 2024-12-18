package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LEU {
    public final Context A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;

    public LEU(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = abstractC59962oe;
    }

    public static final C199928sw A00(Context context, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        Drawable drawable;
        Drawable drawable2 = context.getDrawable(i2);
        if (C14640oc.A08()) {
            drawable = context.getDrawable(i2);
        } else {
            drawable = null;
        }
        return new C199928sw(drawable2, drawable, null, new C49479Lts(interfaceC16820sZ, 0), null, AbstractC166997dE.A0p(context, i), 0, 0, 0, false, false, false, true, false, false, false);
    }
}
