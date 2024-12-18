package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC63020Sal;
import X.AbstractC63035SbA;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C102414jI;
import X.C16L;
import X.C16R;
import X.C46h;
import X.C912845h;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaOptionalDeserializer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public abstract class ReferenceTypeDeserializer extends StdDeserializer implements InterfaceC102474jf {
    public final AbstractC910944l A00;
    public final JsonDeserializer A01;
    public final AbstractC63035SbA A02;
    public final AbstractC63020Sal A03;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        Object A0J;
        Object obj2;
        JsonDeserializer jsonDeserializer = this.A01;
        if (!jsonDeserializer.A0G(anonymousClass469.A02).equals(Boolean.FALSE) && this.A03 == null) {
            boolean z = this instanceof GuavaOptionalDeserializer;
            if (z) {
                obj2 = ((C46h) obj).A03();
            } else {
                obj2 = ((AtomicReference) obj).get();
            }
            if (obj2 == null) {
                Object A0D = jsonDeserializer.A0D(c16l, anonymousClass469);
                if (z) {
                    return C46h.A00(A0D);
                }
                return new AtomicReference(A0D);
            }
            A0J = jsonDeserializer.A0C(c16l, anonymousClass469, obj2);
        } else {
            AbstractC63020Sal abstractC63020Sal = this.A03;
            if (abstractC63020Sal == null) {
                A0J = jsonDeserializer.A0D(c16l, anonymousClass469);
            } else {
                A0J = jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
            }
        }
        if (this instanceof GuavaOptionalDeserializer) {
            return C46h.A00(A0J);
        }
        AtomicReference atomicReference = (AtomicReference) obj;
        atomicReference.set(A0J);
        return atomicReference;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A0J;
        AbstractC63035SbA abstractC63035SbA = this.A02;
        if (abstractC63035SbA != null) {
            return A0C(c16l, anonymousClass469, abstractC63035SbA.A04(anonymousClass469));
        }
        AbstractC63020Sal abstractC63020Sal = this.A03;
        JsonDeserializer jsonDeserializer = this.A01;
        if (abstractC63020Sal == null) {
            A0J = jsonDeserializer.A0D(c16l, anonymousClass469);
        } else {
            A0J = jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
        }
        if (this instanceof GuavaOptionalDeserializer) {
            return C46h.A00(A0J);
        }
        return new AtomicReference(A0J);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean A0G(C912845h c912845h) {
        if (this instanceof AtomicReferenceDeserializer) {
            return Boolean.TRUE;
        }
        JsonDeserializer jsonDeserializer = this.A01;
        if (jsonDeserializer == null) {
            return null;
        }
        return jsonDeserializer.A0G(c912845h);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        JsonDeserializer jsonDeserializer = this.A01;
        if (jsonDeserializer != null) {
            return jsonDeserializer.A0I();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        if (c16l.A19(C16R.A0G)) {
            return BXX(anonymousClass469);
        }
        AbstractC63020Sal abstractC63020Sal2 = this.A03;
        if (abstractC63020Sal2 == null) {
            return A0D(c16l, anonymousClass469);
        }
        Object A03 = abstractC63020Sal2.A03(c16l, anonymousClass469);
        if (this instanceof GuavaOptionalDeserializer) {
            return C46h.A00(A03);
        }
        return new AtomicReference(A03);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC910944l A0T() {
        return this.A00;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC63035SbA A0W() {
        return this.A02;
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        AbstractC910944l abstractC910944l;
        JsonDeserializer A0D;
        AbstractC910944l abstractC910944l2;
        JsonDeserializer jsonDeserializer = this.A01;
        AbstractC910944l abstractC910944l3 = this.A00;
        boolean z = abstractC910944l3 instanceof C102414jI;
        if (jsonDeserializer == null) {
            if (z) {
                abstractC910944l2 = ((C102414jI) abstractC910944l3).A01;
            } else {
                abstractC910944l2 = null;
            }
            A0D = anonymousClass469.A0B(interfaceC65620ToB, abstractC910944l2);
        } else {
            if (z) {
                abstractC910944l = ((C102414jI) abstractC910944l3).A01;
            } else {
                abstractC910944l = null;
            }
            A0D = anonymousClass469.A0D(interfaceC65620ToB, abstractC910944l, jsonDeserializer);
        }
        AbstractC63020Sal abstractC63020Sal = this.A03;
        if (abstractC63020Sal != null) {
            abstractC63020Sal = abstractC63020Sal.A02(interfaceC65620ToB);
        }
        if (A0D == jsonDeserializer && abstractC63020Sal == abstractC63020Sal) {
            return this;
        }
        boolean z2 = this instanceof GuavaOptionalDeserializer;
        AbstractC63035SbA abstractC63035SbA = this.A02;
        if (z2) {
            return new ReferenceTypeDeserializer(abstractC910944l3, A0D, abstractC63035SbA, abstractC63020Sal);
        }
        return new ReferenceTypeDeserializer(abstractC910944l3, A0D, abstractC63035SbA, abstractC63020Sal);
    }

    public ReferenceTypeDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, AbstractC63035SbA abstractC63035SbA, AbstractC63020Sal abstractC63020Sal) {
        super(abstractC910944l);
        this.A02 = abstractC63035SbA;
        this.A00 = abstractC910944l;
        this.A01 = jsonDeserializer;
        this.A03 = abstractC63020Sal;
    }
}
