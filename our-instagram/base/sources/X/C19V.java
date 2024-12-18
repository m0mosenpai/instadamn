package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.mobileconfig.MobileConfigCxxPerfLogger;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.MobileConfigManagerParamsHolder;
import com.facebook.mobileconfig.MobileConfigUsingPureJavaDependencies;
import com.facebook.mobileconfig.common.FBMobileConfigGlobalContextHolder;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.quickexperiment.MobileConfigBisection;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.19V, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C19V {
    /* JADX WARN: Type inference failed for: r20v1, types: [X.19r, java.lang.Object] */
    public static C1AB A00(final Context context, final LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, final AbstractC12990ll abstractC12990ll, C1AB c1ab, final String str, final String str2, String str3, final int i, boolean z, final boolean z2) {
        int i2;
        boolean z3;
        short s;
        final AssetManager assets = context.getAssets();
        File filesDir = context.getFilesDir();
        filesDir.mkdirs();
        if (z) {
            File file = new File(filesDir, "mobileconfig_spoof");
            try {
                File file2 = new File(file, MobileConfigBisection.BISECT_DIR);
                file2.mkdirs();
                File file3 = new File(new File(filesDir, MobileConfigBisection.BISECT_DIR), "id_name_mapping.json");
                if (file3.exists()) {
                    File file4 = new File(file2, "id_name_mapping.json");
                    FileChannel channel = new FileInputStream(file3).getChannel();
                    try {
                        FileChannel channel2 = new FileOutputStream(file4).getChannel();
                        try {
                            channel2.transferFrom(channel, 0L, channel.size());
                            channel2.close();
                            channel.close();
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (IOException e) {
                C0K8.A0I("MobileConfigIGUtils", "Failed to copy id_name_mapping file for spoofing", e);
            }
            filesDir = file;
        }
        final FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder = FBMobileConfigGlobalContextHolder.getInstance(C18Z.A02.A00());
        if (C226218q.A01(AbstractC12960li.A00).A0L) {
            fBMobileConfigGlobalContextHolder.onFirstAppInstall();
        }
        fBMobileConfigGlobalContextHolder.setCurrentVersion(AbstractC12880la.A04(context));
        final HashMap hashMap = new HashMap();
        final MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder = new MobileConfigManagerParamsHolder();
        mobileConfigManagerParamsHolder.setInstagramFlags(false, i);
        if (str3 != null) {
            mobileConfigManagerParamsHolder.setFamilyDeviceId(str3);
        }
        if (i != 1) {
            mobileConfigManagerParamsHolder.setShouldLogAccessWithoutExposures(C1AD.A06(C06090Tz.A05, 18299373885262072L));
        }
        mobileConfigManagerParamsHolder.setDirectReadCacheFile(C20150ym.A07(AbstractC20100yh.A00(36320309334253922L)));
        boolean A07 = C20150ym.A07(AbstractC20070ye.A00(18299373885130999L));
        if (A07) {
            i2 = (int) C20150ym.A01(AbstractC20070ye.A00(18580848861907050L));
        } else {
            i2 = 600;
        }
        final MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = null;
        if (c1ab != null) {
            mobileConfigManagerHolderImpl = C228319l.A00(c1ab.A00.A0A());
        }
        if (c1ab != null && i == 2) {
            z3 = C1AD.A06(C06090Tz.A05, 18299373884999925L);
        } else {
            z3 = false;
        }
        mobileConfigManagerParamsHolder.setUseFileRepo(z3);
        mobileConfigManagerParamsHolder.setShouldIncludeStableSpecWithExposure(C20150ym.A07(AbstractC20070ye.A00(18299373885065462L)));
        final C19W c19w = new C19W(abstractC12990ll);
        if (i == 2) {
            C1AO.A00 = c19w;
        }
        final C0k4 c0k4 = C0YB.A00;
        final MobileConfigCxxPerfLogger mobileConfigCxxPerfLogger = new MobileConfigCxxPerfLogger(c0k4) { // from class: X.19Y
            public Random A00 = new Random();
            public final LightweightQuickPerformanceLogger A01;

            @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
            public final int generateInstanceKey() {
                return this.A00.nextInt(Integer.MAX_VALUE);
            }

            @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
            public final void markEvent(int i3, String str4, int i4, Map map) {
                EventBuilder markEventBuilder = this.A01.markEventBuilder(i3, str4);
                markEventBuilder.setLevel(i4);
                for (Map.Entry entry : map.entrySet()) {
                    markEventBuilder.annotate((String) entry.getKey(), (String) entry.getValue());
                }
                markEventBuilder.report();
            }

            @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
            public final void markerAnnotate(int i3, int i4, Map map) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.A01;
                for (Map.Entry entry : map.entrySet()) {
                    lightweightQuickPerformanceLogger2.markerAnnotate(i3, i4, (String) entry.getKey(), (String) entry.getValue());
                }
            }

            @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
            public final void markerEnd(int i3, int i4) {
                this.A01.markerEnd(i3, i4, (short) 2);
            }

            @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
            public final void markerPoint(int i3, int i4, String str4, Map map) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.A01;
                for (Map.Entry entry : map.entrySet()) {
                    lightweightQuickPerformanceLogger2.markerPoint(i3, i4, (String) entry.getKey(), (String) entry.getValue());
                }
            }

            @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
            public final void markerStart(int i3, int i4) {
                this.A01.markerStart(i3, i4);
            }

            {
                this.A01 = c0k4;
            }
        };
        final boolean z4 = z3;
        InterfaceC227319b interfaceC227319b = new InterfaceC227319b() { // from class: X.19a
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v1, types: [X.1A6] */
            @Override // X.InterfaceC227319b
            public final MobileConfigManagerHolderImpl ALC(File file5, String str4) {
                MobileConfigUsingPureJavaDependencies mobileConfigUsingPureJavaDependencies = MobileConfigUsingPureJavaDependencies.$redex_init_class;
                AbstractC12990ll abstractC12990ll2 = abstractC12990ll;
                final MobileConfigManagerHolderImpl createManager = new MobileConfigUsingPureJavaDependencies(null, new C1A4(abstractC12990ll2, z2), abstractC12990ll2 instanceof UserSession, c19w, mobileConfigCxxPerfLogger).createManager(file5, AbstractC12880la.A04(context), str2, str4, i, "", assets, false, mobileConfigManagerParamsHolder, hashMap, mobileConfigManagerHolderImpl, new Object() { // from class: X.1A6
                }, C14250np.A00().A00, z4, fBMobileConfigGlobalContextHolder);
                C14250np.A00().A00.schedule(new Runnable() { // from class: X.1A7
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC225918h abstractC225918h = createManager;
                        C14140ne c14140ne = new C14140ne(1094744753, 3, false, false);
                        C0UF c0uf = C0UE.A00;
                        if (c0uf == null) {
                            c0uf = new C0UF();
                            C0UE.A00 = c0uf;
                        }
                        synchronized (c0uf) {
                            c0uf.A01 = c14140ne;
                        }
                        abstractC225918h.registerConfigChangeListener(C0UE.A00);
                    }
                }, 0L, TimeUnit.MILLISECONDS);
                return createManager;
            }
        };
        C227419c c227419c = new C227419c();
        C227619e c227619e = C227619e.A08;
        final C17050sx A01 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.19f
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return AbstractC12220kQ.A02(AbstractC12990ll.this);
            }
        });
        final C17050sx A012 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.19g
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C14140ne(1094744753, 3, false, false);
            }
        });
        final C17050sx c17050sx = new C17050sx(new InterfaceC16820sZ() { // from class: X.19h
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                ByteArrayInputStream byteArrayInputStream;
                Context context2 = context;
                int i3 = i;
                C5NU c5nu = new C5NU();
                AssetManager assets2 = context2.getAssets();
                byte[] A02 = C5KQ.A02(assets2, "params_map_v4_u0.txt");
                if (A02 == null) {
                    A02 = C5KQ.A02(assets2, AnonymousClass001.A0g("params_map", "", OptSvcAnalyticsStore.FILE_SUFFIX));
                }
                byte[] A022 = C5KQ.A02(context2.getAssets(), "params_names_v4_u0.txt");
                if (A02 != null && A02.length >= 2) {
                    String str4 = new String(A02, 0, 2);
                    c5nu.A04 = true;
                    if (str4.equals("v2")) {
                        C5NV A00 = AbstractC53712Np1.A00(new String(A02), c5nu.A04);
                        c5nu.A02 = A00;
                        C5KR c5kr = new C5KR();
                        c5nu.A01 = c5kr;
                        c5kr.A01 = A00.A00;
                    } else if (str4.equals("v4")) {
                        try {
                            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(A02);
                            if (A022 == null) {
                                byteArrayInputStream = null;
                            } else {
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(A022);
                                } finally {
                                }
                            }
                            try {
                                c5nu.A00(byteArrayInputStream2, byteArrayInputStream, i3);
                                if (byteArrayInputStream != null) {
                                    byteArrayInputStream.close();
                                }
                                byteArrayInputStream2.close();
                            } finally {
                            }
                        } catch (IOException e2) {
                            C0K8.A0F("ParamsMapParser", "Failed to load two input streams when parsing params map to map", e2);
                        }
                    } else {
                        C0K8.A0C("ParamsMapParser", "unrecognizable params map byte array");
                    }
                }
                return new C5F7(c5nu.A02.A01);
            }
        });
        final C17050sx A013 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.19i
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C18950wb.A01;
            }
        });
        c227619e.A02(str2, new InterfaceC08830cm() { // from class: X.19j
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return InterfaceC09390do.this.getValue();
            }
        }, new InterfaceC08830cm() { // from class: X.19k
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return InterfaceC09390do.this.getValue();
            }
        });
        C228319l c228319l = new C228319l();
        HashSet hashSet = new HashSet();
        InterfaceC228619o interfaceC228619o = new InterfaceC228619o() { // from class: X.19n
            @Override // X.InterfaceC228619o
            public final String getUserId() {
                return str;
            }
        };
        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.19p
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return InterfaceC09390do.this.getValue();
            }
        };
        ?? obj = new Object();
        C229019s c229019s = new C229019s(c227619e);
        boolean A00 = AbstractC229119t.A00(context);
        InterfaceC08830cm interfaceC08830cm2 = new InterfaceC08830cm() { // from class: X.19u
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return InterfaceC09390do.this.getValue();
            }
        };
        int[][] iArr = AbstractC20120yj.A00;
        if (AbstractC229319v.A00()) {
            hashSet = new HashSet();
            C54773OIm c54773OIm = C54773OIm.A03;
            if (c54773OIm == null) {
                c54773OIm = new C54773OIm(context);
                C54773OIm.A03 = c54773OIm;
            }
            hashSet.add(c54773OIm);
        }
        final C229419w c229419w = new C229419w(assets, interfaceC228619o, fBMobileConfigGlobalContextHolder, interfaceC227319b, obj, c228319l, c227419c, filesDir, "", hashSet, c229019s, interfaceC08830cm, interfaceC08830cm2, iArr, i, i2, 0, true, A00, z3, A07);
        if (c227419c.A00 == null) {
            c227419c.A00 = new C1A3(c229419w, abstractC12990ll);
        }
        boolean A072 = C20150ym.A07(AbstractC20100yh.A00(36317345806816348L));
        lightweightQuickPerformanceLogger.markerStart(13644804, i);
        if (A072) {
            c229419w.A0G(true);
            if (c229419w.A0E.get() && c229419w.A0A().getLatestHandle() != null) {
                lightweightQuickPerformanceLogger.markerPoint(13644804, i, "java_manager_created_v2");
                lightweightQuickPerformanceLogger.markerAnnotate(13644804, i, "app_upgrade", c229419w.A0H());
                C14250np.A00().A00.schedule(new Runnable() { // from class: X.4GD
                    @Override // java.lang.Runnable
                    public final void run() {
                        C229419w c229419w2 = C229419w.this;
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = lightweightQuickPerformanceLogger;
                        int i3 = i;
                        c229419w2.A0C();
                        lightweightQuickPerformanceLogger2.markerPoint(13644804, i3, "scheduled_cpp_manager_created");
                    }
                }, 0L, TimeUnit.MILLISECONDS);
                s = 2;
                lightweightQuickPerformanceLogger.markerEnd(13644804, i, s);
                return new C1AB(c229419w);
            }
        }
        c229419w.A0C();
        lightweightQuickPerformanceLogger.markerPoint(13644804, i, "cpp_manager_created_v2");
        lightweightQuickPerformanceLogger.markerAnnotate(13644804, i, "app_upgrade", c229419w.A0H());
        s = 3;
        lightweightQuickPerformanceLogger.markerEnd(13644804, i, s);
        return new C1AB(c229419w);
    }
}
