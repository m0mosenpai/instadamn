package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MjV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51187MjV extends AbstractC70653Fc {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C51187MjV(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                if (RecyclerView.A02(view) == 0) {
                    rect.set(this.A01, 0, 0, 0);
                    return;
                } else {
                    rect.set(0, 0, 0, 0);
                    return;
                }
            case 1:
                AbstractC167017dG.A1N(rect, view);
                AbstractC167007dF.A1E(recyclerView, 2, c3f5);
                super.getItemOffsets(rect, view, recyclerView, c3f5);
                int A02 = RecyclerView.A02(view);
                InterfaceC58131Ppu interfaceC58131Ppu = (InterfaceC58131Ppu) this.A02;
                if (interfaceC58131Ppu.Bz3(A02, 2) == 2 || interfaceC58131Ppu.ApS(A02, 2) == 0) {
                    return;
                }
                rect.left = this.A01;
                return;
            default:
                int A022 = RecyclerView.A02(view);
                if (A022 < 3) {
                    i = 0;
                } else {
                    i = this.A01;
                }
                if (A022 % 3 == 0) {
                    i2 = 0;
                } else {
                    i2 = this.A01;
                }
                rect.set(i2, i, 0, 0);
                return;
        }
    }
}
