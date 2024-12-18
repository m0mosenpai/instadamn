package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.6sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152056sq {
    public final Map A00 = new HashMap();
    public final Map A01;

    public static void A00(C07R c07r, C07X c07x, Object obj, List list) {
        Method method;
        Object[] objArr;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    C152066sr c152066sr = (C152066sr) list.get(size);
                    try {
                        int i = c152066sr.A00;
                        if (i != 0) {
                            if (i != 1) {
                                method = c152066sr.A01;
                                objArr = new Object[]{c07x, c07r};
                            } else {
                                method = c152066sr.A01;
                                objArr = new Object[]{c07x};
                            }
                        } else {
                            method = c152066sr.A01;
                            objArr = new Object[0];
                        }
                        method.invoke(obj, objArr);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C152056sq(Map map) {
        this.A01 = map;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            List list = (List) this.A00.get(value);
            if (list == null) {
                list = new ArrayList();
                this.A00.put(value, list);
            }
            list.add(entry.getKey());
        }
    }
}
