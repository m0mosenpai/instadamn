package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.IhE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41876IhE implements View.OnClickListener {
    public final /* synthetic */ C3K0 A00;

    public ViewOnClickListenerC41876IhE(C3K0 c3k0) {
        this.A00 = c3k0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(808701516);
        C3K0 c3k0 = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Dialog dialog = c3k0.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
        C0f9.A0C(-811901574, A05);
    }
}
