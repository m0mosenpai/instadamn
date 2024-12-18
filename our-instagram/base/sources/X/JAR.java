package X;

import com.instagram.api.schemas.OverlayAdsFormatEnum;

/* loaded from: classes7.dex */
public final class JAR extends C0YY implements InterfaceC16660sJ {
    public static final JAR A00 = new JAR();

    public JAR() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OverlayAdsFormatEnum.A01.get(obj);
        if (obj2 == null) {
            return OverlayAdsFormatEnum.A07;
        }
        return obj2;
    }
}
