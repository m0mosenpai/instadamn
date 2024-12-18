package X;

/* loaded from: classes8.dex */
public final class K2B extends C0T6 implements InterfaceC66482zP, C7VC {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C31230DoD A03;
    public final CharSequence A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final C162297Or A08;

    public K2B(C31230DoD c31230DoD, CharSequence charSequence, int i, int i2, boolean z, boolean z2) {
        C14360o3.A0B(charSequence, 2);
        this.A03 = c31230DoD;
        this.A04 = charSequence;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = i;
        this.A00 = i2;
        long j = c31230DoD.A01;
        this.A02 = j;
        this.A08 = (C162297Or) c31230DoD.A03;
        this.A05 = String.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2B) {
                K2B k2b = (K2B) obj;
                if (!C14360o3.A0K(this.A03, k2b.A03) || !C14360o3.A0K(this.A04, k2b.A04) || this.A06 != k2b.A06 || this.A07 != k2b.A07 || this.A01 != k2b.A01 || this.A00 != k2b.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C7VC
    public final long C8f() {
        return this.A02;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    @Override // X.C7VC
    public final int getType() {
        return 6;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A03)))) + this.A01) * 31) + this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
