package X;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/* renamed from: X.9Tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210679Tk extends Toast {
    public static final C22961AAf A01 = new Object();
    public final Context A00;

    @Override // android.widget.Toast
    public final void show() {
        try {
            Context context = this.A00;
            C02R.A07(AbstractC167007dF.A1W(context), "context is null");
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                C02R.A07(!activity.isFinishing(), "activity is finishing");
                C02R.A07(!activity.isDestroyed(), "activity is destroyed");
            }
            C0K8.A0H("IGToast", "Showing IG Toast", new Throwable());
            super.show();
        } catch (IllegalStateException e) {
            C0w9.A06("IGToast", "Context is invalid", e);
        }
    }

    public C210679Tk(Context context) {
        super(context);
        this.A00 = context;
    }
}
