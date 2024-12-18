package X;

import com.instagram.model.mediatype.ProductType;

/* renamed from: X.4Sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC95664Sa {
    public static final String A00(C4SH c4sh) {
        Integer num;
        String str;
        C75363a3 c75363a3 = c4sh.A04;
        if (c4sh.A0P) {
            num = C05F.A01;
        } else if (c75363a3 != null) {
            ProductType productType = c75363a3.A09;
            if (productType != null && (str = productType.A00) != null) {
                return str;
            }
            num = c75363a3.A0E;
        } else {
            EnumC40111tc enumC40111tc = c4sh.A02;
            if (enumC40111tc != EnumC40111tc.A09 && enumC40111tc != EnumC40111tc.A0B) {
                if (enumC40111tc == EnumC40111tc.A0L) {
                    num = C05F.A0N;
                } else if (enumC40111tc == EnumC40111tc.A0Q) {
                    num = C05F.A15;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Media ID: ");
                    sb.append(c4sh);
                    sb.append(", media type: ");
                    sb.append(enumC40111tc);
                    String obj = sb.toString();
                    C14360o3.A07(obj);
                    C0w9.A03("VideoAnalyticsCommon_getVideoTypeFromMetaData", obj);
                    return "unknown";
                }
            } else {
                num = C05F.A00;
            }
        }
        return AbstractC95674Sb.A00(num);
    }
}
