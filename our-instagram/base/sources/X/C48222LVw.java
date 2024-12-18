package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;

/* renamed from: X.LVw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48222LVw implements InterfaceC08240bm {
    public final /* synthetic */ C1T6 A00;

    public C48222LVw(C1T6 c1t6) {
        this.A00 = c1t6;
    }

    @Override // X.InterfaceC08240bm
    public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        C1T6 c1t6 = this.A00;
        String stringExtra = intent.getStringExtra("FOA_EVENT_SENDER");
        if (!c1t6.A01.equals(stringExtra)) {
            if ("com.facebook.fixie.action.FOA_FOREGROUND_EVENT".equals(intent.getAction())) {
                if (intent.getBooleanExtra("ACTION_MEMORY_BOOST", false) && C1T6.A04(c1t6)) {
                    C03850Ja.A01(AnonymousClass001.A0y("memory boost for ", stringExtra, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, intent.getIntExtra("MEMORY_SWAP_FREE_RATIO", -1), intent.getIntExtra("MEMORY_BOOST_SWAP_FREE_THRESHOLD", -1)));
                    return;
                }
                return;
            }
            if (!"com.facebook.fixie.action.FOA_BACKGROUND_EVENT".equals(intent.getAction()) || !C1T6.A03(c1t6)) {
                return;
            }
            C1T6.A02(c1t6);
        }
    }

    @Override // X.InterfaceC08240bm
    public final ArrayList BIr() {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new IntentFilter("com.facebook.fixie.action.FOA_FOREGROUND_EVENT"));
        A1E.add(new IntentFilter("com.facebook.fixie.action.FOA_BACKGROUND_EVENT"));
        return A1E;
    }
}
