package X;

/* renamed from: X.6Nx, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Nx {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C6Nx(int i, int i2, Object obj) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i >= 0) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0O("startIndex should be >= 0, but was ", i));
        }
    }
}
