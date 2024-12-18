package X;

import android.content.Context;
import java.io.File;

/* loaded from: classes9.dex */
public abstract class MT5 {
    public static final File A00(Context context, String str) {
        boolean A1a = AbstractC167017dG.A1a(context, str);
        String A03 = C14360o3.A03(str, ".preferences_pb");
        C14360o3.A0B(A03, A1a ? 1 : 0);
        return MSW.A0w(context.getApplicationContext().getFilesDir(), C14360o3.A03("datastore/", A03));
    }
}
