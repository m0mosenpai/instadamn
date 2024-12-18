package X;

import android.text.TextUtils;

/* loaded from: classes8.dex */
public final class L8l {
    public String A00;
    public String A01;
    public String A02;

    public final String A00() {
        String str = this.A01;
        if (str != null) {
            if (TextUtils.isDigitsOnly(str)) {
                return this.A01;
            }
            throw AbstractC31172DnG.A0u();
        }
        throw AbstractC166997dE.A0g();
    }

    public final String A01() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        throw AbstractC166997dE.A0g();
    }
}
