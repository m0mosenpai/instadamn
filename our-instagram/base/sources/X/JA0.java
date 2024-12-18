package X;

import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;

/* loaded from: classes7.dex */
public final class JA0 extends C0YY implements InterfaceC16660sJ {
    public static final JA0 A00 = new JA0();

    public JA0() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGPBIAProfileBrowseTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IGPBIAProfileBrowseTypeEnum.A06;
        }
        return obj2;
    }
}
