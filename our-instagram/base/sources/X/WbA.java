package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WbA implements InterfaceC71899X9j {
    public final int A00;
    public final SparseArray A01;

    @Override // X.InterfaceC71899X9j
    public final AbstractC66440UHq D8Y(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        C14360o3.A0B(viewGroup, 0);
        if (viewGroup instanceof RecyclerView) {
            Context context = viewGroup.getContext();
            RecyclerView recyclerView = new RecyclerView(new ContextThemeWrapper(context, this.A00));
            AbstractC31174DnI.A15(context, recyclerView);
            viewGroup2 = recyclerView;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout frameLayout = new FrameLayout(new ContextThemeWrapper(viewGroup.getContext(), this.A00));
            frameLayout.setLayoutParams(viewGroup.getLayoutParams());
            viewGroup2 = frameLayout;
        } else {
            viewGroup2 = viewGroup;
        }
        return new C67706UwX(AbstractC25227BEk.A0D(AbstractC58322PtE.A0I(viewGroup.getContext(), this.A00), viewGroup2, R.layout.container_cell_item_row, false), this.A01);
    }

    public WbA(SparseArray sparseArray, int i) {
        this.A00 = i;
        this.A01 = sparseArray;
    }
}
