package X;

/* renamed from: X.Cn5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28773Cn5 implements C5WH {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C28773Cn5) && Float.compare(this.A00, ((C28773Cn5) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0Z(AbstractC111324zv.A00(3550), ".px)", this.A00);
    }

    public C28773Cn5(float f) {
        this.A00 = f;
    }

    @Override // X.C5WH
    public final float EqU(InterfaceC1128957x interfaceC1128957x, long j) {
        return this.A00;
    }
}
