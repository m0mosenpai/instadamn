package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161887My extends AbstractC60592pi implements InterfaceC42271xH {
    public final Handler A00;
    public final InterfaceC161877Mx A01;
    public final Context A02;
    public final C25671My A03;
    public final UserSession A04;

    public C161887My(Context context, UserSession userSession, InterfaceC161877Mx interfaceC161877Mx) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC161877Mx, 3);
        this.A02 = context;
        this.A04 = userSession;
        this.A01 = interfaceC161877Mx;
        this.A03 = AbstractC25651Mw.A00(userSession);
        this.A00 = new Handler() { // from class: X.7Mz
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C161887My.this.A01.FAg();
            }
        };
    }

    public final void A00() {
        this.A03.A01(this, C70073Cr.class);
    }

    public final void A01() {
        this.A00.removeMessages(0);
        this.A03.A02(this, C70073Cr.class);
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C70073Cr c70073Cr = (C70073Cr) obj;
        C14360o3.A0B(c70073Cr, 0);
        return this.A01.AJn(c70073Cr.A00.getId());
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        A01();
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1838399662);
        C70073Cr c70073Cr = (C70073Cr) obj;
        int A032 = C0f9.A03(-1837664534);
        C14360o3.A0B(c70073Cr, 0);
        boolean z = c70073Cr.A03;
        Handler handler = this.A00;
        if (!z) {
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, 300L);
        } else {
            handler.removeMessages(0);
            handler.sendEmptyMessage(0);
        }
        C0f9.A0A(788815342, A032);
        C0f9.A0A(-1127789397, A03);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        A00();
    }
}
