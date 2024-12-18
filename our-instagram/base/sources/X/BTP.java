package X;

import android.text.SpannableStringBuilder;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BTP {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C11520jB A01(com.instagram.common.session.UserSession r10, X.C4o9 r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BTP.A01(com.instagram.common.session.UserSession, X.4o9, java.lang.String):X.0jB");
    }

    public static final SpannableStringBuilder A00(List list, int i) {
        if (list != null && !list.isEmpty()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int size = list.size();
            if (i > size) {
                i = size;
            }
            for (int i2 = 0; i2 < i; i2++) {
                String str = (String) list.get(i2);
                new SpannableStringBuilder();
                if (str != null) {
                    AnonymousClass010.A0n(str);
                }
                spannableStringBuilder.append((CharSequence) list.get(i2));
                if (i2 < i - 1) {
                    spannableStringBuilder.append((CharSequence) "_");
                }
            }
            return spannableStringBuilder;
        }
        return null;
    }
}
