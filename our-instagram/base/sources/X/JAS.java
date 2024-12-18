package X;

import com.instagram.api.schemas.OverlayAdTapDestinationEnum;

/* loaded from: classes7.dex */
public final class JAS extends C0YY implements InterfaceC16660sJ {
    public static final JAS A00 = new JAS();

    public JAS() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OverlayAdTapDestinationEnum.A01.get(obj);
        if (obj2 == null) {
            return OverlayAdTapDestinationEnum.A06;
        }
        return obj2;
    }
}
