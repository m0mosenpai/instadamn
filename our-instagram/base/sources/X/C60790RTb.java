package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.RTb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60790RTb extends AbstractC60791RTc {
    public static final java.util.Set A06;
    public final AbstractC61590RqE A00;
    public final SY7 A01;
    public final SYB A02;
    public final SY4 A03;
    public final SY5 A04;
    public final C58526Pwu A05;

    public final boolean equals(Object o) {
        if (!(o instanceof C60790RTb)) {
            return false;
        }
        C60790RTb c60790RTb = (C60790RTb) o;
        if (!C2I7.A00(c60790RTb.A01, this.A01) || !C2I7.A00(c60790RTb.A02, this.A02) || !C2I7.A00(c60790RTb.A03, this.A03) || !C2I7.A00(c60790RTb.A00, this.A00) || !C2I7.A00(c60790RTb.A04, this.A04) || !C2I7.A00(c60790RTb.A05, this.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C60790RTb.class, this.A01, this.A02, this.A03, this.A00, this.A04, this.A05});
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.A01, this.A02, this.A03, this.A00, this.A04, this.A05);
    }

    static {
        try {
            HashSet A1H = AbstractC166987dD.A1H();
            SXz sXz = SXz.A02;
            A1H.add(new C58529Pwx(sXz, 16));
            A1H.add(new C58529Pwx(sXz, 32));
            C62930SXx c62930SXx = C62930SXx.A02;
            SYA sya = SYA.A03;
            A1H.add(SSR.A00(sya, c62930SXx));
            A1H.add(SSR.A01(sya, c62930SXx, 32, 32, 16, 32));
            A1H.add(new RTL(SY2.A02));
            A1H.add(new C58556PxX(SY3.A02, 64));
            A06 = Collections.unmodifiableSet(A1H);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public C60790RTb(AbstractC61590RqE curveType, SY7 hashType, SYB pointFormat, SY4 demParameters, SY5 variant, C58526Pwu salt) {
        this.A01 = hashType;
        this.A02 = pointFormat;
        this.A03 = demParameters;
        this.A00 = curveType;
        this.A04 = variant;
        this.A05 = salt;
    }
}
