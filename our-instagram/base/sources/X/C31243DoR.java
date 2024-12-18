package X;

/* renamed from: X.DoR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31243DoR extends C0T6 implements InterfaceC66492zQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31243DoR) {
                C31243DoR c31243DoR = (C31243DoR) obj;
                if (this.A02 != c31243DoR.A02 || this.A00 != c31243DoR.A00 || this.A04 != c31243DoR.A04 || this.A03 != c31243DoR.A03 || this.A01 != c31243DoR.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A04, ((this.A02 * 31) + this.A00) * 31)) + this.A01;
    }

    public C31243DoR(int i, int i2, int i3, boolean z, boolean z2) {
        this.A02 = i;
        this.A00 = i2;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
