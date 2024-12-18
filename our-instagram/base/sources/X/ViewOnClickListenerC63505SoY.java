package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.locale.Country;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.paymentmethods.api.FbPayBankAccount;
import com.fbpay.hub.paymentmethods.api.FbPayCreditCard;
import com.fbpay.hub.paymentmethods.api.FbPayPayPal;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;

/* renamed from: X.SoY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC63505SoY implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public ViewOnClickListenerC63505SoY(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [X.Vlg, X.R8P] */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.Vlg, X.Uuq] */
    /* JADX WARN: Type inference failed for: r6v13, types: [X.SHg, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        long j;
        int i;
        Object addressCellParams;
        C62902SWi c62902SWi;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1076221321);
                ((XBV) this.A01).onCancel();
                QEV qev = (QEV) this.A02;
                QER qer = qev.A01;
                Integer num = C05F.A0C;
                String str = ((AbstractC58879QEp) qev).A02;
                String str2 = this.A03;
                String str3 = qev.A02.A0A;
                if (str3 != null) {
                    j = Long.parseLong(str3);
                } else {
                    j = 0;
                }
                qer.A0G(num, str, str2, j);
                i = 357024130;
                break;
            case 1:
                A05 = C0f9.A05(990391244);
                REI rei = (REI) this.A01;
                FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) this.A02;
                String str4 = this.A03;
                Bundle A0b = AbstractC166987dD.A0b();
                int i2 = fbPayPaymentMethod.A00;
                int i3 = 3;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                LinkedHashMap A08 = AbstractC58442PvL.A08(rei.A04);
                                A08.put("target_name", "edit_shoppay");
                                AbstractC58318PtA.A1X(A08);
                                rei.A0E.Chz("user_edit_credential_enter", A08);
                                A0b.putParcelable("shop_pay_credential", fbPayPaymentMethod.A05);
                                A0b.putParcelable("logger_data", rei.A04);
                                c62902SWi = new C62902SWi("edit_shop_pay", A0b);
                                i3 = 6;
                            }
                            i = 575482251;
                            break;
                        } else {
                            FbPayBankAccount fbPayBankAccount = fbPayPaymentMethod.A02;
                            fbPayBankAccount.getClass();
                            A0b.putString("credentialID", fbPayBankAccount.A00);
                            A0b.putString(DialogModule.KEY_TITLE, fbPayPaymentMethod.A07);
                            c62902SWi = new C62902SWi("bank_account", A0b);
                        }
                    } else {
                        LinkedHashMap A082 = AbstractC58442PvL.A08(rei.A04);
                        FbPayPayPal fbPayPayPal = fbPayPaymentMethod.A04;
                        fbPayPayPal.getClass();
                        String str5 = fbPayPayPal.A02;
                        str5.getClass();
                        AbstractC58320PtC.A1Q(str5, A082);
                        C2GC c2gc = rei.A0E;
                        c2gc.Chz("fbpay_edit_paypal_click", AbstractC58318PtA.A10(A082));
                        A082.put("target_name", "paypal");
                        A082.put("credential_type", "paypal_ba");
                        c2gc.Chz("user_edit_credential_enter", A082);
                        A0b.putParcelable("paypal_credential", fbPayPayPal);
                        A0b.putParcelable("logger_data", rei.A04);
                        c62902SWi = new C62902SWi("edit_paypal", A0b);
                        c62902SWi.A00 = 2;
                    }
                    C63167SeR.A00(((Q8X) rei).A06, c62902SWi);
                    i = 575482251;
                } else {
                    C63307ShD.A01().markerStart(110175975);
                    LinkedHashMap A083 = AbstractC58442PvL.A08(rei.A04);
                    FbPayCreditCard fbPayCreditCard = fbPayPaymentMethod.A03;
                    fbPayCreditCard.getClass();
                    String str6 = fbPayCreditCard.A09;
                    str6.getClass();
                    AbstractC58320PtC.A1Q(str6, A083);
                    C2GC c2gc2 = rei.A0E;
                    c2gc2.Chz("fbpay_edit_card_click", AbstractC58318PtA.A10(A083));
                    A083.put("target_name", "edit_card");
                    A083.put("credential_type", "credit_card");
                    A083.put(AbstractC63083Sc6.A00(), rei.A04.A00());
                    A083.put("logger_data", rei.A04);
                    c2gc2.Chz("user_edit_credential_enter", A083);
                    FBPayAddress fBPayAddress = fbPayCreditCard.A00;
                    fBPayAddress.getClass();
                    FBPayLoggerData fBPayLoggerData = rei.A04;
                    boolean z = rei.A0H;
                    boolean z2 = rei.A0I;
                    boolean z3 = rei.A0J;
                    String str7 = fbPayPaymentMethod.A07;
                    str7.getClass();
                    String str8 = fbPayCreditCard.A0A;
                    String A0R = AnonymousClass001.A0R(fbPayCreditCard.A07, fbPayCreditCard.A08.substring(2, 4));
                    String str9 = fbPayCreditCard.A04;
                    str9.getClass();
                    String str10 = fBPayAddress.A04;
                    str10.getClass();
                    String str11 = fBPayAddress.A05;
                    String str12 = fBPayAddress.A00;
                    str12.getClass();
                    String str13 = fBPayAddress.A03;
                    str13.getClass();
                    String str14 = fBPayAddress.A02;
                    str14.getClass();
                    String str15 = fBPayAddress.A01;
                    str15.getClass();
                    String str16 = fbPayCreditCard.A06;
                    str16.getClass();
                    String str17 = fbPayCreditCard.A05;
                    str17.getClass();
                    AddressFormFieldsConfig addressFormFieldsConfig = rei.A03;
                    EnumC61219RhJ enumC61219RhJ = fbPayCreditCard.A01;
                    C63184Sej c63184Sej = new C63184Sej(str7, str6);
                    c63184Sej.A05 = str4;
                    c63184Sej.A04 = str16;
                    FormLogEvents formLogEvents = new FormLogEvents("fbpay_edit_card_cancel", "fbpay_remove_card_cancel", "fbpay_remove_card_save", "fbpay_edit_card_display", "fbpay_remove_card_click", "fbpay_remove_card_fail", "fbpay_remove_card_succeed", "fbpay_edit_card_save", "fbpay_edit_card_fail", "fbpay_edit_card_succeed");
                    c63184Sej.A00 = fBPayLoggerData;
                    c63184Sej.A02 = formLogEvents;
                    ?? abstractC69334Vlg = new AbstractC69334Vlg(13);
                    abstractC69334Vlg.A0N = true;
                    abstractC69334Vlg.A05 = EnumC68132VCq.A03;
                    abstractC69334Vlg.A0D = str16;
                    abstractC69334Vlg.A0C = str17;
                    abstractC69334Vlg.A0F = str8;
                    abstractC69334Vlg.A0E = A0R;
                    abstractC69334Vlg.A07 = enumC61219RhJ;
                    abstractC69334Vlg.A0B = str9;
                    abstractC69334Vlg.A0N = !z;
                    CreditCardCellParams creditCardCellParams = new CreditCardCellParams((C67658Uuq) abstractC69334Vlg);
                    ImmutableList.Builder builder = c63184Sej.A09;
                    builder.add((Object) creditCardCellParams);
                    if (!z2) {
                        builder.add((Object) AbstractC68352VNm.A00());
                    }
                    if (z3) {
                        C67663Uuv c67663Uuv = new C67663Uuv(-1);
                        c67663Uuv.A03 = 2131953805;
                        c67663Uuv.A07 = true;
                        builder.add((Object) c67663Uuv.A00());
                    }
                    if (z) {
                        addressFormFieldsConfig.getClass();
                        ?? abstractC69334Vlg2 = new AbstractC69334Vlg(11);
                        abstractC69334Vlg2.A01 = addressFormFieldsConfig;
                        abstractC69334Vlg2.A02 = str14;
                        abstractC69334Vlg2.A00 = Country.A00(null, str15);
                        addressCellParams = new BriefAddressCellParams((R8P) abstractC69334Vlg2);
                    } else {
                        addressFormFieldsConfig.getClass();
                        C67662Uuu c67662Uuu = new C67662Uuu(addressFormFieldsConfig, 11);
                        c67662Uuu.A0N = str10;
                        c67662Uuu.A0I = str11;
                        c67662Uuu.A0J = str12;
                        c67662Uuu.A0M = str13;
                        c67662Uuu.A0L = str14;
                        c67662Uuu.A0B = Country.A00(null, str15);
                        c67662Uuu.A0X = false;
                        c67662Uuu.A0Z = false;
                        c67662Uuu.A0U = true;
                        addressCellParams = new AddressCellParams(c67662Uuu);
                    }
                    builder.add(addressCellParams);
                    if (z2) {
                        builder.add((Object) AbstractC68352VNm.A00());
                    }
                    ?? obj = new Object();
                    obj.A03 = 2131962797;
                    int i4 = 2131962795;
                    if (AbstractC58319PtB.A1O()) {
                        i4 = 2131966610;
                    }
                    obj.A00 = i4;
                    A0b.putParcelable("form_params", C63184Sej.A00(obj, c63184Sej, 2131962796));
                    c62902SWi = new C62902SWi("form", A0b);
                }
                c62902SWi.A00 = i3;
                C63167SeR.A00(((Q8X) rei).A06, c62902SWi);
                i = 575482251;
            case 2:
                A05 = C0f9.A05(-322724464);
                C64480TFq c64480TFq = (C64480TFq) this.A02;
                C64480TFq.A01(c64480TFq, "ctc_confirmation_dialog_call");
                Activity activity = (Activity) this.A01;
                boolean A07 = AbstractC23451Ch.A07(activity, "android.permission.CALL_PHONE");
                String str18 = this.A03;
                if (A07) {
                    C64480TFq.A01(c64480TFq, "ctc_call_initiated_directly");
                    Intent data = AbstractC58318PtA.A0E("android.intent.action.CALL").setData(AbstractC08820cl.A03(str18));
                    C14360o3.A07(data);
                    C12260kU.A00(activity, data);
                } else {
                    C64480TFq.A01(c64480TFq, "ctc_permission_request");
                    AbstractC43592JPx.A1C(activity, new C36163Fxd(activity, c64480TFq, str18, 2), "android.permission.CALL_PHONE");
                }
                i = 1150752241;
                break;
            default:
                return;
        }
        C0f9.A0C(i, A05);
    }
}
