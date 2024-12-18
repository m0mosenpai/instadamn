package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.facebook.endtoend.EndToEnd;
import com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager$2;
import com.xiaomi.market.IMarketDownloadService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class USV extends AbstractC69781VvI {
    public int A00;
    public XiaomiDirectInstallAgentManager$2 A01;
    public C68831Vcm A02;
    public IMarketDownloadService A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final ServiceConnection A07;
    public final XD3 A08;
    public final C41672Id1 A09;
    public final Map A0A;

    public static int A00(USV usv) {
        int i = 1;
        try {
            IMarketDownloadService iMarketDownloadService = usv.A03;
            if (iMarketDownloadService == null) {
                return 1;
            }
            i = iMarketDownloadService.AXk();
            return i;
        } catch (RemoteException e) {
            e.getMessage();
            return i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public USV(Context context, C69406Vmq c69406Vmq) {
        super(context, c69406Vmq, "xiaomi");
        QK9 qk9;
        if (!VZE.A00.get() && !EndToEnd.isRunningEndToEndTest()) {
            qk9 = new Object();
        } else {
            qk9 = new QK9();
        }
        C41672Id1 c41672Id1 = C41672Id1.A00;
        this.A0A = new HashMap();
        this.A03 = null;
        this.A05 = false;
        this.A04 = null;
        this.A06 = false;
        this.A00 = 0;
        this.A07 = new WIJ(this, 2);
        this.A01 = new XiaomiDirectInstallAgentManager$2(this);
        Map map = this.A0A;
        map.put(-1, "STATUS_NONE");
        map.put(0, "STATUS_WAITING");
        map.put(1, "STATUS_CONNECTING");
        map.put(2, "STATUS_PENDING");
        map.put(3, "STATUS_DOWNLOADING");
        map.put(4, "STATUS_PAUSED");
        map.put(5, "STATUS_VERIFYING");
        map.put(6, "STATUS_INSTALLING");
        map.put(7, "STATUS_WAITING_INSTALL");
        map.put(8, "STATUS_FAILED");
        map.put(9, "STATUS_SUCCESS");
        this.A08 = qk9;
        super.A00 = 1006;
        this.A09 = c41672Id1;
        this.A02 = c69406Vmq.A04;
    }

    public static boolean A01(USV usv) {
        Intent intent = new Intent();
        WD5 wd5 = ((AbstractC69781VvI) usv).A04;
        wd5.A01("IPC_SERVICE_BIND_REQUESTED");
        intent.setComponent(new ComponentName(AbstractC111324zv.A00(2157), "com.xiaomi.market.data.MarketDownloadService"));
        XD3 xd3 = usv.A08;
        Context context = ((AbstractC69781VvI) usv).A01;
        ServiceConnection serviceConnection = usv.A07;
        boolean ADo = xd3.ADo(context, intent, serviceConnection);
        if (!ADo) {
            wd5.A01("FALLBACK_TO_XIAOMI_DISCOVER_SERVICE");
            intent.setComponent(new ComponentName(AbstractC111324zv.A00(2156), "com.xiaomi.market.data.MarketDownloadService"));
            return xd3.ADo(context, intent, serviceConnection);
        }
        return ADo;
    }
}
