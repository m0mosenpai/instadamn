package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC37303Gc4;
import X.AbstractC58319PtB;
import X.AbstractC62638SJv;
import X.AbstractC63020Sal;
import X.AbstractC910944l;
import X.AbstractC911744t;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import X.InterfaceC102444jN;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.AbstractMap;
import java.util.Map;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class MapEntryDeserializer extends ContainerDeserializerBase implements InterfaceC102474jf {
    public final JsonDeserializer A00;
    public final AbstractC62638SJv A01;
    public final AbstractC63020Sal A02;

    public MapEntryDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, AbstractC62638SJv abstractC62638SJv, AbstractC63020Sal abstractC63020Sal) {
        super(abstractC910944l, (InterfaceC102444jN) null, (Boolean) null);
        if (((AbstractC911744t) abstractC910944l).A01.A01.length == 2) {
            this.A01 = abstractC62638SJv;
            this.A00 = jsonDeserializer;
            this.A02 = abstractC63020Sal;
            return;
        }
        throw AbstractC37303Gc4.A0M(abstractC910944l, "Missing generic type information for ", AbstractC166987dD.A1C());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        throw AbstractC166987dD.A14("Cannot update Map.Entry values");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        JsonDeserializer A0D;
        AbstractC62638SJv abstractC62638SJv = this.A01;
        if (abstractC62638SJv == null) {
            abstractC62638SJv = anonymousClass469.A0G(((ContainerDeserializerBase) this).A00.A07(0));
        }
        JsonDeserializer jsonDeserializer = this.A00;
        JsonDeserializer A05 = StdDeserializer.A05(interfaceC65620ToB, anonymousClass469, jsonDeserializer);
        AbstractC910944l A07 = ((ContainerDeserializerBase) this).A00.A07(1);
        if (A05 == null) {
            A0D = anonymousClass469.A0B(interfaceC65620ToB, A07);
        } else {
            A0D = anonymousClass469.A0D(interfaceC65620ToB, A07, A05);
        }
        AbstractC63020Sal abstractC63020Sal = this.A02;
        if (abstractC63020Sal != null) {
            abstractC63020Sal = abstractC63020Sal.A02(interfaceC65620ToB);
        }
        if (abstractC62638SJv == abstractC62638SJv && jsonDeserializer == A0D && abstractC63020Sal == abstractC63020Sal) {
            return this;
        }
        return new MapEntryDeserializer(A0D, abstractC62638SJv, this, abstractC63020Sal);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A0J;
        String A0n;
        Object[] objArr;
        C16R A10 = c16l.A10();
        if (A10 == C16R.A0D) {
            A10 = c16l.A1J();
        } else if (A10 != C16R.A0A && A10 != C16R.A09) {
            if (A10 == C16R.A0C) {
                return A0g(c16l, anonymousClass469);
            }
            AbstractC58319PtB.A1G(c16l, anonymousClass469, this);
            throw C00O.createAndThrow();
        }
        C16R c16r = C16R.A0A;
        if (A10 != c16r) {
            if (A10 == C16R.A09) {
                objArr = new Object[0];
                A0n = "Cannot deserialize a Map.Entry out of empty JSON Object";
            } else {
                anonymousClass469.A0T(c16l, A0H());
                throw C00O.createAndThrow();
            }
        } else {
            AbstractC62638SJv abstractC62638SJv = this.A01;
            JsonDeserializer jsonDeserializer = this.A00;
            AbstractC63020Sal abstractC63020Sal = this.A02;
            String A0Y = c16l.A0Y();
            Object A00 = abstractC62638SJv.A00(anonymousClass469, A0Y);
            try {
                if (c16l.A1J() == C16R.A0G) {
                    A0J = jsonDeserializer.BXX(anonymousClass469);
                } else if (abstractC63020Sal == null) {
                    A0J = jsonDeserializer.A0D(c16l, anonymousClass469);
                } else {
                    A0J = jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
                }
                C16R A1J = c16l.A1J();
                if (A1J != C16R.A09) {
                    if (A1J == c16r) {
                        objArr = new Object[]{c16l.A0Y()};
                        A0n = "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')";
                    } else {
                        A0n = AbstractC167017dG.A0n(A1J, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ", AbstractC166987dD.A1C());
                        objArr = new Object[0];
                    }
                } else {
                    return new AbstractMap.SimpleEntry(A00, A0J);
                }
            } catch (Exception e) {
                ContainerDeserializerBase.A01(anonymousClass469, Map.Entry.class, A0Y, e);
                throw C00O.createAndThrow();
            }
        }
        anonymousClass469.A0h(A0n, objArr);
        throw C00O.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A05(c16l, anonymousClass469);
    }

    public MapEntryDeserializer(JsonDeserializer jsonDeserializer, AbstractC62638SJv abstractC62638SJv, MapEntryDeserializer mapEntryDeserializer, AbstractC63020Sal abstractC63020Sal) {
        super(((ContainerDeserializerBase) mapEntryDeserializer).A01, mapEntryDeserializer, ((ContainerDeserializerBase) mapEntryDeserializer).A02);
        this.A01 = abstractC62638SJv;
        this.A00 = jsonDeserializer;
        this.A02 = abstractC63020Sal;
    }
}
