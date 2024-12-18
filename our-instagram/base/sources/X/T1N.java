package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.Collections;
import java.util.LinkedList;

/* loaded from: classes10.dex */
public final class T1N implements InterfaceC65585TnO {
    public final /* synthetic */ MqttPushServiceDelegate A00;

    @Override // X.InterfaceC65585TnO
    public final void DcR(C62830STc c62830STc, Long l, String str, byte[] bArr, int i, long j) {
        this.A00.A0R(c62830STc, null, str, bArr, i, j);
    }

    public T1N(MqttPushServiceDelegate mqttPushServiceDelegate) {
        this.A00 = mqttPushServiceDelegate;
    }

    @Override // X.InterfaceC65585TnO
    public final void D79() {
        this.A00.A0Q();
    }

    @Override // X.InterfaceC65585TnO
    public final void D7B() {
        MqttPushServiceDelegate mqttPushServiceDelegate = this.A00;
        mqttPushServiceDelegate.A00 = SystemClock.elapsedRealtime();
        mqttPushServiceDelegate.A0Q();
    }

    @Override // X.InterfaceC65585TnO
    public final void D7F(AbstractC64515THi abstractC64515THi) {
        MqttPushServiceDelegate mqttPushServiceDelegate = this.A00;
        if (!(abstractC64515THi instanceof C60546R6j)) {
            Object A01 = abstractC64515THi.A01();
            FbnsServiceDelegate fbnsServiceDelegate = (FbnsServiceDelegate) mqttPushServiceDelegate;
            boolean A1O = AbstractC167007dF.A1O((AbstractC37300Gc1.A00(((C4N7) Sh7.A00(fbnsServiceDelegate.A07)).getLong("auto_reg_retry", 0L)) > 86400000L ? 1 : (AbstractC37300Gc1.A00(((C4N7) Sh7.A00(fbnsServiceDelegate.A07)).getLong("auto_reg_retry", 0L)) == 86400000L ? 0 : -1)));
            if (EnumC122375gY.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD.equals(A01) && A1O) {
                C91M ARA = Sh7.A00(fbnsServiceDelegate.A07).ARA();
                ARA.E7E("auto_reg_retry", System.currentTimeMillis());
                ARA.AIb("RegistrationState", "PreferencesManager failed to store auth failed register time.");
                LinkedList<SZ0> A04 = fbnsServiceDelegate.A07.A04();
                fbnsServiceDelegate.A07.A05();
                FbnsServiceDelegate.A02(fbnsServiceDelegate, "authfail_auto_register", "", "", null, Collections.singletonMap("package_size", String.valueOf(A04.size())));
                for (SZ0 sz0 : A04) {
                    Intent A0E = AbstractC58318PtA.A0E("com.facebook.rti.fbns.intent.REGISTER");
                    A0E.putExtra("pkg_name", sz0.A02);
                    A0E.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, sz0.A01);
                    A0E.setClassName(AbstractC166987dD.A0O(((AbstractC19560xi) fbnsServiceDelegate).A01).getPackageName(), MSY.A0h(fbnsServiceDelegate));
                    fbnsServiceDelegate.A0W(A0E);
                }
            }
        }
        mqttPushServiceDelegate.A0Q();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.SKT, java.lang.Object] */
    @Override // X.InterfaceC65585TnO
    public final void D8h() {
        FbnsServiceDelegate fbnsServiceDelegate = (FbnsServiceDelegate) this.A00;
        LinkedList<SZ0> A04 = fbnsServiceDelegate.A07.A04();
        fbnsServiceDelegate.A07.A05();
        FbnsServiceDelegate.A02(fbnsServiceDelegate, "credentials_updated", "", "", null, Collections.singletonMap("package_size", String.valueOf(A04.size())));
        ?? obj = new Object();
        AbstractServiceC19690xx abstractServiceC19690xx = ((AbstractC19560xi) fbnsServiceDelegate).A01;
        Context A0O = AbstractC166987dD.A0O(abstractServiceC19690xx);
        C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
        C14360o3.A07(abstractServiceC19690xx.getApplicationContext());
        fbnsServiceDelegate.A0S(obj.A00(A0O, c74123Uq.A02()), C05F.A05);
        for (SZ0 sz0 : A04) {
            Intent A0E = AbstractC58318PtA.A0E("com.facebook.rti.fbns.intent.REGISTER");
            A0E.putExtra("pkg_name", sz0.A02);
            A0E.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, sz0.A01);
            A0E.setClassName(AbstractC166987dD.A0O(abstractServiceC19690xx).getPackageName(), MSY.A0h(fbnsServiceDelegate));
            fbnsServiceDelegate.A0W(A0E);
        }
    }

    @Override // X.InterfaceC65585TnO
    public final void DTD(C62671SLj c62671SLj) {
        this.A00.A0O();
    }

    @Override // X.InterfaceC65585TnO
    public final boolean EiB() {
        return this.A00.A0T();
    }

    @Override // X.InterfaceC65585TnO
    public final void EHT(long j, String str, boolean z) {
    }
}
