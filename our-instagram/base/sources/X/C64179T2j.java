package X;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.T2j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64179T2j implements C45A {
    public HashMap A00;

    /* JADX WARN: Type inference failed for: r4v1, types: [X.T2j, java.lang.Object] */
    public static C64179T2j A00(C64179T2j c64179T2j, C64179T2j c64179T2j2) {
        HashMap hashMap;
        HashMap hashMap2;
        if (c64179T2j != null && (hashMap = c64179T2j.A00) != null && !hashMap.isEmpty()) {
            if (c64179T2j2 != null && (hashMap2 = c64179T2j2.A00) != null && !hashMap2.isEmpty()) {
                HashMap A1G = AbstractC166987dD.A1G();
                Iterator A0k = AbstractC167007dF.A0k(hashMap2);
                while (A0k.hasNext()) {
                    Annotation annotation = (Annotation) A0k.next();
                    A1G.put(annotation.annotationType(), annotation);
                }
                Iterator A0k2 = AbstractC167007dF.A0k(c64179T2j.A00);
                while (A0k2.hasNext()) {
                    Annotation annotation2 = (Annotation) A0k2.next();
                    A1G.put(annotation2.annotationType(), annotation2);
                }
                ?? obj = new Object();
                obj.A00 = A1G;
                return obj;
            }
            return c64179T2j;
        }
        return c64179T2j2;
    }

    @Override // X.C45A
    public final Annotation AXU(Class cls) {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    @Override // X.C45A
    public final boolean CLT(Class[] clsArr) {
        if (this.A00 == null) {
            return false;
        }
        int i = 0;
        while (!this.A00.containsKey(clsArr[i])) {
            i++;
            if (i >= 8) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C45A
    public final int size() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public final String toString() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            return "[null]";
        }
        return hashMap.toString();
    }
}
