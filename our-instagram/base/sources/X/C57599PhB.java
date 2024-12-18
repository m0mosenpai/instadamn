package X;

import com.facebook.rsys.state.gen.State;

/* renamed from: X.PhB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57599PhB extends C0YY implements InterfaceC16660sJ {
    public static final C57599PhB A00 = new C57599PhB();

    public C57599PhB() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C51732MtD c51732MtD = (C51732MtD) obj;
        C14360o3.A0B(c51732MtD, 0);
        State state = (State) c51732MtD.A00(State.class);
        boolean z = true;
        if (state != null && (i = state.callState) != 4 && i != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
