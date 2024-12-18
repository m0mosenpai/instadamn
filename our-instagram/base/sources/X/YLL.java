package X;

import com.instagram.api.schemas.IGAdsGenericCardFormatEnum;

/* loaded from: classes12.dex */
public final class YLL extends C0YY implements InterfaceC16660sJ {
    public static final YLL A00 = new YLL();

    public YLL() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGAdsGenericCardFormatEnum.A01.get(obj);
        if (obj2 == null) {
            return IGAdsGenericCardFormatEnum.A04;
        }
        return obj2;
    }
}
