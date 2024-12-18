package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TI5 implements Serializable {
    public JsonDeserializer A00;
    public final InterfaceC65620ToB A01;
    public final AbstractC910944l A02;
    public final AbstractC62638SJv A03;
    public final RBL A04;
    public final AbstractC63020Sal A05;
    public final boolean A06;

    public final void A01(C16L c16l, AnonymousClass469 anonymousClass469, Object obj, String str) {
        Object A00;
        try {
            AbstractC62638SJv abstractC62638SJv = this.A03;
            if (abstractC62638SJv == null) {
                A00 = str;
            } else {
                A00 = abstractC62638SJv.A00(anonymousClass469, str);
            }
            A02(obj, A00, A00(c16l, anonymousClass469));
        } catch (R97 e) {
            if (this.A00.A0F() != null) {
                e.A00.A00(new R9y(this, e, this.A02.A00, obj, str));
                return;
            }
            throw new C102314j6(c16l, "Unresolved forward reference but no identity info.", e);
        }
    }

    public final Object A00(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (c16l.A19(C16R.A0G)) {
            return this.A00.BXX(anonymousClass469);
        }
        AbstractC63020Sal abstractC63020Sal = this.A05;
        JsonDeserializer jsonDeserializer = this.A00;
        if (abstractC63020Sal != null) {
            return jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
        }
        return jsonDeserializer.A0D(c16l, anonymousClass469);
    }

    public final void A02(Object obj, Object obj2, Object obj3) {
        try {
            if (this.A06) {
                Map map = (Map) ((RBJ) this.A04).A0A(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                    return;
                }
                return;
            }
            ((RBK) this.A04).A01.invoke(obj, obj2, obj3);
        } catch (Exception e) {
            e = e;
            if (e instanceof IllegalArgumentException) {
                String A07 = C914045z.A07(obj3);
                StringBuilder A0s = AbstractC58318PtA.A0s("Problem deserializing \"any\" property '");
                A0s.append(obj2);
                A0s.append(AnonymousClass001.A0g("' of class ", this.A04.A09().getName(), " (expected type: "));
                A0s.append(this.A02);
                A0s.append("; actual type: ");
                A0s.append(A07);
                A0s.append(")");
                String A09 = C914045z.A09(e);
                if (A09 != null) {
                    A0s.append(", problem: ");
                } else {
                    A09 = " (no error message provided)";
                }
                throw new C102314j6(null, AbstractC166997dE.A0x(A09, A0s), e);
            }
            Iterator it = C914045z.A00;
            if (!(e instanceof IOException)) {
                C914045z.A0F(e);
                while (e.getCause() != null) {
                    e = e.getCause();
                }
                throw new C102314j6(null, C914045z.A09(e), e);
            }
            throw e;
        }
    }

    public final String toString() {
        return AnonymousClass001.A0g("[any property on class ", this.A04.A09().getName(), "]");
    }

    public TI5(InterfaceC65620ToB interfaceC65620ToB, AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, AbstractC62638SJv abstractC62638SJv, RBL rbl, AbstractC63020Sal abstractC63020Sal) {
        this.A01 = interfaceC65620ToB;
        this.A04 = rbl;
        this.A02 = abstractC910944l;
        this.A00 = jsonDeserializer;
        this.A05 = abstractC63020Sal;
        this.A03 = abstractC62638SJv;
        this.A06 = rbl instanceof RBJ;
    }
}
