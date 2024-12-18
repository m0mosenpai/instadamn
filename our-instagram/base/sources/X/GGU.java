package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GGU implements GYK {
    public final InterfaceC16820sZ A00;
    public final C1GL A01;

    public GGU(C1GL c1gl, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = c1gl;
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        long A01;
        AbstractC167027dH.A12(context, userSession, fragmentActivity);
        C35016Fbp c35016Fbp = new C35016Fbp(userSession);
        c35016Fbp.A01(857808852, null);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321391666865540L)) {
            if (C18U.A06(c06090Tz, userSession, 36321391666996613L)) {
                A01 = 1;
            } else {
                A01 = C18U.A01(c06090Tz, userSession, 36602866643637084L);
                C14360o3.A0A(Long.valueOf(A01));
            }
            C35256Fgp.A01(context, userSession, A01);
            return;
        }
        c35016Fbp.A01(857806880, null);
        C62862tP A012 = C62862tP.A01(null, fragmentActivity, AbstractC31171DnF.A0D("SETTINGS"), userSession);
        C1GL c1gl = this.A01;
        AbstractC192798gL A02 = C192108fB.A02(null, userSession, "com.bloks.www.fxcal.settings.async", AbstractC167017dG.A0r("params", "{\"server_params\":{\"entrypoint\":\"app_settings\"}}"));
        C32393EOu.A00(A02, A012, c35016Fbp, this, 12);
        c1gl.schedule(A02);
    }
}
