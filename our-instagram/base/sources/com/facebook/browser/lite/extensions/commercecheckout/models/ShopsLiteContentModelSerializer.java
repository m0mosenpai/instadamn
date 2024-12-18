package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.AbstractC121565f4;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C121555ex;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class ShopsLiteContentModelSerializer extends JsonSerializer {
    static {
        C121555ex.A08.putIfAbsent(ShopsLiteContentModel.class, new Object());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        ShopsLiteContentModel shopsLiteContentModel = (ShopsLiteContentModel) obj;
        if (shopsLiteContentModel == null) {
            anonymousClass182.A0b();
        }
        anonymousClass182.A0d();
        AbstractC121565f4.A04(anonymousClass182, "fallbackCheckoutUrl", shopsLiteContentModel.fallbackCheckoutUrl);
        AbstractC121565f4.A04(anonymousClass182, "sourceUrl", shopsLiteContentModel.sourceUrl);
        AbstractC121565f4.A04(anonymousClass182, "merchantDomain", shopsLiteContentModel.merchantDomain);
        ArrayList<ShopsLiteLineItem> arrayList = shopsLiteContentModel.lineItems;
        if (arrayList != null) {
            anonymousClass182.A0r("lineItems");
            AbstractC121565f4.A01(anonymousClass182, abstractC913345m, arrayList);
        }
        AbstractC121565f4.A04(anonymousClass182, "visitToken", shopsLiteContentModel.visitToken);
        anonymousClass182.A0a();
    }
}
