package X;

import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hkr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39781Hkr {
    public static BrandedContentGatingInfo A00(Integer num, String str, List list, List list2, Map map) {
        HashMap hashMap;
        ArrayList arrayList = null;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = null;
        }
        if (list != null) {
            arrayList = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BrandedContentGatingCountryMinimumAge) it.next()).ErM());
            }
        }
        return new BrandedContentGatingInfo(num, str, hashMap, arrayList, list2);
    }
}
