package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.LoU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49151LoU implements C7QD, C7QE {
    public C7QH A00;
    public final TextView A01;
    public final View A02;

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

    public C49151LoU(View view) {
        this.A02 = view.requireViewById(R.id.hidden_message_container);
        this.A01 = AbstractC166997dE.A0T(view, R.id.hidden_message_text);
    }
}
