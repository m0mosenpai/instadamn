package X;

import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public abstract class S20 {
    /* JADX WARN: Type inference failed for: r2v5, types: [X.SHg, java.lang.Object] */
    public static FormParams A00(AddressFormFieldsConfig addressFormFieldsConfig, FBPayLoggerData fBPayLoggerData, FormLogEvents formLogEvents, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        C63184Sej c63184Sej = new C63184Sej(2, str == null ? 2131973921 : 2131973922, str, str == null ? 0 : 2131962794);
        c63184Sej.A00 = fBPayLoggerData;
        c63184Sej.A02 = formLogEvents;
        C67664Uuw c67664Uuw = new C67664Uuw(4);
        c67664Uuw.A03 = 2131954857;
        c67664Uuw.A0B = str2;
        TextCellParams A00 = c67664Uuw.A00();
        ImmutableList.Builder builder = c63184Sej.A09;
        builder.add((Object) A00);
        C67662Uuu c67662Uuu = new C67662Uuu(addressFormFieldsConfig, 11);
        c67662Uuu.A0G = str3;
        c67662Uuu.A0N = str4;
        c67662Uuu.A0I = str5;
        c67662Uuu.A0J = str6;
        c67662Uuu.A0L = str7;
        c67662Uuu.A0M = str8;
        c67662Uuu.A0B = str9 != null ? Country.A00(null, str9) : null;
        builder.add((Object) new AddressCellParams(c67662Uuu));
        C67663Uuv c67663Uuv = new C67663Uuv(16);
        int i = 2131954855;
        if (AbstractC58319PtB.A1O()) {
            i = 2131966605;
        }
        W4W.A00(c67663Uuv, builder, i, z);
        ?? obj = new Object();
        obj.A03 = 2131962793;
        obj.A00 = 2131962791;
        return C63184Sej.A00(obj, c63184Sej, 2131962792);
    }
}
