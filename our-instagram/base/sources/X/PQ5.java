package X;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes9.dex */
public final class PQ5 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NestedScrollView A01;

    public PQ5(NestedScrollView nestedScrollView, int i) {
        this.A01 = nestedScrollView;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.scrollTo(0, this.A00);
    }
}
