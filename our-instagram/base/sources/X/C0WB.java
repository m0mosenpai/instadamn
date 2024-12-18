package X;

/* renamed from: X.0WB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0WB extends AbstractC02960Bu {
    public double A00;
    public double A01;
    public double A02;
    public double A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0WB c0wb = (C0WB) obj;
            if (Double.compare(c0wb.A02, this.A02) != 0 || Double.compare(c0wb.A03, this.A03) != 0 || Double.compare(c0wb.A00, this.A00) != 0 || Double.compare(c0wb.A01, this.A01) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        A06((C0WB) abstractC02960Bu);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0WB A02(X.C0WB r5, X.C0WB r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L7
            X.0WB r6 = new X.0WB
            r6.<init>()
        L7:
            if (r5 != 0) goto Ld
            r6.A06(r4)
            return r6
        Ld:
            double r2 = r4.A02
            double r0 = r5.A02
            double r2 = r2 - r0
            r6.A02 = r2
            double r2 = r4.A03
            double r0 = r5.A03
            double r2 = r2 - r0
            r6.A03 = r2
            double r2 = r4.A00
            double r0 = r5.A00
            double r2 = r2 - r0
            r6.A00 = r2
            double r2 = r4.A01
            double r0 = r5.A01
            double r2 = r2 - r0
            r6.A01 = r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WB.A02(X.0WB, X.0WB):X.0WB");
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0WB A03(X.C0WB r5, X.C0WB r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L7
            X.0WB r6 = new X.0WB
            r6.<init>()
        L7:
            if (r5 != 0) goto Ld
            r6.A06(r4)
            return r6
        Ld:
            double r2 = r4.A02
            double r0 = r5.A02
            double r2 = r2 + r0
            r6.A02 = r2
            double r2 = r4.A03
            double r0 = r5.A03
            double r2 = r2 + r0
            r6.A03 = r2
            double r2 = r4.A00
            double r0 = r5.A00
            double r2 = r2 + r0
            r6.A00 = r2
            double r2 = r4.A01
            double r0 = r5.A01
            double r2 = r2 + r0
            r6.A01 = r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WB.A03(X.0WB, X.0WB):X.0WB");
    }

    public final void A06(C0WB c0wb) {
        this.A03 = c0wb.A03;
        this.A02 = c0wb.A02;
        this.A01 = c0wb.A01;
        this.A00 = c0wb.A00;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A02);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.A03);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.A00);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.A01);
        return (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CpuMetrics{userTimeS=");
        sb.append(this.A03);
        sb.append(", systemTimeS=");
        sb.append(this.A02);
        sb.append(", childUserTimeS=");
        sb.append(this.A01);
        sb.append(", childSystemTimeS=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
