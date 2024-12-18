package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class U00 extends C1I4 {
    public final C3A9 A00;

    public U00(RecyclerView recyclerView, C44211JgF c44211JgF, C38083GpC c38083GpC) {
        this.A00 = new C3A9(recyclerView, new C65927TwY(c44211JgF, AbstractC167007dF.A1V(c44211JgF) ? 1 : 0), new C38153GqK(c44211JgF, c38083GpC));
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(-1230269690);
        this.A00.A01();
        C0f9.A0A(-808902905, A03);
    }
}
