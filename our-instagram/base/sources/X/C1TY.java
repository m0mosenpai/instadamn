package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1TY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TY implements C1TZ {
    public static Boolean A03;
    public final java.util.Set A00 = new HashSet();
    public final C1TZ A01;
    public final C2MF A02;

    /* JADX WARN: Type inference failed for: r11v0, types: [X.2MF] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.2MK] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, X.2Jn] */
    public C1TY(final Context context, AbstractC12990ll abstractC12990ll) {
        C48262Jq c48262Jq;
        PackageManager packageManager;
        final C1UI A00 = C1U4.A00(context);
        ExecutorC14040nU executorC14040nU = new ExecutorC14040nU(C14120nc.A00(), 144, 3, false, false);
        ArrayList arrayList = new ArrayList();
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null) {
            if (packageManager.getPackageInfo("com.android.vending", 0) != null) {
                c48262Jq = new C48262Jq(context, new Object(), C26711Ra.A00(context).A00, C26711Ra.A00(context).A01, C26711Ra.A00(context).A02, executorC14040nU);
                if (AbstractC26751Re.A00(context) && c48262Jq != null) {
                    arrayList.add(c48262Jq);
                }
                arrayList.add(C1RT.A00(context, abstractC12990ll));
                final C2M7 c2m7 = new C2M7(c48262Jq, new ExecutorC14040nU(C14120nc.A00(), 146, 3, false, false), (C1RW[]) arrayList.toArray(new C1RW[arrayList.size()]));
                final ?? r11 = new Object(context, A00, c2m7) { // from class: X.2MF
                    public final Context A00;
                    public final C1UI A01;
                    public final C2MB A02;

                    {
                        this.A00 = context;
                        this.A01 = A00;
                        this.A02 = new C2MI(c2m7);
                    }
                };
                this.A02 = r11;
                final C10050gI c10050gI = C26711Ra.A00(context).A03;
                HashSet hashSet = new HashSet();
                final C006802i c006802i = C006802i.A0p;
                final ?? r1 = new Object() { // from class: X.2MK
                };
                hashSet.add(new C2MN(A00, c006802i, c2m7, c10050gI, r11, r1) { // from class: X.2ML
                    public final int A00 = 11337743;
                    public final C1UI A01;
                    public final LightweightQuickPerformanceLogger A02;
                    public final C2MB A03;
                    public final C10050gI A04;
                    public final C2MF A05;
                    public final C2MK A06;

                    @Override // X.C2MN
                    public final void A04(C58424Pv2 c58424Pv2, boolean z, boolean z2) {
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
                        int i = this.A00;
                        int i2 = c58424Pv2.A01;
                        lightweightQuickPerformanceLogger.markerStart(i, i2);
                        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "downloader", this.A03.getName());
                        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "use_case", Pv4.A00(c58424Pv2.A02));
                        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "auto_uninstalled", z);
                        java.util.Set<String> set = c58424Pv2.A05;
                        String[] strArr = new String[set.size()];
                        long[] jArr = new long[set.size()];
                        C1UM A002 = this.A01.A00("AppModules::LastLoadTimestamp");
                        int i3 = 0;
                        for (String str : set) {
                            strArr[i3] = str;
                            jArr[i3] = A002.getLong(str, 0L);
                            i3++;
                        }
                        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "modules", strArr);
                        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "last_load_times", jArr);
                        lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2);
                    }

                    @Override // X.C2MN
                    public final void A05(C58424Pv2 c58424Pv2) {
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
                        int i = this.A00;
                        int i2 = c58424Pv2.A01;
                        lightweightQuickPerformanceLogger.markerPoint(i, i2, "download_batch_start");
                        java.util.Set<String> set = c58424Pv2.A06;
                        long[] jArr = new long[set.size()];
                        C1UM A002 = this.A01.A00("AppModules::UninstallLastFinishTime");
                        long currentTimeMillis = System.currentTimeMillis();
                        int i3 = 0;
                        for (String str : set) {
                            if (A002.contains(str)) {
                                jArr[i3] = currentTimeMillis - A002.getLong(str, 0L);
                            }
                            i3++;
                        }
                        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "time_since_last_uninstall", jArr);
                    }

                    @Override // X.C2MN
                    public final void A06(C58424Pv2 c58424Pv2) {
                        this.A02.markerPoint(this.A00, c58424Pv2.A01, "load_batch_start");
                    }

                    @Override // X.C2MN
                    public final void A07(C58424Pv2 c58424Pv2) {
                        String str;
                        java.util.Set<String> set = c58424Pv2.A06;
                        C0g3 A002 = C0g3.A00();
                        int size = set.size();
                        String[] strArr = new String[size];
                        String[] strArr2 = new String[size];
                        String[] strArr3 = new String[size];
                        C1UI c1ui = this.A01;
                        C1UM A003 = c1ui.A00("AppModules::InitialInstallRequestTs-1");
                        c1ui.A00("AppModules::InitialDownloadTime");
                        c1ui.A00("AppModules::InitialPrefetchTime");
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = Long.MIN_VALUE;
                        boolean z = false;
                        int i = 0;
                        boolean z2 = true;
                        boolean z3 = true;
                        for (String str2 : set) {
                            String A004 = AbstractC09950fx.A00(A002.A01(AbstractC10100gN.A00(str2)));
                            long j2 = A003.getLong(str2, currentTimeMillis);
                            boolean A07 = A002.A07(str2);
                            Integer A01 = AbstractC09930fu.A01(str2);
                            if (A01 != C05F.A01 && A01 != C05F.A0C) {
                                C10050gI c10050gI2 = this.A04;
                                if (AbstractC10000gD.A01(c10050gI2.A00, str2)) {
                                    str = "installed_split";
                                } else {
                                    File A012 = c10050gI2.A01(str2);
                                    if (A012 != null && A012.exists()) {
                                        str = "data_file";
                                    } else {
                                        str = NetInfoModule.CONNECTION_TYPE_NONE;
                                    }
                                }
                            } else {
                                str = "built_in";
                            }
                            strArr3[i] = str;
                            boolean z4 = !NetInfoModule.CONNECTION_TYPE_NONE.equals(str);
                            boolean z5 = false;
                            if (AbstractC09930fu.A01(str2) == C05F.A0N) {
                                z5 = true;
                            }
                            strArr[i] = str2;
                            strArr2[i] = A004;
                            if (z5 && (!z4 || A003.contains(str2))) {
                                j = Math.max(j2, j);
                            }
                            z3 &= A07;
                            z2 &= z4;
                            z |= z5;
                            i++;
                        }
                        int i2 = c58424Pv2.A01;
                        Integer num = c58424Pv2.A02;
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
                        int i3 = this.A00;
                        lightweightQuickPerformanceLogger.markerStart(i3, i2);
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "total_module_count", set.size());
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "use_case", Pv4.A00(num));
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "downloader", this.A03.getName());
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "is_app_foregrounded_on_start", !C218914p.A08());
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "modules", strArr);
                        if (j > 0) {
                            lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "max_initial_download_request_time", j);
                        }
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "requested_modules", (String[]) c58424Pv2.A05.toArray(new String[0]));
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "download_state_cache", strArr2);
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "all_loaded", z3);
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "all_local", z2);
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "any_downloadable", z);
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "module_location", strArr3);
                        if (num == C05F.A0N) {
                            List<C58425Pv3> list = c58424Pv2.A03;
                            String[] strArr4 = new String[list.size()];
                            int i4 = 0;
                            for (C58425Pv3 c58425Pv3 : list) {
                                Integer num2 = c58425Pv3.A00;
                                if (num2 != C05F.A00 && num2 != C05F.A01) {
                                    strArr4[i4] = S1Y.A00(num2);
                                    i4++;
                                } else {
                                    lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, S1Y.A00(num2), (String[]) c58425Pv3.A01.toArray(new String[0]));
                                }
                                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "actions", strArr4);
                            }
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
                    
                        if (r7.A03 == false) goto L21;
                     */
                    @Override // X.C2MN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void A08(X.C58424Pv2 r6, X.C124725kd r7, java.lang.Exception r8) {
                        /*
                            r5 = this;
                            int r4 = r6.A01
                            java.util.List r3 = r6.A03
                            int r2 = r3.size()
                            r1 = 0
                            r0 = 1
                            if (r2 != r0) goto L26
                            java.lang.Object r0 = r3.get(r1)
                            X.Pv3 r0 = (X.C58425Pv3) r0
                            java.lang.Integer r0 = r0.A00
                            java.lang.Integer r2 = X.C05F.A0Y
                            if (r0 != r2) goto L26
                            java.lang.Integer r1 = r6.A02
                            java.lang.Integer r0 = X.C05F.A0N
                            if (r1 == r0) goto L20
                            if (r1 != r2) goto L26
                        L20:
                            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r5.A02
                            r0.markerDrop(r4)
                            return
                        L26:
                            if (r8 == 0) goto L5e
                            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r5.A02
                            int r2 = r5.A00
                            java.lang.String r1 = r8.getMessage()
                            if (r1 != 0) goto L3a
                            java.lang.Class r0 = r8.getClass()
                            java.lang.String r1 = r0.getSimpleName()
                        L3a:
                            java.lang.String r0 = "exception"
                            r3.markerAnnotate(r2, r4, r0, r1)
                        L40:
                            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r5.A02
                            int r2 = r5.A00
                            boolean r0 = X.C218914p.A08()
                            r1 = r0 ^ 1
                            java.lang.String r0 = "is_app_foregrounded_on_complete"
                            r3.markerAnnotate(r2, r4, r0, r1)
                            if (r8 != 0) goto L59
                            if (r7 == 0) goto L59
                            boolean r1 = r7.A03
                            r0 = 2
                            if (r1 != 0) goto L5a
                        L59:
                            r0 = 3
                        L5a:
                            r3.markerEnd(r2, r4, r0)
                            return
                        L5e:
                            if (r7 == 0) goto L40
                            boolean r0 = r7.A03
                            if (r0 != 0) goto L40
                            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r5.A02
                            int r2 = r5.A00
                            int r1 = r7.A00
                            java.lang.String r0 = "result_code"
                            r3.markerAnnotate(r2, r4, r0, r1)
                            goto L40
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2ML.A08(X.Pv2, X.5kd, java.lang.Exception):void");
                    }

                    @Override // X.C2MN
                    public final void A09(C58424Pv2 c58424Pv2, C62674SLm c62674SLm) {
                        String str;
                        Exception exc = c62674SLm.A01;
                        if (exc != null) {
                            str = exc.getMessage();
                            if (str == null) {
                                str = exc.getClass().getSimpleName();
                            }
                        } else {
                            str = "success";
                        }
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
                        int i = this.A00;
                        int i2 = c58424Pv2.A01;
                        lightweightQuickPerformanceLogger.markerPoint(i, i2, "download_batch_finish", str);
                        Integer num = c62674SLm.A02;
                        if (num != null) {
                            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.ErrorCode, num.intValue());
                        }
                    }

                    @Override // X.C2MN
                    public final void A0A(C58424Pv2 c58424Pv2, IOException iOException) {
                        String str;
                        if (iOException != null) {
                            str = iOException.getMessage();
                            if (str == null) {
                                str = iOException.getClass().getSimpleName();
                            }
                        } else {
                            str = "success";
                        }
                        this.A02.markerPoint(this.A00, c58424Pv2.A01, "load_batch_finish", str);
                    }

                    {
                        this.A03 = new C2MI(c2m7);
                        this.A04 = c10050gI;
                        this.A05 = r11;
                        this.A01 = A00;
                        this.A02 = c006802i;
                        this.A06 = r1;
                    }

                    @Override // X.C2MN
                    public final void A02(C58424Pv2 c58424Pv2, IOException iOException, String str) {
                        int indexOf;
                        String str2;
                        Locale locale = Locale.US;
                        synchronized (c58424Pv2) {
                            ArrayList arrayList2 = c58424Pv2.A00;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList(c58424Pv2.A06.size());
                            }
                            c58424Pv2.A00 = arrayList2;
                            indexOf = arrayList2.indexOf(str);
                            if (indexOf < 0) {
                                arrayList2.add(str);
                                indexOf = arrayList2.size() - 1;
                            }
                        }
                        String format = String.format(locale, "%s%d_finish", "load", Integer.valueOf(indexOf));
                        if (iOException != null) {
                            str2 = iOException.getMessage();
                            if (str2 == null) {
                                str2 = iOException.getClass().getSimpleName();
                            }
                        } else {
                            str2 = "success";
                        }
                        this.A02.markerPoint(this.A00, c58424Pv2.A01, format, str2);
                    }

                    @Override // X.C2MN
                    public final void A03(C58424Pv2 c58424Pv2, String str) {
                        int indexOf;
                        Locale locale = Locale.US;
                        synchronized (c58424Pv2) {
                            ArrayList arrayList2 = c58424Pv2.A00;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList(c58424Pv2.A06.size());
                            }
                            c58424Pv2.A00 = arrayList2;
                            indexOf = arrayList2.indexOf(str);
                            if (indexOf < 0) {
                                arrayList2.add(str);
                                indexOf = arrayList2.size() - 1;
                            }
                        }
                        this.A02.markerPoint(this.A00, c58424Pv2.A01, String.format(locale, "%s%d_start", "load", Integer.valueOf(indexOf)), str);
                    }
                });
                this.A01 = new C2MT(context, A00, new C2MR(c10050gI), new C2MP(C26711Ra.A00(context).A01, executorC14040nU), c2m7, c10050gI, r11, hashSet, executorC14040nU);
                C0g3.A00().A04(new C0g4() { // from class: X.2Mi
                    @Override // X.C0g4
                    public final void DBl(String str, Integer num) {
                    }

                    @Override // X.C0g4
                    public final void DQ2(String str) {
                        InterfaceC124715kc[] interfaceC124715kcArr;
                        java.util.Set set = C1TY.this.A00;
                        synchronized (set) {
                            interfaceC124715kcArr = (InterfaceC124715kc[]) set.toArray(new InterfaceC124715kc[set.size()]);
                        }
                        if (0 < interfaceC124715kcArr.length) {
                            throw new NullPointerException("notifyModuleLoaded");
                        }
                    }
                }, executorC14040nU);
            }
        }
        c48262Jq = null;
        if (AbstractC26751Re.A00(context)) {
            arrayList.add(c48262Jq);
        }
        arrayList.add(C1RT.A00(context, abstractC12990ll));
        final C1RW c2m72 = new C2M7(c48262Jq, new ExecutorC14040nU(C14120nc.A00(), 146, 3, false, false), (C1RW[]) arrayList.toArray(new C1RW[arrayList.size()]));
        final C2MF r112 = new Object(context, A00, c2m72) { // from class: X.2MF
            public final Context A00;
            public final C1UI A01;
            public final C2MB A02;

            {
                this.A00 = context;
                this.A01 = A00;
                this.A02 = new C2MI(c2m72);
            }
        };
        this.A02 = r112;
        final C10050gI c10050gI2 = C26711Ra.A00(context).A03;
        HashSet hashSet2 = new HashSet();
        final LightweightQuickPerformanceLogger c006802i2 = C006802i.A0p;
        final C2MK r12 = new Object() { // from class: X.2MK
        };
        hashSet2.add(new C2MN(A00, c006802i2, c2m72, c10050gI2, r112, r12) { // from class: X.2ML
            public final int A00 = 11337743;
            public final C1UI A01;
            public final LightweightQuickPerformanceLogger A02;
            public final C2MB A03;
            public final C10050gI A04;
            public final C2MF A05;
            public final C2MK A06;

            @Override // X.C2MN
            public final void A04(C58424Pv2 c58424Pv2, boolean z, boolean z2) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
                int i = this.A00;
                int i2 = c58424Pv2.A01;
                lightweightQuickPerformanceLogger.markerStart(i, i2);
                lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "downloader", this.A03.getName());
                lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "use_case", Pv4.A00(c58424Pv2.A02));
                lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "auto_uninstalled", z);
                java.util.Set<String> set = c58424Pv2.A05;
                String[] strArr = new String[set.size()];
                long[] jArr = new long[set.size()];
                C1UM A002 = this.A01.A00("AppModules::LastLoadTimestamp");
                int i3 = 0;
                for (String str : set) {
                    strArr[i3] = str;
                    jArr[i3] = A002.getLong(str, 0L);
                    i3++;
                }
                lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "modules", strArr);
                lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "last_load_times", jArr);
                lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2);
            }

            @Override // X.C2MN
            public final void A05(C58424Pv2 c58424Pv2) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
                int i = this.A00;
                int i2 = c58424Pv2.A01;
                lightweightQuickPerformanceLogger.markerPoint(i, i2, "download_batch_start");
                java.util.Set<String> set = c58424Pv2.A06;
                long[] jArr = new long[set.size()];
                C1UM A002 = this.A01.A00("AppModules::UninstallLastFinishTime");
                long currentTimeMillis = System.currentTimeMillis();
                int i3 = 0;
                for (String str : set) {
                    if (A002.contains(str)) {
                        jArr[i3] = currentTimeMillis - A002.getLong(str, 0L);
                    }
                    i3++;
                }
                lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "time_since_last_uninstall", jArr);
            }

            @Override // X.C2MN
            public final void A06(C58424Pv2 c58424Pv2) {
                this.A02.markerPoint(this.A00, c58424Pv2.A01, "load_batch_start");
            }

            @Override // X.C2MN
            public final void A07(C58424Pv2 c58424Pv2) {
                String str;
                java.util.Set<String> set = c58424Pv2.A06;
                C0g3 A002 = C0g3.A00();
                int size = set.size();
                String[] strArr = new String[size];
                String[] strArr2 = new String[size];
                String[] strArr3 = new String[size];
                C1UI c1ui = this.A01;
                C1UM A003 = c1ui.A00("AppModules::InitialInstallRequestTs-1");
                c1ui.A00("AppModules::InitialDownloadTime");
                c1ui.A00("AppModules::InitialPrefetchTime");
                long currentTimeMillis = System.currentTimeMillis();
                long j = Long.MIN_VALUE;
                boolean z = false;
                int i = 0;
                boolean z2 = true;
                boolean z3 = true;
                for (String str2 : set) {
                    String A004 = AbstractC09950fx.A00(A002.A01(AbstractC10100gN.A00(str2)));
                    long j2 = A003.getLong(str2, currentTimeMillis);
                    boolean A07 = A002.A07(str2);
                    Integer A01 = AbstractC09930fu.A01(str2);
                    if (A01 != C05F.A01 && A01 != C05F.A0C) {
                        C10050gI c10050gI22 = this.A04;
                        if (AbstractC10000gD.A01(c10050gI22.A00, str2)) {
                            str = "installed_split";
                        } else {
                            File A012 = c10050gI22.A01(str2);
                            if (A012 != null && A012.exists()) {
                                str = "data_file";
                            } else {
                                str = NetInfoModule.CONNECTION_TYPE_NONE;
                            }
                        }
                    } else {
                        str = "built_in";
                    }
                    strArr3[i] = str;
                    boolean z4 = !NetInfoModule.CONNECTION_TYPE_NONE.equals(str);
                    boolean z5 = false;
                    if (AbstractC09930fu.A01(str2) == C05F.A0N) {
                        z5 = true;
                    }
                    strArr[i] = str2;
                    strArr2[i] = A004;
                    if (z5 && (!z4 || A003.contains(str2))) {
                        j = Math.max(j2, j);
                    }
                    z3 &= A07;
                    z2 &= z4;
                    z |= z5;
                    i++;
                }
                int i2 = c58424Pv2.A01;
                Integer num = c58424Pv2.A02;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
                int i3 = this.A00;
                lightweightQuickPerformanceLogger.markerStart(i3, i2);
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "total_module_count", set.size());
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "use_case", Pv4.A00(num));
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "downloader", this.A03.getName());
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "is_app_foregrounded_on_start", !C218914p.A08());
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "modules", strArr);
                if (j > 0) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "max_initial_download_request_time", j);
                }
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "requested_modules", (String[]) c58424Pv2.A05.toArray(new String[0]));
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "download_state_cache", strArr2);
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "all_loaded", z3);
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "all_local", z2);
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "any_downloadable", z);
                lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "module_location", strArr3);
                if (num == C05F.A0N) {
                    List<C58425Pv3> list = c58424Pv2.A03;
                    String[] strArr4 = new String[list.size()];
                    int i4 = 0;
                    for (C58425Pv3 c58425Pv3 : list) {
                        Integer num2 = c58425Pv3.A00;
                        if (num2 != C05F.A00 && num2 != C05F.A01) {
                            strArr4[i4] = S1Y.A00(num2);
                            i4++;
                        } else {
                            lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, S1Y.A00(num2), (String[]) c58425Pv3.A01.toArray(new String[0]));
                        }
                        lightweightQuickPerformanceLogger.markerAnnotate(i3, i2, "actions", strArr4);
                    }
                }
            }

            @Override // X.C2MN
            public final void A08(C58424Pv2 c58424Pv2, C124725kd c124725kd, Exception exc) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    this = this;
                    int r4 = r6.A01
                    java.util.List r3 = r6.A03
                    int r2 = r3.size()
                    r1 = 0
                    r0 = 1
                    if (r2 != r0) goto L26
                    java.lang.Object r0 = r3.get(r1)
                    X.Pv3 r0 = (X.C58425Pv3) r0
                    java.lang.Integer r0 = r0.A00
                    java.lang.Integer r2 = X.C05F.A0Y
                    if (r0 != r2) goto L26
                    java.lang.Integer r1 = r6.A02
                    java.lang.Integer r0 = X.C05F.A0N
                    if (r1 == r0) goto L20
                    if (r1 != r2) goto L26
                L20:
                    com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r5.A02
                    r0.markerDrop(r4)
                    return
                L26:
                    if (r8 == 0) goto L5e
                    com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r5.A02
                    int r2 = r5.A00
                    java.lang.String r1 = r8.getMessage()
                    if (r1 != 0) goto L3a
                    java.lang.Class r0 = r8.getClass()
                    java.lang.String r1 = r0.getSimpleName()
                L3a:
                    java.lang.String r0 = "exception"
                    r3.markerAnnotate(r2, r4, r0, r1)
                L40:
                    com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r5.A02
                    int r2 = r5.A00
                    boolean r0 = X.C218914p.A08()
                    r1 = r0 ^ 1
                    java.lang.String r0 = "is_app_foregrounded_on_complete"
                    r3.markerAnnotate(r2, r4, r0, r1)
                    if (r8 != 0) goto L59
                    if (r7 == 0) goto L59
                    boolean r1 = r7.A03
                    r0 = 2
                    if (r1 != 0) goto L5a
                L59:
                    r0 = 3
                L5a:
                    r3.markerEnd(r2, r4, r0)
                    return
                L5e:
                    if (r7 == 0) goto L40
                    boolean r0 = r7.A03
                    if (r0 != 0) goto L40
                    com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r5.A02
                    int r2 = r5.A00
                    int r1 = r7.A00
                    java.lang.String r0 = "result_code"
                    r3.markerAnnotate(r2, r4, r0, r1)
                    goto L40
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2ML.A08(X.Pv2, X.5kd, java.lang.Exception):void");
            }

            @Override // X.C2MN
            public final void A09(C58424Pv2 c58424Pv2, C62674SLm c62674SLm) {
                String str;
                Exception exc = c62674SLm.A01;
                if (exc != null) {
                    str = exc.getMessage();
                    if (str == null) {
                        str = exc.getClass().getSimpleName();
                    }
                } else {
                    str = "success";
                }
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
                int i = this.A00;
                int i2 = c58424Pv2.A01;
                lightweightQuickPerformanceLogger.markerPoint(i, i2, "download_batch_finish", str);
                Integer num = c62674SLm.A02;
                if (num != null) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.ErrorCode, num.intValue());
                }
            }

            @Override // X.C2MN
            public final void A0A(C58424Pv2 c58424Pv2, IOException iOException) {
                String str;
                if (iOException != null) {
                    str = iOException.getMessage();
                    if (str == null) {
                        str = iOException.getClass().getSimpleName();
                    }
                } else {
                    str = "success";
                }
                this.A02.markerPoint(this.A00, c58424Pv2.A01, "load_batch_finish", str);
            }

            {
                this.A03 = new C2MI(c2m72);
                this.A04 = c10050gI2;
                this.A05 = r112;
                this.A01 = A00;
                this.A02 = c006802i2;
                this.A06 = r12;
            }

            @Override // X.C2MN
            public final void A02(C58424Pv2 c58424Pv2, IOException iOException, String str) {
                int indexOf;
                String str2;
                Locale locale = Locale.US;
                synchronized (c58424Pv2) {
                    ArrayList arrayList2 = c58424Pv2.A00;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(c58424Pv2.A06.size());
                    }
                    c58424Pv2.A00 = arrayList2;
                    indexOf = arrayList2.indexOf(str);
                    if (indexOf < 0) {
                        arrayList2.add(str);
                        indexOf = arrayList2.size() - 1;
                    }
                }
                String format = String.format(locale, "%s%d_finish", "load", Integer.valueOf(indexOf));
                if (iOException != null) {
                    str2 = iOException.getMessage();
                    if (str2 == null) {
                        str2 = iOException.getClass().getSimpleName();
                    }
                } else {
                    str2 = "success";
                }
                this.A02.markerPoint(this.A00, c58424Pv2.A01, format, str2);
            }

            @Override // X.C2MN
            public final void A03(C58424Pv2 c58424Pv2, String str) {
                int indexOf;
                Locale locale = Locale.US;
                synchronized (c58424Pv2) {
                    ArrayList arrayList2 = c58424Pv2.A00;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(c58424Pv2.A06.size());
                    }
                    c58424Pv2.A00 = arrayList2;
                    indexOf = arrayList2.indexOf(str);
                    if (indexOf < 0) {
                        arrayList2.add(str);
                        indexOf = arrayList2.size() - 1;
                    }
                }
                this.A02.markerPoint(this.A00, c58424Pv2.A01, String.format(locale, "%s%d_start", "load", Integer.valueOf(indexOf)), str);
            }
        });
        this.A01 = new C2MT(context, A00, new C2MR(c10050gI2), new C2MP(C26711Ra.A00(context).A01, executorC14040nU), c2m72, c10050gI2, r112, hashSet2, executorC14040nU);
        C0g3.A00().A04(new C0g4() { // from class: X.2Mi
            @Override // X.C0g4
            public final void DBl(String str, Integer num) {
            }

            @Override // X.C0g4
            public final void DQ2(String str) {
                InterfaceC124715kc[] interfaceC124715kcArr;
                java.util.Set set = C1TY.this.A00;
                synchronized (set) {
                    interfaceC124715kcArr = (InterfaceC124715kc[]) set.toArray(new InterfaceC124715kc[set.size()]);
                }
                if (0 < interfaceC124715kcArr.length) {
                    throw new NullPointerException("notifyModuleLoaded");
                }
            }
        }, executorC14040nU);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r2 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean A01(android.content.Context r3) {
        /*
            java.lang.Boolean r0 = X.C1TY.A03
            if (r0 != 0) goto L2e
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            if (r0 == 0) goto L27
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            boolean r0 = X.C1Rm.A02(r3, r0)
            if (r0 == 0) goto L27
            r2 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            if (r1 == 0) goto L24
            java.lang.String r0 = "com.android.vending"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            if (r0 == 0) goto L24
            r2 = 1
        L24:
            r0 = 1
            if (r2 == 0) goto L28
        L27:
            r0 = 0
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C1TY.A03 = r0
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1TY.A01(android.content.Context):java.lang.Boolean");
    }

    @Override // X.C1TZ
    public final C58422Pv0 CsF(Integer num) {
        return this.A01.CsF(num);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Tc, java.lang.Object] */
    public static C1Rm A00(Context context) {
        Context applicationContext = context.getApplicationContext();
        InterfaceC27041Tb interfaceC27041Tb = new InterfaceC27041Tb() { // from class: X.1Ta
            @Override // X.InterfaceC27041Tb
            public final void EHB(String str, Throwable th) {
                C0K8.A0F("InstagramAppModuleManager", "Soft Error.", th);
            }
        };
        ?? obj = new Object();
        obj.A00 = interfaceC27041Tb;
        HandlerThread handlerThread = new HandlerThread("InstagramOxygenSessionStateThread");
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        return new C1Rm(applicationContext.getContentResolver(), applicationContext, new Handler(handlerThread.getLooper()), obj);
    }
}
