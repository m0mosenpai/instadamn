package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Lw3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49610Lw3 implements InterfaceC150976qx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7W4 A01;

    public C49610Lw3(C7W4 c7w4, int i) {
        this.A01 = c7w4;
        this.A00 = i;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        RecyclerView recyclerView = this.A01.A04;
        if (recyclerView == null) {
            C14360o3.A0F("messageRecyclerView");
            throw C00O.createAndThrow();
        }
        float f2 = this.A00;
        AbstractC13880nE.A0Y(recyclerView, (int) (f2 + ((r3.A00 - f2) * f)));
    }
}
