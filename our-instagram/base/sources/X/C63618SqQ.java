package X;

import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Locale;

/* renamed from: X.SqQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63618SqQ implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C63618SqQ(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = str;
        this.A02 = obj;
        this.A03 = obj2;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        InterfaceC103384lE interfaceC103384lE;
        C6FW c6fw;
        String A0j;
        String str;
        if (this.A00 != 0) {
            T3Q t3q = (T3Q) this.A01;
            String str2 = this.A04;
            SparseArray sparseArray = (SparseArray) this.A02;
            C58444PvN c58444PvN = (C58444PvN) this.A03;
            C63406Sjd c63406Sjd = (C63406Sjd) obj;
            if (C63406Sjd.A0J(c63406Sjd)) {
                String str3 = (String) C63406Sjd.A08(c63406Sjd);
                int A0A = AbstractC167007dF.A0A(str2);
                String str4 = null;
                if (A0A < 6) {
                    A0j = null;
                } else {
                    A0j = AbstractC58318PtA.A0j(str2, 6);
                }
                if (A0A >= 4) {
                    str4 = str2.substring(A0A - 4);
                }
                if (sparseArray.get(10) instanceof Country) {
                    str = ((LocaleMember) sparseArray.get(10)).A00.getCountry();
                } else {
                    str = (String) sparseArray.get(21);
                }
                C04060Jx c04060Jx = GraphQlCallInput.A02;
                String str5 = t3q.A02;
                boolean z = !str5.equals("IAB_AUTOFILL");
                C0CA c0ca = null;
                if (sparseArray.get(7) != null || z) {
                    String A01 = T3Q.A01(sparseArray, 7);
                    c0ca = c04060Jx.A02();
                    C0CA.A00(c0ca, A01, ServerW3CShippingAddressConstants.CITY);
                }
                if (str == null) {
                    str = "";
                }
                String trim = str.trim();
                if (trim.isEmpty()) {
                    trim = Locale.getDefault().getCountry();
                }
                if (c0ca == null) {
                    c0ca = c04060Jx.A02();
                }
                C0CA.A00(c0ca, trim, "country_code");
                if (sparseArray.get(8) != null || z) {
                    C0CA.A00(c0ca, T3Q.A01(sparseArray, 8), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                }
                if (sparseArray.get(5) != null || z) {
                    C0CA.A00(c0ca, T3Q.A01(sparseArray, 5), "street1");
                }
                if (sparseArray.get(6) != null || z) {
                    C0CA.A00(c0ca, T3Q.A01(sparseArray, 6), "street2");
                }
                if (sparseArray.get(9) != null || z) {
                    C0CA.A00(c0ca, T3Q.A01(sparseArray, 9), ServerW3CShippingAddressConstants.POSTAL_CODE);
                }
                C0CA A02 = c04060Jx.A02();
                A02.A0E(c0ca, "billing_address");
                C0CA.A00(A02, T3Q.A01(sparseArray, 2), "cardholder_name");
                C0CA.A00(A02, AbstractC58318PtA.A0c(sparseArray, 14).toString().substring(0, 2), "expiry_month");
                C0CA.A00(A02, T3Q.A02(AbstractC58318PtA.A0c(sparseArray, 14).toString()), "expiry_year");
                C0CA.A00(A02, str5, "payment_type");
                C0CA.A00(A02, AbstractC166997dE.A0n(), "client_mutation_id");
                if (str3 != null) {
                    C0CA.A00(A02, str3, "platform_trust_token");
                    A02.A0E(AbstractC25227BEk.A0T(c04060Jx, "$e2ee", "sensitive_string_value"), "credit_card_number");
                    A02.A0E(AbstractC25227BEk.A0T(c04060Jx, "$e2ee", "sensitive_string_value"), "csc");
                    if (A0j == null) {
                        A0j = "";
                    }
                    A02.A0E(AbstractC25227BEk.A0T(c04060Jx, A0j, "sensitive_string_value"), "credit_card_first_6");
                    if (str4 == null) {
                        str4 = "";
                    }
                    A02.A0E(AbstractC25227BEk.A0T(c04060Jx, str4, "sensitive_string_value"), "credit_card_last_4");
                } else {
                    C0CA.A00(A02, "$e2ee", "credit_card_token");
                }
                C2JM A0b = AbstractC25225BEi.A0b();
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A02, A0b, "input"), "IGFBPayAddCreditCard", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), R14.class, true, null, 40, "input", "add_credit_card", AbstractC166987dD.A1E());
                C64006Sxd c64006Sxd = new C64006Sxd(c58444PvN, 10);
                t3q.A01.ATV(c64006Sxd, new C64021Sxs(4, sparseArray, c64006Sxd, c58444PvN, t3q), pandoGraphQLRequest);
                return;
            }
            c58444PvN.A03(SSG.A01(new Exception("PTT encode failed")));
            return;
        }
        C63406Sjd c63406Sjd2 = (C63406Sjd) obj;
        C14360o3.A0B(c63406Sjd2, 0);
        if (C63406Sjd.A0J(c63406Sjd2)) {
            Object A08 = C63406Sjd.A08(c63406Sjd2);
            interfaceC103384lE = (InterfaceC103384lE) this.A03;
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A03(A08, 0);
            A0s.A02(this.A04);
            c6fw = A0s.A00();
        } else {
            if (!C63406Sjd.A0G(c63406Sjd2)) {
                return;
            }
            interfaceC103384lE = (InterfaceC103384lE) this.A02;
            c6fw = C6FW.A01;
        }
        C131845xK.A00((C6FQ) this.A01, c6fw, interfaceC103384lE);
    }
}
