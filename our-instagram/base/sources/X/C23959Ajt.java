package X;

import android.view.View;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;

/* renamed from: X.Ajt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23959Ajt implements InterfaceC58152PqH {
    public final /* synthetic */ C61842rl A00;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C23959Ajt(C61842rl c61842rl) {
        this.A00 = c61842rl;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put("is_retry_request", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        C61842rl c61842rl = this.A00;
        c61842rl.A0m.A0A().A0u().A03(true);
        c61842rl.A0A(C1EN.A0K, null, A1I);
    }
}
