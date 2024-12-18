package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.AbstractC121565f4;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C121555ex;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes10.dex */
public class ShopsLiteLineItemSerializer extends JsonSerializer {
    static {
        C121555ex.A08.putIfAbsent(ShopsLiteLineItem.class, new Object());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        ShopsLiteLineItem shopsLiteLineItem = (ShopsLiteLineItem) obj;
        if (shopsLiteLineItem == null) {
            anonymousClass182.A0b();
        }
        anonymousClass182.A0d();
        AbstractC121565f4.A04(anonymousClass182, "variantId", shopsLiteLineItem.variantId);
        int i = shopsLiteLineItem.quantity;
        anonymousClass182.A0r("quantity");
        anonymousClass182.A0h(i);
        boolean z = shopsLiteLineItem.requiresShipping;
        anonymousClass182.A0r("requiresShipping");
        anonymousClass182.A0y(z);
        anonymousClass182.A0a();
    }
}
