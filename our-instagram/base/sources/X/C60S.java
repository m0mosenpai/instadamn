package X;

import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;

/* renamed from: X.60S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60S {
    public final RIXUAspectRatio A00;
    public final RIXULayoutFormat A01;
    public final RIXULayoutStyle A02;
    public final int A03;
    public static final java.util.Set A06 = AbstractC16830sb.A07(RIXULayoutFormat.A05, RIXULayoutFormat.A06);
    public static final java.util.Set A07 = AbstractC16830sb.A07(RIXULayoutStyle.A04, RIXULayoutStyle.A05);
    public static final java.util.Set A05 = AbstractC16830sb.A07(RIXUAspectRatio.A04, RIXUAspectRatio.A05);
    public static final C60S A04 = new C60S(null, null, null, 0);

    public final boolean A00() {
        int i;
        java.util.Set set = A06;
        RIXULayoutFormat rIXULayoutFormat = this.A01;
        if (AbstractC001800i.A0u(set, rIXULayoutFormat) && AbstractC001800i.A0u(A07, this.A02) && AbstractC001800i.A0u(A05, this.A00)) {
            int i2 = this.A03;
            if (rIXULayoutFormat != null) {
                int ordinal = rIXULayoutFormat.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i = 6;
                    }
                } else {
                    i = 4;
                }
                if (i2 >= i) {
                    return true;
                }
            }
        }
        return false;
    }

    public C60S(RIXUAspectRatio rIXUAspectRatio, RIXULayoutFormat rIXULayoutFormat, RIXULayoutStyle rIXULayoutStyle, int i) {
        this.A01 = rIXULayoutFormat;
        this.A02 = rIXULayoutStyle;
        this.A00 = rIXUAspectRatio;
        this.A03 = i;
    }
}
