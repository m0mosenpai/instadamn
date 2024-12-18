package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Nq6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53754Nq6 {
    public static final C70125W5g A00(WDI wdi, C47Z c47z) {
        AbstractC1125056d A09 = c47z.A09();
        EnumC68130VCo enumC68130VCo = EnumC68130VCo.A02;
        if (A09 instanceof NRI) {
            EnumC68130VCo enumC68130VCo2 = EnumC68130VCo.A04;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            NRI nri = (NRI) A09;
            return new C70125W5g(wdi, enumC68130VCo2, timeUnit.toMicros(nri.A01), timeUnit.toMicros(nri.A00), false, true);
        }
        return new C70125W5g(wdi, enumC68130VCo, -1L, 2500000L, false, false);
    }
}
