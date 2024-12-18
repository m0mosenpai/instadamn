package X;

import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class LnO implements InterfaceC165837bB {
    public final C47546KzG A00;
    public final InterfaceC16820sZ A01;

    @Override // X.InterfaceC165837bB
    public final void FCb(String str) {
        DirectThreadKey A02;
        String str2;
        C7U0 c7u0 = (C7U0) this.A01.invoke();
        if (c7u0 != null) {
            InterfaceC163557Ts BT6 = c7u0.BT6();
            boolean equals = str.equals(BT6.BPb());
            String A00 = AbstractC111324zv.A00(4983);
            if (equals) {
                InterfaceC163857Uz Avk = c7u0.Avk();
                if (Avk instanceof C49206LpN) {
                    C14360o3.A0C(Avk, A00);
                    ((C49206LpN) Avk).A03(null);
                    return;
                } else {
                    BT6.DtN(null);
                    return;
                }
            }
            C47546KzG c47546KzG = this.A00;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c47546KzG.A00, "tap_thread_view_to_timestamp");
            if (A0f.isSampled() && (A02 = JRE.A02((C3o9) c47546KzG.A01.get())) != null && (str2 = A02.A00) != null) {
                AbstractC31171DnF.A1C(A0f, "tap");
                AbstractC31171DnF.A1F(A0f, str2);
                A0f.Cht();
            }
            InterfaceC163857Uz Avk2 = c7u0.Avk();
            if (Avk2 instanceof C49206LpN) {
                C14360o3.A0C(Avk2, A00);
                ((C49206LpN) Avk2).A03(str);
            } else {
                BT6.DtN(str);
            }
        }
    }

    public LnO(C47546KzG c47546KzG, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
        this.A00 = c47546KzG;
    }
}
