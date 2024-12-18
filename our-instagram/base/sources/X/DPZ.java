package X;

import com.instagram.api.schemas.IGLiveModeratorStatus;

/* loaded from: classes5.dex */
public final class DPZ extends C0YY implements InterfaceC16660sJ {
    public static final DPZ A00 = new DPZ();

    public DPZ() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveModeratorStatus.A01.get(obj);
        if (obj2 == null) {
            return IGLiveModeratorStatus.A08;
        }
        return obj2;
    }
}
