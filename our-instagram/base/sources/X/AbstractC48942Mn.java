package X;

import com.facebook.nativeutil.NativeList;
import com.facebook.nativeutil.NativeMap;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48942Mn {
    public static Object A00(Object obj) {
        List list;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Float) && !(obj instanceof Byte)) {
            if (obj instanceof Map) {
                return new NativeMap((Map) obj);
            }
            if (obj.getClass().isArray()) {
                NativeList nativeList = NativeList.$redex_init_class;
                list = ImmutableList.of(obj);
            } else {
                if (!(obj instanceof List)) {
                    return obj;
                }
                list = (List) obj;
            }
            return new NativeList(list);
        }
        return Double.valueOf(((Number) obj).doubleValue());
    }
}
