package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC62638SJv;
import X.AbstractC63020Sal;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import X.InterfaceC102444jN;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.RRE;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.NaturalOrdering;

/* loaded from: classes10.dex */
public abstract class GuavaMapDeserializer extends ContainerDeserializerBase implements InterfaceC102474jf {
    public JsonDeserializer A00;
    public AbstractC62638SJv A01;
    public final AbstractC63020Sal A02;

    public GuavaMapDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, AbstractC62638SJv abstractC62638SJv, InterfaceC102444jN interfaceC102444jN, AbstractC63020Sal abstractC63020Sal) {
        super(abstractC910944l, interfaceC102444jN, (Boolean) null);
        this.A01 = abstractC62638SJv;
        this.A00 = jsonDeserializer;
        this.A02 = abstractC63020Sal;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        AbstractC62638SJv abstractC62638SJv = this.A01;
        JsonDeserializer jsonDeserializer = this.A00;
        AbstractC63020Sal abstractC63020Sal = this.A02;
        if (abstractC62638SJv == null) {
            abstractC62638SJv = anonymousClass469.A0G(((ContainerDeserializerBase) this).A00.A04());
        }
        AbstractC910944l abstractC910944l = ((ContainerDeserializerBase) this).A00;
        JsonDeserializer A0b = AbstractC58320PtC.A0b(interfaceC65620ToB, anonymousClass469, abstractC910944l, jsonDeserializer);
        if (abstractC63020Sal != null) {
            abstractC63020Sal = abstractC63020Sal.A02(interfaceC65620ToB);
        }
        InterfaceC102444jN A0V = A0V(interfaceC65620ToB, anonymousClass469, A0b);
        if (abstractC62638SJv == abstractC62638SJv && jsonDeserializer == A0b && abstractC63020Sal == abstractC63020Sal && ((ContainerDeserializerBase) this).A01 == A0V) {
            return this;
        }
        if (this instanceof ImmutableSortedMapDeserializer) {
            return new GuavaMapDeserializer(abstractC910944l, A0b, abstractC62638SJv, A0V, abstractC63020Sal);
        }
        if (this instanceof ImmutableMapDeserializer) {
            return new GuavaMapDeserializer(abstractC910944l, A0b, abstractC62638SJv, A0V, abstractC63020Sal);
        }
        return new GuavaMapDeserializer(abstractC910944l, A0b, abstractC62638SJv, A0V, abstractC63020Sal);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        ImmutableMap.Builder builder;
        Object A0J;
        Object A0d;
        C16R A11 = c16l.A11();
        if (A11 == C16R.A0D) {
            A11 = c16l.A1J();
        }
        C16R c16r = C16R.A0A;
        if (A11 != c16r && A11 != C16R.A09) {
            anonymousClass469.A0T(c16l, ((ContainerDeserializerBase) this).A00.A00);
            throw C00O.createAndThrow();
        }
        GuavaImmutableMapDeserializer guavaImmutableMapDeserializer = (GuavaImmutableMapDeserializer) this;
        AbstractC62638SJv abstractC62638SJv = ((GuavaMapDeserializer) guavaImmutableMapDeserializer).A01;
        JsonDeserializer jsonDeserializer = ((GuavaMapDeserializer) guavaImmutableMapDeserializer).A00;
        AbstractC63020Sal abstractC63020Sal = ((GuavaMapDeserializer) guavaImmutableMapDeserializer).A02;
        if (guavaImmutableMapDeserializer instanceof ImmutableSortedMapDeserializer) {
            ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.A03;
            builder = new RRE(NaturalOrdering.A00);
        } else if (guavaImmutableMapDeserializer instanceof ImmutableMapDeserializer) {
            builder = AbstractC58319PtB.A0Z();
        } else {
            builder = new ImmutableMap.Builder(4);
        }
        while (c16l.A11() == c16r) {
            String A0q = c16l.A0q();
            Object obj = A0q;
            if (abstractC62638SJv != null) {
                obj = abstractC62638SJv.A00(anonymousClass469, A0q);
            }
            if (c16l.A1J() == C16R.A0G) {
                if (!guavaImmutableMapDeserializer.A03 && (A0d = AbstractC58318PtA.A0d(anonymousClass469, guavaImmutableMapDeserializer)) != null) {
                    builder.put(obj, A0d);
                }
            } else {
                if (abstractC63020Sal == null) {
                    A0J = jsonDeserializer.A0D(c16l, anonymousClass469);
                } else {
                    A0J = jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
                }
                builder.put(obj, A0J);
            }
            c16l.A1J();
        }
        return builder.buildOrThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A05(c16l, anonymousClass469);
    }
}
