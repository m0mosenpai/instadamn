package X;

import java.util.Arrays;

/* renamed from: X.1t7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39831t7 {
    public final String A00;
    public final String A01;

    public C39831t7(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final void A00(SJD sjd) {
        sjd.A00 = Long.valueOf(Long.parseLong(this.A00));
        String str = this.A01;
        if (str != null) {
            sjd.A01.add(str);
        }
        sjd.A02 = false;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && C14360o3.A0K(getClass(), obj.getClass()));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{"", "", this.A00, ""});
    }
}
