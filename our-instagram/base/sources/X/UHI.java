package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class UHI extends C1I4 {
    public final C3A9 A00;

    public UHI(RecyclerView recyclerView, C3A6 c3a6, C36Z... c36zArr) {
        this.A00 = new C3A9(recyclerView, c3a6, (C36Z[]) Arrays.copyOf(c36zArr, 1));
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(510689812);
        this.A00.A01();
        C0f9.A0A(-1637737492, A03);
    }
}
