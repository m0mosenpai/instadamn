package X;

import com.instagram.api.schemas.IGAIAgentVisibilityStatus;

/* loaded from: classes5.dex */
public final class DPC extends C0YY implements InterfaceC16660sJ {
    public static final DPC A00 = new DPC();

    public DPC() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGAIAgentVisibilityStatus.A01.get(obj);
        if (obj2 == null) {
            return IGAIAgentVisibilityStatus.A06;
        }
        return obj2;
    }
}