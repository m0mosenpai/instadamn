package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes10.dex */
public final class T3M implements InterfaceC65509Tle {
    @Override // X.InterfaceC65509Tle
    public final InterfaceC65512Tlh EFp(SparseArray sparseArray, C62731SNv c62731SNv) {
        boolean A1R = AbstractC167007dF.A1R(0, sparseArray, c62731SNv);
        C2n2 c2n2 = S84.A00;
        Object A0c = AbstractC58318PtA.A0c(sparseArray, 12);
        try {
            C64041SyD c64041SyD = (C64041SyD) AbstractC50523MSb.A0R("create", SRB.class);
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, A0c, "mailing_address_id");
            AbstractC58323PtF.A1H(A0T, "FBPAY_HUB", "payment_type");
            AbstractC31173DnH.A1M(A0T, c64041SyD.A00.A00, "data");
            c64041SyD.A01 = A1R;
            return C60622REh.A01(c62731SNv, C58443PvM.A00(), c64041SyD.build(), c2n2, 21);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (X.AbstractC166987dD.A1a(r17.get(3)) == false) goto L30;
     */
    @Override // X.InterfaceC65509Tle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC65512Tlh ENp(android.util.SparseArray r17, X.C62731SNv r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T3M.ENp(android.util.SparseArray, X.SNv):X.Tlh");
    }
}
