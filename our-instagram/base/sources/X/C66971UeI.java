package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.UeI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66971UeI extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(c94754Oe, "total_amount");
        C4OW c4ow2 = new C4OW(c94754Oe, "currency");
        C4OW c4ow3 = new C4OW(c94754Oe, "notes");
        C94894Ou c94894Ou = C94894Ou.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, new C4OW(c94894Ou, "time_created"), new C4OW(c94894Ou, "time_last_updated"), new C4OW(c94754Oe, "order_id"), new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS)});
    }

    public C66971UeI(int i) {
        super(i);
    }

    public C66971UeI() {
        super(-1342703181);
    }
}
