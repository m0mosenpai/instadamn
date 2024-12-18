package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.7GE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7GE {
    public final WeakReference A00;
    public final WeakReference A01;
    public final WeakReference A02;

    public C7GE(Context context, UserSession userSession, C7FG c7fg) {
        C14360o3.A0B(c7fg, 2);
        C14360o3.A0B(context, 3);
        this.A02 = new WeakReference(userSession);
        this.A01 = new WeakReference(c7fg);
        this.A00 = new WeakReference(context);
    }
}
