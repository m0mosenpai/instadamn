package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IS9 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.3OO, X.Guc, java.lang.Object] */
    public static final LinearLayout A00(Context context, ViewGroup viewGroup, int i) {
        C14360o3.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC43591JPw.A00(12));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        LinearLayout linearLayout2 = (LinearLayout) shimmerFrameLayout.findViewById(R.id.container);
        linearLayout2.setOrientation(1);
        C38471Gvs c38471Gvs = new C38471Gvs(AbstractC25227BEk.A0D(LayoutInflater.from(context), linearLayout2, R.layout.product_card_loading_placeholder_title, false));
        linearLayout2.addView(c38471Gvs.A03);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i2 = 0; i2 < i; i2++) {
            C38481Gw2 c38481Gw2 = new C38481Gw2(AbstractC31173DnH.A0C(LayoutInflater.from(context), linearLayout2, R.layout.product_card_loading_placeholder_row, false));
            A1E.add(c38481Gw2);
            linearLayout2.addView(c38481Gw2.A02);
        }
        linearLayout.addView(shimmerFrameLayout);
        ?? c3oo = new C3OO(linearLayout);
        c3oo.A00 = shimmerFrameLayout;
        c3oo.A01 = c38471Gvs;
        c3oo.A02 = A1E;
        linearLayout.setTag(c3oo);
        return linearLayout;
    }

    public static final void A01(C38401Guc c38401Guc, C33165EkC c33165EkC) {
        C14360o3.A0B(c38401Guc, 0);
        C38471Gvs c38471Gvs = c38401Guc.A01;
        E90 e90 = c33165EkC.A00;
        C14360o3.A0B(c38471Gvs, 0);
        View view = c38471Gvs.A03;
        if (e90 != null) {
            view.setVisibility(0);
            c38471Gvs.A01.setVisibility(8);
            view = c38471Gvs.A00;
        }
        view.setVisibility(8);
        for (C38481Gw2 c38481Gw2 : c38401Guc.A02) {
            C14360o3.A0B(c38481Gw2, 0);
            View view2 = c38481Gw2.A00;
            Context context = view2.getContext();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
            AbstractC13880nE.A0a(view2, dimensionPixelOffset);
            AbstractC13880nE.A0c(view2, dimensionPixelOffset2);
            View view3 = c38481Gw2.A01;
            AbstractC13880nE.A0a(view3, dimensionPixelOffset2);
            AbstractC13880nE.A0c(view3, dimensionPixelOffset);
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
            View view4 = c38481Gw2.A02;
            AbstractC13880nE.A0f(view4, dimensionPixelOffset3);
            AbstractC13880nE.A0U(view4, dimensionPixelOffset3);
            List list = c38481Gw2.A03;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view5 = (View) list.get(i);
                int i2 = 8;
                int i3 = 8;
                if (i < 3) {
                    i3 = 0;
                }
                view5.setVisibility(i3);
                View view6 = (View) c38481Gw2.A04.get(i);
                if (i < 3) {
                    i2 = 0;
                }
                view6.setVisibility(i2);
            }
        }
        c38401Guc.A00.A02();
    }
}
