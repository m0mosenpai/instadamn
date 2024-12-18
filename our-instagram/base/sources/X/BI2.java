package X;

import kotlin.Deprecated;

@Deprecated(message = "Are you sure you want to use this? Custom styles lead to inconsistent design. Consider using one of the preset styles.")
/* loaded from: classes5.dex */
public final class BI2 extends C0T6 implements InterfaceC31127DmA {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BI2) {
                BI2 bi2 = (BI2) obj;
                if (!C119145aW.A01(this.A03, bi2.A03) || !C119145aW.A01(this.A02, bi2.A02) || !C119145aW.A01(this.A00, bi2.A00) || !C119145aW.A01(this.A01, bi2.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A03), this.A02), this.A00), this.A01);
    }

    public BI2(float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A01 = f4;
    }

    @Override // X.InterfaceC31127DmA
    public final float AeX() {
        return this.A00;
    }

    @Override // X.InterfaceC31127DmA
    public final float AeY() {
        return this.A01;
    }

    @Override // X.InterfaceC31127DmA
    public final float AeZ() {
        return this.A02;
    }

    @Override // X.InterfaceC31127DmA
    public final float Aea() {
        return this.A03;
    }
}
