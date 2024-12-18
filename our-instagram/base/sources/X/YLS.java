package X;

import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;

/* loaded from: classes12.dex */
public final class YLS extends C0YY implements InterfaceC16660sJ {
    public static final YLS A00 = new YLS();

    public YLS() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGAdsCardStickerCTATypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IGAdsCardStickerCTATypeEnum.A08;
        }
        return obj2;
    }
}
