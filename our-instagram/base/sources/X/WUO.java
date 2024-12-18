package X;

import android.os.Bundle;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WUO implements InterfaceC71948XBz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ WGO A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public WUO(WGO wgo, String str, String str2, int i, long j) {
        this.A02 = wgo;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A00 = i;
    }

    @Override // X.InterfaceC71948XBz
    public final /* bridge */ /* synthetic */ void DqR(Bundle bundle, Object obj) {
        String str;
        String Btu = ((X95) obj).Ard().Btu();
        boolean equalsIgnoreCase = Btu.equalsIgnoreCase("on");
        WGO wgo = this.A02;
        C69758Vuv c69758Vuv = wgo.A0V;
        UserSession userSession = c69758Vuv.A01;
        AbstractC23021Ah.A00(userSession).A1B(equalsIgnoreCase);
        Bundle bundle2 = new Bundle();
        bundle2.putString("client_ccu_enabled", this.A03);
        bundle2.putString("server_ccu_enabled", Btu);
        String str2 = this.A04;
        bundle2.putString(CacheBehaviorLogger.SOURCE, str2);
        Iterator it = wgo.A0Q.A00.iterator();
        while (it.hasNext()) {
            C69690Vtg A00 = ((WUU) it.next()).A00.A00("ccu_setting_enable_disable_event");
            String string = bundle2.getString("client_ccu_enabled");
            C19280xC c19280xC = A00.A00;
            c19280xC.A0C("client_ccu_enabled", string);
            c19280xC.A0C("server_ccu_enabled", bundle2.getString("server_ccu_enabled"));
            c19280xC.A0C(CacheBehaviorLogger.SOURCE, bundle2.getString(CacheBehaviorLogger.SOURCE));
            A00.A00();
        }
        if ("remote_setting_migration".equalsIgnoreCase(str2)) {
            String str3 = userSession.userId;
            if (str3 != null) {
                InterfaceC19610xo ARD = c69758Vuv.A02.ARD();
                ARD.E77(AnonymousClass001.A0R(str3, "user_remote_setting_migration_completed"), true);
                ARD.apply();
            }
            wgo.A08(this.A01);
        }
        if ("ccu_background_ping".equalsIgnoreCase(str2) && (str = userSession.userId) != null) {
            InterfaceC19610xo ARD2 = c69758Vuv.A02.ARD();
            ARD2.E77(AnonymousClass001.A0R(str, "ccu_setting_synced_with_server"), true);
            ARD2.apply();
        }
    }

    @Override // X.InterfaceC71948XBz
    public final void onFailure(Throwable th) {
        int i;
        String str = this.A03;
        if ("off".equalsIgnoreCase(str)) {
            if (AbstractC111324zv.A00(1362).equalsIgnoreCase(this.A04)) {
                AbstractC23021Ah.A00(this.A02.A0V.A01).A1B(true);
            }
        }
        String str2 = this.A04;
        if ("remote_setting_migration".equalsIgnoreCase(str2) && (i = this.A00) > 0) {
            this.A02.A07(i - 1, str2, str, this.A01);
        }
        Bundle bundle = new Bundle();
        bundle.putString("client_ccu_enabled", str);
        bundle.putString(CacheBehaviorLogger.SOURCE, str2);
        bundle.putString("failure_message", th.getMessage());
        WGO wgo = this.A02;
        WUU wuu = wgo.A0R;
        String message = th.getMessage();
        C69758Vuv c69758Vuv = wgo.A0V;
        boolean z = false;
        String str3 = c69758Vuv.A01.userId;
        if (str3 != null) {
            z = c69758Vuv.A02.getBoolean(AnonymousClass001.A0R(str3, "user_remote_setting_migration_completed"), false);
        }
        String valueOf = String.valueOf(z);
        if (str2.equals("remote_setting_migration")) {
            C69690Vtg A00 = wuu.A00.A00("ccu_setting_migration_failure_event");
            if (message != null) {
                A00.A00.A0C("error_message", message);
            }
            C19280xC c19280xC = A00.A00;
            c19280xC.A0C("client_setting_status", str);
            c19280xC.A0C(AbstractC43591JPw.A00(424), valueOf);
            A00.A00();
        }
        Iterator it = wgo.A0Q.A00.iterator();
        while (it.hasNext()) {
            C69690Vtg A002 = ((WUU) it.next()).A00.A00("ccu_setting_failed_event");
            String string = bundle.getString("client_ccu_enabled");
            C19280xC c19280xC2 = A002.A00;
            c19280xC2.A0C("client_ccu_enabled", string);
            c19280xC2.A0C(CacheBehaviorLogger.SOURCE, bundle.getString(CacheBehaviorLogger.SOURCE));
            c19280xC2.A0C("failure_message", bundle.getString("failure_message"));
            A002.A00();
        }
    }
}
