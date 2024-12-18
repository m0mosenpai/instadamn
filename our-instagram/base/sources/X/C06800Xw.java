package X;

/* renamed from: X.0Xw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06800Xw extends AbstractC02960Bu {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;

    public final void A04(C06800Xw c06800Xw) {
        C14360o3.A0B(c06800Xw, 0);
        this.A03 = c06800Xw.A03;
        this.A05 = c06800Xw.A05;
        this.A09 = c06800Xw.A09;
        this.A0A = c06800Xw.A0A;
        this.A07 = c06800Xw.A07;
        this.A08 = c06800Xw.A08;
        this.A04 = c06800Xw.A04;
        this.A06 = c06800Xw.A06;
        this.A00 = c06800Xw.A00;
        this.A02 = c06800Xw.A02;
        this.A01 = c06800Xw.A01;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C06800Xw c06800Xw = (C06800Xw) obj;
            if (this.A03 != c06800Xw.A03 || this.A05 != c06800Xw.A05 || this.A09 != c06800Xw.A09 || this.A0A != c06800Xw.A0A || this.A07 != c06800Xw.A07 || this.A08 != c06800Xw.A08 || this.A04 != c06800Xw.A04 || this.A06 != c06800Xw.A06 || this.A00 != c06800Xw.A00 || this.A02 != c06800Xw.A02 || this.A01 != c06800Xw.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        A04((C06800Xw) abstractC02960Bu);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C06800Xw c06800Xw = (C06800Xw) abstractC02960Bu;
        C06800Xw c06800Xw2 = (C06800Xw) abstractC02960Bu2;
        C06800Xw c06800Xw3 = c06800Xw2;
        if (c06800Xw2 == null) {
            c06800Xw3 = new Object();
        }
        if (c06800Xw == null) {
            c06800Xw3.A04(this);
            return c06800Xw3;
        }
        c06800Xw3.A03 = this.A03 - c06800Xw.A03;
        c06800Xw3.A05 = this.A05 - c06800Xw.A05;
        c06800Xw3.A09 = this.A09 - c06800Xw.A09;
        c06800Xw3.A0A = this.A0A - c06800Xw.A0A;
        c06800Xw3.A07 = this.A07 - c06800Xw.A07;
        c06800Xw3.A08 = this.A08 - c06800Xw.A08;
        c06800Xw3.A04 = this.A04 - c06800Xw.A04;
        c06800Xw3.A06 = this.A06 - c06800Xw.A06;
        c06800Xw3.A00 = this.A00 - c06800Xw.A00;
        c06800Xw3.A02 = this.A02 - c06800Xw.A02;
        c06800Xw3.A01 = this.A01 - c06800Xw.A01;
        return c06800Xw3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C06800Xw c06800Xw = (C06800Xw) abstractC02960Bu;
        C06800Xw c06800Xw2 = (C06800Xw) abstractC02960Bu2;
        C06800Xw c06800Xw3 = c06800Xw2;
        if (c06800Xw2 == null) {
            c06800Xw3 = new Object();
        }
        if (c06800Xw == null) {
            c06800Xw3.A04(this);
            return c06800Xw3;
        }
        c06800Xw3.A03 = this.A03 + c06800Xw.A03;
        c06800Xw3.A05 = this.A05 + c06800Xw.A05;
        c06800Xw3.A09 = this.A09 + c06800Xw.A09;
        c06800Xw3.A0A = this.A0A + c06800Xw.A0A;
        c06800Xw3.A07 = this.A07 + c06800Xw.A07;
        c06800Xw3.A08 = this.A08 + c06800Xw.A08;
        c06800Xw3.A04 = this.A04 + c06800Xw.A04;
        c06800Xw3.A06 = this.A06 + c06800Xw.A06;
        c06800Xw3.A00 = this.A00 + c06800Xw.A00;
        c06800Xw3.A02 = this.A02 + c06800Xw.A02;
        c06800Xw3.A01 = this.A01 + c06800Xw.A01;
        return c06800Xw3;
    }

    public final int hashCode() {
        long j = this.A03;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A05;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A09;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.A0A;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.A07;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.A08;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.A04;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.A06;
        int i8 = this.A00;
        int i9 = (((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (i8 ^ (i8 >>> 32))) * 31;
        int i10 = this.A02;
        int i11 = (i9 + (i10 ^ (i10 >>> 32))) * 31;
        int i12 = this.A01;
        return i11 + (i12 ^ (i12 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChatdMetrics{connectedCount=");
        sb.append(this.A03);
        sb.append(", disconnectedCount=");
        sb.append(this.A05);
        sb.append(", sendBytes=");
        sb.append(this.A09);
        sb.append(", sendCount=");
        sb.append(this.A0A);
        sb.append(", receieveBytes=");
        sb.append(this.A07);
        sb.append(", receiveCount=");
        sb.append(this.A08);
        sb.append(", connectedDuration=");
        sb.append(this.A04);
        sb.append(", misfiredEventCount=");
        sb.append(this.A06);
        sb.append(", chatdActiveRadioTimeS=");
        sb.append(this.A00);
        sb.append(", chatdTailRadioTimeS=");
        sb.append(this.A02);
        sb.append(", chatdRadioWakeupCount=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
