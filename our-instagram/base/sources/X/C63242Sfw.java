package X;

import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.util.Collection;

/* renamed from: X.Sfw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63242Sfw {
    public static boolean A02(Object obj, Collection collection, Collection collection2) {
        if (collection == null) {
            if (collection2 != null) {
                return !collection2.contains(obj);
            }
            return false;
        }
        if (collection2 == null) {
            return collection.contains(obj);
        }
        return !collection2.contains(obj) || collection.contains(obj);
    }

    public static C64523THw A00(java.util.Set set, java.util.Set set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return new C64523THw(set, set2);
    }

    public static boolean A01(BeanDeserializerBase beanDeserializerBase, Object obj) {
        return A02(obj, beanDeserializerBase.A0C, beanDeserializerBase.A0D);
    }
}
