package X;

import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.T7k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64278T7k implements C2n2 {
    public static final C64278T7k A00 = new C64278T7k();

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ImmutableList build;
        C2JS optionalTreeField;
        C2JS c2js = (C2JS) obj;
        AddressFormFieldsConfig addressFormFieldsConfig = null;
        ImmutableList.of();
        ImmutableList.Builder builder = ImmutableList.builder();
        if (c2js == null) {
            build = ImmutableList.of();
        } else {
            C2JS optionalTreeField2 = c2js.getOptionalTreeField(0, "fbpay_account_extended", C58956QRs.class, 210136575);
            if (optionalTreeField2 != null && (optionalTreeField = optionalTreeField2.getOptionalTreeField(0, "fbpay_account", C58955QRr.class, -749555483)) != null) {
                Iterator<E> it = MSX.A0D(optionalTreeField, C58954QRq.class, "shipping_addresses", 0, 141846900).iterator();
                while (it.hasNext()) {
                    builder.add((Object) AbstractC25225BEi.A0l(it).reinterpretRequired(0, QTZ.class, 332146597));
                }
            }
            C2JS A02 = c2js.A02(C58957QRt.class, "payments_address_form_fields_config(query_params:{\"payment_type\":$payment_type})", -930340835);
            if (A02 != null) {
                UXS uxs = (UXS) A02.reinterpretRequired(0, UXS.class, -1659328637);
                C14360o3.A07(uxs);
                addressFormFieldsConfig = WF4.A00(uxs);
            }
            build = builder.build();
        }
        AbstractC63311ShH.A04(build, "addresses");
        return new C62713SNc(addressFormFieldsConfig, build);
    }
}
