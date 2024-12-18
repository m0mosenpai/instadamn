package X;

/* renamed from: X.0SK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SK extends AbstractC02960Bu {
    public double A00;
    public long A01;
    public long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0SK c0sk = (C0SK) obj;
            if (Double.compare(c0sk.A00, this.A00) != 0 || this.A01 != c0sk.A01 || this.A02 != c0sk.A02) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        A06((C0SK) abstractC02960Bu);
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
    public final X.C0SK A02(X.C0SK r5, X.C0SK r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L7
            X.0SK r6 = new X.0SK
            r6.<init>()
        L7:
            if (r5 != 0) goto Ld
            r6.A06(r4)
            return r6
        Ld:
            double r2 = r4.A00
            double r0 = r5.A00
            double r2 = r2 - r0
            r6.A00 = r2
            long r2 = r4.A01
            long r0 = r5.A01
            long r2 = r2 - r0
            r6.A01 = r2
            long r2 = r4.A02
            long r0 = r5.A02
            long r2 = r2 - r0
            r6.A02 = r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SK.A02(X.0SK, X.0SK):X.0SK");
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
    public final X.C0SK A03(X.C0SK r5, X.C0SK r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L7
            X.0SK r6 = new X.0SK
            r6.<init>()
        L7:
            if (r5 != 0) goto Ld
            r6.A06(r4)
            return r6
        Ld:
            double r2 = r5.A00
            double r0 = r4.A00
            double r2 = r2 + r0
            r6.A00 = r2
            long r2 = r5.A01
            long r0 = r4.A01
            long r2 = r2 + r0
            r6.A01 = r2
            long r2 = r5.A02
            long r0 = r4.A02
            long r2 = r2 + r0
            r6.A02 = r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SK.A03(X.0SK, X.0SK):X.0SK");
    }

    public final void A06(C0SK c0sk) {
        this.A00 = c0sk.A00;
        this.A01 = c0sk.A01;
        this.A02 = c0sk.A02;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A00);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long j = this.A01;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A02;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Consumption{powerMah=");
        sb.append(this.A00);
        sb.append(", activeTimeMs=");
        sb.append(this.A01);
        sb.append(", wakeUpTimeMs=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
