package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.7tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176977tt {
    public static final boolean A00(Context context) {
        if ("Redmi Note 8".equals(Build.MODEL) || C04100Kb.A00(context) < 2016) {
            return false;
        }
        return true;
    }
}
