package androidx.compose.ui;

import X.AnonymousClass001;
import X.C25751BZq;
import X.C58J;
import X.C58N;

/* loaded from: classes5.dex */
public final class ZIndexElement extends C58N {
    public final float A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ZIndexElement) && Float.compare(this.A00, ((ZIndexElement) obj).A00) == 0);
    }

    @Override // X.C58N
    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0F("ZIndexElement(zIndex=", ')', this.A00);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.58J, X.BZq] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        float f = this.A00;
        ?? c58j = new C58J();
        c58j.A00 = f;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        ((C25751BZq) c58j).A00 = this.A00;
    }

    public ZIndexElement(float f) {
        this.A00 = f;
    }
}
