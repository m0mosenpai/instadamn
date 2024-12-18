package X;

/* renamed from: X.0Va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06340Va extends AbstractC02960Bu {
    public float A00;
    public long A01;
    public long A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C06340Va c06340Va = (C06340Va) obj;
            return this.A00 == c06340Va.A00 && this.A01 == c06340Va.A01 && this.A02 == c06340Va.A02;
        }
        return false;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        C06340Va c06340Va = (C06340Va) abstractC02960Bu;
        this.A00 = c06340Va.A00;
        this.A01 = c06340Va.A01;
        this.A02 = c06340Va.A02;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        long j;
        C06340Va c06340Va = (C06340Va) abstractC02960Bu;
        C06340Va c06340Va2 = (C06340Va) abstractC02960Bu2;
        C06340Va c06340Va3 = c06340Va2;
        if (c06340Va2 == null) {
            c06340Va3 = new Object();
        }
        if (c06340Va == null) {
            c06340Va3.A00 = this.A00;
            c06340Va3.A01 = this.A01;
            j = this.A02;
        } else {
            c06340Va3.A00 = this.A00 - c06340Va.A00;
            c06340Va3.A01 = this.A01 - c06340Va.A01;
            j = this.A02 - c06340Va.A02;
        }
        c06340Va3.A02 = j;
        return c06340Va3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        long j;
        C06340Va c06340Va = (C06340Va) abstractC02960Bu;
        C06340Va c06340Va2 = (C06340Va) abstractC02960Bu2;
        C06340Va c06340Va3 = c06340Va2;
        if (c06340Va2 == null) {
            c06340Va3 = new Object();
        }
        if (c06340Va == null) {
            c06340Va3.A00 = this.A00;
            c06340Va3.A01 = this.A01;
            j = this.A02;
        } else {
            c06340Va3.A00 = this.A00 + c06340Va.A00;
            c06340Va3.A01 = this.A01 + c06340Va.A01;
            j = this.A02 + c06340Va.A02;
        }
        c06340Va3.A02 = j;
        return c06340Va3;
    }

    public final int hashCode() {
        int i;
        float f = this.A00;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        long j = this.A01;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A02;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceBatteryMetrics{batteryLevelPct=");
        sb.append(this.A00);
        sb.append(", batteryRealtimeMs=");
        sb.append(this.A01);
        sb.append(", chargingRealtimeMs=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
