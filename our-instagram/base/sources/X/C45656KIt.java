package X;

/* renamed from: X.KIt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45656KIt extends C4F4 {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45656KIt) && Float.compare(this.A00, ((C45656KIt) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C45656KIt(float f) {
        this.A00 = f;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
