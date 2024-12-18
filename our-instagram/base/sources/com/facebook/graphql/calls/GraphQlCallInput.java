package com.facebook.graphql.calls;

import X.AbstractC04050Jw;
import X.C04060Jx;
import X.C0CA;
import X.C0CW;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@JsonSerialize(using = GraphQlCallInputSerializer.class)
/* loaded from: classes.dex */
public abstract class GraphQlCallInput {
    public static final C04060Jx A02 = new C04060Jx();
    public C04060Jx A01 = A02;
    public C0CA A00 = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private Object A00(Object obj) {
        String str;
        if (obj == 0) {
            return null;
        }
        if (obj instanceof C0CW) {
            ArrayList arrayList = ((C0CW) obj).A00;
            if (arrayList.size() > 0 && (arrayList.get(0) instanceof C0CA)) {
                obj = new ArrayList(arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) != null) {
                        obj.add(A00(arrayList.get(i)));
                    }
                }
            } else if (arrayList.size() > 0 && (arrayList.get(0) instanceof C0CW)) {
                obj = new ArrayList(arrayList.size());
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (arrayList.get(i2) != null) {
                        obj.add(A00(arrayList.get(i2)));
                    }
                }
            } else {
                obj = new ArrayList(arrayList.size());
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Object obj2 = arrayList.get(i3);
                    if (obj2 != null) {
                        if (!(obj2 instanceof Number) && !(obj2 instanceof Boolean)) {
                            str = obj2.toString();
                        } else {
                            obj.add(obj2);
                        }
                    } else {
                        str = null;
                    }
                    obj.add(str);
                }
            }
        } else if (obj instanceof C0CA) {
            TreeMap treeMap = new TreeMap();
            A01((C0CA) obj, this, treeMap);
            return treeMap;
        }
        return obj;
    }

    public static void A01(C0CA c0ca, GraphQlCallInput graphQlCallInput, Map map) {
        if (c0ca != null) {
            for (int i = 0; i < c0ca.A00; i++) {
                map.put(c0ca.A0D(i), graphQlCallInput.A00(c0ca.A0C(i)));
            }
        }
    }

    public final C0CA A02() {
        C0CA c0ca = this.A00;
        if (c0ca == null) {
            C0CA A022 = this.A01.A02();
            this.A00 = A022;
            return A022;
        }
        return c0ca;
    }

    public final void A03(C0CW c0cw, List list) {
        if (list != null && !list.isEmpty()) {
            for (Object obj : list) {
                if (obj != null) {
                    if (obj instanceof List) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            List list2 = (List) it.next();
                            C0CW A01 = c0cw.A01.A01();
                            c0cw.A0B(A01);
                            A03(A01, list2);
                        }
                        return;
                    }
                    if (obj instanceof String) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C0CW.A00(c0cw, it2.next());
                        }
                        return;
                    }
                    if (obj instanceof Boolean) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            C0CW.A00(c0cw, it3.next());
                        }
                        return;
                    }
                    if (obj instanceof Number) {
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            C0CW.A00(c0cw, it4.next());
                        }
                        return;
                    }
                    if (obj instanceof Enum) {
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            C0CW.A00(c0cw, it5.next().toString());
                        }
                        return;
                    }
                    if (obj instanceof GraphQlCallInput) {
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            c0cw.A0B(((GraphQlCallInput) it6.next()).A02());
                        }
                        return;
                    } else {
                        if (obj instanceof Map) {
                            Iterator it7 = list.iterator();
                            while (it7.hasNext()) {
                                Map map = (Map) it7.next();
                                C0CA A022 = c0cw.A01.A02();
                                c0cw.A0B(A022);
                                A04(A022, map);
                            }
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("List value type is not supported: ");
                        sb.append(obj.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
    }

    public final void A04(C0CA c0ca, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                if (value instanceof Boolean) {
                    value = ((Boolean) value).booleanValue() ? "true" : "false";
                } else if (!(value instanceof Number) && !(value instanceof String)) {
                    if (value instanceof Enum) {
                        value = value.toString();
                    } else if (value instanceof GraphQlCallInput) {
                        c0ca.A0E(((GraphQlCallInput) value).A02(), str);
                    } else if (value instanceof List) {
                        C0CW A01 = ((AbstractC04050Jw) c0ca).A01.A01();
                        c0ca.A0E(A01, str);
                        A03(A01, (List) value);
                    } else if (value instanceof Map) {
                        A04(c0ca.A0B(str), (Map) value);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected object value type ");
                        sb.append(value.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                C0CA.A00(c0ca, value, str);
            }
        }
    }

    public final void A05(String str, List list) {
        C0CA A022 = A02();
        C0CW A01 = ((AbstractC04050Jw) A022).A01.A01();
        A022.A0E(A01, str);
        A03(A01, list);
    }
}
