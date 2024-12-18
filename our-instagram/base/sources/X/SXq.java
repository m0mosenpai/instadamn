package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class SXq {
    public static final C63180Sef A01;
    public final Context A00;

    public SXq(Context context) {
        this.A00 = context;
    }

    public final synchronized String A00() {
        String string;
        Context context = this.A00;
        string = context.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string == null) {
            string = AbstractC166997dE.A0n();
            AbstractC58318PtA.A1C(context.getSharedPreferences("com.google.mlkit.internal", 0).edit(), "ml_sdk_instance_id", string);
        }
        return string;
    }

    static {
        C63194Sew A00 = C63194Sew.A00(SXq.class);
        C62995SaJ.A00(A00, C63164SeO.class, 1);
        C62995SaJ.A00(A00, Context.class, 1);
        A01 = C63194Sew.A01(A00, C64323T9g.A00);
    }
}
