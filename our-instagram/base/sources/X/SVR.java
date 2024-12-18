package X;

import android.content.Context;
import java.io.File;

/* loaded from: classes10.dex */
public final class SVR {
    public final Context A00;

    public static final File A00(SVR svr, String str) {
        return AbstractC166987dD.A11(AnonymousClass001.A0g(svr.A00.getApplicationInfo().nativeLibraryDir, File.separator, str));
    }

    public SVR(Context context) {
        this.A00 = context;
    }
}
