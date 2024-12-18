package X;

import java.io.IOException;

/* renamed from: X.Rrb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61661Rrb {
    public static final C1338462s A00(C6FQ c6fq, C6FW c6fw) {
        C102794kG c102794kG;
        Object A10 = MSW.A10(c6fw, 0);
        AbstractC25225BEi.A1S(A10);
        String str = (String) A10;
        C1LN.A01("ParseEmbedded");
        try {
            C192948ga A00 = C192948ga.A00(C1LZ.A00().A0A.ANL(c6fq, str));
            if (A00 != null && (c102794kG = A00.A00) != null) {
                C1338462s A01 = U72.A01(c6fq, c102794kG.A00, null, false, false);
                C1LN.A00();
                return A01;
            }
            throw AbstractC166987dD.A12("Encountered empty BloksResponse. Could not parse embedded payload");
        } catch (IOException unused) {
            throw AbstractC166987dD.A12("Could not parse embedded payload");
        }
    }
}
