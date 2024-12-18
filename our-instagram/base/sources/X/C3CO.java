package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3CO, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3CO extends AbstractC60592pi implements InterfaceC42271xH {
    public final Handler A00;
    public final C3CQ A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;

    public C3CO(UserSession userSession, C3CQ c3cq, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c3cq, 2);
        this.A02 = userSession;
        this.A01 = c3cq;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = new Handler() { // from class: X.3CR
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C14360o3.A0B(message, 0);
                if (message.what == 0) {
                    C3CQ c3cq2 = C3CO.this.A01;
                    Object obj = message.obj;
                    obj.getClass();
                    c3cq2.DSP((C38321qM) obj);
                }
            }
        };
    }

    public final void A00() {
        this.A00.removeMessages(0);
    }

    public final void A01() {
        AbstractC25651Mw.A00(this.A02).A01(this, C57452kK.class);
    }

    public final void A02() {
        if (this.A03) {
            A00();
        }
        AbstractC25651Mw.A00(this.A02).A02(this, C57452kK.class);
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C57452kK c57452kK = (C57452kK) obj;
        C14360o3.A0B(c57452kK, 0);
        return this.A01.AJk(c57452kK.A00);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        if (this.A04) {
            A01();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        if (!this.A04) {
            A01();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        if (!this.A04) {
            A02();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        if (this.A04) {
            A02();
        }
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-29562701);
        C57452kK c57452kK = (C57452kK) obj;
        int A032 = C0f9.A03(-433159240);
        C14360o3.A0B(c57452kK, 0);
        if (c57452kK.A01) {
            this.A01.DSP(c57452kK.A00);
        } else {
            Handler handler = this.A00;
            handler.removeMessages(0);
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = c57452kK.A00;
            handler.sendMessageDelayed(obtain, 100L);
        }
        C0f9.A0A(853951192, A032);
        C0f9.A0A(-1948787642, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3CO(UserSession userSession, C3CQ c3cq) {
        this(userSession, c3cq, false, false);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c3cq, 2);
    }
}
