package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.13B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13B extends C13C {
    public final /* synthetic */ AtomicReferenceArray A00;

    @Override // X.C13C
    public final int A04() {
        return C13F.A01;
    }

    @Override // X.C13C
    public final void A06(Throwable th, C12W c12w, int i) {
        this.A00.set(i, C13F.A03);
        A05();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SemaphoreSegment[id=");
        sb.append(super.A00);
        sb.append(", hashCode=");
        sb.append(hashCode());
        sb.append(']');
        return sb.toString();
    }

    public C13B(C13B c13b, int i, long j) {
        super(c13b, i, j);
        this.A00 = new AtomicReferenceArray(C13F.A01);
    }
}
