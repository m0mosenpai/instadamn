package X;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.5DH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DH {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final C5DG A06 = new Object();
    public final HashMap A07 = new HashMap(0, 0.75f);
    public final LinkedHashSet A08 = new LinkedHashSet();

    public final int A00() {
        int i;
        synchronized (this.A06) {
            i = this.A01;
        }
        return i;
    }

    public final Object A01(Object obj) {
        synchronized (this.A06) {
            Object obj2 = this.A07.get(obj);
            if (obj2 != null) {
                LinkedHashSet linkedHashSet = this.A08;
                linkedHashSet.remove(obj);
                linkedHashSet.add(obj);
                this.A02++;
                return obj2;
            }
            this.A04++;
            return null;
        }
    }

    public final void A02(Object obj, Object obj2) {
        HashMap hashMap;
        LinkedHashSet linkedHashSet;
        Object obj3;
        Object obj4;
        if (obj != null && obj2 != null) {
            C5DG c5dg = this.A06;
            synchronized (c5dg) {
                this.A05++;
                this.A01 = A00() + 1;
                hashMap = this.A07;
                if (hashMap.put(obj, obj2) != null) {
                    this.A01 = A00() - 1;
                }
                linkedHashSet = this.A08;
                if (linkedHashSet.contains(obj)) {
                    linkedHashSet.remove(obj);
                }
                linkedHashSet.add(obj);
            }
            int i = this.A03;
            while (true) {
                synchronized (c5dg) {
                    if (A00() < 0 || ((hashMap.isEmpty() && A00() != 0) || hashMap.isEmpty() != linkedHashSet.isEmpty())) {
                        break;
                    }
                    obj3 = null;
                    if (A00() > i && !hashMap.isEmpty()) {
                        obj3 = AbstractC001800i.A09(linkedHashSet);
                        obj4 = hashMap.get(obj3);
                        if (obj4 != null) {
                            C15500q5.A04(hashMap).remove(obj3);
                            C15500q5.A00(linkedHashSet).remove(obj3);
                            int A00 = A00();
                            C14360o3.A0A(obj3);
                            this.A01 = A00 - 1;
                            this.A00++;
                        } else {
                            throw new IllegalStateException("inconsistent state");
                        }
                    } else {
                        obj4 = null;
                    }
                }
                if (obj3 == null && obj4 == null) {
                    return;
                }
                C14360o3.A0A(obj3);
                C14360o3.A0A(obj4);
            }
            throw new IllegalStateException("map/keySet size inconsistency");
        }
        throw null;
    }

    public final String toString() {
        int i;
        String obj;
        synchronized (this.A06) {
            int i2 = this.A02;
            int i3 = this.A04;
            int i4 = i3 + i2;
            if (i4 != 0) {
                i = (i2 * 100) / i4;
            } else {
                i = 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("LruCache[maxSize=");
            sb.append(this.A03);
            sb.append(",hits=");
            sb.append(i2);
            sb.append(",misses=");
            sb.append(i3);
            sb.append(",hitRate=");
            sb.append(i);
            sb.append("%]");
            obj = sb.toString();
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.5DG] */
    public C5DH(int i) {
        this.A03 = i;
    }
}
