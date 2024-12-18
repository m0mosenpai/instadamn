package X;

import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.Arrays;

/* renamed from: X.3dm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77623dm {
    public static final int A02(C2YS c2ys, int i) {
        C14360o3.A0B(c2ys, 0);
        return c2ys.BoZ().A01(i);
    }

    public static final int A03(C2YS c2ys, int i) {
        C14360o3.A0B(c2ys, 0);
        return c2ys.BoZ().A02(i);
    }

    public static final long A0D(C2YS c2ys, int i) {
        C14360o3.A0B(c2ys, 0);
        return c2ys.BoZ().A03(i) | 9221401712017801216L;
    }

    public static final Drawable A0E(C2YS c2ys, int i) {
        Drawable drawable;
        C14360o3.A0B(c2ys, 0);
        C2XH BoZ = c2ys.BoZ();
        if (i != 0 && (drawable = BoZ.A00.getDrawable(i)) != null) {
            return drawable;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R(AbstractC111324zv.A00(624), Integer.toHexString(i)));
    }

    public static final String A0F(C2YS c2ys, int i) {
        C14360o3.A0B(c2ys, 0);
        String A04 = c2ys.BoZ().A04(i);
        if (A04 != null) {
            return A04;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R(AbstractC111324zv.A00(338), Integer.toHexString(i)));
    }

    public static final String A0G(C2YS c2ys, Object obj, int i) {
        String string;
        C14360o3.A0B(c2ys, 0);
        C14360o3.A0B(obj, 2);
        C2XH BoZ = c2ys.BoZ();
        Object[] objArr = {obj};
        if (i != 0 && (string = BoZ.A01.getString(i, Arrays.copyOf(objArr, 1))) != null) {
            return string;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R(AbstractC111324zv.A00(338), Integer.toHexString(i)));
    }

    public static final long A04(C2YS c2ys) {
        return A0D(c2ys, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public static final float A00(C2YS c2ys, int i) {
        C2XH BoZ = c2ys.BoZ();
        C2XF c2xf = BoZ.A02;
        Number number = (Number) ((C2XG) c2xf).A00.A02(Integer.valueOf(i));
        if (number != null) {
            return number.floatValue();
        }
        float dimension = BoZ.A01.getDimension(i);
        c2xf.A00(i, Float.valueOf(dimension));
        return dimension;
    }

    public static final int A01(C2YS c2ys) {
        return c2ys.BoZ().A02(R.color.black);
    }

    public static final long A05(C2YS c2ys) {
        return A0D(c2ys, R.dimen.abc_text_size_menu_header_material);
    }

    public static final long A06(C2YS c2ys) {
        return A0D(c2ys, R.dimen.abc_action_bar_elevation_material);
    }

    public static final long A07(C2YS c2ys) {
        return A0D(c2ys, R.dimen.account_discovery_bottom_gap);
    }

    public static final long A08(C2YS c2ys) {
        return A0D(c2ys, R.dimen.abc_control_corner_material);
    }

    public static final long A09(C2YS c2ys) {
        return A0D(c2ys, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
    }

    public static final long A0A(C2YS c2ys) {
        return A0D(c2ys, R.dimen.abc_button_inset_vertical_material);
    }

    public static final long A0B(C2YS c2ys) {
        return A0D(c2ys, R.dimen.abc_button_padding_horizontal_material);
    }

    public static final long A0C(C2YS c2ys) {
        return A0D(c2ys, R.dimen.action_bar_item_spacing_right);
    }

    public static final String A0H(C2YS c2ys, Object[] objArr, int i) {
        C2XH BoZ = c2ys.BoZ();
        Object[] copyOf = Arrays.copyOf(objArr, 2);
        C14360o3.A0B(copyOf, 1);
        String string = BoZ.A01.getString(i, Arrays.copyOf(copyOf, copyOf.length));
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R(AbstractC111324zv.A00(338), Integer.toHexString(i)));
    }
}
