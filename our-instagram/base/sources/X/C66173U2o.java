package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;

/* renamed from: X.U2o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66173U2o extends C3OO {
    public final int A00;

    public C66173U2o(View view) {
        super(view);
        if (!(view.getTag() instanceof C66171U2m) && !(view.getTag() instanceof WmE)) {
            throw AbstractC31172DnG.A0u();
        }
        Resources resources = view.getResources();
        this.A00 = resources.getDimensionPixelSize(R.dimen.action_button_min_width);
        resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
    }
}
