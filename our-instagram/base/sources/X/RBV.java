package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class RBV extends AbstractC64171T2a implements Serializable {
    public static final JsonDeserializer A0B = new FailingDeserializer();
    public SZ3 A00;
    public String A01;
    public int A02;
    public TI7 A03;
    public final AbstractC910944l A04;
    public final JsonDeserializer A05;
    public final C913945y A06;
    public final InterfaceC102444jN A07;
    public final AbstractC63020Sal A08;
    public final C913945y A09;
    public final transient C45A A0A;

    public static final void A01(C16L c16l, Exception exc) {
        Iterator it = C914045z.A00;
        if (!(exc instanceof IOException)) {
            C914045z.A0F(exc);
            Exception exc2 = exc;
            while (exc2.getCause() != null) {
                exc2 = exc2.getCause();
            }
            throw new C102314j6(c16l, C914045z.A09(exc2), exc2);
        }
        throw exc;
    }

    public final int A02() {
        RBV rbv;
        if (this instanceof R9f) {
            rbv = ((R9f) this).A00;
        } else if (this instanceof R9e) {
            rbv = ((R9e) this).A00;
        } else {
            if (this instanceof R9k) {
                return ((R9k) this).A02;
            }
            throw AbstractC58319PtB.A0l("Internal error: no creator index for property '%s' (of type %s)", new Object[]{this.A06.A02, MSY.A0h(this)});
        }
        return rbv.A02();
    }

    public final JsonDeserializer A03() {
        if (this instanceof R9e) {
            return ((R9e) this).A00.A03();
        }
        JsonDeserializer jsonDeserializer = this.A05;
        if (jsonDeserializer != A0B) {
            return jsonDeserializer;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RBV A04(JsonDeserializer jsonDeserializer) {
        R9k r9k;
        if (this instanceof R9h) {
            R9h r9h = (R9h) this;
            JsonDeserializer jsonDeserializer2 = r9h.A05;
            r9k = r9h;
            if (jsonDeserializer2 != jsonDeserializer) {
                InterfaceC102444jN interfaceC102444jN = r9h.A07;
                if (jsonDeserializer2 == interfaceC102444jN) {
                    interfaceC102444jN = jsonDeserializer;
                }
                return new R9h(jsonDeserializer, interfaceC102444jN, r9h);
            }
        } else if (this instanceof R9g) {
            R9g r9g = (R9g) this;
            JsonDeserializer jsonDeserializer3 = r9g.A05;
            r9k = r9g;
            if (jsonDeserializer3 != jsonDeserializer) {
                InterfaceC102444jN interfaceC102444jN2 = r9g.A07;
                if (jsonDeserializer3 == interfaceC102444jN2) {
                    interfaceC102444jN2 = jsonDeserializer;
                }
                return new R9g(jsonDeserializer, interfaceC102444jN2, r9g);
            }
        } else if (this instanceof R9f) {
            R9f r9f = (R9f) this;
            JsonDeserializer jsonDeserializer4 = r9f.A05;
            r9k = r9f;
            if (jsonDeserializer4 != jsonDeserializer) {
                InterfaceC102444jN interfaceC102444jN3 = r9f.A07;
                if (jsonDeserializer4 == interfaceC102444jN3) {
                    interfaceC102444jN3 = jsonDeserializer;
                }
                return new R9f(jsonDeserializer, interfaceC102444jN3, r9f);
            }
        } else if (this instanceof R9j) {
            R9j r9j = (R9j) this;
            JsonDeserializer jsonDeserializer5 = r9j.A05;
            r9k = r9j;
            if (jsonDeserializer5 != jsonDeserializer) {
                InterfaceC102444jN interfaceC102444jN4 = r9j.A07;
                if (jsonDeserializer5 == interfaceC102444jN4) {
                    interfaceC102444jN4 = jsonDeserializer;
                }
                return new R9j(jsonDeserializer, interfaceC102444jN4, r9j);
            }
        } else if (this instanceof R9i) {
            R9i r9i = (R9i) this;
            JsonDeserializer jsonDeserializer6 = r9i.A05;
            r9k = r9i;
            if (jsonDeserializer6 != jsonDeserializer) {
                InterfaceC102444jN interfaceC102444jN5 = r9i.A07;
                if (jsonDeserializer6 == interfaceC102444jN5) {
                    interfaceC102444jN5 = jsonDeserializer;
                }
                return new R9i(jsonDeserializer, interfaceC102444jN5, r9i);
            }
        } else {
            if (this instanceof R9e) {
                R9e r9e = (R9e) this;
                RBV rbv = r9e.A00;
                RBV A04 = rbv.A04(jsonDeserializer);
                if (A04 == rbv) {
                    return r9e;
                }
                return r9e.A0S(A04);
            }
            R9k r9k2 = (R9k) this;
            JsonDeserializer jsonDeserializer7 = r9k2.A05;
            r9k = r9k2;
            if (jsonDeserializer7 != jsonDeserializer) {
                InterfaceC102444jN interfaceC102444jN6 = r9k2.A07;
                if (jsonDeserializer7 == interfaceC102444jN6) {
                    interfaceC102444jN6 = jsonDeserializer;
                }
                return new R9k(jsonDeserializer, r9k2, interfaceC102444jN6);
            }
        }
        return r9k;
    }

    public final RBV A05(C913945y c913945y) {
        if (this instanceof R9h) {
            return new R9h(c913945y, (R9h) this);
        }
        if (this instanceof R9g) {
            return new R9g(c913945y, (R9g) this);
        }
        if (this instanceof R9f) {
            return new R9f(c913945y, (R9f) this);
        }
        if (this instanceof R9j) {
            return new R9j(c913945y, (R9j) this);
        }
        if (this instanceof R9i) {
            return new R9i(c913945y, (R9i) this);
        }
        if (this instanceof R9e) {
            R9e r9e = (R9e) this;
            RBV rbv = r9e.A00;
            RBV A05 = rbv.A05(c913945y);
            if (A05 == rbv) {
                return r9e;
            }
            return r9e.A0S(A05);
        }
        return new R9k(c913945y, (R9k) this);
    }

    public final RBV A06(InterfaceC102444jN interfaceC102444jN) {
        if (this instanceof R9h) {
            R9h r9h = (R9h) this;
            return new R9h(r9h.A05, interfaceC102444jN, r9h);
        }
        if (this instanceof R9g) {
            R9g r9g = (R9g) this;
            return new R9g(r9g.A05, interfaceC102444jN, r9g);
        }
        if (this instanceof R9f) {
            R9f r9f = (R9f) this;
            return new R9f(r9f.A05, interfaceC102444jN, r9f);
        }
        if (this instanceof R9j) {
            R9j r9j = (R9j) this;
            return new R9j(r9j.A05, interfaceC102444jN, r9j);
        }
        if (this instanceof R9i) {
            R9i r9i = (R9i) this;
            return new R9i(r9i.A05, interfaceC102444jN, r9i);
        }
        if (this instanceof R9e) {
            R9e r9e = (R9e) this;
            RBV rbv = r9e.A00;
            RBV A06 = rbv.A06(interfaceC102444jN);
            if (A06 == rbv) {
                return r9e;
            }
            return r9e.A0S(A06);
        }
        R9k r9k = (R9k) this;
        return new R9k(r9k.A05, r9k, interfaceC102444jN);
    }

    public final RBV A07(String str) {
        C913945y c913945y;
        C913945y c913945y2 = this.A06;
        if (c913945y2 == null) {
            c913945y = new C913945y(str, null);
        } else {
            if (str == null) {
                str = "";
            }
            if (str.equals(c913945y2.A02)) {
                c913945y = c913945y2;
            } else {
                c913945y = new C913945y(str, c913945y2.A01);
            }
            if (c913945y == c913945y2) {
                return this;
            }
        }
        return A05(c913945y);
    }

    public final SZ3 A08() {
        if (this instanceof R9e) {
            return ((R9e) this).A00.A08();
        }
        return this.A00;
    }

    public final AbstractC63020Sal A09() {
        if (this instanceof R9e) {
            return ((R9e) this).A00.A09();
        }
        return this.A08;
    }

    public final Class A0A() {
        if (this instanceof R9e) {
            return ((R9e) this).A00.A0A();
        }
        return BSA().A09();
    }

    public final Object A0B() {
        TIB tib;
        if (this instanceof R9e) {
            return ((R9e) this).A00.A0B();
        }
        if ((this instanceof R9k) && (tib = ((R9k) this).A03) != null) {
            return tib.A01;
        }
        return null;
    }

    public final Object A0C(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (!c16l.A19(C16R.A0G)) {
            AbstractC63020Sal abstractC63020Sal = this.A08;
            JsonDeserializer jsonDeserializer = this.A05;
            if (abstractC63020Sal != null) {
                return jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
            }
            Object A0D = jsonDeserializer.A0D(c16l, anonymousClass469);
            if (A0D != null) {
                return A0D;
            }
        }
        return this.A07.BXX(anonymousClass469);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (r4.A05.A0F() != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003b, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        if (r3 == null) goto L56;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0107: INVOKE (r2 I:X.RBV), (r6 I:X.16L), (r0 I:java.lang.Exception), (r3 I:java.lang.Object) VIRTUAL call: X.RBV.A0I(X.16L, java.lang.Exception, java.lang.Object):void A[MD:(X.16L, java.lang.Exception, java.lang.Object):void (m)] (LINE:263), block:B:84:0x0107 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0107: INVOKE (r2v0 ?? I:X.RBV), (r6v0 ?? I:X.16L), (r0v4 ?? I:java.lang.Exception), (r3 I:java.lang.Object) VIRTUAL call: X.RBV.A0I(X.16L, java.lang.Exception, java.lang.Object):void A[MD:(X.16L, java.lang.Exception, java.lang.Object):void (m)] (LINE:263), block:B:84:0x0107 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0D(X.C16L r6, X.AnonymousClass469 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RBV.A0D(X.16L, X.469, java.lang.Object):java.lang.Object");
    }

    public final Object A0E(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        if (!c16l.A19(C16R.A0G)) {
            if (this.A08 != null) {
                AbstractC58318PtA.A1N(anonymousClass469, this.A04, "Cannot merge polymorphic property '%s'", new Object[]{this.A06.A02});
                throw C00O.createAndThrow();
            }
            Object A0C = this.A05.A0C(c16l, anonymousClass469, obj);
            if (A0C != null) {
                return A0C;
            }
        }
        InterfaceC102444jN interfaceC102444jN = this.A07;
        if (interfaceC102444jN == C64175T2e.A02) {
            return obj;
        }
        return interfaceC102444jN.BXX(anonymousClass469);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00d7: INVOKE (r2 I:X.RBV), (r0 I:X.16L), (r1 I:java.lang.Exception), (r8 I:java.lang.Object) VIRTUAL call: X.RBV.A0I(X.16L, java.lang.Exception, java.lang.Object):void A[MD:(X.16L, java.lang.Exception, java.lang.Object):void (m)] (LINE:215), block:B:88:0x00d6 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.R9e] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.R9d] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.R9e] */
    public final Object A0F(Object obj, Object obj2) {
        RBV A0I;
        RBV rbv;
        if (this instanceof R9h) {
            A0L(obj, obj2);
            throw C00O.createAndThrow();
        }
        if (this instanceof R9g) {
            rbv = ((R9g) this).A00.A05;
            if (rbv == null) {
                throw AbstractC166987dD.A1D("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
            }
        } else if (this instanceof R9f) {
            rbv = ((R9f) this).A00;
        } else {
            try {
                if (this instanceof R9j) {
                    Object invoke = ((R9j) this).A02.invoke(obj, obj2);
                    if (invoke != null) {
                        return invoke;
                    }
                    return obj;
                }
                if (!(this instanceof R9i)) {
                    if (this instanceof R9e) {
                        ?? r5 = (R9e) this;
                        if (r5 instanceof R9c) {
                            if (obj2 == null) {
                                return obj;
                            }
                        } else if (r5 instanceof R9d) {
                            r5 = (R9d) r5;
                            if (obj2 != null) {
                                if (r5.A02) {
                                    if (obj2 instanceof Object[]) {
                                        for (Object obj3 : (Object[]) obj2) {
                                            if (obj3 != null) {
                                                r5.A00.A0L(obj3, obj);
                                            }
                                        }
                                    } else if (obj2 instanceof Collection) {
                                        for (Object obj4 : (Collection) obj2) {
                                            if (obj4 != null) {
                                                r5.A00.A0L(obj4, obj);
                                            }
                                        }
                                    } else if (obj2 instanceof Map) {
                                        Iterator A16 = AbstractC166997dE.A16((Map) obj2);
                                        while (A16.hasNext()) {
                                            Object next = A16.next();
                                            if (next != null) {
                                                r5.A00.A0L(next, obj);
                                            }
                                        }
                                    } else {
                                        throw AbstractC166987dD.A14(AnonymousClass001.A11("Unsupported container type (", MSY.A0h(obj2), ") when resolving reference '", r5.A01, "'"));
                                    }
                                } else {
                                    r5.A00.A0L(obj2, obj);
                                }
                            }
                        }
                        return r5.A00.A0F(obj, obj2);
                    }
                    R9k r9k = (R9k) this;
                    R9k.A00(r9k);
                    rbv = r9k.A00;
                } else {
                    ((R9i) this).A02.set(obj, obj2);
                    return obj;
                }
            } catch (Exception e) {
                A0I.A0I(null, e, obj2);
                throw C00O.createAndThrow();
            }
        }
        return rbv.A0F(obj, obj2);
    }

    public final String A0G() {
        if (this instanceof R9e) {
            return ((R9e) this).A00.A0G();
        }
        return this.A01;
    }

    public final void A0H(int i) {
        if (this instanceof R9e) {
            ((R9e) this).A00.A0H(i);
            return;
        }
        int i2 = this.A02;
        if (i2 == -1) {
            this.A02 = i;
            return;
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A0y("Property '", this.A06.A02, "' already had index (", "), trying to assign ", i2, i));
    }

    public final void A0I(C16L c16l, Exception exc, Object obj) {
        if (exc instanceof IllegalArgumentException) {
            String A07 = C914045z.A07(obj);
            StringBuilder A0s = AbstractC58318PtA.A0s("Problem deserializing property '");
            A0s.append(this.A06.A02);
            A0s.append("' (expected type: ");
            A0s.append(this.A04);
            A0s.append("; actual type: ");
            A0s.append(A07);
            A0s.append(")");
            String A09 = C914045z.A09(exc);
            if (A09 != null) {
                A0s.append(", problem: ");
            } else {
                A09 = " (no error message provided)";
            }
            throw new C102314j6(c16l, AbstractC166997dE.A0x(A09, A0s), exc);
        }
        A01(c16l, exc);
        throw C00O.createAndThrow();
    }

    public final void A0J(C912845h c912845h) {
        RBV rbv;
        RBK rbk;
        if (this instanceof R9h) {
            rbk = ((R9h) this).A00;
        } else {
            if (this instanceof R9f) {
                rbv = ((R9f) this).A00;
            } else if (this instanceof R9j) {
                rbk = ((R9j) this).A00;
            } else {
                if (this instanceof R9i) {
                    C914045z.A0H(((R9i) this).A02, c912845h.A07());
                    return;
                }
                if (this instanceof R9e) {
                    R9e r9e = (R9e) this;
                    if (r9e instanceof R9d) {
                        R9d r9d = (R9d) r9e;
                        ((R9e) r9d).A00.A0J(c912845h);
                        rbv = r9d.A00;
                    } else {
                        rbv = r9e.A00;
                    }
                    rbv.A0J(c912845h);
                    return;
                }
                if (!(this instanceof R9k)) {
                    return;
                } else {
                    rbv = ((R9k) this).A00;
                }
            }
            if (rbv == null) {
                return;
            }
            rbv.A0J(c912845h);
            return;
        }
        rbk.A0D(c912845h.A07());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fd, code lost:
    
        if (r3 == null) goto L67;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0140: INVOKE (r2 I:X.RBV), (r6 I:X.16L), (r0 I:java.lang.Exception), (r3 I:java.lang.Object) VIRTUAL call: X.RBV.A0I(X.16L, java.lang.Exception, java.lang.Object):void A[MD:(X.16L, java.lang.Exception, java.lang.Object):void (m)] (LINE:320), block:B:89:0x0140 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0140: INVOKE (r2v0 ?? I:X.RBV), (r6v0 ?? I:X.16L), (r0v4 ?? I:java.lang.Exception), (r3 I:java.lang.Object) VIRTUAL call: X.RBV.A0I(X.16L, java.lang.Exception, java.lang.Object):void A[MD:(X.16L, java.lang.Exception, java.lang.Object):void (m)] (LINE:320), block:B:89:0x0140 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(java.lang.Object r5, X.C16L r6, X.AnonymousClass469 r7) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RBV.A0K(java.lang.Object, X.16L, X.469):void");
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x006d: INVOKE (r2 I:X.RBV), (r0 I:X.16L), (r1 I:java.lang.Exception), (r5 I:java.lang.Object) VIRTUAL call: X.RBV.A0I(X.16L, java.lang.Exception, java.lang.Object):void A[MD:(X.16L, java.lang.Exception, java.lang.Object):void (m)] (LINE:109), block:B:39:0x006c */
    public final void A0L(Object obj, Object obj2) {
        RBV A0I;
        RBV rbv;
        if (this instanceof R9h) {
            throw AbstractC166987dD.A1D(AnonymousClass001.A0g("Should never call `set()` on setterless property ('", this.A06.A02, "')"));
        }
        if (this instanceof R9g) {
            A0F(obj, obj2);
            return;
        }
        if (this instanceof R9f) {
            rbv = ((R9f) this).A00;
        } else {
            try {
                if (!(this instanceof R9j)) {
                    if (!(this instanceof R9i)) {
                        if (this instanceof R9e) {
                            R9e r9e = (R9e) this;
                            if (r9e instanceof R9c) {
                                if (obj2 == null) {
                                    return;
                                }
                            } else if (r9e instanceof R9d) {
                                r9e.A0F(obj, obj2);
                                return;
                            }
                            rbv = r9e.A00;
                        } else {
                            R9k r9k = (R9k) this;
                            R9k.A00(r9k);
                            rbv = r9k.A00;
                        }
                    } else {
                        ((R9i) this).A02.set(obj, obj2);
                        return;
                    }
                } else {
                    ((R9j) this).A02.invoke(obj, obj2);
                    return;
                }
            } catch (Exception e) {
                A0I.A0I(null, e, obj2);
                throw C00O.createAndThrow();
            }
        }
        rbv.A0L(obj, obj2);
    }

    public final void A0M(Class[] clsArr) {
        TI7 ti7;
        if (clsArr == null) {
            ti7 = null;
        } else {
            int length = clsArr.length;
            if (length != 0) {
                if (length != 1) {
                    ti7 = new RDL(clsArr);
                } else {
                    ti7 = new RDK(clsArr[0]);
                }
            } else {
                ti7 = TI7.A00;
            }
        }
        this.A03 = ti7;
    }

    public final boolean A0N() {
        if (this instanceof R9e) {
            return ((R9e) this).A00.A0N();
        }
        JsonDeserializer jsonDeserializer = this.A05;
        if (jsonDeserializer != null && jsonDeserializer != A0B) {
            return true;
        }
        return false;
    }

    public final boolean A0O() {
        if (this instanceof R9e) {
            return ((R9e) this).A00.A0O();
        }
        return AbstractC167007dF.A1W(this.A08);
    }

    public final boolean A0P() {
        if (this instanceof R9e) {
            return ((R9e) this).A00.A0P();
        }
        return AbstractC167007dF.A1W(this.A03);
    }

    public final boolean A0Q() {
        TIB tib;
        Boolean bool;
        if (this instanceof R9e) {
            return ((R9e) this).A00.A0Q();
        }
        if ((this instanceof R9k) && (tib = ((R9k) this).A03) != null && (bool = tib.A00) != null && !bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A0R(Class cls) {
        if (this instanceof R9e) {
            return ((R9e) this).A00.A0R(cls);
        }
        TI7 ti7 = this.A03;
        if (ti7 != null) {
            if (ti7 instanceof RDK) {
                Class cls2 = ((RDK) ti7).A00;
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
                return false;
            }
            if (ti7 instanceof RDL) {
                Class[] clsArr = ((RDL) ti7).A00;
                for (Class cls3 : clsArr) {
                    if (cls == cls3 || cls3.isAssignableFrom(cls)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65620ToB
    public final C913945y B8w() {
        return this.A06;
    }

    @Override // X.InterfaceC65620ToB
    public final RBL BSA() {
        RBV rbv;
        if (this instanceof R9h) {
            return ((R9h) this).A00;
        }
        if (this instanceof R9g) {
            return null;
        }
        if (this instanceof R9f) {
            rbv = ((R9f) this).A00;
        } else {
            if (this instanceof R9j) {
                return ((R9j) this).A00;
            }
            if (this instanceof R9i) {
                return ((R9i) this).A00;
            }
            if (this instanceof R9e) {
                rbv = ((R9e) this).A00;
            } else {
                return ((R9k) this).A04;
            }
        }
        return rbv.BSA();
    }

    @Override // X.InterfaceC65620ToB
    public final AbstractC910944l CBP() {
        return this.A04;
    }

    @Override // X.InterfaceC65620ToB
    public final String getName() {
        return this.A06.A02;
    }

    public String toString() {
        return AnonymousClass001.A0g("[property '", this.A06.A02, "']");
    }

    public RBV(C913945y c913945y, RBV rbv) {
        super(rbv);
        this.A02 = -1;
        this.A06 = c913945y;
        this.A04 = rbv.A04;
        this.A09 = rbv.A09;
        this.A0A = rbv.A0A;
        this.A05 = rbv.A05;
        this.A08 = rbv.A08;
        this.A01 = rbv.A01;
        this.A02 = rbv.A02;
        this.A03 = rbv.A03;
        this.A07 = rbv.A07;
    }

    public RBV(JsonDeserializer jsonDeserializer, InterfaceC102444jN interfaceC102444jN, RBV rbv) {
        super(rbv);
        this.A02 = -1;
        this.A06 = rbv.A06;
        this.A04 = rbv.A04;
        this.A09 = rbv.A09;
        this.A0A = rbv.A0A;
        this.A08 = rbv.A08;
        this.A01 = rbv.A01;
        this.A02 = rbv.A02;
        jsonDeserializer = jsonDeserializer == null ? A0B : jsonDeserializer;
        this.A05 = jsonDeserializer;
        this.A03 = rbv.A03;
        this.A07 = interfaceC102444jN == A0B ? jsonDeserializer : interfaceC102444jN;
    }

    public RBV(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, TIH tih, C913945y c913945y) {
        super(tih);
        String A00;
        this.A02 = -1;
        if (c913945y == null) {
            c913945y = C913945y.A03;
        } else {
            String str = c913945y.A02;
            if (!str.isEmpty() && (A00 = C16U.A01.A00(str)) != str) {
                c913945y = new C913945y(A00, c913945y.A01);
            }
        }
        this.A06 = c913945y;
        this.A04 = abstractC910944l;
        this.A09 = null;
        this.A0A = null;
        this.A03 = null;
        this.A08 = null;
        this.A05 = jsonDeserializer;
        this.A07 = jsonDeserializer;
    }

    public RBV(AbstractC910944l abstractC910944l, TIH tih, C913945y c913945y, AbstractC63020Sal abstractC63020Sal, C45A c45a) {
        super(tih);
        String A00;
        this.A02 = -1;
        if (c913945y == null) {
            c913945y = C913945y.A03;
        } else {
            String str = c913945y.A02;
            if (!str.isEmpty() && (A00 = C16U.A01.A00(str)) != str) {
                c913945y = new C913945y(A00, c913945y.A01);
            }
        }
        this.A06 = c913945y;
        this.A04 = abstractC910944l;
        this.A09 = null;
        this.A0A = c45a;
        this.A03 = null;
        this.A08 = abstractC63020Sal != null ? abstractC63020Sal.A02(this) : abstractC63020Sal;
        JsonDeserializer jsonDeserializer = A0B;
        this.A05 = jsonDeserializer;
        this.A07 = jsonDeserializer;
    }

    public RBV(RBV rbv) {
        super(rbv);
        this.A02 = -1;
        this.A06 = rbv.A06;
        this.A04 = rbv.A04;
        this.A09 = rbv.A09;
        this.A0A = rbv.A0A;
        this.A05 = rbv.A05;
        this.A08 = rbv.A08;
        this.A01 = rbv.A01;
        this.A02 = rbv.A02;
        this.A03 = rbv.A03;
        this.A07 = rbv.A07;
    }
}
