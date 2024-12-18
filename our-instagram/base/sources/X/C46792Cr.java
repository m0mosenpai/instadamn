package X;

import android.text.TextUtils;

/* renamed from: X.2Cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46792Cr {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != C46792Cr.class) {
                return false;
            }
            C46792Cr c46792Cr = (C46792Cr) obj;
            if (!TextUtils.equals(this.A00, c46792Cr.A00) || this.A01 != c46792Cr.A01 || this.A02 != c46792Cr.A02) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.A00.hashCode() + 31) * 31;
        int i = 1231;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        int i3 = (hashCode + i2) * 31;
        if (!this.A02) {
            i = 1237;
        }
        return i3 + i;
    }

    public C46792Cr(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }
}
