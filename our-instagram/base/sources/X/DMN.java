package X;

import com.instagram.clips.model.metadata.InteractionUpsellCTAType;

/* loaded from: classes5.dex */
public final class DMN extends C0YY implements InterfaceC16660sJ {
    public static final DMN A00 = new DMN();

    public DMN() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = InteractionUpsellCTAType.A01.get(obj);
        if (obj2 == null) {
            return InteractionUpsellCTAType.A0B;
        }
        return obj2;
    }
}
