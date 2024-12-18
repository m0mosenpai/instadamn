package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.54s, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54s extends C54t implements Serializable {
    public final Map A00;

    @Override // X.AbstractC911344p
    public final boolean A0B() {
        return true;
    }

    @Override // X.AbstractC911444q
    public final boolean A01(AbstractC913345m abstractC913345m) {
        return this.A00.isEmpty();
    }

    @Override // X.AbstractC911344p
    public final AbstractC911344p A04(String str) {
        return (AbstractC911344p) this.A00.get(str);
    }

    @Override // X.AbstractC911344p
    public final AbstractC911344p A05(String str) {
        AbstractC911344p abstractC911344p = (AbstractC911344p) this.A00.get("hostText");
        if (abstractC911344p == null) {
            return C60605RBw.A00;
        }
        return abstractC911344p;
    }

    @Override // X.AbstractC911344p
    public final Iterator A08() {
        return this.A00.values().iterator();
    }

    @Override // X.AbstractC911344p
    public final Iterator A09() {
        return this.A00.keySet().iterator();
    }

    @Deprecated
    public final void A0C(AbstractC911344p abstractC911344p, String str) {
        if (abstractC911344p == null) {
            abstractC911344p = C60603RBu.A00;
        }
        this.A00.put(str, abstractC911344p);
    }

    public final void A0E(String str, long j) {
        this.A00.put(str, new C1122654z(j));
    }

    public final void A0F(String str, String str2) {
        InterfaceC911544r A00;
        if (str2 == null) {
            A00 = C60603RBu.A00;
        } else {
            A00 = C1122354v.A00(str2);
        }
        this.A00.put(str, A00);
    }

    public final void A0G(String str, boolean z) {
        AnonymousClass550 anonymousClass550;
        if (z) {
            anonymousClass550 = AnonymousClass550.A02;
        } else {
            anonymousClass550 = AnonymousClass550.A01;
        }
        this.A00.put(str, anonymousClass550);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r8.A05.A0C(X.EnumC912645f.WRITE_EMPTY_JSON_ARRAYS) != false) goto L5;
     */
    @Override // X.InterfaceC911544r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EOv(X.AnonymousClass182 r7, X.AbstractC913345m r8, X.AbstractC63023Sar r9) {
        /*
            r6 = this;
            if (r8 == 0) goto Ld
            X.45f r1 = X.EnumC912645f.WRITE_EMPTY_JSON_ARRAYS
            X.45R r0 = r8.A05
            boolean r0 = r0.A0C(r1)
            r5 = 1
            if (r0 == 0) goto Le
        Ld:
            r5 = 0
        Le:
            X.16R r0 = X.C16R.A0D
            X.SX7 r0 = r9.A04(r0, r6)
            X.SX7 r4 = r9.A02(r7, r0)
            java.util.Map r0 = r6.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L22:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getValue()
            X.54u r1 = (X.C54u) r1
            if (r5 == 0) goto L43
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L43
            boolean r0 = r1.A01(r8)
            if (r0 == 0) goto L43
            goto L22
        L43:
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r7.A0r(r0)
            r1.EOr(r7, r8)
            goto L22
        L50:
            r9.A03(r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54s.EOv(X.182, X.45m, X.Sar):void");
    }

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C54s)) {
            return false;
        }
        return this.A00.equals(((C54s) obj).A00);
    }

    @Override // X.C54u
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C54s(C913045j c913045j) {
        super(c913045j);
        this.A00 = new LinkedHashMap();
    }

    public final void A0D(String str, int i) {
        this.A00.put(str, C1122554x.A00(i));
    }
}
