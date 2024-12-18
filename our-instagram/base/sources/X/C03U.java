package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.03U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03U {
    public final C03T A00;

    public C03U(View view) {
        C03T c17970ua;
        if (Build.VERSION.SDK_INT >= 30) {
            c17970ua = new C12510kv(view);
        } else {
            c17970ua = new C17970ua(view);
        }
        this.A00 = c17970ua;
    }
}
