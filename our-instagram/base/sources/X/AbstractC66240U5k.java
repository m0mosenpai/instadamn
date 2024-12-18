package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.U5k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66240U5k {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A00;
        C102884kP A0P = AbstractC65702TsY.A0P(c6fw, 3);
        InterfaceC103384lE A09 = A0P.A09();
        String A0E = A0P.A0E();
        if (A09 != null) {
            Object A002 = C131845xK.A00(c6fq, C6FW.A01, A09);
            if (A002 == null) {
                AbstractC25241Le.A02("BloksInterpreter", "Evaluation of BKBloksDataQplMarkerPointParamsConstants.TIMESTAMP returned null");
            } else if (A002 instanceof Number) {
                long longValue = ((Number) A002).longValue();
                if (longValue > 0) {
                    C006802i.A0p.markerPoint(A0D, A0D2, str, A0E, longValue, TimeUnit.MILLISECONDS);
                    return null;
                }
            }
            return null;
        }
        C006802i c006802i = C006802i.A0p;
        if (A0E != null) {
            c006802i.markerPoint(A0D, str, A0E);
            return null;
        }
        c006802i.markerPoint(A0D, A0D2, str);
        return null;
    }
}
