package X;

/* renamed from: X.6HZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HZ extends C0T6 {
    public static final C6HZ A04 = new C6HZ(new C1333560c(0.0f, 8.0f, 12.0f, 0.0f), 0.0f, false, true);
    public final float A00;
    public final InterfaceC1333460b A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6HZ) {
                C6HZ c6hz = (C6HZ) obj;
                if (this.A03 != c6hz.A03 || this.A02 != c6hz.A02 || !C14360o3.A0K(this.A01, c6hz.A01) || !C119145aW.A01(this.A00, c6hz.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        return ((((i2 + i3) * 31) + this.A01.hashCode()) * 31) + Float.floatToIntBits(this.A00);
    }

    public C6HZ(InterfaceC1333460b interfaceC1333460b, float f, boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = interfaceC1333460b;
        this.A00 = f;
    }
}
