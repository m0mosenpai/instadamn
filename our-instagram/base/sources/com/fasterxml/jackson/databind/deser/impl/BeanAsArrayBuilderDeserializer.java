package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC25228BEl;
import X.AbstractC58321PtD;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C102314j6;
import X.C16L;
import X.C16R;
import X.C913945y;
import X.EnumC912945i;
import X.RBK;
import X.RBV;
import X.SXY;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;

/* loaded from: classes10.dex */
public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase {
    public final AbstractC910944l A00;
    public final BeanDeserializerBase A01;
    public final RBK A02;
    public final RBV[] A03;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A04;
        C913945y c913945y;
        Class cls;
        if (!c16l.A16()) {
            AbstractC910944l A0U = A0U(anonymousClass469);
            C16R A10 = c16l.A10();
            anonymousClass469.A0Q(c16l, A10, A0U, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.A08.A00.getName(), A10);
        } else {
            if (!this.A07) {
                if (this.A06) {
                    A04 = A16(c16l, anonymousClass469);
                } else {
                    A04 = this.A09.A04(anonymousClass469);
                    AbstractC58321PtD.A1L(anonymousClass469, this);
                    if (this.A0F) {
                        cls = anonymousClass469.A05;
                    } else {
                        cls = null;
                    }
                    RBV[] rbvArr = this.A03;
                    int length = rbvArr.length;
                    int i = 0;
                    while (true) {
                        C16R A1J = c16l.A1J();
                        C16R c16r = C16R.A08;
                        if (A1J != c16r) {
                            if (i == length) {
                                if (!this.A0E && anonymousClass469.A0j(EnumC912945i.A0H)) {
                                    anonymousClass469.A0V(c16r, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", AbstractC25228BEl.A1Y(length));
                                } else {
                                    while (c16l.A1J() != c16r) {
                                        c16l.A0z();
                                    }
                                }
                            } else {
                                RBV rbv = rbvArr[i];
                                i++;
                                if (rbv != null && (cls == null || rbv.A0R(cls))) {
                                    try {
                                        rbv.A0D(c16l, anonymousClass469, A04);
                                    } catch (Exception e) {
                                        e = e;
                                        c913945y = rbv.A06;
                                        A1D(anonymousClass469, A04, c913945y.A02, e);
                                        throw C00O.createAndThrow();
                                    }
                                } else {
                                    c16l.A0z();
                                }
                            }
                        }
                    }
                }
            } else {
                A04 = this.A09.A04(anonymousClass469);
                RBV[] rbvArr2 = this.A03;
                int length2 = rbvArr2.length;
                int i2 = 0;
                while (true) {
                    C16R A1J2 = c16l.A1J();
                    C16R c16r2 = C16R.A08;
                    if (A1J2 != c16r2) {
                        if (i2 == length2) {
                            if (!this.A0E && anonymousClass469.A0j(EnumC912945i.A0H)) {
                                throw new C102314j6(anonymousClass469.A07, String.format("Unexpected JSON values; expected at most %d properties (in JSON Array)", AbstractC25228BEl.A1Y(length2)));
                            }
                            while (c16l.A1J() != c16r2) {
                                c16l.A0z();
                            }
                        } else {
                            RBV rbv2 = rbvArr2[i2];
                            if (rbv2 != null) {
                                try {
                                    A04 = rbv2.A0D(c16l, anonymousClass469, A04);
                                } catch (Exception e2) {
                                    e = e2;
                                    c913945y = rbv2.A06;
                                    A1D(anonymousClass469, A04, c913945y.A02, e);
                                    throw C00O.createAndThrow();
                                }
                            } else {
                                c16l.A0z();
                            }
                            i2++;
                        }
                    }
                }
            }
            try {
                return this.A02.A01.invoke(A04, null);
            } catch (Exception e3) {
                A1E(anonymousClass469, e3);
            }
        }
        throw C00O.createAndThrow();
    }

    public BeanAsArrayBuilderDeserializer(AbstractC910944l abstractC910944l, BeanDeserializerBase beanDeserializerBase, RBK rbk, RBV[] rbvArr) {
        super(beanDeserializerBase, beanDeserializerBase.A0E);
        this.A01 = beanDeserializerBase;
        this.A00 = abstractC910944l;
        this.A03 = rbvArr;
        this.A02 = rbk;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final JsonDeserializer A0A(SXY sxy) {
        return this.A01.A0A(sxy);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        return this.A01.A0C(c16l, anonymousClass469, obj);
    }
}
