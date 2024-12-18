package X;

/* renamed from: X.Sar, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63023Sar {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.SX7, java.lang.Object] */
    public final SX7 A04(C16R c16r, Object obj) {
        Integer num;
        Integer num2;
        ?? obj2 = new Object();
        obj2.A03 = obj;
        obj2.A04 = null;
        obj2.A00 = c16r;
        int ordinal = A01().ordinal();
        if (ordinal != 4) {
            if (ordinal != 3) {
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        if (ordinal != 1) {
                            throw AbstractC166987dD.A18("Internal error: this code path should never get executed");
                        }
                        num2 = C05F.A01;
                    } else {
                        num2 = C05F.A00;
                    }
                    obj2.A02 = num2;
                    return obj2;
                }
                num = C05F.A0C;
            } else {
                num = C05F.A0Y;
            }
        } else {
            num = C05F.A0N;
        }
        obj2.A02 = num;
        obj2.A05 = A06();
        return obj2;
    }

    public final EnumC61124Rfe A01() {
        if (this instanceof C60588RBf) {
            return ((C60588RBf) this).A00.A01();
        }
        if (this instanceof C60595RBm) {
            return EnumC61124Rfe.WRAPPER_OBJECT;
        }
        if (this instanceof C60596RBn) {
            return EnumC61124Rfe.EXTERNAL_PROPERTY;
        }
        C60594RBl c60594RBl = (C60594RBl) this;
        if (c60594RBl instanceof C60590RBh) {
            if (((C60590RBh) c60594RBl) instanceof C60589RBg) {
                return EnumC61124Rfe.EXISTING_PROPERTY;
            }
            return EnumC61124Rfe.PROPERTY;
        }
        return EnumC61124Rfe.WRAPPER_ARRAY;
    }

    public final SX7 A02(AnonymousClass182 anonymousClass182, SX7 sx7) {
        String valueOf;
        if (this instanceof C60588RBf) {
            C60588RBf c60588RBf = (C60588RBf) this;
            sx7.A03 = c60588RBf.A01;
            return c60588RBf.A00.A02(anonymousClass182, sx7);
        }
        AbstractC60587RBe abstractC60587RBe = (AbstractC60587RBe) this;
        Object obj = sx7.A04;
        if (obj == null) {
            Object obj2 = sx7.A03;
            Class cls = sx7.A01;
            InterfaceC65565Tmr interfaceC65565Tmr = abstractC60587RBe.A01;
            if (cls == null) {
                obj = interfaceC65565Tmr.CN6(obj2);
            } else {
                obj = interfaceC65565Tmr.CN7(cls, obj2);
            }
            sx7.A04 = obj;
        }
        C16R c16r = sx7.A00;
        if (anonymousClass182.A0W()) {
            sx7.A06 = false;
            anonymousClass182.A0I(obj);
        } else {
            if (obj instanceof String) {
                valueOf = (String) obj;
            } else {
                valueOf = String.valueOf(obj);
            }
            sx7.A06 = true;
            Integer num = sx7.A02;
            if (c16r != C16R.A0D && (num == C05F.A0C || num == C05F.A0N)) {
                num = C05F.A00;
                sx7.A02 = num;
            }
            int intValue = num.intValue();
            if (intValue != 4 && intValue != 3) {
                if (intValue != 2) {
                    if (intValue != 1) {
                        anonymousClass182.A0c();
                        anonymousClass182.A0u(valueOf);
                    } else {
                        anonymousClass182.A0d();
                        anonymousClass182.A0r(valueOf);
                    }
                } else {
                    anonymousClass182.A0p(sx7.A03);
                    anonymousClass182.A0S(sx7.A05, valueOf);
                    return sx7;
                }
            }
        }
        if (c16r == C16R.A0D) {
            anonymousClass182.A0p(sx7.A03);
        } else if (c16r == C16R.A0C) {
            anonymousClass182.A0c();
            return sx7;
        }
        return sx7;
    }

    public final SX7 A03(AnonymousClass182 anonymousClass182, SX7 sx7) {
        String valueOf;
        if (this instanceof C60588RBf) {
            return ((C60588RBf) this).A00.A03(anonymousClass182, sx7);
        }
        C16R c16r = sx7.A00;
        if (c16r == C16R.A0D) {
            anonymousClass182.A0a();
        } else if (c16r == C16R.A0C) {
            anonymousClass182.A0Z();
        }
        if (sx7.A06) {
            int intValue = sx7.A02.intValue();
            if (intValue != 4) {
                if (intValue != 3 && intValue != 2) {
                    if (intValue != 0) {
                        anonymousClass182.A0a();
                    } else {
                        anonymousClass182.A0Z();
                        return sx7;
                    }
                }
            } else {
                Object obj = sx7.A04;
                if (obj instanceof String) {
                    valueOf = (String) obj;
                } else {
                    valueOf = String.valueOf(obj);
                }
                anonymousClass182.A0S(sx7.A05, valueOf);
                return sx7;
            }
        }
        return sx7;
    }

    public final AbstractC63023Sar A05(InterfaceC65620ToB interfaceC65620ToB) {
        if (this instanceof C60588RBf) {
            throw AbstractC43592JPx.A11();
        }
        if (this instanceof C60595RBm) {
            AbstractC60587RBe abstractC60587RBe = (AbstractC60587RBe) this;
            if (abstractC60587RBe.A00 != interfaceC65620ToB) {
                return new AbstractC60587RBe(interfaceC65620ToB, abstractC60587RBe.A01);
            }
            return abstractC60587RBe;
        }
        if (this instanceof C60596RBn) {
            C60596RBn c60596RBn = (C60596RBn) this;
            if (((AbstractC60587RBe) c60596RBn).A00 == interfaceC65620ToB) {
                return c60596RBn;
            }
            return new C60596RBn(interfaceC65620ToB, c60596RBn.A01, c60596RBn.A00);
        }
        C60594RBl c60594RBl = (C60594RBl) this;
        if (c60594RBl instanceof C60590RBh) {
            C60590RBh c60590RBh = (C60590RBh) c60594RBl;
            boolean z = c60590RBh instanceof C60589RBg;
            InterfaceC65620ToB interfaceC65620ToB2 = ((AbstractC60587RBe) c60590RBh).A00;
            if (z) {
                if (interfaceC65620ToB2 == interfaceC65620ToB) {
                    return c60590RBh;
                }
                return new C60590RBh(interfaceC65620ToB, c60590RBh.A01, c60590RBh.A00);
            }
            if (interfaceC65620ToB2 == interfaceC65620ToB) {
                return c60590RBh;
            }
            return new C60590RBh(interfaceC65620ToB, c60590RBh.A01, c60590RBh.A00);
        }
        if (c60594RBl.A00 == interfaceC65620ToB) {
            return c60594RBl;
        }
        return new AbstractC60587RBe(interfaceC65620ToB, c60594RBl.A01);
    }

    public final String A06() {
        if (this instanceof C60588RBf) {
            return ((C60588RBf) this).A00.A06();
        }
        AbstractC60587RBe abstractC60587RBe = (AbstractC60587RBe) this;
        if (abstractC60587RBe instanceof C60590RBh) {
            return ((C60590RBh) abstractC60587RBe).A00;
        }
        if (abstractC60587RBe instanceof C60596RBn) {
            return ((C60596RBn) abstractC60587RBe).A00;
        }
        return null;
    }

    public static SX7 A00(AnonymousClass182 anonymousClass182, C16R c16r, AbstractC63023Sar abstractC63023Sar, Object obj) {
        return abstractC63023Sar.A02(anonymousClass182, abstractC63023Sar.A04(c16r, obj));
    }
}
