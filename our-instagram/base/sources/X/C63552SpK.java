package X;

import android.os.Bundle;

/* renamed from: X.SpK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63552SpK implements C1N8 {
    public final /* synthetic */ SJJ A00;
    public final /* synthetic */ Q8g A01;
    public final /* synthetic */ SE2 A02;
    public final /* synthetic */ C63345Si1 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C63552SpK(SJJ sjj, Q8g q8g, SE2 se2, C63345Si1 c63345Si1, String str, boolean z) {
        this.A01 = q8g;
        this.A03 = c63345Si1;
        this.A05 = z;
        this.A00 = sjj;
        this.A02 = se2;
        this.A04 = str;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        SGB A05;
        Bundle bundle;
        Bundle bundle2;
        String str2 = (String) obj;
        Q8g q8g = this.A01;
        MSX.A1B(q8g.A04, true);
        C63345Si1 c63345Si1 = this.A03;
        SGB A052 = c63345Si1.A05("THREE_DS");
        if (A052 != null && (bundle2 = A052.A00) != null) {
            str = bundle2.getString("3ds_token_token");
        } else {
            str = null;
        }
        if (this.A05 && (A05 = c63345Si1.A05("CSC")) != null && (bundle = A05.A00) != null) {
            String string = bundle.getString("AUTH_FLOW_UTIL_CVV_CREDENTIAL_ENTERED");
            bundle.remove("AUTH_FLOW_UTIL_CVV_CREDENTIAL_ENTERED");
            if (string != null) {
                if (C18U.A06(C06090Tz.A05, AbstractC58318PtA.A0T(), 36314489657232029L)) {
                    Q8g.A00(this.A00, q8g);
                    SE2 se2 = this.A02;
                    C62738SOe c62738SOe = q8g.A01;
                    if (c62738SOe == null) {
                        C14360o3.A0F("authFactorRequirement");
                        throw C00O.createAndThrow();
                    }
                    se2.A00 = new REX(c62738SOe);
                    se2.A01.putBoolean("REUSE_ATS_IN_AUTH_PROMPT_OBJ_SCOPED", true);
                }
                SE2 se22 = this.A02;
                SJJ sjj = this.A00;
                C58252li A04 = c63345Si1.A04(se22, AbstractC62192S1n.A00(sjj, string), "CREATE_CONTAINER");
                C14360o3.A0A(A04);
                return C75M.A02(A04, new C50366MLs(sjj, q8g, this.A04, str, str2, 0));
            }
        }
        C62991SaF c62991SaF = C2FP.A01().A0E;
        SJJ sjj2 = this.A00;
        C14360o3.A0A(str2);
        return c62991SaF.A02(q8g.A0A.A04(null, true), sjj2, str2, this.A04, str);
    }
}
