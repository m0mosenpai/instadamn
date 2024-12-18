package com.fasterxml.jackson.databind.deser;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58323PtF;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import X.C45B;
import X.C63016Sag;
import X.C63242Sfw;
import X.C64520THn;
import X.C64540TIw;
import X.C914146b;
import X.EnumC912945i;
import X.RBK;
import X.RBV;
import X.SQ5;
import X.SXY;
import X.TI5;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public class BuilderBasedDeserializer extends BeanDeserializerBase {
    public final AbstractC910944l A00;
    public final RBK A01;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final JsonDeserializer A0A(SXY sxy) {
        return new BuilderBasedDeserializer(this, sxy);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        Object[] objArr;
        String str;
        AbstractC910944l abstractC910944l = this.A00;
        Class cls = this.A08.A00;
        Class<?> cls2 = obj.getClass();
        if (cls.isAssignableFrom(cls2)) {
            objArr = new Object[]{abstractC910944l, cls.getName()};
            str = "Deserialization of %s by passing existing Builder (%s) instance not supported";
        } else {
            objArr = new Object[]{abstractC910944l, cls2.getName()};
            str = "Deserialization of %s by passing existing instance (of %s) not supported";
        }
        AbstractC58318PtA.A1N(anonymousClass469, abstractC910944l, str, objArr);
        throw C00O.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final Object A0g(C16L c16l, AnonymousClass469 anonymousClass469) {
        JsonDeserializer jsonDeserializer = ((BeanDeserializerBase) this).A00;
        if (jsonDeserializer == null && (jsonDeserializer = ((BeanDeserializerBase) this).A01) == null) {
            Integer A0N = anonymousClass469.A0N(A0I(), C05F.A15);
            boolean A0j = anonymousClass469.A0j(EnumC912945i.A0N);
            if (A0j || A0N != C05F.A00) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A08;
                if (A1J == c16r) {
                    int intValue = A0N.intValue();
                    if (intValue != 3) {
                        if (intValue != 2 && intValue != 1) {
                            anonymousClass469.A0Q(c16l, C16R.A0C, A0U(anonymousClass469), null, AbstractC58318PtA.A1b());
                        } else {
                            return BXX(anonymousClass469);
                        }
                    } else {
                        return A0K(anonymousClass469);
                    }
                } else if (A0j) {
                    Object A0D = A0D(c16l, anonymousClass469);
                    if (c16l.A1J() != c16r) {
                        A0s(anonymousClass469);
                    } else {
                        return A0D;
                    }
                }
                throw C00O.createAndThrow();
            }
            AbstractC58319PtB.A1G(c16l, anonymousClass469, this);
            throw C00O.createAndThrow();
        }
        Object A08 = this.A09.A08(anonymousClass469, jsonDeserializer.A0D(c16l, anonymousClass469));
        AbstractC58321PtD.A1L(anonymousClass469, this);
        RBK rbk = this.A01;
        if (rbk != null) {
            try {
                return rbk.A01.invoke(A08, null);
            } catch (Exception e) {
                A1E(anonymousClass469, e);
                throw C00O.createAndThrow();
            }
        }
        return A08;
    }

    public final Object A1F(C16L c16l, AnonymousClass469 anonymousClass469, C914146b c914146b, Object obj) {
        Class cls;
        if (this.A0F) {
            cls = anonymousClass469.A05;
        } else {
            cls = null;
        }
        C16R A10 = c16l.A10();
        while (A10 == C16R.A0A) {
            String A0Y = c16l.A0Y();
            RBV A02 = this.A0A.A02(A0Y);
            c16l.A1J();
            if (A02 != null) {
                if (cls != null && !A02.A0R(cls)) {
                    c16l.A0z();
                } else {
                    try {
                        obj = A02.A0D(c16l, anonymousClass469, obj);
                    } catch (Exception e) {
                        A1D(anonymousClass469, obj, A0Y, e);
                        throw C00O.createAndThrow();
                    }
                }
            } else if (C63242Sfw.A01(this, A0Y)) {
                A1A(c16l, anonymousClass469, obj, A0Y);
            } else {
                c914146b.A0r(A0Y);
                c914146b.A14(c16l);
                TI5 ti5 = this.A02;
                if (ti5 != null) {
                    ti5.A01(c16l, anonymousClass469, obj, A0Y);
                }
            }
            A10 = c16l.A1J();
        }
        c914146b.A0a();
        this.A05.A00(anonymousClass469, c914146b, obj);
        return obj;
    }

    public final Object A1H(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        Class cls;
        if (this.A0F) {
            cls = anonymousClass469.A05;
        } else {
            cls = null;
        }
        C63016Sag c63016Sag = new C63016Sag(this.A03);
        C16R A10 = c16l.A10();
        while (A10 == C16R.A0A) {
            String A0Y = c16l.A0Y();
            C16R A1J = c16l.A1J();
            RBV A02 = this.A0A.A02(A0Y);
            if (A02 != null) {
                if (A1J.A03) {
                    c63016Sag.A00(c16l, anonymousClass469, obj, A0Y);
                }
                if (cls != null && !A02.A0R(cls)) {
                    c16l.A0z();
                } else {
                    try {
                        obj = A02.A0D(c16l, anonymousClass469, obj);
                    } catch (Exception e) {
                        A1D(anonymousClass469, obj, A0Y, e);
                        throw C00O.createAndThrow();
                    }
                }
            } else if (C63242Sfw.A01(this, A0Y)) {
                A1A(c16l, anonymousClass469, obj, A0Y);
            } else if (!c63016Sag.A03(c16l, anonymousClass469, obj, A0Y)) {
                TI5 ti5 = this.A02;
                if (ti5 != null) {
                    ti5.A01(c16l, anonymousClass469, obj, A0Y);
                } else {
                    A0q(c16l, anonymousClass469, obj, A0Y);
                }
            }
            A10 = c16l.A1J();
        }
        c63016Sag.A02(obj, c16l, anonymousClass469);
        return obj;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, SXY sxy) {
        super(builderBasedDeserializer, sxy);
        this.A01 = builderBasedDeserializer.A01;
        this.A00 = builderBasedDeserializer.A00;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:134:0x0035. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x01bf: INVOKE 
      (r6v0 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
      (r8v0 ?? I:X.469)
      (r2v0 ?? I:java.lang.Object)
      (r1 I:java.lang.String)
      (r0 I:java.lang.Throwable)
     VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1D(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:447), block:B:145:0x01bf */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x01bf: INVOKE 
      (r6v0 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
      (r8v0 ?? I:X.469)
      (r2 I:java.lang.Object)
      (r1 I:java.lang.String)
      (r0 I:java.lang.Throwable)
     VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1D(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:447), block:B:145:0x01bf */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01db A[Catch: Exception -> 0x01e3, TRY_ENTER, TryCatch #3 {Exception -> 0x01e3, blocks: (B:19:0x01db, B:76:0x00f4), top: B:75:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0D(X.C16L r7, X.AnonymousClass469 r8) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.A0D(X.16L, X.469):java.lang.Object");
    }

    public final Object A1G(C16L c16l, AnonymousClass469 anonymousClass469, Class cls, Object obj) {
        C16R A10 = c16l.A10();
        while (A10 == C16R.A0A) {
            String A0Y = c16l.A0Y();
            RBV A01 = C64540TIw.A01(c16l, this, A0Y);
            if (A01 != null) {
                if (!A01.A0R(cls)) {
                    c16l.A0z();
                } else {
                    try {
                        obj = A01.A0D(c16l, anonymousClass469, obj);
                    } catch (Exception e) {
                        A1D(anonymousClass469, obj, A0Y, e);
                        throw C00O.createAndThrow();
                    }
                }
            } else {
                A1B(c16l, anonymousClass469, obj, A0Y);
            }
            A10 = c16l.A1J();
        }
        return obj;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set set, Set set2) {
        super(builderBasedDeserializer, set, set2);
        this.A01 = builderBasedDeserializer.A01;
        this.A00 = builderBasedDeserializer.A00;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, C64520THn c64520THn) {
        super(builderBasedDeserializer, c64520THn);
        this.A01 = builderBasedDeserializer.A01;
        this.A00 = builderBasedDeserializer.A00;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, C64540TIw c64540TIw) {
        super(builderBasedDeserializer, c64540TIw);
        this.A01 = builderBasedDeserializer.A01;
        this.A00 = builderBasedDeserializer.A00;
    }

    public BuilderBasedDeserializer(AbstractC910944l abstractC910944l, SQ5 sq5, C64540TIw c64540TIw, C45B c45b, Map map, Set set, Set set2, boolean z, boolean z2) {
        super(sq5, c64540TIw, c45b, map, set, set2, z, z2);
        this.A00 = abstractC910944l;
        this.A01 = sq5.A04;
        if (this.A0B == null) {
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Cannot use Object Id with Builder-based deserialization (type ");
        throw AbstractC166987dD.A12(AbstractC58323PtF.A0q(c45b.A05, A1C));
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer) {
        super((BeanDeserializerBase) builderBasedDeserializer, true);
        this.A01 = builderBasedDeserializer.A01;
        this.A00 = builderBasedDeserializer.A00;
    }
}
