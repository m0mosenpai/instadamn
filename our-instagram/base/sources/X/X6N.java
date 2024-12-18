package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes11.dex */
public final class X6N extends C3T7 {
    public final C3T3 A00;
    public final C73803Sk A01;

    @Override // X.C3T7, kotlinx.serialization.encoding.Decoder
    public final byte ANt() {
        int i;
        int i2;
        C3T3 c3t3 = this.A00;
        String A0A = c3t3.A0A();
        try {
            C14360o3.A0B(A0A, 0);
            C192428fk A00 = AbstractC69995VzF.A00(A0A);
            if (A00 != null && ((i2 = (i = A00.A00) ^ Integer.MIN_VALUE) == -2147483393 || i2 < -2147483393)) {
                return (byte) i;
            }
            AbstractC003100w.A0l(A0A);
            throw C00O.createAndThrow();
        } catch (IllegalArgumentException unused) {
            c3t3.A0F(AnonymousClass001.A0v("Failed to parse type '", "UByte", "' for input '", A0A, '\''), "", c3t3.A00);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C3T8
    public final int ANz(SerialDescriptor serialDescriptor) {
        throw new IllegalStateException(MSV.A00(595));
    }

    @Override // X.C3T7, kotlinx.serialization.encoding.Decoder
    public final int AO8() {
        C3T3 c3t3 = this.A00;
        String A0A = c3t3.A0A();
        try {
            C14360o3.A0B(A0A, 0);
            C192428fk A00 = AbstractC69995VzF.A00(A0A);
            if (A00 != null) {
                return A00.A00;
            }
            AbstractC003100w.A0l(A0A);
            throw C00O.createAndThrow();
        } catch (IllegalArgumentException unused) {
            c3t3.A0F(AnonymousClass001.A0v("Failed to parse type '", "UInt", "' for input '", A0A, '\''), "", c3t3.A00);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C3T7, kotlinx.serialization.encoding.Decoder
    public final long AOB() {
        C3T3 c3t3 = this.A00;
        String A0A = c3t3.A0A();
        try {
            C14360o3.A0B(A0A, 0);
            C192358fd A01 = AbstractC69995VzF.A01(A0A);
            if (A01 != null) {
                return A01.A00;
            }
            AbstractC003100w.A0l(A0A);
            throw C00O.createAndThrow();
        } catch (IllegalArgumentException unused) {
            c3t3.A0F(AnonymousClass001.A0v("Failed to parse type '", "ULong", "' for input '", A0A, '\''), "", c3t3.A00);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C3T7, kotlinx.serialization.encoding.Decoder
    public final short AOH() {
        int i;
        int i2;
        C3T3 c3t3 = this.A00;
        String A0A = c3t3.A0A();
        try {
            C14360o3.A0B(A0A, 0);
            C192428fk A00 = AbstractC69995VzF.A00(A0A);
            if (A00 != null && ((i2 = (i = A00.A00) ^ Integer.MIN_VALUE) == -2147418113 || i2 < -2147418113)) {
                return (short) i;
            }
            AbstractC003100w.A0l(A0A);
            throw C00O.createAndThrow();
        } catch (IllegalArgumentException unused) {
            c3t3.A0F(AnonymousClass001.A0v("Failed to parse type '", "UShort", "' for input '", A0A, '\''), "", c3t3.A00);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C3T8, kotlinx.serialization.encoding.Decoder
    public final C73803Sk BtX() {
        return this.A01;
    }

    public X6N(AbstractC73763Sg abstractC73763Sg, C3T3 c3t3) {
        AbstractC167017dG.A1P(c3t3, abstractC73763Sg);
        this.A00 = c3t3;
        this.A01 = abstractC73763Sg.A02;
    }
}
