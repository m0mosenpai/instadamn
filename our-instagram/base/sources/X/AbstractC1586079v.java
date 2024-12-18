package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.79v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1586079v {
    public static final Object A01(C83403nh c83403nh, String str) {
        if (str != null && c83403nh.A10 == C2EY.A0z) {
            Object obj = c83403nh.A1T;
            if (obj instanceof List) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof C910143t) {
                        C910143t c910143t = (C910143t) obj2;
                        if (c910143t.A02 == 9) {
                            long j = c910143t.A0D;
                            if (j == Long.parseLong(str)) {
                                String A0Q = AnonymousClass001.A0Q("instagram://media_viewer?media_fbid=", j);
                                EnumC910243u enumC910243u = c910143t.A0Q;
                                ExtendedImageUrl extendedImageUrl = c910143t.A0X;
                                GifUrlImpl gifUrlImpl = c910143t.A0Z;
                                if (gifUrlImpl == null) {
                                    gifUrlImpl = null;
                                }
                                List singletonList = Collections.singletonList(new C910143t(extendedImageUrl, enumC910243u, gifUrlImpl, A0Q, c910143t.A08, 4, j, c910143t.A0K, c910143t.A04()));
                                C14360o3.A07(singletonList);
                                return singletonList;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return c83403nh.A1T;
    }

    public static final EnumC159397Cz A00(C83403nh c83403nh) {
        if (c83403nh.A1S()) {
            C45120Jxp c45120Jxp = c83403nh.A0D;
            if (c45120Jxp != null && c45120Jxp.A06) {
                return EnumC159397Cz.A05;
            }
            return EnumC159397Cz.A04;
        }
        if (c83403nh.A1i != null) {
            return EnumC159397Cz.A07;
        }
        return EnumC159397Cz.A06;
    }
}
