package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ew0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33774Ew0 {
    public static final void A00(Context context, Bitmap bitmap, C1P1 c1p1, UserSession userSession, C1GL c1gl, boolean z) {
        C14360o3.A0B(c1gl, 4);
        if (bitmap != null) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            if (context != null) {
                C121275eQ c121275eQ = new C121275eQ(new TUT(context, bitmap, userSession, valueOf, 1), 449);
                C1Ee c1Ee = new C1Ee();
                c1Ee.A05("share_to_feed", String.valueOf(z));
                c121275eQ.A00 = new EZ6(c1p1, c1Ee, userSession, valueOf);
                c1gl.schedule(c121275eQ);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
