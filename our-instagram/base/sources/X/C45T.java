package X;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;
import java.util.Collections;

/* renamed from: X.45T, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C45T implements C45F, Serializable {
    public final long A00;
    public final AnonymousClass451 A01;
    public static final C45H A03 = C45H.A04;
    public static final C45U A02 = C45U.A07;

    /* JADX WARN: Multi-variable type inference failed */
    public final C45M A03(AnonymousClass454 anonymousClass454, Class cls) {
        C45L c45l;
        JsonAutoDetect jsonAutoDetect;
        C45S c45s = (C45S) this;
        if (C914045z.A0J(cls)) {
            c45l = C45L.A05;
        } else {
            C45M c45m = c45s.A01.A02;
            long j = ((C45T) c45s).A00;
            long j2 = C45S.A07;
            c45l = c45m;
            if ((j & j2) != j2) {
                C45M c45m2 = c45m;
                if (!c45s.A08(C45Y.A0B)) {
                    C45N c45n = C45N.NONE;
                    C45L c45l2 = (C45L) c45m;
                    C45N c45n2 = c45l2.A01;
                    c45m2 = c45l2;
                    if (c45n2 != c45n) {
                        c45m2 = new C45L(c45l2.A02, c45l2.A03, c45l2.A04, c45l2.A00, c45n);
                    }
                }
                C45M c45m3 = c45m2;
                if (!c45s.A08(C45Y.A0C)) {
                    C45N c45n3 = C45N.NONE;
                    C45L c45l3 = (C45L) c45m2;
                    C45N c45n4 = c45l3.A02;
                    c45m3 = c45l3;
                    if (c45n4 != c45n3) {
                        c45m3 = new C45L(c45n3, c45l3.A03, c45l3.A04, c45l3.A00, c45l3.A01);
                    }
                }
                C45M c45m4 = c45m3;
                if (!c45s.A08(C45Y.A0D)) {
                    C45N c45n5 = C45N.NONE;
                    C45L c45l4 = (C45L) c45m3;
                    C45N c45n6 = c45l4.A03;
                    c45m4 = c45l4;
                    if (c45n6 != c45n5) {
                        c45m4 = new C45L(c45l4.A02, c45n5, c45l4.A04, c45l4.A00, c45l4.A01);
                    }
                }
                C45M c45m5 = c45m4;
                if (!c45s.A08(C45Y.A0E)) {
                    C45N c45n7 = C45N.NONE;
                    C45L c45l5 = (C45L) c45m4;
                    C45N c45n8 = c45l5.A04;
                    c45m5 = c45l5;
                    if (c45n8 != c45n7) {
                        c45m5 = new C45L(c45l5.A02, c45l5.A03, c45n7, c45l5.A00, c45l5.A01);
                    }
                }
                c45l = c45m5;
                if (!c45s.A08(C45Y.A0A)) {
                    C45N c45n9 = C45N.NONE;
                    C45L c45l6 = (C45L) c45m5;
                    C45N c45n10 = c45l6.A00;
                    c45l = c45l6;
                    if (c45n10 != c45n9) {
                        c45l = new C45L(c45l6.A02, c45l6.A03, c45l6.A04, c45n9, c45l6.A01);
                    }
                }
            }
        }
        C44W A00 = c45s.A00();
        if (A00 != null && (A00 instanceof C44V) && (jsonAutoDetect = (JsonAutoDetect) anonymousClass454.A06(JsonAutoDetect.class)) != null) {
            c45l = c45l;
            C45N c45n11 = c45l.A02;
            C45N c45n12 = jsonAutoDetect.getterVisibility();
            C45N c45n13 = C45N.DEFAULT;
            if (c45n12 == c45n13) {
                c45n12 = c45n11;
            }
            C45N c45n14 = c45l.A03;
            C45N isGetterVisibility = jsonAutoDetect.isGetterVisibility();
            if (isGetterVisibility == c45n13) {
                isGetterVisibility = c45n14;
            }
            C45N c45n15 = c45l.A04;
            C45N c45n16 = jsonAutoDetect.setterVisibility();
            if (c45n16 == c45n13) {
                c45n16 = c45n15;
            }
            C45N c45n17 = c45l.A00;
            C45N creatorVisibility = jsonAutoDetect.creatorVisibility();
            if (creatorVisibility == c45n13) {
                creatorVisibility = c45n17;
            }
            C45N c45n18 = c45l.A01;
            C45N fieldVisibility = jsonAutoDetect.fieldVisibility();
            if (fieldVisibility == c45n13) {
                fieldVisibility = c45n18;
            }
            if (c45n12 != c45n11 || isGetterVisibility != c45n14 || c45n16 != c45n15 || creatorVisibility != c45n17 || fieldVisibility != c45n18) {
                return new C45L(c45n12, isGetterVisibility, c45n16, creatorVisibility, fieldVisibility);
            }
        }
        return c45l;
    }

    public final C44W A00() {
        if ((this.A00 & C45Y.A0R.A00) != 0) {
            return this.A01.A01;
        }
        return C60580R8v.A00;
    }

    public final C45B A02(Class cls) {
        return A01(this.A01.A07.A09(cls));
    }

    public final void A04() {
        C45X c45x = C45S.A08;
    }

    public final boolean A05() {
        if ((this.A00 & C45Y.A0G.A00) == 0) {
            return false;
        }
        return true;
    }

    public final boolean A06() {
        if ((this.A00 & C45Y.A0R.A00) == 0) {
            return false;
        }
        return true;
    }

    public final boolean A07() {
        return A08(C45Y.A0M);
    }

    public final boolean A08(C45Y c45y) {
        if ((this.A00 & c45y.A00) == 0) {
            return false;
        }
        return true;
    }

    public C45T(AnonymousClass451 anonymousClass451, C45T c45t) {
        this.A01 = anonymousClass451;
        this.A00 = c45t.A00;
    }

    public final C45B A01(AbstractC910944l abstractC910944l) {
        C45B A00 = AnonymousClass452.A00(abstractC910944l, this);
        if (A00 == null) {
            return new C45B(abstractC910944l, this, C63390Sj8.A00(abstractC910944l, this, this), Collections.emptyList());
        }
        return A00;
    }

    public C45T(C45T c45t, long j) {
        this.A01 = c45t.A01;
        this.A00 = j;
    }

    public C45T(AnonymousClass451 anonymousClass451, long j) {
        this.A01 = anonymousClass451;
        this.A00 = j;
    }
}
