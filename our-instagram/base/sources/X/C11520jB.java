package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0jB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11520jB implements Serializable {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public final void A03(C11500j9 c11500j9, int i) {
        if (i != -1) {
            this.A01.put(c11500j9, Integer.valueOf(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11520jB)) {
            return false;
        }
        C11520jB c11520jB = (C11520jB) obj;
        return C02O.A00(this.A00, c11520jB.A00) && C02O.A00(this.A01, c11520jB.A01);
    }

    @Deprecated
    public final C19260xA A00() {
        String str;
        Object obj;
        C19260xA c19260xA = new C19260xA();
        for (Map.Entry entry : this.A00.entrySet()) {
            if (!(entry.getValue() instanceof String) && !(entry.getValue() instanceof Integer) && !(entry.getValue() instanceof Double) && !(entry.getValue() instanceof Float) && !(entry.getValue() instanceof Long) && !(entry.getValue() instanceof Boolean)) {
                if (entry.getValue() instanceof List) {
                    List list = (List) entry.getValue();
                    if (!list.isEmpty() && !(list.get(0) instanceof String)) {
                        if (list.get(0) instanceof C11520jB) {
                            c19260xA.A09((String) entry.getKey(), (List) entry.getValue());
                        } else if (list.get(0) instanceof Map) {
                            c19260xA.A0A((String) entry.getKey(), (List) entry.getValue());
                        }
                    } else {
                        c19260xA.A08((String) entry.getKey(), (List) entry.getValue());
                    }
                } else if (entry.getValue() instanceof Map) {
                    Map map = (Map) entry.getValue();
                    ArrayList arrayList = new ArrayList(map.keySet());
                    ArrayList arrayList2 = new ArrayList(map.values());
                    if (!map.isEmpty()) {
                        if (arrayList.get(0) instanceof String) {
                            if (!(arrayList2.get(0) instanceof String)) {
                                if (arrayList2.get(0) instanceof Float) {
                                    str = (String) entry.getKey();
                                    C19260xA c19260xA2 = new C19260xA();
                                    c19260xA2.A0G(map);
                                    obj = c19260xA2;
                                } else if (arrayList2.get(0) instanceof List) {
                                    str = (String) entry.getKey();
                                    C19260xA c19260xA3 = new C19260xA();
                                    c19260xA3.A0H(map);
                                    obj = c19260xA3;
                                }
                            }
                        } else if (arrayList.get(0) instanceof Long) {
                            if (arrayList2.get(0) instanceof String) {
                                str = (String) entry.getKey();
                                C19260xA c19260xA4 = new C19260xA();
                                c19260xA4.A0F(map);
                                obj = c19260xA4;
                            } else if (arrayList2.get(0) instanceof Float) {
                                str = (String) entry.getKey();
                                C19260xA c19260xA5 = new C19260xA();
                                c19260xA5.A0D(map);
                                obj = c19260xA5;
                            } else if (arrayList2.get(0) instanceof List) {
                                str = (String) entry.getKey();
                                C19260xA c19260xA6 = new C19260xA();
                                c19260xA6.A0E(map);
                                obj = c19260xA6;
                            }
                        }
                    }
                    str = (String) entry.getKey();
                    C19260xA c19260xA7 = new C19260xA();
                    c19260xA7.A0C(map);
                    obj = c19260xA7;
                } else if (entry.getValue() instanceof C11520jB) {
                    str = (String) entry.getKey();
                    obj = ((C11520jB) entry.getValue()).A00();
                } else if (entry.getValue() == null) {
                    C19260xA.A00(c19260xA, null, (String) entry.getKey());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown type: ");
                    sb.append(entry.getValue().getClass());
                    throw new UnsupportedOperationException(sb.toString());
                }
            } else {
                str = (String) entry.getKey();
                obj = entry.getValue();
            }
            C19260xA.A00(c19260xA, obj, str);
        }
        for (Map.Entry entry2 : this.A01.entrySet()) {
            if (entry2.getValue() instanceof String) {
                C19260xA.A00(c19260xA, entry2.getValue(), ((C11500j9) entry2.getKey()).A01);
            } else if (entry2.getValue() instanceof Integer) {
                C19260xA.A00(c19260xA, entry2.getValue(), ((C11500j9) entry2.getKey()).A01);
            } else if (entry2.getValue() instanceof Double) {
                C19260xA.A00(c19260xA, entry2.getValue(), ((C11500j9) entry2.getKey()).A01);
            } else if (entry2.getValue() instanceof Float) {
                C19260xA.A00(c19260xA, entry2.getValue(), ((C11500j9) entry2.getKey()).A01);
            } else if (entry2.getValue() instanceof Long) {
                C19260xA.A00(c19260xA, entry2.getValue(), ((C11500j9) entry2.getKey()).A01);
            } else if (entry2.getValue() instanceof Boolean) {
                C19260xA.A00(c19260xA, entry2.getValue(), ((C11500j9) entry2.getKey()).A01);
            } else if (entry2.getValue() instanceof Enum) {
                C19260xA.A00(c19260xA, entry2.getValue(), ((C11500j9) entry2.getKey()).A01);
            } else {
                boolean z = entry2.getValue() instanceof List;
                Object value = entry2.getValue();
                if (z) {
                    List list2 = (List) value;
                    if (list2.isEmpty()) {
                        c19260xA.A08(((C11500j9) entry2.getKey()).A01, list2);
                    } else if (list2.get(0) instanceof String) {
                        c19260xA.A08(((C11500j9) entry2.getKey()).A01, list2);
                    } else if (list2.get(0) instanceof Double) {
                        String str2 = ((C11500j9) entry2.getKey()).A01;
                        C0x9 c0x9 = new C0x9();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            c0x9.A00(((Number) it.next()).doubleValue());
                        }
                        C19260xA.A00(c19260xA, c0x9, str2);
                    } else if (list2.get(0) instanceof Integer) {
                        String str3 = ((C11500j9) entry2.getKey()).A01;
                        C0x9 c0x92 = new C0x9();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            c0x92.A01(((Number) it2.next()).intValue());
                        }
                        C19260xA.A00(c19260xA, c0x92, str3);
                    } else if (list2.get(0) instanceof C11520jB) {
                        c19260xA.A09(((C11500j9) entry2.getKey()).A01, list2);
                    } else if (list2.get(0) instanceof Map) {
                        Map map2 = (Map) list2.get(0);
                        ArrayList arrayList3 = new ArrayList(map2.keySet());
                        ArrayList arrayList4 = new ArrayList(map2.values());
                        if (map2.isEmpty()) {
                            c19260xA.A0A(((C11500j9) entry2.getKey()).A01, (List) entry2.getValue());
                        } else if (arrayList3.get(0) instanceof String) {
                            if (arrayList4.get(0) instanceof String) {
                                c19260xA.A0A(((C11500j9) entry2.getKey()).A01, (List) entry2.getValue());
                            } else if (arrayList4.get(0) instanceof Double) {
                                String str4 = ((C11500j9) entry2.getKey()).A01;
                                List<Map> list3 = (List) entry2.getValue();
                                C0x9 c0x93 = new C0x9();
                                for (Map map3 : list3) {
                                    C19260xA c19260xA8 = new C19260xA();
                                    for (Map.Entry entry3 : map3.entrySet()) {
                                        C19260xA.A00(c19260xA8, entry3.getValue(), (String) entry3.getKey());
                                    }
                                    c0x93.A00.add(c19260xA8);
                                }
                                C19260xA.A00(c19260xA, c0x93, str4);
                            }
                        }
                    }
                } else {
                    boolean z2 = value instanceof Map;
                    Object value2 = entry2.getValue();
                    if (z2) {
                        Map map4 = (Map) value2;
                        ArrayList arrayList5 = new ArrayList(map4.keySet());
                        ArrayList arrayList6 = new ArrayList(map4.values());
                        if (map4.isEmpty()) {
                            String str5 = ((C11500j9) entry2.getKey()).A01;
                            C19260xA c19260xA9 = new C19260xA();
                            c19260xA9.A0C(map4);
                            C19260xA.A00(c19260xA, c19260xA9, str5);
                        } else if (arrayList5.get(0) instanceof String) {
                            if (arrayList6.get(0) instanceof String) {
                                String str6 = ((C11500j9) entry2.getKey()).A01;
                                C19260xA c19260xA10 = new C19260xA();
                                c19260xA10.A0C(map4);
                                C19260xA.A00(c19260xA, c19260xA10, str6);
                            } else if (arrayList6.get(0) instanceof Float) {
                                String str7 = ((C11500j9) entry2.getKey()).A01;
                                C19260xA c19260xA11 = new C19260xA();
                                c19260xA11.A0G(map4);
                                C19260xA.A00(c19260xA, c19260xA11, str7);
                            } else if (arrayList6.get(0) instanceof List) {
                                String str8 = ((C11500j9) entry2.getKey()).A01;
                                C19260xA c19260xA12 = new C19260xA();
                                c19260xA12.A0H(map4);
                                C19260xA.A00(c19260xA, c19260xA12, str8);
                            }
                        } else if (arrayList5.get(0) instanceof Long) {
                            if (arrayList6.get(0) instanceof String) {
                                String str9 = ((C11500j9) entry2.getKey()).A01;
                                C19260xA c19260xA13 = new C19260xA();
                                c19260xA13.A0F(map4);
                                C19260xA.A00(c19260xA, c19260xA13, str9);
                            } else if (arrayList6.get(0) instanceof Float) {
                                String str10 = ((C11500j9) entry2.getKey()).A01;
                                C19260xA c19260xA14 = new C19260xA();
                                c19260xA14.A0D(map4);
                                C19260xA.A00(c19260xA, c19260xA14, str10);
                            } else if (arrayList6.get(0) instanceof List) {
                                String str11 = ((C11500j9) entry2.getKey()).A01;
                                C19260xA c19260xA15 = new C19260xA();
                                c19260xA15.A0E(map4);
                                C19260xA.A00(c19260xA, c19260xA15, str11);
                            }
                        }
                    } else if (value2 instanceof C11520jB) {
                        C19260xA.A00(c19260xA, ((C11520jB) entry2.getValue()).A00(), ((C11500j9) entry2.getKey()).A01);
                    } else if (entry2.getValue() == null) {
                        C19260xA.A00(c19260xA, null, ((C11500j9) entry2.getKey()).A01);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unknown type: ");
                        sb2.append(entry2.getValue().getClass());
                        throw new UnsupportedOperationException(sb2.toString());
                    }
                }
            }
        }
        return c19260xA;
    }

    public final Serializable A01(C11500j9 c11500j9) {
        return (Serializable) this.A01.get(c11500j9);
    }

    @Deprecated
    public final HashMap A02() {
        Object key;
        Object value;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.A00.entrySet()) {
            if (entry.getValue() instanceof String) {
                key = entry.getKey();
                value = entry.getValue();
            } else if (entry.getValue() instanceof Integer) {
                key = entry.getKey();
                value = Integer.toString(((Number) entry.getValue()).intValue());
            } else if (entry.getValue() instanceof Double) {
                key = entry.getKey();
                value = Double.toString(((Number) entry.getValue()).doubleValue());
            } else if (entry.getValue() instanceof Float) {
                key = entry.getKey();
                value = Float.toString(((Number) entry.getValue()).floatValue());
            } else if (entry.getValue() instanceof Long) {
                key = entry.getKey();
                value = Long.toString(((Number) entry.getValue()).longValue());
            } else if (entry.getValue() instanceof Boolean) {
                key = entry.getKey();
                value = Boolean.toString(((Boolean) entry.getValue()).booleanValue());
            } else if (entry.getValue() == null) {
                hashMap.put(entry.getKey(), null);
            } else {
                C0w9.A03("IgExtras", AnonymousClass001.A0u("coercing a non scalar to string via toString() key: ", (String) entry.getKey(), " value: ", entry.getValue().toString()));
                key = entry.getKey();
                value = entry.getValue().toString();
            }
            hashMap.put(key, value);
        }
        for (Map.Entry entry2 : this.A01.entrySet()) {
            if (entry2.getValue() instanceof String) {
                hashMap.put(((C11500j9) entry2.getKey()).A01, entry2.getValue());
            } else if (entry2.getValue() instanceof Integer) {
                hashMap.put(((C11500j9) entry2.getKey()).A01, Integer.toString(((Number) entry2.getValue()).intValue()));
            } else if (entry2.getValue() instanceof Double) {
                hashMap.put(((C11500j9) entry2.getKey()).A01, Double.toString(((Number) entry2.getValue()).doubleValue()));
            } else if (entry2.getValue() instanceof Float) {
                hashMap.put(((C11500j9) entry2.getKey()).A01, Float.toString(((Number) entry2.getValue()).floatValue()));
            } else if (entry2.getValue() instanceof Long) {
                hashMap.put(((C11500j9) entry2.getKey()).A01, Long.toString(((Number) entry2.getValue()).longValue()));
            } else if (entry2.getValue() instanceof Boolean) {
                hashMap.put(((C11500j9) entry2.getKey()).A01, Boolean.toString(((Boolean) entry2.getValue()).booleanValue()));
            } else {
                Object value2 = entry2.getValue();
                C11500j9 c11500j9 = (C11500j9) entry2.getKey();
                if (value2 == null) {
                    hashMap.put(c11500j9.A01, null);
                } else {
                    hashMap.put(c11500j9.A01, entry2.getValue().toString());
                    C0w9.A03("IgExtras", AnonymousClass001.A0u("coercing a non scalar to string via toString() key: ", ((C11500j9) entry2.getKey()).A01, " value: ", entry2.getValue().toString()));
                }
            }
        }
        return hashMap;
    }

    public final void A04(C11500j9 c11500j9, Serializable serializable) {
        this.A01.put(c11500j9, serializable);
    }

    public final void A05(C11500j9 c11500j9, Serializable serializable) {
        if (serializable != null) {
            this.A01.put(c11500j9, serializable);
        }
    }

    public final void A06(C11520jB c11520jB) {
        for (Map.Entry entry : c11520jB.A00.entrySet()) {
            this.A00.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : c11520jB.A01.entrySet()) {
            this.A01.put(entry2.getKey(), entry2.getValue());
        }
    }

    public final void A07(Integer num, String str) {
        if (num != null) {
            this.A00.put(str, num);
        }
    }

    public final void A08(String str, float f) {
        this.A00.put(str, Float.valueOf(f));
    }

    public final void A09(String str, int i) {
        this.A00.put(str, Integer.valueOf(i));
    }

    public final void A0A(String str, String str2) {
        this.A00.put(str, str2);
    }

    public final void A0B(String str, List list) {
        if (list != null) {
            this.A00.put(str, new ArrayList(list));
        }
    }

    public final void A0C(String str, List list) {
        if (list != null) {
            this.A00.put(str, new ArrayList(list));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final String toString() {
        return new JSONObject(this.A00).toString();
    }

    public final void A0D(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A0A((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
