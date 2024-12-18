package X;

/* renamed from: X.SOj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62742SOj {
    public final String A00;
    public final String A01;

    public C62742SOj(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        C62742SOj c62742SOj;
        String str;
        String str2;
        String str3;
        String str4;
        return obj == this || ((obj instanceof C62742SOj) && (((str = this.A00) == (str2 = (c62742SOj = (C62742SOj) obj).A00) || (str != null && str.equals(str2))) && ((str3 = this.A01) == (str4 = c62742SOj.A01) || (str3 != null && str3.equals(str4)))));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 37) + AbstractC167017dG.A0O(this.A01);
    }

    public final String toString() {
        return AnonymousClass001.A11("[packageName=", this.A00, ",libraryName=", this.A01, "]");
    }
}
