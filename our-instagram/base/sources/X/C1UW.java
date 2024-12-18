package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.1UW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1UW extends C1B1 implements C1B2 {
    public final C1B1 A00;
    public final String A01;

    @Override // X.C1B1
    public final String A00() {
        return this.A00.A00();
    }

    public JSONObject EqM() {
        JSONObject EqM = ((C1B2) this.A00).EqM();
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            EqM.put("feature_name", str);
        }
        return EqM;
    }

    public C1UW(C1B1 c1b1, String str) {
        this.A01 = str;
        this.A00 = c1b1;
    }
}
