package X;

import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class SLX {
    public String A00;
    public String A01;
    public String A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Rpm, java.lang.Object] */
    public final C61564Rpm A00() {
        if (!TextUtils.isEmpty(this.A02) && !TextUtils.isEmpty(this.A01) && !TextUtils.isEmpty(this.A00)) {
            ?? obj = new Object();
            obj.A02 = this.A02;
            obj.A01 = this.A01;
            obj.A00 = this.A00;
            return obj;
        }
        throw AbstractC166987dD.A12("The title, subtitle and action button text of auth dialog screen should NOT be empty.");
    }
}
