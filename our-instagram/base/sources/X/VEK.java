package X;

import com.facebook.R;

/* loaded from: classes11.dex */
public enum VEK {
    A03("TWO_BY_TWO", new int[]{R.id.top_left_image, R.id.top_right_image, R.id.bottom_left_image, R.id.bottom_right_image}),
    A05("TWO_ROWS_ONE_COLUMN", new int[]{R.id.top_image, R.id.bottom_image}),
    A04("TWO_COLUMNS_ONE_ROW", new int[]{R.id.left_image, R.id.right_image});

    public final int A00;
    public final int[] A01;

    VEK(String str, int[] iArr) {
        this.A00 = r2;
        this.A01 = iArr;
    }
}
