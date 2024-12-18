package X;

/* renamed from: X.K2a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45272K2a extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45272K2a) {
                C45272K2a c45272K2a = (C45272K2a) obj;
                if (!C14360o3.A0K(this.A05, c45272K2a.A05) || !C14360o3.A0K(this.A03, c45272K2a.A03) || !C14360o3.A0K(this.A04, c45272K2a.A04) || this.A00 != c45272K2a.A00 || this.A01 != c45272K2a.A01 || this.A02 != c45272K2a.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0K(this.A04, (AbstractC166987dD.A0J(this.A05) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public C45272K2a(String str, String str2, String str3, int i, int i2, int i3) {
        AbstractC167017dG.A1Q(str, str3);
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
