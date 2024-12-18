package X;

/* renamed from: X.BIh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25312BIh extends C0T6 implements InterfaceC66492zQ {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25312BIh) {
                C25312BIh c25312BIh = (C25312BIh) obj;
                if (this.A04 != c25312BIh.A04 || this.A02 != c25312BIh.A02 || this.A03 != c25312BIh.A03 || Float.compare(this.A00, c25312BIh.A00) != 0 || this.A01 != c25312BIh.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00((((AbstractC25225BEi.A08(this.A04) + this.A02) * 31) + this.A03) * 31, this.A00) + this.A01;
    }

    public C25312BIh(float f, int i, int i2, int i3, boolean z) {
        this.A04 = z;
        this.A02 = i;
        this.A03 = i2;
        this.A00 = f;
        this.A01 = i3;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
