package X;

/* renamed from: X.0Ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06130Ud extends AbstractC02960Bu {
    public long A00;
    public long A01;
    public long A02;
    public long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C06130Ud c06130Ud = (C06130Ud) obj;
            if (this.A01 != c06130Ud.A01 || this.A00 != c06130Ud.A00 || this.A03 != c06130Ud.A03 || this.A02 != c06130Ud.A02) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        A04((C06130Ud) abstractC02960Bu);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C06130Ud c06130Ud = (C06130Ud) abstractC02960Bu;
        C06130Ud c06130Ud2 = (C06130Ud) abstractC02960Bu2;
        C06130Ud c06130Ud3 = c06130Ud2;
        if (c06130Ud2 == null) {
            c06130Ud3 = new Object();
        }
        if (c06130Ud == null) {
            c06130Ud3.A04(this);
            return c06130Ud3;
        }
        c06130Ud3.A01 = this.A01 - c06130Ud.A01;
        c06130Ud3.A00 = this.A00 - c06130Ud.A00;
        c06130Ud3.A03 = this.A03 - c06130Ud.A03;
        c06130Ud3.A02 = this.A02 - c06130Ud.A02;
        return c06130Ud3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C06130Ud c06130Ud = (C06130Ud) abstractC02960Bu;
        C06130Ud c06130Ud2 = (C06130Ud) abstractC02960Bu2;
        C06130Ud c06130Ud3 = c06130Ud2;
        if (c06130Ud2 == null) {
            c06130Ud3 = new Object();
        }
        if (c06130Ud == null) {
            c06130Ud3.A04(this);
            return c06130Ud3;
        }
        c06130Ud3.A01 = this.A01 + c06130Ud.A01;
        c06130Ud3.A00 = this.A00 + c06130Ud.A00;
        c06130Ud3.A03 = this.A03 + c06130Ud.A03;
        c06130Ud3.A02 = this.A02 + c06130Ud.A02;
        return c06130Ud3;
    }

    public final void A04(C06130Ud c06130Ud) {
        this.A00 = c06130Ud.A00;
        this.A01 = c06130Ud.A01;
        this.A02 = c06130Ud.A02;
        this.A03 = c06130Ud.A03;
    }

    public final int hashCode() {
        long j = this.A01;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A00;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A03;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.A02;
        return i3 + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkMetrics{mobileBytesTx=");
        sb.append(this.A01);
        sb.append(", mobileBytesRx=");
        sb.append(this.A00);
        sb.append(", wifiBytesTx=");
        sb.append(this.A03);
        sb.append(", wifiBytesRx=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
