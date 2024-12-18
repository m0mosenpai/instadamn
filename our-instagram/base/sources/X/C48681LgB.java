package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LgB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48681LgB implements InterfaceC50454MPi {
    public final UserSession A00;
    public final InterfaceC09390do A01 = MHK.A00(this, EnumC09460dv.A02, 29);

    @Override // X.InterfaceC50454MPi
    public final void E4D(Context context, C41761wQ c41761wQ, Integer num, Integer num2, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(num, 0);
        AbstractC167027dH.A13(num2, context, c41761wQ);
        UserSession userSession = this.A00;
        LAF A00 = AbstractC46732Klp.A00(context, userSession, num);
        if (z) {
            A00.A00(context).A04(new LSS(c41761wQ, A00, this, num, num2, interfaceC16660sJ));
        } else {
            c41761wQ.A02(A00.A04(c41761wQ, num2), new C29536Czo(new C48676Lg6(AbstractC46742Klz.A00(userSession, num), num, interfaceC16660sJ), 0));
        }
    }

    @Override // X.InterfaceC50454MPi
    public final void E4E(Activity activity, C41761wQ c41761wQ, KPU kpu, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        String str;
        AbstractC25233BEq.A0v(0, activity, c41761wQ, kpu);
        UserSession userSession = this.A00;
        AbstractC46743Km0.A00(userSession, activity.getApplication(), "attempt blockstore restore");
        if (z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        KPU.A00(kpu, str);
        kpu.A07("RESTORE_TYPE", "BLOCKSTORE");
        c41761wQ.A02(AbstractC46732Klp.A00(activity, userSession, C05F.A1I).A03(c41761wQ, userSession), new C49717Lxm(1, activity, kpu, this, interfaceC16660sJ));
    }

    public C48681LgB(UserSession userSession) {
        this.A00 = userSession;
    }
}
