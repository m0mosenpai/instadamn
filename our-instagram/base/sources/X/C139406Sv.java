package X;

/* renamed from: X.6Sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139406Sv extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C139406Sv(String str, String str2, String str3, String str4, int i) {
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        this.A03 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139406Sv) {
                C139406Sv c139406Sv = (C139406Sv) obj;
                if (!C14360o3.A0K(this.A03, c139406Sv.A03) || !C14360o3.A0K(this.A01, c139406Sv.A01) || !C14360o3.A0K(this.A04, c139406Sv.A04) || !C14360o3.A0K(this.A02, c139406Sv.A02) || this.A00 != c139406Sv.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A00;
    }
}
