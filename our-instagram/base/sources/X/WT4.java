package X;

import android.os.Bundle;

/* loaded from: classes11.dex */
public final class WT4 implements C08T {
    public final int A00;
    public final Object A01;

    public WT4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C08T
    public final Bundle ELr() {
        Bundle bundle;
        C2GT c2gt;
        switch (this.A00) {
            case 0:
                bundle = new Bundle();
                c2gt = ((C67714Uwf) this.A01).A05;
                break;
            case 1:
                bundle = new Bundle();
                c2gt = ((AbstractC67710Uwb) this.A01).A03;
                break;
            case 2:
                Bundle bundle2 = new Bundle();
                String str = (String) ((C67715Uwg) this.A01).A04.A02();
                if (str == null) {
                    return bundle2;
                }
                bundle2.putString("filter_transaction_type", str);
                return bundle2;
            case 3:
                Bundle bundle3 = new Bundle();
                Number number = (Number) ((UFO) this.A01).A08.A02();
                if (number == null) {
                    return bundle3;
                }
                bundle3.putInt("tab_index", number.intValue());
                return bundle3;
            default:
                return AbstractC61636Rr0.A00(AbstractC25230BEn.A1b("filter_transaction_type", ((C67681Uvy) this.A01).A03));
        }
        UYE uye = (UYE) c2gt.A02();
        if (uye == null) {
            return bundle;
        }
        C63368SiU.A04(bundle, uye, "financial_entity");
        return bundle;
    }
}
