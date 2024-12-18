package X;

import java.util.Locale;

/* renamed from: X.0g8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0g8 implements Comparable {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0g8 c0g8 = (C0g8) obj;
            if (this.A02.equals(c0g8.A02) && this.A01.equals(c0g8.A01)) {
                String str = this.A00;
                String str2 = c0g8.A00;
                if (str != null) {
                    return str.equals(str2);
                }
                if (str2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31;
        String str = this.A00;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0g8 c0g8 = (C0g8) obj;
        int compareTo = this.A02.compareTo(c0g8.A02);
        if (compareTo == 0) {
            return this.A01.compareTo(c0g8.A01);
        }
        return compareTo;
    }

    public final String toString() {
        return String.format(Locale.US, "[name: %s, hash: %s, id: %s, downloadUri: %s]", this.A02, this.A01, null, this.A00);
    }

    public C0g8(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }
}
