package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105754pm implements InterfaceC12870lZ, InterfaceC13050lr {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;

    public C105754pm(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A00 = false;
        C218914p.A06(this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int i;
        int A03 = C0f9.A03(-1596905401);
        if (this.A00) {
            i = 720882991;
        } else {
            this.A00 = true;
            C19K A02 = AnonymousClass194.A02(C12L.A00.CPG(2039365775, 3));
            AbstractC23641Du.A05(AnonymousClass191.A00, new MW8(this, null, 33), A02);
            i = 1573599374;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-531248416, C0f9.A03(-12115288));
    }
}
