package X;

import com.facebook.neko.directinstall.installer.DirectInstallDownloadEvent;
import com.google.common.collect.HashBiMap;

/* renamed from: X.VtK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69675VtK {
    public final /* synthetic */ WD7 A00;

    public C69675VtK(WD7 wd7) {
        this.A00 = wd7;
    }

    public final /* synthetic */ void A00(VDE vde) {
        A01(new DirectInstallDownloadEvent(vde));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(DirectInstallDownloadEvent directInstallDownloadEvent) {
        int i;
        double d;
        int i2;
        WD7 wd7 = this.A00;
        HashBiMap hashBiMap = WD7.A09;
        synchronized (wd7.A04) {
            C66624UPm c66624UPm = wd7.A02;
            i = c66624UPm.A02;
            d = c66624UPm.A00;
            i2 = c66624UPm.A01;
            Integer num = (Integer) WD7.A09.get(directInstallDownloadEvent.A02);
            if (num != null) {
                i = num.intValue();
            }
            Double d2 = directInstallDownloadEvent.A01;
            if (d2 != null) {
                d = d2.doubleValue();
            }
            EnumC68128VCm enumC68128VCm = directInstallDownloadEvent.A00;
            if (enumC68128VCm != null) {
                Integer num2 = (Integer) WD7.A08.get(enumC68128VCm);
                if (num2 != null) {
                    i2 = num2.intValue();
                    d = 0.0d;
                }
            } else {
                i2 = 0;
            }
        }
        WD7.A00(wd7, d, i, i2);
    }
}
