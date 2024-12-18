package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;

/* renamed from: X.6UP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UP {
    public InterfaceC16660sJ A00;
    public final C6UT A01;
    public final InterfaceC02550Ad A02;

    /* JADX WARN: Type inference failed for: r8v0, types: [X.6US, java.lang.Object] */
    public C6UP(View view, UserSession userSession) {
        ViewGroup viewGroup;
        C14360o3.A0B(view, 2);
        C18920wW A00 = new C12210kP(userSession).A00();
        this.A02 = A00;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36323929991753411L)) {
                C9BA c9ba = new C9BA(C18U.A06(c06090Tz, userSession, 2342166939205709511L), C18U.A06(c06090Tz, userSession, 2342166939205971659L), 0);
                C16930sl c16930sl = C16930sl.A00;
                C14360o3.A0B(c16930sl, 1);
                Context context = view.getContext();
                C14360o3.A07(context);
                C6UT c6ut = new C6UT(context, new C6UQ(this), A00, c9ba, new Object(), c16930sl);
                this.A01 = c6ut;
                viewGroup.addView(c6ut, viewGroup.indexOfChild(view), new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }
}
