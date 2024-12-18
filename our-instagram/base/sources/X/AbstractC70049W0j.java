package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.facebook.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.W0j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70049W0j {
    public static final long A00 = TimeUnit.MILLISECONDS.toNanos(45);

    public static final WjN A00(Resources resources, Bitmap bitmap, C7S5 c7s5) {
        return new WjN(bitmap, c7s5, resources.getDimensionPixelSize(R.dimen.abc_control_corner_material), resources.getDimensionPixelSize(R.dimen.shh_min_gravity), resources.getDimensionPixelSize(R.dimen.shh_max_gravity), resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), resources.getDimensionPixelSize(R.dimen.shh_max_pos_y_delta));
    }
}
