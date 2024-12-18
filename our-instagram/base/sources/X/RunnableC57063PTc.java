package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.PTc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57063PTc implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    public RunnableC57063PTc(Activity activity, View view, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A01 = activity;
        this.A00 = i;
        this.A02 = view;
        this.A03 = userSession;
        this.A04 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU A0U = AbstractC167007dF.A0U(this.A01, this.A00);
        A0U.A01();
        View view = this.A02;
        A0U.A03(view);
        A0U.A04(view, (view.getWidth() / 2) - 200, view.getHeight() - 16, false);
        A0U.A0F = true;
        A0U.A0B = true;
        A0U.A0A = true;
        NMC.A00(A0U, this.A04, 0).A07(this.A03);
    }
}
