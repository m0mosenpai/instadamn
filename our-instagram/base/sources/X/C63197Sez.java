package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sez, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63197Sez {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public long A05;
    public long A06;
    public final SGJ A07;
    public final List A08;
    public final Map A09;
    public final InterfaceC65253Tgj A0A;

    public final AbstractC63157Se6 A01(Class cls) {
        Map map = this.A09;
        AbstractC63157Se6 abstractC63157Se6 = (AbstractC63157Se6) map.get(cls);
        if (abstractC63157Se6 == null) {
            AbstractC63157Se6 A00 = A00(cls);
            map.put(cls, A00);
            return A00;
        }
        return abstractC63157Se6;
    }

    public C63197Sez(SGJ sgj, InterfaceC65253Tgj interfaceC65253Tgj) {
        C3U5.A02(interfaceC65253Tgj);
        this.A07 = sgj;
        this.A0A = interfaceC65253Tgj;
        this.A05 = 1800000L;
        this.A06 = 3024000000L;
        this.A09 = AbstractC166987dD.A1G();
        this.A08 = AbstractC166987dD.A1E();
    }

    public static AbstractC63157Se6 A00(Class cls) {
        try {
            return (AbstractC63157Se6) AbstractC58320PtC.A0t(cls);
        } catch (Exception e) {
            if (!(e instanceof InstantiationException)) {
                if (!(e instanceof IllegalAccessException)) {
                    if (e instanceof ReflectiveOperationException) {
                        throw new IllegalArgumentException("Linkage exception", e);
                    }
                    throw AbstractC58318PtA.A0f(e);
                }
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        }
    }

    public final void A02(AbstractC63157Se6 abstractC63157Se6) {
        C3U5.A02(abstractC63157Se6);
        Class<?> cls = abstractC63157Se6.getClass();
        if (cls.getSuperclass() == AbstractC63157Se6.class) {
            abstractC63157Se6.A02(A01(cls));
            return;
        }
        throw AbstractC58318PtA.A0Y();
    }

    public C63197Sez(C63197Sez c63197Sez) {
        this.A07 = c63197Sez.A07;
        this.A0A = c63197Sez.A0A;
        this.A00 = c63197Sez.A00;
        this.A01 = c63197Sez.A01;
        this.A02 = c63197Sez.A02;
        this.A05 = c63197Sez.A05;
        this.A06 = c63197Sez.A06;
        this.A08 = AbstractC166987dD.A1F(c63197Sez.A08);
        this.A09 = new HashMap(c63197Sez.A09.size());
        Iterator A15 = AbstractC166997dE.A15(c63197Sez.A09);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            AbstractC63157Se6 A00 = A00((Class) A1K.getKey());
            ((AbstractC63157Se6) A1K.getValue()).A02(A00);
            this.A09.put(A1K.getKey(), A00);
        }
    }
}
