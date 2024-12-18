package X;

import android.content.Context;
import com.facebook.react.modules.appstate.AppStateModule;
import java.io.File;

/* renamed from: X.0Y5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Y5 {
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public final Context A00;

    static {
        String str = File.separator;
        A03 = AnonymousClass001.A0R(str, "locagg");
        A01 = AnonymousClass001.A0R(str, AppStateModule.APP_STATE_ACTIVE);
        A02 = AnonymousClass001.A0R(str, "stash");
    }

    public static String A00(C0Y5 c0y5, String str) {
        return AnonymousClass001.A0g(c0y5.A00.getDir("qpl", 0).getPath(), A03, str);
    }

    public final void A01() {
        File file = new File(A00(this, A02));
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
            file.delete();
        }
    }

    public C0Y5(Context context) {
        this.A00 = context;
    }
}
