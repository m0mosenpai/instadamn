package X;

import java.util.List;

/* renamed from: X.0ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08130ba {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C08130ba) {
                C08130ba c08130ba = (C08130ba) obj;
                if (!C14360o3.A0K(this.A00, c08130ba.A00) || this.A01 != c08130ba.A01 || this.A02 != c08130ba.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SigningInfoCompat(signatures=");
        sb.append(this.A00);
        sb.append(", hasMultipleSigners=");
        sb.append(this.A01);
        sb.append(", hasPastSigningCertificates=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public C08130ba(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = z2;
    }
}
