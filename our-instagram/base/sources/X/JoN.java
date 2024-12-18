package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoN extends C1I4 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C75k A01;

    public JoN(C75k c75k, int i) {
        this.A01 = c75k;
        this.A00 = i;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = C0f9.A03(1760405628);
        if (i == 0) {
            AbstractC167007dF.A0J().postDelayed(new M5N(this, this.A01, this.A00), 100L);
        }
        C0f9.A0A(-307581699, A03);
    }
}
