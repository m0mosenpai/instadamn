package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.SbA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63035SbA {
    public final Class A03() {
        if (this instanceof R9r) {
            return ((R9r) this).A0G;
        }
        return ((R9q) this).A00;
    }

    public final Object A08(AnonymousClass469 anonymousClass469, Object obj) {
        if (this instanceof R9r) {
            R9r r9r = (R9r) this;
            RBH rbh = r9r.A02;
            if (rbh == null && r9r.A04 != null) {
                return r9r.A09(anonymousClass469, obj);
            }
            return R9r.A00(anonymousClass469, r9r, rbh, obj, r9r.A0D);
        }
        anonymousClass469.A0Y(this, A03(), "no array delegate creator specified", AbstractC58318PtA.A1b());
        throw C00O.createAndThrow();
    }

    public final Object A09(AnonymousClass469 anonymousClass469, Object obj) {
        RBH rbh;
        if (this instanceof R9r) {
            R9r r9r = (R9r) this;
            RBH rbh2 = r9r.A04;
            if (rbh2 == null && (rbh = r9r.A02) != null) {
                return R9r.A00(anonymousClass469, r9r, rbh, obj, r9r.A0D);
            }
            return R9r.A00(anonymousClass469, r9r, rbh2, obj, r9r.A0F);
        }
        anonymousClass469.A0Y(this, A03(), "no delegate creator specified", AbstractC58318PtA.A1b());
        throw C00O.createAndThrow();
    }

    public final boolean A0F() {
        if (this instanceof R9r) {
            return AbstractC167007dF.A1W(((R9r) this).A07);
        }
        return false;
    }

    public final boolean A0G() {
        if (this instanceof R9r) {
            return AbstractC167007dF.A1W(((R9r) this).A09);
        }
        return false;
    }

    public final boolean A0H() {
        if (this instanceof R9r) {
            return AbstractC167007dF.A1W(((R9r) this).A0A);
        }
        return false;
    }

    public final boolean A0I() {
        if (this instanceof R9r) {
            return AbstractC167007dF.A1W(((R9r) this).A0C);
        }
        if (this instanceof R9l) {
            return true;
        }
        return false;
    }

    public final boolean A0J() {
        if (this instanceof R9r) {
            return AbstractC167007dF.A1W(((R9r) this).A0B);
        }
        return false;
    }

    public final boolean A0K() {
        if (this instanceof R9r) {
            return AbstractC167007dF.A1W(((R9r) this).A00);
        }
        return false;
    }

    public final boolean A0L() {
        if (!(this instanceof R9p) && !(this instanceof R9n)) {
            if (this instanceof R9r) {
                return AbstractC167007dF.A1W(((R9r) this).A03);
            }
            if (!(this instanceof R9o) && !(this instanceof R9m)) {
                return AbstractC167007dF.A1W(null);
            }
            return true;
        }
        return true;
    }

    public final boolean A0M() {
        if (this instanceof R9r) {
            return AbstractC167007dF.A1W(((R9r) this).A01);
        }
        return false;
    }

    public final boolean A0N() {
        if (!(this instanceof R9p) && !(this instanceof R9o) && !(this instanceof R9m) && !(this instanceof R9n) && !A0L() && !A0M() && !A0K() && !A0I() && !A0J() && !A0G() && !A0H() && ((!(this instanceof R9r) || !AbstractC167007dF.A1W(((R9r) this).A08)) && !A0F())) {
            return false;
        }
        return true;
    }

    public final RBV[] A0O(C912845h c912845h) {
        if (this instanceof R9r) {
            return ((R9r) this).A0E;
        }
        if (this instanceof R9l) {
            Class cls = Integer.TYPE;
            C910844k c910844k = ((C45T) c912845h).A01.A07;
            AbstractC910944l A09 = c910844k.A09(cls);
            AbstractC910944l A092 = c910844k.A09(Long.TYPE);
            return new RBV[]{R9l.A00(c910844k.A09(Object.class), "sourceRef", 0), R9l.A00(A092, "byteOffset", 1), R9l.A00(A092, "charOffset", 2), R9l.A00(A09, "lineNr", 3), R9l.A00(A09, "columnNr", 4)};
        }
        return null;
    }

    public static Object A02(C16L c16l, AnonymousClass469 anonymousClass469, JsonDeserializer jsonDeserializer, BeanDeserializerBase beanDeserializerBase, AbstractC63035SbA abstractC63035SbA) {
        Object A09 = abstractC63035SbA.A09(anonymousClass469, jsonDeserializer.A0D(c16l, anonymousClass469));
        C60581R8w[] c60581R8wArr = beanDeserializerBase.A0G;
        if (c60581R8wArr != null && 0 < c60581R8wArr.length) {
            anonymousClass469.A0g(c60581R8wArr[0].A00);
            throw C00O.createAndThrow();
        }
        return A09;
    }

    public Object A04(AnonymousClass469 anonymousClass469) {
        anonymousClass469.A0Y(this, A03(), "no default no-arguments constructor found", AbstractC58318PtA.A1b());
        throw C00O.createAndThrow();
    }

    public Object A05(AnonymousClass469 anonymousClass469, double d) {
        anonymousClass469.A0Y(this, A03(), "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d));
        throw C00O.createAndThrow();
    }

    public Object A06(AnonymousClass469 anonymousClass469, int i) {
        anonymousClass469.A0Y(this, A03(), "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", AbstractC25228BEl.A1Y(i));
        throw C00O.createAndThrow();
    }

    public Object A07(AnonymousClass469 anonymousClass469, long j) {
        anonymousClass469.A0Y(this, A03(), "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", AbstractC58319PtB.A1Y(j));
        throw C00O.createAndThrow();
    }

    public Object A0A(AnonymousClass469 anonymousClass469, String str) {
        anonymousClass469.A0Y(this, A03(), "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
        throw C00O.createAndThrow();
    }

    public Object A0B(AnonymousClass469 anonymousClass469, BigDecimal bigDecimal) {
        anonymousClass469.A0Y(this, A03(), "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)", bigDecimal);
        throw C00O.createAndThrow();
    }

    public Object A0C(AnonymousClass469 anonymousClass469, BigInteger bigInteger) {
        anonymousClass469.A0Y(this, A03(), "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)", bigInteger);
        throw C00O.createAndThrow();
    }

    public Object A0D(AnonymousClass469 anonymousClass469, boolean z) {
        anonymousClass469.A0Y(this, A03(), "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z));
        throw C00O.createAndThrow();
    }

    public Object A0E(AnonymousClass469 anonymousClass469, Object[] objArr) {
        anonymousClass469.A0Y(this, A03(), "no creator with arguments specified", AbstractC58318PtA.A1b());
        throw C00O.createAndThrow();
    }
}
