package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.facebook.neko.directinstall.installer.DirectInstallDownloadEvent;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService;
import com.xiaomi.market.IMarketDownloadService;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.CRC32;

/* renamed from: X.VvI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69781VvI {
    public int A00;
    public final Context A01;
    public final Handler A02 = AbstractC167007dF.A0J();
    public final C69675VtK A03;
    public final WD5 A04;
    public final C68830Vcl A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final C68831Vcm A09;

    public final void A02() {
        AtomicReference atomicReference;
        if (this instanceof USV) {
            USV usv = (USV) this;
            ((AbstractC69781VvI) usv).A04.A01("IPC_SERVICE_UNBIND_REQUESTED");
            try {
                IMarketDownloadService iMarketDownloadService = usv.A03;
                if (iMarketDownloadService != null) {
                    iMarketDownloadService.F8y(usv.A01);
                }
                usv.A08.F94(((AbstractC69781VvI) usv).A01, usv.A07);
                usv.A03 = null;
                return;
            } catch (RemoteException | IllegalArgumentException e) {
                e.getMessage();
                return;
            }
        }
        if (this instanceof USU) {
            USU usu = (USU) this;
            ServiceConnection serviceConnection = usu.A00;
            ((AbstractC69781VvI) usu).A04.A01("IPC_SERVICE_UNBIND_REQUESTED");
            XD3 xd3 = usu.A03;
            Context context = ((AbstractC69781VvI) usu).A01;
            C14360o3.A06(context);
            xd3.F94(context, serviceConnection);
            atomicReference = usu.A06;
        } else {
            if (this instanceof USS) {
                this.A04.A01("IPC_SERVICE_UNBIND_REQUESTED");
                return;
            }
            UST ust = (UST) this;
            ((AbstractC69781VvI) ust).A04.A01("IPC_SERVICE_UNBIND_REQUESTED");
            XD3 xd32 = ust.A05;
            Context context2 = ((AbstractC69781VvI) ust).A01;
            C14360o3.A06(context2);
            xd32.F94(context2, ust.A01);
            atomicReference = ust.A06;
        }
        atomicReference.set(null);
    }

    public final void A03() {
        if (this instanceof USV) {
            USV usv = (USV) this;
            WD5 wd5 = ((AbstractC69781VvI) usv).A04;
            wd5.A01("IPC_SERVICE_INSTALL_REQUESTED");
            if (usv.A03 == null) {
                wd5.A01("IPC_SERVICE_INSTALL_REQUEST_SKIPPED");
                usv.A05 = true;
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putString("ref", "insta_direct");
                bundle.putString("callerPackage", ((AbstractC69781VvI) usv).A01.getPackageName());
                bundle.putString("packageName", ((AbstractC69781VvI) usv).A06);
                long nextLong = new SecureRandom().nextLong();
                int currentTimeMillis = (int) (System.currentTimeMillis() / StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                StringBuilder sb = new StringBuilder();
                sb.append(nextLong);
                sb.append(':');
                sb.append(currentTimeMillis);
                bundle.putString("nonce", sb.toString());
                AbstractC64541TIx abstractC64541TIx = new AbstractC64541TIx('a', 'z');
                AbstractC64541TIx abstractC64541TIx2 = new AbstractC64541TIx('A', 'Z');
                ArrayList arrayList = new ArrayList();
                AnonymousClass016.A16(abstractC64541TIx, arrayList);
                AnonymousClass016.A16(abstractC64541TIx2, arrayList);
                ArrayList A0S = AbstractC001800i.A0S(new AbstractC64541TIx('0', '9'), arrayList);
                C17u c17u = new C17u(1, 10);
                ArrayList A0i = AbstractC167007dF.A0i(c17u);
                Iterator it = c17u.iterator();
                while (it.hasNext()) {
                    ((AbstractC16880sg) it).A00();
                    C50722Ut c50722Ut = AbstractC50712Us.A00;
                    AbstractC166997dE.A1W(A0i, AbstractC50712Us.A01.A06(0, A0S.size()));
                }
                ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
                Iterator it2 = A0i.iterator();
                while (it2.hasNext()) {
                    A0i2.add(A0S.get(AbstractC167007dF.A0B(it2)));
                }
                String A0P = AbstractC001800i.A0P("", "", "", A0i2, null);
                String A0R = AnonymousClass001.A0R(A0P, "mimarket");
                CRC32 crc32 = new CRC32();
                crc32.update(MSY.A1a(A0R));
                long value = crc32.getValue();
                StringBuilder A11 = AbstractC166997dE.A11(A0P);
                A11.append(':');
                A11.append(value);
                String obj = A11.toString();
                usv.A04 = obj;
                bundle.putString("requestId", obj);
                bundle.putString("referrer", ((AbstractC69781VvI) usv).A07);
                bundle.toString();
                if (!usv.A03.AQF(bundle)) {
                    usv.A02();
                    return;
                } else {
                    wd5.A01("IPC_SERVICE_INSTALL_START");
                    return;
                }
            } catch (RemoteException | SecurityException e) {
                WD5.A00(null, wd5, null, "FAILED_INSTALL", e.getMessage());
                return;
            }
        }
        if (this instanceof USU) {
            USU usu = (USU) this;
            WD5 wd52 = ((AbstractC69781VvI) usu).A04;
            wd52.A01("IPC_SERVICE_INSTALL_REQUESTED");
            IGalaxyStoreDownloadService iGalaxyStoreDownloadService = (IGalaxyStoreDownloadService) usu.A06.get();
            if (iGalaxyStoreDownloadService == null) {
                wd52.A01("IPC_SERVICE_INSTALL_REQUEST_SKIPPED");
                return;
            }
            try {
                iGalaxyStoreDownloadService.AQG(USU.A00(usu, true), usu.A04);
                wd52.A01("IPC_SERVICE_INSTALL_START");
                return;
            } catch (RemoteException e2) {
                WD5.A00(null, wd52, null, "FAILED_INSTALL", e2.getMessage());
                ((AbstractC69781VvI) usu).A03.A00(VDE.A04);
                return;
            }
        }
        if (this instanceof USS) {
            WD5 wd53 = this.A04;
            wd53.A01("IPC_SERVICE_INSTALL_REQUESTED");
            try {
                throw new C141786av(MSV.A00(144));
            } catch (Exception e3) {
                WD5.A00(null, wd53, null, "FAILED_INSTALL", e3.getMessage());
                this.A03.A00(VDE.A04);
                return;
            }
        }
        WD5 wd54 = this.A04;
        wd54.A01("IPC_SERVICE_INSTALL_REQUESTED");
        wd54.A01("IPC_SERVICE_INSTALL_REQUEST_SKIPPED");
    }

    public final void A04(EnumC68128VCm enumC68128VCm, VDE vde, String str, String str2) {
        if (enumC68128VCm != null) {
            this.A03.A01(new DirectInstallDownloadEvent(enumC68128VCm, vde));
        } else {
            this.A03.A00(vde);
        }
        A02();
        boolean equals = "SUCCESS_INSTALL".equals(str);
        WD5 wd5 = this.A04;
        if (equals) {
            WD5.A00(null, wd5, null, "SUCCESS_INSTALL", null);
            C68830Vcl c68830Vcl = this.A05;
            Context context = this.A01;
            String str3 = this.A06;
            AbstractC167017dG.A1O(context, wd5);
            C69195VjO A00 = AbstractC68315VMb.A00(c68830Vcl.A00);
            if (A00.A00) {
                if (A00.A02.getBoolean(AbstractC111324zv.A00(583), C18U.A06(C06090Tz.A05, A00.A01.A00, 36317109583680298L)) && str3.length() != 0) {
                    if (!C0b3.A00().A0A().A0G(context, context.getPackageManager().getLaunchIntentForPackage(str3))) {
                        wd5.A01("FAILED_APP_OPEN");
                        return;
                    } else {
                        wd5.A01("AUTO_APP_OPEN");
                        return;
                    }
                }
                return;
            }
            return;
        }
        WD5.A00(null, wd5, null, "FAILED_INSTALL", str2);
    }

    public AbstractC69781VvI(Context context, C69406Vmq c69406Vmq, String str) {
        this.A01 = context;
        this.A06 = c69406Vmq.A05;
        this.A03 = c69406Vmq.A00;
        this.A07 = c69406Vmq.A06;
        this.A04 = c69406Vmq.A01;
        this.A05 = c69406Vmq.A03;
        this.A08 = str;
        this.A09 = c69406Vmq.A04;
    }
}
