package X;

/* renamed from: X.UlZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67412UlZ extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow = new C4OW(c95124Py, "can_add_to_bag");
        C4OW c4ow2 = new C4OW(c95124Py, "can_enable_restock_reminder");
        C4OW c4ow3 = new C4OW(c95124Py, "can_show_inventory_quantity");
        C4OK c4ok = new C4OK(C67409UlW.class, "currency_amount", 1635284846);
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow4 = new C4OW(c94894Ou, "full_inventory_quantity");
        C4OW c4ow5 = new C4OW(c95124Py, "has_free_shipping");
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ok, c4ow4, c4ow5, new C4OW(c94754Oe, "ig_referrer_fbid"), new C4OW(c94894Ou, "inventory_quantity"), new C4OW(c95124Py, "is_shopify_merchant"), new C4OW(c95124Py, "product_group_has_inventory"), new C4OW(c94754Oe, "receiver_id"), new C4OK(C67411UlY.class, "shipping_and_return", -1703107395), new C4OW(c94894Ou, "viewer_purchase_limit")});
    }

    public C67412UlZ(int i) {
        super(i);
    }

    public C67412UlZ() {
        super(-1035046048);
    }
}