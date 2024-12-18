package X;

import android.os.Bundle;
import android.widget.CompoundButton;

/* renamed from: X.Sp0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63533Sp0 implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C63533Sp0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.A00) {
            case 0:
                C5G6 c5g6 = ((QEB) this.A01).A02;
                if (c5g6 == null) {
                    return;
                }
                c5g6.A00.A01.A01 = z;
                return;
            case 1:
                QE7 qe7 = (QE7) this.A01;
                C5G6 c5g62 = qe7.A00;
                if (c5g62 == null) {
                    return;
                }
                InterfaceC19610xo A0e = AbstractC31176DnK.A0e(c5g62.A03.A00);
                A0e.E77("autofill_passkey_opt_in_cache_key", z);
                A0e.apply();
                if (z) {
                    return;
                }
                C63024Sau c63024Sau = qe7.A00.A01;
                C63380Siu c63380Siu = qe7.A01;
                Bundle bundle = null;
                if (c63380Siu != null) {
                    bundle = c63380Siu.A03.A03();
                }
                c63024Sau.A06("UNCHECK_PASSKEY_CREATION_CHECKBOX", bundle);
                return;
            case 2:
                ((QE5) this.A01).A03 = z;
                return;
            default:
                C5G6 c5g63 = ((QE5) this.A01).A00;
                if (c5g63 != null) {
                    InterfaceC19610xo A0e2 = AbstractC31176DnK.A0e(c5g63.A03.A00);
                    A0e2.E77("autofill_passkey_opt_in_cache_key", z);
                    A0e2.apply();
                    return;
                }
                return;
        }
    }
}
