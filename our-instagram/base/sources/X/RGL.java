package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* loaded from: classes10.dex */
public final class RGL extends C61U {
    @Override // X.C61U
    public final /* bridge */ /* synthetic */ InterfaceC1340663q A00(Context context, Looper looper, C69E c69e, C69G c69g, C1340363l c1340363l, Object obj) {
        Integer num = c1340363l.A00;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
        if (num != null) {
            A0b.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        A0b.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        A0b.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        A0b.putString("com.google.android.gms.signin.internal.serverClientId", null);
        A0b.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        A0b.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        A0b.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        A0b.putString("com.google.android.gms.signin.internal.logSessionId", null);
        A0b.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new RHK(context, A0b, looper, c69e, c69g, c1340363l);
    }
}
