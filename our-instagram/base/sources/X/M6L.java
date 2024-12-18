package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes8.dex */
public final class M6L implements Runnable {
    public final /* synthetic */ L5X A00;
    public final /* synthetic */ L5X A01;
    public final /* synthetic */ C48754LhM A02;
    public final /* synthetic */ C48755LhN A03;

    public M6L(L5X l5x, L5X l5x2, C48754LhM c48754LhM, C48755LhN c48755LhN) {
        this.A01 = l5x;
        this.A02 = c48754LhM;
        this.A03 = c48755LhN;
        this.A00 = l5x2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A01.A0D) {
            C3DO c3do = C3DN.A00;
            FragmentActivity fragmentActivity = this.A02.A00;
            if (c3do.A00(fragmentActivity) != null) {
                C3DN A00 = c3do.A00(fragmentActivity);
                if (A00 != null) {
                    if (((C3DP) A00).A0h) {
                        return;
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            this.A03.DW3(this.A00);
        }
    }
}
