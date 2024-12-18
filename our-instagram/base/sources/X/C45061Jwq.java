package X;

/* renamed from: X.Jwq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45061Jwq extends C0T6 {
    public InterfaceC83713oG A00;
    public final int A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public C45061Jwq(InterfaceC83713oG interfaceC83713oG, Long l, String str, String str2, String str3, int i, boolean z, boolean z2) {
        C14360o3.A0B(str2, 3);
        this.A00 = interfaceC83713oG;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A03 = str3;
        this.A01 = i;
        this.A07 = z2;
        this.A02 = l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45061Jwq) {
                C45061Jwq c45061Jwq = (C45061Jwq) obj;
                if (!C14360o3.A0K(this.A00, c45061Jwq.A00) || !C14360o3.A0K(this.A05, c45061Jwq.A05) || !C14360o3.A0K(this.A04, c45061Jwq.A04) || this.A06 != c45061Jwq.A06 || !C14360o3.A0K(this.A03, c45061Jwq.A03) || this.A01 != c45061Jwq.A01 || this.A07 != c45061Jwq.A07 || !C14360o3.A0K(this.A02, c45061Jwq.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A07, (((AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0K(this.A04, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A05)) * 31)) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A01) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
