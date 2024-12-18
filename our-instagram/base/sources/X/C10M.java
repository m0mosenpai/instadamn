package X;

/* renamed from: X.10M, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C10M {
    public static final C20730zt A00 = new C20730zt("NO_VALUE");

    public static final AnonymousClass057 A00(Integer num, int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && num != C05F.A00) {
                    throw new IllegalArgumentException(AnonymousClass001.A0R("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", A3C.A00(num)));
                }
                int i3 = i2 + i;
                if (i3 < 0) {
                    i3 = Integer.MAX_VALUE;
                }
                return new AnonymousClass057(num, i, i3);
            }
            throw new IllegalArgumentException(AnonymousClass001.A0O("extraBufferCapacity cannot be negative, but was ", i2));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("replay cannot be negative, but was ", i));
    }
}
