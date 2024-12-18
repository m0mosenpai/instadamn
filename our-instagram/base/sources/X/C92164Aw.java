package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92164Aw {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C92164Aw c92164Aw = (C92164Aw) obj;
            if (!Util.A0I(this.A01, c92164Aw.A01) || !Util.A0I(this.A02, c92164Aw.A02) || !Util.A0I(this.A00, c92164Aw.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A01.hashCode() * 31;
        String str = this.A02;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public C92164Aw(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
