package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G6Y implements GZ2 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC37157GYu A02;
    public final /* synthetic */ E70 A03;

    public G6Y(Context context, UserSession userSession, InterfaceC37157GYu interfaceC37157GYu, E70 e70) {
        this.A01 = userSession;
        this.A03 = e70;
        this.A00 = context;
        this.A02 = interfaceC37157GYu;
    }

    @Override // X.GZ2
    public final void D9X() {
        int i;
        UserSession userSession = this.A01;
        E70 e70 = this.A03;
        F36.A00(userSession, e70, true);
        Context context = this.A00;
        AbstractC167017dG.A1N(context, userSession);
        new C31605DuX(context, userSession).A02(e70.A08(), C05F.A07);
        C142846ck A00 = AbstractC147806l5.A00(userSession);
        int A06 = e70.A06();
        A00.A0J(C05F.A01, E70.A03(e70), e70.A0Q, A06);
        int i2 = e70.A09;
        if (!C4GR.A02(i2) && !C4GR.A01(i2)) {
            i = 2131959104;
            if (i2 == 29) {
                i = 2131959035;
            }
        } else {
            i = 2131959147;
        }
        C9GR.A09(context, context.getString(i));
        this.A02.Ch3();
    }

    @Override // X.GZ2
    public final void onDismiss() {
        F36.A00(this.A01, this.A03, false);
    }
}
