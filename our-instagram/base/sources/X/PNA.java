package X;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes9.dex */
public final class PNA implements Runnable {
    public final /* synthetic */ C52111N4j A00;

    public PNA(C52111N4j c52111N4j) {
        this.A00 = c52111N4j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NestedScrollView nestedScrollView = this.A00.A01;
        if (nestedScrollView != null) {
            nestedScrollView.A0F(130);
        }
    }
}
