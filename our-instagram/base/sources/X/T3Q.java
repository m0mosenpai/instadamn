package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class T3Q implements InterfaceC65509Tle {
    public final C64202T3r A00;
    public final C40701ud A01;
    public final String A02;

    public static String A02(String str) {
        int parseInt = Integer.parseInt(str.substring(2, 4));
        int i = Calendar.getInstance().get(1);
        int i2 = ((i / 100) * 100) + parseInt;
        if (i2 < i) {
            i2 += 100;
        }
        return String.valueOf(i2);
    }

    @Override // X.InterfaceC65509Tle
    public final InterfaceC65512Tlh EFp(SparseArray sparseArray, C62731SNv c62731SNv) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, this.A02, "payment_type");
        C0CA.A00(A0T, AbstractC166997dE.A0n(), "client_mutation_id");
        C0CA.A00(A0T, A01(sparseArray, 12), "credit_card_id");
        return C60622REh.A00(c62731SNv, this.A01, new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGFBPayDisableCreditCard", A0b.getParamsCopy(), A0b2.getParamsCopy(), R16.class, true, null, 40, "input", "disable_credit_card", AbstractC166987dD.A1E()), S9X.A01);
    }

    public static C1ON A00(String str, String str2, String str3) {
        C1Ee c1Ee = new C1Ee();
        if (str != null) {
            c1Ee.A05("creditCardNumber", str);
        }
        c1Ee.A05("csc", str2);
        if (str3 != null) {
            c1Ee.A05("payment_dev_cycle", str3);
        }
        return AnonymousClass963.A01(AbstractC24481Hr.A06.A00(new CallableC58499PwS(c1Ee, 7), 658, 2, false, false).A02(new C26561Ql(null), 747, 2, true, false).A01(new TG2(1), 748, 2), "FetchPaymentToken", "https://secure.facebook.com/payments/generate_token");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.SEA, java.lang.Object] */
    @Override // X.InterfaceC65509Tle
    public final InterfaceC65512Tlh ENp(SparseArray sparseArray, C62731SNv c62731SNv) {
        boolean A1W = AbstractC167007dF.A1W(sparseArray.get(12));
        C58444PvN c58444PvN = new C58444PvN();
        if (!A1W) {
            String substring = AbstractC58318PtA.A0c(sparseArray, 14).toString().substring(0, 2);
            String A02 = A02(AbstractC58318PtA.A0c(sparseArray, 14).toString());
            String A01 = A01(sparseArray, 15);
            String A012 = A01(sparseArray, 13);
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("expiry_month", substring);
            A1G.put("expiry_year", A02);
            String packageName = C2FP.A08().A00.getPackageName();
            C14360o3.A07(packageName);
            A1G.put("app_id", packageName);
            A1G.put(AbstractC58358Pty.A01(0, 9, 68), C2FP.A0C().A01());
            A1G.put("credit_card", A012);
            A1G.put("csc", A01);
            HashSet A1H = AbstractC166987dD.A1H();
            A1H.add("credit_card");
            A1H.add("csc");
            C63346Si2 A013 = C63174SeZ.A01();
            ?? obj = new Object();
            obj.A00 = A1G;
            obj.A01 = A1H;
            SXG A00 = SXG.A0A.A00(A013, obj, "ADD_CARD", AbstractC166987dD.A1G(), null);
            C60623REi A03 = AbstractC63245Sfz.A03(C2FP.A04(), C2FP.A06(), A00);
            AbstractC63144Sdq.A02(A03);
            C63406Sjd.A0B(((AbstractC63144Sdq) A03).A03, new C63618SqQ(sparseArray, c58444PvN, this, A012, 1));
            return c58444PvN;
        }
        C1ON A002 = A00(null, (String) AbstractC58318PtA.A0c(sparseArray, 15), null);
        A002.A00 = new Tx4(7, sparseArray, c58444PvN, this);
        C1GJ.A03(A002);
        return c58444PvN;
    }

    public T3Q(UserSession userSession, String str) {
        this.A02 = str;
        this.A00 = new C64202T3r(userSession);
        this.A01 = AbstractC40691uc.A01(userSession);
    }

    public static String A01(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj != null) {
            String obj2 = obj.toString();
            if (!obj2.equals("null")) {
                return obj2;
            }
            return "";
        }
        return "";
    }
}
