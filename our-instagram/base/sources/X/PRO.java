package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PRO implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ NT5 A01;

    public PRO(View view, NT5 nt5) {
        this.A00 = view;
        this.A01 = nt5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NT5 nt5 = this.A01;
        nt5.A09.A05(new PDR(AbstractC166997dE.A0q(nt5.A08.getResources(), 2131972672), true));
        nt5.A06 = true;
    }
}
