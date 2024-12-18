package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UHJ extends C1I4 {
    public final C3A9 A00;

    public UHJ(RecyclerView recyclerView, C69227Vjv c69227Vjv, UGU ugu) {
        C14360o3.A0B(c69227Vjv, 3);
        this.A00 = new C3A9(recyclerView, new C65927TwY(ugu, 0), new V83(c69227Vjv, ugu));
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(-1079462236);
        this.A00.A01();
        C0f9.A0A(566980817, A03);
    }
}
