package X;

/* renamed from: X.Sal, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63020Sal {
    public static Object A01(C16L c16l, AbstractC910944l abstractC910944l) {
        Class cls = abstractC910944l.A00;
        C16R A10 = c16l.A10();
        if (A10 == null) {
            return null;
        }
        int ordinal = A10.ordinal();
        if (ordinal != 7) {
            if (ordinal != 8) {
                if (ordinal != 9) {
                    if (ordinal != 10) {
                        if (ordinal != 11 || !cls.isAssignableFrom(Boolean.class)) {
                            return null;
                        }
                        return Boolean.FALSE;
                    }
                    if (!cls.isAssignableFrom(Boolean.class)) {
                        return null;
                    }
                    return Boolean.TRUE;
                }
                if (!cls.isAssignableFrom(Double.class)) {
                    return null;
                }
                return Double.valueOf(c16l.A0g());
            }
            if (!cls.isAssignableFrom(Integer.class)) {
                return null;
            }
            return Integer.valueOf(c16l.A0i());
        }
        if (!cls.isAssignableFrom(String.class)) {
            return null;
        }
        return c16l.A1P();
    }

    public final AbstractC63020Sal A02(InterfaceC65620ToB interfaceC65620ToB) {
        C60586RBb c60586RBb;
        if (this instanceof RBc) {
            RBd rBd = (RBd) this;
            if (interfaceC65620ToB != rBd.A01) {
                return new RBd(interfaceC65620ToB, rBd);
            }
            return rBd;
        }
        C60586RBb c60586RBb2 = (C60586RBb) this;
        if (c60586RBb2 instanceof RBY) {
            InterfaceC65620ToB interfaceC65620ToB2 = c60586RBb2.A01;
            c60586RBb = c60586RBb2;
            if (interfaceC65620ToB != interfaceC65620ToB2) {
                return new RBd(interfaceC65620ToB, c60586RBb2);
            }
        } else if (c60586RBb2 instanceof C60585RBa) {
            C60585RBa c60585RBa = (C60585RBa) c60586RBb2;
            if (c60585RBa instanceof RBZ) {
                RBZ rbz = (RBZ) c60585RBa;
                InterfaceC65620ToB interfaceC65620ToB3 = ((RBd) rbz).A01;
                c60586RBb = rbz;
                if (interfaceC65620ToB != interfaceC65620ToB3) {
                    return new RBZ(interfaceC65620ToB, rbz);
                }
            } else {
                InterfaceC65620ToB interfaceC65620ToB4 = ((RBd) c60585RBa).A01;
                c60586RBb = c60585RBa;
                if (interfaceC65620ToB != interfaceC65620ToB4) {
                    return new C60585RBa(interfaceC65620ToB, c60585RBa);
                }
            }
        } else {
            InterfaceC65620ToB interfaceC65620ToB5 = c60586RBb2.A01;
            c60586RBb = c60586RBb2;
            if (interfaceC65620ToB != interfaceC65620ToB5) {
                return new RBd(interfaceC65620ToB, c60586RBb2);
            }
        }
        return c60586RBb;
    }

    public final Object A03(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (this instanceof RBc) {
            return ((RBc) this).A09(c16l, anonymousClass469);
        }
        C60586RBb c60586RBb = (C60586RBb) this;
        if ((c60586RBb instanceof C60585RBa) && !c16l.A19(C16R.A0C)) {
            return c60586RBb.A05(c16l, anonymousClass469);
        }
        return c60586RBb.A09(c16l, anonymousClass469);
    }

    public final Object A04(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (this instanceof RBc) {
            return ((RBc) this).A09(c16l, anonymousClass469);
        }
        return ((C60586RBb) this).A09(c16l, anonymousClass469);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0137, code lost:
    
        if (r3 != X.C16R.A0A) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.C16L r11, X.AnonymousClass469 r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63020Sal.A05(X.16L, X.469):java.lang.Object");
    }

    public final Object A06(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (this instanceof RBc) {
            return ((RBc) this).A09(c16l, anonymousClass469);
        }
        return ((C60586RBb) this).A09(c16l, anonymousClass469);
    }
}
