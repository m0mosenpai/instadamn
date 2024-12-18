package X;

import com.instagram.api.schemas.IGLiveGames;

/* loaded from: classes7.dex */
public final class J97 extends C0YY implements InterfaceC16660sJ {
    public static final J97 A00 = new J97();

    public J97() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveGames.A01.get(obj);
        if (obj2 == null) {
            return IGLiveGames.A06;
        }
        return obj2;
    }
}
