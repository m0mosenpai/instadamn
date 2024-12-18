package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.TEe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64445TEe implements C1CT {
    public final Context A00;
    public final TelephonyManager A01;
    public final AbstractC12990ll A02;
    public final PackageInfo A03;
    public final PackageManager A04;
    public final C18920wW A05;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // X.C1CT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CjD(X.C74803Xr r14) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64445TEe.CjD(X.3Xr):void");
    }

    public C64445TEe(Context context, AbstractC12990ll abstractC12990ll) {
        this.A02 = abstractC12990ll;
        this.A00 = context;
        this.A05 = AbstractC12220kQ.A01(C1CU.A00, abstractC12990ll);
        PackageManager packageManager = context.getPackageManager();
        this.A04 = packageManager;
        PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        C14360o3.A07(packageInfo);
        this.A03 = packageInfo;
        Object systemService = context.getSystemService("phone");
        C14360o3.A0C(systemService, AbstractC111324zv.A00(478));
        this.A01 = (TelephonyManager) systemService;
    }

    public static final String A00() {
        int intValue = AbstractC15820qc.A04().A01.intValue();
        if (intValue == 0) {
            return "unknown";
        }
        if (intValue != 2) {
            if (intValue != 1) {
                if (intValue == 3) {
                    return "unknown";
                }
                throw B4Z.A00();
            }
            return NetInfoModule.CONNECTION_TYPE_WIFI;
        }
        return NetInfoModule.CONNECTION_TYPE_CELLULAR;
    }
}
