package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class LOM implements View.OnClickListener {
    public final /* synthetic */ C7DK A00;

    public LOM(C7DK c7dk) {
        this.A00 = c7dk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-162487637);
        C7DK c7dk = this.A00;
        if (c7dk.A0C()) {
            c7dk.A0B(true);
        } else {
            c7dk.A03();
        }
        C0f9.A0C(-1278916608, A05);
    }
}
