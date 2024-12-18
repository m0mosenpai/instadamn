package X;

import android.content.Context;
import java.util.regex.Pattern;

/* renamed from: X.SWu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62913SWu {
    public static final Pattern A04 = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
    public static final Pattern A05 = Pattern.compile("\\d+");
    public static final String[] A06 = {"-journal", "-journal", "-uid", "-wal", "-shm", "-selfcheck", ".dat", ".back", ".corrupt"};
    public String A00;
    public String A01;
    public final Context A02;
    public final C62431SBg A03;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C62913SWu(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r2 = r4.getApplicationContext()
            r3.A02 = r2
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            if (r0 == 0) goto L29
            java.lang.String r1 = r0.dataDir
            if (r1 == 0) goto L29
            int r0 = r1.length()
            if (r0 == 0) goto L29
            java.io.File r1 = X.AbstractC166987dD.A11(r1)
        L21:
            X.SBg r0 = new X.SBg
            r0.<init>(r1)
        L26:
            r3.A03 = r0
            return
        L29:
            java.io.File r0 = r2.getCacheDir()
            if (r0 != 0) goto L34
            r1 = 0
        L30:
            r0 = 0
            if (r1 != 0) goto L21
            goto L26
        L34:
            java.io.File r1 = r0.getParentFile()
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62913SWu.<init>(android.content.Context):void");
    }
}
