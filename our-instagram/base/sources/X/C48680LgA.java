package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LgA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48680LgA implements InterfaceC50454MPi {
    public final UserSession A00;

    @Override // X.InterfaceC50454MPi
    public final void E4E(Activity activity, C41761wQ c41761wQ, KPU kpu, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        String str;
        AbstractC25233BEq.A0v(0, activity, c41761wQ, kpu);
        UserSession userSession = this.A00;
        AbstractC46743Km0.A00(userSession, activity.getApplication(), "attempt auto restore");
        if (z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        KPU.A00(kpu, str);
        kpu.A07("RESTORE_TYPE", "AUTORESTORE");
        c41761wQ.A02(C48486Lcd.A00(c41761wQ, userSession, AbstractC46729Klm.A00(userSession, C05F.A1I), 0), new C49717Lxm(0, activity, kpu, this, interfaceC16660sJ));
    }

    public C48680LgA(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.InterfaceC50454MPi
    public final void E4D(Context context, C41761wQ c41761wQ, Integer num, Integer num2, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        AbstractC167017dG.A1N(num, num2);
        C14360o3.A0B(c41761wQ, 3);
        AbstractC46730Kln.A00(c41761wQ, AbstractC46729Klm.A00(this.A00, num), new C48669Lfx(interfaceC16660sJ), num2);
    }
}
