package X;

/* renamed from: X.4MT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MT extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XplatMqttConnectionConfig(connectionTimeoutSeconds=");
        sb.append(this.A00);
        sb.append(", keepAliveSeconds=");
        sb.append(this.A02);
        sb.append(", keepAliveBgSeconds=");
        sb.append(this.A01);
        sb.append(", keepAliveTimeoutSeconds=");
        sb.append(this.A03);
        sb.append(", publishTimeoutSeconds=");
        sb.append(this.A06);
        sb.append(", preemptivePublishTimeoutSeconds=");
        sb.append(this.A05);
        sb.append(", personalizationEnabled=");
        sb.append(this.A09);
        sb.append(AbstractC111324zv.A00(3363));
        sb.append(this.A08);
        sb.append(", qplEnabled=");
        sb.append(this.A07);
        sb.append(", numFailuresForFallback=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C4MT(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A06 = i5;
        this.A05 = i6;
        this.A09 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A04 = i7;
    }

    public C4MT() {
        this(10, 60, 60, 6, 10, 0, 0, false, false, true);
    }
}
