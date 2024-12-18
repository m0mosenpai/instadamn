package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Tal, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64962Tal extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ CRB A02;
    public final /* synthetic */ QE0 A03;
    public final /* synthetic */ C27924CSj A04;
    public final /* synthetic */ C62762SPv A05;
    public final /* synthetic */ SO2 A06;
    public final /* synthetic */ C63024Sau A07;
    public final /* synthetic */ C63021Sam A08;
    public final /* synthetic */ AutofillData A09;
    public final /* synthetic */ CardDetails A0A;
    public final /* synthetic */ Integer A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ Map A0F;
    public final /* synthetic */ Map A0G;
    public final /* synthetic */ java.util.Set A0H;
    public final /* synthetic */ boolean A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64962Tal(Context context, Bundle bundle, CRB crb, QE0 qe0, C27924CSj c27924CSj, C62762SPv c62762SPv, SO2 so2, C63024Sau c63024Sau, C63021Sam c63021Sam, AutofillData autofillData, CardDetails cardDetails, Integer num, String str, String str2, String str3, Map map, Map map2, java.util.Set set, boolean z) {
        super(0);
        this.A08 = c63021Sam;
        this.A0B = num;
        this.A03 = qe0;
        this.A06 = so2;
        this.A0G = map;
        this.A0I = z;
        this.A09 = autofillData;
        this.A0C = str;
        this.A0A = cardDetails;
        this.A0E = str2;
        this.A00 = context;
        this.A04 = c27924CSj;
        this.A02 = crb;
        this.A05 = c62762SPv;
        this.A07 = c63024Sau;
        this.A0F = map2;
        this.A0H = set;
        this.A0D = str3;
        this.A01 = bundle;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj;
        C63021Sam c63021Sam = this.A08;
        Integer num = this.A0B;
        Map map = null;
        c63021Sam.A02(num, null, "BloksBottomSheetShowInMainThreadStart", 772805755);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        BitSet bitSet = new BitSet(9);
        QE0 qe0 = this.A03;
        SO2 so2 = this.A06;
        Map A00 = AbstractC63008SaW.A00(so2);
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        C14360o3.A0B(A00, 0);
        A1I.put("settings", A00);
        bitSet.set(8);
        AbstractC58322PtE.A1O("logging_metadata", this.A0G, bitSet, A1I);
        if (this.A0I) {
            str = "add_new_card";
        } else {
            str = "opt_in";
        }
        A1I.put("payment_save_action_type", str);
        bitSet.set(7);
        AutofillData autofillData = this.A09;
        if (autofillData != null) {
            map = C63285Sgk.A02(autofillData);
        }
        A1I.put("contact_info", map);
        C09530e4 A1L = AbstractC166987dD.A1L("billing_country", Locale.getDefault().getCountry());
        String str5 = this.A0C;
        C09530e4 A1L2 = AbstractC166987dD.A1L("card_number", str5);
        CardDetails cardDetails = this.A0A;
        String str6 = cardDetails.A05;
        Object obj2 = "";
        if (str6 == null) {
            str6 = "";
        }
        C09530e4 A1L3 = AbstractC166987dD.A1L("credit_card_issuer", str6);
        Integer num2 = cardDetails.A04;
        if (num2 == null || (str2 = num2.toString()) == null) {
            str2 = "";
        }
        C09530e4 A1L4 = AbstractC166987dD.A1L("expiry_year", str2);
        Integer num3 = cardDetails.A03;
        if (num3 == null || (str3 = num3.toString()) == null) {
            str3 = "";
        }
        C09530e4 A1L5 = AbstractC166987dD.A1L("expiry_month", str3);
        String str7 = cardDetails.A09;
        if (str7 == null) {
            str7 = "";
        }
        C09530e4 A1L6 = AbstractC166987dD.A1L("csc", str7);
        String str8 = cardDetails.A07;
        if (str8 == null) {
            str4 = "";
        } else {
            str4 = AbstractC25227BEk.A0w(str8, 0, 6);
        }
        C09530e4 A1L7 = AbstractC166987dD.A1L("credit_card_first_6", str4);
        String str9 = cardDetails.A0A;
        if (str9 == null) {
            str9 = "";
        }
        C09530e4 A1L8 = AbstractC166987dD.A1L("credit_card_last4", str9);
        if (autofillData != null && (obj = autofillData.A00.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) != null) {
            obj2 = obj;
        }
        LinkedHashMap A06 = AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, AbstractC166987dD.A1L("cardholder_name", obj2));
        C14360o3.A0C(A06, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        C14360o3.A0B(A06, 0);
        A1I.put("card_info", A06);
        bitSet.set(0);
        String str10 = this.A0E;
        LinkedHashMap A0p = AbstractC25233BEq.A0p("partner_api_secret", AnonymousClass001.A0i("proof.", str10, str5, '.'), AbstractC166987dD.A1L("device_key_pub", str10));
        C14360o3.A0C(A0p, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        C14360o3.A0B(A0p, 0);
        A1I.put("device_secrets", A0p);
        bitSet.set(1);
        A1I.put("hybrid_prompt_enabled", true);
        bitSet.set(2);
        C27924CSj c27924CSj = this.A04;
        A1I.put("on_save_contact", AbstractC58322PtE.A0e(new C30193DRy(c27924CSj, 20), 31));
        bitSet.set(5);
        A1I.put("on_save_payment_completed", AbstractC58322PtE.A0e(new C30751Dfo(0, autofillData, c27924CSj), 32));
        bitSet.set(6);
        A1I.put("on_decline", AbstractC58322PtE.A0e(new DHZ(23, autofillData, so2, c27924CSj), 28));
        bitSet.set(4);
        AbstractC58323PtF.A1M(new C30712DfA(this.A02, 13), A1I, 29);
        AbstractC58323PtF.A1N(new C65113Tdo(this.A01, this.A05, this.A07, this.A0D, this.A0F, this.A0H, 2), A1I, 30);
        if (bitSet.nextClearBit(0) >= 9) {
            C63717SsX c63717SsX = new C63717SsX(AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E());
            Context context = this.A00;
            SKL skl = qe0.A01;
            c63717SsX.E2V(context, skl.A00(), VRA.A00(skl.A00, false));
            c63021Sam.A01(num, null, 772805755);
            return C0eB.A00;
        }
        throw AbstractC31172DnG.A0v();
    }
}
