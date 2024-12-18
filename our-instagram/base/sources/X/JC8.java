package X;

import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;

/* loaded from: classes7.dex */
public final class JC8 extends C0YY implements InterfaceC16660sJ {
    public static final JC8 A00 = new JC8();

    public JC8() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IgUserRelatedAccountTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IgUserRelatedAccountTypeEnum.A05;
        }
        return obj2;
    }
}
