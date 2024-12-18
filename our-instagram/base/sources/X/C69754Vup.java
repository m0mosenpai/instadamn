package X;

import java.util.Arrays;

/* renamed from: X.Vup, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69754Vup {
    public final C69776VvD A00;
    public final C69772Vv9 A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69754Vup) {
                C69754Vup c69754Vup = (C69754Vup) obj;
                if (!C14360o3.A0K(this.A02, c69754Vup.A02) || !C14360o3.A0K(this.A00, c69754Vup.A00) || !C14360o3.A0K(this.A01, c69754Vup.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2 = this.A02;
        C69776VvD c69776VvD = this.A00;
        String str3 = null;
        if (c69776VvD != null) {
            str = c69776VvD.A01;
        } else {
            str = null;
        }
        C69772Vv9 c69772Vv9 = this.A01;
        if (c69772Vv9 != null) {
            str3 = c69772Vv9.A02;
        }
        return Arrays.hashCode(new Object[]{str2, str, str3});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECPContactInformation(fullName=");
        sb.append(this.A02);
        sb.append(", email=");
        sb.append(this.A00);
        sb.append(", phone=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }

    public C69754Vup(C69776VvD c69776VvD, C69772Vv9 c69772Vv9, String str) {
        this.A02 = str;
        this.A00 = c69776VvD;
        this.A01 = c69772Vv9;
    }
}
