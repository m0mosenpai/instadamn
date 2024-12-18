package X;

import com.instagram.api.schemas.SocialContextType;

/* loaded from: classes5.dex */
public final class BU6 extends C0YY implements InterfaceC16660sJ {
    public static final BU6 A00 = new BU6();

    public BU6() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = SocialContextType.A01.get(obj);
        if (obj2 == null) {
            return SocialContextType.A0N;
        }
        return obj2;
    }
}
