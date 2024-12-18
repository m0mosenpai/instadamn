package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.XpT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72864XpT {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72864XpT)) {
            return false;
        }
        C72864XpT c72864XpT = (C72864XpT) obj;
        return c72864XpT.A01 == this.A01 && c72864XpT.A00 == this.A00;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A01) ^ Float.floatToIntBits(this.A00);
    }

    public C72864XpT(float f, float f2) {
        C02R.A04(IgReactMediaPickerNativeModule.WIDTH, f);
        this.A01 = f;
        C02R.A04(IgReactMediaPickerNativeModule.HEIGHT, f2);
        this.A00 = f2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A01);
        A1C.append("x");
        A1C.append(this.A00);
        return A1C.toString();
    }
}
