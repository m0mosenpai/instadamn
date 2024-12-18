package X;

import android.view.View;
import android.widget.Toast;

/* renamed from: X.86P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86P {
    public View A00;
    public Toast A01;

    public final void A00() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(4);
            view.setOnClickListener(null);
            Toast toast = this.A01;
            if (toast != null) {
                toast.cancel();
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
