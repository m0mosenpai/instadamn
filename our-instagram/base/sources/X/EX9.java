package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;

/* loaded from: classes6.dex */
public final class EX9 extends AbstractC66412zI {
    public final Context A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.interest_shimmer_placeholder, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC43591JPw.A00(12));
        return new E20((ShimmerFrameLayout) inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        View A00;
        E20 e20 = (E20) c3oo;
        C14360o3.A0B(e20, 1);
        e20.A01.A02();
        Context context = this.A00;
        C14360o3.A0B(context, 0);
        LinearLayout linearLayout = e20.A00;
        linearLayout.removeAllViews();
        int floor = ((int) Math.floor(AbstractC13880nE.A09(context) / context.getResources().getDimension(R.dimen.shimmer_interest_section_height))) - 1;
        if (floor >= 0) {
            int i2 = 0;
            while (true) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.interest_section_shimmer, (ViewGroup) linearLayout, false);
                HorizontalFlowLayout horizontalFlowLayout = (HorizontalFlowLayout) inflate.findViewById(R.id.subinterests_pill_container);
                if (i2 % 2 == 0) {
                    C14360o3.A0A(horizontalFlowLayout);
                    i = R.dimen.abc_list_item_height_large_material;
                    horizontalFlowLayout.addView(F8M.A00(context, horizontalFlowLayout, R.dimen.abc_list_item_height_large_material));
                    A00 = F8M.A00(context, horizontalFlowLayout, R.dimen.abc_list_item_height_large_material);
                } else {
                    C14360o3.A0A(horizontalFlowLayout);
                    i = R.dimen.abc_list_item_height_large_material;
                    horizontalFlowLayout.addView(F8M.A00(context, horizontalFlowLayout, R.dimen.abc_list_item_height_large_material));
                    A00 = F8M.A00(context, horizontalFlowLayout, R.dimen.alignment_guide_default_vertical_margin);
                }
                horizontalFlowLayout.addView(A00);
                horizontalFlowLayout.addView(F8M.A00(context, horizontalFlowLayout, i));
                linearLayout.addView(inflate);
                if (i2 != floor) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public EX9(Context context) {
        this.A00 = context;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36178Fxs.class;
    }
}
