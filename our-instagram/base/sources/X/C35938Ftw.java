package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.Ftw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35938Ftw implements InterfaceC58140Pq5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C31338Dq3 A02;
    public final /* synthetic */ C5HW A03;

    @Override // X.InterfaceC58140Pq5
    public final void Dex() {
    }

    @Override // X.InterfaceC58140Pq5
    public final void Dez() {
    }

    public C35938Ftw(Context context, C31338Dq3 c31338Dq3, C5HW c5hw, int i) {
        this.A02 = c31338Dq3;
        this.A03 = c5hw;
        this.A00 = i;
        this.A01 = context;
    }

    @Override // X.InterfaceC58140Pq5
    public final void Dey() {
        C31338Dq3 c31338Dq3 = this.A02;
        C5HW c5hw = this.A03;
        int i = this.A00;
        C31338Dq3.A04(c31338Dq3, c5hw, "delete_comment_failed", i);
        if (C31338Dq3.A05(c31338Dq3)) {
            C193328hC A0I = AbstractC31171DnF.A0I(this.A01);
            A0I.A09(2131968506);
            A0I.A04();
            AbstractC166987dD.A1W(A0I);
        }
        c31338Dq3.A06.COe(c5hw, i);
    }

    @Override // X.InterfaceC58140Pq5
    public final void Df0(EnumC53178Nfa enumC53178Nfa, String str, List list, List list2, java.util.Set set) {
        C31338Dq3.A04(this.A02, this.A03, "delete_comment_success", this.A00);
    }
}
