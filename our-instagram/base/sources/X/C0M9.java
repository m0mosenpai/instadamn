package X;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0M9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0M9 {
    public C05980Tm A00;
    public final Context A01;
    public final Handler A02;
    public final C06420Vj A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final String A00() {
        File A00 = C0eS.A00(this.A01, 194178138);
        A00.mkdirs();
        try {
            return new File(A00, this.A04.replace('.', '_').replace(':', '_')).getCanonicalPath();
        } catch (IOException e) {
            C0PC.A00().DEh("SigquitTimeFilePath", e, null);
            return null;
        }
    }

    public C0M9(Context context, Handler handler, C06420Vj c06420Vj, C05980Tm c05980Tm, String str, String str2, boolean z) {
        this.A01 = context;
        this.A04 = str;
        this.A03 = c06420Vj;
        this.A00 = c05980Tm;
        this.A02 = handler;
        this.A05 = str2;
        this.A06 = z;
    }
}
