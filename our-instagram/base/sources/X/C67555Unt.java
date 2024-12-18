package X;

/* renamed from: X.Unt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67555Unt extends C2JS implements XK6 {
    @Override // X.XK6
    public final String Bbv() {
        return getOptionalStringField(7, "payout_batch_item_status_text");
    }

    @Override // X.XK6
    public final String Bbn() {
        return A0B("payment_date");
    }

    @Override // X.XK6
    public final String Bbp() {
        return A0C("payment_id");
    }

    @Override // X.XK6
    public final XGr Bbt() {
        return (XGr) getOptionalTreeField(8, "payout_batch_item_payout_amount", C67551Unp.class, -1887400421);
    }

    @Override // X.XK6
    public final VFR Bbu() {
        return (VFR) getOptionalEnumField(6, "payout_batch_item_status", VFR.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.XK6
    public final XIW Bby() {
        return (XIW) getOptionalTreeField(10, "payout_detail_view", C67552Unq.class, -890672286);
    }

    @Override // X.XK6
    public final XIX Bc1() {
        return (XIX) getOptionalTreeField(11, "payout_method_view", C67553Unr.class, -1344103629);
    }

    @Override // X.XK6
    public final XGs Bc2() {
        return (XGs) getOptionalTreeField(9, "payout_records_b2c_tax_amount_sum", C67554Uns.class, -1002096339);
    }

    @Override // X.XK6
    public final String getId() {
        return A07("strong_id__");
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{AbstractC166997dE.A0V(c94754Oe), new C4OW(c94754Oe, "bank_name"), new C4OW(c94754Oe, "bank_account_number"), new C4OW(c94754Oe, "paypal_email"), new C4OW(c94754Oe, "payment_date"), new C4OW(c94754Oe, "payment_id"), new C4OW(c94754Oe, "payout_batch_item_status"), new C4OW(c94754Oe, "payout_batch_item_status_text"), new C4OK(C67551Unp.class, "payout_batch_item_payout_amount", -1887400421), new C4OK(C67554Uns.class, "payout_records_b2c_tax_amount_sum", -1002096339), new C4OK(C67552Unq.class, "payout_detail_view", -890672286), new C4OK(C67553Unr.class, "payout_method_view", -1344103629)});
    }

    public C67555Unt(int i) {
        super(i);
    }

    public C67555Unt() {
        super(-424439604);
    }
}
