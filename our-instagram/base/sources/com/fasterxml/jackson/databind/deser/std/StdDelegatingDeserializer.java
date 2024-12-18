package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AbstractC63020Sal;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C16L;
import X.C912845h;
import X.C914045z;
import X.InterfaceC102464je;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.TmN;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes10.dex */
public class StdDelegatingDeserializer extends StdDeserializer implements InterfaceC102464je, InterfaceC102474jf {
    public final AbstractC910944l A00;
    public final TmN A01;
    public final JsonDeserializer A02;

    public StdDelegatingDeserializer(TmN tmN) {
        super(Object.class);
        this.A01 = tmN;
        this.A00 = null;
        this.A02 = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        AbstractC910944l abstractC910944l = this.A00;
        Class cls = abstractC910944l.A00;
        Class<?> cls2 = obj.getClass();
        if (cls.isAssignableFrom(cls2)) {
            return this.A02.A0C(c16l, anonymousClass469, obj);
        }
        throw AbstractC166987dD.A1D(String.format(AbstractC58319PtB.A0t(cls2, "Cannot update object of type %s (using deserializer for type %s)"), abstractC910944l));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A0D = this.A02.A0D(c16l, anonymousClass469);
        if (A0D == null) {
            return null;
        }
        return this.A01.AK2(A0D);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean A0G(C912845h c912845h) {
        return this.A02.A0G(c912845h);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Class A0H() {
        return this.A02.A0H();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return this.A02.A0I();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        Object A0D = this.A02.A0D(c16l, anonymousClass469);
        if (A0D == null) {
            return null;
        }
        return this.A01.AK2(A0D);
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        JsonDeserializer jsonDeserializer = this.A02;
        if (jsonDeserializer != null) {
            AbstractC910944l abstractC910944l = this.A00;
            JsonDeserializer A0D = anonymousClass469.A0D(interfaceC65620ToB, abstractC910944l, jsonDeserializer);
            if (A0D != jsonDeserializer) {
                TmN tmN = this.A01;
                C914045z.A0E(StdDelegatingDeserializer.class, this, "withDelegate");
                return new StdDelegatingDeserializer(abstractC910944l, A0D, tmN);
            }
            return this;
        }
        TmN tmN2 = this.A01;
        AbstractC910944l BI9 = tmN2.BI9(anonymousClass469.A05());
        JsonDeserializer A0B = anonymousClass469.A0B(interfaceC65620ToB, BI9);
        C914045z.A0E(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer(BI9, A0B, tmN2);
    }

    @Override // X.InterfaceC102464je
    public final void EK8(AnonymousClass469 anonymousClass469) {
        Object obj = this.A02;
        if (obj != null && (obj instanceof InterfaceC102464je)) {
            ((InterfaceC102464je) obj).EK8(anonymousClass469);
        }
    }

    public StdDelegatingDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, TmN tmN) {
        super(abstractC910944l);
        this.A01 = tmN;
        this.A00 = abstractC910944l;
        this.A02 = jsonDeserializer;
    }
}
