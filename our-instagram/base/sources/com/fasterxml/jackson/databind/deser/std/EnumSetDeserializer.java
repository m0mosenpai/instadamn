package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58320PtC;
import X.AbstractC63020Sal;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C102314j6;
import X.C16L;
import X.C16R;
import X.C2I7;
import X.C64175T2e;
import X.C912845h;
import X.C914045z;
import X.EnumC61060ReZ;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class EnumSetDeserializer extends StdDeserializer implements InterfaceC102474jf {
    public JsonDeserializer A00;
    public final AbstractC910944l A01;
    public final InterfaceC102444jN A02;
    public final Boolean A03;
    public final boolean A04;

    public EnumSetDeserializer(AbstractC910944l abstractC910944l) {
        super(EnumSet.class);
        this.A01 = abstractC910944l;
        Class cls = abstractC910944l.A00;
        Iterator it = C914045z.A00;
        if (Enum.class.isAssignableFrom(cls)) {
            this.A00 = null;
            this.A03 = null;
            this.A02 = null;
            this.A04 = false;
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Type ");
        A1C.append(abstractC910944l);
        throw AbstractC58320PtC.A0m(" not Java Enum type", A1C);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        EnumSet enumSet = (EnumSet) obj;
        if (!c16l.A16()) {
            A0y(c16l, anonymousClass469, enumSet);
            return enumSet;
        }
        A0x(c16l, anonymousClass469, enumSet);
        return enumSet;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        EnumSet noneOf = EnumSet.noneOf(this.A01.A00);
        if (!c16l.A16()) {
            A0y(c16l, anonymousClass469, noneOf);
            return noneOf;
        }
        A0x(c16l, anonymousClass469, noneOf);
        return noneOf;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A01;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return EnumSet.noneOf(this.A01.A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        if (this.A01.A02 == null) {
            return true;
        }
        return false;
    }

    public final void A0y(C16L c16l, AnonymousClass469 anonymousClass469, EnumSet enumSet) {
        Boolean bool = this.A03;
        if (bool == Boolean.TRUE || (bool == null && anonymousClass469.A0j(EnumC912945i.A06))) {
            if (c16l.A19(C16R.A0G)) {
                anonymousClass469.A0R(c16l, this.A01);
            } else {
                try {
                    Enum r0 = (Enum) this.A00.A0D(c16l, anonymousClass469);
                    if (r0 != null) {
                        enumSet.add(r0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    throw C102314j6.A03(enumSet, e, enumSet.size());
                }
            }
        } else {
            anonymousClass469.A0T(c16l, EnumSet.class);
        }
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        JsonDeserializer A0D;
        Boolean A01 = AbstractC58320PtC.A0a(interfaceC65620ToB, anonymousClass469, EnumSet.class).A01(EnumC61060ReZ.A01);
        JsonDeserializer jsonDeserializer = this.A00;
        AbstractC910944l abstractC910944l = this.A01;
        if (jsonDeserializer == null) {
            A0D = anonymousClass469.A0B(interfaceC65620ToB, abstractC910944l);
        } else {
            A0D = anonymousClass469.A0D(interfaceC65620ToB, abstractC910944l, jsonDeserializer);
        }
        InterfaceC102444jN A0V = A0V(interfaceC65620ToB, anonymousClass469, A0D);
        if (C2I7.A00(this.A03, A01) && jsonDeserializer == A0D && this.A02 == A0D) {
            return this;
        }
        return new EnumSetDeserializer(A0D, A0V, this, A01);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean A0G(C912845h c912845h) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A04(c16l, anonymousClass469);
    }

    public final void A0x(C16L c16l, AnonymousClass469 anonymousClass469, EnumSet enumSet) {
        Enum r0;
        while (true) {
            try {
                C16R A1J = c16l.A1J();
                if (A1J != C16R.A08) {
                    if (A1J == C16R.A0G) {
                        if (!this.A04) {
                            r0 = (Enum) this.A02.BXX(anonymousClass469);
                        }
                    } else {
                        r0 = (Enum) this.A00.A0D(c16l, anonymousClass469);
                    }
                    if (r0 != null) {
                        enumSet.add(r0);
                    }
                } else {
                    return;
                }
            } catch (Exception e) {
                throw C102314j6.A03(enumSet, e, enumSet.size());
            }
        }
    }

    public EnumSetDeserializer(JsonDeserializer jsonDeserializer, InterfaceC102444jN interfaceC102444jN, EnumSetDeserializer enumSetDeserializer, Boolean bool) {
        super(enumSetDeserializer);
        this.A01 = enumSetDeserializer.A01;
        this.A00 = jsonDeserializer;
        this.A02 = interfaceC102444jN;
        this.A04 = AbstractC167007dF.A1X(interfaceC102444jN, C64175T2e.A02);
        this.A03 = bool;
    }
}
