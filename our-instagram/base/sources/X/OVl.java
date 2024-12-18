package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OVl {
    public Boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final AbstractC018607g A03;

    public OVl(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = abstractC018607g;
    }

    public final void A01(XCX xcx, C47Z c47z, String str, int i, int i2, long j, boolean z) {
        C14360o3.A0B(xcx, 6);
        C1GJ.A00(this.A01, this.A03, new C67997V5m(xcx, this, c47z, str, i, i2, j, z));
    }

    public static final String A00(Bitmap bitmap, OVl oVl, String str, int i) {
        Context context = oVl.A01;
        UserSession userSession = oVl.A02;
        AbstractC167017dG.A1N(context, userSession);
        String A00 = AbstractC53948NtL.A00(bitmap, userSession, AMc.A02(C2Ps.A00(context, userSession), str), i);
        bitmap.recycle();
        return A00;
    }
}
