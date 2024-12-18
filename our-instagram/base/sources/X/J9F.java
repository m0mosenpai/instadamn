package X;

import com.instagram.api.schemas.AssetRecommendationType;

/* loaded from: classes7.dex */
public final class J9F extends C0YY implements InterfaceC16660sJ {
    public static final J9F A00 = new J9F();

    public J9F() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AssetRecommendationType.A01.get(obj);
        if (obj2 == null) {
            return AssetRecommendationType.A06;
        }
        return obj2;
    }
}
