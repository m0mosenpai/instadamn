package X;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: X.0IZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IZ {
    public String A00;
    public final Object A01 = new Object();
    public final String A02;
    public final Map A03;
    public final java.util.Set A04;
    public final java.util.Set A05;
    public static final C03720In A06 = new C03720In("ErrMsg");
    public static final Comparator A08 = new Comparator() { // from class: X.0IX
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    };
    public static final Comparator A07 = new Comparator() { // from class: X.0IY
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C0IZ) obj).A02.compareTo(((C0IZ) obj2).A02);
        }
    };

    public static void A00(C0IZ c0iz) {
        c0iz.A00 = null;
        HashSet hashSet = new HashSet();
        synchronized (c0iz.A01) {
            hashSet.addAll(c0iz.A05);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            A00((C0IZ) it.next());
        }
    }

    public final void A01(StringBuilder sb) {
        String str = this.A00;
        if (str != null) {
            sb.append(str);
            return;
        }
        TreeMap treeMap = new TreeMap(A08);
        TreeSet treeSet = new TreeSet(A07);
        synchronized (this.A01) {
            treeMap.putAll(this.A03);
            treeSet.addAll(this.A04);
        }
        sb.append('[');
        sb.append(this.A02);
        sb.append(": ");
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append(", ");
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            ((C0IZ) it.next()).A01(sb);
        }
    }

    public final String toString() {
        String str = this.A00;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            A01(sb);
            str = sb.toString();
            this.A00 = str;
        }
        return AnonymousClass001.A11("[ErrMsg - ", this.A02, ": ", str, "]");
    }

    public C0IZ(String str) {
        Comparator comparator = A07;
        this.A04 = new TreeSet(comparator);
        this.A05 = new TreeSet(comparator);
        this.A03 = new TreeMap(A08);
        this.A02 = str;
        this.A00 = null;
    }
}
