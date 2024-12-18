package X;

import android.os.Handler;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dok, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC31262Dok implements View.OnClickListener {
    public final /* synthetic */ C31255Dod A00;

    public ViewOnClickListenerC31262Dok(C31255Dod c31255Dod) {
        this.A00 = c31255Dod;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        int A05 = C0f9.A05(-385077607);
        C31255Dod c31255Dod = this.A00;
        boolean A02 = AbstractC54472f1.A02();
        Handler handler = c31255Dod.A01;
        if (A02) {
            runnable = c31255Dod.A05;
        } else {
            runnable = c31255Dod.A06;
        }
        handler.post(runnable);
        int A00 = AbstractC31264Dom.A00(c31255Dod.A04);
        UserSession userSession = c31255Dod.A03;
        int A01 = C71953Kt.A01(userSession, false);
        int A002 = C71953Kt.A00(userSession, false);
        int A04 = C3Ks.A01.A04(userSession, false);
        boolean A1O = AbstractC167007dF.A1O(A04);
        C54432ex c54432ex = new C54432ex(EnumC54222eY.A06, A00);
        EnumC58162lY enumC58162lY = EnumC58162lY.A0A;
        EnumC58122lU enumC58122lU = EnumC58122lU.A03;
        C54392et.A00(AbstractC31173DnH.A0b(userSession), enumC58122lU, enumC58162lY, c54432ex, C05F.A0N, "click", null, A002, A1O ? 1 : 0, A01, A04);
        C54412ev A0c = AbstractC31174DnI.A0c(userSession);
        C14360o3.A0B(enumC58162lY, 0);
        A0c.A03(new C72053Ld(enumC58122lU, enumC58162lY, null, null), c54432ex, false);
        C0f9.A0C(570721575, A05);
    }
}
