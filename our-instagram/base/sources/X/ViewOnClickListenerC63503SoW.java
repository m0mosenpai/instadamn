package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.SoW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC63503SoW implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public ViewOnClickListenerC63503SoW(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [X.Vlg, X.Uuq] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.Vlg, X.R8P] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        ImmutableList immutableList;
        Object addressCellParams;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(254952334);
                DefaultBrowserLiteChrome defaultBrowserLiteChrome = (DefaultBrowserLiteChrome) this.A01;
                if (defaultBrowserLiteChrome.A0G == null) {
                    i = 1607316613;
                    break;
                } else {
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("action", this.A02);
                    A1G.put("url", defaultBrowserLiteChrome.A0G.A05());
                    defaultBrowserLiteChrome.A0B.A07(defaultBrowserLiteChrome.A02, A1G);
                    i = -1395848720;
                    break;
                }
            case 1:
                A05 = C0f9.A05(948322659);
                ((REL) this.A01).A06(this.A02);
                i = -1910413431;
                break;
            default:
                A05 = C0f9.A05(1740602194);
                REA rea = (REA) this.A01;
                SparseArray sparseArray = Q83.A06;
                REI rei = rea.A01;
                String str = this.A02;
                C63307ShD.A01().markerStart(110173292);
                Bundle A0H = AbstractC58322PtE.A0H(rei.A0E, "fbpay_add_card_click", AbstractC58442PvL.A08(rei.A04));
                FBPayLoggerData fBPayLoggerData = rei.A04;
                boolean z = rei.A0H;
                boolean z2 = rei.A0I;
                AddressFormFieldsConfig addressFormFieldsConfig = rei.A03;
                FbPayNewCreditCardOption fbPayNewCreditCardOption = rei.A05;
                if (fbPayNewCreditCardOption != null) {
                    immutableList = fbPayNewCreditCardOption.A00;
                } else {
                    immutableList = null;
                }
                C2FP.A0E().A06();
                EnumC68132VCq enumC68132VCq = EnumC68132VCq.A03;
                C63184Sej c63184Sej = new C63184Sej(3, 2131969395, null, 0);
                c63184Sej.A05 = str;
                FormLogEvents formLogEvents = new FormLogEvents("fbpay_add_card_cancel", null, null, "fbpay_add_card_display", null, null, null, "fbpay_add_card_save", "fbpay_add_card_fail", "fbpay_add_card_succeed");
                c63184Sej.A00 = fBPayLoggerData;
                c63184Sej.A02 = formLogEvents;
                ?? abstractC69334Vlg = new AbstractC69334Vlg(13);
                abstractC69334Vlg.A0N = true;
                abstractC69334Vlg.A05 = enumC68132VCq;
                abstractC69334Vlg.A05 = enumC68132VCq;
                abstractC69334Vlg.A08 = immutableList;
                abstractC69334Vlg.A0N = !z;
                CreditCardCellParams creditCardCellParams = new CreditCardCellParams((C67658Uuq) abstractC69334Vlg);
                ImmutableList.Builder builder = c63184Sej.A09;
                builder.add((Object) creditCardCellParams);
                if (!z2) {
                    builder.add((Object) AbstractC68352VNm.A00());
                }
                addressFormFieldsConfig.getClass();
                if (z) {
                    ?? abstractC69334Vlg2 = new AbstractC69334Vlg(11);
                    abstractC69334Vlg2.A01 = addressFormFieldsConfig;
                    addressCellParams = new BriefAddressCellParams((R8P) abstractC69334Vlg2);
                } else {
                    C67662Uuu c67662Uuu = new C67662Uuu(addressFormFieldsConfig, 11);
                    c67662Uuu.A0X = false;
                    c67662Uuu.A0Z = false;
                    c67662Uuu.A0U = true;
                    addressCellParams = new AddressCellParams(c67662Uuu);
                }
                builder.add(addressCellParams);
                if (z2) {
                    builder.add((Object) AbstractC68352VNm.A00());
                }
                A0H.putParcelable("form_params", c63184Sej.A01());
                C62902SWi c62902SWi = new C62902SWi("form", A0H);
                c62902SWi.A00 = 3;
                C63167SeR.A00(((Q8X) rei).A06, c62902SWi);
                i = -1863322946;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
