package X;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.0yZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20050yZ extends AbstractC09180dS {
    @Override // X.AbstractC09180dS
    public final File A05(String str) {
        return null;
    }

    @Override // X.AbstractC09180dS
    public final String A06() {
        return "SystemLoadWrapperSoSource";
    }

    @Override // X.AbstractC09180dS
    public final String toString() {
        return AnonymousClass001.A0u("SystemLoadWrapperSoSource", "[", AbstractC09200dV.A01(), "]");
    }

    @Override // X.AbstractC09180dS
    public final int A04(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e) {
            android.util.Log.e("SoLoader", AnonymousClass001.A0R("Error loading library: ", str), e);
            return 0;
        }
    }

    @Override // X.AbstractC09180dS
    public final String A07(String str) {
        String A01 = AbstractC09200dV.A01();
        if (TextUtils.isEmpty(A01)) {
            return null;
        }
        for (String str2 : A01.split(":")) {
            Context context = C09170dP.A03;
            if (context != null && (context.getApplicationInfo().flags & 268435456) == 0 && str2.contains(".apk!")) {
                return AnonymousClass001.A0g(str2, File.separator, str);
            }
            File file = new File(str2, str);
            if (file.exists()) {
                return file.getCanonicalPath();
            }
        }
        return null;
    }
}
