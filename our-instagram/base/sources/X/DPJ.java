package X;

import com.instagram.api.schemas.IGLiveWaveStatus;

/* loaded from: classes5.dex */
public final class DPJ extends C0YY implements InterfaceC16660sJ {
    public static final DPJ A00 = new DPJ();

    public DPJ() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveWaveStatus.A01.get(obj);
        if (obj2 == null) {
            return IGLiveWaveStatus.A05;
        }
        return obj2;
    }
}
