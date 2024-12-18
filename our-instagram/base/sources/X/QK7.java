package X;

import android.os.RemoteException;
import com.facebook.neko.directinstall.installer.FakeXiaomiStoreDownloadService;
import com.xiaomi.market.IDownloadCallback;

/* loaded from: classes10.dex */
public final class QK7 extends AbstractC46515KiE {
    public final /* synthetic */ FakeXiaomiStoreDownloadService A00;

    public QK7(FakeXiaomiStoreDownloadService fakeXiaomiStoreDownloadService) {
        this.A00 = fakeXiaomiStoreDownloadService;
    }

    @Override // X.AbstractC46515KiE
    public final void A01(Integer num) {
        float f;
        String str;
        FakeXiaomiStoreDownloadService fakeXiaomiStoreDownloadService = this.A00;
        IDownloadCallback iDownloadCallback = fakeXiaomiStoreDownloadService.A00;
        String str2 = fakeXiaomiStoreDownloadService.A01;
        if (iDownloadCallback == null) {
            str = "sendEvent: callback shouldn't be null.";
        } else if (str2 == null) {
            str = "sendEvent: packageName shouldn't be null.";
        } else {
            try {
                switch (num.intValue()) {
                    case 0:
                        iDownloadCallback.DoN(str2, 2, "Download Waiting");
                        return;
                    case 1:
                        iDownloadCallback.DoN(str2, 3, "Download Started");
                        return;
                    case 2:
                        f = 20.0f;
                        break;
                    case 3:
                        f = 50.0f;
                        break;
                    case 4:
                        f = 70.0f;
                        break;
                    case 5:
                        f = 100.0f;
                        break;
                    case 6:
                        iDownloadCallback.DoN(str2, 6, "Install Started");
                        return;
                    case 7:
                        iDownloadCallback.DoN(str2, 9, "Install Successful");
                        return;
                    case 8:
                        iDownloadCallback.DEI(str2, 23, MSV.A00(164));
                        return;
                    case 9:
                        iDownloadCallback.DEI(str2, 37, "Insufficient space before installation");
                        return;
                    case 10:
                        iDownloadCallback.DEI(str2, 1, "N/A - There is no installation package for this model.");
                        return;
                    default:
                        return;
                }
                iDownloadCallback.Dc0(str2, f, 100L);
                return;
            } catch (RemoteException e) {
                C0K8.A0F("FakeXiaomiStoreDownloadService", str2, e);
                return;
            }
        }
        C0K8.A0C("FakeXiaomiStoreDownloadService", str);
    }
}
