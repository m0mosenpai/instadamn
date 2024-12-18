package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.D1r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29590D1r implements Runnable {
    public final /* synthetic */ C154926xh A00;
    public final /* synthetic */ C155096xy A01;

    public RunnableC29590D1r(C154926xh c154926xh, C155096xy c155096xy) {
        this.A00 = c154926xh;
        this.A01 = c155096xy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C154926xh c154926xh = this.A00;
        UserSession userSession = c154926xh.A02;
        C155096xy c155096xy = this.A01;
        String str = c155096xy.A01;
        String str2 = c155096xy.A02;
        EnumC39642HiX enumC39642HiX = c155096xy.A00;
        Activity activity = c154926xh.A00;
        C14360o3.A0B(str, 1);
        C36730GGz c36730GGz = new C36730GGz(enumC39642HiX, userSession, str2, 3);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0U = c36730GGz;
        C189478aR A00 = A0y.A00();
        C37016GSx c37016GSx = new C37016GSx(A00, 32);
        C26736BrH c26736BrH = new C26736BrH();
        c26736BrH.A01 = str;
        c26736BrH.A03 = c37016GSx;
        c26736BrH.A02 = str2;
        c26736BrH.A00 = enumC39642HiX;
        A00.A02(activity, c26736BrH);
    }
}
