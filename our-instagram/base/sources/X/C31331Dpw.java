package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.Dpw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31331Dpw extends RealtimeClientManager.MessageDeliveryCallback {
    public final UserSession A00;
    public final GZ3 A01;

    @Override // com.instagram.realtimeclient.RealtimeClientManager.MessageDeliveryCallback
    public final void onFailure(Integer num, String str, String str2, boolean z, EnumC81843l3 enumC81843l3, String str3, boolean z2, boolean z3) {
        C114675Fx c114675Fx;
        if (num != null) {
            c114675Fx = AbstractC35240FgZ.A02(enumC81843l3, "mqtt", str, str2, str3, num.intValue(), z, z2, z3);
        } else if ("mqtt".equals("http")) {
            c114675Fx = C114675Fx.A0R;
        } else {
            c114675Fx = C114675Fx.A0U;
        }
        this.A01.DFl(c114675Fx, C05F.A01);
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.MessageDeliveryCallback
    public final void onTimeout() {
        this.A01.DFl(C114675Fx.A0V, C05F.A01);
    }

    public C31331Dpw(UserSession userSession, GZ3 gz3) {
        this.A00 = userSession;
        this.A01 = gz3;
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.MessageDeliveryCallback
    public final void onSuccess(String str, String str2, long j, Long l) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.DqN(new C31332Dpx(str2), C05F.A01);
    }
}
