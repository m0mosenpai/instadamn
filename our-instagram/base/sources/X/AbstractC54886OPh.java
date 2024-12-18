package X;

import com.facebook.R;

/* renamed from: X.OPh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54886OPh {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 2;
        }
    }

    public static int A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return R.id.edit_gender_male;
            case 2:
                return R.id.edit_gender_custom;
            case 3:
                return R.id.edit_gender_unspecified;
            default:
                return R.id.edit_gender_female;
        }
    }
}
