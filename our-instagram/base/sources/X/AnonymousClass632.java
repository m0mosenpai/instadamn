package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.632, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass632 {
    public final C1338862w A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;

    public final AnonymousClass632 A00(C1338862w c1338862w) {
        if (c1338862w != null) {
            Map map = c1338862w.A00;
            if (!map.isEmpty()) {
                C1338862w c1338862w2 = this.A00;
                C14360o3.A0B(c1338862w2, 0);
                return new AnonymousClass632(new C1338862w(AbstractC06930Yk.A04(c1338862w2.A00, map)), this.A07, this.A04, this.A08, this.A03, this.A02, this.A05, this.A06, this.A01);
            }
        }
        return this;
    }

    public final AnonymousClass632 A02(List list) {
        if (list != null && !list.isEmpty()) {
            HashMap hashMap = new HashMap(this.A06);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C69103Vht c69103Vht = (C69103Vht) it.next();
                hashMap.put(c69103Vht.A02, c69103Vht);
            }
            return new AnonymousClass632(this.A00, this.A07, this.A04, this.A08, this.A03, this.A02, this.A05, hashMap, this.A01);
        }
        return this;
    }

    public final AnonymousClass632 A05(Map map) {
        if (map != null && !map.isEmpty()) {
            HashMap hashMap = new HashMap(this.A05);
            hashMap.putAll(map);
            return new AnonymousClass632(this.A00, this.A07, this.A04, this.A08, this.A03, this.A02, hashMap, this.A06, this.A01);
        }
        return this;
    }

    public final AnonymousClass632 A06(Map map) {
        HashMap hashMap = new HashMap(this.A08);
        hashMap.putAll(map);
        return new AnonymousClass632(this.A00, this.A07, this.A04, hashMap, this.A03, this.A02, this.A05, this.A06, this.A01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass632)) {
            return false;
        }
        AnonymousClass632 anonymousClass632 = (AnonymousClass632) obj;
        if (this.A04 != anonymousClass632.A04 || this.A03 != anonymousClass632.A03 || this.A07 != anonymousClass632.A07 || !this.A08.equals(anonymousClass632.A08) || !this.A02.equals(anonymousClass632.A02) || !this.A00.equals(anonymousClass632.A00) || this.A05 != anonymousClass632.A05 || this.A06 != anonymousClass632.A06 || this.A01 != anonymousClass632.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A04, this.A08, this.A03, this.A02, this.A00, this.A05, this.A06, this.A01});
    }

    public AnonymousClass632(C1338862w c1338862w, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8) {
        this.A07 = map;
        this.A04 = map2;
        this.A08 = map3;
        this.A03 = map4;
        this.A02 = map5;
        this.A00 = c1338862w;
        this.A05 = map6;
        this.A06 = map7;
        this.A01 = map8;
    }

    public final AnonymousClass632 A01(List list) {
        if (list.isEmpty()) {
            return this;
        }
        HashMap hashMap = new HashMap(this.A02);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C62517SEt c62517SEt = (C62517SEt) it.next();
            hashMap.put(c62517SEt.A01, c62517SEt);
        }
        return new AnonymousClass632(this.A00, this.A07, this.A04, this.A08, this.A03, hashMap, this.A05, this.A06, this.A01);
    }

    public final AnonymousClass632 A03(Map map) {
        if (map.isEmpty()) {
            return this;
        }
        HashMap hashMap = new HashMap(this.A01);
        hashMap.putAll(map);
        return new AnonymousClass632(this.A00, this.A07, this.A04, this.A08, this.A03, this.A02, this.A05, this.A06, hashMap);
    }

    public final AnonymousClass632 A04(Map map) {
        if (map.isEmpty()) {
            return this;
        }
        HashMap hashMap = new HashMap(this.A04);
        hashMap.putAll(map);
        return new AnonymousClass632(this.A00, this.A07, hashMap, this.A08, this.A03, this.A02, this.A05, this.A06, this.A01);
    }

    public AnonymousClass632() {
        this.A07 = Collections.emptyMap();
        this.A04 = Collections.emptyMap();
        this.A08 = Collections.emptyMap();
        this.A03 = Collections.emptyMap();
        this.A02 = Collections.emptyMap();
        this.A00 = AbstractC1338762v.A00(Collections.emptyMap());
        this.A05 = Collections.emptyMap();
        this.A06 = Collections.emptyMap();
        this.A01 = Collections.emptyMap();
    }
}
