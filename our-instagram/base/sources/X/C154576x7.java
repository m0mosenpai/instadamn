package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6x7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154576x7 implements InterfaceC65626Tpm {
    public C3MT A00;
    public final UserSession A01;
    public final String A02;
    public final InterfaceC16820sZ A03;
    public final C3MJ A04;

    public C154576x7(Context context, UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = interfaceC16820sZ;
        this.A04 = C3MI.A00(context, userSession);
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
            C3MJ c3mj = this.A04;
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
        C3MJ c3mj = this.A04;
        c3mj.A03();
        C3MT A00 = C3MJ.A00(new C3MR() { // from class: X.6x8
            @Override // X.C3MR
            public final void Dih(long j) {
                C154576x7 c154576x7 = C154576x7.this;
                FDG.A00(c154576x7.A01, c154576x7.A02, c154576x7.A03);
            }
        });
        this.A00 = A00;
        c3mj.A05(A00);
    }
}
