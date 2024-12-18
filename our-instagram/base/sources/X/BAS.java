package X;

import android.graphics.Color;

/* loaded from: classes4.dex */
public final class BAS extends C0YY implements InterfaceC16620sF {
    public static final BAS A00 = new BAS();

    public BAS() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Number number = (Number) obj;
        Number number2 = (Number) obj2;
        C14360o3.A0A(number);
        float luminance = Color.luminance(number.intValue());
        C14360o3.A0A(number2);
        return Integer.valueOf(Float.compare(luminance, Color.luminance(number2.intValue())));
    }
}
