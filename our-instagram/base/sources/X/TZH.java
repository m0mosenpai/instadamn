package X;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public class TZH<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public boolean A02;
    public final int A04;
    public volatile C64900TZa A05;
    public List A00 = Collections.emptyList();
    public Map A01 = Collections.emptyMap();
    public Map A03 = Collections.emptyMap();

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TZH)) {
            return super.equals(obj);
        }
        TZH tzh = (TZH) obj;
        int size = size();
        if (size == tzh.size()) {
            int size2 = this.A00.size();
            if (size2 != tzh.A00.size()) {
                return entrySet().equals(tzh.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (((Map.Entry) this.A00.get(i)).equals(tzh.A00.get(i))) {
                }
            }
            if (size2 != size) {
                return this.A01.equals(tzh.A01);
            }
            return true;
        }
        return false;
    }

    private int A00(Comparable comparable) {
        int i;
        int A05 = AbstractC25226BEj.A05(this.A00);
        if (A05 >= 0) {
            int compareTo = comparable.compareTo(((TTZ) this.A00.get(A05)).A01);
            if (compareTo > 0) {
                i = A05 + 2;
                return -i;
            }
            if (compareTo == 0) {
                return A05;
            }
        }
        int i2 = 0;
        while (i2 <= A05) {
            int i3 = (i2 + A05) / 2;
            int compareTo2 = comparable.compareTo(((TTZ) this.A00.get(i3)).A01);
            if (compareTo2 < 0) {
                A05 = i3 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        i = i2 + 1;
        return -i;
    }

    public static void A03(TZH tzh) {
        if (!tzh.A02) {
        } else {
            throw AbstractC43592JPx.A11();
        }
    }

    public void A05() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.A02) {
            if (this.A01.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.A01);
            }
            this.A01 = unmodifiableMap;
            if (this.A03.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.A03);
            }
            this.A03 = unmodifiableMap2;
            this.A02 = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (A00(comparable) < 0 && !this.A01.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.A05 == null) {
            this.A05 = new C64900TZa(this);
        }
        return this.A05;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int A00 = A00(comparable);
        if (A00 >= 0) {
            return ((TTZ) this.A00.get(A00)).getValue();
        }
        return this.A01.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.A00.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i = AbstractC166987dD.A0I(this.A00.get(i2), i);
        }
        if (this.A01.size() > 0) {
            return i + this.A01.hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A00.size() + this.A01.size();
    }

    public TZH(int i) {
        this.A04 = i;
    }

    public static Object A01(TZH tzh, int i) {
        A03(tzh);
        Object value = ((TTZ) tzh.A00.remove(i)).getValue();
        if (!tzh.A01.isEmpty()) {
            Iterator it = tzh.A02().entrySet().iterator();
            List list = tzh.A00;
            Map.Entry A1K = AbstractC166987dD.A1K(it);
            list.add(new TTZ(tzh, (Comparable) A1K.getKey(), A1K.getValue()));
            it.remove();
        }
        return value;
    }

    private SortedMap A02() {
        A03(this);
        if (this.A01.isEmpty() && !(this.A01 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.A01 = treeMap;
            this.A03 = treeMap.descendingMap();
        }
        return (SortedMap) this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        A03(this);
        int A00 = A00(comparable);
        if (A00 >= 0) {
            return ((TTZ) this.A00.get(A00)).setValue(obj);
        }
        A03(this);
        if (this.A00.isEmpty() && !(this.A00 instanceof ArrayList)) {
            this.A00 = AbstractC25225BEi.A17(this.A04);
        }
        int i = -(A00 + 1);
        int i2 = this.A04;
        if (i >= i2) {
            return A02().put(comparable, obj);
        }
        if (this.A00.size() == i2) {
            TTZ ttz = (TTZ) this.A00.remove(i2 - 1);
            A02().put(ttz.A01, ttz.getValue());
        }
        this.A00.add(i, new TTZ(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        A03(this);
        if (!this.A00.isEmpty()) {
            this.A00.clear();
        }
        if (!this.A01.isEmpty()) {
            this.A01.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        A03(this);
        Comparable comparable = (Comparable) obj;
        int A00 = A00(comparable);
        if (A00 >= 0) {
            return A01(this, A00);
        }
        if (this.A01.isEmpty()) {
            return null;
        }
        return this.A01.remove(comparable);
    }
}
