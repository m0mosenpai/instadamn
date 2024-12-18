package X;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes9.dex */
public final class PNC implements Runnable {
    public final /* synthetic */ NOR A00;

    public PNC(NOR nor) {
        this.A00 = nor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NestedScrollView nestedScrollView = this.A00.A05;
        AbstractC51367MmS.A00(nestedScrollView);
        nestedScrollView.A0F(130);
    }
}
