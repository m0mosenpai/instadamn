package X;

/* renamed from: X.VuT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69733VuT {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C69733VuT) && this.A00 == ((C69733VuT) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0K("RenderSummary(createdAt=", ')', this.A00);
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }

    public C69733VuT(long j) {
        this.A00 = j;
    }
}
