package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.40p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C903040p implements C3ZQ {
    public static final C3AV A07 = new C3AV(C903140q.A00);
    public final int A00;
    public final C50525MSe A01;
    public final C0f6 A02;
    public final C3ZP A03;
    public final C902940o A04;
    public final List A05;
    public final Map A06;

    public C903040p(C50525MSe c50525MSe, C0f6 c0f6, C902940o c902940o, InterfaceC16660sJ interfaceC16660sJ) {
        int i;
        C14360o3.A0B(c902940o, 3);
        this.A01 = c50525MSe;
        this.A02 = c0f6;
        this.A04 = c902940o;
        this.A05 = new ArrayList();
        this.A06 = new LinkedHashMap();
        this.A03 = new C3ZP(c50525MSe);
        int i2 = 0;
        for (Object obj : c902940o.A02) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            this.A05.add(new C903240r(this, obj, i2));
            if (i2 > 0) {
                int i4 = i2 - 1;
                ((C903240r) this.A05.get(i4)).A01 = (C903240r) this.A05.get(i2);
                ((C903240r) this.A05.get(i2)).A00 = (C903240r) this.A05.get(i4);
            }
            for (Object obj2 : (Iterable) interfaceC16660sJ.invoke(obj)) {
                if (obj2 != null) {
                    this.A06.put(obj2, this.A05.get(i2));
                }
            }
            i2 = i3;
        }
        if (this.A05.isEmpty()) {
            C0f5 AEp = this.A02.AEp("Empty carousel created", 817901863);
            AEp.ABU("param items count", this.A04.A02.size());
            AEp.report();
        }
        if (0 >= this.A05.size()) {
            if (AbstractC50712Us.A01.A05(1000) == 0) {
                C0f5 AEp2 = this.A02.AEp("Illegal carousel initial on screen index", 817901863);
                AEp2.ABU("items count", this.A05.size());
                AEp2.ABU("index", 0);
                AEp2.ABU("client_sampling", 1000);
                AEp2.report();
            }
            i = this.A05.size() - 1;
        } else {
            i = 0;
        }
        this.A00 = i;
    }

    @Override // X.C3ZQ
    public final Object Ava() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final Iterable A00(C903040p c903040p) {
        C3ZP c3zp = c903040p.A03;
        ?? r5 = (Iterable) C3ZP.A00(c3zp, c3zp, new C9E0(c3zp, 18));
        if (!AbstractC001800i.A0t(r5)) {
            List list = c903040p.A05;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                if (i >= c903040p.A00) {
                    arrayList.add(obj);
                }
                i = i2;
            }
            List A0d = AbstractC001800i.A0d(arrayList, c903040p.A04.A00);
            r5 = new ArrayList(AbstractC06950Ym.A1E(A0d, 10));
            Iterator it = A0d.iterator();
            while (it.hasNext()) {
                r5.add(new C09530e4(it.next(), 0));
            }
        }
        return r5;
    }

    @Override // X.C3ZQ
    public final boolean DR6(Object obj) {
        Object obj2 = this.A06.get(obj);
        if (obj2 != null) {
            C3ZP c3zp = this.A03;
            C3ZP.A00(c3zp, c3zp, new C9F5(1, obj2, c3zp));
        }
        C3ZP c3zp2 = this.A03;
        return !((Boolean) C3ZP.A00(c3zp2, c3zp2, new C9E0(c3zp2, 19))).booleanValue();
    }

    @Override // X.C3ZQ
    public final void DR7(Object obj) {
        Object obj2 = this.A06.get(obj);
        if (obj2 != null) {
            C3ZP c3zp = this.A03;
            C3ZP.A00(c3zp, c3zp, new C9F5(2, obj2, c3zp));
        }
    }

    public final String toString() {
        return AnonymousClass001.A0c("[ListCarouselNode] ", " carousel items", this.A06.size());
    }

    @Override // X.C3ZQ
    public final Iterable BWV(C206209Bd c206209Bd, C3AW c3aw, int i) {
        try {
            return A00(this);
        } catch (IndexOutOfBoundsException e) {
            C0f5 AEp = this.A02.AEp("Empty carousel iterated", 817901863);
            AEp.ERI(e);
            AEp.ABU("items count", this.A05.size());
            AEp.report();
            return C16930sl.A00;
        }
    }
}
