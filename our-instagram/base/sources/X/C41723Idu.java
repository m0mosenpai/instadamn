package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Idu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41723Idu {
    public static final C41723Idu A06 = new C41723Idu(new C41617Ib7());
    public final C38321qM A00;
    public final EnumC39541HdD A01;
    public final C39354HZt A02;
    public final Integer A03;
    public final Map A04;
    public final Map A05;

    public C41723Idu(C38321qM c38321qM, EnumC39541HdD enumC39541HdD, C39354HZt c39354HZt, Integer num, Map map, Map map2) {
        this.A01 = enumC39541HdD;
        this.A00 = c38321qM;
        this.A05 = map2;
        this.A03 = num;
        this.A04 = map;
        this.A02 = c39354HZt;
    }

    public static String A00(UserSession userSession, Product product) {
        List<ProductVariantPossibleValueDictIntf> list;
        if (C18U.A06(C06090Tz.A05, userSession, 36312561213244589L) && (list = product.A0O) != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder("key");
            for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                if (productVariantPossibleValueDictIntf.CGx() == ProductVariantVisualStyle.A05) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    sb.append(productVariantPossibleValueDictIntf.getId());
                    sb.append(":");
                    sb.append(productVariantPossibleValueDictIntf.getValue());
                }
            }
            return sb.toString();
        }
        return product.A0H;
    }

    public final List A01(UserSession userSession, Product product) {
        Map map = this.A05;
        if (map.containsKey(A00(userSession, product))) {
            return (List) map.get(A00(userSession, product));
        }
        C14360o3.A0B(product, 1);
        return Collections.singletonList(new C39351HZq(product.A07, AnonymousClass001.A0R(product.A0H, "_image_0"), product.A0I));
    }

    public C41723Idu(C41617Ib7 c41617Ib7) {
        this.A01 = c41617Ib7.A01;
        this.A00 = c41617Ib7.A00;
        this.A05 = c41617Ib7.A05;
        this.A03 = c41617Ib7.A03;
        this.A04 = c41617Ib7.A04;
        this.A02 = c41617Ib7.A02;
    }
}
