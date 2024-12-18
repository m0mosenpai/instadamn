package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC24851Je;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC63020Sal;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import X.C1RF;
import X.EnumC61060ReZ;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.InterfaceC75173Zi;
import X.RR5;
import X.RRL;
import X.RRP;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.RegularImmutableMultiset;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.RegularImmutableSortedMultiset;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Collection;

/* loaded from: classes10.dex */
public abstract class GuavaCollectionDeserializer extends ContainerDeserializerBase implements InterfaceC102474jf {
    public final JsonDeserializer A00;
    public final AbstractC63020Sal A01;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A01;
    }

    public final Object A0x() {
        if (this instanceof ImmutableSortedSetDeserializer) {
            return RegularImmutableSortedSet.A00;
        }
        if (this instanceof ImmutableSortedMultisetDeserializer) {
            return RegularImmutableSortedMultiset.A03;
        }
        if (this instanceof ImmutableSetDeserializer) {
            return RegularImmutableSet.A03;
        }
        if (this instanceof ImmutableMultisetDeserializer) {
            return RegularImmutableMultiset.A03;
        }
        if (this instanceof ImmutableListDeserializer) {
            return ImmutableList.of();
        }
        return ((GuavaMultisetDeserializer) this).A0y();
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        Boolean A01 = AbstractC58320PtC.A0a(interfaceC65620ToB, anonymousClass469, Collection.class).A01(EnumC61060ReZ.A01);
        JsonDeserializer jsonDeserializer = this.A00;
        AbstractC63020Sal abstractC63020Sal = this.A01;
        if (jsonDeserializer == null) {
            jsonDeserializer = anonymousClass469.A0B(interfaceC65620ToB, ((ContainerDeserializerBase) this).A00.A03());
        }
        if (abstractC63020Sal != null) {
            abstractC63020Sal = abstractC63020Sal.A02(interfaceC65620ToB);
        }
        InterfaceC102444jN A0V = A0V(interfaceC65620ToB, anonymousClass469, jsonDeserializer);
        if (A01 == this.A02 && A0V == ((ContainerDeserializerBase) this).A01 && jsonDeserializer == jsonDeserializer && abstractC63020Sal == abstractC63020Sal) {
            return this;
        }
        if (this instanceof ImmutableSortedSetDeserializer) {
            return new GuavaCollectionDeserializer(((ContainerDeserializerBase) this).A00, jsonDeserializer, A0V, abstractC63020Sal, A01);
        }
        if (this instanceof ImmutableSortedMultisetDeserializer) {
            return new GuavaCollectionDeserializer(((ContainerDeserializerBase) this).A00, jsonDeserializer, A0V, abstractC63020Sal, A01);
        }
        if (this instanceof ImmutableSetDeserializer) {
            return new GuavaCollectionDeserializer(((ContainerDeserializerBase) this).A00, jsonDeserializer, A0V, abstractC63020Sal, A01);
        }
        if (this instanceof ImmutableMultisetDeserializer) {
            return new GuavaCollectionDeserializer(((ContainerDeserializerBase) this).A00, jsonDeserializer, A0V, abstractC63020Sal, A01);
        }
        if (this instanceof ImmutableListDeserializer) {
            return new GuavaCollectionDeserializer(((ContainerDeserializerBase) this).A00, jsonDeserializer, A0V, abstractC63020Sal, A01);
        }
        if (this instanceof TreeMultisetDeserializer) {
            return new GuavaCollectionDeserializer(((ContainerDeserializerBase) this).A00, jsonDeserializer, A0V, abstractC63020Sal, A01);
        }
        boolean z = this instanceof LinkedHashMultisetDeserializer;
        AbstractC910944l abstractC910944l = ((ContainerDeserializerBase) this).A00;
        if (z) {
            return new GuavaCollectionDeserializer(abstractC910944l, jsonDeserializer, A0V, abstractC63020Sal, A01);
        }
        return new GuavaCollectionDeserializer(abstractC910944l, jsonDeserializer, A0V, abstractC63020Sal, A01);
    }

    public GuavaCollectionDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, InterfaceC102444jN interfaceC102444jN, AbstractC63020Sal abstractC63020Sal, Boolean bool) {
        super(abstractC910944l, interfaceC102444jN, bool);
        this.A01 = abstractC63020Sal;
        this.A00 = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A0J;
        AbstractC24851Je rrl;
        AbstractC24851Je builder;
        Object A0J2;
        Object A0J3;
        if (c16l.A16()) {
            if (this instanceof GuavaMultisetDeserializer) {
                GuavaMultisetDeserializer guavaMultisetDeserializer = (GuavaMultisetDeserializer) this;
                JsonDeserializer jsonDeserializer = ((GuavaCollectionDeserializer) guavaMultisetDeserializer).A00;
                AbstractC63020Sal abstractC63020Sal = ((GuavaCollectionDeserializer) guavaMultisetDeserializer).A01;
                InterfaceC75173Zi A0y = guavaMultisetDeserializer.A0y();
                while (true) {
                    C16R A1J = c16l.A1J();
                    if (A1J != C16R.A08) {
                        if (A1J == C16R.A0G) {
                            if (!guavaMultisetDeserializer.A03) {
                                A0J3 = AbstractC58318PtA.A0d(anonymousClass469, guavaMultisetDeserializer);
                            }
                        } else if (abstractC63020Sal == null) {
                            A0J3 = jsonDeserializer.A0D(c16l, anonymousClass469);
                        } else {
                            A0J3 = jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
                        }
                        A0y.add(A0J3);
                    } else {
                        return A0y;
                    }
                }
            } else {
                GuavaImmutableCollectionDeserializer guavaImmutableCollectionDeserializer = (GuavaImmutableCollectionDeserializer) this;
                JsonDeserializer jsonDeserializer2 = ((GuavaCollectionDeserializer) guavaImmutableCollectionDeserializer).A00;
                AbstractC63020Sal abstractC63020Sal2 = ((GuavaCollectionDeserializer) guavaImmutableCollectionDeserializer).A01;
                if (guavaImmutableCollectionDeserializer instanceof ImmutableSortedSetDeserializer) {
                    builder = new RRP(NaturalOrdering.A00);
                } else if (guavaImmutableCollectionDeserializer instanceof ImmutableSortedMultisetDeserializer) {
                    builder = new RRL(NaturalOrdering.A00);
                } else if (guavaImmutableCollectionDeserializer instanceof ImmutableSetDeserializer) {
                    builder = new C1RF();
                } else if (guavaImmutableCollectionDeserializer instanceof ImmutableMultisetDeserializer) {
                    builder = new RR5();
                } else {
                    builder = ImmutableList.builder();
                }
                while (true) {
                    C16R A1J2 = c16l.A1J();
                    if (A1J2 != C16R.A08) {
                        if (A1J2 == C16R.A0G) {
                            if (!guavaImmutableCollectionDeserializer.A03) {
                                A0J2 = AbstractC58318PtA.A0d(anonymousClass469, guavaImmutableCollectionDeserializer);
                            }
                        } else if (abstractC63020Sal2 == null) {
                            A0J2 = jsonDeserializer2.A0D(c16l, anonymousClass469);
                        } else {
                            A0J2 = jsonDeserializer2.A0J(c16l, anonymousClass469, abstractC63020Sal2);
                        }
                        builder.add(A0J2);
                    } else {
                        return builder.build();
                    }
                }
            }
        } else {
            if (anonymousClass469.A0j(EnumC912945i.A06)) {
                JsonDeserializer jsonDeserializer3 = this.A00;
                AbstractC63020Sal abstractC63020Sal3 = this.A01;
                if (c16l.A11() == C16R.A0G) {
                    if (this.A03) {
                        return A0x();
                    }
                    A0J = AbstractC58318PtA.A0d(anonymousClass469, this);
                } else if (abstractC63020Sal3 == null) {
                    A0J = jsonDeserializer3.A0D(c16l, anonymousClass469);
                } else {
                    A0J = jsonDeserializer3.A0J(c16l, anonymousClass469, abstractC63020Sal3);
                }
                if (this instanceof ImmutableSortedSetDeserializer) {
                    rrl = new RRP(NaturalOrdering.A00);
                } else if (this instanceof ImmutableSortedMultisetDeserializer) {
                    rrl = new RRL(NaturalOrdering.A00);
                } else {
                    if (this instanceof ImmutableSetDeserializer) {
                        return new SingletonImmutableSet(A0J);
                    }
                    if (this instanceof ImmutableMultisetDeserializer) {
                        RR5 rr5 = new RR5();
                        rr5.add(new Object[]{A0J}[0]);
                        return rr5.build();
                    }
                    if (this instanceof ImmutableListDeserializer) {
                        return ImmutableList.of(A0J);
                    }
                    InterfaceC75173Zi A0y2 = ((GuavaMultisetDeserializer) this).A0y();
                    A0y2.add(A0J);
                    return A0y2;
                }
                rrl.add(A0J);
                return rrl.build();
            }
            anonymousClass469.A0T(c16l, ((StdDeserializer) this).A00);
            throw C00O.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A04(c16l, anonymousClass469);
    }
}
