package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117835Ut implements InterfaceC117845Uu {
    public final Map A00;
    public final Map A01;
    public final InterfaceC16660sJ A02;

    @Override // X.InterfaceC117845Uu
    public final boolean AFS(Object obj) {
        return ((Boolean) this.A02.invoke(obj)).booleanValue();
    }

    @Override // X.InterfaceC117845Uu
    public final Object AJe(String str) {
        Map map = this.A01;
        List list = (List) map.remove(str);
        if (list != null && (!list.isEmpty())) {
            if (list.size() > 1) {
                map.put(str, list.subList(1, list.size()));
            }
            return list.get(0);
        }
        return null;
    }

    @Override // X.InterfaceC117845Uu
    public final Map E4F() {
        ArrayList arrayList;
        LinkedHashMap A03 = AbstractC06930Yk.A03(this.A01);
        for (Map.Entry entry : this.A00.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object invoke = ((InterfaceC16820sZ) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (AFS(invoke)) {
                    arrayList = AbstractC16960so.A1M(invoke);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(invoke);
                    sb.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                int size = list.size();
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object invoke2 = ((InterfaceC16820sZ) list.get(i)).invoke();
                    if (invoke2 != null && !AFS(invoke2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(invoke2);
                        sb2.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
                        throw new IllegalStateException(sb2.toString());
                    }
                    arrayList.add(invoke2);
                }
            }
            A03.put(key, arrayList);
        }
        return A03;
    }

    public C117835Ut(Map map, InterfaceC16660sJ interfaceC16660sJ) {
        LinkedHashMap linkedHashMap;
        this.A02 = interfaceC16660sJ;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.A01 = linkedHashMap;
        this.A00 = new LinkedHashMap();
    }

    @Override // X.InterfaceC117845Uu
    public final InterfaceC138116Np EDf(final String str, final InterfaceC16820sZ interfaceC16820sZ) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!C11K.A01(str.charAt(i))) {
                Map map = this.A00;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    map.put(str, obj);
                }
                ((List) obj).add(interfaceC16820sZ);
                return new InterfaceC138116Np() { // from class: X.6No
                    @Override // X.InterfaceC138116Np
                    public final void F9T() {
                        Map map2 = C117835Ut.this.A00;
                        String str2 = str;
                        List list = (List) map2.remove(str2);
                        if (list != null) {
                            list.remove(interfaceC16820sZ);
                            if (!list.isEmpty()) {
                                map2.put(str2, list);
                            }
                        }
                    }
                };
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
