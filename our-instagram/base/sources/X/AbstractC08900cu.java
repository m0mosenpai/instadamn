package X;

import android.os.Trace;
import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.0cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08900cu {
    public static void A00(String str, String str2, String str3) {
        String A0g = AnonymousClass001.A0g(str, str2, str3);
        if (A0g.length() > 127 && str2 != null) {
            A0g = AnonymousClass001.A0g(str, str2.substring(0, (StringTreeSet.MAX_SYMBOL_COUNT - str.length()) - str3.length()), str3);
        }
        Trace.beginSection(A0g);
    }
}
