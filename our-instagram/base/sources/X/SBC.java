package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;

/* loaded from: classes10.dex */
public final class SBC {
    public final SBD A00;

    public SBC(Context context, PackageManager packageManager, C1Ro c1Ro) {
        SBD sbd;
        ProviderInfo resolveContentProvider;
        IllegalArgumentException illegalArgumentException;
        c1Ro.A00();
        c1Ro.A00.A00();
        C1TO A00 = c1Ro.A01.A00();
        try {
            resolveContentProvider = packageManager.resolveContentProvider(S8g.A01, 0);
        } catch (Exception e) {
            sbd = new SBD(e);
        }
        if (resolveContentProvider != null) {
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(((PackageItemInfo) resolveContentProvider).packageName, ((PackageItemInfo) resolveContentProvider).name));
            if (componentEnabledSetting != 0) {
                if (componentEnabledSetting != 1 && componentEnabledSetting != 2) {
                    illegalArgumentException = AbstractC25230BEn.A0n("Unexpected component setting: ", componentEnabledSetting);
                    sbd = new SBD(illegalArgumentException);
                    this.A00 = sbd;
                    if (A00 != null && A00.A05) {
                        A00.A04.contains(C1TL.INSTALL);
                    }
                    AbstractC61801Rtv.A00(context);
                }
            } else {
                resolveContentProvider.isEnabled();
            }
        }
        illegalArgumentException = null;
        sbd = new SBD(illegalArgumentException);
        this.A00 = sbd;
        if (A00 != null) {
            A00.A04.contains(C1TL.INSTALL);
        }
        AbstractC61801Rtv.A00(context);
    }
}
