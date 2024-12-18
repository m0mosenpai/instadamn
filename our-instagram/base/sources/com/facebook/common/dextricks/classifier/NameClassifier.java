package com.facebook.common.dextricks.classifier;

import X.AnonymousClass001;
import android.util.Log;
import com.facebook.common.dextricks.StringTreeSet;

/* loaded from: classes.dex */
public final class NameClassifier {
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0074, code lost:
    
        if (r13 >= 13) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.classifier.NameClassifier.A00(java.lang.String):boolean");
    }

    public static boolean A01(String str, String str2) {
        if (str != null) {
            try {
                if (StringTreeSet.search(str2, str)) {
                    return true;
                }
            } catch (IndexOutOfBoundsException e) {
                Log.e("NameClassifier", AnonymousClass001.A0R("StringTreeSet search out of bounds for class: ", str2), e);
            }
        }
        return str2.length() == 38 && str2.charAt(3) == '.' && str2.charAt(13) == 'r' && str2.charAt(19) == 'L' && str2.charAt(23) == 'T' && str2.charAt(27) == 'P';
    }
}
