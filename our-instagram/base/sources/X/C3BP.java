package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3BP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BP implements InterfaceC65626Tpm {
    public final Activity A00;
    public final UserSession A01;
    public final String A02;
    public final InterfaceC09390do A03 = C1XM.A00(new C9EU(this, 25));
    public final C25671My A04;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        this.A04.A02((InterfaceC41501vz) this.A03.getValue(), C3MH.class);
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        this.A04.A01((InterfaceC41501vz) this.A03.getValue(), C3MH.class);
    }

    public C3BP(UserSession userSession, Activity activity, String str) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = str;
        this.A04 = AbstractC25651Mw.A00(userSession);
    }
}
