package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.session.UserSession;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes10.dex */
public final class T3P implements InterfaceC65509Tle {
    public final UserSession A00;

    @Override // X.InterfaceC65509Tle
    public final InterfaceC65512Tlh EFp(SparseArray sparseArray, C62731SNv c62731SNv) {
        String str = this.A00.userId;
        Object obj = sparseArray.get(22);
        C2n2 c2n2 = S84.A00;
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, AbstractC58318PtA.A0c(sparseArray, 12), "phone_id");
        AbstractC58323PtF.A1H(A0T, "FBPAY_HUB", "payment_type");
        if (str != null) {
            C0CA.A00(A0T, str, "actor_id");
        }
        if (obj != null) {
            C0CA.A00(A0T, obj, "logging_id");
        }
        try {
            C64044SyG c64044SyG = (C64044SyG) AbstractC25234BEr.A0d(SRE.class);
            AbstractC31173DnH.A1M(A0T, c64044SyG.A00.A00, "data");
            c64044SyG.A01 = true;
            return C60622REh.A01(c62731SNv, C58443PvM.A00(), c64044SyG.build(), c2n2, 27);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (X.AbstractC166987dD.A1a(r9.get(3)) == false) goto L8;
     */
    @Override // X.InterfaceC65509Tle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC65512Tlh ENp(android.util.SparseArray r9, X.C62731SNv r10) {
        /*
            r8 = this;
            r3 = 12
            java.lang.Object r1 = r9.get(r3)
            com.instagram.common.session.UserSession r0 = r8.A00
            java.lang.String r5 = r0.userId
            r0 = 22
            java.lang.Object r2 = r9.get(r0)
            X.2n2 r4 = X.S84.A00
            if (r1 != 0) goto L73
            r3 = 3
            java.lang.Object r0 = r9.get(r3)
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r9.get(r3)
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            r6 = 1
            if (r0 != 0) goto L28
        L27:
            r6 = 0
        L28:
            java.lang.Object r3 = X.AbstractC58318PtA.A0c(r9, r1)
            X.0Jx r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "raw_phone_number"
            X.0CA r3 = X.AbstractC25227BEk.A0T(r1, r3, r0)
            X.AbstractC58322PtE.A1J(r3, r6)
            java.lang.String r1 = "FBPAY_HUB"
            java.lang.String r0 = "payment_type"
            X.AbstractC58323PtF.A1H(r3, r1, r0)
            if (r5 == 0) goto L45
            java.lang.String r0 = "actor_id"
            X.C0CA.A00(r3, r5, r0)
        L45:
            if (r2 == 0) goto L4c
            java.lang.String r0 = "logging_id"
            X.C0CA.A00(r3, r2, r0)
        L4c:
            java.lang.Class<X.SR4> r1 = X.SR4.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.AbstractC50523MSb.A0R(r0, r1)     // Catch: java.lang.Throwable -> L6d
            X.Sy9 r2 = (X.C64037Sy9) r2     // Catch: java.lang.Throwable -> L6d
            X.2JM r0 = r2.A00
            java.lang.String r1 = "data"
            X.2JO r0 = r0.A00
            X.AbstractC31173DnH.A1M(r3, r0, r1)
            r0 = 1
            r2.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r2 = r2.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C58443PvM.A00()
            r0 = 25
            goto Ld1
        L6d:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AbstractC58318PtA.A0f(r0)
            throw r0
        L73:
            java.lang.Object r3 = X.AbstractC58318PtA.A0c(r9, r3)
            r7 = 0
            java.lang.Object r6 = X.AbstractC58318PtA.A0c(r9, r7)
            r1 = 3
            java.lang.Object r0 = r9.get(r1)
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r9.get(r1)
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            if (r0 == 0) goto L8e
            r7 = 1
        L8e:
            X.0Jx r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "phone_id"
            X.0CA r3 = X.AbstractC25227BEk.A0T(r1, r3, r0)
            java.lang.String r0 = "raw_phone_number"
            X.C0CA.A00(r3, r6, r0)
            X.AbstractC58322PtE.A1J(r3, r7)
            java.lang.String r1 = "FBPAY_HUB"
            java.lang.String r0 = "payment_type"
            X.AbstractC58323PtF.A1H(r3, r1, r0)
            if (r5 == 0) goto Lac
            java.lang.String r0 = "actor_id"
            X.C0CA.A00(r3, r5, r0)
        Lac:
            if (r2 == 0) goto Lb3
            java.lang.String r0 = "logging_id"
            X.C0CA.A00(r3, r2, r0)
        Lb3:
            java.lang.Class<X.SRN> r0 = X.SRN.class
            java.lang.Object r2 = X.AbstractC25234BEr.A0d(r0)     // Catch: java.lang.Throwable -> Ld6
            X.SyO r2 = (X.C64052SyO) r2     // Catch: java.lang.Throwable -> Ld6
            X.2JM r0 = r2.A00
            java.lang.String r1 = "data"
            X.2JO r0 = r0.A00
            X.AbstractC31173DnH.A1M(r3, r0, r1)
            r0 = 1
            r2.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r2 = r2.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C58443PvM.A00()
            r0 = 26
        Ld1:
            X.REh r0 = X.C60622REh.A01(r10, r1, r2, r4, r0)
            return r0
        Ld6:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AbstractC58318PtA.A0f(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T3P.ENp(android.util.SparseArray, X.SNv):X.Tlh");
    }

    public T3P(UserSession userSession) {
        this.A00 = userSession;
    }
}
