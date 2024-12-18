package X;

import android.widget.TextView;

/* loaded from: classes9.dex */
public final class OHt {
    public int A00;
    public final TextView A01;

    public OHt(TextView textView) {
        C14360o3.A0B(textView, 1);
        this.A01 = textView;
        this.A00 = -1;
    }

    public final void A00(float f) {
        int round = Math.round(f / 100.0f);
        if (round != this.A00) {
            this.A00 = round;
            TextView textView = this.A01;
            AbstractC31177DnL.A0r(textView.getContext(), textView, AbstractC166997dE.A0z("%.1f", AbstractC166997dE.A1b(Float.valueOf(round / 10.0f), 1)), 2131955482);
        }
    }
}
