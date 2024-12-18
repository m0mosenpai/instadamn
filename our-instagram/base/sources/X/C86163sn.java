package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;

/* renamed from: X.3sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86163sn {
    public final C6UT A00;

    /* JADX WARN: Type inference failed for: r9v0, types: [X.6US, java.lang.Object] */
    public C86163sn(View view, UserSession userSession) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36323929991818948L)) {
                C9BA c9ba = new C9BA(C18U.A06(c06090Tz, userSession, 2342166939205709511L), C18U.A06(c06090Tz, userSession, 2342166939205971659L), 0);
                C16930sl c16930sl = C16930sl.A00;
                C14360o3.A0B(c16930sl, 1);
                Context context = view.getContext();
                C14360o3.A07(context);
                C6UT c6ut = new C6UT(context, null, null, c9ba, new Object(), c16930sl);
                this.A00 = c6ut;
                viewGroup.addView(c6ut, viewGroup.indexOfChild(view) + 1, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }
}
