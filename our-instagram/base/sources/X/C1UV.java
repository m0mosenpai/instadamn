package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import org.json.JSONObject;

/* renamed from: X.1UV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1UV extends C1UW {
    public final long A00;
    public final C23131As A01;

    public C1UV(C23131As c23131As, C1B0 c1b0, String str, long j) {
        super(c1b0, str);
        this.A01 = c23131As;
        this.A00 = j;
    }

    @Override // X.C1UW, X.C1B2
    public final JSONObject EqM() {
        JSONObject EqM = super.EqM();
        C23131As c23131As = this.A01;
        String str = "__invalid__";
        String str2 = "__invalid__";
        String str3 = c23131As.A01;
        if (str3 != null) {
            str2 = str3;
        }
        EqM.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        String str4 = c23131As.A00;
        if (str4 != null) {
            str = str4;
        }
        EqM.put("owner_user_id", str);
        EqM.put("last_access_time", this.A00);
        return EqM;
    }
}
