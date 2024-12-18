package X;

/* renamed from: X.0Yz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07070Yz extends AbstractC02960Bu {
    public int A00;
    public int A01;
    public long A02;
    public long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C07070Yz c07070Yz = (C07070Yz) obj;
                if (this.A01 != c07070Yz.A01 || this.A03 != c07070Yz.A03 || this.A00 != c07070Yz.A00 || this.A02 != c07070Yz.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        A04((C07070Yz) abstractC02960Bu);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C07070Yz c07070Yz = (C07070Yz) abstractC02960Bu;
        C07070Yz c07070Yz2 = (C07070Yz) abstractC02960Bu2;
        C07070Yz c07070Yz3 = c07070Yz2;
        if (c07070Yz2 == null) {
            c07070Yz3 = new Object();
        }
        if (c07070Yz == null) {
            c07070Yz3.A04(this);
            return c07070Yz3;
        }
        c07070Yz3.A01 = this.A01 - c07070Yz.A01;
        c07070Yz3.A03 = this.A03 - c07070Yz.A03;
        c07070Yz3.A00 = this.A00 - c07070Yz.A00;
        c07070Yz3.A02 = this.A02 - c07070Yz.A02;
        return c07070Yz3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C07070Yz c07070Yz = (C07070Yz) abstractC02960Bu;
        C07070Yz c07070Yz2 = (C07070Yz) abstractC02960Bu2;
        C07070Yz c07070Yz3 = c07070Yz2;
        if (c07070Yz2 == null) {
            c07070Yz3 = new Object();
        }
        if (c07070Yz == null) {
            c07070Yz3.A04(this);
            return c07070Yz3;
        }
        c07070Yz3.A01 = this.A01 + c07070Yz.A01;
        c07070Yz3.A03 = this.A03 + c07070Yz.A03;
        c07070Yz3.A00 = this.A00 + c07070Yz.A00;
        c07070Yz3.A02 = this.A02 + c07070Yz.A02;
        return c07070Yz3;
    }

    public final void A04(C07070Yz c07070Yz) {
        this.A01 = c07070Yz.A01;
        this.A03 = c07070Yz.A03;
        this.A00 = c07070Yz.A00;
        this.A02 = c07070Yz.A02;
    }

    public final int hashCode() {
        int i = this.A01 * 31;
        long j = this.A03;
        int i2 = (((i + ((int) (j ^ (j >>> 32)))) * 31) + this.A00) * 31;
        long j2 = this.A02;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BluetoothMetrics{bleScanCount=");
        sb.append(this.A01);
        sb.append(", bleScanDurationMs=");
        sb.append(this.A03);
        sb.append(", bleOpportunisticScanCount=");
        sb.append(this.A00);
        sb.append(", bleOpportunisticScanDurationMs=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
