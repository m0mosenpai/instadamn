package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class M5F implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ C47705L4m A02;

    public M5F(View view, RecyclerView recyclerView, C47705L4m c47705L4m) {
        this.A02 = c47705L4m;
        this.A00 = view;
        this.A01 = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47705L4m c47705L4m = this.A02;
        ((C54839OLy) c47705L4m.A04.getValue()).A01(this.A00, true);
        ((C47760L7g) c47705L4m.A06.getValue()).A00(this.A01, c47705L4m.A00);
    }
}
