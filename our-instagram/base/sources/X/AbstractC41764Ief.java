package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ief, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41764Ief {
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ef, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
    
        if (r3.A04() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0137, code lost:
    
        if (r1 == null) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.common.collect.ImmutableMap A00(com.instagram.common.session.UserSession r10, com.instagram.shopping.intf.ProductDetailsPageArguments r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41764Ief.A00(com.instagram.common.session.UserSession, com.instagram.shopping.intf.ProductDetailsPageArguments, java.lang.String):com.google.common.collect.ImmutableMap");
    }

    public static final ImageUrlBase A01(UserSession userSession, ProductDetailsPageArguments productDetailsPageArguments) {
        ImageInfo imageInfo;
        ProductTileMedia productTileMedia;
        String str;
        Integer num;
        Integer num2;
        if (productDetailsPageArguments.A0E != null && (str = productDetailsPageArguments.A0F) != null && (num = productDetailsPageArguments.A08) != null && (num2 = productDetailsPageArguments.A07) != null) {
            return new SimpleImageUrl(str, num.intValue(), num2.intValue());
        }
        if (C18U.A06(C06090Tz.A05, userSession, 2342155183880143814L) && (productTileMedia = productDetailsPageArguments.A03) != null) {
            imageInfo = productTileMedia.A00;
        } else {
            Product product = productDetailsPageArguments.A06;
            if (product == null) {
                return null;
            }
            imageInfo = product.A07;
        }
        if (imageInfo == null) {
            return null;
        }
        return AbstractC40161tk.A02(imageInfo);
    }

    public static final void A02(Bundle bundle, ImmutableMap immutableMap, UserSession userSession, ProductDetailsPageArguments productDetailsPageArguments, Map map, boolean z, boolean z2) {
        C06090Tz c06090Tz;
        C06090Tz c06090Tz2;
        Map map2 = map;
        C14360o3.A0B(productDetailsPageArguments, 1);
        if (immutableMap == null) {
            immutableMap = A00(userSession, productDetailsPageArguments, AbstractC61112qZ.A00(bundle));
        }
        if (map == null) {
            Object obj = immutableMap.get("cpdp_product_data");
            if (!(obj instanceof Map) || (map2 = (Map) obj) == null) {
                throw AbstractC166987dD.A12("Expected a Map<String,Any?> for cpdp params");
            }
        }
        if (z2) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        Long A0i = AbstractC166997dE.A0i(c06090Tz, userSession, 36593649643881933L);
        C14360o3.A0A(A0i);
        if (z2) {
            c06090Tz2 = C06090Tz.A05;
        } else {
            c06090Tz2 = C06090Tz.A06;
        }
        long A01 = C18U.A01(c06090Tz2, userSession, 36593649643947470L);
        C14360o3.A0A(Long.valueOf(A01));
        HashMap A02 = AbstractC06930Yk.A02(AbstractC37302Gc3.A0l("product_id", map2), AbstractC37302Gc3.A0l("merchant_id", map2), AbstractC166987dD.A1L("cache_version", A0i), AbstractC37302Gc3.A0l("shopping_session_id", map2), AbstractC37302Gc3.A0l("prior_module", map2), AbstractC37302Gc3.A0l("prior_submodule", map2), AbstractC37302Gc3.A0l("ad_id", map2), AbstractC37302Gc3.A0l("ad_tracking_token", map2), AbstractC37302Gc3.A0l("ad_media_id", map2), AbstractC37302Gc3.A0l("m_pk", map2), AbstractC37302Gc3.A0l("product_pinned_media_id", map2), AbstractC37302Gc3.A0l("affiliate_marketer_id", map2));
        if (z) {
            A02.put("layout_type", "BROWSE_HEAVY_PDP_LAYOUT");
        }
        A03(userSession, "com.bloks.www.async.components.CPDPDataAsyncComponentQuery", A02, A01);
    }

    public static final void A04(UserSession userSession, String str, Map map, boolean z) {
        C06090Tz c06090Tz = C06090Tz.A05;
        Long A0i = AbstractC166997dE.A0i(c06090Tz, userSession, 36593649643881933L);
        C14360o3.A0A(A0i);
        double A00 = C18U.A00(c06090Tz, userSession, 37156599598153750L);
        C14360o3.A0A(Double.valueOf(A00));
        HashMap A02 = AbstractC06930Yk.A02(AbstractC37302Gc3.A0l("product_id", map), AbstractC37302Gc3.A0l("merchant_id", map), AbstractC166987dD.A1L("cache_version", A0i), AbstractC37302Gc3.A0l("shopping_session_id", map), AbstractC37302Gc3.A0l("prior_module", map), AbstractC37302Gc3.A0l("prior_submodule", map), AbstractC37302Gc3.A0l("ad_id", map), AbstractC37302Gc3.A0l("ad_tracking_token", map), AbstractC37302Gc3.A0l("ad_media_id", map), AbstractC37302Gc3.A0l("m_pk", map), AbstractC37302Gc3.A0l("product_pinned_media_id", map), AbstractC37302Gc3.A0l("affiliate_marketer_id", map), AbstractC37302Gc3.A0l("direct_from_ad", map));
        if (z) {
            A02.put("layout_type", "BROWSE_HEAVY_PDP_LAYOUT");
        }
        A03(userSession, str, A02, (long) A00);
    }

    public static final void A05(ImageUrl imageUrl, String str, StringBuilder sb) {
        if (imageUrl == null) {
            sb.append(str);
            sb.append("is null, ");
        } else {
            A07(imageUrl.getUrl(), AnonymousClass001.A0R(str, ".url"), sb);
            A06(Integer.valueOf(imageUrl.getWidth()), AnonymousClass001.A0R(str, ".width"), sb);
            A06(Integer.valueOf(imageUrl.getHeight()), AnonymousClass001.A0R(str, ".height"), sb);
        }
    }

    public static final void A06(Integer num, String str, StringBuilder sb) {
        String str2;
        if (num == null) {
            sb.append(str);
            str2 = " is null, ";
        } else {
            int intValue = num.intValue();
            if (intValue >= 1) {
                return;
            }
            sb.append(str);
            sb.append(" is ");
            sb.append(intValue);
            str2 = " < 1, ";
        }
        sb.append(str2);
    }

    public static final void A07(String str, String str2, StringBuilder sb) {
        String str3;
        if (str == null) {
            sb.append(str2);
            str3 = " is null, ";
        } else {
            if (!AbstractC001900j.A0T(str)) {
                return;
            }
            sb.append(str2);
            str3 = " is blank, ";
        }
        sb.append(str3);
    }

    public static final void A03(UserSession userSession, String str, Map map, long j) {
        AnonymousClass638.A00(AnonymousClass636.A00(userSession)).A03(EnumC58683Pzw.A04, null, str, map, null, j, false, false);
    }
}
