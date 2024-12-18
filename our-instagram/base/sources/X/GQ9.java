package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class GQ9 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RecyclerView A02;
    public final /* synthetic */ EVU A03;

    public GQ9(RecyclerView recyclerView, EVU evu, int i, int i2) {
        this.A03 = evu;
        this.A02 = recyclerView;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3OO A0V = this.A02.A0V(this.A00 + this.A01);
        if (A0V != null) {
            A0V.itemView.sendAccessibilityEvent(8);
        }
    }
}
