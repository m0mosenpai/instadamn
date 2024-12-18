package X;

import android.os.RemoteException;
import com.facebook.neko.directinstall.installer.FakeGalaxyStoreDownloadService;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback;

/* loaded from: classes10.dex */
public final class QK6 extends AbstractC46515KiE {
    public final /* synthetic */ FakeGalaxyStoreDownloadService A00;

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001f. Please report as an issue. */
    @Override // X.AbstractC46515KiE
    public final void A01(Integer num) {
        int i;
        float f;
        String str;
        C14360o3.A0B(num, 0);
        FakeGalaxyStoreDownloadService fakeGalaxyStoreDownloadService = this.A00;
        IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback = fakeGalaxyStoreDownloadService.A00;
        String str2 = fakeGalaxyStoreDownloadService.A01;
        if (iGalaxyStoreDownloadCallback == null) {
            str = "sendEvent: callback shouldn't be null.";
        } else if (str2 == null) {
            str = "sendEvent: packageName shouldn't be null.";
        } else {
            try {
                switch (num.intValue()) {
                    case 0:
                        iGalaxyStoreDownloadCallback.DoN(str2, 0, "Download Waiting");
                        return;
                    case 1:
                        iGalaxyStoreDownloadCallback.DoN(str2, 1, "Download Started");
                        return;
                    case 2:
                        f = 0.2f;
                        iGalaxyStoreDownloadCallback.Dc0(str2, f, 100L);
                        return;
                    case 3:
                        f = 0.5f;
                        iGalaxyStoreDownloadCallback.Dc0(str2, f, 100L);
                        return;
                    case 4:
                        f = 0.7f;
                        iGalaxyStoreDownloadCallback.Dc0(str2, f, 100L);
                        return;
                    case 5:
                        f = 1.0f;
                        iGalaxyStoreDownloadCallback.Dc0(str2, f, 100L);
                        return;
                    case 6:
                        iGalaxyStoreDownloadCallback.DoN(str2, 3, "Install Started");
                        return;
                    case 7:
                        iGalaxyStoreDownloadCallback.DoN(str2, 4, "Install Successful");
                        return;
                    case 8:
                        i = 100001;
                        iGalaxyStoreDownloadCallback.DEH(str2, i);
                        return;
                    case 9:
                        i = -4;
                        iGalaxyStoreDownloadCallback.DEH(str2, i);
                        return;
                    case 10:
                        i = 1004;
                        iGalaxyStoreDownloadCallback.DEH(str2, i);
                        return;
                    default:
                        throw B4Z.A00();
                }
            } catch (RemoteException e) {
                C0K8.A0F("FakeGalaxyStoreDownloadService", str2, e);
                return;
            }
        }
        C0K8.A0C("FakeGalaxyStoreDownloadService", str);
    }

    public QK6(FakeGalaxyStoreDownloadService fakeGalaxyStoreDownloadService) {
        this.A00 = fakeGalaxyStoreDownloadService;
    }
}
