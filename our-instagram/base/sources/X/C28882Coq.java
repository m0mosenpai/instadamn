package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Coq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28882Coq implements InterfaceC65626Tpm {
    public C3MT A00;
    public final Context A01;
    public final C3MJ A02;
    public final UserSession A03;

    public C28882Coq(UserSession userSession, Context context) {
        C14360o3.A0B(context, 2);
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = C3MI.A00(context, userSession);
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        C3MT c3mt = this.A00;
        if (c3mt != null) {
            C3MJ c3mj = this.A02;
            c3mj.A06(c3mt);
            c3mj.A04();
            this.A00 = null;
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        C3MJ c3mj = this.A02;
        c3mj.A03();
        C3MT A00 = C3MJ.A00(C29165CtW.A00);
        this.A00 = A00;
        c3mj.A05(A00);
    }
}
