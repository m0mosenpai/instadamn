package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;

/* loaded from: classes11.dex */
public final class UKG extends AbstractC021208i {
    public final VgF A00;
    public final List A01;

    @Override // X.AbstractC021208i
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        RecyclerView recyclerView;
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.size_chart_page, viewGroup, false);
        C69154Vij c69154Vij = new C69154Vij(inflate);
        VgE vgE = (VgE) this.A01.get(i);
        while (true) {
            recyclerView = c69154Vij.A01;
            if (recyclerView.A12.size() <= 0) {
                break;
            }
            recyclerView.A0m(0);
        }
        while (true) {
            RecyclerView recyclerView2 = c69154Vij.A02;
            if (recyclerView2.A12.size() > 0) {
                recyclerView2.A0m(0);
            } else {
                C69155Vik c69155Vik = vgE.A00;
                recyclerView.A10(new UH6(recyclerView.getContext(), c69155Vik.A02.length));
                recyclerView.setAdapter(new UGX(c69155Vik, 2));
                C69156Vil c69156Vil = vgE.A01;
                Context context = recyclerView2.getContext();
                String[][] strArr = c69156Vil.A02;
                recyclerView2.setLayoutManager(new GridLayoutManager(context, strArr[0].length, 1, false));
                recyclerView2.A10(new UH6(context, strArr[0].length));
                recyclerView2.A10(new UH5(context, strArr[0].length));
                recyclerView2.setAdapter(new UGX(c69156Vil, 3));
                VgF vgF = this.A00;
                vgF.A01.add(recyclerView2);
                recyclerView2.A14(vgF.A00);
                viewGroup.addView(inflate);
                return c69154Vij;
            }
        }
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A01.size();
    }

    public UKG(VgF vgF, List list) {
        this.A01 = list;
        this.A00 = vgF;
    }

    @Override // X.AbstractC021208i
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        AbstractC167017dG.A1O(viewGroup, obj);
        C69154Vij c69154Vij = (C69154Vij) obj;
        VgF vgF = this.A00;
        RecyclerView recyclerView = c69154Vij.A02;
        vgF.A01.remove(recyclerView);
        recyclerView.A15(vgF.A00);
        viewGroup.removeView(c69154Vij.A00);
    }

    @Override // X.AbstractC021208i
    public final boolean isViewFromObject(View view, Object obj) {
        AbstractC167017dG.A1N(view, obj);
        return AbstractC167007dF.A1X(view, ((C69154Vij) obj).A00);
    }
}
