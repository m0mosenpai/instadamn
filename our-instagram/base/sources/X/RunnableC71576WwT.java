package X;

import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;

/* renamed from: X.WwT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71576WwT implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ V01 A02;

    public RunnableC71576WwT(V01 v01, int i, int i2) {
        this.A02 = v01;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V01 v01 = this.A02;
        if (v01.isResumed()) {
            RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = v01.A02;
            refreshableRecyclerViewLayout.getClass();
            int i = this.A00;
            int i2 = this.A01;
            RefreshableRecyclerViewLayout.A07(refreshableRecyclerViewLayout);
            refreshableRecyclerViewLayout.A0R.A08(0.0d, true);
            if (i2 != -1) {
                AbstractC70663Fe abstractC70663Fe = refreshableRecyclerViewLayout.A0P.A0D;
                UGQ ugq = refreshableRecyclerViewLayout.A0S;
                ugq.A00 = i2;
                ((AbstractC110824yu) ugq).A00 = i;
                if (abstractC70663Fe != null) {
                    abstractC70663Fe.A10(ugq);
                    return;
                }
                return;
            }
            refreshableRecyclerViewLayout.A0P.A0o(i);
        }
    }
}
