package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC25228BEl;
import X.AbstractC58321PtD;
import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C16R;
import X.C914045z;
import X.EnumC912945i;
import X.RBV;
import X.SXY;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;

/* loaded from: classes10.dex */
public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    public final BeanDeserializerBase A00;
    public final RBV[] A01;

    public final void A1F(C16L c16l, AnonymousClass469 anonymousClass469) {
        anonymousClass469.A0Q(c16l, c16l.A10(), A0U(anonymousClass469), "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", C914045z.A04(this.A08), c16l.A10());
        throw C00O.createAndThrow();
    }

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, RBV[] rbvArr) {
        super(beanDeserializerBase, beanDeserializerBase.A0E);
        this.A00 = beanDeserializerBase;
        this.A01 = rbvArr;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final JsonDeserializer A0A(SXY sxy) {
        return this.A00.A0A(sxy);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        c16l.A0t(obj);
        if (!c16l.A16()) {
            A1F(c16l, anonymousClass469);
        } else {
            AbstractC58321PtD.A1L(anonymousClass469, this);
            RBV[] rbvArr = this.A01;
            int length = rbvArr.length;
            int i = 0;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A08;
                if (A1J != c16r) {
                    if (i == length) {
                        if (!this.A0E && anonymousClass469.A0j(EnumC912945i.A0H)) {
                            anonymousClass469.A0V(c16r, "Unexpected JSON values; expected at most %d properties (in JSON Array)", AbstractC25228BEl.A1Y(length));
                        } else {
                            do {
                                c16l.A0z();
                            } while (c16l.A1J() != c16r);
                            return obj;
                        }
                    } else {
                        RBV rbv = rbvArr[i];
                        if (rbv != null) {
                            try {
                                rbv.A0K(obj, c16l, anonymousClass469);
                            } catch (Exception e) {
                                A1D(anonymousClass469, obj, rbv.A06.A02, e);
                                throw C00O.createAndThrow();
                            }
                        } else {
                            c16l.A0z();
                        }
                        i++;
                    }
                } else {
                    return obj;
                }
            }
        }
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x003d, code lost:
    
        if (r7.A0E == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        r9.A0V(r3, "Unexpected JSON values; expected at most %d properties (in JSON Array)", X.AbstractC25228BEl.A1Y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0079, code lost:
    
        if (r9.A0j(X.EnumC912945i.A0H) != false) goto L39;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: IGET (r0 I:X.45y) = (r3 I:X.RBV) (LINE:158) X.RBV.A06 X.45y, block:B:67:0x009e */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a2: INVOKE 
      (r7v0 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
      (r9v0 ?? I:X.469)
      (r4 I:java.lang.Object)
      (r0 I:java.lang.String)
      (r1 I:java.lang.Throwable)
     VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1D(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:162), block:B:67:0x009e */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.RBV] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0D(X.C16L r8, X.AnonymousClass469 r9) {
        /*
            r7 = this;
            boolean r0 = r8.A16()
            if (r0 != 0) goto Le
            r7.A1F(r8, r9)
        L9:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            boolean r0 = r7.A07
            if (r0 != 0) goto L58
            boolean r0 = r7.A06
            if (r0 == 0) goto L1b
            java.lang.Object r4 = r7.A16(r8, r9)
        L1a:
            return r4
        L1b:
            X.SbA r0 = r7.A09
            java.lang.Object r4 = r0.A04(r9)
            r8.A0t(r4)
            X.AbstractC58321PtD.A1L(r9, r7)
            boolean r0 = r7.A0F
            if (r0 == 0) goto L56
            java.lang.Class r6 = r9.A05
        L2d:
            X.RBV[] r2 = r7.A01
            int r5 = r2.length
            r1 = 0
        L31:
            X.16R r0 = r8.A1J()
            X.16R r3 = X.C16R.A08
            if (r0 == r3) goto L1a
            if (r1 != r5) goto L40
            boolean r0 = r7.A0E
            if (r0 != 0) goto L93
            goto L7b
        L40:
            r3 = r2[r1]
            int r1 = r1 + 1
            if (r3 == 0) goto L52
            if (r6 == 0) goto L4e
            boolean r0 = r3.A0R(r6)
            if (r0 == 0) goto L52
        L4e:
            r3.A0K(r4, r8, r9)     // Catch: java.lang.Exception -> L9d
            goto L31
        L52:
            r8.A0z()
            goto L31
        L56:
            r6 = 0
            goto L2d
        L58:
            X.SbA r0 = r7.A09
            java.lang.Object r4 = r0.A04(r9)
            r8.A0t(r4)
            X.RBV[] r2 = r7.A01
            int r5 = r2.length
            r1 = 0
        L65:
            X.16R r0 = r8.A1J()
            X.16R r3 = X.C16R.A08
            if (r0 == r3) goto L1a
            if (r1 != r5) goto L85
            boolean r0 = r7.A0E
            if (r0 != 0) goto L93
            X.45i r0 = X.EnumC912945i.A0H
            boolean r0 = r9.A0j(r0)
            if (r0 == 0) goto L93
        L7b:
            java.lang.Object[] r1 = X.AbstractC25228BEl.A1Y(r5)
            java.lang.String r0 = "Unexpected JSON values; expected at most %d properties (in JSON Array)"
            r9.A0V(r3, r0, r1)
            goto L9
        L85:
            r3 = r2[r1]
            if (r3 == 0) goto L8d
            r3.A0K(r4, r8, r9)     // Catch: java.lang.Exception -> L9d
            goto L90
        L8d:
            r8.A0z()
        L90:
            int r1 = r1 + 1
            goto L65
        L93:
            r8.A0z()
            X.16R r0 = r8.A1J()
            if (r0 != r3) goto L93
            return r4
        L9d:
            r1 = move-exception
            X.45y r0 = r3.A06
            java.lang.String r0 = r0.A02
            r7.A1D(r9, r4, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer.A0D(X.16L, X.469):java.lang.Object");
    }
}
