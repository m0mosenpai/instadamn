package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OEJ {
    public boolean A00;
    public final Context A01;
    public final C1P1 A02;
    public final UserSession A03;
    public final C1GL A04;
    public final O2Y A05;
    public final C52478NJw A06;

    public OEJ(Context context, UserSession userSession, C1GL c1gl, O2Y o2y, C52478NJw c52478NJw) {
        MSZ.A1O(userSession, c52478NJw);
        this.A03 = userSession;
        this.A01 = context;
        this.A04 = c1gl;
        this.A06 = c52478NJw;
        this.A05 = o2y;
        this.A02 = new C50689MZh(this, 6);
    }
}
