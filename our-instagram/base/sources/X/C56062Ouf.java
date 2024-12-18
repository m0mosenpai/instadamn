package X;

import android.content.Context;

/* renamed from: X.Ouf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56062Ouf implements InterfaceC60072op {
    public boolean A00;
    public final InterfaceC58119Ppi A01;
    public final Context A02;

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC58119Ppi interfaceC58119Ppi = this.A01;
        if (interfaceC58119Ppi.BCs() && !this.A00) {
            C193328hC A0I = AbstractC31171DnF.A0I(this.A02);
            A0I.A0A(2131976209);
            A0I.A09(2131976208);
            A0I.A0L(DialogInterfaceOnClickListenerC55319Ogh.A00(this, 70), 2131960929);
            AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC55320Ogi.A00(this, 0), A0I);
            return true;
        }
        if (!this.A00) {
            interfaceC58119Ppi.Cyw();
            return false;
        }
        return false;
    }

    public C56062Ouf(Context context, InterfaceC58119Ppi interfaceC58119Ppi) {
        this.A02 = context;
        this.A01 = interfaceC58119Ppi;
    }
}
