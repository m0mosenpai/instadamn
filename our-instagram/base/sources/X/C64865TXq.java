package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.TXq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64865TXq extends RuntimeException {
    public final int A00;
    public final boolean A01;

    public static C64865TXq A00(String str, Throwable e) {
        boolean z = false;
        int i = Integer.MAX_VALUE;
        try {
            str.getClass();
            JSONObject A17 = AbstractC58318PtA.A17(str);
            A17.optInt("num_current_attempts", 0);
            i = A17.optInt("num_remaining_attempts", Integer.MAX_VALUE);
            z = A17.optBoolean("auth_factor_expired", false);
        } catch (NullPointerException | JSONException e2) {
            e = e2;
        }
        return new C64865TXq(e, i, z);
    }

    public C64865TXq(Throwable th, int i, boolean z) {
        super(th);
        this.A00 = i;
        this.A01 = z;
    }
}
