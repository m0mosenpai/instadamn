package X;

/* renamed from: X.Muy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51794Muy extends C0T6 implements XFL {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C51794Muy(Boolean bool, Long l, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str3, 5);
        this.A00 = l;
        this.A03 = bool;
        this.A01 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51794Muy) {
                C51794Muy c51794Muy = (C51794Muy) obj;
                if (!C14360o3.A0K(this.A00, c51794Muy.A00) || !C14360o3.A0K(this.A03, c51794Muy.A03) || !C14360o3.A0K(this.A01, c51794Muy.A01) || !C14360o3.A0K(this.A04, c51794Muy.A04) || !C14360o3.A0K(this.A02, c51794Muy.A02) || !C14360o3.A0K(this.A05, c51794Muy.A05) || !C14360o3.A0K(this.A06, c51794Muy.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A02, ((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
    }
}
