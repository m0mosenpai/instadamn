package androidx.work;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC48512Kt;
import X.AbstractC58318PtA;
import X.C14360o3;
import X.C48532Kv;
import X.C48552Kx;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ArrayCreatingInputMerger extends AbstractC48512Kt {
    @Override // X.AbstractC48512Kt
    public final C48532Kv A00(List list) {
        Class<?> cls;
        int length;
        Object newInstance;
        C48552Kx c48552Kx = new C48552Kx();
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator A15 = AbstractC166997dE.A15(AbstractC58318PtA.A12(((C48532Kv) it.next()).A00));
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                Object key = A1K.getKey();
                Object value = A1K.getValue();
                if (value == null || (cls = value.getClass()) == null) {
                    cls = String.class;
                }
                Object obj = A1G.get(key);
                C14360o3.A05(key);
                if (obj == null) {
                    if (!cls.isArray()) {
                        newInstance = Array.newInstance(cls, 1);
                        length = 0;
                    } else {
                        C14360o3.A09(value);
                        A1G.put(key, value);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (C14360o3.A0K(cls2, cls)) {
                        C14360o3.A07(value);
                        int length2 = Array.getLength(obj);
                        int length3 = Array.getLength(value);
                        Class<?> componentType = cls2.getComponentType();
                        C14360o3.A0A(componentType);
                        newInstance = Array.newInstance(componentType, length2 + length3);
                        System.arraycopy(obj, 0, newInstance, 0, length2);
                        System.arraycopy(value, 0, newInstance, length2, length3);
                        C14360o3.A07(newInstance);
                        value = newInstance;
                        C14360o3.A09(value);
                        A1G.put(key, value);
                    } else if (C14360o3.A0K(cls2.getComponentType(), cls)) {
                        length = Array.getLength(obj);
                        newInstance = Array.newInstance(cls, length + 1);
                        System.arraycopy(obj, 0, newInstance, 0, length);
                    } else {
                        throw AbstractC58318PtA.A0Y();
                    }
                }
                Array.set(newInstance, length, value);
                C14360o3.A07(newInstance);
                value = newInstance;
                C14360o3.A09(value);
                A1G.put(key, value);
            }
        }
        c48552Kx.A02(A1G);
        return c48552Kx.A00();
    }
}
