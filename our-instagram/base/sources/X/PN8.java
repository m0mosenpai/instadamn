package X;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes9.dex */
public final class PN8 implements Runnable {
    public final /* synthetic */ N6B A00;

    public PN8(N6B n6b) {
        this.A00 = n6b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NestedScrollView nestedScrollView = this.A00.A00;
        if (nestedScrollView != null) {
            nestedScrollView.A0F(130);
        }
    }
}
