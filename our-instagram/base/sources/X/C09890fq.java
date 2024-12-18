package X;

import android.content.Context;
import java.io.IOException;

/* renamed from: X.0fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09890fq {
    public static Boolean A00;

    public static synchronized boolean A00(Context context) {
        boolean booleanValue;
        synchronized (C09890fq.class) {
            if (A00 == null) {
                try {
                    A00 = false;
                    context.getAssets().open("app_modules.json").close();
                    A00 = true;
                } catch (IOException unused) {
                }
            }
            booleanValue = A00.booleanValue();
        }
        return booleanValue;
    }
}
