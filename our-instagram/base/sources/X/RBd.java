package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public abstract class RBd extends AbstractC63020Sal implements Serializable {
    public JsonDeserializer A00;
    public final InterfaceC65620ToB A01;
    public final AbstractC910944l A02;
    public final AbstractC910944l A03;
    public final InterfaceC65565Tmr A04;
    public final String A05;
    public final Map A06;
    public final boolean A07;

    public final JsonDeserializer A07(AnonymousClass469 anonymousClass469) {
        JsonDeserializer jsonDeserializer;
        AbstractC910944l abstractC910944l = this.A03;
        if (abstractC910944l == null) {
            if (anonymousClass469.A0j(EnumC912945i.A09)) {
                return null;
            }
        } else if (!C914045z.A0I(abstractC910944l.A00)) {
            synchronized (abstractC910944l) {
                jsonDeserializer = this.A00;
                if (jsonDeserializer == null) {
                    jsonDeserializer = anonymousClass469.A0B(this.A01, abstractC910944l);
                    this.A00 = jsonDeserializer;
                }
            }
            return jsonDeserializer;
        }
        return NullifyingDeserializer.A00;
    }

    public final JsonDeserializer A08(AnonymousClass469 anonymousClass469, String str) {
        JsonDeserializer A0B;
        String A0R;
        Map map = this.A06;
        JsonDeserializer jsonDeserializer = (JsonDeserializer) map.get(str);
        if (jsonDeserializer == null) {
            InterfaceC65565Tmr interfaceC65565Tmr = this.A04;
            AbstractC910944l F8w = interfaceC65565Tmr.F8w(anonymousClass469, str);
            if (F8w == null) {
                A0B = A07(anonymousClass469);
                if (A0B == null) {
                    String Awq = interfaceC65565Tmr.Awq();
                    if (Awq == null) {
                        A0R = "type ids are not statically known";
                    } else {
                        A0R = AnonymousClass001.A0R("known type ids = ", Awq);
                    }
                    InterfaceC65620ToB interfaceC65620ToB = this.A01;
                    if (interfaceC65620ToB != null) {
                        A0R = String.format("%s (for POJO property '%s')", A0R, interfaceC65620ToB.getName());
                    }
                    AbstractC910944l abstractC910944l = this.A02;
                    if (anonymousClass469.A02.A08 != null) {
                        throw AbstractC166987dD.A15("handleUnknownTypeId");
                    }
                    if (!anonymousClass469.A0j(EnumC912945i.A09)) {
                        return NullifyingDeserializer.A00;
                    }
                    throw anonymousClass469.A04(abstractC910944l, str, A0R);
                }
            } else {
                AbstractC910944l abstractC910944l2 = this.A02;
                if (abstractC910944l2 != null && abstractC910944l2.getClass() == F8w.getClass() && !F8w.A0J()) {
                    try {
                        Class cls = F8w.A00;
                        if (abstractC910944l2.A00 != cls) {
                            abstractC910944l2 = ((C45T) anonymousClass469.A02).A01.A07.A05(abstractC910944l2, cls, false);
                        }
                        F8w = abstractC910944l2;
                    } catch (IllegalArgumentException e) {
                        throw anonymousClass469.A04(abstractC910944l2, str, e.getMessage());
                    }
                }
                A0B = anonymousClass469.A0B(this.A01, F8w);
            }
            map.put(str, A0B);
            return A0B;
        }
        return jsonDeserializer;
    }

    public RBd(InterfaceC65620ToB interfaceC65620ToB, RBd rBd) {
        this.A02 = rBd.A02;
        this.A04 = rBd.A04;
        this.A05 = rBd.A05;
        this.A07 = rBd.A07;
        this.A06 = rBd.A06;
        this.A03 = rBd.A03;
        this.A00 = rBd.A00;
        this.A01 = interfaceC65620ToB;
    }

    public static C16L A00(C16L c16l, C16R c16r, AnonymousClass469 anonymousClass469, RBd rBd, String str) {
        if (c16l.A19(c16r)) {
            C914146b c914146b = new C914146b(c16l, anonymousClass469);
            c914146b.A0d();
            c914146b.A0r(rBd.A05);
            c914146b.A0u(str);
            c16l.A13();
            C60579R8u A00 = C60579R8u.A00(c914146b.A11(c16l), c16l);
            A00.A1J();
            return A00;
        }
        return c16l;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('[');
        A1C.append(MSY.A0h(this));
        A1C.append("; base-type:");
        A1C.append(this.A02);
        A1C.append("; id-resolver: ");
        A1C.append(this.A04);
        return AbstractC58320PtC.A14(A1C);
    }

    public RBd(AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2, InterfaceC65565Tmr interfaceC65565Tmr, String str, boolean z) {
        this.A02 = abstractC910944l;
        this.A04 = interfaceC65565Tmr;
        Iterator it = C914045z.A00;
        this.A05 = str == null ? "" : str;
        this.A07 = z;
        this.A06 = new ConcurrentHashMap(16, 0.75f, 2);
        this.A03 = abstractC910944l2;
        this.A01 = null;
    }
}
