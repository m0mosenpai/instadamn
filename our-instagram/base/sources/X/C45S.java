package X;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.45S, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C45S extends C45T implements Serializable {
    public static final long A07;
    public static final C45X A08 = C45X.A00;
    public static final long A09;
    public final C913945y A00;
    public final C45G A01;
    public final C912745g A02;
    public final C45C A03;
    public final C45D A04;
    public final Class A05;
    public final C45E A06;

    @Override // X.C45F
    public final Class AVY(Class cls) {
        return null;
    }

    static {
        long j = 0;
        for (C45Y c45y : C45Y.values()) {
            if (c45y.A01) {
                j |= c45y.A00;
            }
        }
        A09 = j;
        A07 = C45Y.A0B.A00 | C45Y.A0C.A00 | C45Y.A0D.A00 | C45Y.A0E.A00 | C45Y.A0A.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C45S A0A(C910844k c910844k) {
        C912845h c912845h;
        AnonymousClass451 anonymousClass451 = super.A01;
        if (anonymousClass451.A07 != c910844k) {
            AnonymousClass453 anonymousClass453 = anonymousClass451.A03;
            C44W c44w = anonymousClass451.A01;
            C64516THj c64516THj = anonymousClass451.A02;
            InterfaceC65505Tla interfaceC65505Tla = anonymousClass451.A06;
            DateFormat dateFormat = anonymousClass451.A08;
            Locale locale = anonymousClass451.A09;
            TimeZone timeZone = anonymousClass451.A0A;
            anonymousClass451 = new AnonymousClass451(anonymousClass451.A00, c44w, c64516THj, anonymousClass453, anonymousClass451.A04, anonymousClass451.A05, interfaceC65505Tla, c910844k, dateFormat, locale, timeZone);
        }
        if (this instanceof C45R) {
            C45R c45r = (C45R) this;
            AnonymousClass451 anonymousClass4512 = ((C45T) c45r).A01;
            c912845h = c45r;
            if (anonymousClass4512 != anonymousClass451) {
                return new C45R(c45r, anonymousClass451);
            }
        } else {
            C912845h c912845h2 = (C912845h) this;
            AnonymousClass451 anonymousClass4513 = ((C45T) c912845h2).A01;
            c912845h = c912845h2;
            if (anonymousClass4513 != anonymousClass451) {
                return new C912845h(c912845h2, anonymousClass451);
            }
        }
        return c912845h;
    }

    public C45S(AnonymousClass451 anonymousClass451, C45S c45s) {
        super(anonymousClass451, c45s);
        this.A06 = c45s.A06;
        this.A03 = c45s.A03;
        this.A04 = c45s.A04;
        this.A00 = c45s.A00;
        this.A05 = c45s.A05;
        this.A02 = c45s.A02;
        this.A01 = c45s.A01;
    }

    public final TII A09(AnonymousClass454 anonymousClass454) {
        TII A05;
        C44W A00 = A00();
        if (A00 == null) {
            A05 = null;
        } else {
            A05 = A00.A05(anonymousClass454);
        }
        TII tii = TII.A05;
        if (A05 == null) {
            return null;
        }
        return A05;
    }

    public C45S(C45S c45s, long j) {
        super(c45s, j);
        this.A06 = c45s.A06;
        this.A03 = c45s.A03;
        this.A04 = c45s.A04;
        this.A00 = c45s.A00;
        this.A05 = c45s.A05;
        this.A02 = c45s.A02;
        this.A01 = c45s.A01;
    }

    public C45S(AnonymousClass451 anonymousClass451, C45G c45g, C45E c45e, C45C c45c, C45D c45d) {
        super(anonymousClass451, A09);
        this.A06 = c45e;
        this.A03 = c45c;
        this.A04 = c45d;
        this.A00 = null;
        this.A05 = null;
        this.A02 = C912745g.A02;
        this.A01 = c45g;
    }
}
