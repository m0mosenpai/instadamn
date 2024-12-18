package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public abstract class Q8X extends AbstractC52922bZ {
    public Bundle A00;
    public final C2GS A06 = AbstractC58318PtA.A0J();
    public final C2GS A0A = AbstractC58318PtA.A0J();
    public final C2GS A07 = AbstractC58318PtA.A0J();
    public final C2GS A09 = AbstractC58318PtA.A0J();
    public final C2GS A05 = AbstractC58318PtA.A0J();
    public final C58252li A03 = AbstractC58318PtA.A0I();
    public final C2GS A08 = AbstractC58318PtA.A0J();
    public final C2GS A04 = AbstractC58318PtA.A0J();
    public boolean A01 = false;
    public boolean A02 = false;

    public final int A02() {
        if (this instanceof REK) {
            REK rek = (REK) this;
            if (!rek.A04) {
                if (!rek.A05) {
                    return 2131962334;
                }
                return 2131962336;
            }
            return 0;
        }
        if (this instanceof REI) {
            return 2131969406;
        }
        if (this instanceof REM) {
            return 2131969397;
        }
        if (this instanceof REH) {
            return 2131969396;
        }
        if (this instanceof REL) {
            return 2131956674;
        }
        if (this instanceof REF) {
            return 2131973922;
        }
        return 0;
    }

    public final void A03() {
        if (this instanceof REK) {
            REK rek = (REK) this;
            if (!rek.A04 && rek.A03 != null) {
                C58252li c58252li = rek.A07;
                if (!C63406Sjd.A0H(AbstractC58318PtA.A0S(c58252li))) {
                    SE9 se9 = rek.A09;
                    String str = rek.A03;
                    Q8J A00 = REU.A00(new C63547SpF(se9, str, false), se9.A00);
                    C14360o3.A07(A00);
                    C63627SqZ.A02(A00, c58252li, rek, 38);
                }
            }
        }
    }

    public final boolean A04(Bundle bundle, int i, boolean z) {
        LinkedHashMap A08;
        C2GC c2gc;
        String str;
        SMH smh;
        LinkedHashMap A082;
        C2GC c2gc2;
        String str2;
        String queryParameter;
        if (this instanceof REI) {
            REI rei = (REI) this;
            if (i == 1 && bundle != null && bundle.getString("web_fragment_intercepted_url") != null) {
                String string = bundle.getString("web_fragment_intercepted_url");
                if (!TextUtils.isEmpty(string) && (queryParameter = AbstractC08820cl.A03(string).getQueryParameter("ba_token")) != null) {
                    C2GT c2gt = rei.A00;
                    if (c2gt != null) {
                        c2gt.A08(rei.A0C);
                    }
                    SMF smf = rei.A06;
                    Q8J A00 = REU.A00(new C63546SpE(queryParameter, smf, 1), smf.A00);
                    rei.A00 = A00;
                    A00.A09(rei.A0C);
                    return true;
                }
                return false;
            }
            if ((i == 5 || i == 6) && (smh = rei.A07) != null) {
                String A002 = rei.A04.A00();
                A002.getClass();
                smh.A00(A002);
            }
            if (z) {
                if (i == 5) {
                    if (bundle != null) {
                        if ("success".equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                            String string2 = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                            String string3 = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                            if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string2)) {
                                SMH smh2 = rei.A07;
                                smh2.getClass();
                                String A003 = rei.A04.A00();
                                A003.getClass();
                                Q8J A004 = REU.A00(new C63551SpJ(smh2, string3, string2, A003, 1), smh2.A02);
                                A004.A09(new C63625SqX(16, A004, rei));
                                return true;
                            }
                            A082 = AbstractC58442PvL.A08(rei.A04);
                            AbstractC58318PtA.A1X(A082);
                            c2gc2 = rei.A0E;
                            str2 = "client_add_credential_success";
                        } else if (OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE.equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                            A082 = AbstractC58442PvL.A08(rei.A04);
                            AbstractC58318PtA.A1X(A082);
                            c2gc2 = rei.A0E;
                            str2 = "client_add_credential_fail";
                        }
                        c2gc2.Chz(str2, A082);
                    }
                } else if (i != 2 && i != 3 && i != 6) {
                    return false;
                }
                rei.A06.A00(rei.A0G);
                return true;
            }
            return false;
        }
        if (this instanceof REM) {
            REM rem = (REM) this;
            if (i == 6) {
                if (bundle != null) {
                    if ("success".equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                        String string4 = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                        String string5 = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                        if (!TextUtils.isEmpty(string5) && !TextUtils.isEmpty(string4)) {
                            SMH smh3 = rem.A08;
                            String A005 = rem.A01.A00();
                            A005.getClass();
                            Q8J A006 = REU.A00(new C63551SpJ(smh3, string5, string4, A005, 1), smh3.A02);
                            A006.A09(new C63625SqX(15, A006, rem));
                            return true;
                        }
                        HashSet A1H = AbstractC166987dD.A1H();
                        Collections.addAll(A1H, EnumC61116RfW.values());
                        rem.A07.A00(A1H);
                        A08 = AbstractC58442PvL.A08(rem.A01);
                        REM.A01(rem, A08);
                        c2gc = rem.A06;
                        str = "client_edit_credential_success";
                    } else {
                        if (!OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE.equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                            return true;
                        }
                        A08 = AbstractC58442PvL.A08(rem.A01);
                        REM.A01(rem, A08);
                        c2gc = rem.A06;
                        str = "client_edit_credential_fail";
                    }
                    c2gc.Chz(str, A08);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void A05(Bundle bundle) {
        this.A00 = bundle;
        this.A01 = true;
    }
}
