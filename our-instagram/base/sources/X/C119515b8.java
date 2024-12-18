package X;

/* renamed from: X.5b8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119515b8 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public final void A00(float f, float f2, float f3, float f4) {
        this.A01 = Math.max(f, this.A01);
        this.A03 = Math.max(f2, this.A03);
        this.A02 = Math.min(f3, this.A02);
        this.A00 = Math.min(f4, this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A17("MutableRect(", AbstractC224319vI.A00(this.A01), ", ", AbstractC224319vI.A00(this.A03), ", ", AbstractC224319vI.A00(this.A02), ", ", AbstractC224319vI.A00(this.A00), ')');
    }
}
