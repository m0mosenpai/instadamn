package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* renamed from: X.0of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14670of {
    public static final float A00(Context context, float f, int i) {
        float f2;
        if (C14640oc.A02()) {
            float A01 = AbstractC13880nE.A01(context, i);
            if (A01 > 0.0f && A01 <= 40.0f) {
                f2 = 1.8f;
            } else if (A01 <= 56.0f) {
                f2 = 2.3f;
            } else if (A01 <= 64.0f) {
                f2 = 2.7f;
            } else if (A01 > 64.0f) {
                f2 = 3.2f;
            } else {
                return 0.0f;
            }
            return AbstractC13690mv.A00(context, f2);
        }
        return f;
    }

    public static final float A01(Context context, float f, int i) {
        float f2;
        if (C14640oc.A02()) {
            float A01 = AbstractC13880nE.A01(context, i);
            if (A01 > 0.0f && A01 <= 40.0f) {
                f2 = 1.8f;
            } else if (A01 <= 56.0f) {
                f2 = 2.3f;
            } else if (A01 <= 64.0f) {
                f2 = 2.7f;
            } else if (A01 > 64.0f) {
                f2 = 3.2f;
            } else {
                return 0.0f;
            }
            return AbstractC13690mv.A00(context, f2);
        }
        return f;
    }

    public static final float A02(Context context, int i) {
        float f;
        boolean A02 = C14640oc.A02();
        Resources resources = context.getResources();
        if (A02) {
            float A01 = AbstractC13880nE.A01(context, resources.getDimension(i));
            if (A01 > 0.0f && A01 <= 40.0f) {
                f = 1.8f;
            } else if (A01 <= 56.0f) {
                f = 2.3f;
            } else if (A01 <= 64.0f) {
                f = 2.7f;
            } else {
                if (A01 <= 64.0f) {
                    return 0.0f;
                }
                f = 3.2f;
            }
            return AbstractC13690mv.A00(context, f);
        }
        return resources.getDimension(R.dimen.account_recs_header_image_margin);
    }

    public static final float A03(Context context, int i, int i2) {
        float f;
        boolean A02 = C14640oc.A02();
        Resources resources = context.getResources();
        if (A02) {
            float A01 = AbstractC13880nE.A01(context, resources.getDimension(i));
            if (A01 > 0.0f && A01 <= 40.0f) {
                f = 1.8f;
            } else if (A01 <= 56.0f) {
                f = 2.3f;
            } else if (A01 <= 64.0f) {
                f = 2.7f;
            } else {
                if (A01 <= 64.0f) {
                    return 0.0f;
                }
                f = 3.2f;
            }
            return AbstractC13690mv.A00(context, f);
        }
        return resources.getDimension(i2);
    }

    public static final float A04(Context context, int i, int i2) {
        float f;
        boolean A02 = C14640oc.A02();
        Resources resources = context.getResources();
        if (A02) {
            float A01 = AbstractC13880nE.A01(context, resources.getDimension(i));
            if (A01 > 0.0f && A01 <= 40.0f) {
                f = 8.0f;
            } else if (A01 <= 56.0f) {
                f = 10.0f;
            } else if (A01 <= 64.0f) {
                f = 12.0f;
            } else {
                if (A01 <= 64.0f) {
                    return 0.0f;
                }
                f = 14.0f;
            }
            return AbstractC13690mv.A00(context, A01 + f);
        }
        return resources.getDimension(i2);
    }

    public static final int A05(Context context, int i, int i2) {
        float f;
        if (C14640oc.A02()) {
            float A01 = AbstractC13880nE.A01(context, i);
            if (A01 > 0.0f && A01 <= 40.0f) {
                f = 8.0f;
            } else if (A01 <= 56.0f) {
                f = 10.0f;
            } else if (A01 <= 64.0f) {
                f = 12.0f;
            } else if (A01 > 64.0f) {
                f = 14.0f;
            } else {
                return 0;
            }
            return (int) AbstractC13690mv.A00(context, A01 + f);
        }
        return i2;
    }
}
