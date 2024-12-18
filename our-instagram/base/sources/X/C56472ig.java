package X;

/* renamed from: X.2ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56472ig {
    public final float A00;
    public final float A01;
    public final float A02;

    public C56472ig(float f, float f2) {
        if (f < f2) {
            this.A00 = f;
            float f3 = f2 - f;
            this.A02 = f3 / 511.0f;
            this.A01 = f3 / 65535.0f;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0a("Incorrect scale! ", ", ", f, f2));
    }
}
