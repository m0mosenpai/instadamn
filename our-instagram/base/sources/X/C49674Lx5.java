package X;

import android.graphics.Bitmap;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lx5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49674Lx5 implements BD5 {
    public final /* synthetic */ C8LZ A00;
    public final /* synthetic */ DirectShareTarget A01;
    public final /* synthetic */ String A02;

    public C49674Lx5(C8LZ c8lz, DirectShareTarget directShareTarget, String str) {
        this.A00 = c8lz;
        this.A01 = directShareTarget;
        this.A02 = str;
    }

    @Override // X.BD5
    public final void DKi(Exception exc) {
        String str;
        if (exc.getMessage() != null) {
            str = exc.getMessage();
        } else {
            str = "Unable to decode image";
        }
        AbstractC12120kG.A01(C8LZ.__redex_internal_original_name, str);
    }

    @Override // X.BD5
    public final void DKj(Bitmap bitmap, C206409Bx c206409Bx, int i, boolean z) {
        C14120nc.A00().ATO(new KMP(bitmap, c206409Bx, this, i, z));
    }
}
