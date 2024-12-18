package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ag9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23798Ag9 implements InterfaceC190578cF {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C218109ki A01;

    @Override // X.InterfaceC190578cF
    public final /* synthetic */ void DJn() {
    }

    @Override // X.InterfaceC190578cF
    public final /* synthetic */ void DJp(C217859kI c217859kI) {
    }

    @Override // X.InterfaceC190578cF
    public final /* synthetic */ void DN8() {
    }

    @Override // X.InterfaceC190578cF
    public final void DSl(User user, int i) {
        boolean A2D = user.A2D();
        C218109ki c218109ki = this.A01;
        if (!A2D) {
            Context context = c218109ki.A07;
            UserSession userSession = c218109ki.A09;
            AbstractC167017dG.A1N(context, userSession);
            AbstractC35239FgY.A03(context, userSession, user, null, "story", null, null);
            UserSession userSession2 = this.A00;
            FDR.A00(AbstractC12220kQ.A01(null, userSession2), userSession2, user, "story", "click", AbstractC111324zv.A00(67));
            return;
        }
        C218109ki.A02(c218109ki, user);
    }

    public C23798Ag9(UserSession userSession, C218109ki c218109ki) {
        this.A01 = c218109ki;
        this.A00 = userSession;
    }
}
