package X;

import android.content.Intent;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EVL extends AbstractC60592pi {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public EVL(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
                this.A02 = interfaceC103384lE;
                this.A01 = c6fq;
                break;
            case 1:
                this.A01 = interfaceC103384lE;
                this.A02 = c6fq;
                break;
            case 2:
            default:
                this.A01 = c6fq;
                this.A02 = interfaceC103384lE;
                break;
            case 3:
                this.A02 = c6fq;
                this.A01 = interfaceC103384lE;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        C6FQ c6fq;
        InterfaceC103384lE interfaceC103384lE;
        Object obj;
        switch (this.A00) {
            case 0:
                if ((i == 10 || i == 9) && (interfaceC103384lE = (InterfaceC103384lE) this.A02) != null) {
                    AbstractC31171DnF.A1K((C6FQ) this.A01, interfaceC103384lE);
                }
                obj = this.A01;
                c6fq = (C6FQ) obj;
                C6BQ.A0L(c6fq, this);
                return;
            case 1:
                if (i2 == -1 && i == 32779 && intent != null) {
                    AbstractMap abstractMap = (AbstractMap) intent.getSerializableExtra(MSV.A00(84));
                    C6FX A0s = AbstractC25225BEi.A0s();
                    if (abstractMap != null) {
                        HashMap A1G = AbstractC166987dD.A1G();
                        Iterator A14 = AbstractC166997dE.A14(abstractMap);
                        while (A14.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A14);
                            A1G.put(A1K.getKey(), A1K.getValue());
                        }
                        A0s.A01(A1G);
                    }
                    C131845xK.A00((C6FQ) this.A02, A0s.A00(), (InterfaceC103384lE) this.A01);
                }
                obj = this.A02;
                c6fq = (C6FQ) obj;
                C6BQ.A0L(c6fq, this);
                return;
            case 2:
                ((C3CZ) this.A01).A08(intent, i, i2, false);
                obj = this.A02;
                c6fq = (C6FQ) obj;
                C6BQ.A0L(c6fq, this);
                return;
            case 3:
                if (i != 2884) {
                    return;
                }
                c6fq = (C6FQ) this.A02;
                FT1.A01(intent, c6fq, (InterfaceC103384lE) this.A01, i2);
                C6BQ.A0L(c6fq, this);
                return;
            case 4:
                if (i2 == -1 && i == 32779) {
                    C131845xK.A00((C6FQ) this.A01, new C6FW(AbstractC166987dD.A1E()), (InterfaceC103384lE) this.A02);
                }
                obj = this.A01;
                c6fq = (C6FQ) obj;
                C6BQ.A0L(c6fq, this);
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        Object obj;
        switch (this.A00) {
            case 1:
            case 2:
            case 3:
                obj = this.A02;
                break;
            case 4:
                obj = this.A01;
                break;
            case 5:
                C38472Gvt c38472Gvt = (C38472Gvt) this.A02;
                C6T7 c6t7 = c38472Gvt.A00;
                if (c6t7 != null) {
                    c6t7.A04();
                }
                c38472Gvt.A01 = null;
                c38472Gvt.A00 = null;
                ((C62862tP) this.A01).A06(this);
                return;
            default:
                super.onDestroyView();
                return;
        }
        C6BQ.A0L((C6FQ) obj, this);
    }

    public EVL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
