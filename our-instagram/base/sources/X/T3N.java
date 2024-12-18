package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes10.dex */
public final class T3N implements InterfaceC65509Tle {
    @Override // X.InterfaceC65509Tle
    public final InterfaceC65512Tlh EFp(SparseArray sparseArray, C62731SNv c62731SNv) {
        boolean A1R = AbstractC167007dF.A1R(0, sparseArray, c62731SNv);
        C2n2 c2n2 = S84.A00;
        Object A0c = AbstractC58318PtA.A0c(sparseArray, 12);
        try {
            C64043SyF c64043SyF = (C64043SyF) AbstractC50523MSb.A0R("create", SRD.class);
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            Object A0c2 = AbstractC58318PtA.A0c(sparseArray, 22);
            C0CA A02 = c04060Jx.A02();
            AbstractC58323PtF.A1H(A02, A0c2, "logging_id");
            C0CA.A00(A02, A0c, "email_id");
            C0CA.A00(A02, "FBPAY_HUB", "payment_type");
            AbstractC31173DnH.A1M(A02, c64043SyF.A00.A00, "data");
            c64043SyF.A01 = A1R;
            return C60622REh.A01(c62731SNv, C58443PvM.A00(), c64043SyF.build(), c2n2, 24);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }

    @Override // X.InterfaceC65509Tle
    public final InterfaceC65512Tlh ENp(SparseArray sparseArray, C62731SNv c62731SNv) {
        PandoGraphQLRequest build;
        FBPayIGGraphQLQueryExecutor A00;
        int i;
        boolean A1R = AbstractC167007dF.A1R(0, sparseArray, c62731SNv);
        Object obj = sparseArray.get(12);
        C2n2 c2n2 = S84.A00;
        boolean z = true;
        Object A0c = AbstractC58318PtA.A0c(sparseArray, A1R ? 1 : 0);
        if (obj == null) {
            if (sparseArray.get(3) == null || !AbstractC166987dD.A1a(sparseArray.get(3))) {
                z = false;
            }
            try {
                C64036Sy8 c64036Sy8 = (C64036Sy8) AbstractC50523MSb.A0R("create", SR3.class);
                C04060Jx c04060Jx = GraphQlCallInput.A02;
                i = 22;
                Object A0c2 = AbstractC58318PtA.A0c(sparseArray, 22);
                C0CA A02 = c04060Jx.A02();
                AbstractC58323PtF.A1H(A02, A0c2, "logging_id");
                AbstractC58322PtE.A1J(A02, z);
                C0CA.A00(A02, "FBPAY_HUB", "payment_type");
                C0CA.A00(A02, A0c, "user_input_email_address");
                AbstractC31173DnH.A1M(A02, c64036Sy8.A00.A00, "data");
                c64036Sy8.A01 = A1R;
                build = c64036Sy8.build();
                A00 = C58443PvM.A00();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw AbstractC58318PtA.A0f(e);
            }
        } else {
            Object A0c3 = AbstractC58318PtA.A0c(sparseArray, 12);
            if (sparseArray.get(3) == null || !AbstractC166987dD.A1a(sparseArray.get(3))) {
                z = false;
            }
            try {
                C64051SyN c64051SyN = (C64051SyN) AbstractC50523MSb.A0R("create", SRM.class);
                C04060Jx c04060Jx2 = GraphQlCallInput.A02;
                Object A0c4 = AbstractC58318PtA.A0c(sparseArray, 22);
                C0CA A022 = c04060Jx2.A02();
                AbstractC58323PtF.A1H(A022, A0c4, "logging_id");
                C0CA.A00(A022, A0c3, "email_id");
                AbstractC58322PtE.A1J(A022, z);
                C0CA.A00(A022, "FBPAY_HUB", "payment_type");
                C0CA.A00(A022, A0c, "user_input_email_address");
                AbstractC31173DnH.A1M(A022, c64051SyN.A00.A00, "data");
                c64051SyN.A01 = A1R;
                build = c64051SyN.build();
                A00 = C58443PvM.A00();
                i = 23;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw AbstractC58318PtA.A0f(e2);
            }
        }
        return C60622REh.A01(c62731SNv, A00, build, c2n2, i);
    }
}
