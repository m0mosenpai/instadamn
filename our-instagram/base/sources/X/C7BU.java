package X;

/* renamed from: X.7BU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BU extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final int A01;
    public final C2EY A02;
    public final String A03;
    public final String A04;

    public C7BU(C2EY c2ey, String str, String str2, int i, int i2) {
        C14360o3.A0B(str2, 5);
        this.A04 = str;
        this.A02 = c2ey;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7BU) {
                C7BU c7bu = (C7BU) obj;
                if (!C14360o3.A0K(this.A04, c7bu.A04) || this.A02 != c7bu.A02 || this.A00 != c7bu.A00 || this.A01 != c7bu.A01 || !C14360o3.A0K(this.A03, c7bu.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31) + this.A03.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
