package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.File;

/* loaded from: classes9.dex */
public final class OGK {
    public final void A00(Context context, Bitmap bitmap, UserSession userSession, InterfaceC58204PrA interfaceC58204PrA) {
        AbstractC167017dG.A1Q(userSession, interfaceC58204PrA);
        File A04 = AbstractC13530mf.A04(context);
        if (C1NC.A0M(bitmap, A04)) {
            String path = A04.getPath();
            if (path != null) {
                C55186Odr.A03(context, userSession, new P1L(interfaceC58204PrA, path), null, path, 0.5625f, OZN.A01(context), OZN.A00(context));
                return;
            }
            return;
        }
        C0w9.A03("PostLiveUploadFactory", "Failed to save thumbnail bitmap");
    }
}
