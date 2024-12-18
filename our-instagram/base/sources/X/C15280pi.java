package X;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import dalvik.system.VMRuntime;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0pi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15280pi implements C0N9 {
    public final int A00;
    public final Object A01;

    public C15280pi(C0HR c0hr, int i) {
        this.A00 = i;
        switch (i) {
            case 7:
            case 8:
            case 9:
                this.A01 = c0hr;
                return;
            default:
                this.A01 = c0hr;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C0N9
    public final /* bridge */ /* synthetic */ Object ALP(final C0NK c0nk) {
        final C04140Kg c04140Kg;
        final C0Pe A05;
        final Application application;
        final long j;
        final Integer num;
        switch (this.A00) {
            case 0:
                throw new IllegalStateException("Missing ConfigFactory<Detector> implementation");
            case 1:
                InterfaceC08830cm interfaceC08830cm = (InterfaceC08830cm) this.A01;
                return new C03040Cf(c0nk.A04(), c0nk.A05(), interfaceC08830cm);
            case 2:
                C0Pe A052 = c0nk.A05();
                final Application application2 = (Application) this.A01;
                final C0LW A04 = c0nk.A04();
                final File file = A052.A05;
                C02R.A03(file, "Did you call SessionManager.init()?");
                return new C0OO(application2, A04, file) { // from class: X.07w
                    public final Application A00;
                    public final C0LW A01;
                    public final File A02;

                    @Override // X.C0OO
                    public final /* synthetic */ C0Z0 BNJ() {
                        return null;
                    }

                    @Override // X.C0OO
                    public final C0OP BW2() {
                        return C0OP.A0D;
                    }

                    {
                        this.A00 = application2;
                        this.A01 = A04;
                        this.A02 = file;
                    }

                    @Override // X.C0OO
                    public final /* synthetic */ int BDP() {
                        return 100000;
                    }

                    @Override // X.C0OO
                    public final void start() {
                        try {
                            File cacheDir = this.A00.getCacheDir();
                            File file2 = null;
                            if (cacheDir != null) {
                                String A0R = AnonymousClass001.A0R(cacheDir.getCanonicalPath(), "/webview_embedded/Helium Crashpad/pending/");
                                File file3 = new File(A0R);
                                if (!file3.isDirectory()) {
                                    C0K8.A0O("HeliumCrashReporter", "Pending crash path %s is not a directory", A0R);
                                    return;
                                }
                                File[] listFiles = file3.listFiles();
                                if (listFiles != null) {
                                    ArrayList arrayList = new ArrayList();
                                    long currentTimeMillis = System.currentTimeMillis() - 1209600000;
                                    for (File file4 : listFiles) {
                                        if (file4.lastModified() < currentTimeMillis) {
                                            arrayList.add(file4);
                                        } else if (!file4.isFile() || !file4.getName().endsWith(".dmp")) {
                                            C0K8.A0P("HeliumCrashReporter", "Not reading %s as a minidump file", file4.getName());
                                        } else if (file2 == null) {
                                            file2 = file4;
                                        }
                                    }
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        ((File) it.next()).delete();
                                    }
                                    if (file2 != null) {
                                        File file5 = new File(this.A02, file2.getName());
                                        if (file2.renameTo(file5)) {
                                            C024209q c024209q = new C024209q(null);
                                            try {
                                                c024209q.A03(C0LK.A4x, "helium_renderer_crash");
                                                c024209q.A02(C0LK.A1X, Long.valueOf(System.currentTimeMillis() / 1000));
                                                c024209q.A02(C0LK.A3E, Long.valueOf(file2.lastModified() / 1000));
                                                c024209q.A02(C0LK.A2I, Long.valueOf(file2.lastModified()));
                                            } catch (Throwable th) {
                                                C0PC.A00().DEh("HeliumDetectorData", th, null);
                                                c024209q.A03(C0LK.A67, th.getMessage());
                                            }
                                            C0LP c0lp = C0LP.A0C;
                                            C0M6 c0m6 = C0M6.LARGE_REPORT;
                                            c024209q.A04(c0lp, c0m6, file5);
                                            C0LW c0lw = this.A01;
                                            c0lw.A0E(c0m6, this);
                                            c0lw.A08(c024209q, c0m6, this);
                                            c0lw.A0D(c0m6, this);
                                        }
                                    }
                                }
                            }
                        } catch (IOException e) {
                            C0K8.A0G("lacrima", "Could not read crash cache directory", e);
                            C0PC.A00().DEh("HeliumDetectorStart", e, null);
                        }
                    }
                };
            case 3:
                final C0Pe A053 = c0nk.A05();
                final C0LW A042 = c0nk.A04();
                final InterfaceC08830cm interfaceC08830cm2 = (InterfaceC08830cm) this.A01;
                return new C0OO(A042, A053, interfaceC08830cm2) { // from class: X.07u
                    public final C0LW A00;
                    public final C0Pe A01;
                    public final InterfaceC08830cm A02;

                    @Override // X.C0OO
                    public final /* synthetic */ C0Z0 BNJ() {
                        return null;
                    }

                    @Override // X.C0OO
                    public final C0OP BW2() {
                        return C0OP.A0G;
                    }

                    @Override // X.C0OO
                    public final void start() {
                        Runnable runnable;
                        if (C0M4.A01 != 2) {
                            C0LW.A0J.add("JavaAppDeathDetector");
                            C0Pe c0Pe = this.A01;
                            C0PB.A00("JavaAppDeathDetector");
                            C0K8.A0P("lacrima", "Start JavaAppDeathCrashDetector... %s", getClass().getName());
                            C0MF c0mf = (C0MF) this.A02.get();
                            if (c0mf.A06) {
                                char c = c0mf.A01;
                                if (C0MG.A02(C05F.A01, c)) {
                                    C0PA.A00("JavaAppDeathDetector", Collections.singletonMap("detected", RealtimeSubscription.GRAPHQL_MQTT_VERSION));
                                    C024209q c024209q = new C024209q(null);
                                    if (!C0M4.A00()) {
                                        c024209q.A01(C0LK.A16, 1);
                                        c024209q.A02(C0LK.A1X, Long.valueOf(System.currentTimeMillis() / 1000));
                                        if (C0PD.A03) {
                                            c024209q.A00(C0LK.A0C, true);
                                        }
                                        c024209q.A03(C0LK.A4Q, String.valueOf(c));
                                        this.A00.A09(c024209q, C0M6.CRITICAL_REPORT, this);
                                    } else if (C0M4.A01 == 4 && (runnable = C0LW.A0G) != null) {
                                        runnable.run();
                                        C0LW.A0G = null;
                                    }
                                    if (new File(c0Pe.A02(c0Pe.A07), "large_suppl_java_detect_prop.txt").exists()) {
                                        this.A00.A09(c024209q, C0M6.LARGE_REPORT, this);
                                        return;
                                    }
                                    return;
                                }
                            }
                            C0PA.A00("JavaAppDeathDetector", Collections.singletonMap("detected", "0"));
                        }
                    }

                    {
                        this.A01 = A053;
                        this.A00 = A042;
                        this.A02 = interfaceC08830cm2;
                    }

                    @Override // X.C0OO
                    public final /* synthetic */ int BDP() {
                        return 100000;
                    }
                };
            case 4:
                return new C0L1(c0nk.A0J, (C04230Kp) this.A01, (C0PI) c0nk.A06().get());
            case 5:
                C0LW A043 = c0nk.A04();
                return new C14630ob(A043, (C005801x) A043.A05(C005801x.class));
            case 6:
                final Application application3 = (Application) this.A01;
                final C0Pe A054 = c0nk.A05();
                final C0NN c0nn = (C0NN) c0nk.A0Z.get();
                return new C0LR(application3, c0nn, c0nk, A054, this) { // from class: X.0hU
                    public Application A00;
                    public C0NN A01;
                    public C0Pe A02;
                    public final /* synthetic */ C0NK A03;
                    public final /* synthetic */ C15280pi A04;

                    {
                        this.A04 = this;
                        this.A03 = c0nk;
                        this.A00 = application3;
                        this.A02 = A054;
                        this.A01 = c0nn;
                    }

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A1F;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    public static File A00(Context context) {
                        String vmInstructionSet;
                        File parentFile = new File(context.getApplicationInfo().publicSourceDir).getParentFile();
                        if (parentFile == null || (vmInstructionSet = VMRuntime.getRuntime().vmInstructionSet()) == null) {
                            return null;
                        }
                        return new File(parentFile, "oat/".concat(vmInstructionSet));
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(28:1|(5:88|89|90|91|92)|3|(22:83|84|8|9|10|(1:12)|13|(4:15|(1:21)|22|(2:24|(5:26|(1:28)|29|(1:31)|32)(1:33)))|34|(1:36)(1:77)|37|(1:39)|40|(1:42)(1:76)|43|(2:45|(2:47|(2:49|(1:51)(1:52))))|53|(2:55|(2:57|(2:59|(1:61)(1:62))))|63|(2:65|(2:67|(2:69|(1:71)(1:72))))|73|74)|5|6|7|8|9|10|(0)|13|(0)|34|(0)(0)|37|(0)|40|(0)(0)|43|(0)|53|(0)|63|(0)|73|74|(1:(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c2, code lost:
                    
                        r3 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c3, code lost:
                    
                        X.C0PC.A00().DEh("AppInfoCollect", r3, null);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d6, code lost:
                    
                        r1 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d7, code lost:
                    
                        X.C0K8.A0H("lacrima", "Returning the new previous build id failed", r1);
                        X.C0PC.A00().DEh("StartupConfigPrevBuildIdReturning", r1, null);
                        r0 = 0;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x0127 A[Catch: NameNotFoundException -> 0x01c2, TryCatch #2 {NameNotFoundException -> 0x01c2, blocks: (B:10:0x0111, B:12:0x0127, B:13:0x012a, B:15:0x0131, B:17:0x0135, B:19:0x013d, B:21:0x0143, B:22:0x0145, B:24:0x0182, B:32:0x01a3, B:33:0x01b7), top: B:9:0x0111 }] */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0131 A[Catch: NameNotFoundException -> 0x01c2, TryCatch #2 {NameNotFoundException -> 0x01c2, blocks: (B:10:0x0111, B:12:0x0127, B:13:0x012a, B:15:0x0131, B:17:0x0135, B:19:0x013d, B:21:0x0143, B:22:0x0145, B:24:0x0182, B:32:0x01a3, B:33:0x01b7), top: B:9:0x0111 }] */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x01e3  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x01f6  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x023b  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x0255  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0280  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x02b6  */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x02eb  */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x02f3  */
                    @Override // X.C0LR
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void E4h(X.C024209q r20, X.C0M6 r21) {
                        /*
                            Method dump skipped, instructions count: 760
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C10600hU.E4h(X.09q, X.0M6):void");
                    }
                };
            case 7:
                c04140Kg = ((C0HR) this.A01).A01;
                return new C0LR(c04140Kg) { // from class: X.07v
                    public final int A00;
                    public final C04140Kg A01;

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A15;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    {
                        C04620Me c04620Me = C04620Me.A03;
                        if (c04620Me != null) {
                            this.A00 = c04620Me.A01();
                            this.A01 = c04140Kg;
                            return;
                        }
                        throw new IllegalStateException("Did you call PreviousSessionHelper.init?");
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        int i;
                        if (Build.VERSION.SDK_INT >= 30 && (i = this.A00) != 0) {
                            C04140Kg c04140Kg2 = this.A01;
                            C04130Kf A00 = c04140Kg2.A00(i);
                            if (A00 != null) {
                                c024209q.A01(C0LK.A1a, A00.A02());
                                c024209q.A01(C0LK.A1Z, A00.A01());
                                c024209q.A03(C0LK.A5b, A00.A08());
                                c024209q.A01(C0LK.A1c, A00.A03());
                                c024209q.A01(C0LK.A1e, A00.A04());
                                c024209q.A02(C0LK.A1f, Long.valueOf(A00.A07()));
                                c024209q.A00(C0LK.A0W, A00.A0B());
                                c024209q.A03(C0LK.A5c, A00.A09());
                                c024209q.A02(C0LK.A1b, Long.valueOf(A00.A05()));
                                c024209q.A02(C0LK.A1d, Long.valueOf(A00.A06()));
                                if (c0m6 == C0M6.LARGE_REPORT) {
                                    c024209q.A03(C0LK.A5d, A00.A0A());
                                    return;
                                }
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("previousPid", String.valueOf(i));
                            hashMap.put("currentTimestamp", String.valueOf(System.currentTimeMillis()));
                            try {
                                hashMap.put("processName", (String) c04140Kg2.A00.get());
                                String A01 = c04140Kg2.A01();
                                if (A01 != null) {
                                    hashMap.put("latestExitInfoAnyProcess", A01);
                                }
                            } catch (Throwable unused) {
                                hashMap.put("latestExitInfoAnyProcess", "exception");
                            }
                            C0PC.A00().DEh("MissingExitInfo", null, hashMap);
                        }
                    }
                };
            case 8:
                C0HR c0hr = (C0HR) this.A01;
                A05 = c0nk.A05();
                application = c0nk.A0J;
                j = c0hr.A00;
                return new C0LR(application, A05, j) { // from class: X.04A
                    public final long A00;
                    public final long A01;
                    public final Application A02;
                    public final C0Pe A03;

                    {
                        C14360o3.A0B(A05, 1);
                        this.A03 = A05;
                        this.A02 = application;
                        this.A01 = j;
                        this.A00 = System.currentTimeMillis() - (SystemClock.uptimeMillis() - j);
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        PackageManager packageManager;
                        C14360o3.A0B(c024209q, 0);
                        Application application4 = this.A02;
                        String packageName = application4.getPackageName();
                        try {
                            packageManager = application4.getPackageManager();
                        } catch (PackageManager.NameNotFoundException e) {
                            C0PC.A00().DEh(C0LX.A00(C05F.A0r), e, null);
                        }
                        if (packageManager != null) {
                            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                            if (packageInfo != null) {
                                c024209q.A02(C0LK.A2h, Long.valueOf(packageInfo.firstInstallTime));
                                c024209q.A02(C0LK.A2j, Long.valueOf(packageInfo.lastUpdateTime));
                                c024209q.A03(C0LK.A4D, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000ZZZZZ", Locale.US).format(new Date(packageInfo.firstInstallTime)));
                            }
                            c024209q.A02(C0LK.A2k, Long.valueOf(SystemClock.elapsedRealtime()));
                            C10860hv c10860hv = C0LK.A2l;
                            long[] jArr = new long[1];
                            C0JC.A02("/proc/self/status", jArr, new String[]{"PPid:"});
                            c024209q.A01(c10860hv, (int) jArr[0]);
                            c024209q.A02(C0LK.A2n, Long.valueOf(this.A00));
                            c024209q.A02(C0LK.A2o, Long.valueOf(this.A01));
                            C10860hv c10860hv2 = C0LK.A2m;
                            File file2 = this.A03.A05;
                            C02R.A03(file2, "Did you call SessionManager.init()?");
                            c024209q.A02(c10860hv2, Long.valueOf(C0Pe.A00(file2, "")));
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A0r;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }
                };
            case 9:
            case 17:
            default:
                final File A02 = c0nk.A05().A02(c0nk.A05().A07);
                final int A01 = (int) C20150ym.A01(AbstractC20100yh.A00(36595024032434184L));
                return new C0LR(A02, A01) { // from class: X.07M
                    public byte A00;
                    public byte A01;
                    public byte A02;
                    public int A03;
                    public int A04;
                    public long A05;
                    public long A06;
                    public short A07;
                    public boolean A08;
                    public final int A09;
                    public final List A0A = new ArrayList();
                    public final Map A0B = new HashMap();
                    public final File A0C;

                    private int A02(C04340La c04340La) {
                        int i = 0;
                        int i2 = 0;
                        int i3 = 24;
                        do {
                            i2 += (A00(c04340La) & 255) << i3;
                            i3 -= 8;
                            i++;
                        } while (i < 4);
                        return i2;
                    }

                    private short A03(C04340La c04340La) {
                        int i = 0;
                        short s = 0;
                        int i2 = 8;
                        do {
                            s = (short) (s + ((A00(c04340La) & 255) << i2));
                            i2 -= 8;
                            i++;
                        } while (i < 2);
                        return s;
                    }

                    private byte A00(C04340La c04340La) {
                        int i = c04340La.A00;
                        if (i >= 4096) {
                            i = A01();
                            c04340La.A00 = i;
                        }
                        byte[] bArr = c04340La.A01;
                        c04340La.A00 = i + 1;
                        return bArr[i];
                    }

                    private int A01() {
                        switch (this.A02) {
                            case -7:
                                return 19;
                            case -6:
                            case Process.SD_STDOUT /* -5 */:
                            case Process.SD_PIPE /* -4 */:
                            case Process.SD_BLACK_HOLE /* -3 */:
                                return 18;
                            case -2:
                                return 15;
                            case -1:
                                return 11;
                            default:
                                return Integer.MAX_VALUE;
                        }
                    }

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A0y;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e1, code lost:
                    
                        r2.append((java.lang.String) r4.get(r3));
                        r3 = r3 + 1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:103:0x05cd, code lost:
                    
                        if (r0 != null) goto L324;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:140:0x025c, code lost:
                    
                        if (r27 == false) goto L142;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:141:0x025e, code lost:
                    
                        r33.A0A.add(X.AnonymousClass001.A0A(r33.A06, ",start"));
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:142:0x0269, code lost:
                    
                        r33.A0A.add(r8.toString());
                        r33.A08 = true;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:143:0x0276, code lost:
                    
                        if (r2 < 0) goto L89;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:144:0x0278, code lost:
                    
                        r0 = 8;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:76:0x0195, code lost:
                    
                        r33.A03 = r0;
                     */
                    /* JADX WARN: Failed to find 'out' block for switch in B:186:0x02f1. Please report as an issue. */
                    /* JADX WARN: Removed duplicated region for block: B:102:0x05c9  */
                    /* JADX WARN: Removed duplicated region for block: B:109:0x05fc  */
                    /* JADX WARN: Removed duplicated region for block: B:112:0x0609  */
                    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:125:0x0234  */
                    /* JADX WARN: Removed duplicated region for block: B:132:0x0245  */
                    /* JADX WARN: Removed duplicated region for block: B:135:0x0254  */
                    /* JADX WARN: Removed duplicated region for block: B:158:0x025c A[ADDED_TO_REGION, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:98:0x01e8  */
                    /* JADX WARN: Type inference failed for: r4v1, types: [X.0La, java.lang.Object] */
                    @Override // X.C0LR
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void E4h(X.C024209q r34, X.C0M6 r35) {
                        /*
                            Method dump skipped, instructions count: 1610
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C07M.E4h(X.09q, X.0M6):void");
                    }

                    {
                        this.A0C = A02;
                        this.A09 = A01;
                    }
                };
            case 10:
                final File A022 = c0nk.A05().A02(c0nk.A05().A07);
                if (A022 != null) {
                    final C0Pe A055 = c0nk.A05();
                    return new C0LR(A055, A022) { // from class: X.07O
                        public final C0Pe A00;
                        public final File A01;

                        @Override // X.C0LR
                        public final Integer BW4() {
                            return C05F.A1I;
                        }

                        @Override // X.C0LR
                        public final /* synthetic */ boolean CKv(Integer num2) {
                            return false;
                        }

                        @Override // X.C0LR
                        public final void E4h(C024209q c024209q, C0M6 c0m6) {
                            File file2 = this.A01;
                            File file3 = new File(file2, "state.txt");
                            if (file3.exists()) {
                                C0ME c0me = new C0ME(file3, false);
                                char A056 = c0me.A05();
                                boolean A012 = C0MG.A01(A056);
                                String A0H = c0me.A0H();
                                c024209q.A03(C0LK.A4U, file2.getName());
                                c024209q.A02(C0LK.A2u, Long.valueOf(C0Pe.A00(file2, "")));
                                c024209q.A00(C0LK.A03, A012);
                                c024209q.A03(C0LK.A4O, String.valueOf(A056));
                                c024209q.A03(C0LK.A4R, A0H);
                                c024209q.A02(C0LK.A1F, Long.valueOf(c0me.A0E()));
                                c024209q.A03(C0LK.A4N, String.valueOf(c0me.A02()));
                                c024209q.A00(C0LK.A02, c0me.A0O());
                                c024209q.A01(C0LK.A1E, c0me.A07());
                                c024209q.A01(C0LK.A1H, c0me.A09(false));
                                c024209q.A01(C0LK.A1G, c0me.A09(true));
                                c024209q.A00(C0LK.A04, c0me.A0R());
                                c024209q.A00(C0LK.A0X, c0me.A0S());
                                c024209q.A00(C0LK.A0b, c0me.A0T());
                                c024209q.A03(C0LK.A6W, c0me.A0L());
                                File file4 = new File(file2, "first_intent.txt");
                                if (file4.exists()) {
                                    try {
                                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file4));
                                        try {
                                            c024209q.A03(C0LK.A5j, bufferedReader.readLine());
                                            bufferedReader.close();
                                        } finally {
                                        }
                                    } catch (IOException unused) {
                                    }
                                }
                                C10860hv c10860hv = C0LK.A3G;
                                C0Pe c0Pe = this.A00;
                                c024209q.A02(c10860hv, Long.valueOf(c0Pe.A00 - c0Pe.A01));
                                c024209q.A03(C0LK.A7d, c0me.A0M());
                                c024209q.A03(C0LK.A5Z, c0me.A0K());
                                c024209q.A03(C0LK.A8n, c0me.A0N());
                                c024209q.A02(C0LK.A1w, Long.valueOf(c0me.A0D()));
                                c024209q.A03(C0LK.A4C, String.valueOf(c0me.A03()));
                                c024209q.A03(C0LK.A4Z, c0me.A0I());
                                char A00 = C0MB.A00(new File(file2, "native_state.txt"));
                                char A002 = C0MB.A00(new File(file2, "anr_state.txt"));
                                char A06 = c0me.A06();
                                c024209q.A03(C0LK.A4S, String.valueOf(A06));
                                c024209q.A03(C0LK.A4T, String.valueOf(A00));
                                c024209q.A03(C0LK.A4P, String.valueOf(A002));
                                c024209q.A03(C0LK.A4Q, String.valueOf(C0MG.A00(A06, A00, A002)));
                                c024209q.A03(C0LK.A5N, String.valueOf(new File(file2, "shut_down").exists()));
                                c024209q.A03(C0LK.A54, String.valueOf(c0me.A04()));
                                c024209q.A02(C0LK.A3H, Long.valueOf(c0me.A0F()));
                                c024209q.A03(C0LK.A5l, String.valueOf(c0me.A0Q()));
                                Boolean A0G = c0me.A0G();
                                if (A0G != null) {
                                    c024209q.A00(C0LK.A0c, A0G.booleanValue());
                                }
                                c024209q.A03(C0LK.A9k, String.valueOf(c0me.A0U()));
                                C0MD A013 = C0ME.A01(c0me, 364, 365);
                                if (A013 != null) {
                                    c024209q.A00(C0LK.A0Z, A013.A01);
                                    String str = A013.A00;
                                    if (str != null && str.length() > 0) {
                                        c024209q.A03(C0LK.A8W, str);
                                    }
                                }
                                C0MC A003 = C0ME.A00(c0me, "last OnPause request received time ms", 207L);
                                if (A003 != null && !A003.A04) {
                                    if (A003.A03) {
                                        c024209q.A02(C0LK.A20, Long.valueOf(A003.A02));
                                        c024209q.A02(C0LK.A1z, Long.valueOf(A003.A00));
                                    } else {
                                        c024209q.A00(C0LK.A0T, true);
                                    }
                                }
                                C0MC A004 = C0ME.A00(c0me, "last OnPause request to leave app received time ms", 224L);
                                if (A004 != null && !A004.A04) {
                                    if (A004.A03) {
                                        c024209q.A02(C0LK.A24, Long.valueOf(A004.A02));
                                        c024209q.A02(C0LK.A23, Long.valueOf(A004.A00));
                                    } else {
                                        c024209q.A00(C0LK.A0V, true);
                                    }
                                }
                                C0MD A014 = C0ME.A01(c0me, 493, 494);
                                if (A014 != null) {
                                    c024209q.A00(C0LK.A0Y, A014.A01);
                                    String str2 = A014.A00;
                                    if (str2 != null && str2.length() > 0) {
                                        c024209q.A03(C0LK.A8V, str2);
                                    }
                                }
                                C0MC A005 = C0ME.A00(c0me, "last OnPause request execute start time ms", 241L);
                                if (A005 != null && !A005.A04) {
                                    if (A005.A03) {
                                        c024209q.A02(C0LK.A1y, Long.valueOf(A005.A02));
                                        c024209q.A02(C0LK.A1x, Long.valueOf(A005.A00));
                                    } else {
                                        c024209q.A00(C0LK.A0S, true);
                                    }
                                }
                                C0MC A006 = C0ME.A00(c0me, "last OnPause request to leave app execute start time ms", 258L);
                                if (A006 != null && !A006.A04) {
                                    if (A006.A03) {
                                        c024209q.A02(C0LK.A22, Long.valueOf(A006.A02));
                                        c024209q.A02(C0LK.A21, Long.valueOf(A006.A00));
                                    } else {
                                        c024209q.A00(C0LK.A0U, true);
                                    }
                                }
                                boolean A0P = c0me.A0P();
                                c024209q.A03(C0LK.A5C, String.valueOf(A0P));
                                if (A0P) {
                                    c024209q.A03(C0LK.A5E, String.valueOf(c0me.A0C()));
                                    c024209q.A03(C0LK.A5D, String.valueOf(c0me.A0J()));
                                }
                                int A08 = c0me.A08();
                                if (A08 > 0) {
                                    c024209q.A01(C0LK.A13, A08);
                                    c024209q.A02(C0LK.A14, Long.valueOf(c0me.A0A()));
                                    c024209q.A02(C0LK.A15, Long.valueOf(c0me.A0B()));
                                }
                                synchronized (c0me) {
                                    File file5 = c0me.A00;
                                    if (file5.exists() && file5.length() > 2242) {
                                        try {
                                            RandomAccessFile randomAccessFile = new RandomAccessFile(file5, "r");
                                            try {
                                                randomAccessFile.seek(2242L);
                                                int readByte = randomAccessFile.readByte() & 255;
                                                if (readByte == 0) {
                                                    randomAccessFile.close();
                                                } else {
                                                    byte[] bArr = new byte[readByte];
                                                    randomAccessFile.readFully(bArr, 0, readByte);
                                                    String str3 = new String(bArr);
                                                    randomAccessFile.close();
                                                    c024209q.A03(C0LK.A4e, str3);
                                                }
                                            } catch (Throwable th) {
                                                try {
                                                    randomAccessFile.close();
                                                } catch (Throwable th2) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e) {
                                            C0PC.A00().DEh("AppStateParserBBTraceId", e, null);
                                            C0K8.A0H("lacrima", "Could not read BB trace id", e);
                                        }
                                    }
                                }
                            }
                        }

                        {
                            this.A01 = A022;
                            this.A00 = A055;
                        }
                    };
                }
                return null;
            case 11:
                num = C05F.A00;
                final File file2 = c0nk.A05().A05;
                C02R.A03(file2, "Did you call SessionManager.init()?");
                return new C0LR(file2, num) { // from class: X.03i
                    public final Integer A00;
                    public final File A01;
                    public final Random A02 = new Random();

                    @Override // X.C0LR
                    public final synchronized void E4h(C024209q c024209q, C0M6 c0m6) {
                        String str;
                        File file3;
                        ArrayList arrayList = new ArrayList();
                        C04670Mj c04670Mj = C0L6.A04;
                        if (c04670Mj != null) {
                            boolean z = c04670Mj.A05;
                            if (z || this.A02.nextInt(10000) < 0) {
                                arrayList.add("is_fad_v2");
                                arrayList.add(Boolean.toString(z));
                            }
                        }
                        Integer num2 = this.A00;
                        Integer num3 = C05F.A00;
                        int i = 15859713;
                        if (num2 == num3) {
                            i = 15859715;
                        }
                        Integer num4 = C05F.A01;
                        if (num2 == num4) {
                            str = "anr";
                        } else {
                            str = "crash";
                            if (num2 == num3) {
                                String str2 = (String) c024209q.A09.get(C0LK.A6N);
                                if (str2 != null) {
                                    arrayList.add("throwable");
                                    arrayList.add(str2);
                                }
                            }
                        }
                        String[] strArr = new String[arrayList.size()];
                        arrayList.toArray(strArr);
                        boolean z2 = false;
                        if (num2 == num4) {
                            z2 = true;
                        }
                        C0Uw A00 = AbstractC06300Uv.A00(str, strArr, i, z2);
                        if (A00 != null) {
                            A00.A00();
                            String str3 = A00.A01;
                            try {
                                synchronized (A00) {
                                    long nanoTime = System.nanoTime() + 1000000000;
                                    while (!A00.A02) {
                                        long nanoTime2 = nanoTime - System.nanoTime();
                                        if (nanoTime2 <= 0) {
                                            break;
                                        } else {
                                            A00.wait(nanoTime2);
                                        }
                                    }
                                }
                            } catch (InterruptedException e) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("TriggerID", Integer.toString(i));
                                hashMap.put("TraceId", str3);
                                C0PC.A00().DEh("BBInterrupted", e, hashMap);
                                C0K8.A0F("lacrima/blackbox", "Wait for Black Box trace interrupted", e);
                            }
                            synchronized (A00) {
                                file3 = A00.A00;
                            }
                            if (file3 == null) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("TriggerID", Integer.toString(i));
                                hashMap2.put("TraceId", str3);
                                C0PC.A00().DEh("BBNoFile", null, hashMap2);
                                C0K8.A0C("lacrima/blackbox", "Failed to collect a trace file");
                            } else {
                                c024209q.A03(C0LK.A4e, str3);
                            }
                        }
                    }

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A02;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    {
                        this.A00 = num;
                        this.A01 = file2;
                    }
                };
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                num = C05F.A01;
                final File file22 = c0nk.A05().A05;
                C02R.A03(file22, "Did you call SessionManager.init()?");
                return new C0LR(file22, num) { // from class: X.03i
                    public final Integer A00;
                    public final File A01;
                    public final Random A02 = new Random();

                    @Override // X.C0LR
                    public final synchronized void E4h(C024209q c024209q, C0M6 c0m6) {
                        String str;
                        File file3;
                        ArrayList arrayList = new ArrayList();
                        C04670Mj c04670Mj = C0L6.A04;
                        if (c04670Mj != null) {
                            boolean z = c04670Mj.A05;
                            if (z || this.A02.nextInt(10000) < 0) {
                                arrayList.add("is_fad_v2");
                                arrayList.add(Boolean.toString(z));
                            }
                        }
                        Integer num2 = this.A00;
                        Integer num3 = C05F.A00;
                        int i = 15859713;
                        if (num2 == num3) {
                            i = 15859715;
                        }
                        Integer num4 = C05F.A01;
                        if (num2 == num4) {
                            str = "anr";
                        } else {
                            str = "crash";
                            if (num2 == num3) {
                                String str2 = (String) c024209q.A09.get(C0LK.A6N);
                                if (str2 != null) {
                                    arrayList.add("throwable");
                                    arrayList.add(str2);
                                }
                            }
                        }
                        String[] strArr = new String[arrayList.size()];
                        arrayList.toArray(strArr);
                        boolean z2 = false;
                        if (num2 == num4) {
                            z2 = true;
                        }
                        C0Uw A00 = AbstractC06300Uv.A00(str, strArr, i, z2);
                        if (A00 != null) {
                            A00.A00();
                            String str3 = A00.A01;
                            try {
                                synchronized (A00) {
                                    long nanoTime = System.nanoTime() + 1000000000;
                                    while (!A00.A02) {
                                        long nanoTime2 = nanoTime - System.nanoTime();
                                        if (nanoTime2 <= 0) {
                                            break;
                                        } else {
                                            A00.wait(nanoTime2);
                                        }
                                    }
                                }
                            } catch (InterruptedException e) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("TriggerID", Integer.toString(i));
                                hashMap.put("TraceId", str3);
                                C0PC.A00().DEh("BBInterrupted", e, hashMap);
                                C0K8.A0F("lacrima/blackbox", "Wait for Black Box trace interrupted", e);
                            }
                            synchronized (A00) {
                                file3 = A00.A00;
                            }
                            if (file3 == null) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("TriggerID", Integer.toString(i));
                                hashMap2.put("TraceId", str3);
                                C0PC.A00().DEh("BBNoFile", null, hashMap2);
                                C0K8.A0C("lacrima/blackbox", "Failed to collect a trace file");
                            } else {
                                c024209q.A03(C0LK.A4e, str3);
                            }
                        }
                    }

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A02;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    {
                        this.A00 = num;
                        this.A01 = file22;
                    }
                };
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
                c04140Kg = ((C02860Bk) this.A01).A00;
                return new C0LR(c04140Kg) { // from class: X.07v
                    public final int A00;
                    public final C04140Kg A01;

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A15;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    {
                        C04620Me c04620Me = C04620Me.A03;
                        if (c04620Me != null) {
                            this.A00 = c04620Me.A01();
                            this.A01 = c04140Kg;
                            return;
                        }
                        throw new IllegalStateException("Did you call PreviousSessionHelper.init?");
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        int i;
                        if (Build.VERSION.SDK_INT >= 30 && (i = this.A00) != 0) {
                            C04140Kg c04140Kg2 = this.A01;
                            C04130Kf A00 = c04140Kg2.A00(i);
                            if (A00 != null) {
                                c024209q.A01(C0LK.A1a, A00.A02());
                                c024209q.A01(C0LK.A1Z, A00.A01());
                                c024209q.A03(C0LK.A5b, A00.A08());
                                c024209q.A01(C0LK.A1c, A00.A03());
                                c024209q.A01(C0LK.A1e, A00.A04());
                                c024209q.A02(C0LK.A1f, Long.valueOf(A00.A07()));
                                c024209q.A00(C0LK.A0W, A00.A0B());
                                c024209q.A03(C0LK.A5c, A00.A09());
                                c024209q.A02(C0LK.A1b, Long.valueOf(A00.A05()));
                                c024209q.A02(C0LK.A1d, Long.valueOf(A00.A06()));
                                if (c0m6 == C0M6.LARGE_REPORT) {
                                    c024209q.A03(C0LK.A5d, A00.A0A());
                                    return;
                                }
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("previousPid", String.valueOf(i));
                            hashMap.put("currentTimestamp", String.valueOf(System.currentTimeMillis()));
                            try {
                                hashMap.put("processName", (String) c04140Kg2.A00.get());
                                String A012 = c04140Kg2.A01();
                                if (A012 != null) {
                                    hashMap.put("latestExitInfoAnyProcess", A012);
                                }
                            } catch (Throwable unused) {
                                hashMap.put("latestExitInfoAnyProcess", "exception");
                            }
                            C0PC.A00().DEh("MissingExitInfo", null, hashMap);
                        }
                    }
                };
            case Process.SIGTERM /* 15 */:
                return null;
            case 16:
                return new C0V4(1, c0nk, this.A01);
            case 18:
                return new C0V4(2, this.A01, c0nk);
            case Process.SIGSTOP /* 19 */:
                final Application application4 = c0nk.A0J;
                return new C0LR(application4) { // from class: X.052
                    public String A00;
                    public String A01;
                    public String A02;
                    public String A03;
                    public boolean A04 = true;
                    public final Context A05;

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A0I;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        if (this.A04) {
                            this.A00 = AbstractC02650Ap.A03("ro.lmk.critical_upgrade");
                            this.A02 = AbstractC02650Ap.A03("ro.lmk.upgrade_pressure");
                            this.A03 = AbstractC02650Ap.A03("ro.lmk.use_minfree_levels");
                            this.A01 = AbstractC02650Ap.A03("ro.config.low_ram");
                            this.A04 = false;
                        }
                        String str = this.A00;
                        if (str != null && !str.isEmpty()) {
                            c024209q.A03(C0LK.A6l, str);
                        }
                        String str2 = this.A02;
                        if (str2 != null && !str2.isEmpty()) {
                            c024209q.A03(C0LK.A6n, str2);
                        }
                        String str3 = this.A03;
                        if (str3 != null && !str3.isEmpty()) {
                            c024209q.A03(C0LK.A6o, str3);
                        }
                        String str4 = this.A01;
                        if (str4 != null && !str4.isEmpty()) {
                            c024209q.A03(C0LK.A6m, str4);
                        }
                    }

                    {
                        this.A05 = application4;
                    }
                };
            case 20:
                A05 = c0nk.A05();
                C14360o3.A07(A05);
                application = c0nk.A0J;
                j = ((C0ey) this.A01).A00;
                return new C0LR(application, A05, j) { // from class: X.04A
                    public final long A00;
                    public final long A01;
                    public final Application A02;
                    public final C0Pe A03;

                    {
                        C14360o3.A0B(A05, 1);
                        this.A03 = A05;
                        this.A02 = application;
                        this.A01 = j;
                        this.A00 = System.currentTimeMillis() - (SystemClock.uptimeMillis() - j);
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        PackageManager packageManager;
                        C14360o3.A0B(c024209q, 0);
                        Application application42 = this.A02;
                        String packageName = application42.getPackageName();
                        try {
                            packageManager = application42.getPackageManager();
                        } catch (PackageManager.NameNotFoundException e) {
                            C0PC.A00().DEh(C0LX.A00(C05F.A0r), e, null);
                        }
                        if (packageManager != null) {
                            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                            if (packageInfo != null) {
                                c024209q.A02(C0LK.A2h, Long.valueOf(packageInfo.firstInstallTime));
                                c024209q.A02(C0LK.A2j, Long.valueOf(packageInfo.lastUpdateTime));
                                c024209q.A03(C0LK.A4D, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000ZZZZZ", Locale.US).format(new Date(packageInfo.firstInstallTime)));
                            }
                            c024209q.A02(C0LK.A2k, Long.valueOf(SystemClock.elapsedRealtime()));
                            C10860hv c10860hv = C0LK.A2l;
                            long[] jArr = new long[1];
                            C0JC.A02("/proc/self/status", jArr, new String[]{"PPid:"});
                            c024209q.A01(c10860hv, (int) jArr[0]);
                            c024209q.A02(C0LK.A2n, Long.valueOf(this.A00));
                            c024209q.A02(C0LK.A2o, Long.valueOf(this.A01));
                            C10860hv c10860hv2 = C0LK.A2m;
                            File file23 = this.A03.A05;
                            C02R.A03(file23, "Did you call SessionManager.init()?");
                            c024209q.A02(c10860hv2, Long.valueOf(C0Pe.A00(file23, "")));
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A0r;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }
                };
            case 21:
                final File A023 = c0nk.A05().A02(c0nk.A05().A07);
                return new C0LR(A023) { // from class: X.02C
                    public byte A00;
                    public byte A01;
                    public byte A02;
                    public int A03;
                    public int A04;
                    public int A05;
                    public int A06;
                    public long A07;
                    public long A08;
                    public long A09;
                    public final File A0A;

                    private int A01(ByteBuffer byteBuffer) {
                        int i = 0;
                        int i2 = 0;
                        int i3 = 24;
                        do {
                            i2 += (A00(byteBuffer) & 255) << i3;
                            i3 -= 8;
                            i++;
                        } while (i < 4);
                        return i2;
                    }

                    private short A04(ByteBuffer byteBuffer) {
                        int i = 0;
                        short s = 0;
                        int i2 = 8;
                        do {
                            s = (short) (s + ((A00(byteBuffer) & 255) << i2));
                            i2 -= 8;
                            i++;
                        } while (i < 2);
                        return s;
                    }

                    private JSONObject A03(C0N0 c0n0, ByteBuffer byteBuffer, boolean z) {
                        String str;
                        JSONObject jSONObject = new JSONObject();
                        int A012 = A01(byteBuffer);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("msg_target", c0n0.A01(A04(byteBuffer)));
                        String A013 = c0n0.A01(A04(byteBuffer));
                        if (A013 != null) {
                            jSONObject2.put("msg_callback", A013);
                        }
                        jSONObject2.put("msg_what", A01(byteBuffer));
                        String A014 = c0n0.A01(A04(byteBuffer));
                        if (A014 != null) {
                            jSONObject2.put("msg_obj", A014);
                        }
                        short A044 = A04(byteBuffer);
                        if (A044 > 0) {
                            jSONObject2.put("wait_time_ms", (int) A044);
                        }
                        jSONObject.put("msg", jSONObject2);
                        jSONObject.put("current-gap_ms", A012);
                        long j2 = 0;
                        int i = 56;
                        int i2 = 0;
                        do {
                            j2 += (A00(byteBuffer) & 255) << i;
                            i -= 8;
                            i2++;
                        } while (i2 < 8);
                        jSONObject.put("unix_start_time_ms", j2);
                        jSONObject.put("finished", z);
                        byte A00 = A00(byteBuffer);
                        if (A00 == 1) {
                            str = "fg";
                        } else {
                            if (A00 == 2) {
                                str = "bg";
                            }
                            return jSONObject;
                        }
                        jSONObject.put("app_starting_status", str);
                        return jSONObject;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private void A05(X.C0N0 r19, java.nio.ByteBuffer r20, org.json.JSONObject r21) {
                        /*
                            Method dump skipped, instructions count: 256
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C02C.A05(X.0N0, java.nio.ByteBuffer, org.json.JSONObject):void");
                    }

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A17;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        int i;
                        String str;
                        String str2;
                        int i2;
                        File file3 = this.A0A;
                        if (file3 != null) {
                            File file4 = new File(file3, "looper.bin");
                            if (file4.exists()) {
                                C0N0 c0n0 = new C0N0(file3, true);
                                long length = file4.length();
                                int i3 = 44;
                                if (length <= 32767) {
                                    i3 = 42;
                                }
                                this.A04 = i3;
                                try {
                                    FileChannel channel = new RandomAccessFile(file4, "r").getChannel();
                                    ByteBuffer allocate = ByteBuffer.allocate(this.A04);
                                    channel.read(allocate);
                                    allocate.position(0);
                                    byte b = allocate.get();
                                    this.A02 = b;
                                    if (b == 11) {
                                        allocate.get();
                                        if (length > 32767) {
                                            i = allocate.getInt();
                                        } else {
                                            i = allocate.getShort();
                                        }
                                        this.A08 = allocate.getLong();
                                        int i4 = allocate.getInt();
                                        this.A05 = i4;
                                        if (i4 == length && i >= this.A04 && i < i4) {
                                            this.A06 = allocate.getInt();
                                            this.A03 = allocate.getInt();
                                            this.A07 = allocate.getLong();
                                            this.A00 = allocate.get();
                                            this.A09 = allocate.getLong();
                                            this.A01 = allocate.get();
                                            ByteBuffer allocate2 = ByteBuffer.allocate(this.A05);
                                            allocate2.position(this.A04);
                                            channel.read(allocate2);
                                            allocate2.position(this.A04);
                                            C10850hu c10850hu = C0LK.A8j;
                                            JSONObject jSONObject = new JSONObject();
                                            ArrayList arrayList = new ArrayList();
                                            allocate2.position(i);
                                            JSONObject jSONObject2 = null;
                                            int i5 = 0;
                                            do {
                                                try {
                                                    byte A00 = A00(allocate2);
                                                    int i6 = i5 + 1;
                                                    if (A00 == 0) {
                                                        break;
                                                    }
                                                    int position = allocate2.position();
                                                    if (A00 == 1) {
                                                        jSONObject2 = A03(c0n0, allocate2, true);
                                                        A06(allocate2, jSONObject2, false);
                                                    } else if (A00 == 5) {
                                                        jSONObject2 = A03(c0n0, allocate2, true);
                                                        A06(allocate2, jSONObject2, false);
                                                        A05(c0n0, allocate2, jSONObject2);
                                                    } else if (A00 == 2) {
                                                        jSONObject2 = A03(c0n0, allocate2, false);
                                                    } else {
                                                        if (A00 == 3) {
                                                            A06(allocate2, jSONObject2, false);
                                                        } else if (A00 == 4) {
                                                            A06(allocate2, jSONObject2, false);
                                                            A05(c0n0, allocate2, jSONObject2);
                                                        } else if (A00 == 7) {
                                                            A06(allocate2, jSONObject2, true);
                                                        } else {
                                                            if (A00 != 6) {
                                                                break;
                                                            }
                                                            A06(allocate2, jSONObject2, true);
                                                            A05(c0n0, allocate2, jSONObject2);
                                                        }
                                                        jSONObject2 = null;
                                                    }
                                                    int position2 = allocate2.position();
                                                    if (position2 <= position) {
                                                        i6 += this.A05 - position;
                                                        i2 = position2 - this.A04;
                                                    } else {
                                                        i2 = position2 - position;
                                                    }
                                                    i5 = i6 + i2;
                                                    if (jSONObject2 != null) {
                                                        arrayList.add(0, jSONObject2);
                                                    }
                                                    if (allocate2.position() == i) {
                                                        break;
                                                    }
                                                } catch (BufferUnderflowException e) {
                                                    C0PC.A00().DEh("LooperHistoryCollectJsonUnderflow", e, null);
                                                    throw new Exception(AnonymousClass001.A0R("Exception reading history buffer:", A02(e)), e);
                                                } catch (JSONException e2) {
                                                    C0PC.A00().DEh("LooperHistoryCollectJsonEx", e2, null);
                                                    throw new Exception(AnonymousClass001.A0R("Exception creating JSON looper history:", A02(e2)), e2);
                                                } catch (Exception e3) {
                                                    C0PC.A00().DEh("LooperHistoryCollectJsonOther", e3, null);
                                                    throw new Exception(AnonymousClass001.A0R("Exception getting looper history:", A02(e3)), e3);
                                                }
                                            } while (i5 <= this.A05);
                                            long j2 = this.A08;
                                            if (!arrayList.isEmpty()) {
                                                JSONObject jSONObject3 = (JSONObject) arrayList.get(0);
                                                long j3 = jSONObject3.getInt("current-gap_ms");
                                                if (jSONObject3.has("duration_ms")) {
                                                    j3 += jSONObject3.getInt("duration_ms");
                                                }
                                                j2 = this.A08 + j3;
                                                Iterator it = arrayList.iterator();
                                                while (it.hasNext()) {
                                                    JSONObject jSONObject4 = (JSONObject) it.next();
                                                    long j4 = j3 - jSONObject4.getInt("current-gap_ms");
                                                    if (jSONObject4.getBoolean("finished")) {
                                                        jSONObject4.put("current-from_ms_ago", j4);
                                                    } else {
                                                        jSONObject4.put("current-running_ms", j4);
                                                        jSONObject4.remove("duration_ms");
                                                        jSONObject4.remove("duration_cpu_ms");
                                                    }
                                                    jSONObject4.remove("current-gap_ms");
                                                    jSONObject4.remove("finished");
                                                }
                                            }
                                            jSONObject.put("version", this.A02 & 255);
                                            jSONObject.put("current_uptime_ms", j2);
                                            jSONObject.put("config_duration", this.A05);
                                            jSONObject.put("config_threshold_ms", this.A06);
                                            int i7 = this.A03;
                                            if (i7 > 0) {
                                                jSONObject.put("exec_monitor_threshold_ms", i7);
                                            }
                                            jSONObject.put("app_status_change_unix_time_ms", this.A07);
                                            byte b2 = this.A00;
                                            if (b2 == 1) {
                                                str = "fg";
                                            } else if (b2 == 2) {
                                                str = "bg";
                                            } else {
                                                str = "unknown";
                                            }
                                            jSONObject.put("app_status", str);
                                            jSONObject.put("prev_app_status_change_unix_time_ms", this.A09);
                                            byte b3 = this.A01;
                                            if (b3 == 1) {
                                                str2 = "fg";
                                            } else if (b3 == 2) {
                                                str2 = "bg";
                                            } else {
                                                str2 = "unknown";
                                            }
                                            jSONObject.put("prev_app_status", str2);
                                            jSONObject.put("history", new JSONArray((Collection) arrayList));
                                            c024209q.A03(c10850hu, jSONObject.toString());
                                            return;
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Exception reading header - ReadPos:");
                                        sb.append(i);
                                        sb.append(" HeaderSize:");
                                        sb.append(this.A04);
                                        sb.append(" size:");
                                        sb.append(i4);
                                        sb.append(" fileLength:");
                                        sb.append(length);
                                        throw new Exception(sb.toString());
                                    }
                                    throw new Exception(AnonymousClass001.A02(b, 11, "Exception reading header - bufferVersion:", " collectorVersion:"));
                                } catch (FileNotFoundException e4) {
                                    C0PC.A00().DEh("LooperHistoryCollectFileNotFound", e4, null);
                                    throw new Exception(AnonymousClass001.A0R("File not found:", A02(e4)), e4);
                                } catch (IOException e5) {
                                    C0PC.A00().DEh("LooperHistoryCollectIOEx", e5, null);
                                    throw new Exception(AnonymousClass001.A0R("Exception accessing file:", A02(e5)), e5);
                                } catch (IllegalArgumentException e6) {
                                    C0PC.A00().DEh("LooperHistoryCollectIllegalArg", e6, null);
                                    throw new Exception(AnonymousClass001.A0R("Exception creating header:", A02(e6)), e6);
                                } catch (BufferUnderflowException e7) {
                                    C0PC.A00().DEh("LooperHistoryCollectBufUnderFlow", e7, null);
                                    throw new Exception(AnonymousClass001.A0R("Exception reading header:", A02(e7)), e7);
                                }
                            }
                        }
                    }

                    {
                        this.A0A = A023;
                    }

                    private byte A00(ByteBuffer byteBuffer) {
                        if (byteBuffer.position() >= this.A05) {
                            byteBuffer.position(this.A04);
                        }
                        return byteBuffer.get();
                    }

                    public static String A02(Exception exc) {
                        try {
                            String A012 = C0LA.A01(exc);
                            if (TextUtils.isEmpty(A012.trim())) {
                                return "No stack trace";
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(exc);
                            sb.append(C0LA.A00(A012, 1000));
                            return sb.toString();
                        } catch (Throwable th) {
                            C0PC.A00().DEh("LooperHistoryCollectStackTrace", th, null);
                            return AnonymousClass001.A0R(exc.getMessage(), ": truncated trace");
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
                    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private void A06(java.nio.ByteBuffer r6, org.json.JSONObject r7, boolean r8) {
                        /*
                            r5 = this;
                            int r2 = r5.A01(r6)
                            int r1 = r5.A01(r6)
                            if (r7 == 0) goto L32
                            java.lang.String r0 = "duration_ms"
                            r7.put(r0, r2)
                            java.lang.String r0 = "duration_cpu_ms"
                            r7.put(r0, r1)
                            byte r4 = r5.A00(r6)
                            java.lang.String r3 = "app_in_progress_status"
                            java.lang.String r2 = "app_finishing_status"
                            r1 = 1
                            if (r4 != r1) goto L33
                            if (r8 != 0) goto L24
                            r3 = r2
                        L24:
                            java.lang.String r0 = "fg"
                        L27:
                            r7.put(r3, r0)
                        L2a:
                            if (r8 != 0) goto L32
                            java.lang.String r0 = "finished"
                            r7.put(r0, r1)
                        L32:
                            return
                        L33:
                            r0 = 2
                            if (r4 != r0) goto L2a
                            if (r8 != 0) goto L39
                            r3 = r2
                        L39:
                            java.lang.String r0 = "bg"
                            goto L27
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C02C.A06(java.nio.ByteBuffer, org.json.JSONObject, boolean):void");
                    }
                };
            case 22:
                return ((C17490tk) this.A01).A00;
        }
    }

    public C15280pi(InterfaceC08830cm interfaceC08830cm, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = interfaceC08830cm;
        } else {
            this.A01 = interfaceC08830cm;
        }
    }

    public C15280pi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
