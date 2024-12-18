package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class BP8 {
    public static final BP8 A00 = new Object();

    public final C51722Yv A00(Context context, boolean z) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        int i = R.dimen.action_bar_item_spacing_left;
        if (z) {
            i = R.dimen.abc_button_padding_horizontal_material;
        }
        int[] iArr = {0, dimensionPixelSize2, dimensionPixelSize, resources.getDimensionPixelSize(i)};
        ArrayList arrayList = new ArrayList(4);
        int i2 = 0;
        do {
            arrayList.add(new C2Z3(iArr[i2] | 9221401712017801216L));
            i2++;
        } while (i2 < 4);
        C51722Yv c51722Yv = C51722Yv.A02;
        C2Z3 c2z3 = (C2Z3) AbstractC001800i.A0O(arrayList, 0);
        C2Z3 c2z32 = (C2Z3) AbstractC001800i.A0O(arrayList, 1);
        C2Z3 c2z33 = (C2Z3) AbstractC001800i.A0O(arrayList, 2);
        C2Z3 c2z34 = (C2Z3) AbstractC001800i.A0O(arrayList, 3);
        C51722Yv c51722Yv2 = null;
        if (c2z3 != null) {
            c51722Yv = new C51722Yv(null, new C9CU(C05F.A0u, 0, c2z3.A00));
        }
        if (c2z32 != null) {
            C9CU c9cu = new C9CU(C05F.A15, 0, c2z32.A00);
            if (c51722Yv == c51722Yv) {
                c51722Yv = null;
            }
            c51722Yv = new C51722Yv(c51722Yv, c9cu);
        }
        if (c2z33 != null) {
            C9CU c9cu2 = new C9CU(C05F.A1F, 0, c2z33.A00);
            if (c51722Yv == c51722Yv) {
                c51722Yv = null;
            }
            c51722Yv = new C51722Yv(c51722Yv, c9cu2);
        }
        if (c2z34 != null) {
            C9CU c9cu3 = new C9CU(C05F.A1I, 0, c2z34.A00);
            if (c51722Yv != c51722Yv) {
                c51722Yv2 = c51722Yv;
            }
            return new C51722Yv(c51722Yv2, c9cu3);
        }
        return c51722Yv;
    }
}
