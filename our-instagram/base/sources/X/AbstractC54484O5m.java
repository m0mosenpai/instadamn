package X;

import android.view.View;

/* renamed from: X.O5m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54484O5m {
    public final View A00;

    public AbstractC54484O5m(View view) {
        this.A00 = view;
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
    }
}
