package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.AeX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23698AeX implements C3Se {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C83E A01;

    public C23698AeX(Context context, C83E c83e) {
        this.A00 = context;
        this.A01 = c83e;
    }

    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        File A04 = AbstractC13530mf.A04(this.A00);
        C14360o3.A07(A04);
        if (A04.exists()) {
            C1NC.A0M(bitmap, A04);
            C83E c83e = this.A01;
            c83e.A00 = A04;
            c83e.A05.A01(0, A04.getCanonicalPath(), true);
        }
    }
}
