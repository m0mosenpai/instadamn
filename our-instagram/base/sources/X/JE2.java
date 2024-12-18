package X;

import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;

/* loaded from: classes7.dex */
public final class JE2 extends C0YY implements InterfaceC16660sJ {
    public static final JE2 A00 = new JE2();

    public JE2() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        Object obj2 = IGAdsTrustInfoTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IGAdsTrustInfoTypeEnum.A0D;
        }
        return obj2;
    }
}
