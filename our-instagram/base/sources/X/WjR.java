package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WjR implements BC5 {
    public final /* synthetic */ C7S5 A00;
    public final /* synthetic */ C7S5 A01;
    public final /* synthetic */ C7XW A02;

    public WjR(C7S5 c7s5, C7S5 c7s52, C7XW c7xw) {
        this.A02 = c7xw;
        this.A01 = c7s5;
        this.A00 = c7s52;
    }

    @Override // X.BC5
    public final XAY ALo(Bitmap bitmap) {
        AbstractC59962oe abstractC59962oe = this.A02.A03;
        if (abstractC59962oe.isResumed()) {
            Context requireContext = abstractC59962oe.requireContext();
            C7S5 c7s5 = this.A01;
            if (c7s5 == null) {
                c7s5 = this.A00;
            }
            C14360o3.A0A(c7s5);
            C14360o3.A0B(c7s5, 2);
            Resources resources = requireContext.getResources();
            return new WjO(requireContext, bitmap, c7s5, resources.getDimensionPixelSize(R.dimen.reaction_min_gravity), resources.getDimensionPixelSize(R.dimen.reaction_max_gravity), resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height), resources.getDimensionPixelSize(R.dimen.reaction_max_pos_y_delta));
        }
        return null;
    }
}
