package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;

/* renamed from: X.Rqv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61631Rqv {
    public static int A00(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                } else {
                    return -1;
                }
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && C02O.A00(packageName2, packageName)) {
                noteProxyOpNoThrow = AbstractC61624Rqo.A00(context, permissionToOp, packageName, myUid);
            } else {
                noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            }
            if (noteProxyOpNoThrow == 0) {
                return 0;
            }
            return -2;
        }
        return -1;
    }
}
