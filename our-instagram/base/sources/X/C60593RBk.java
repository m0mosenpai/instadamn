package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.RBk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60593RBk extends AbstractC64178T2h {
    public final Map A00;
    public final boolean A01;
    public final C45T A02;
    public final ConcurrentHashMap A03;

    public C60593RBk(AbstractC910944l abstractC910944l, C45T c45t, HashMap hashMap, ConcurrentHashMap concurrentHashMap) {
        super(abstractC910944l, c45t.A01.A07);
        this.A02 = c45t;
        this.A03 = concurrentHashMap;
        this.A00 = hashMap;
        this.A01 = c45t.A08(C45Y.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00(java.lang.Class r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            r1 = 0
        L3:
            return r1
        L4:
            java.lang.String r4 = r6.getName()
            java.util.concurrent.ConcurrentHashMap r3 = r5.A03
            java.lang.String r1 = X.AbstractC31171DnF.A0h(r4, r3)
            if (r1 != 0) goto L3
            X.44k r0 = r5.A01
            X.44l r0 = r0.A09(r6)
            java.lang.Class r2 = r0.A00
            X.45T r1 = r5.A02
            boolean r0 = r1.A06()
            if (r0 == 0) goto L30
            X.45B r0 = r1.A02(r2)
            X.44W r1 = r1.A00()
            X.454 r0 = r0.A07
            java.lang.String r1 = r1.A0h(r0)
            if (r1 != 0) goto L40
        L30:
            java.lang.String r1 = r2.getName()
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L40
            java.lang.String r1 = X.AbstractC58318PtA.A0g(r0, r1)
        L40:
            r3.put(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60593RBk.A00(java.lang.Class):java.lang.String");
    }

    @Override // X.InterfaceC65565Tmr
    public final String Awq() {
        TreeSet treeSet = new TreeSet();
        Iterator A15 = AbstractC166997dE.A15(this.A00);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            AbstractC910944l abstractC910944l = (AbstractC910944l) A1K.getValue();
            if (!(abstractC910944l instanceof C102424jJ)) {
                Class cls = abstractC910944l.A00;
                if ((cls.getModifiers() & 1536) != 0 && !cls.isPrimitive()) {
                }
            }
            treeSet.add(A1K.getKey());
        }
        return treeSet.toString();
    }

    @Override // X.InterfaceC65565Tmr
    public final String CN7(Class cls, Object obj) {
        if (obj == null) {
            return A00(cls);
        }
        return A00(obj.getClass());
    }

    @Override // X.InterfaceC65565Tmr
    public final AbstractC910944l F8w(AbstractC913445n abstractC913445n, String str) {
        if (this.A01) {
            str = str.toLowerCase();
        }
        return (AbstractC910944l) this.A00.get(str);
    }

    @Override // X.InterfaceC65565Tmr
    public final String CN6(Object obj) {
        return A00(obj.getClass());
    }

    public final String toString() {
        return String.format("[%s; id-to-type=%s]", MSY.A0h(this), this.A00);
    }
}
