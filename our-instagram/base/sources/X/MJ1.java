package X;

import com.facebook.rsys.state.gen.State;

/* loaded from: classes8.dex */
public final class MJ1 extends C0YY implements InterfaceC16660sJ {
    public static final MJ1 A00 = new MJ1();

    public MJ1() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        C51732MtD c51732MtD = (C51732MtD) obj;
        C14360o3.A0B(c51732MtD, 0);
        State state = (State) c51732MtD.A00(State.class);
        if (state != null) {
            int i = state.callState;
            if (Integer.valueOf(i) != null && (i == 4 || i == 0)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
