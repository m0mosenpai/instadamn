package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IKP {
    public boolean A00;
    public boolean A01;
    public final Activity A02;
    public final UserSession A03;
    public final C41551w4 A04;
    public final InterfaceC1118853a A05;
    public final J0S A06;
    public final C6QE A07;
    public final C33172EkJ A08 = new C33172EkJ(this, 9);

    public IKP(Activity activity, UserSession userSession, C41551w4 c41551w4, InterfaceC1118853a interfaceC1118853a) {
        this.A03 = userSession;
        this.A04 = c41551w4;
        this.A05 = interfaceC1118853a;
        this.A02 = activity;
        this.A07 = new C6QE(userSession);
        this.A06 = new J0S(userSession);
    }
}
