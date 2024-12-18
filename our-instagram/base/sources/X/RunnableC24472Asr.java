package X;

import android.view.ViewGroup;

/* renamed from: X.Asr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24472Asr implements Runnable {
    public final /* synthetic */ ViewGroup A00;

    public RunnableC24472Asr(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.A00;
        viewGroup.setBottom(viewGroup.getBottom() + C30D.A00);
        AbstractC13880nE.A0s(viewGroup, this);
    }
}
