package X;

import android.content.DialogInterface;

/* renamed from: X.Cj0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnDismissListenerC28568Cj0 implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnDismissListenerC28568Cj0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object value;
        C7MT c7mt;
        switch (this.A00) {
            case 0:
                ((C25814BbV) this.A01).A03 = false;
                return;
            case 1:
                C163727Uk c163727Uk = (C163727Uk) ((C7UA) this.A01).A01.getValue();
                C05A c05a = c163727Uk.A06;
                do {
                    value = c05a.getValue();
                    c7mt = (C7MT) value;
                } while (!AbstractC25233BEq.A1Z(c7mt.A00, C7MS.A02, c7mt, value, c05a));
                String str = c163727Uk.A00;
                if (str == null) {
                    return;
                }
                InterfaceC19630xq interfaceC19630xq = c163727Uk.A05.A01;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E77(AnonymousClass001.A0R("has_seen_per_creator_ai_beta_disclosure/", str), true);
                ARD.apply();
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7G("last_seen_creator_ai_beta_disclosure_timestamp", System.currentTimeMillis());
                ARD2.apply();
                c163727Uk.A00 = null;
                return;
            case 2:
                ((InterfaceC31039Dkd) this.A01).DWM();
                return;
            default:
                ((C145176gc) this.A01).A18.EJJ();
                return;
        }
    }
}
