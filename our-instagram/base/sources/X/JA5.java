package X;

import com.instagram.api.schemas.ListeningNowState;

/* loaded from: classes7.dex */
public final class JA5 extends C0YY implements InterfaceC16660sJ {
    public static final JA5 A00 = new JA5();

    public JA5() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ListeningNowState.A01.get(obj);
        if (obj2 == null) {
            return ListeningNowState.A09;
        }
        return obj2;
    }
}
