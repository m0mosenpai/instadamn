package X;

/* renamed from: X.2YU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YU {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C2YU(long j, Object obj) {
        this(obj, AbstractC78683fa.A00(j), (int) (j & 4294967295L));
    }

    public C2YU(Object obj, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i >= 0) {
            if (i2 >= 0) {
                return;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0O("height must be >= 0, but was: ", i2));
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("width must be >= 0, but was: ", i));
    }
}
