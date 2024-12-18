package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.1t5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39811t5 {
    public static final double A00(long j) {
        if (j >= 0 && j <= Long.MAX_VALUE) {
            return j / 1000.0d;
        }
        throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("Invalid input: %d", Long.valueOf(j)));
    }
}
