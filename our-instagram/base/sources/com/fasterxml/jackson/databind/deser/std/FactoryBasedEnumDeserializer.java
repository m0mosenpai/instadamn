package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC167007dF;
import X.AbstractC63020Sal;
import X.AbstractC63035SbA;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C05F;
import X.C16L;
import X.C63173SeY;
import X.C912845h;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.RBK;
import X.RBV;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes10.dex */
public class FactoryBasedEnumDeserializer extends StdDeserializer implements InterfaceC102474jf {
    public final AbstractC910944l A00;
    public final JsonDeserializer A01;
    public final AbstractC63035SbA A02;
    public final RBK A03;
    public final boolean A04;
    public final RBV[] A05;
    public transient C63173SeY A06;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        return true;
    }

    public FactoryBasedEnumDeserializer(JsonDeserializer jsonDeserializer, FactoryBasedEnumDeserializer factoryBasedEnumDeserializer) {
        super(((StdDeserializer) factoryBasedEnumDeserializer).A00);
        this.A00 = factoryBasedEnumDeserializer.A00;
        this.A03 = factoryBasedEnumDeserializer.A03;
        this.A04 = factoryBasedEnumDeserializer.A04;
        this.A02 = factoryBasedEnumDeserializer.A02;
        this.A05 = factoryBasedEnumDeserializer.A05;
        this.A01 = jsonDeserializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00aa, code lost:
    
        if (r7.A0j(X.EnumC912945i.A0S) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b5, code lost:
    
        if ((r4 instanceof X.AnonymousClass401) != false) goto L43;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0D(X.C16L r6, X.AnonymousClass469 r7) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer.A0D(X.16L, X.469):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A1F;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        if (this.A01 == null) {
            return A0D(c16l, anonymousClass469);
        }
        return abstractC63020Sal.A03(c16l, anonymousClass469);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC63035SbA A0W() {
        return this.A02;
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        AbstractC910944l abstractC910944l;
        if (this.A01 == null && (abstractC910944l = this.A00) != null && this.A05 == null) {
            return new FactoryBasedEnumDeserializer(anonymousClass469.A0B(interfaceC65620ToB, abstractC910944l), this);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean A0G(C912845h c912845h) {
        return Boolean.FALSE;
    }

    public FactoryBasedEnumDeserializer(AbstractC910944l abstractC910944l, AbstractC63035SbA abstractC63035SbA, RBK rbk, Class cls, RBV[] rbvArr) {
        super(cls);
        this.A03 = rbk;
        this.A04 = true;
        Class cls2 = abstractC910944l.A00;
        this.A00 = (AbstractC167007dF.A1X(cls2, String.class) || cls2 == CharSequence.class) ? null : abstractC910944l;
        this.A01 = null;
        this.A02 = abstractC63035SbA;
        this.A05 = rbvArr;
    }

    public FactoryBasedEnumDeserializer(RBK rbk, Class cls) {
        super(cls);
        this.A03 = rbk;
        this.A04 = false;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
    }
}
