package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.endtoend.EndToEnd;
import com.facebook.neko.directinstall.installer.SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class USU extends AbstractC69781VvI {
    public final ServiceConnection A00;
    public final ServiceConnection A01;
    public final Handler A02;
    public final XD3 A03;
    public final IGalaxyStoreDownloadCallback A04;
    public final AtomicReference A05;
    public final AtomicReference A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USU(Context context, C69406Vmq c69406Vmq) {
        super(context, c69406Vmq, AbstractC111324zv.A00(2415));
        Object qk8;
        if (!VZE.A00.get() && !EndToEnd.isRunningEndToEndTest()) {
            qk8 = new Object();
        } else {
            qk8 = new QK8();
        }
        this.A03 = (XD3) qk8;
        this.A02 = AbstractC167007dF.A0J();
        AtomicReference atomicReference = new AtomicReference();
        this.A06 = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.A05 = atomicReference2;
        this.A00 = new WII(this, atomicReference, true);
        this.A01 = new WII(this, atomicReference2, false);
        this.A04 = new SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1(this);
        super.A00 = -1;
    }

    public static final Bundle A00(USU usu, boolean z) {
        String str = ((AbstractC69781VvI) usu).A06;
        String A0g = AnonymousClass001.A0g("https://apps.samsung.com/appquery/appDetail.as?appId=", str, "&nonOrgType=fce692ba&ads=3b9e00d3&referrer=");
        String str2 = usu.A07;
        try {
            str2 = URLEncoder.encode(str2, "utf-8");
            C0K8.A0O("DirectInstallAgentManagerSamsung", "%s %s", A0g, str2);
        } catch (UnsupportedEncodingException e) {
            C0K8.A0F("DirectInstallAgentManagerSamsung", "Referrer cannot be encoded.", e);
        }
        Bundle bundle = new Bundle();
        bundle.putString("linkInfo", AnonymousClass001.A0R(A0g, str2));
        if (z) {
            bundle.putString("packageName", str);
            bundle.putString("ads", "3b9e00d3");
            bundle.putString("installReferrer", "fb_direct");
        }
        return bundle;
    }

    public static final void A01(ServiceConnection serviceConnection, USU usu) {
        WD5 wd5 = ((AbstractC69781VvI) usu).A04;
        wd5.A01("IPC_SERVICE_BIND_REQUESTED");
        try {
            Intent intent = new Intent();
            intent.setClassName(AbstractC58317Pt9.A00(255), "com.sec.android.app.samsungapps.downloadservice.GalaxyStoreDownloadService");
            XD3 xd3 = usu.A03;
            Context context = ((AbstractC69781VvI) usu).A01;
            C14360o3.A06(context);
            if (!xd3.ADo(context, intent, serviceConnection)) {
                WD5.A00(VHi.ERROR_SERVICE_UNAVAILABLE, wd5, null, "FAILED_SERVICE_CONNECTION", null);
                ((AbstractC69781VvI) usu).A03.A00(VDE.A04);
                usu.A02();
            }
        } catch (SecurityException e) {
            WD5.A00(null, wd5, null, "FAILED_SERVICE_CONNECTION", e.getMessage());
            ((AbstractC69781VvI) usu).A03.A00(VDE.A04);
            usu.A02();
        }
    }
}
