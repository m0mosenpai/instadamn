package X;

import android.os.Bundle;

/* loaded from: classes11.dex */
public abstract class UFZ extends AbstractC52922bZ implements C07W {
    public Boolean A00;
    public boolean A01;
    public Bundle A02;
    public final C58252li A03 = new C58252li();
    public final C2GS A08 = new C2GS();
    public final C2GS A06 = new C2GS();
    public final C2GS A05 = new C2GS();
    public final C2GS A04 = new C2GS();
    public final C2GS A07 = new C2GS();

    public static void A00(UFZ ufz, C63406Sjd c63406Sjd) {
        ufz.A06.A0B(c63406Sjd.A00);
        ufz.A05.A0B(Boolean.valueOf(C63406Sjd.A0H(c63406Sjd)));
    }

    public final String A08() {
        if (!(this instanceof C67717Uwi) && !(this instanceof C67712Uwd)) {
            if (this instanceof C67709Uwa) {
                return "";
            }
            if (!(this instanceof C67715Uwg)) {
                if (this instanceof C67714Uwf) {
                    String str = ((C67714Uwf) this).A03;
                    if (str != null) {
                        return str;
                    }
                    C14360o3.A0F("_viewName");
                    throw C00O.createAndThrow();
                }
                if (!(this instanceof C67681Uvy)) {
                    if (this instanceof C67680Uvx) {
                        return "settings";
                    }
                    if (this instanceof C67679Uvu) {
                        return "payouthub_payouts";
                    }
                    if (this instanceof Uvw) {
                        return "overview";
                    }
                    if (this instanceof Uvv) {
                        return "payouthub_earnings";
                    }
                    if (!(this instanceof C67716Uwh) && !(this instanceof C67713Uwe)) {
                        return "app_level_dialogue_update";
                    }
                    return "earning_details";
                }
                return "transactions";
            }
            return "transactions";
        }
        return "payout_details";
    }

    public void A09(Bundle bundle) {
        this.A02 = bundle;
        this.A01 = true;
    }
}
