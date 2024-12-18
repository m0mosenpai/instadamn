package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;

/* loaded from: classes7.dex */
public final class INP {
    public final C25531Mh A00;
    public final C25531Mh A01;
    public final C25531Mh A02;
    public final C25531Mh A03;
    public final /* synthetic */ C64952wt A04;

    /* JADX WARN: Code restructure failed: missing block: B:194:0x033e, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0363, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public INP(com.instagram.model.shopping.productfeed.ProductFeedItem r31, com.instagram.model.shopping.productfeed.ProductTile r32, X.C64952wt r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.INP.<init>(com.instagram.model.shopping.productfeed.ProductFeedItem, com.instagram.model.shopping.productfeed.ProductTile, X.2wt, int, int):void");
    }

    public final void A00() {
        if (AbstractC25226BEj.A1Z(this.A02)) {
            this.A03.Cht();
        }
        if (AbstractC25226BEj.A1Z(this.A00)) {
            this.A01.Cht();
        }
    }

    public final /* bridge */ /* synthetic */ void A01(InterfaceC99144cb interfaceC99144cb) {
        C25531Mh c25531Mh = this.A03;
        c25531Mh.A0R("product_collection_type", String.valueOf(interfaceC99144cb.B60()));
        C25531Mh c25531Mh2 = this.A01;
        c25531Mh2.A0R("product_collection_type", String.valueOf(interfaceC99144cb.B60()));
        String Byk = interfaceC99144cb.Byk();
        if (Byk != null) {
            c25531Mh.A0l(Byk);
            c25531Mh2.A0l(Byk);
        }
        String Byo = interfaceC99144cb.Byo();
        if (Byo != null) {
            c25531Mh.A0R("source_media_type", Byo);
        }
        if (interfaceC99144cb instanceof MultiProductComponent) {
            MultiProductComponent multiProductComponent = (MultiProductComponent) interfaceC99144cb;
            c25531Mh.A0R("submodule", multiProductComponent.A00());
            c25531Mh2.A0R("legacy_ui_component", multiProductComponent.A00());
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Integer num, String str) {
        if (str != null) {
            this.A03.A0R("source_media_type", str);
        }
        if (num != null) {
            this.A03.A0Q("chaining_position", AbstractC31171DnF.A0V(num.intValue()));
        }
    }

    public final /* bridge */ /* synthetic */ void A03(String str) {
        if (str != null) {
            this.A03.A0R("submodule", str);
            this.A01.A0R("legacy_ui_component", str);
        }
    }
}
