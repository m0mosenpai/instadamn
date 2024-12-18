package X;

import com.instagram.api.schemas.IgUserBioLinkTypeEnum;

/* loaded from: classes6.dex */
public final class GVJ extends C0YY implements InterfaceC16660sJ {
    public static final GVJ A00 = new GVJ();

    public GVJ() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IgUserBioLinkTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IgUserBioLinkTypeEnum.A08;
        }
        return obj2;
    }
}
