package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.3f5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78393f5 extends AbstractC76013b6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C2WA A05;
    public final C50882Vk A06;
    public final C78373f3 A07;

    public C78393f5(C2WA c2wa, C50882Vk c50882Vk, C78373f3 c78373f3, int i, int i2, int i3, int i4, int i5) {
        super(i3, false);
        this.A07 = c78373f3;
        this.A06 = c50882Vk;
        this.A05 = c2wa;
        this.A04 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A01 = i5;
    }

    @Override // X.AbstractC76013b6
    public final String A04() {
        return "layout";
    }

    @Override // X.AbstractC76013b6
    public final int A02() {
        return this.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    @Override // X.AbstractC76013b6
    public final /* bridge */ /* synthetic */ InterfaceC50892Vl A03() {
        long A00 = AbstractC78403f6.A00(this.A04, this.A00);
        java.util.Set set = AbstractC50692Uq.A00;
        if (!set.isEmpty()) {
            ?? r0 = 0;
            ?? r3 = 0;
            for (Object obj : set) {
                String[] strArr = ((AbstractC50682Uo) obj).A00;
                if (AbstractC009903n.A0O("Litho.ComponentTree.Layout", strArr) || AbstractC009903n.A0O("*", strArr)) {
                    if (r3 == 0) {
                        r3 = new ArrayList();
                    }
                    r3.add(obj);
                }
            }
            if (r3 == 0) {
                r3 = C16930sl.A00;
            }
            if (!r3.isEmpty()) {
                for (Object obj2 : r3) {
                    if (obj2 instanceof C60540R6d) {
                        if (r0 == 0) {
                            r0 = new ArrayList();
                        }
                        r0.add(obj2);
                    }
                }
                if (r0 == 0) {
                    r0 = C16930sl.A00;
                }
                C14360o3.A0C(r0, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.rendercore.debug.TraceListener<kotlin.Any?>>");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C78373f3 c78373f3 = this.A07;
                linkedHashMap.put("root", c78373f3.A01.A0H());
                linkedHashMap.put("sizeConstraints", C78613fT.A04(A00));
                int i = this.A03;
                linkedHashMap.put("version", Integer.valueOf(i));
                linkedHashMap.put(CacheBehaviorLogger.SOURCE, AbstractC225109wZ.A00(this.A01));
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(r0, 10));
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C60540R6d) it.next()).A01("Litho.ComponentTree.Layout"));
                }
                long currentTimeMillis = System.currentTimeMillis();
                long nanoTime = System.nanoTime();
                int i2 = this.A02;
                C50882Vk A002 = AbstractC78453fB.A00(this.A05, this.A06, c78373f3, this, i, i2, A00);
                R6Z r6z = new R6Z("Litho.ComponentTree.Layout", String.valueOf(i2), linkedHashMap, currentTimeMillis, System.nanoTime() - nanoTime);
                int i3 = 0;
                for (Object obj3 : r0) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    ((C60540R6d) obj3).A02(r6z, arrayList.get(i3));
                    i3 = i4;
                }
                Iterator it2 = r3.iterator();
                while (it2.hasNext()) {
                    ((AbstractC50682Uo) it2.next()).A00(r6z);
                }
                return A002;
            }
        }
        return AbstractC78453fB.A00(this.A05, this.A06, this.A07, this, this.A03, this.A02, A00);
    }
}
