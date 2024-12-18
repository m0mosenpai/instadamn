package com.fasterxml.jackson.databind.deser;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC58322PtE;
import X.AbstractC63020Sal;
import X.AbstractC63035SbA;
import X.AbstractC910944l;
import X.AnonymousClass001;
import X.AnonymousClass454;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import X.C45S;
import X.C45T;
import X.C45V;
import X.C60570R8k;
import X.C60581R8w;
import X.C62925SXh;
import X.C63016Sag;
import X.C63173SeY;
import X.C63242Sfw;
import X.C64520THn;
import X.C64540TIw;
import X.C912845h;
import X.C913945y;
import X.C914045z;
import X.C914146b;
import X.EnumC912945i;
import X.InterfaceC102464je;
import X.InterfaceC102474jf;
import X.InterfaceC65236TgS;
import X.InterfaceC65505Tla;
import X.RBB;
import X.RBH;
import X.RBV;
import X.SP8;
import X.T2Y;
import X.T2Z;
import X.TI4;
import X.TI5;
import X.TID;
import X.TIH;
import X.TIj;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class BeanDeserializerBase extends StdDeserializer implements InterfaceC102464je, InterfaceC102474jf, Serializable {
    public static final C913945y A0K = new C913945y("#temporary-name", null);
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public TI5 A02;
    public C63016Sag A03;
    public C63173SeY A04;
    public C62925SXh A05;
    public boolean A06;
    public boolean A07;
    public final AbstractC910944l A08;
    public final AbstractC63035SbA A09;
    public final C64540TIw A0A;
    public final C64520THn A0B;
    public final Set A0C;
    public final Set A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final C60581R8w[] A0G;
    public final C45V A0H;
    public final Map A0I;
    public transient HashMap A0J;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        return true;
    }

    public final Object A18(C16L c16l, AnonymousClass469 anonymousClass469, C914146b c914146b, Object obj) {
        JsonDeserializer jsonDeserializer;
        synchronized (this) {
            HashMap hashMap = this.A0J;
            if (hashMap == null) {
                jsonDeserializer = null;
            } else {
                jsonDeserializer = (JsonDeserializer) hashMap.get(new TIj(obj.getClass()));
            }
        }
        if (jsonDeserializer == null) {
            Class<?> cls = obj.getClass();
            jsonDeserializer = anonymousClass469.A0E(anonymousClass469.A0A(cls));
            if (jsonDeserializer != null) {
                synchronized (this) {
                    HashMap hashMap2 = this.A0J;
                    if (hashMap2 == null) {
                        hashMap2 = AbstractC166987dD.A1G();
                        this.A0J = hashMap2;
                    }
                    hashMap2.put(new TIj(cls), jsonDeserializer);
                }
            }
        }
        if (jsonDeserializer != null) {
            if (c914146b != null) {
                c914146b.A0a();
                obj = jsonDeserializer.A0C(AbstractC58322PtE.A0c(c914146b), anonymousClass469, obj);
            }
            if (c16l != null) {
                return jsonDeserializer.A0C(c16l, anonymousClass469, obj);
            }
            return obj;
        }
        if (c914146b != null) {
            A1C(anonymousClass469, c914146b, obj);
        }
        if (c16l == null) {
            return obj;
        }
        return A0C(c16l, anonymousClass469, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
    
        X.AbstractC58318PtA.A1N(r23, r8, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0188, code lost:
    
        if (r11.A01 != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039c A[SYNTHETIC] */
    @Override // X.InterfaceC102464je
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EK8(X.AnonymousClass469 r23) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.EK8(X.469):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r11, X.SXY r12) {
        /*
            r10 = this;
            X.44l r0 = r11.A08
            r10.<init>(r0)
            r10.A08 = r0
            X.SbA r0 = r11.A09
            r10.A09 = r0
            X.AbstractC58322PtE.A1L(r11, r10)
            java.util.Map r0 = r11.A0I
            r10.A0I = r0
            java.util.Set r0 = r11.A0C
            r10.A0C = r0
            r6 = 0
            r0 = 1
            r10.A0E = r0
            java.util.Set r0 = r11.A0D
            r10.A0D = r0
            X.TI5 r0 = r11.A02
            r10.A02 = r0
            X.R8w[] r0 = r11.A0G
            r10.A0G = r0
            X.THn r0 = r11.A0B
            r10.A0B = r0
            boolean r0 = r11.A06
            r10.A06 = r0
            X.SXh r5 = r11.A05
            if (r5 == 0) goto L6d
            java.util.List r0 = r5.A00
            java.util.ArrayList r4 = X.AbstractC25230BEn.A0q(r0)
            java.util.Iterator r3 = r0.iterator()
        L3c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r1 = r3.next()
            X.RBV r1 = (X.RBV) r1
            X.45y r0 = r1.A06
            java.lang.String r0 = r0.A02
            java.lang.String r0 = r12.A00(r0)
            X.RBV r2 = r1.A07(r0)
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r2.A03()
            if (r1 == 0) goto L64
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r1.A0A(r12)
            if (r0 == r1) goto L64
            X.RBV r2 = r2.A04(r0)
        L64:
            r4.add(r2)
            goto L3c
        L68:
            X.SXh r5 = new X.SXh
            r5.<init>(r4)
        L6d:
            X.TIw r4 = r11.A0A
            X.SXY r0 = X.SXY.A00
            if (r12 == r0) goto Lae
            X.RBV[] r9 = r4.A08
            int r8 = r9.length
            java.util.ArrayList r3 = X.AbstractC25225BEi.A17(r8)
            r7 = 0
        L7b:
            if (r7 >= r8) goto La3
            r2 = r9[r7]
            if (r2 == 0) goto L9d
            X.45y r0 = r2.A06
            java.lang.String r0 = r0.A02
            java.lang.String r0 = r12.A00(r0)
            X.RBV r2 = r2.A07(r0)
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r2.A03()
            if (r1 == 0) goto L9d
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r1.A0A(r12)
            if (r0 == r1) goto L9d
            X.RBV r2 = r2.A04(r0)
        L9d:
            r3.add(r2)
            int r7 = r7 + 1
            goto L7b
        La3:
            boolean r2 = r4.A07
            java.util.Map r1 = r4.A05
            java.util.Locale r0 = r4.A04
            X.TIw r4 = new X.TIw
            r4.<init>(r3, r0, r1, r2)
        Lae:
            r10.A0A = r4
            r10.A05 = r5
            boolean r0 = r11.A0F
            r10.A0F = r0
            X.45V r0 = r11.A0H
            r10.A0H = r0
            r10.A07 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, X.SXY):void");
    }

    public static JsonDeserializer A01(AnonymousClass469 anonymousClass469, AbstractC910944l abstractC910944l, RBH rbh) {
        JsonDeserializer A0D;
        T2Z t2z = new T2Z(abstractC910944l, TIH.A07, A0K, rbh);
        AbstractC63020Sal abstractC63020Sal = (AbstractC63020Sal) abstractC910944l.A01;
        if (abstractC63020Sal == null) {
            C912845h c912845h = anonymousClass469.A02;
            AnonymousClass454 anonymousClass454 = c912845h.A02(abstractC910944l.A00).A07;
            InterfaceC65505Tla A0K2 = c912845h.A00().A0K(c912845h, anonymousClass454);
            ArrayList arrayList = null;
            if (A0K2 == null) {
                A0K2 = ((C45T) c912845h).A01.A06;
                if (A0K2 == null) {
                    abstractC63020Sal = null;
                }
            } else {
                arrayList = ((C45S) c912845h).A03.A03(c912845h, anonymousClass454);
            }
            abstractC63020Sal = A0K2.AEn(c912845h, abstractC910944l, arrayList);
        }
        JsonDeserializer jsonDeserializer = (JsonDeserializer) abstractC910944l.A02;
        if (jsonDeserializer == null) {
            A0D = anonymousClass469.A0B(t2z, abstractC910944l);
        } else {
            A0D = anonymousClass469.A0D(t2z, abstractC910944l, jsonDeserializer);
        }
        if (abstractC63020Sal != null) {
            return new TypeWrappedDeserializer(A0D, abstractC63020Sal.A02(t2z));
        }
        return A0D;
    }

    public static final void A02(RBV rbv, RBV rbv2, C64540TIw c64540TIw, RBV[] rbvArr) {
        Object[] objArr = c64540TIw.A03;
        int length = objArr.length;
        for (int i = 1; i < length; i += 2) {
            if (objArr[i] == rbv) {
                objArr[i] = rbv2;
                c64540TIw.A08[C64540TIw.A00(rbv, c64540TIw)] = rbv2;
                if (rbvArr != null) {
                    int length2 = rbvArr.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (rbvArr[i2] == rbv) {
                            rbvArr[i2] = rbv2;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException(AnonymousClass001.A0g("No entry '", rbv.A06.A02, "' found, can't replace"));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final RBV A0E(String str) {
        Map map = this.A0I;
        if (map == null) {
            return null;
        }
        return (RBV) map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final C64520THn A0F() {
        return this.A0B;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean A0G(C912845h c912845h) {
        if (!(this instanceof BeanAsArrayBuilderDeserializer) && !(this instanceof BuilderBasedDeserializer)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Class A0H() {
        return this.A08.A00;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0N;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        Object A0W;
        if (this.A0B != null) {
            if (c16l.A0a() && (A0W = c16l.A0W()) != null) {
                return A19(c16l, anonymousClass469, abstractC63020Sal.A05(c16l, anonymousClass469), A0W);
            }
            C16R A10 = c16l.A10();
            if (A10 != null) {
                if (A10.A03) {
                    return A15(c16l, anonymousClass469);
                }
                if (A10 == C16R.A0D) {
                    c16l.A1J();
                }
            }
        }
        return abstractC63020Sal.A05(c16l, anonymousClass469);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        try {
            return this.A09.A04(anonymousClass469);
        } catch (IOException e) {
            C914045z.A0D(anonymousClass469, e);
            throw C00O.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC910944l A0T() {
        return this.A08;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC63035SbA A0W() {
        return this.A09;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final void A0q(C16L c16l, AnonymousClass469 anonymousClass469, Object obj, String str) {
        if (this.A0E) {
            c16l.A0z();
            return;
        }
        if (C63242Sfw.A01(this, str)) {
            A1A(c16l, anonymousClass469, obj, str);
        }
        super.A0q(c16l, anonymousClass469, obj, str);
    }

    public final BeanDeserializerBase A0x() {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer.A00.A0x(), beanAsArrayDeserializer.A01);
        }
        if (this instanceof BeanAsArrayBuilderDeserializer) {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            BeanDeserializerBase A0x = beanAsArrayBuilderDeserializer.A01.A0x();
            return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer.A00, A0x, beanAsArrayBuilderDeserializer.A02, beanAsArrayBuilderDeserializer.A03);
        }
        if (this instanceof BuilderBasedDeserializer) {
            return new BuilderBasedDeserializer((BuilderBasedDeserializer) this);
        }
        return new BeanDeserializerBase(this, true);
    }

    public final BeanDeserializerBase A0y(C64540TIw c64540TIw) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer.A00.A0y(c64540TIw), beanAsArrayDeserializer.A01);
        }
        if (this instanceof BeanAsArrayBuilderDeserializer) {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            BeanDeserializerBase A0y = beanAsArrayBuilderDeserializer.A01.A0y(c64540TIw);
            return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer.A00, A0y, beanAsArrayBuilderDeserializer.A02, beanAsArrayBuilderDeserializer.A03);
        }
        if (this instanceof BuilderBasedDeserializer) {
            return new BuilderBasedDeserializer((BuilderBasedDeserializer) this, c64540TIw);
        }
        return new BeanDeserializerBase(this, c64540TIw);
    }

    public final BeanDeserializerBase A0z(C64520THn c64520THn) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer.A00.A0z(c64520THn), beanAsArrayDeserializer.A01);
        }
        if (this instanceof BeanAsArrayBuilderDeserializer) {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            BeanDeserializerBase A0z = beanAsArrayBuilderDeserializer.A01.A0z(c64520THn);
            return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer.A00, A0z, beanAsArrayBuilderDeserializer.A02, beanAsArrayBuilderDeserializer.A03);
        }
        if (this instanceof BuilderBasedDeserializer) {
            return new BuilderBasedDeserializer((BuilderBasedDeserializer) this, c64520THn);
        }
        return new BeanDeserializerBase(this, c64520THn);
    }

    public final BeanDeserializerBase A10(Set set, Set set2) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer.A00.A10(set, set2), beanAsArrayDeserializer.A01);
        }
        if (this instanceof BeanAsArrayBuilderDeserializer) {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            BeanDeserializerBase A10 = beanAsArrayBuilderDeserializer.A01.A10(set, set2);
            return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer.A00, A10, beanAsArrayBuilderDeserializer.A02, beanAsArrayBuilderDeserializer.A03);
        }
        if (this instanceof BuilderBasedDeserializer) {
            return new BuilderBasedDeserializer((BuilderBasedDeserializer) this, set, set2);
        }
        return new BeanDeserializerBase(this, set, set2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0187, code lost:
    
        r14.A1J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c5, code lost:
    
        r5 = r10.A02(r15, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d1, code lost:
    
        if (r5.getClass() == r2.A08.A00) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d7, code lost:
    
        return r2.A18(r14, r15, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d8, code lost:
    
        if (r4 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01da, code lost:
    
        r2.A1C(r15, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01dd, code lost:
    
        X.AbstractC58321PtD.A1L(r15, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01e2, code lost:
    
        if (r2.A05 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ea, code lost:
    
        if (r14.A19(X.C16R.A0D) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ec, code lost:
    
        r14.A1J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ef, code lost:
    
        r0 = new X.C914146b(r14, r15);
        r0.A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01fb, code lost:
    
        return r2.A1F(r14, r15, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01fe, code lost:
    
        if (r2.A03 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0204, code lost:
    
        return r2.A1H(r14, r15, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0205, code lost:
    
        if (r6 == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0207, code lost:
    
        r0 = r15.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0209, code lost:
    
        if (r0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x020f, code lost:
    
        return r2.A1G(r14, r15, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0210, code lost:
    
        r1 = r14.A10();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0216, code lost:
    
        if (r1 != X.C16R.A0D) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0218, code lost:
    
        r1 = r14.A1J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x021c, code lost:
    
        if (r1 != r3) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x021e, code lost:
    
        r1 = r14.A0Y();
        r0 = X.C64540TIw.A01(r14, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0226, code lost:
    
        if (r0 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0228, code lost:
    
        r5 = r0.A0D(r14, r15, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0218, code lost:
    
        r1 = r14.A1J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0231, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0232, code lost:
    
        r2.A1D(r15, r5, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x022d, code lost:
    
        r2.A1B(r14, r15, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0218, code lost:
    
        r1 = r14.A1J();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0305: IGET (r0 I:X.44l) = (r2 I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase) (LINE:773) com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A08 X.44l, block:B:271:0x0305 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0313: INVOKE (r2 I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase), (r15 I:X.469), (r0 I:java.lang.Throwable) VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1E(X.469, java.lang.Throwable):void A[MD:(X.469, java.lang.Throwable):void (m)] (LINE:787), block:B:273:0x0313 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00e6: IGET (r0 I:X.45y) = (r3 I:X.RBV) (LINE:230) X.RBV.A06 X.45y, block:B:277:0x00e6 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00ea: INVOKE 
      (r4 I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
      (r15 I:X.469)
      (r5 I:java.lang.Object)
      (r0 I:java.lang.String)
      (r1 I:java.lang.Throwable)
     VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1D(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:234), block:B:277:0x00e6 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x012e: INVOKE (r4 I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase), (r15 I:X.469), (r0 I:java.lang.Throwable) VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1E(X.469, java.lang.Throwable):void A[MD:(X.469, java.lang.Throwable):void (m)] (LINE:302), block:B:275:0x012e */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00ea: INVOKE 
      (r4v1 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
      (r15v0 ?? I:X.469)
      (r5 I:java.lang.Object)
      (r0 I:java.lang.String)
      (r1 I:java.lang.Throwable)
     VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1D(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:234), block:B:277:0x00e6 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0309: INVOKE 
      (r2v2 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
      (r15v0 ?? I:X.469)
      (r0v11 ?? I:java.lang.Object)
      (r5 I:java.lang.String)
      (r1 I:java.lang.Throwable)
     VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1D(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:777), block:B:271:0x0305 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.fasterxml.jackson.databind.deser.BeanDeserializerBase] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.RBV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A11(X.C16L r14, X.AnonymousClass469 r15) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A11(X.16L, X.469):java.lang.Object");
    }

    public final Object A12(C16L c16l, AnonymousClass469 anonymousClass469) {
        JsonDeserializer jsonDeserializer = this.A01;
        if (jsonDeserializer != null || (jsonDeserializer = this.A00) != null) {
            AbstractC63035SbA abstractC63035SbA = this.A09;
            if (!abstractC63035SbA.A0F()) {
                return AbstractC63035SbA.A02(c16l, anonymousClass469, jsonDeserializer, this, abstractC63035SbA);
            }
        }
        return this.A09.A0D(anonymousClass469, AbstractC167007dF.A1X(c16l.A10(), C16R.A0K));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r2.A0G() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        if (r2.A0G() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (X.AbstractC167007dF.A1W(((X.R9r) r2).A06) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A14(X.C16L r5, X.AnonymousClass469 r6) {
        /*
            r4 = this;
            X.THn r0 = r4.A0B
            if (r0 == 0) goto L9
            java.lang.Object r0 = r4.A15(r5, r6)
            return r0
        L9:
            com.fasterxml.jackson.databind.JsonDeserializer r3 = r4.A01
            if (r3 != 0) goto Lf
            com.fasterxml.jackson.databind.JsonDeserializer r3 = r4.A00
        Lf:
            java.lang.Integer r1 = r5.A0n()
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L26
            if (r3 == 0) goto L4d
            X.SbA r2 = r4.A09
            boolean r0 = r2.A0G()
            if (r0 != 0) goto L4d
        L21:
            java.lang.Object r0 = X.AbstractC63035SbA.A02(r5, r6, r3, r4, r2)
            return r0
        L26:
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L35
            if (r3 == 0) goto L58
            X.SbA r2 = r4.A09
            boolean r0 = r2.A0G()
            if (r0 != 0) goto L58
            goto L21
        L35:
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L6e
            if (r3 == 0) goto L63
            X.SbA r2 = r4.A09
            r1 = r2
            boolean r0 = r2 instanceof X.R9r
            if (r0 == 0) goto L21
            X.R9r r1 = (X.R9r) r1
            X.RBH r0 = r1.A06
            boolean r0 = X.AbstractC167007dF.A1W(r0)
            if (r0 != 0) goto L63
            goto L21
        L4d:
            X.SbA r1 = r4.A09
            int r0 = r5.A0i()
            java.lang.Object r0 = r1.A06(r6, r0)
            return r0
        L58:
            X.SbA r2 = r4.A09
            long r0 = r5.A0j()
            java.lang.Object r0 = r2.A07(r6, r0)
            return r0
        L63:
            X.SbA r1 = r4.A09
            java.math.BigInteger r0 = r5.A0s()
            java.lang.Object r0 = r1.A0C(r6, r0)
            return r0
        L6e:
            X.44l r0 = r4.A08
            java.lang.Class r3 = r0.A00
            X.SbA r2 = r4.A09
            java.lang.Number r0 = r5.A0p()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "no suitable creator method found to deserialize from Number value (%s)"
            r6.A0Y(r2, r3, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A14(X.16L, X.469):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable, X.400, X.R97, X.4j6, java.io.IOException] */
    public final Object A15(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object obj;
        C64520THn c64520THn = this.A0B;
        Object A0D = c64520THn.A03.A0D(c16l, anonymousClass469);
        SP8 A0I = anonymousClass469.A0I(c64520THn.A00, c64520THn.A01, A0D);
        InterfaceC65236TgS interfaceC65236TgS = A0I.A00;
        TI4 ti4 = A0I.A03;
        Map map = ((T2Y) interfaceC65236TgS).A00;
        if (map == null) {
            obj = null;
        } else {
            obj = map.get(ti4);
        }
        A0I.A01 = obj;
        if (obj != null) {
            return obj;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Could not resolve Object Id [");
        A1C.append(A0D);
        A1C.append("] (for ");
        A1C.append(this.A08);
        String A0x = AbstractC166997dE.A0x(").", A1C);
        TID A1H = c16l.A1H();
        ?? iOException = new IOException(A0x, null);
        iOException.A00 = A1H;
        iOException.A01 = c16l;
        iOException.A00 = A0I;
        throw iOException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r3.getEnclosingClass() == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A16(X.C16L r5, X.AnonymousClass469 r6) {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4.A01
            if (r1 != 0) goto L4a
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4.A00
            if (r1 != 0) goto L4a
            X.SeY r0 = r4.A04
            if (r0 == 0) goto L11
            java.lang.Object r0 = r4.A11(r5, r6)
            return r0
        L11:
            X.44l r0 = r4.A08
            java.lang.Class r3 = r0.A00
            java.util.Iterator r0 = X.C914045z.A00
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L32
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r3 == r0) goto L32
            boolean r0 = r3.isPrimitive()
            if (r0 != 0) goto L32
            java.lang.Class r0 = r3.getEnclosingClass()
            r2 = 1
            if (r0 != 0) goto L33
        L32:
            r2 = 0
        L33:
            r1 = 0
            if (r2 == 0) goto L43
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = "non-static inner classes like this can only by instantiated using default, no-argument constructor"
        L3b:
            r6.A0Y(r0, r3, r1, r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L43:
            X.SbA r0 = r4.A09
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = "cannot deserialize from Object value (no delegate- or property-based Creator)"
            goto L3b
        L4a:
            X.SbA r0 = r4.A09
            java.lang.Object r0 = X.AbstractC63035SbA.A02(r5, r6, r1, r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A16(X.16L, X.469):java.lang.Object");
    }

    public final Object A17(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (this.A0B != null) {
            return A15(c16l, anonymousClass469);
        }
        JsonDeserializer jsonDeserializer = this.A01;
        if (jsonDeserializer != null || (jsonDeserializer = this.A00) != null) {
            AbstractC63035SbA abstractC63035SbA = this.A09;
            if (!abstractC63035SbA.A0J()) {
                return AbstractC63035SbA.A02(c16l, anonymousClass469, jsonDeserializer, this, abstractC63035SbA);
            }
        }
        return A0h(c16l, anonymousClass469);
    }

    public final Object A19(C16L c16l, AnonymousClass469 anonymousClass469, Object obj, Object obj2) {
        C64520THn c64520THn = this.A0B;
        JsonDeserializer jsonDeserializer = c64520THn.A03;
        if (jsonDeserializer.A0H() != obj2.getClass()) {
            C914146b c914146b = new C914146b(c16l, anonymousClass469);
            if (obj2 instanceof String) {
                c914146b.A0u((String) obj2);
            } else if (obj2 instanceof Long) {
                c914146b.A0i(AbstractC166987dD.A0N(obj2));
            } else if (obj2 instanceof Integer) {
                c914146b.A0h(AbstractC166987dD.A0H(obj2));
            } else {
                c914146b.A0J(obj2);
            }
            obj2 = jsonDeserializer.A0D(AbstractC58322PtE.A0c(c914146b), anonymousClass469);
        }
        anonymousClass469.A0I(c64520THn.A00, c64520THn.A01, obj2).A01(obj);
        RBV rbv = c64520THn.A05;
        if (rbv != null) {
            return rbv.A0F(obj, obj2);
        }
        return obj;
    }

    public final void A1A(C16L c16l, AnonymousClass469 anonymousClass469, Object obj, String str) {
        Class<?> cls;
        if (!anonymousClass469.A0j(EnumC912945i.A08)) {
            c16l.A0z();
            return;
        }
        Collection A0L = A0L();
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        RBB rbb = new RBB(c16l.A1H(), c16l, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", str, cls.getName()), A0L);
        rbb.A08(obj, str);
        throw rbb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3.A0j(X.EnumC912945i.A0S) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1D(X.AnonymousClass469 r3, java.lang.Object r4, java.lang.String r5, java.lang.Throwable r6) {
        /*
            r2 = this;
        L0:
            boolean r0 = r6 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r6.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r6 = r6.getCause()
            goto L0
        Lf:
            java.util.Iterator r0 = X.C914045z.A00
            boolean r0 = r6 instanceof java.lang.Error
            if (r0 != 0) goto L36
            if (r3 == 0) goto L20
            X.45i r0 = X.EnumC912945i.A0S
            boolean r0 = r3.A0j(r0)
            r1 = 0
            if (r0 == 0) goto L21
        L20:
            r1 = 1
        L21:
            boolean r0 = r6 instanceof java.io.IOException
            if (r0 == 0) goto L30
            if (r1 == 0) goto L36
            boolean r0 = r6 instanceof X.AnonymousClass401
            if (r0 == 0) goto L36
        L2b:
            X.4j6 r0 = X.C102314j6.A02(r4, r5, r6)
            throw r0
        L30:
            if (r1 != 0) goto L2b
            X.C914045z.A0F(r6)
            goto L2b
        L36:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1D(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void");
    }

    public final void A1E(AnonymousClass469 anonymousClass469, Throwable th) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        Iterator it = C914045z.A00;
        if (!(th instanceof Error)) {
            if (!(th instanceof IOException)) {
                if (anonymousClass469 != null) {
                    if (!anonymousClass469.A0j(EnumC912945i.A0S)) {
                        C914045z.A0F(th);
                    }
                    anonymousClass469.A0f(this.A08.A00, th);
                    throw C00O.createAndThrow();
                }
                throw new IllegalArgumentException(th.getMessage(), th);
            }
            throw th;
        }
        throw th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x007c, code lost:
    
        if (r11 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0133  */
    @Override // X.InterfaceC102474jf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer ALr(X.InterfaceC65620ToB r19, X.AnonymousClass469 r20) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.ALr(X.ToB, X.469):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Collection A0L() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            A1E.add(((RBV) it.next()).A06.A02);
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (X.AbstractC167007dF.A1W(((X.R9r) r1).A05) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (X.AbstractC167007dF.A1W(((X.R9r) r1).A08) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A13(X.C16L r5, X.AnonymousClass469 r6) {
        /*
            r4 = this;
            java.lang.Integer r1 = r5.A0n()
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 == r0) goto L2e
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto L2e
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 != r0) goto L53
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r4.A01
            if (r2 != 0) goto L18
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r4.A00
            if (r2 == 0) goto L48
        L18:
            X.SbA r1 = r4.A09
            boolean r0 = r1 instanceof X.R9r
            if (r0 == 0) goto L29
            r0 = r1
            X.R9r r0 = (X.R9r) r0
            X.RBH r0 = r0.A05
            boolean r0 = X.AbstractC167007dF.A1W(r0)
            if (r0 != 0) goto L48
        L29:
            java.lang.Object r0 = X.AbstractC63035SbA.A02(r5, r6, r2, r4, r1)
            return r0
        L2e:
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r4.A01
            if (r2 != 0) goto L36
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r4.A00
            if (r2 == 0) goto L6b
        L36:
            X.SbA r1 = r4.A09
            boolean r0 = r1 instanceof X.R9r
            if (r0 == 0) goto L29
            r0 = r1
            X.R9r r0 = (X.R9r) r0
            X.RBH r0 = r0.A08
            boolean r0 = X.AbstractC167007dF.A1W(r0)
            if (r0 != 0) goto L6b
            goto L29
        L48:
            X.SbA r1 = r4.A09
            java.math.BigDecimal r0 = r5.A0r()
            java.lang.Object r0 = r1.A0B(r6, r0)
            return r0
        L53:
            X.44l r0 = r4.A08
            java.lang.Class r3 = r0.A00
            X.SbA r2 = r4.A09
            java.lang.Number r0 = r5.A0p()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "no suitable creator method found to deserialize from Number value (%s)"
            r6.A0Y(r2, r3, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L6b:
            X.SbA r2 = r4.A09
            double r0 = r5.A0g()
            java.lang.Object r0 = r2.A05(r6, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A13(X.16L, X.469):java.lang.Object");
    }

    public final void A1B(C16L c16l, AnonymousClass469 anonymousClass469, Object obj, String str) {
        if (C63242Sfw.A01(this, str)) {
            A1A(c16l, anonymousClass469, obj, str);
            return;
        }
        TI5 ti5 = this.A02;
        if (ti5 != null) {
            try {
                ti5.A01(c16l, anonymousClass469, obj, str);
                return;
            } catch (Exception e) {
                A1D(anonymousClass469, obj, str, e);
                throw C00O.createAndThrow();
            }
        }
        A0q(c16l, anonymousClass469, obj, str);
    }

    public final void A1C(AnonymousClass469 anonymousClass469, C914146b c914146b, Object obj) {
        c914146b.A0a();
        C60570R8k A12 = c914146b.A12(c914146b.A01);
        while (A12.A1J() != C16R.A09) {
            String A0Y = A12.A0Y();
            A12.A1J();
            A0q(A12, anonymousClass469, obj, A0Y);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r8, java.util.Set r9, java.util.Set r10) {
        /*
            r7 = this;
            X.44l r0 = r8.A08
            r7.<init>(r0)
            r7.A08 = r0
            X.SbA r0 = r8.A09
            r7.A09 = r0
            X.AbstractC58322PtE.A1L(r8, r7)
            java.util.Map r0 = r8.A0I
            r7.A0I = r0
            r7.A0C = r9
            boolean r0 = r8.A0E
            r7.A0E = r0
            r7.A0D = r10
            X.TI5 r0 = r8.A02
            r7.A02 = r0
            X.R8w[] r0 = r8.A0G
            r7.A0G = r0
            boolean r0 = r8.A06
            r7.A06 = r0
            X.SXh r0 = r8.A05
            r7.A05 = r0
            boolean r0 = r8.A0F
            r7.A0F = r0
            X.45V r0 = r8.A0H
            r7.A0H = r0
            boolean r0 = r8.A07
            r7.A07 = r0
            X.THn r0 = r8.A0B
            r7.A0B = r0
            X.TIw r6 = r8.A0A
            if (r9 == 0) goto L44
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L49
        L44:
            if (r10 != 0) goto L49
        L46:
            r7.A0A = r6
            return
        L49:
            X.RBV[] r5 = r6.A08
            int r4 = r5.length
            java.util.ArrayList r3 = X.AbstractC25225BEi.A17(r4)
            r2 = 0
        L51:
            if (r2 >= r4) goto L67
            r1 = r5[r2]
            if (r1 == 0) goto L64
            X.45y r0 = r1.A06
            java.lang.String r0 = r0.A02
            boolean r0 = X.C63242Sfw.A02(r0, r9, r10)
            if (r0 != 0) goto L64
            r3.add(r1)
        L64:
            int r2 = r2 + 1
            goto L51
        L67:
            boolean r2 = r6.A07
            java.util.Map r1 = r6.A05
            java.util.Locale r0 = r6.A04
            X.TIw r6 = new X.TIw
            r6.<init>(r3, r0, r1, r2)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, java.util.Set, java.util.Set):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r1.A0L() == false) goto L15;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BeanDeserializerBase(X.SQ5 r6, X.C64540TIw r7, X.C45B r8, java.util.Map r9, java.util.Set r10, java.util.Set r11, boolean r12, boolean r13) {
        /*
            r5 = this;
            X.44l r0 = r8.A05
            r5.<init>(r0)
            r5.A08 = r0
            X.SbA r1 = r6.A02
            r5.A09 = r1
            r2 = 0
            r5.A01 = r2
            r5.A00 = r2
            r5.A04 = r2
            r5.A0A = r7
            r5.A0I = r9
            r5.A0C = r10
            r5.A0E = r12
            r5.A0D = r11
            X.TI5 r0 = r6.A01
            r5.A02 = r0
            java.util.List r3 = r6.A08
            if (r3 == 0) goto L36
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L36
            int r0 = r3.size()
            X.R8w[] r0 = new X.C60581R8w[r0]
            java.lang.Object[] r2 = r3.toArray(r0)
            X.R8w[] r2 = (X.C60581R8w[]) r2
        L36:
            r5.A0G = r2
            X.THn r4 = r6.A03
            r5.A0B = r4
            X.SXh r0 = r5.A05
            r3 = 0
            if (r0 != 0) goto L54
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L54
            boolean r0 = r1.A0I()
            if (r0 != 0) goto L54
            boolean r1 = r1.A0L()
            r0 = 0
            if (r1 != 0) goto L55
        L54:
            r0 = 1
        L55:
            r5.A06 = r0
            X.45U r0 = r8.A00()
            X.45V r0 = r0.A00
            r5.A0H = r0
            r5.A0F = r13
            boolean r0 = r5.A06
            if (r0 != 0) goto L6c
            if (r2 != 0) goto L6c
            if (r13 != 0) goto L6c
            if (r4 != 0) goto L6c
            r3 = 1
        L6c:
            r5.A07 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(X.SQ5, X.TIw, X.45B, java.util.Map, java.util.Set, java.util.Set, boolean, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r3, X.C64520THn r4) {
        /*
            r2 = this;
            X.44l r0 = r3.A08
            r2.<init>(r0)
            r2.A08 = r0
            X.SbA r0 = r3.A09
            r2.A09 = r0
            X.AbstractC58322PtE.A1L(r3, r2)
            java.util.Map r0 = r3.A0I
            r2.A0I = r0
            java.util.Set r0 = r3.A0C
            r2.A0C = r0
            boolean r0 = r3.A0E
            r2.A0E = r0
            java.util.Set r0 = r3.A0D
            r2.A0D = r0
            X.TI5 r0 = r3.A02
            r2.A02 = r0
            X.R8w[] r0 = r3.A0G
            r2.A0G = r0
            boolean r0 = r3.A06
            r2.A06 = r0
            X.SXh r0 = r3.A05
            r2.A05 = r0
            boolean r0 = r3.A0F
            r2.A0F = r0
            X.45V r0 = r3.A0H
            r2.A0H = r0
            r2.A0B = r4
            X.TIH r0 = X.TIH.A08
            X.R9g r1 = new X.R9g
            r1.<init>(r0, r4)
            X.TIw r0 = r3.A0A
            X.TIw r0 = r0.A03(r1)
            r2.A0A = r0
            r0 = 0
            r2.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, X.THn):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r2, X.C64540TIw r3) {
        /*
            r1 = this;
            X.44l r0 = r2.A08
            r1.<init>(r0)
            r1.A08 = r0
            X.SbA r0 = r2.A09
            r1.A09 = r0
            X.AbstractC58322PtE.A1L(r2, r1)
            r1.A0A = r3
            java.util.Map r0 = r2.A0I
            r1.A0I = r0
            java.util.Set r0 = r2.A0C
            r1.A0C = r0
            boolean r0 = r2.A0E
            r1.A0E = r0
            java.util.Set r0 = r2.A0D
            r1.A0D = r0
            X.TI5 r0 = r2.A02
            r1.A02 = r0
            X.R8w[] r0 = r2.A0G
            r1.A0G = r0
            X.THn r0 = r2.A0B
            r1.A0B = r0
            boolean r0 = r2.A06
            r1.A06 = r0
            X.SXh r0 = r2.A05
            r1.A05 = r0
            boolean r0 = r2.A0F
            r1.A0F = r0
            X.45V r0 = r2.A0H
            r1.A0H = r0
            boolean r0 = r2.A07
            r1.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, X.TIw):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r2, boolean r3) {
        /*
            r1 = this;
            X.44l r0 = r2.A08
            r1.<init>(r0)
            r1.A08 = r0
            X.SbA r0 = r2.A09
            r1.A09 = r0
            X.AbstractC58322PtE.A1L(r2, r1)
            X.TIw r0 = r2.A0A
            r1.A0A = r0
            java.util.Map r0 = r2.A0I
            r1.A0I = r0
            java.util.Set r0 = r2.A0C
            r1.A0C = r0
            r1.A0E = r3
            java.util.Set r0 = r2.A0D
            r1.A0D = r0
            X.TI5 r0 = r2.A02
            r1.A02 = r0
            X.R8w[] r0 = r2.A0G
            r1.A0G = r0
            X.THn r0 = r2.A0B
            r1.A0B = r0
            boolean r0 = r2.A06
            r1.A06 = r0
            X.SXh r0 = r2.A05
            r1.A05 = r0
            boolean r0 = r2.A0F
            r1.A0F = r0
            X.45V r0 = r2.A0H
            r1.A0H = r0
            boolean r0 = r2.A07
            r1.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, boolean):void");
    }
}
