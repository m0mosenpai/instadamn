package X;

import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.TransactionTooLargeException;
import com.facebook.analytics2.logger.legacy.uploader.AlarmBasedUploadService;
import java.util.Arrays;

/* renamed from: X.1tM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39981tM {
    public static C39981tM A02;
    public static final String A03 = AlarmBasedUploadService.class.getName();
    public final Context A00;
    public volatile String A01;

    public static synchronized C39981tM A00(Context context) {
        C39981tM c39981tM;
        synchronized (C39981tM.class) {
            c39981tM = A02;
            if (c39981tM == null) {
                c39981tM = new C39981tM(context.getApplicationContext());
                A02 = c39981tM;
            }
        }
        return c39981tM;
    }

    public C39981tM(Context context) {
        this.A00 = context;
    }

    public final boolean A01() {
        String str;
        String str2;
        String A00 = C1UY.A00();
        synchronized (this) {
            if (this.A01 == null) {
                String str3 = A03;
                String str4 = null;
                try {
                    Context context = this.A00;
                    ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services;
                    if (serviceInfoArr != null) {
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            if (((PackageItemInfo) serviceInfo).name.equals(str3)) {
                                str4 = ((ComponentInfo) serviceInfo).processName;
                                break;
                            }
                        }
                    }
                    C0K8.A0O("UploadServiceProcessUtil", "Unable to find the UploadService! Services registered: %s", Arrays.deepToString(serviceInfoArr));
                } catch (PackageManager.NameNotFoundException e) {
                    C0K8.A0N("UploadServiceProcessUtil", "Package %s cannot  be found!", e, this.A00.getPackageName());
                } catch (RuntimeException e2) {
                    Throwable th = e2;
                    while (th.getCause() != null) {
                        th = th.getCause();
                    }
                    if (th instanceof DeadObjectException) {
                        str2 = "DeadObjectException when trying to get package manager from context";
                    } else if (th instanceof TransactionTooLargeException) {
                        str2 = "TransactionTooLargeException Exception when trying to get package manager from context";
                    } else {
                        throw e2;
                    }
                    C0K8.A0F("UploadServiceProcessUtil", str2, e2);
                }
                this.A01 = str4;
            }
            str = this.A01;
        }
        if (str == null) {
            return false;
        }
        return str.equals(A00);
    }
}
