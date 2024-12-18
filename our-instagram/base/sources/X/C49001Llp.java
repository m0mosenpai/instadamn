package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Llp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49001Llp implements C7QE, InterfaceC162937Re {
    public C7QH A00;
    public final Drawable A01 = AbstractC162807Qr.A00();
    public final LinearLayout A02;
    public final TextView A03;
    public final TextView A04;

    @Override // X.C7QD
    public final View BKF() {
        return this.A02;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
        C7MU.A00(this.A02.getBackground(), i);
    }

    public C49001Llp(View view) {
        this.A02 = AbstractC31172DnG.A0B(view, R.id.message_content);
        this.A04 = AbstractC31180DnO.A06(view);
        this.A03 = AbstractC166997dE.A0T(view, R.id.text);
    }
}
