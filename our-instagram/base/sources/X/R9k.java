package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class R9k extends RBV {
    public RBV A00;
    public boolean A01;
    public final int A02;
    public final TIB A03;
    public final RBI A04;

    public static final void A00(R9k r9k) {
        String A08;
        if (r9k.A00 == null) {
            String str = r9k.A06.A02;
            Iterator it = C914045z.A00;
            if (str == null) {
                A08 = "[null]";
            } else {
                A08 = C914045z.A08(str);
            }
            throw new R9A((C16L) null, ((RBV) r9k).A04, AnonymousClass001.A0R("No fallback setter/field defined for creator property ", A08));
        }
    }

    public R9k(C913945y c913945y, R9k r9k) {
        super(c913945y, r9k);
        this.A04 = r9k.A04;
        this.A03 = r9k.A03;
        this.A00 = r9k.A00;
        this.A02 = r9k.A02;
        this.A01 = r9k.A01;
    }

    @Override // X.RBV
    public final String toString() {
        String A08;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[creator property, name ");
        String str = this.A06.A02;
        Iterator it = C914045z.A00;
        if (str == null) {
            A08 = "[null]";
        } else {
            A08 = C914045z.A08(str);
        }
        A1C.append(A08);
        A1C.append("; inject id '");
        A1C.append(A0B());
        return AbstractC166997dE.A0x("']", A1C);
    }

    public R9k(JsonDeserializer jsonDeserializer, R9k r9k, InterfaceC102444jN interfaceC102444jN) {
        super(jsonDeserializer, interfaceC102444jN, r9k);
        this.A04 = r9k.A04;
        this.A03 = r9k.A03;
        this.A00 = r9k.A00;
        this.A02 = r9k.A02;
        this.A01 = r9k.A01;
    }

    public R9k(TIB tib, AbstractC910944l abstractC910944l, TIH tih, C913945y c913945y, RBI rbi, AbstractC63020Sal abstractC63020Sal, C45A c45a, int i) {
        super(abstractC910944l, tih, c913945y, abstractC63020Sal, c45a);
        this.A04 = rbi;
        this.A02 = i;
        this.A03 = tib;
        this.A00 = null;
    }
}
