package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class VBm extends V2X {
    public C67844UzI A00;
    public final Context A01;
    public final UserSession A02;
    public final C32445EQx A03;
    public final C32446EQy A04;
    public final V33 A05;
    public final N9I A06;

    public VBm(Context context, UserSession userSession, C67897V1f c67897V1f, InterfaceC58093PpI interfaceC58093PpI) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        C32445EQx c32445EQx = new C32445EQx(context);
        this.A03 = c32445EQx;
        C32446EQy c32446EQy = new C32446EQy(context);
        this.A04 = c32446EQy;
        N9I n9i = new N9I(context, userSession, interfaceC58093PpI);
        this.A06 = n9i;
        V33 v33 = new V33(context, VDR.A04, c67897V1f);
        this.A05 = v33;
        A0B(c32445EQx, c32446EQy, n9i, v33);
    }
}
