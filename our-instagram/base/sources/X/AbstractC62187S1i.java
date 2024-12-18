package X;

import android.util.SparseArray;

/* renamed from: X.S1i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62187S1i {
    public static final String A00(SparseArray sparseArray, int i) {
        String str;
        Object obj = sparseArray.get(i);
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return "";
        }
        return str;
    }
}
