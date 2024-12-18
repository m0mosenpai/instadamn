package X;

import android.content.Context;
import android.util.Pair;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes10.dex */
public final class T1P implements InterfaceC65590TnV {
    public C4N8 A00;
    public InterfaceC65233TgP A01;
    public CountDownLatch A02 = AbstractC58319PtB.A15();
    public Context A03;
    public final boolean A04;

    @Override // X.InterfaceC65590TnV
    public final String AcH() {
        return "567310203415052";
    }

    @Override // X.InterfaceC65590TnV
    public final synchronized String AxH() {
        A00();
        return (String) ((Pair) ((Q4B) this.A01)).first;
    }

    @Override // X.InterfaceC65590TnV
    public final synchronized String AxK() {
        A00();
        return (String) ((Pair) ((Q4B) this.A01)).second;
    }

    @Override // X.InterfaceC65590TnV
    public final String getAppName() {
        return "MQTT";
    }

    private void A00() {
        try {
            this.A02.await();
        } catch (InterruptedException e) {
            C0K8.A0F("FbnsServiceIdManager", "Waiting for mqtt device id and secret was interrupted", e);
        }
    }

    @Override // X.InterfaceC65590TnV
    public final String C9A() {
        throw AbstractC166987dD.A18("Tokenbinding not implemented for legacy auth");
    }

    @Override // X.InterfaceC65590TnV
    public final boolean E4B() {
        throw AbstractC166987dD.A18("Tokenbinding not implemented for legacy auth");
    }

    @Override // X.InterfaceC65590TnV
    public final byte[] E4G(Socket socket) {
        throw AbstractC166987dD.A18("Tokenbinding not implemented for legacy auth");
    }

    @Override // X.InterfaceC65590TnV
    public final void EWi(SBX sbx, boolean z) {
        TO1 to1;
        C4N8 c4n8 = this.A00;
        C4N7 c4n7 = (C4N7) c4n8;
        if (c4n7.contains("/settings/mqtt/id/is_using_secure_auth")) {
            boolean z2 = false;
            if (z != c4n7.getBoolean("/settings/mqtt/id/is_using_secure_auth", false)) {
                z2 = true;
                C91M ARA = c4n8.ARA();
                ARA.E75("/settings/mqtt/id/is_using_secure_auth", z);
                ARA.AIb("FbnsServiceIdManager", "PreferencesManager failed to store isSecureAuth");
            }
            to1 = sbx.A00;
            if (!z2) {
                return;
            }
        } else {
            C91M ARA2 = c4n8.ARA();
            ARA2.E75("/settings/mqtt/id/is_using_secure_auth", z);
            ARA2.AIb("FbnsServiceIdManager", "PreferencesManager failed to store isSecureAuth");
            to1 = sbx.A00;
        }
        to1.A00.A01.A0M.D8h();
    }

    public T1P(Context context, C74103Uo c74103Uo, boolean z) {
        this.A01 = Q4B.A01;
        this.A04 = z;
        this.A03 = context;
        C4N8 A0V = AbstractC58319PtB.A0V(context, c74103Uo, "ids");
        this.A00 = A0V;
        this.A01 = new Q4B(((C4N7) A0V).getString("/settings/mqtt/id/mqtt_device_id", ""), ((C4N7) this.A00).getString("/settings/mqtt/id/mqtt_device_secret", ""), Long.valueOf(((C4N7) this.A00).getLong("/settings/mqtt/id/timestamp", Long.MAX_VALUE)).longValue());
        this.A02.countDown();
        A00();
        String str = (String) ((Pair) this.A01).first;
        if ((str == null || str.equals("")) && this.A04) {
            FA6(new Q4B(AbstractC166997dE.A0o(), "", System.currentTimeMillis()));
        }
    }

    @Override // X.InterfaceC65590TnV
    public final boolean FA6(InterfaceC65233TgP interfaceC65233TgP) {
        A00();
        if (!this.A01.equals(interfaceC65233TgP)) {
            C91M ARA = this.A00.ARA();
            Q4B q4b = (Q4B) interfaceC65233TgP;
            ARA.E7I("/settings/mqtt/id/mqtt_device_id", (String) ((Pair) q4b).first);
            ARA.E7I("/settings/mqtt/id/mqtt_device_secret", (String) ((Pair) q4b).second);
            ARA.E7E("/settings/mqtt/id/timestamp", q4b.A00);
            ARA.AIb("FbnsServiceIdManager", "PreferencesManager failed to store device id, secret, and timestamp.");
            this.A01 = interfaceC65233TgP;
            return true;
        }
        return false;
    }
}
