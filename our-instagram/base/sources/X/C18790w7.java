package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0w7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18790w7 implements C0V1 {
    public File A00;
    public File A01;
    public Integer A02 = C05F.A00;
    public InterfaceC06330Uz A03;

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
    
        if (r6.renameTo(r1) == false) goto L30;
     */
    @Override // X.C0V1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC06330Uz B8s() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18790w7.B8s():X.0Uz");
    }

    public C18790w7(Context context) {
        File file = new File(context.getFilesDir(), "profilo");
        this.A01 = file;
        if (!file.exists() && !this.A01.mkdir()) {
            this.A03 = C18760w3.A00;
            android.util.Log.w("Profilo/ProfiloConfigProvider", AnonymousClass001.A0R("Failed to mkdir ", this.A01.getName()));
        }
    }
}
