package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WLC implements View.OnClickListener {
    public final /* synthetic */ C6QR A00;

    public WLC(C6QR c6qr) {
        this.A00 = c6qr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object value;
        int A05 = C0f9.A05(-320279092);
        C6QR c6qr = this.A00;
        C6QR.A00(c6qr).A0O(C6QR.A01(c6qr).A04(), !C6QR.A01(c6qr).A05().A09);
        C05A c05a = C6QR.A01(c6qr).A02.A01;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, UQJ.A00(null, null, (UQJ) value, null, null, null, null, 0, 0, 511, !((UQJ) c05a.getValue()).A09)));
        C0f9.A0C(830037346, A05);
    }
}
