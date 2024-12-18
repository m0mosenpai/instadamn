package X;

/* renamed from: X.0YK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YK extends AbstractC02960Bu {
    public long A00;
    public long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0YK c0yk = (C0YK) obj;
            if (this.A01 != c0yk.A01 || this.A00 != c0yk.A00) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        C0YK c0yk = (C0YK) abstractC02960Bu;
        this.A01 = c0yk.A01;
        this.A00 = c0yk.A00;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        long j;
        C0YK c0yk = (C0YK) abstractC02960Bu;
        C0YK c0yk2 = (C0YK) abstractC02960Bu2;
        C0YK c0yk3 = c0yk2;
        if (c0yk2 == null) {
            c0yk3 = new Object();
        }
        if (c0yk == null) {
            c0yk3.A01 = this.A01;
            j = this.A00;
        } else {
            c0yk3.A01 = this.A01 - c0yk.A01;
            j = this.A00 - c0yk.A00;
        }
        c0yk3.A00 = j;
        return c0yk3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        long j;
        C0YK c0yk = (C0YK) abstractC02960Bu;
        C0YK c0yk2 = (C0YK) abstractC02960Bu2;
        C0YK c0yk3 = c0yk2;
        if (c0yk2 == null) {
            c0yk3 = new Object();
        }
        if (c0yk == null) {
            c0yk3.A01 = this.A01;
            j = this.A00;
        } else {
            c0yk3.A01 = this.A01 + c0yk.A01;
            j = this.A00 + c0yk.A00;
        }
        c0yk3.A00 = j;
        return c0yk3;
    }

    public final int hashCode() {
        long j = this.A01;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A00;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return AnonymousClass001.A0Y("CameraMetrics{cameraPreviewTimeMs=", ", cameraOpenTimeMs=", '}', this.A01, this.A00);
    }
}
