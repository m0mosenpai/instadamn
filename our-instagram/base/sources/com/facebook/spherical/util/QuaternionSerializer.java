package com.facebook.spherical.util;

import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C121555ex;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes10.dex */
public class QuaternionSerializer extends JsonSerializer {
    static {
        C121555ex.A08.putIfAbsent(Quaternion.class, new Object());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Quaternion quaternion = (Quaternion) obj;
        if (quaternion == null) {
            anonymousClass182.A0b();
        }
        anonymousClass182.A0d();
        float f = quaternion.w;
        anonymousClass182.A0r("w");
        anonymousClass182.A0g(f);
        float f2 = quaternion.x;
        anonymousClass182.A0r("x");
        anonymousClass182.A0g(f2);
        float f3 = quaternion.y;
        anonymousClass182.A0r("y");
        anonymousClass182.A0g(f3);
        float f4 = quaternion.z;
        anonymousClass182.A0r("z");
        anonymousClass182.A0g(f4);
        anonymousClass182.A0a();
    }
}
