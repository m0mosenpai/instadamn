package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UHH extends C1I4 {
    public final /* synthetic */ C69046Vgn A00;

    public UHH(C69046Vgn c69046Vgn) {
        this.A00 = c69046Vgn;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = C0f9.A03(-1729710386);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 2 || i == 1) {
            C69046Vgn c69046Vgn = this.A00;
            RecyclerView recyclerView2 = c69046Vgn.A00;
            recyclerView2.A15(this);
            recyclerView2.A0E = null;
            c69046Vgn.A01.A07(recyclerView2);
        }
        C0f9.A0A(-148423340, A03);
    }
}
