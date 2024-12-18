package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.common.build.BuildConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/* renamed from: X.11k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC210811k {
    public static String A02(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        return AnonymousClass001.A0c("Unknown (type = ", ")", i);
                    }
                    return "Provider";
                }
                return "Service";
            }
            return "Receiver";
        }
        return "Activity";
    }

    public static void A03(Context context) {
        ArrayList arrayList;
        ObjectInputStream objectInputStream;
        PackageManager packageManager = context.getPackageManager();
        context.getPackageName();
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = A00(context, packageManager, new Integer[]{1, 2, 8, 4}, 4);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 >= 0) {
            File A002 = C0eS.A00(context, 1436876361);
            A002.mkdirs();
            File[] listFiles = new File(A002, "versions").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
            int A003 = BuildConstants.A00();
            File A004 = C0eS.A00(context, 1436876361);
            A004.mkdirs();
            File file2 = new File(new File(A004, "versions"), Integer.toString(BuildConstants.A00()));
            file2.getParentFile().mkdirs();
            try {
                new FileOutputStream(file2, false).close();
                if (A003 == 1) {
                    try {
                        file2.setLastModified(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime);
                    } catch (PackageManager.NameNotFoundException unused) {
                        throw new IllegalStateException("Can't get package info for this package.");
                    }
                }
                Object obj = new Object();
                String packageName = context.getPackageName();
                if (packageName.equals("com.facebook.wakizashi") || packageName.equals("com.facebook.katana")) {
                    File A005 = C0eS.A00(context, 1436876361);
                    A005.mkdirs();
                    File file3 = new File(A005, "perflog");
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        if (file3.exists()) {
                            try {
                                objectInputStream = new ObjectInputStream(new FileInputStream(file3));
                            } catch (Exception unused2) {
                                arrayList = new ArrayList();
                            }
                            try {
                                arrayList = (ArrayList) objectInputStream.readObject();
                                objectInputStream.close();
                                arrayList2.addAll(arrayList);
                            } catch (Throwable th) {
                                try {
                                    objectInputStream.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e) {
                        C0K8.A0G("AppComponentManager", "Error reading entries from existing analytics file.", e);
                    }
                    arrayList2.add(obj);
                    if (!arrayList2.isEmpty()) {
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file3, false));
                            objectOutputStream.writeObject(arrayList2);
                            objectOutputStream.close();
                        } catch (Exception e2) {
                            C0K8.A0G("AppComponentManager", "Error writing entries to logfile.", e2);
                        }
                    }
                }
                context.getPackageName();
                return;
            } catch (IOException e3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to touch file: ");
                sb.append(file2);
                throw new RuntimeException(sb.toString(), e3);
            }
        }
        throw new RuntimeException(String.format("Failed to set enable stage %d for pkg[%s], can't resume. Duration[%s]", 3, context.getPackageName(), Long.valueOf(currentTimeMillis2 / 1000)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0 A[Catch: RuntimeException -> 0x01b8, TryCatch #0 {RuntimeException -> 0x01b8, blocks: (B:6:0x0017, B:8:0x0027, B:16:0x0037, B:19:0x00ec, B:21:0x00f0, B:23:0x00f6, B:24:0x0104, B:25:0x0107, B:26:0x0162, B:29:0x016c, B:32:0x0176, B:35:0x017d, B:38:0x0114, B:40:0x0124, B:41:0x0137, B:42:0x0187, B:43:0x013e, B:45:0x0142, B:47:0x014d, B:49:0x0153, B:51:0x0157, B:56:0x018b, B:59:0x00d6, B:60:0x003a, B:61:0x003d, B:62:0x0040, B:65:0x0047, B:67:0x008a, B:75:0x009a, B:76:0x00b1, B:77:0x00b8, B:79:0x00be, B:81:0x009d, B:82:0x00a8, B:86:0x00af, B:87:0x00a9, B:88:0x00ac, B:90:0x01a3, B:91:0x01b7), top: B:5:0x0017, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(android.content.Context r18, android.content.pm.PackageManager r19, java.lang.Integer[] r20, int r21) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC210811k.A00(android.content.Context, android.content.pm.PackageManager, java.lang.Integer[], int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        if (A01(r6, r7, r8, false) == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.pm.ComponentInfo A01(android.content.ComponentName r6, android.content.pm.PackageManager r7, int r8, boolean r9) {
        /*
            r3 = 33280(0x8200, float:4.6635E-41)
            if (r9 == 0) goto L8
            r3 = 33408(0x8280, float:4.6815E-41)
        L8:
            r2 = 4
            r1 = 2
            r0 = 1
            r5 = 0
            if (r8 == r0) goto L26
            if (r8 == r1) goto L21
            if (r8 == r2) goto L1c
            r0 = 8
            if (r8 != r0) goto L1b
            android.content.pm.ProviderInfo r5 = r7.getProviderInfo(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            return r5
        L1b:
            return r5
        L1c:
            android.content.pm.ServiceInfo r5 = r7.getServiceInfo(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            return r5
        L21:
            android.content.pm.ActivityInfo r5 = r7.getReceiverInfo(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            return r5
        L26:
            android.content.pm.ActivityInfo r5 = r7.getActivityInfo(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            return r5
        L2b:
            r0 = 0
            if (r9 == 0) goto L35
            android.content.pm.ComponentInfo r1 = A01(r6, r7, r8, r0)     // Catch: java.lang.Exception -> L35
            r0 = 1
            if (r1 != 0) goto L36
        L35:
            r0 = 0
        L36:
            java.lang.String r4 = "AppComponentManager"
            java.lang.String r3 = r6.getClassName()
            java.lang.String r2 = A02(r8)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            if (r9 == 0) goto L55
            if (r0 == 0) goto L55
            java.lang.String r0 = ", BUT succeeded without asking for metadata."
        L4a:
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1, r0}
            java.lang.String r0 = "getComponentInfo couldn't find component name[%s] type[%s] getMetaData[%s]%s"
            X.C0K8.A0O(r4, r0, r1)
            return r5
        L55:
            java.lang.String r0 = "."
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC210811k.A01(android.content.ComponentName, android.content.pm.PackageManager, int, boolean):android.content.pm.ComponentInfo");
    }
}
