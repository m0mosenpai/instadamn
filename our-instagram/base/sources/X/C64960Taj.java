package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Taj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64960Taj extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ QE1 A02;
    public final /* synthetic */ C62762SPv A03;
    public final /* synthetic */ SO2 A04;
    public final /* synthetic */ C63024Sau A05;
    public final /* synthetic */ C63021Sam A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ Map A0C;
    public final /* synthetic */ java.util.Set A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64960Taj(Context context, Bundle bundle, QE1 qe1, C62762SPv c62762SPv, SO2 so2, C63024Sau c63024Sau, C63021Sam c63021Sam, Integer num, String str, String str2, List list, List list2, Map map, java.util.Set set) {
        super(0);
        this.A06 = c63021Sam;
        this.A07 = num;
        this.A0C = map;
        this.A08 = str;
        this.A04 = so2;
        this.A0A = list;
        this.A00 = context;
        this.A0B = list2;
        this.A02 = qe1;
        this.A03 = c62762SPv;
        this.A05 = c63024Sau;
        this.A0D = set;
        this.A09 = str2;
        this.A01 = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ?? r6;
        Object A06;
        boolean z;
        String A0o;
        String str;
        C63021Sam c63021Sam = this.A06;
        Integer num = this.A07;
        c63021Sam.A02(num, null, "BloksBottomSheetShowInMainThreadStart", 772805755);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        BitSet bitSet = new BitSet(8);
        A1I.put("logging_metadata", this.A0C);
        bitSet.set(4);
        AbstractC58322PtE.A1O("is_reoptin", AbstractC43593JPy.A0n(this.A08, "RE_OPT_IN"), bitSet, A1I);
        AbstractC58322PtE.A1N("has_accepted_consent", Boolean.valueOf(this.A04.A00), bitSet, A1I);
        List list = this.A0A;
        if (list != null) {
            r6 = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r6.add(C63285Sgk.A02((AutofillData) it.next()));
            }
        } else {
            r6 = C16930sl.A00;
        }
        C14360o3.A0B(r6, 0);
        A1I.put("contacts", r6);
        bitSet.set(1);
        Context context = this.A00;
        List<CardDetails> list2 = this.A0B;
        ArrayList A0q = AbstractC167017dG.A0q(list2);
        for (CardDetails cardDetails : list2) {
            Address address = cardDetails.A00;
            if (address == null) {
                A06 = AbstractC06930Yk.A0E();
            } else {
                String str2 = address.A00;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                C09530e4 A1L = AbstractC166987dD.A1L("care_of", str2);
                String str4 = address.A01;
                if (str4 == null) {
                    str4 = "";
                }
                C09530e4 A1L2 = AbstractC166987dD.A1L(ServerW3CShippingAddressConstants.CITY, str4);
                String str5 = address.A04;
                if (str5 == null) {
                    str5 = "";
                }
                C09530e4 A1L3 = AbstractC166987dD.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str5);
                String str6 = address.A02;
                if (str6 == null) {
                    str6 = "";
                }
                C09530e4 A1L4 = AbstractC166987dD.A1L("country", str6);
                String str7 = address.A05;
                if (str7 == null) {
                    str7 = "";
                }
                C09530e4 A1L5 = AbstractC166987dD.A1L("street1", str7);
                String str8 = address.A06;
                if (str8 == null) {
                    str8 = "";
                }
                C09530e4 A1L6 = AbstractC166987dD.A1L("street2", str8);
                String str9 = address.A07;
                if (str9 == null) {
                    str9 = "";
                }
                C09530e4 A1L7 = AbstractC166987dD.A1L(ServerW3CShippingAddressConstants.POSTAL_CODE, str9);
                String str10 = address.A03;
                if (str10 != null) {
                    str3 = str10;
                }
                A06 = AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3));
                C14360o3.A0C(A06, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
            }
            Boolean bool = cardDetails.A02;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            C09530e4 A1L8 = AbstractC166987dD.A1L("billing_address", A06);
            String str11 = cardDetails.A08;
            String str12 = "";
            if (str11 == null) {
                str11 = "";
            }
            C09530e4 A1L9 = AbstractC166987dD.A1L("credential_id", str11);
            C09530e4 A1L10 = AbstractC166987dD.A1L("card_association_name", C63156Se5.A01(cardDetails.A05).A03);
            Integer num2 = cardDetails.A03;
            if (num2 == null) {
                A0o = "";
            } else {
                A0o = AbstractC58318PtA.A0o(C1Q2.A02(), "%02d", AbstractC166997dE.A1b(num2, 1));
            }
            C09530e4 A1L11 = AbstractC166987dD.A1L("expiry_month", A0o);
            Integer num3 = cardDetails.A04;
            if (num3 == null || (str = num3.toString()) == null) {
                str = "";
            }
            C09530e4 A1L12 = AbstractC166987dD.A1L("expiry_year", str);
            String str13 = cardDetails.A0A;
            if (str13 == null) {
                str13 = "";
            }
            C09530e4 A1L13 = AbstractC166987dD.A1L("last_four_digits", str13);
            String str14 = cardDetails.A06;
            if (str14 == null) {
                str14 = "";
            }
            C09530e4 A1L14 = AbstractC166987dD.A1L("card_image_url", str14);
            String str15 = cardDetails.A09;
            if (str15 == null) {
                str15 = "";
            }
            C09530e4 A1L15 = AbstractC166987dD.A1L("csc", str15);
            String str16 = cardDetails.A07;
            if (str16 != null) {
                str12 = str16;
            }
            LinkedHashMap A062 = AbstractC06930Yk.A06(A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, AbstractC166987dD.A1L("card_number", str12), AbstractC166987dD.A1L("is_default", Boolean.valueOf(z)));
            C14360o3.A0C(A062, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
            A0q.add(A062);
        }
        A1I.put("cards", A0q);
        bitSet.set(0);
        C65037TcS c65037TcS = C65037TcS.A00;
        C14360o3.A0B(c65037TcS, 0);
        A1I.put("on_accept_payment", AbstractC58322PtE.A0e(c65037TcS, 33));
        bitSet.set(5);
        C64976Tb1 c64976Tb1 = C64976Tb1.A00;
        C14360o3.A0B(c64976Tb1, 0);
        A1I.put("on_decline", AbstractC58322PtE.A0e(c64976Tb1, 34));
        bitSet.set(6);
        C65112Tdn c65112Tdn = C65112Tdn.A00;
        C14360o3.A0B(c65112Tdn, 0);
        AbstractC58323PtF.A1M(c65112Tdn, A1I, 35);
        bitSet.set(7);
        AbstractC58323PtF.A1N(new C30732DfU(this.A03, this.A05, this.A0D, this.A01, this.A09, 0), A1I, 36);
        if (bitSet.nextClearBit(0) >= 8) {
            C63718SsY c63718SsY = new C63718SsY(AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E());
            SKL skl = this.A02.A01;
            c63718SsY.E2V(context, skl.A00(), VRA.A00(skl.A00, false));
            c63021Sam.A01(num, null, 772805755);
            return C0eB.A00;
        }
        throw AbstractC31172DnG.A0v();
    }
}
