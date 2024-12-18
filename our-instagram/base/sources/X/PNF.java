package X;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes9.dex */
public final class PNF implements Runnable {
    public final /* synthetic */ N6C A00;

    public PNF(N6C n6c) {
        this.A00 = n6c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NestedScrollView nestedScrollView = this.A00.A01;
        if (nestedScrollView != null) {
            nestedScrollView.A0F(130);
        }
    }
}
