package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class FP5 {
    public final Context A00;

    public final String A00() {
        C18720vz c18720vz = AbstractC12960li.A00;
        String string = AbstractC31172DnG.A0q(c18720vz).getString("google_ad_id", null);
        if (string == null) {
            C62910SWr A00 = C62910SWr.A00(this.A00);
            if (A00 == null) {
                return null;
            }
            String str = A00.A01;
            if (str == null) {
                return str;
            }
            AbstractC31176DnK.A1X(AbstractC31172DnG.A0q(c18720vz), "google_ad_id", str);
            return str;
        }
        return string;
    }

    public FP5(Context context) {
        this.A00 = context;
    }
}
