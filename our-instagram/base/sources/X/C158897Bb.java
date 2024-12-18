package X;

/* renamed from: X.7Bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158897Bb extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C2EY A03;
    public final String A04;
    public final boolean A05;

    public C158897Bb(C2EY c2ey, String str, int i, int i2, int i3, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c2ey, 2);
        this.A04 = str;
        this.A03 = c2ey;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = z;
        this.A00 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158897Bb) {
                C158897Bb c158897Bb = (C158897Bb) obj;
                if (!C14360o3.A0K(this.A04, c158897Bb.A04) || this.A03 != c158897Bb.A03 || this.A01 != c158897Bb.A01 || this.A02 != c158897Bb.A02 || this.A05 != c158897Bb.A05 || this.A00 != c158897Bb.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A01) * 31) + this.A02) * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
