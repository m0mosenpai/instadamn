package X;

import com.instagram.api.schemas.LikeVisibilityType;

/* loaded from: classes5.dex */
public final class DPF extends C0YY implements InterfaceC16660sJ {
    public static final DPF A00 = new DPF();

    public DPF() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = LikeVisibilityType.A01.get(obj);
        if (obj2 == null) {
            return LikeVisibilityType.A07;
        }
        return obj2;
    }
}
