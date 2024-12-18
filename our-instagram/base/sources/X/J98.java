package X;

import com.instagram.api.schemas.IGLiveGameStatus;

/* loaded from: classes7.dex */
public final class J98 extends C0YY implements InterfaceC16660sJ {
    public static final J98 A00 = new J98();

    public J98() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveGameStatus.A01.get(obj);
        if (obj2 == null) {
            return IGLiveGameStatus.A06;
        }
        return obj2;
    }
}
