package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

/* renamed from: X.2SL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2SL {
    public static C2SL A05;
    public static C2SL A06;
    public boolean A00;
    public final Context A01;
    public final SparseArray A02 = new SparseArray();
    public final Class A03;
    public final String A04;

    public static synchronized C2SL A00(Context context, int i) {
        C2SL c2sl;
        synchronized (C2SL.class) {
            if (i != 0) {
                c2sl = A05;
                if (c2sl == null) {
                    c2sl = new C2SL(context.getApplicationContext(), 1);
                    A05 = c2sl;
                }
            } else {
                c2sl = A06;
                if (c2sl == null) {
                    c2sl = new C2SL(context.getApplicationContext(), 0);
                    A06 = c2sl;
                }
            }
        }
        return c2sl;
    }

    public C2SL(Context context, int i) {
        String str;
        int i2;
        RuntimeException runtimeException;
        RuntimeException runtimeException2;
        this.A01 = context;
        if (i != 0) {
            this.A03 = GcmTaskServiceCompat.class;
            str = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
        } else {
            this.A03 = JobServiceCompat.class;
            str = "android.permission.BIND_JOB_SERVICE";
        }
        this.A04 = str;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(((PackageItemInfo) context.getApplicationInfo()).packageName, 4740);
            int i3 = packageInfo.versionCode;
            int A00 = BuildConstants.A00();
            if (i3 != A00) {
                C0K8.A0Q("ServiceInfoParser", "Version Codes do not match!packageManager: %d buildConstant: %d updatedPackageManager: %d", Integer.valueOf(i3), Integer.valueOf(A00), Integer.valueOf(context.createPackageContext(context.getPackageName(), 0).getPackageManager().getPackageInfo(((PackageItemInfo) context.getApplicationInfo()).packageName, 4740).versionCode));
                this.A00 = true;
            } else {
                this.A00 = false;
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (this.A04.equals(serviceInfo.permission)) {
                        try {
                            SparseArray sparseArray = this.A02;
                            Class cls = this.A03;
                            synchronized (C2SL.class) {
                                Bundle bundle = ((PackageItemInfo) serviceInfo).metaData;
                                if (bundle != null && (i2 = bundle.getInt("com.facebook.common.jobscheduler.compat.jobIds")) != 0) {
                                    try {
                                        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i2);
                                        for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                                            try {
                                                int resourceId = obtainTypedArray.getResourceId(i4, 0);
                                                if (resourceId != 0) {
                                                    try {
                                                        if (sparseArray.get(resourceId) == null) {
                                                            Class<?> cls2 = Class.forName(((PackageItemInfo) serviceInfo).name);
                                                            if (cls.isAssignableFrom(cls2)) {
                                                                sparseArray.put(resourceId, cls2);
                                                            } else {
                                                                runtimeException2 = new RuntimeException(AnonymousClass001.A0u("Service class of ", cls2.getName(), " is not assignable to:  ", cls.getName()));
                                                            }
                                                        } else {
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append("Duplicate jobId: ");
                                                            sb.append(String.valueOf(resourceId));
                                                            sb.append(" detected for class: ");
                                                            sb.append(sparseArray.get(resourceId));
                                                            sb.append(" and ");
                                                            sb.append(((PackageItemInfo) serviceInfo).name);
                                                            runtimeException2 = new RuntimeException(sb.toString());
                                                        }
                                                        throw runtimeException2;
                                                        break;
                                                    } catch (ClassNotFoundException e) {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append("Unable to resolve service class ");
                                                        sb2.append(((PackageItemInfo) serviceInfo).name);
                                                        sb2.append(" class_loader: ");
                                                        boolean z = true;
                                                        for (ClassLoader classLoader = C2SL.class.getClassLoader(); classLoader != null; classLoader = classLoader.getParent()) {
                                                            if (z) {
                                                                z = false;
                                                            } else {
                                                                sb2.append("->");
                                                            }
                                                            sb2.append(classLoader.getClass().getCanonicalName());
                                                        }
                                                        runtimeException = new RuntimeException(sb2.toString(), e);
                                                    }
                                                } else {
                                                    runtimeException = new RuntimeException("value not found");
                                                }
                                                throw runtimeException;
                                            } catch (Throwable th) {
                                                obtainTypedArray.recycle();
                                                throw th;
                                                break;
                                            }
                                        }
                                        obtainTypedArray.recycle();
                                    } catch (Resources.NotFoundException e2) {
                                        throw new RuntimeException(e2);
                                    }
                                } else {
                                    throw new Exception(AnonymousClass001.A0u("Service ", ((PackageItemInfo) serviceInfo).name, " is missing meta key ", "com.facebook.common.jobscheduler.compat.jobIds"));
                                }
                            }
                        } catch (C2SN e3) {
                            C0K8.A0D("ServiceInfoParser", e3.toString());
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }
}
