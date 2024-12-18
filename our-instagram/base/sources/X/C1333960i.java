package X;

/* renamed from: X.60i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1333960i extends C60f {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1333960i) {
                C1333960i c1333960i = (C1333960i) obj;
                if (!C14360o3.A0K(this.A00, c1333960i.A00) || !C14360o3.A0K(this.A01, c1333960i.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public C1333960i(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
