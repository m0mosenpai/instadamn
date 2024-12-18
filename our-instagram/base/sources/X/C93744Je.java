package X;

import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.4Je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93744Je extends Pair {
    public static final C93744Je A00 = new Pair("", "");

    /* JADX WARN: Type inference failed for: r0v3, types: [X.4Je, android.util.Pair] */
    public static C93744Je A00(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new Pair(str, str2);
        }
        return A00;
    }
}
