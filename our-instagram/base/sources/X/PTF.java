package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PTF implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C54970OTc A01;
    public final /* synthetic */ C46552Bt A02;
    public final /* synthetic */ String A03;

    public PTF(View view, C54970OTc c54970OTc, C46552Bt c46552Bt, String str) {
        this.A01 = c54970OTc;
        this.A00 = view;
        this.A02 = c46552Bt;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C54970OTc c54970OTc = this.A01;
        View view = this.A00;
        String A0q = AbstractC166997dE.A0q(view.getResources(), 2131972055);
        C54970OTc.A00(view, c54970OTc, new NMA(c54970OTc, this.A02, this.A03), EnumC58132lV.A02, A0q);
    }
}
