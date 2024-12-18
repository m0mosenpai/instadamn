package X;

import org.json.JSONObject;

/* renamed from: X.1Af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23001Af implements C0LR {
    public static final C23001Af A00 = new Object();

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A1G;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        C10850hu c10850hu = C0LK.A8U;
        JSONObject jSONObject = new JSONObject();
        try {
            Class[] A01 = C27171Tr.A04.A01();
            long[] A002 = C1TB.A00(A01);
            int i = 0;
            do {
                Class cls = A01[i];
                if (cls != null && A002[i] <= 500000) {
                    jSONObject.put(cls.getName(), A002[i]);
                }
                i++;
            } while (i < 133);
        } catch (Throwable unused) {
        }
        c024209q.A03(c10850hu, jSONObject.toString());
    }
}
