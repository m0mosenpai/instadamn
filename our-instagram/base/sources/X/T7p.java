package X;

/* loaded from: classes10.dex */
public final class T7p implements C2n2 {
    public static final T7p A00 = new T7p();

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C2JS c2js = (C2JS) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        if (c2js != null) {
            C2JS optionalTreeField = c2js.getOptionalTreeField(1, "fbpay_account_extended", C59962Qrk.class, 811404739);
            if (optionalTreeField != null) {
                z2 = optionalTreeField.getCoercedBooleanField(0, "should_show_connect_in_hub");
                z3 = optionalTreeField.getCoercedBooleanField(1, "should_show_orders_in_hub");
            }
            C2JS optionalTreeField2 = c2js.getOptionalTreeField(0, "transaction_hub_metadata", C59963Qrl.class, -264074919);
            if (optionalTreeField2 != null) {
                z = optionalTreeField2.getCoercedBooleanField(0, "show_all_payment_activities_button");
            }
        }
        return new C62726SNq(z, z2, z3);
    }
}
