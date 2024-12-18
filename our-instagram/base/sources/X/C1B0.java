package X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.1B0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1B0 extends C1B1 implements C1B2 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C1B0 A05 = new C1B0(true, false, true, false, false);
    public static final C1B0 A08 = new C1B0(true, true, true, false, false);
    public static final C1B0 A09 = new C1B0(true, true, false, false, false);
    public static final C1B0 A0B = new C1B0(false, false, false, false, false);
    public static final C1B0 A06 = new C1B0(true, false, true, true, false);
    public static final C1B0 A0A = new C1B0(true, false, false, false, false);
    public static final C1B0 A07 = new C1B0(true, false, true, true, true);

    @Override // X.C1B1
    public final String A00() {
        return "user_scope";
    }

    public final int hashCode() {
        return Arrays.hashCode(new boolean[]{this.A00, this.A02, this.A01, this.A03, this.A04});
    }

    @Override // X.C1B2
    public final JSONObject EqM() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_user_scoped", this.A02);
        jSONObject.put("is_underlying_account_scoped", this.A01);
        jSONObject.put("keep_data_between_sessions", this.A03);
        jSONObject.put("userid_in_path", this.A00);
        jSONObject.put("keep_data_on_account_removal", this.A04);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1B0)) {
            return false;
        }
        C1B0 c1b0 = (C1B0) obj;
        if (c1b0.A00 != this.A00 || c1b0.A02 != this.A02 || c1b0.A01 != this.A01 || c1b0.A03 != this.A03 || c1b0.A04 != this.A04) {
            return false;
        }
        return true;
    }

    public C1B0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = z3;
        this.A03 = z4;
        this.A04 = z5;
    }
}
