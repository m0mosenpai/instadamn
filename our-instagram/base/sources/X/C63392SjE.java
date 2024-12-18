package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.zzq;
import com.google.android.gms.dynamite.zzr;
import com.google.android.gms.internal.common.zza;
import com.instagram.debug.devoptions.debughead.util.MemoryUtil;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.SjE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63392SjE {
    public static int A01 = -1;
    public static zzq A02;
    public static zzr A03;
    public static Boolean A04;
    public static Boolean A05;
    public static String A06;
    public static boolean A07;
    public final Context A00;
    public static final ThreadLocal A0B = new ThreadLocal();
    public static final ThreadLocal A0D = new ThreadLocal();
    public static final InterfaceC65514Tlj A0C = new Object();
    public static final InterfaceC65409Tjg A0A = new Object();
    public static final InterfaceC65409Tjg A09 = new Object();
    public static final InterfaceC65409Tjg A08 = new Object();

    public static int A02(Context context, String str, boolean z, boolean z2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            long longValue = ((Long) A0D.get()).longValue();
            String str2 = "api_force_staging";
            boolean z3 = true;
            if (true != z) {
                str2 = "api";
            }
            Cursor A012 = C0fI.A01(contentResolver, AbstractC31174DnI.A0B(AbstractC58320PtC.A0D().authority("com.google.android.gms.chimera").path(str2).appendPath(str), "requestStartTime", String.valueOf(longValue)), null, null, null, null, -420642211);
            if (A012 != null) {
                try {
                    try {
                        if (A012.moveToFirst()) {
                            boolean z4 = false;
                            int i = A012.getInt(0);
                            if (i > 0) {
                                synchronized (C63392SjE.class) {
                                    try {
                                        A06 = A012.getString(2);
                                        int columnIndex = A012.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            A01 = A012.getInt(columnIndex);
                                        }
                                        int columnIndex2 = A012.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (A012.getInt(columnIndex2) == 0) {
                                                z3 = false;
                                            }
                                            A07 = z3;
                                            z4 = z3;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                C62443SBw c62443SBw = (C62443SBw) A0B.get();
                                if (c62443SBw != null && c62443SBw.A00 == null) {
                                    c62443SBw.A00 = A012;
                                    A012 = null;
                                }
                            }
                            if (!z2 || !z4) {
                                return i;
                            }
                            throw new Exception("forcing fallback to container DynamiteLoader impl");
                        }
                    } catch (Exception e) {
                        e = e;
                        if (e instanceof RjO) {
                            throw e;
                        }
                        throw new Exception(AnonymousClass001.A0R("V2 version check failed: ", e.getMessage()), e);
                    }
                } finally {
                    if (A012 != null) {
                        A012.close();
                    }
                }
            }
            android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new Exception("Failed to connect to dynamite module ContentResolver.");
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.common.zza] */
    public static void A06(ClassLoader classLoader) {
        zzr zzrVar = null;
        try {
            IBinder iBinder = (IBinder) AbstractC58320PtC.A0s(classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2"));
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    ?? zzaVar = new zza("com.google.android.gms.dynamite.IDynamiteLoaderV2", iBinder);
                    C0f9.A0A(371984954, C0f9.A03(1079691494));
                    zzrVar = zzaVar;
                }
            }
            A03 = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new Exception("Failed to instantiate dynamite loader", e);
        }
    }

    public static int A00(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(AnonymousClass001.A0g("com.google.android.gms.dynamite.descriptors.", str, ".ModuleDescriptor"));
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!SSI.A01(declaredField.get(null), str)) {
                android.util.Log.e("DynamiteModule", AnonymousClass001.A11("Module descriptor id '", String.valueOf(declaredField.get(null)), "' didn't match expected id '", str, "'"));
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            android.util.Log.w("DynamiteModule", AnonymousClass001.A0g("Local module descriptor class for ", str, " not found."));
            return 0;
        } catch (Exception e) {
            AbstractC58321PtD.A1Q("Failed to load module descriptor class: ", String.valueOf(e.getMessage()), "DynamiteModule");
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c9, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00ca, code lost:
    
        r1 = new java.lang.Thread(r12, "GmsDynamite");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d1, code lost:
    
        r1.setContextClassLoader(null);
        r1.start();
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00d9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00da, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00e0, code lost:
    
        X.AbstractC58321PtD.A1P("Failed to enumerate thread/threadgroup ", r0.getMessage(), "DynamiteLoaderV2CL");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(android.content.Context r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63392SjE.A01(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0220 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0227 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0230 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.SBw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C63392SjE A04(android.content.Context r21, X.InterfaceC65409Tjg r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63392SjE.A04(android.content.Context, X.Tjg, java.lang.String):X.SjE");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.zzq A05(android.content.Context r6) {
        /*
            java.lang.Class<X.SjE> r5 = X.C63392SjE.class
            monitor-enter(r5)
            com.google.android.gms.dynamite.zzq r4 = X.C63392SjE.A02     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L57
            r4 = 0
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = r6.createPackageContext(r1, r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            java.lang.Object r3 = r0.newInstance()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            if (r3 == 0) goto L57
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r3.queryLocalInterface(r1)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            boolean r0 = r2 instanceof com.google.android.gms.dynamite.zzq     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            if (r0 == 0) goto L32
            com.google.android.gms.dynamite.zzq r2 = (com.google.android.gms.dynamite.zzq) r2     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            if (r2 == 0) goto L57
        L2f:
            X.C63392SjE.A02 = r2     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            goto L45
        L32:
            com.google.android.gms.dynamite.zzq r2 = new com.google.android.gms.dynamite.zzq     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            r0 = 52582149(0x3225705, float:4.7707415E-37)
            int r1 = X.C0f9.A03(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            r0 = -1627239747(0xffffffff9f024abd, float:-2.7590393E-20)
            X.C0f9.A0A(r0, r1)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L59
            goto L2f
        L45:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            return r2
        L47:
            r0 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r1)     // Catch: java.lang.Throwable -> L59
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L59
        L57:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            return r4
        L59:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63392SjE.A05(android.content.Context):com.google.android.gms.dynamite.zzq");
    }

    public static boolean A07(Context context) {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(null)) {
            Boolean bool2 = A05;
            if (!bool.equals(bool2)) {
                boolean z = false;
                if (bool2 == null) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
                    if (GoogleApiAvailabilityLight.A00.A03(context, MemoryUtil.MAX_ALLOC_SIZE) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(((PackageItemInfo) resolveContentProvider).packageName)) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    A05 = valueOf;
                    z = valueOf.booleanValue();
                    if (z) {
                        ApplicationInfo applicationInfo = ((ComponentInfo) resolveContentProvider).applicationInfo;
                        if (applicationInfo != null && (applicationInfo.flags & 129) == 0) {
                            A07 = true;
                        }
                        return z;
                    }
                }
                android.util.Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
                return z;
            }
        }
        return true;
    }

    public final IBinder A08(String str) {
        try {
            return (IBinder) this.A00.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new Exception("Failed to instantiate module class: ".concat(String.valueOf(str)), e);
        }
    }

    public C63392SjE(Context context) {
        C3U5.A02(context);
        this.A00 = context;
    }

    public static Parcel A03(IInterface iInterface, zza zzaVar, String str, int i) {
        Parcel A012 = zzaVar.A01();
        A012.writeStrongBinder(iInterface.asBinder());
        A012.writeString(str);
        A012.writeInt(i);
        return A012;
    }
}
