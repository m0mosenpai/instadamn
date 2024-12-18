package X;

import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public abstract class I6O {
    public static void A00(InterfaceC02590Ai interfaceC02590Ai, INS ins, C41643IbZ c41643IbZ, Product product) {
        String str;
        interfaceC02590Ai.AAP("waterfall_id", ins.A04);
        interfaceC02590Ai.AAP("prior_module", ins.A03);
        EnumC39566Hdc A00 = I7Q.A00(c41643IbZ.A03());
        if (A00 != null) {
            int ordinal = A00.ordinal();
            if (ordinal != 2) {
                if (ordinal == 1) {
                    str = "product_item";
                }
            } else {
                str = "product_group";
            }
            interfaceC02590Ai.AAP("product_row_type", str);
            interfaceC02590Ai.AAP("product_id", product.A0H);
        }
        str = "";
        interfaceC02590Ai.AAP("product_row_type", str);
        interfaceC02590Ai.AAP("product_id", product.A0H);
    }
}
