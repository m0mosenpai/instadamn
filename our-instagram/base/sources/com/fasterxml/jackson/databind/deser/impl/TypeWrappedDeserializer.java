package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC166987dD;
import X.AbstractC63020Sal;
import X.AnonymousClass469;
import X.C16L;
import X.C912845h;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.Collection;

/* loaded from: classes10.dex */
public final class TypeWrappedDeserializer extends JsonDeserializer implements Serializable {
    public final JsonDeserializer A00;
    public final AbstractC63020Sal A01;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        return this.A00.A0C(c16l, anonymousClass469, obj);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        return this.A00.A0J(c16l, anonymousClass469, this.A01);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean A0G(C912845h c912845h) {
        return this.A00.A0G(c912845h);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Class A0H() {
        return this.A00.A0H();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return this.A00.A0I();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        throw AbstractC166987dD.A14("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return this.A00.A0K(anonymousClass469);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Collection A0L() {
        return this.A00.A0L();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, X.InterfaceC102444jN
    public final Object BXX(AnonymousClass469 anonymousClass469) {
        return this.A00.BXX(anonymousClass469);
    }

    public TypeWrappedDeserializer(JsonDeserializer jsonDeserializer, AbstractC63020Sal abstractC63020Sal) {
        this.A01 = abstractC63020Sal;
        this.A00 = jsonDeserializer;
    }
}
