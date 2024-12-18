package X;

import com.instagram.api.schemas.IGAdsRrFormatEnum;

/* loaded from: classes11.dex */
public final class X60 extends C0YY implements InterfaceC16660sJ {
    public static final X60 A00 = new X60();

    public X60() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGAdsRrFormatEnum.A01.get(obj);
        if (obj2 == null) {
            return IGAdsRrFormatEnum.A06;
        }
        return obj2;
    }
}
