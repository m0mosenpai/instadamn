package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GH1 implements InterfaceC1119153d {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC1118853a A02;
    public final /* synthetic */ EMP A03;
    public final /* synthetic */ C217859kI A04;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public GH1(Activity activity, UserSession userSession, InterfaceC1118853a interfaceC1118853a, EMP emp, C217859kI c217859kI) {
        this.A02 = interfaceC1118853a;
        this.A01 = userSession;
        this.A00 = activity;
        this.A03 = emp;
        this.A04 = c217859kI;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        this.A02.EJJ();
        if (AbstractC33579Esr.A00) {
            UserSession userSession = this.A01;
            Activity activity = this.A00;
            EMP emp = this.A03;
            C217859kI c217859kI = this.A04;
            C14360o3.A0B(emp, 2);
            C50674MYs c50674MYs = new C50674MYs(activity, userSession);
            c50674MYs.A0B(AbstractC166997dE.A0p(activity, 2131963342), new ViewOnClickListenerC35610Fo1(22, activity, emp, userSession, c217859kI));
            c50674MYs.A09(AbstractC166997dE.A0p(activity, 2131963341), ViewOnClickListenerC35665Foz.A00);
            C31727DwY.A00(activity, c50674MYs);
        }
    }
}
