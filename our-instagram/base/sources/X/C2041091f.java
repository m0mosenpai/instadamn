package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.91f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2041091f implements InterfaceC2040891d {
    public float A00;
    public Map A01;
    public Map A02;
    public final float A03;
    public final int A04;
    public final Object A05;
    public final EnumC124825kn A06;

    @Override // X.InterfaceC2040891d
    public final List AVX(String str, boolean z, boolean z2) {
        float f;
        String str2;
        C14360o3.A0B(str, 0);
        float f2 = this.A03;
        boolean z3 = false;
        if (f2 < 1.0f) {
            synchronized (this.A05) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase);
                String A00 = A4F.A00.A00(A4F.A05.A00(AbstractC001900j.A0B(A4F.A03.A00(lowerCase, " ")).toString(), " "), "0");
                Map map = this.A01;
                C14360o3.A0B(map, 2);
                ArrayList arrayList = new ArrayList();
                List A01 = AbstractC41677Id6.A01(A00);
                int i = 1;
                while (true) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = (A01.size() - i) + 1;
                    for (int i2 = 0; i2 < size; i2++) {
                        int i3 = i2 + i;
                        StringBuilder sb = new StringBuilder();
                        for (int i4 = i2; i4 < i3; i4++) {
                            if (i4 > i2) {
                                str2 = " ";
                            } else {
                                str2 = "";
                            }
                            sb.append(AnonymousClass001.A0R(str2, (String) A01.get(i4)));
                        }
                        String obj = sb.toString();
                        C14360o3.A07(obj);
                        arrayList2.add(obj);
                    }
                    arrayList.addAll(arrayList2);
                    if (i == 3) {
                        break;
                    }
                    i++;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (map.containsKey(next)) {
                        Object obj2 = linkedHashMap.get(next);
                        if (obj2 == null) {
                            obj2 = Float.valueOf(0.0f);
                            linkedHashMap.put(next, obj2);
                        }
                        linkedHashMap.put(next, Float.valueOf(((Number) obj2).floatValue() + 1.0f));
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    float floatValue = ((Number) entry.getValue()).floatValue();
                    Object obj3 = map.get(key);
                    if (obj3 == null) {
                        obj3 = Float.valueOf(0.0f);
                    }
                    linkedHashMap2.put(key, Float.valueOf(floatValue * ((Number) obj3).floatValue()));
                }
                if (linkedHashMap2.size() >= this.A04) {
                    float f3 = 0.0f;
                    float f4 = 0.0f;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        Object key2 = entry2.getKey();
                        float floatValue2 = ((Number) entry2.getValue()).floatValue();
                        Float f5 = (Float) this.A02.get(key2);
                        if (f5 != null) {
                            f4 += f5.floatValue() * floatValue2;
                            f3 += (float) Math.pow(floatValue2, 2.0d);
                        }
                    }
                    if (f3 != 0.0f) {
                        f4 /= (float) Math.sqrt(f3);
                    }
                    float f6 = f4 + this.A00;
                    if (f6 >= 0.0f) {
                        f = 1.0f / (((float) Math.exp(-f6)) + 1.0f);
                    } else {
                        float exp = (float) Math.exp(f6);
                        f = exp / (exp + 1.0f);
                    }
                    if (f > f2) {
                        z3 = true;
                    }
                }
            }
        }
        if (z3) {
            List singletonList = Collections.singletonList(new C9CA());
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    private final void A00(List list) {
        synchronized (this.A05) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            ImmutableMap.Builder builder2 = new ImmutableMap.Builder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List A0R = AbstractC001900j.A0R((String) list.get(i), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                if (A0R.size() == 3) {
                    String str = (String) A0R.get(0);
                    builder.put(str, Float.valueOf(Float.parseFloat((String) A0R.get(1))));
                    builder2.put(str, Float.valueOf(Float.parseFloat((String) A0R.get(2))));
                } else if (A0R.size() == 1) {
                    this.A00 = Float.parseFloat((String) A0R.get(0));
                }
            }
            this.A02 = builder.buildOrThrow();
            this.A01 = builder2.buildOrThrow();
        }
    }

    @Override // X.InterfaceC2040891d
    public final int BYC() {
        return 0;
    }

    @Override // X.InterfaceC2040891d
    public final int BYG() {
        return 0;
    }

    @Override // X.InterfaceC2040891d
    public final EnumC124825kn C2Y() {
        return this.A06;
    }

    @Override // X.InterfaceC2040891d
    public final void Epz() {
        A00(C16930sl.A00);
    }

    public C2041091f(float f, int i) {
        this.A03 = f;
        this.A04 = i;
        this.A06 = EnumC124825kn.A08;
        this.A05 = new Object();
        ImmutableMap immutableMap = RegularImmutableMap.A02;
        C14360o3.A07(immutableMap);
        this.A02 = immutableMap;
        this.A01 = immutableMap;
    }

    @Override // X.InterfaceC2040891d
    public final void EgN(List list) {
        A00(list);
    }

    @Override // X.InterfaceC2040891d
    public final void FBi(List list, List list2, List list3) {
        A00(list3);
    }

    public C2041091f() {
        this(1.0f, 0);
    }
}
