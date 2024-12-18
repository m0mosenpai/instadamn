package X;

import android.content.Context;
import com.facebook.papaya.client.PapayaJNI;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oud, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56061Oud implements InterfaceC12870lZ, InterfaceC13050lr {
    public C54660OCm A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        final C54660OCm c54660OCm = this.A00;
        if (c54660OCm != null) {
            final ?? obj = new Object();
            c54660OCm.A04.execute(new Runnable() { // from class: X.PPU
                @Override // java.lang.Runnable
                public final void run() {
                    C54660OCm c54660OCm2 = C54660OCm.this;
                    SettableFuture settableFuture = obj;
                    c54660OCm2.A00.A00();
                    PapayaJNI.nativeUninitialize();
                    settableFuture.set(null);
                }
            });
        }
        this.A00 = null;
        this.A01 = false;
        C218914p.A06(this);
    }

    public C56061Oud(Context context, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A02 = context;
        this.A03 = userSession;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int i;
        int A03 = C0f9.A03(-1729699);
        if (this.A01) {
            i = -1239821071;
        } else {
            this.A01 = true;
            AbstractC25230BEn.A1N(this, AnonymousClass194.A02(C12L.A00.CPG(2039365775, 3)), 32);
            i = -1074342071;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1396815770, C0f9.A03(-438707037));
    }
}
