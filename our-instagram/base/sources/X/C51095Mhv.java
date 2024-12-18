package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;

/* renamed from: X.Mhv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51095Mhv extends C8S8 {
    public final /* synthetic */ N5V A00;

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        AbstractC167007dF.A1D(c3oo, 1, c3oo2);
        C51127MiW c51127MiW = (C51127MiW) this.A00.A01.getValue();
        int bindingAdapterPosition = c3oo.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c3oo2.getBindingAdapterPosition();
        if (bindingAdapterPosition < bindingAdapterPosition2) {
            int i = bindingAdapterPosition;
            while (i < bindingAdapterPosition2) {
                int i2 = i + 1;
                Collections.swap(c51127MiW.A01, i, i2);
                i = i2;
            }
        } else {
            int i3 = bindingAdapterPosition2 + 1;
            if (i3 <= bindingAdapterPosition) {
                int i4 = bindingAdapterPosition;
                while (true) {
                    Collections.swap(c51127MiW.A01, i4, i4 - 1);
                    if (i4 == i3) {
                        break;
                    }
                    i4--;
                }
            }
        }
        c51127MiW.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    public C51095Mhv(N5V n5v) {
        this.A00 = n5v;
    }

    @Override // X.C8S8
    public final int getMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        return C8S8.makeMovementFlags(15, 0);
    }

    @Override // X.C8S8
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, float f, float f2, int i, boolean z) {
        AbstractC167027dH.A12(canvas, recyclerView, c3oo);
        super.onChildDraw(canvas, recyclerView, c3oo, f, f2, i, z);
        if (z) {
            View view = c3oo.itemView;
            float elevation = view.getElevation();
            float f3 = 20.0f;
            if (20.0f < elevation) {
                f3 = elevation;
            }
            view.setElevation(f3);
        }
    }
}
