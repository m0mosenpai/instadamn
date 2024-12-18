package X;

import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5oZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126955oZ {
    public static final FxCalAccountLinkageInfo A00(Integer num, List list) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            String str = (String) map.get("account_id");
            String str2 = (String) map.get("instagram_id");
            String str3 = (String) map.get("account_type");
            String str4 = (String) map.get("account_name");
            String str5 = (String) map.get("profile_picture_url");
            String str6 = (String) map.get(AbstractC58346Ptm.A01(19, 8, 121));
            String str7 = (String) map.get("obfuscated_id");
            String str8 = (String) map.get("badge_count");
            int i3 = 0;
            if (str8 != null) {
                try {
                    i = Integer.parseInt(str8);
                } catch (NumberFormatException unused) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            String str9 = (String) map.get("unfiltered_badge_count");
            if (str9 != null) {
                try {
                    i2 = Integer.parseInt(str9);
                } catch (NumberFormatException unused2) {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            String str10 = (String) map.get("ig_l28");
            if (str10 != null) {
                try {
                    i3 = Integer.parseInt(str10);
                } catch (NumberFormatException unused3) {
                }
            }
            String str11 = (String) map.get("unpacked_notifications");
            if (!AbstractC126965oa.A02(str) && !AbstractC126965oa.A02(str3)) {
                if (str != null) {
                    if (str3 != null) {
                        arrayList.add(new FxCalAccount(str, str2, str3, str4, str5, str6, str7, str11, i, i2, i3));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return new FxCalAccountLinkageInfo(num, arrayList, System.currentTimeMillis());
    }
}
