package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2BZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BZ {
    public static final String A0E = AnonymousClass001.A0R("CacheManager", "_default");
    public C2QI A00;
    public C1121954n A01;
    public C2QD A02;
    public boolean A03 = false;
    public final int A04;
    public final Handler A05;
    public final C2BX A06;
    public final C2BY A07;
    public final C461429y A08;
    public final HeroPlayerSetting A09;
    public final InterfaceC46402Bc A0A;
    public final Map A0B;
    public final Map A0C;
    public final Context A0D;

    public C2BZ(Context context, Handler handler, C2BX c2bx, final C2BY c2by, C461429y c461429y, HeroPlayerSetting heroPlayerSetting, Map map) {
        final InterfaceC46402Bc c46392Bb;
        try {
            AbstractC460729r.A01("CacheManagerLaunch");
            this.A06 = c2bx;
            this.A0C = map;
            this.A09 = heroPlayerSetting;
            this.A08 = c461429y;
            this.A07 = c2by;
            this.A0B = new WeakHashMap();
            int i = c2bx.A00;
            this.A04 = i;
            this.A0D = context;
            long j = i;
            if (c2bx.A05) {
                C41961wm c41961wm = heroPlayerSetting.A0y;
                c46392Bb = new TSP(c41961wm.A00, c41961wm.A01, c41961wm.A08, c41961wm.A09, j);
            } else if (c2bx.A04) {
                C41961wm c41961wm2 = heroPlayerSetting.A0y;
                c46392Bb = new C111284zq(j, c41961wm2.A08, c41961wm2.A00);
            } else {
                c46392Bb = new C46392Bb(j);
            }
            this.A0A = c2bx.A03 ? new InterfaceC46402Bc(c2by, c46392Bb) { // from class: X.2Bf
                public final C2BY A00;
                public final InterfaceC46402Bc A01;

                {
                    this.A01 = c46392Bb;
                    this.A00 = c2by;
                }

                @Override // X.InterfaceC46402Bc
                public final void DEJ(String str, String str2, int i2, int i3) {
                    this.A01.DEJ(str, str2, i2, i3);
                    AbstractC49822Qs.A00(str2);
                    AbstractC459729h.A01("ServiceEventCallbackImpl", "skipping log because listener is null for event type: ", new Object[0]);
                }

                @Override // X.InterfaceC46412Bd
                public final void DnP(C2QE c2qe, C49802Qq c49802Qq) {
                    this.A01.DnP(c2qe, c49802Qq);
                }

                @Override // X.InterfaceC46412Bd
                public final void DnQ(C2QE c2qe, C49802Qq c49802Qq) {
                    this.A01.DnQ(c2qe, c49802Qq);
                }

                @Override // X.InterfaceC46412Bd
                public final void DnR(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2) {
                    this.A01.DnS(c2qe, c49802Qq, c49802Qq2, C05F.A0C);
                }

                @Override // X.InterfaceC46412Bd
                public final void DnS(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2, Integer num) {
                    this.A01.DnS(c2qe, c49802Qq, c49802Qq2, num);
                }

                @Override // X.InterfaceC46402Bc
                public final void Do1(C2QE c2qe, String str, long j2, long j3) {
                    this.A01.Do1(c2qe, str, j2, j3);
                }
            } : c46392Bb;
            this.A05 = handler;
            if (!c2bx.A02) {
                synchronized (this) {
                    if (this.A02 == null) {
                        A00();
                    }
                }
            }
        } finally {
            AbstractC460729r.A00();
        }
    }

    public final synchronized C2QD A03() {
        if (this.A02 == null) {
            A00();
        }
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r11.A0L != false) goto L10;
     */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.4rO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2BZ.A00():void");
    }

    public static void A01(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                A01(file2);
            }
        }
        file.delete();
    }

    public static void A02(String str, Integer num) {
        String str2;
        String str3;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                str2 = "/ExoPlayerCacheDir/videocache";
            } else {
                str2 = "/ExoPlayerCacheDir/videoprefetchcache";
            }
        } else {
            str2 = "/ExoPlayerCacheDir/videocachemetadata";
        }
        File file = new File(AnonymousClass001.A0R(str, str2));
        if (file.exists()) {
            try {
                switch (intValue) {
                    case 0:
                        str3 = "GENERAL";
                        break;
                    case 1:
                        str3 = "METADATA";
                        break;
                    default:
                        str3 = "PREFETCH";
                        break;
                }
                AbstractC460729r.A01(AnonymousClass001.A0R("empty", str3));
                AbstractC459729h.A01(A0E, AnonymousClass001.A0R("purging ", str3), new Object[0]);
                A01(file);
            } finally {
                AbstractC460729r.A00();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.54n] */
    public final void A05() {
        long j;
        C2QD A03 = A03();
        if (A03 != null) {
            if (this.A01 == null) {
                final C2A7 c2a7 = C2A7.A00;
                AbstractC05810Sj.A00(c2a7);
                this.A01 = new Object(c2a7) { // from class: X.54n
                    public final C2A7 A00;

                    {
                        this.A00 = c2a7;
                    }
                };
            }
            C41961wm c41961wm = this.A09.A0y;
            long j2 = c41961wm.A0D;
            java.util.Set BKo = A03.BKo();
            if (!BKo.isEmpty()) {
                Iterator it = BKo.iterator();
                while (it.hasNext()) {
                    NavigableSet<C49802Qq> Ajh = A03.Ajh((String) it.next());
                    if (!Ajh.isEmpty()) {
                        for (C49802Qq c49802Qq : Ajh) {
                            if (System.currentTimeMillis() - c49802Qq.A02 >= j2) {
                                A03.A03(c49802Qq, "ttl_eviction");
                            }
                        }
                    }
                }
            }
            Handler handler = this.A05;
            Runnable runnable = new Runnable() { // from class: X.54o
                @Override // java.lang.Runnable
                public final void run() {
                    C2BZ.this.A05();
                }
            };
            if (this.A03) {
                j = c41961wm.A0B;
            } else {
                j = c41961wm.A0C;
            }
            handler.postDelayed(runnable, j);
        }
    }

    public final void A06(List list) {
        C2QD A03;
        C2QD A032 = A03();
        if (A032 != null) {
            A032.Aja();
            java.util.Set<String> BKo = A032.BKo();
            HashSet hashSet = new HashSet(list);
            for (String str : BKo) {
                if (hashSet.contains(AbstractC49822Qs.A00(str)) && (A03 = A03()) != null) {
                    Iterator it = A03.Ajh(str).iterator();
                    while (it.hasNext()) {
                        A03.A03((C49802Qq) it.next(), "api_eviction");
                    }
                }
            }
            A032.Aja();
        }
    }

    public final boolean A07(android.net.Uri uri, C4SS c4ss, C4BB c4bb, boolean z) {
        String A02 = c4bb.A02();
        String str = c4ss.A0K.A0G;
        boolean z2 = c4ss.A0A;
        C2QD A03 = A03();
        if (A03 != null) {
            String A00 = AbstractC459729h.A00(uri, A02, str, z2, this.A09.A3G);
            if (z) {
                C2QI c2qi = this.A00;
                if (c2qi != null) {
                    ConcurrentHashMap concurrentHashMap = c2qi.A00;
                    java.util.Set set = (java.util.Set) concurrentHashMap.get(str);
                    if (set != null) {
                        try {
                            int hashCode = A00.hashCode();
                            if (!set.isEmpty()) {
                                if (set.contains(Integer.valueOf(hashCode))) {
                                    return true;
                                }
                            }
                        } catch (NullPointerException unused) {
                            android.util.Log.e("PerVideoCacheLookup", String.format("Invalid video cache for video id = %s and cache key %s", str, A00));
                            concurrentHashMap.remove(str);
                        }
                    }
                }
            } else {
                return A03.CR5(A00, 0L, 1L);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x017d, code lost:
    
        if (java.lang.Integer.parseInt((java.lang.String) r5.get("progressive.enable_throttling_data_source")) != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC92374Bs A04(X.C2B4 r41, com.facebook.exoplayer.monitor.VpsEventCallback r42, X.C2BB r43, X.EnumC91984Ae r44, X.C92304Bk r45, X.InterfaceC460429o r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.util.Map r51, java.util.concurrent.atomic.AtomicBoolean r52, java.util.concurrent.atomic.AtomicBoolean r53, int r54, int r55, int r56, long r57, boolean r59, boolean r60, boolean r61, boolean r62, boolean r63, boolean r64, boolean r65, boolean r66) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2BZ.A04(X.2B4, com.facebook.exoplayer.monitor.VpsEventCallback, X.2BB, X.4Ae, X.4Bk, X.29o, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, int, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.4Bs");
    }
}
