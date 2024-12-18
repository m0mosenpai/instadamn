package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.RBb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C60586RBb extends RBd implements Serializable {
    public final Object A09(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R c16r;
        Object[] objArr;
        String str;
        String A1P;
        Object A0X;
        String valueOf;
        if (c16l.A0b() && (A0X = c16l.A0X()) != null) {
            if (A0X instanceof String) {
                valueOf = (String) A0X;
            } else {
                valueOf = String.valueOf(A0X);
            }
            return A08(anonymousClass469, valueOf).A0D(c16l, anonymousClass469);
        }
        boolean A16 = c16l.A16();
        if (!A16) {
            if (this.A03 != null) {
                AbstractC64178T2h abstractC64178T2h = (AbstractC64178T2h) this.A04;
                A1P = abstractC64178T2h.CN7(abstractC64178T2h.A00.A00, null);
            } else {
                anonymousClass469.A0U(C16R.A0C, AbstractC58319PtB.A0t(this.A02.A00, "need JSON Array to contain As.WRAPPER_ARRAY type information for class "), new Object[0]);
                throw C00O.createAndThrow();
            }
        } else {
            C16R A1J = c16l.A1J();
            c16r = C16R.A0J;
            if (A1J == c16r) {
                A1P = c16l.A1P();
                c16l.A1J();
            } else {
                objArr = new Object[]{this.A02.A00.getName()};
                str = "need JSON String that contains type id (for subtype of %s)";
                anonymousClass469.A0U(c16r, str, objArr);
                throw C00O.createAndThrow();
            }
        }
        JsonDeserializer A08 = A08(anonymousClass469, A1P);
        if (this.A07 && !(this instanceof RBY)) {
            c16l = RBd.A00(c16l, C16R.A0D, anonymousClass469, this, A1P);
        }
        if (A16 && c16l.A10() == C16R.A08) {
            return A08.BXX(anonymousClass469);
        }
        Object A0D = A08.A0D(c16l, anonymousClass469);
        if (A16) {
            C16R A1J2 = c16l.A1J();
            c16r = C16R.A08;
            if (A1J2 != c16r) {
                objArr = new Object[0];
                str = "expected closing END_ARRAY after type information and deserialized value";
                anonymousClass469.A0U(c16r, str, objArr);
                throw C00O.createAndThrow();
            }
        }
        return A0D;
    }
}
