package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.DzO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31856DzO extends UGO {
    public final /* synthetic */ C32315ELe A00;

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31856DzO(C32315ELe c32315ELe) {
        super(60, 0);
        this.A00 = c32315ELe;
    }

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        Object value;
        ArrayList A0U;
        AbstractC167017dG.A1P(c3oo, c3oo2);
        if (c3oo2 instanceof E30) {
            int bindingAdapterPosition = c3oo.getBindingAdapterPosition();
            int bindingAdapterPosition2 = c3oo2.getBindingAdapterPosition();
            C05A c05a = ((Dz6) this.A00.A0B.getValue()).A0A;
            do {
                value = c05a.getValue();
                A0U = AbstractC001800i.A0U((Collection) value);
                Collections.swap(A0U, bindingAdapterPosition, bindingAdapterPosition2);
            } while (!c05a.AIi(value, A0U));
            return true;
        }
        return false;
    }
}
