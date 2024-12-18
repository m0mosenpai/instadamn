package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class E0H extends C1I4 {
    public final int A00 = 4;
    public final C2UU A01;
    public final InterfaceC16820sZ A02;

    public E0H(C2UU c2uu, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = c2uu;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        LinearLayoutManager linearLayoutManager;
        int A0N = AbstractC167017dG.A0N(recyclerView, 1566525201);
        super.onScrolled(recyclerView, i, i2);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if ((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null) {
            int itemCount = this.A01.getItemCount();
            if (itemCount > 0 && itemCount - linearLayoutManager.A1d() <= this.A00) {
                this.A02.invoke();
            }
            i3 = 1347713545;
        } else {
            i3 = -470704782;
        }
        C0f9.A0A(i3, A0N);
    }
}
