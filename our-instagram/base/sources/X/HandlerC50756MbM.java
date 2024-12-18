package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.common.session.UserSession;

/* renamed from: X.MbM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC50756MbM extends Handler {
    public final Activity A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Activity activity;
        Runnable pnr;
        C14360o3.A0B(message, 0);
        int i = message.what;
        if (i != 1) {
            if (i == 2 && AbstractC53604NnB.A01 != null) {
                pnr = PU2.A00;
            } else {
                return;
            }
        } else {
            if (AbstractC53604NnB.A01 != null || (activity = this.A00) == null) {
                return;
            }
            UserSession userSession = this.A02;
            C14360o3.A0B(userSession, 0);
            OGm oGm = (OGm) userSession.A01(NM0.class, new C50152MDf(userSession, 44));
            InterfaceC65454TkQ interfaceC65454TkQ = AbstractC53604NnB.A02;
            C14360o3.A0A(interfaceC65454TkQ);
            AbstractC53604NnB.A01 = oGm.createGooglePlayLocationSettingsController(activity, userSession, interfaceC65454TkQ, this.A04, this.A03);
            if (AbstractC53604NnB.A01 == null) {
                return;
            } else {
                pnr = new PNR(this);
            }
        }
        post(pnr);
    }

    public HandlerC50756MbM(Activity activity, Looper looper, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        super(looper);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A04 = "InstagramDevicePermissionLocationCoreAPI";
        this.A03 = "openSystemSettingDialog";
    }
}
