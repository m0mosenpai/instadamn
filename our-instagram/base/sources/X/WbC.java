package X;

import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WbC implements InterfaceC71899X9j {
    public final InterfaceC71898X9i A00;
    public final InterfaceC71898X9i A01;

    @Override // X.InterfaceC71899X9j
    public final AbstractC66440UHq D8Y(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C67707UwY c67707UwY = new C67707UwY(AbstractC25227BEk.A0D(AbstractC58322PtE.A0I(viewGroup.getContext(), 0), viewGroup, R.layout.card_cell_item_row, false));
        InterfaceC71898X9i interfaceC71898X9i = this.A01;
        if (interfaceC71898X9i != null) {
            c67707UwY.A01 = interfaceC71898X9i.D8X(c67707UwY.A03);
        }
        InterfaceC71898X9i interfaceC71898X9i2 = this.A00;
        if (interfaceC71898X9i2 != null) {
            c67707UwY.A00 = interfaceC71898X9i2.D8X(c67707UwY.A02);
        }
        return c67707UwY;
    }

    public WbC(InterfaceC71898X9i interfaceC71898X9i, InterfaceC71898X9i interfaceC71898X9i2) {
        this.A01 = interfaceC71898X9i;
        this.A00 = interfaceC71898X9i2;
    }

    public WbC() {
        this(null, null);
    }
}
