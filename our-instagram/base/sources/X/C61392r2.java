package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2r2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61392r2 implements InterfaceC65626Tpm {
    public C63322uF A00;
    public C63272u5 A01;
    public final Context A02;
    public final UserSession A03;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        C63272u5 c63272u5 = this.A01;
        if (c63272u5 != null) {
            C63322uF c63322uF = this.A00;
            if (c63322uF == null) {
                C14360o3.A0F("feedPickerStateManager");
                throw C00O.createAndThrow();
            }
            c63322uF.A05.remove(c63272u5);
        }
        this.A01 = null;
    }

    public C61392r2(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
    }
}
