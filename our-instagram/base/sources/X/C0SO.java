package X;

/* renamed from: X.0SO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SO extends AbstractC02960Bu {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C0SO c0so = (C0SO) obj;
                if (this.A04 != c0so.A04 || this.A05 != c0so.A05 || this.A0D != c0so.A0D || this.A0C != c0so.A0C || this.A06 != c0so.A06 || this.A07 != c0so.A07 || this.A00 != c0so.A00 || this.A01 != c0so.A01 || this.A0B != c0so.A0B || this.A0A != c0so.A0A || this.A02 != c0so.A02 || this.A03 != c0so.A03 || this.A08 != c0so.A08 || this.A09 != c0so.A09) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        A04((C0SO) abstractC02960Bu);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C0SO c0so = (C0SO) abstractC02960Bu;
        C0SO c0so2 = (C0SO) abstractC02960Bu2;
        C0SO c0so3 = c0so2;
        if (c0so2 == null) {
            c0so3 = new Object();
        }
        if (c0so == null) {
            c0so3.A04(this);
            return c0so3;
        }
        c0so3.A04 = this.A04 - c0so.A04;
        c0so3.A05 = this.A05 - c0so.A05;
        c0so3.A0D = this.A0D - c0so.A0D;
        c0so3.A0C = this.A0C - c0so.A0C;
        c0so3.A06 = this.A06 - c0so.A06;
        c0so3.A07 = this.A07 - c0so.A07;
        c0so3.A00 = this.A00 - c0so.A00;
        c0so3.A01 = this.A01 - c0so.A01;
        c0so3.A0B = this.A0B - c0so.A0B;
        c0so3.A0A = this.A0A - c0so.A0A;
        c0so3.A02 = this.A02 - c0so.A02;
        c0so3.A03 = this.A03 - c0so.A03;
        c0so3.A08 = this.A08 - c0so.A08;
        c0so3.A09 = this.A09 - c0so.A09;
        return c0so3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C0SO c0so = (C0SO) abstractC02960Bu;
        C0SO c0so2 = (C0SO) abstractC02960Bu2;
        C0SO c0so3 = c0so2;
        if (c0so2 == null) {
            c0so3 = new Object();
        }
        if (c0so == null) {
            c0so3.A04(this);
            return c0so3;
        }
        c0so3.A04 = this.A04 + c0so.A04;
        c0so3.A05 = this.A05 + c0so.A05;
        c0so3.A0D = this.A0D + c0so.A0D;
        c0so3.A0C = this.A0C + c0so.A0C;
        c0so3.A06 = this.A06 + c0so.A06;
        c0so3.A07 = this.A07 + c0so.A07;
        c0so3.A00 = this.A00 + c0so.A00;
        c0so3.A01 = this.A01 + c0so.A01;
        c0so3.A0B = this.A0B + c0so.A0B;
        c0so3.A0A = this.A0A + c0so.A0A;
        c0so3.A02 = this.A02 + c0so.A02;
        c0so3.A03 = this.A03 + c0so.A03;
        c0so3.A08 = this.A08 + c0so.A08;
        c0so3.A09 = this.A09 + c0so.A09;
        return c0so3;
    }

    public final void A04(C0SO c0so) {
        this.A04 = c0so.A04;
        this.A05 = c0so.A05;
        this.A0D = c0so.A0D;
        this.A0C = c0so.A0C;
        this.A06 = c0so.A06;
        this.A07 = c0so.A07;
        this.A00 = c0so.A00;
        this.A01 = c0so.A01;
        this.A0B = c0so.A0B;
        this.A0A = c0so.A0A;
        this.A02 = c0so.A02;
        this.A03 = c0so.A03;
        this.A08 = c0so.A08;
        this.A09 = c0so.A09;
    }

    public final int hashCode() {
        int i = ((this.A04 * 31) + this.A05) * 31;
        long j = this.A0D;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A0C;
        int i3 = (((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A06) * 31) + this.A07) * 31) + this.A00) * 31) + this.A01) * 31;
        long j3 = this.A0B;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.A0A;
        return ((((((((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.A02) * 31) + this.A03) * 31) + this.A08) * 31) + this.A09;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProxygenMetrics{mqttFullPowerTimeS=");
        sb.append(this.A04);
        sb.append(", mqttLowPowerTimeS=");
        sb.append(this.A05);
        sb.append(", mqttTxBytes=");
        sb.append(this.A0D);
        sb.append(", mqttRxBytes=");
        sb.append(this.A0C);
        sb.append(", mqttRequestCount=");
        sb.append(this.A06);
        sb.append(", mqttWakeupCount=");
        sb.append(this.A07);
        sb.append(", ligerFullPowerTimeS=");
        sb.append(this.A00);
        sb.append(", ligerLowPowerTimeS=");
        sb.append(this.A01);
        sb.append(", ligerTxBytes=");
        sb.append(this.A0B);
        sb.append(", ligerRxBytes=");
        sb.append(this.A0A);
        sb.append(", ligerRequestCount=");
        sb.append(this.A02);
        sb.append(", ligerWakeupCount=");
        sb.append(this.A03);
        sb.append(", proxygenActiveRadioTimeS=");
        sb.append(this.A08);
        sb.append(", proxygenTailRadioTimeS=");
        sb.append(this.A09);
        sb.append('}');
        return sb.toString();
    }
}
