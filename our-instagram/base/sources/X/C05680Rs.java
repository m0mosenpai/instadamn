package X;

/* renamed from: X.0Rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05680Rs extends AbstractC02960Bu {
    public long A00;
    public long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C05680Rs c05680Rs = (C05680Rs) obj;
            if (this.A01 != c05680Rs.A01 || this.A00 != c05680Rs.A00) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        C05680Rs c05680Rs = (C05680Rs) abstractC02960Bu;
        this.A01 = c05680Rs.A01;
        this.A00 = c05680Rs.A00;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        long j;
        C05680Rs c05680Rs = (C05680Rs) abstractC02960Bu;
        C05680Rs c05680Rs2 = (C05680Rs) abstractC02960Bu2;
        C05680Rs c05680Rs3 = c05680Rs2;
        if (c05680Rs2 == null) {
            c05680Rs3 = new Object();
        }
        if (c05680Rs == null) {
            c05680Rs3.A01 = this.A01;
            j = this.A00;
        } else {
            c05680Rs3.A01 = this.A01 - c05680Rs.A01;
            j = this.A00 - c05680Rs.A00;
        }
        c05680Rs3.A00 = j;
        return c05680Rs3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        long j;
        C05680Rs c05680Rs = (C05680Rs) abstractC02960Bu;
        C05680Rs c05680Rs2 = (C05680Rs) abstractC02960Bu2;
        C05680Rs c05680Rs3 = c05680Rs2;
        if (c05680Rs2 == null) {
            c05680Rs3 = new Object();
        }
        if (c05680Rs == null) {
            c05680Rs3.A01 = this.A01;
            j = this.A00;
        } else {
            c05680Rs3.A01 = this.A01 + c05680Rs.A01;
            j = this.A00 + c05680Rs.A00;
        }
        c05680Rs3.A00 = j;
        return c05680Rs3;
    }

    public final int hashCode() {
        long j = this.A01;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A00;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return AnonymousClass001.A0Y("TimeMetrics{uptimeMs=", ", realtimeMs=", '}', this.A01, this.A00);
    }
}
