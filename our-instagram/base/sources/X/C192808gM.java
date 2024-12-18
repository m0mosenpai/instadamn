package X;

/* renamed from: X.8gM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192808gM {
    public final AbstractC192848gQ A00;

    public final void A00(AbstractC193008gg abstractC193008gg) {
        Object obj;
        AbstractC192848gQ abstractC192848gQ = this.A00;
        if (abstractC192848gQ instanceof AbstractC193068gm) {
            if (abstractC193008gg instanceof C192998gf) {
                obj = C66246U5q.A00(((C192998gf) abstractC193008gg).A00);
            } else if (abstractC193008gg instanceof C209899Qb) {
                obj = ((C209899Qb) abstractC193008gg).A00;
            } else {
                throw new RuntimeException();
            }
        } else if (abstractC192848gQ instanceof AbstractC193078gn) {
            boolean z = abstractC193008gg instanceof C192998gf;
            obj = abstractC193008gg;
            if (!z) {
                if (abstractC193008gg instanceof C209899Qb) {
                    return;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            if (!(abstractC192848gQ instanceof AbstractC193088go)) {
                return;
            }
            if (abstractC193008gg instanceof C192998gf) {
                obj = ((C192998gf) abstractC193008gg).A00;
            } else if (abstractC193008gg instanceof C209899Qb) {
                return;
            } else {
                throw new RuntimeException();
            }
        }
        abstractC192848gQ.A04(obj);
    }

    public final void A01(AbstractC193008gg abstractC193008gg) {
        AbstractC192848gQ abstractC192848gQ = this.A00;
        if (abstractC192848gQ instanceof AbstractC192838gP) {
            if (!(abstractC193008gg instanceof C192998gf)) {
                if (!(abstractC193008gg instanceof C209899Qb)) {
                    throw new RuntimeException();
                }
                return;
            }
        } else if (abstractC192848gQ instanceof AbstractC215049fg) {
            if (abstractC193008gg instanceof C192998gf) {
                C192998gf c192998gf = (C192998gf) abstractC193008gg;
                C14360o3.A0B(c192998gf, 1);
                abstractC192848gQ.A04(new C209899Qb(C66246U5q.A00(c192998gf.A00), ((AbstractC193008gg) c192998gf).A00, c192998gf.A02, c192998gf.A01));
                return;
            } else if (!(abstractC193008gg instanceof C209899Qb)) {
                throw new RuntimeException();
            }
        } else {
            return;
        }
        abstractC192848gQ.A04(abstractC193008gg);
    }

    public final void A02(AbstractC115105If abstractC115105If) {
        AbstractC192848gQ abstractC192848gQ = this.A00;
        if (abstractC192848gQ != null) {
            abstractC192848gQ.A03(abstractC115105If);
        }
    }

    public C192808gM(AbstractC192848gQ abstractC192848gQ) {
        this.A00 = abstractC192848gQ;
    }
}
