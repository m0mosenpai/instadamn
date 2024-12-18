package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* renamed from: X.Wld, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70970Wld implements InterfaceC19630xq {
    public final InterfaceC19630xq A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;

    @Override // X.InterfaceC19630xq
    public final /* synthetic */ java.util.Set C2v(String str) {
        C14360o3.A0B(str, 1);
        java.util.Set stringSet = this.A00.getStringSet(str, null);
        if (stringSet == null) {
            return C16910sj.A00;
        }
        return stringSet;
    }

    @Override // X.InterfaceC19630xq
    public final void EDW(InterfaceC19620xp interfaceC19620xp) {
        C14360o3.A0B(interfaceC19620xp, 0);
        this.A00.EDW(interfaceC19620xp);
    }

    @Override // X.InterfaceC19630xq
    public final void F9e(InterfaceC19620xp interfaceC19620xp) {
        C14360o3.A0B(interfaceC19620xp, 0);
        this.A00.F9e(interfaceC19620xp);
    }

    @Override // X.InterfaceC19630xq
    public final InterfaceC19610xo ARD() {
        return this.A00.ARD();
    }

    @Override // X.InterfaceC19630xq
    public final /* synthetic */ String C2s(String str) {
        String string = this.A00.getString(str, "");
        return string != null ? string : "";
    }

    @Override // X.InterfaceC19630xq
    public final boolean contains(String str) {
        return this.A00.contains(str);
    }

    @Override // X.InterfaceC19630xq
    public final Map getAll() {
        return this.A00.getAll();
    }

    @Override // X.InterfaceC19630xq
    public final boolean getBoolean(String str, boolean z) {
        boolean z2;
        StringBuilder sb;
        if (str != null) {
            Map map = this.A01;
            if (map.containsKey(str)) {
                z2 = ((Boolean) AbstractC06930Yk.A01(str, map)).booleanValue();
                sb = new StringBuilder();
                AbstractC58320PtC.A1N("Nux associated with boolean SharedPreference Key ", str, " returns ", sb);
                sb.append(z2);
                C0K8.A0D("EndToEnd-Test", sb.toString());
                return z2;
            }
        }
        z2 = this.A00.getBoolean(str, z);
        sb = new StringBuilder();
        AbstractC58320PtC.A1N("SharedPreference ", str, " returns ", sb);
        sb.append(z2);
        sb.append(" without override");
        C0K8.A0D("EndToEnd-Test", sb.toString());
        return z2;
    }

    @Override // X.InterfaceC19630xq
    public final float getFloat(String str, float f) {
        return this.A00.getFloat(str, f);
    }

    @Override // X.InterfaceC19630xq
    public final int getInt(String str, int i) {
        int i2;
        StringBuilder sb;
        if (str != null) {
            Map map = this.A02;
            if (map.containsKey(str)) {
                i2 = ((Number) AbstractC06930Yk.A01(str, map)).intValue();
                sb = new StringBuilder();
                AbstractC58320PtC.A1N("Nux associated with int SharedPreference Key ", str, " returns ", sb);
                sb.append(i2);
                C0K8.A0D("EndToEnd-Test", sb.toString());
                return i2;
            }
        }
        i2 = this.A00.getInt(str, i);
        sb = new StringBuilder();
        AbstractC58320PtC.A1N("SharedPreference ", str, " returns ", sb);
        sb.append(i2);
        sb.append(" without override");
        C0K8.A0D("EndToEnd-Test", sb.toString());
        return i2;
    }

    @Override // X.InterfaceC19630xq
    public final long getLong(String str, long j) {
        long j2;
        StringBuilder sb;
        if (str != null) {
            Map map = this.A03;
            if (map.containsKey(str)) {
                j2 = ((Number) AbstractC06930Yk.A01(str, map)).longValue();
                sb = new StringBuilder();
                AbstractC58320PtC.A1N("Nux associated with long SharedPreference Key ", str, " returns ", sb);
                sb.append(j2);
                C0K8.A0D("EndToEnd-Test", sb.toString());
                return j2;
            }
        }
        j2 = this.A00.getLong(str, j);
        sb = new StringBuilder();
        AbstractC58320PtC.A1N("SharedPreference ", str, " returns ", sb);
        sb.append(j2);
        sb.append(" without override");
        C0K8.A0D("EndToEnd-Test", sb.toString());
        return j2;
    }

    @Override // X.InterfaceC19630xq
    public final String getString(String str, String str2) {
        return this.A00.getString(str, str2);
    }

    @Override // X.InterfaceC19630xq
    public final java.util.Set getStringSet(String str, java.util.Set set) {
        return this.A00.getStringSet(str, set);
    }

    public /* synthetic */ C70970Wld(InterfaceC19630xq interfaceC19630xq, Map map, Map map2) {
        this(interfaceC19630xq, map, map2, AbstractC06930Yk.A0E());
    }

    public C70970Wld(InterfaceC19630xq interfaceC19630xq, Map map, Map map2, Map map3) {
        this.A00 = interfaceC19630xq;
        String property = System.getProperty("allowNux");
        if (property != null && property.equals("true")) {
            this.A01 = AbstractC06930Yk.A0E();
            this.A02 = AbstractC06930Yk.A0E();
            this.A03 = AbstractC06930Yk.A0E();
            C0K8.A0D("EndToEnd-Test", "Nux is not disabled in E2E mode");
            return;
        }
        C0K8.A0D("EndToEnd-Test", "Nux disabled in E2E mode");
        LinkedHashMap linkedHashMap = null;
        try {
            JsonElement jsonElement = (JsonElement) AbstractC100754fe.A03((JsonElement) AbstractC73763Sg.A03.A00(property == null ? "{}" : property, JsonElementSerializer.A00)).get("IGNux");
            if (jsonElement != null) {
                Map A0B = AbstractC06930Yk.A0B(AbstractC100754fe.A03(jsonElement));
                LinkedHashMap A0y = AbstractC43594JPz.A0y(A0B);
                Iterator A15 = AbstractC166997dE.A15(A0B);
                while (A15.hasNext()) {
                    Map.Entry entry = (Map.Entry) A15.next();
                    Object key = entry.getKey();
                    Object A01 = AbstractC100754fe.A01(AbstractC100754fe.A06((JsonElement) entry.getValue()));
                    if (A01 == null) {
                        A01 = Integer.valueOf(AbstractC100754fe.A00(AbstractC100754fe.A06((JsonElement) entry.getValue())));
                    }
                    A0y.put(key, A01);
                }
                linkedHashMap = A0y;
            }
        } catch (AnonymousClass403 unused) {
        }
        InterfaceC19610xo ARD = this.A00.ARD();
        if (linkedHashMap != null) {
            Iterator A14 = AbstractC166997dE.A14(linkedHashMap);
            while (A14.hasNext()) {
                Map.Entry entry2 = (Map.Entry) A14.next();
                if (entry2.getValue() instanceof Integer) {
                    ARD.E7D((String) entry2.getKey(), AbstractC25230BEn.A0D(entry2.getValue(), "null cannot be cast to non-null type kotlin.Int"));
                } else if (entry2.getValue() instanceof Boolean) {
                    ARD.E77((String) entry2.getKey(), MSY.A1X(entry2.getValue()));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Nux Override: ");
                sb.append((String) entry2.getKey());
                sb.append(": ");
                C0K8.A0D("EndToEnd-Test", AbstractC166997dE.A0v(entry2.getValue(), sb));
            }
        }
        ARD.apply();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator A152 = AbstractC166997dE.A15(map);
        while (A152.hasNext()) {
            Map.Entry entry3 = (Map.Entry) A152.next();
            if (linkedHashMap == null || !linkedHashMap.containsKey(entry3.getKey())) {
                AbstractC31177DnL.A1S(entry3, linkedHashMap2);
            }
        }
        this.A01 = linkedHashMap2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator A153 = AbstractC166997dE.A15(map2);
        while (A153.hasNext()) {
            Map.Entry entry4 = (Map.Entry) A153.next();
            if (linkedHashMap == null || !linkedHashMap.containsKey(entry4.getKey())) {
                AbstractC31177DnL.A1S(entry4, linkedHashMap3);
            }
        }
        this.A02 = linkedHashMap3;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        Iterator A154 = AbstractC166997dE.A15(map3);
        while (A154.hasNext()) {
            Map.Entry entry5 = (Map.Entry) A154.next();
            if (linkedHashMap == null || !linkedHashMap.containsKey(entry5.getKey())) {
                AbstractC31177DnL.A1S(entry5, linkedHashMap4);
            }
        }
        this.A03 = linkedHashMap4;
    }
}
