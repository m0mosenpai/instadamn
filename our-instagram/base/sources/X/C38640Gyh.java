package X;

/* renamed from: X.Gyh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38640Gyh extends C0T6 {
    public final C9C4 A00;
    public final InterfaceC39571se A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final Integer A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38640Gyh) {
                C38640Gyh c38640Gyh = (C38640Gyh) obj;
                if (!C14360o3.A0K(this.A02, c38640Gyh.A02) || !C14360o3.A0K(this.A03, c38640Gyh.A03) || !C14360o3.A0K(this.A04, c38640Gyh.A04) || !C14360o3.A0K(this.A06, c38640Gyh.A06) || !C14360o3.A0K(this.A01, c38640Gyh.A01) || !C14360o3.A0K(this.A00, c38640Gyh.A00) || !C14360o3.A0K(this.A07, c38640Gyh.A07) || !C14360o3.A0K(this.A08, c38640Gyh.A08) || !C14360o3.A0K(this.A05, c38640Gyh.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC166997dE.A0I(this.A05);
    }

    public C38640Gyh(C9C4 c9c4, InterfaceC39571se interfaceC39571se, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
        this.A02 = bool;
        this.A03 = bool2;
        this.A04 = num;
        this.A06 = str;
        this.A01 = interfaceC39571se;
        this.A00 = c9c4;
        this.A07 = str2;
        this.A08 = num2;
        this.A05 = num3;
    }
}
