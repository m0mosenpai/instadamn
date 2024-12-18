package X;

/* renamed from: X.Gyf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38638Gyf extends C0T6 {
    public final float A00;
    public final long A01;
    public final InterfaceC82443m8 A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C38638Gyf(InterfaceC82443m8 interfaceC82443m8, Integer num, String str, String str2, String str3, String str4, float f, long j) {
        C14360o3.A0B(str2, 2);
        this.A06 = str;
        this.A04 = str2;
        this.A00 = f;
        this.A03 = num;
        this.A01 = j;
        this.A07 = str3;
        this.A02 = interfaceC82443m8;
        this.A05 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38638Gyf) {
                C38638Gyf c38638Gyf = (C38638Gyf) obj;
                if (!C14360o3.A0K(this.A06, c38638Gyf.A06) || !C14360o3.A0K(this.A04, c38638Gyf.A04) || Float.compare(this.A00, c38638Gyf.A00) != 0 || this.A03 != c38638Gyf.A03 || this.A01 != c38638Gyf.A01 || !C14360o3.A0K(this.A07, c38638Gyf.A07) || !C14360o3.A0K(this.A02, c38638Gyf.A02) || !C14360o3.A0K(this.A05, c38638Gyf.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A00 = AbstractC166997dE.A00(AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A06)), this.A00);
        Integer num = this.A03;
        return ((AbstractC166997dE.A0K(this.A07, AbstractC25236BEt.A01(this.A01, AbstractC167017dG.A0L(num, AbstractC40902IAa.A00(num), A00))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A05);
    }
}
