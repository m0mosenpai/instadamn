package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WbD implements InterfaceC71899X9j {
    public final int A00;
    public final InterfaceC71898X9i A01;
    public final InterfaceC71898X9i A02;
    public final InterfaceC71898X9i A03;

    @Override // X.InterfaceC71899X9j
    public final AbstractC66440UHq D8Y(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        C14360o3.A0B(viewGroup, 0);
        if (viewGroup instanceof RecyclerView) {
            Context context = viewGroup.getContext();
            RecyclerView recyclerView = new RecyclerView(new ContextThemeWrapper(context, this.A00));
            AbstractC31174DnI.A15(context, recyclerView);
            viewGroup2 = recyclerView;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout linearLayout = new LinearLayout(new ContextThemeWrapper(viewGroup.getContext(), this.A00));
            linearLayout.setLayoutParams(viewGroup.getLayoutParams());
            viewGroup2 = linearLayout;
        } else {
            viewGroup2 = viewGroup;
        }
        C67708UwZ c67708UwZ = new C67708UwZ(AbstractC25227BEk.A0D(AbstractC58322PtE.A0I(viewGroup.getContext(), this.A00), viewGroup2, R.layout.list_cell_item_row, false));
        InterfaceC71898X9i interfaceC71898X9i = this.A01;
        if (interfaceC71898X9i != null) {
            c67708UwZ.A00 = interfaceC71898X9i.D8X(c67708UwZ.A03);
        }
        InterfaceC71898X9i interfaceC71898X9i2 = this.A02;
        if (interfaceC71898X9i2 != null) {
            c67708UwZ.A01 = interfaceC71898X9i2.D8X(c67708UwZ.A04);
        }
        InterfaceC71898X9i interfaceC71898X9i3 = this.A03;
        if (interfaceC71898X9i3 != null) {
            c67708UwZ.A02 = interfaceC71898X9i3.D8X(c67708UwZ.A05);
        }
        return c67708UwZ;
    }

    public WbD(InterfaceC71898X9i interfaceC71898X9i, InterfaceC71898X9i interfaceC71898X9i2, InterfaceC71898X9i interfaceC71898X9i3, int i) {
        this.A00 = i;
        this.A01 = interfaceC71898X9i;
        this.A02 = interfaceC71898X9i2;
        this.A03 = interfaceC71898X9i3;
    }

    public WbD() {
        this(null, null, null, 0);
    }
}
