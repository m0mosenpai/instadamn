package X;

import android.graphics.Bitmap;
import com.instagram.api.schemas.CameraTool;

/* renamed from: X.Cbg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28192Cbg {
    public static final C28224CcU A00(Bitmap bitmap, String str) {
        AbstractC167007dF.A1K(str, bitmap);
        return new C28224CcU(bitmap, null, null, str, null, false);
    }

    public final C28224CcU A01(C26056Bfj c26056Bfj, CameraTool cameraTool) {
        C14360o3.A0B(c26056Bfj, 0);
        String A0p = AbstractC25231BEo.A0p();
        return new C28224CcU((Bitmap) c26056Bfj.A02, cameraTool, new CRU(c26056Bfj.A04, c26056Bfj.A06, c26056Bfj.A00), A0p, c26056Bfj.A05, true);
    }
}
