package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.7Dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159587Dt implements InterfaceC13050lr {
    public long A00;
    public long A01;
    public String A02;
    public final Handler A03;
    public final InterfaceC11360iu A04;
    public final RealtimeClientManager.MessageDeliveryCallback A05;
    public final RealtimeClientManager A06;
    public final Handler.Callback A07;
    public final UserSession A08;
    public final C13920nI A09;

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
    }

    public C159587Dt(InterfaceC11360iu interfaceC11360iu, UserSession userSession, C13920nI c13920nI, RealtimeClientManager realtimeClientManager) {
        Handler.Callback callback = new Handler.Callback() { // from class: X.7Dv
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what == 1) {
                    C159587Dt c159587Dt = C159587Dt.this;
                    C11T.A00();
                    if (c159587Dt.A02 != null) {
                        c159587Dt.A03.removeMessages(1);
                        c159587Dt.A02 = null;
                    }
                    return true;
                }
                return false;
            }
        };
        this.A07 = callback;
        this.A01 = 10000L;
        this.A05 = new RealtimeClientManager.MessageDeliveryCallback() { // from class: X.7Dw
            @Override // com.instagram.realtimeclient.RealtimeClientManager.MessageDeliveryCallback
            public final void onTimeout() {
            }

            @Override // com.instagram.realtimeclient.RealtimeClientManager.MessageDeliveryCallback
            public final void onSuccess(String str, String str2, long j, Long l) {
                if (l != null) {
                    C159587Dt.this.A01 = l.longValue();
                }
            }

            @Override // com.instagram.realtimeclient.RealtimeClientManager.MessageDeliveryCallback
            public final void onFailure(Integer num, String str, String str2, boolean z, EnumC81843l3 enumC81843l3, String str3, boolean z2, boolean z3) {
            }
        };
        this.A09 = c13920nI;
        this.A08 = userSession;
        this.A04 = interfaceC11360iu;
        this.A06 = realtimeClientManager;
        this.A03 = new Handler(Looper.getMainLooper(), callback);
    }

    public C159587Dt() {
    }
}
