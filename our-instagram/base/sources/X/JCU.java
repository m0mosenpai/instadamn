package X;

import com.instagram.api.schemas.MomentAdsTypeEnum;

/* loaded from: classes7.dex */
public final class JCU extends C0YY implements InterfaceC16660sJ {
    public static final JCU A00 = new JCU();

    public JCU() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MomentAdsTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return MomentAdsTypeEnum.A0C;
        }
        return obj2;
    }
}
