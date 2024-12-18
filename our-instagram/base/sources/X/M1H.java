package X;

import android.widget.LinearLayout;

/* loaded from: classes8.dex */
public final class M1H implements Runnable {
    public final /* synthetic */ C48259LXi A00;

    public M1H(C48259LXi c48259LXi) {
        this.A00 = c48259LXi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48259LXi c48259LXi = this.A00;
        c48259LXi.A0B.getClass();
        LinearLayout linearLayout = c48259LXi.A0B;
        linearLayout.setBottom(AbstractC13880nE.A06(linearLayout.getContext()) + C30D.A00);
        AbstractC13880nE.A0s(c48259LXi.A0B, this);
    }
}
