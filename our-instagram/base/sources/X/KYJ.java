package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class KYJ extends C49489Lu2 {
    public final int A00;
    public final Object A01;

    public KYJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C49489Lu2, X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        if (this.A00 != 0) {
            ((C1Df) this.A01).cancel();
        } else {
            AbstractC166987dD.A1Y(this.A01);
        }
    }
}
