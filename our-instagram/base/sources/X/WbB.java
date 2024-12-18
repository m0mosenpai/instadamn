package X;

import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WbB implements InterfaceC71899X9j {
    public final int A00;

    @Override // X.InterfaceC71899X9j
    public final AbstractC66440UHq D8Y(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        return new C67703UwU(AbstractC25226BEj.A0R(AbstractC58322PtE.A0I(viewGroup.getContext(), this.A00), viewGroup, R.layout.bloks_cell_item_row, false));
    }

    public WbB(int i) {
        this.A00 = i;
    }

    public WbB() {
        this(0);
    }
}
