package X;

import com.instagram.user.model.CreatorShoppingInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC152566tj {
    public static Map A00(CreatorShoppingInfo creatorShoppingInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List BNf = creatorShoppingInfo.BNf();
        if (BNf != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(BNf, 10));
            Iterator it = BNf.iterator();
            while (it.hasNext()) {
                arrayList.add(((User) it.next()).A07());
            }
            linkedHashMap.put("linked_merchant_accounts", arrayList);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
