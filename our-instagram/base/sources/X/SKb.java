package X;

import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes10.dex */
public final class SKb {
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C64989TbE.A00);

    public final C60622REh A00(C62731SNv c62731SNv, Be9 be9, String str) {
        AbstractC167017dG.A1O(c62731SNv, str);
        try {
            C64064Sya c64064Sya = (C64064Sya) AbstractC25234BEr.A0d(SR1.class);
            C2JM c2jm = c64064Sya.A00;
            AbstractC58318PtA.A1K(be9, c2jm);
            c64064Sya.A01 = true;
            c2jm.A04("payment_product_id", str);
            c64064Sya.A02 = true;
            return C60622REh.A00(c62731SNv, (FBPayIGGraphQLQueryExecutor) this.A00.getValue(), c64064Sya.A00(), T7Y.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }
}
