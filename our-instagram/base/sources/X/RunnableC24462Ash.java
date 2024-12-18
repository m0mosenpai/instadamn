package X;

import android.view.View;

/* renamed from: X.Ash, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24462Ash implements Runnable {
    public final /* synthetic */ AGM A00;

    public RunnableC24462Ash(AGM agm) {
        this.A00 = agm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AGM agm = this.A00;
        View view = agm.A00;
        if (view != null) {
            view.setBottom(AbstractC13880nE.A06(agm.A04));
        }
        View view2 = agm.A00;
        if (view2 != null) {
            AbstractC13880nE.A0s(view2, this);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
