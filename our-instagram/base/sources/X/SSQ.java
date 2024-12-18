package X;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes10.dex */
public abstract class SSQ {
    public static byte[] A01(AbstractC61590RqE parameters) {
        T91 t91;
        if (parameters instanceof RTA) {
            t91 = ((RTA) parameters).A00;
        } else {
            t91 = (T91) C58550PxN.A01.A08(parameters);
        }
        return t91.A00.A0E();
    }

    public static AbstractC61590RqE A00(byte[] serializedParameters) {
        try {
            RVD rvd = (RVD) AbstractC58533Px1.A06(C58534Px2.A00(), RVD.DEFAULT_INSTANCE, serializedParameters);
            C58550PxN c58550PxN = C58550PxN.A01;
            T91 A00 = T91.A00(rvd);
            C62586SHl c62586SHl = (C62586SHl) c58550PxN.A00.get();
            if (!c62586SHl.A02.containsKey(new C58528Pww(A00.A01, A00.getClass()))) {
                return new RTA(A00);
            }
            return c58550PxN.A06(A00);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
