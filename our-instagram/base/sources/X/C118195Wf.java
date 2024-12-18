package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.5Wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118195Wf {
    public static final InterfaceC118245Wl A00;
    public static final InterfaceC118245Wl A01;
    public static final InterfaceC118245Wl A02;
    public static final InterfaceC118225Wj A03;
    public static final InterfaceC118225Wj A04;
    public static final InterfaceC118225Wj A05;
    public static final Alignment A06;
    public static final Alignment A07;
    public static final Alignment A08;
    public static final Alignment A09;
    public static final Alignment A0A;
    public static final Alignment A0B;
    public static final Alignment A0C;
    public static final Alignment A0D;
    public static final Alignment A0E;
    public static final /* synthetic */ C118195Wf A0F = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Wf, java.lang.Object] */
    static {
        final float f = -1.0f;
        A0E = new Alignment(f, f) { // from class: X.5Wg
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C118205Wg) {
                        C118205Wg c118205Wg = (C118205Wg) obj;
                        if (Float.compare(this.A00, c118205Wg.A00) != 0 || Float.compare(this.A01, c118205Wg.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return AnonymousClass001.A0U("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            @Override // androidx.compose.ui.Alignment
            public final long AB9(AnonymousClass583 anonymousClass583, long j, long j2) {
                float f2;
                float f3 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float A002 = (C119055aN.A00(j2) - C119055aN.A00(j)) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f2 = this.A00;
                } else {
                    f2 = (-1.0f) * this.A00;
                }
                return AbstractC113765Bo.A00(Math.round(f3 * (f2 + 1.0f)), Math.round(A002 * (1.0f + this.A01)));
            }

            {
                this.A00 = f;
                this.A01 = f;
            }
        };
        final float f2 = 0.0f;
        A0C = new Alignment(f2, f) { // from class: X.5Wg
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C118205Wg) {
                        C118205Wg c118205Wg = (C118205Wg) obj;
                        if (Float.compare(this.A00, c118205Wg.A00) != 0 || Float.compare(this.A01, c118205Wg.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return AnonymousClass001.A0U("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            @Override // androidx.compose.ui.Alignment
            public final long AB9(AnonymousClass583 anonymousClass583, long j, long j2) {
                float f22;
                float f3 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float A002 = (C119055aN.A00(j2) - C119055aN.A00(j)) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f22 = this.A00;
                } else {
                    f22 = (-1.0f) * this.A00;
                }
                return AbstractC113765Bo.A00(Math.round(f3 * (f22 + 1.0f)), Math.round(A002 * (1.0f + this.A01)));
            }

            {
                this.A00 = f2;
                this.A01 = f;
            }
        };
        final float f3 = 1.0f;
        A0D = new Alignment(f3, f) { // from class: X.5Wg
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C118205Wg) {
                        C118205Wg c118205Wg = (C118205Wg) obj;
                        if (Float.compare(this.A00, c118205Wg.A00) != 0 || Float.compare(this.A01, c118205Wg.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return AnonymousClass001.A0U("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            @Override // androidx.compose.ui.Alignment
            public final long AB9(AnonymousClass583 anonymousClass583, long j, long j2) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float A002 = (C119055aN.A00(j2) - C119055aN.A00(j)) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f22 = this.A00;
                } else {
                    f22 = (-1.0f) * this.A00;
                }
                return AbstractC113765Bo.A00(Math.round(f32 * (f22 + 1.0f)), Math.round(A002 * (1.0f + this.A01)));
            }

            {
                this.A00 = f3;
                this.A01 = f;
            }
        };
        A0B = new Alignment(f, f2) { // from class: X.5Wg
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C118205Wg) {
                        C118205Wg c118205Wg = (C118205Wg) obj;
                        if (Float.compare(this.A00, c118205Wg.A00) != 0 || Float.compare(this.A01, c118205Wg.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return AnonymousClass001.A0U("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            @Override // androidx.compose.ui.Alignment
            public final long AB9(AnonymousClass583 anonymousClass583, long j, long j2) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float A002 = (C119055aN.A00(j2) - C119055aN.A00(j)) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f22 = this.A00;
                } else {
                    f22 = (-1.0f) * this.A00;
                }
                return AbstractC113765Bo.A00(Math.round(f32 * (f22 + 1.0f)), Math.round(A002 * (1.0f + this.A01)));
            }

            {
                this.A00 = f;
                this.A01 = f2;
            }
        };
        A09 = new Alignment(f2, f2) { // from class: X.5Wg
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C118205Wg) {
                        C118205Wg c118205Wg = (C118205Wg) obj;
                        if (Float.compare(this.A00, c118205Wg.A00) != 0 || Float.compare(this.A01, c118205Wg.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return AnonymousClass001.A0U("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            @Override // androidx.compose.ui.Alignment
            public final long AB9(AnonymousClass583 anonymousClass583, long j, long j2) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float A002 = (C119055aN.A00(j2) - C119055aN.A00(j)) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f22 = this.A00;
                } else {
                    f22 = (-1.0f) * this.A00;
                }
                return AbstractC113765Bo.A00(Math.round(f32 * (f22 + 1.0f)), Math.round(A002 * (1.0f + this.A01)));
            }

            {
                this.A00 = f2;
                this.A01 = f2;
            }
        };
        A0A = new Alignment(f3, f2) { // from class: X.5Wg
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C118205Wg) {
                        C118205Wg c118205Wg = (C118205Wg) obj;
                        if (Float.compare(this.A00, c118205Wg.A00) != 0 || Float.compare(this.A01, c118205Wg.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return AnonymousClass001.A0U("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            @Override // androidx.compose.ui.Alignment
            public final long AB9(AnonymousClass583 anonymousClass583, long j, long j2) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float A002 = (C119055aN.A00(j2) - C119055aN.A00(j)) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f22 = this.A00;
                } else {
                    f22 = (-1.0f) * this.A00;
                }
                return AbstractC113765Bo.A00(Math.round(f32 * (f22 + 1.0f)), Math.round(A002 * (1.0f + this.A01)));
            }

            {
                this.A00 = f3;
                this.A01 = f2;
            }
        };
        A08 = new Alignment(f, f3) { // from class: X.5Wg
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C118205Wg) {
                        C118205Wg c118205Wg = (C118205Wg) obj;
                        if (Float.compare(this.A00, c118205Wg.A00) != 0 || Float.compare(this.A01, c118205Wg.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return AnonymousClass001.A0U("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            @Override // androidx.compose.ui.Alignment
            public final long AB9(AnonymousClass583 anonymousClass583, long j, long j2) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float A002 = (C119055aN.A00(j2) - C119055aN.A00(j)) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f22 = this.A00;
                } else {
                    f22 = (-1.0f) * this.A00;
                }
                return AbstractC113765Bo.A00(Math.round(f32 * (f22 + 1.0f)), Math.round(A002 * (1.0f + this.A01)));
            }

            {
                this.A00 = f;
                this.A01 = f3;
            }
        };
        A06 = new Alignment(f2, f3) { // from class: X.5Wg
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C118205Wg) {
                        C118205Wg c118205Wg = (C118205Wg) obj;
                        if (Float.compare(this.A00, c118205Wg.A00) != 0 || Float.compare(this.A01, c118205Wg.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return AnonymousClass001.A0U("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            @Override // androidx.compose.ui.Alignment
            public final long AB9(AnonymousClass583 anonymousClass583, long j, long j2) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float A002 = (C119055aN.A00(j2) - C119055aN.A00(j)) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f22 = this.A00;
                } else {
                    f22 = (-1.0f) * this.A00;
                }
                return AbstractC113765Bo.A00(Math.round(f32 * (f22 + 1.0f)), Math.round(A002 * (1.0f + this.A01)));
            }

            {
                this.A00 = f2;
                this.A01 = f3;
            }
        };
        A07 = new Alignment(f3, f3) { // from class: X.5Wg
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C118205Wg) {
                        C118205Wg c118205Wg = (C118205Wg) obj;
                        if (Float.compare(this.A00, c118205Wg.A00) != 0 || Float.compare(this.A01, c118205Wg.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return AnonymousClass001.A0U("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            @Override // androidx.compose.ui.Alignment
            public final long AB9(AnonymousClass583 anonymousClass583, long j, long j2) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float A002 = (C119055aN.A00(j2) - C119055aN.A00(j)) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f22 = this.A00;
                } else {
                    f22 = (-1.0f) * this.A00;
                }
                return AbstractC113765Bo.A00(Math.round(f32 * (f22 + 1.0f)), Math.round(A002 * (1.0f + this.A01)));
            }

            {
                this.A00 = f3;
                this.A01 = f3;
            }
        };
        A05 = new InterfaceC118225Wj(f) { // from class: X.5Wi
            public final float A00;

            @Override // X.InterfaceC118225Wj
            public final int AB4(int i, int i2) {
                return Math.round(((i2 - i) / 2.0f) * (1.0f + this.A00));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C118215Wi) && Float.compare(this.A00, ((C118215Wi) obj).A00) == 0);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.A00);
            }

            public final String toString() {
                return AnonymousClass001.A0F("Vertical(bias=", ')', this.A00);
            }

            {
                this.A00 = f;
            }
        };
        A04 = new InterfaceC118225Wj(f2) { // from class: X.5Wi
            public final float A00;

            @Override // X.InterfaceC118225Wj
            public final int AB4(int i, int i2) {
                return Math.round(((i2 - i) / 2.0f) * (1.0f + this.A00));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C118215Wi) && Float.compare(this.A00, ((C118215Wi) obj).A00) == 0);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.A00);
            }

            public final String toString() {
                return AnonymousClass001.A0F("Vertical(bias=", ')', this.A00);
            }

            {
                this.A00 = f2;
            }
        };
        A03 = new InterfaceC118225Wj(f3) { // from class: X.5Wi
            public final float A00;

            @Override // X.InterfaceC118225Wj
            public final int AB4(int i, int i2) {
                return Math.round(((i2 - i) / 2.0f) * (1.0f + this.A00));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C118215Wi) && Float.compare(this.A00, ((C118215Wi) obj).A00) == 0);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.A00);
            }

            public final String toString() {
                return AnonymousClass001.A0F("Vertical(bias=", ')', this.A00);
            }

            {
                this.A00 = f3;
            }
        };
        A02 = new InterfaceC118245Wl(f) { // from class: X.5Wk
            public final float A00;

            @Override // X.InterfaceC118245Wl
            public final int AB8(AnonymousClass583 anonymousClass583, int i, int i2) {
                float f4;
                float f5 = (i2 - i) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f4 = this.A00;
                } else {
                    f4 = (-1.0f) * this.A00;
                }
                return Math.round(f5 * (1.0f + f4));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C118235Wk) && Float.compare(this.A00, ((C118235Wk) obj).A00) == 0);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.A00);
            }

            public final String toString() {
                return AnonymousClass001.A0F("Horizontal(bias=", ')', this.A00);
            }

            {
                this.A00 = f;
            }
        };
        A00 = new InterfaceC118245Wl(f2) { // from class: X.5Wk
            public final float A00;

            @Override // X.InterfaceC118245Wl
            public final int AB8(AnonymousClass583 anonymousClass583, int i, int i2) {
                float f4;
                float f5 = (i2 - i) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f4 = this.A00;
                } else {
                    f4 = (-1.0f) * this.A00;
                }
                return Math.round(f5 * (1.0f + f4));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C118235Wk) && Float.compare(this.A00, ((C118235Wk) obj).A00) == 0);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.A00);
            }

            public final String toString() {
                return AnonymousClass001.A0F("Horizontal(bias=", ')', this.A00);
            }

            {
                this.A00 = f2;
            }
        };
        A01 = new InterfaceC118245Wl(f3) { // from class: X.5Wk
            public final float A00;

            @Override // X.InterfaceC118245Wl
            public final int AB8(AnonymousClass583 anonymousClass583, int i, int i2) {
                float f4;
                float f5 = (i2 - i) / 2.0f;
                if (anonymousClass583 == AnonymousClass583.Ltr) {
                    f4 = this.A00;
                } else {
                    f4 = (-1.0f) * this.A00;
                }
                return Math.round(f5 * (1.0f + f4));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C118235Wk) && Float.compare(this.A00, ((C118235Wk) obj).A00) == 0);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.A00);
            }

            public final String toString() {
                return AnonymousClass001.A0F("Horizontal(bias=", ')', this.A00);
            }

            {
                this.A00 = f3;
            }
        };
    }
}
