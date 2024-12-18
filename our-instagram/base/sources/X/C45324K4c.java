package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.K4c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45324K4c extends AnonymousClass610 {
    public final /* synthetic */ UserSession A00;

    public C45324K4c(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.AnonymousClass610
    public final /* bridge */ /* synthetic */ Object A00() {
        return new C47617L1c(MqttNetworkSessionPlugin.get(), RealtimeClientManager.getInstance(this.A00));
    }
}
