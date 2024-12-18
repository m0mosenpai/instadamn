package com.facebook.cameracore.ardelivery.xplat.cacheprovider;

import X.AbstractC12990ll;
import X.AbstractC150346pi;
import X.AbstractC150536q2;
import X.AnonymousClass870;
import X.C06090Tz;
import X.C14360o3;
import X.C150116pF;
import X.C150526q1;
import X.C18U;
import X.InterfaceC08830cm;
import X.InterfaceC150126pG;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class XplatFileCacheCreator {
    public final AbstractC150536q2 arDeliveryExperimentUtil;
    public final AbstractC150346pi assetStorage;
    public final InterfaceC150126pG assetsDiskCacheProviderFactory;

    public XplatFileCacheCreator(InterfaceC150126pG interfaceC150126pG, AbstractC150346pi abstractC150346pi, AbstractC150536q2 abstractC150536q2) {
        C14360o3.A0B(abstractC150536q2, 3);
        this.assetsDiskCacheProviderFactory = interfaceC150126pG;
        this.assetStorage = abstractC150346pi;
        this.arDeliveryExperimentUtil = abstractC150536q2;
        if (interfaceC150126pG == null && abstractC150346pi == null) {
            throw new IllegalArgumentException("No Cache Provider for Xplat File Cache Creator");
        }
    }

    public final ARDFileCache getJavaDiskCache(int i) {
        InterfaceC08830cm interfaceC08830cm;
        final long A01;
        long j;
        final C150116pF c150116pF;
        final boolean A012;
        final String str;
        final String str2;
        StashARDFileCache stashARDFileCache;
        int i2 = -1;
        if (this.assetsDiskCacheProviderFactory != null) {
            XplatAssetType ofCppValue = XplatAssetType.ofCppValue(i);
            if (ofCppValue != null) {
                i2 = ofCppValue.ordinal();
            }
            InterfaceC150126pG interfaceC150126pG = this.assetsDiskCacheProviderFactory;
            C150526q1 c150526q1 = (C150526q1) this.arDeliveryExperimentUtil;
            switch (i2) {
                case 1:
                    AbstractC12990ll abstractC12990ll = c150526q1.A01;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    final long A013 = C18U.A01(c06090Tz, abstractC12990ll, 36592451347415603L);
                    final C150116pF c150116pF2 = (C150116pF) interfaceC150126pG;
                    AbstractC150536q2 abstractC150536q2 = c150116pF2.A00;
                    AbstractC12990ll abstractC12990ll2 = ((C150526q1) abstractC150536q2).A01;
                    long A014 = C18U.A01(c06090Tz, abstractC12990ll2, 36592451347284529L);
                    long A015 = C18U.A01(c06090Tz, abstractC12990ll2, 36592451347350066L);
                    final boolean A016 = abstractC150536q2.A01();
                    final String str3 = "ard_effects";
                    final String str4 = "fe";
                    final String str5 = null;
                    final long j2 = 800 << 20;
                    final long j3 = A014 << 20;
                    final long j4 = A015 << 20;
                    interfaceC08830cm = new InterfaceC08830cm() { // from class: X.86q
                        /* JADX WARN: Type inference failed for: r7v0, types: [X.2oI, X.1MC] */
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            String str6;
                            C1M7 A017 = C1M7.A01();
                            String A0R = AnonymousClass001.A0R("ard_", str4);
                            ?? c1mc = new C1MC();
                            c1mc.A00 = A016;
                            c1mc.A05 = str3;
                            c1mc.A09 = false;
                            c1mc.A0A = true;
                            C24291Gy c24291Gy = new C24291Gy();
                            long j5 = j2;
                            c24291Gy.A01 = j5;
                            c24291Gy.A02 = j3;
                            c24291Gy.A03 = j4;
                            c1mc.A01 = c24291Gy.A00();
                            c1mc.A02 = new C1FC(((int) A013) * SandboxRepository.CACHE_TTL, false);
                            c1mc.A06 = str5;
                            C1MD A00 = c1mc.A00();
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A017.A00;
                            int hashCode = A0R.hashCode();
                            String str7 = A00.A05;
                            if (str7 == null) {
                                str7 = A0R;
                            }
                            lightweightQuickPerformanceLogger.markerStart(42991640, hashCode, "stash_name", str7);
                            try {
                                C1F9 A002 = C1M7.A00(A00, A0R, 5);
                                C1B8 c1b8 = A017.A03.A00;
                                C1B9 c1b9 = c1b8.A00;
                                if (c1b9 != null) {
                                    File A018 = c1b9.A01(C1B9.A00(A002.A02, A002.A00));
                                    ArrayList arrayList = new ArrayList(A002.A03.values());
                                    if (!arrayList.isEmpty()) {
                                        LinkedList<Pair> linkedList = new LinkedList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            C1B1 c1b1 = (C1B1) it.next();
                                            C1MU AJx = c1b8.A01.AJx(c1b1);
                                            if (AJx == null) {
                                                c1b8.DwH(A002, c1b1);
                                            } else if (AJx instanceof AbstractC25491Md) {
                                                linkedList.add(new Pair(c1b1, AJx));
                                            }
                                        }
                                        Collections.sort(linkedList, c1b8.A02);
                                        for (Pair pair : linkedList) {
                                            AbstractC25491Md abstractC25491Md = (AbstractC25491Md) pair.second;
                                            C1B0 c1b0 = (C1B0) ((C1B1) pair.first);
                                            if (!c1b0.A00) {
                                                str6 = null;
                                            } else {
                                                C23131As c23131As = A002.A01;
                                                if (c23131As == null) {
                                                    c23131As = abstractC25491Md.A01.A01();
                                                }
                                                str6 = AbstractC25501Me.A00(c23131As, c1b0).A01;
                                            }
                                            if (!TextUtils.isEmpty(str6)) {
                                                A018 = new File(A018, str6);
                                            }
                                        }
                                    }
                                    if (!A018.isDirectory()) {
                                        A018.mkdirs();
                                    }
                                    C1FD.A00(c1b8, A002, A018);
                                    C1MR A07 = A017.A07(A00, A018);
                                    C1M7.A02(A07, A002);
                                    lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 2);
                                    return new AnonymousClass870(A07, new AtomicReference(), j5);
                                }
                                throw new IllegalStateException(AnonymousClass001.A0R("Base Cask not initialized ", A002.A02));
                            } catch (Throwable th) {
                                lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 3);
                                throw th;
                            }
                        }
                    };
                    break;
                case 2:
                    A01 = C18U.A01(C06090Tz.A05, c150526q1.A01, 36592416987808235L);
                    j = 800;
                    c150116pF = (C150116pF) interfaceC150126pG;
                    A012 = c150116pF.A00.A01();
                    str = "ard_bundle";
                    str2 = "fb";
                    final String str6 = null;
                    final long j5 = j << 20;
                    final long j6 = 0 << 20;
                    interfaceC08830cm = new InterfaceC08830cm() { // from class: X.86q
                        /* JADX WARN: Type inference failed for: r7v0, types: [X.2oI, X.1MC] */
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            String str62;
                            C1M7 A017 = C1M7.A01();
                            String A0R = AnonymousClass001.A0R("ard_", str2);
                            ?? c1mc = new C1MC();
                            c1mc.A00 = A012;
                            c1mc.A05 = str;
                            c1mc.A09 = false;
                            c1mc.A0A = true;
                            C24291Gy c24291Gy = new C24291Gy();
                            long j52 = j5;
                            c24291Gy.A01 = j52;
                            c24291Gy.A02 = j6;
                            c24291Gy.A03 = j6;
                            c1mc.A01 = c24291Gy.A00();
                            c1mc.A02 = new C1FC(((int) A01) * SandboxRepository.CACHE_TTL, false);
                            c1mc.A06 = str6;
                            C1MD A00 = c1mc.A00();
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A017.A00;
                            int hashCode = A0R.hashCode();
                            String str7 = A00.A05;
                            if (str7 == null) {
                                str7 = A0R;
                            }
                            lightweightQuickPerformanceLogger.markerStart(42991640, hashCode, "stash_name", str7);
                            try {
                                C1F9 A002 = C1M7.A00(A00, A0R, 5);
                                C1B8 c1b8 = A017.A03.A00;
                                C1B9 c1b9 = c1b8.A00;
                                if (c1b9 != null) {
                                    File A018 = c1b9.A01(C1B9.A00(A002.A02, A002.A00));
                                    ArrayList arrayList = new ArrayList(A002.A03.values());
                                    if (!arrayList.isEmpty()) {
                                        LinkedList<Pair> linkedList = new LinkedList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            C1B1 c1b1 = (C1B1) it.next();
                                            C1MU AJx = c1b8.A01.AJx(c1b1);
                                            if (AJx == null) {
                                                c1b8.DwH(A002, c1b1);
                                            } else if (AJx instanceof AbstractC25491Md) {
                                                linkedList.add(new Pair(c1b1, AJx));
                                            }
                                        }
                                        Collections.sort(linkedList, c1b8.A02);
                                        for (Pair pair : linkedList) {
                                            AbstractC25491Md abstractC25491Md = (AbstractC25491Md) pair.second;
                                            C1B0 c1b0 = (C1B0) ((C1B1) pair.first);
                                            if (!c1b0.A00) {
                                                str62 = null;
                                            } else {
                                                C23131As c23131As = A002.A01;
                                                if (c23131As == null) {
                                                    c23131As = abstractC25491Md.A01.A01();
                                                }
                                                str62 = AbstractC25501Me.A00(c23131As, c1b0).A01;
                                            }
                                            if (!TextUtils.isEmpty(str62)) {
                                                A018 = new File(A018, str62);
                                            }
                                        }
                                    }
                                    if (!A018.isDirectory()) {
                                        A018.mkdirs();
                                    }
                                    C1FD.A00(c1b8, A002, A018);
                                    C1MR A07 = A017.A07(A00, A018);
                                    C1M7.A02(A07, A002);
                                    lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 2);
                                    return new AnonymousClass870(A07, new AtomicReference(), j52);
                                }
                                throw new IllegalStateException(AnonymousClass001.A0R("Base Cask not initialized ", A002.A02));
                            } catch (Throwable th) {
                                lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 3);
                                throw th;
                            }
                        }
                    };
                    break;
                case 3:
                case 4:
                case 5:
                case 10:
                case 11:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case 14:
                case Process.SIGTERM /* 15 */:
                case 16:
                default:
                    A01 = C18U.A01(C06090Tz.A05, c150526q1.A01, 36592416987677162L);
                    j = 50;
                    c150116pF = (C150116pF) interfaceC150126pG;
                    A012 = c150116pF.A00.A01();
                    str = "ard_shared_model_cache";
                    str2 = "sc";
                    final String str62 = null;
                    final long j52 = j << 20;
                    final long j62 = 0 << 20;
                    interfaceC08830cm = new InterfaceC08830cm() { // from class: X.86q
                        /* JADX WARN: Type inference failed for: r7v0, types: [X.2oI, X.1MC] */
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            String str622;
                            C1M7 A017 = C1M7.A01();
                            String A0R = AnonymousClass001.A0R("ard_", str2);
                            ?? c1mc = new C1MC();
                            c1mc.A00 = A012;
                            c1mc.A05 = str;
                            c1mc.A09 = false;
                            c1mc.A0A = true;
                            C24291Gy c24291Gy = new C24291Gy();
                            long j522 = j52;
                            c24291Gy.A01 = j522;
                            c24291Gy.A02 = j62;
                            c24291Gy.A03 = j62;
                            c1mc.A01 = c24291Gy.A00();
                            c1mc.A02 = new C1FC(((int) A01) * SandboxRepository.CACHE_TTL, false);
                            c1mc.A06 = str62;
                            C1MD A00 = c1mc.A00();
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A017.A00;
                            int hashCode = A0R.hashCode();
                            String str7 = A00.A05;
                            if (str7 == null) {
                                str7 = A0R;
                            }
                            lightweightQuickPerformanceLogger.markerStart(42991640, hashCode, "stash_name", str7);
                            try {
                                C1F9 A002 = C1M7.A00(A00, A0R, 5);
                                C1B8 c1b8 = A017.A03.A00;
                                C1B9 c1b9 = c1b8.A00;
                                if (c1b9 != null) {
                                    File A018 = c1b9.A01(C1B9.A00(A002.A02, A002.A00));
                                    ArrayList arrayList = new ArrayList(A002.A03.values());
                                    if (!arrayList.isEmpty()) {
                                        LinkedList<Pair> linkedList = new LinkedList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            C1B1 c1b1 = (C1B1) it.next();
                                            C1MU AJx = c1b8.A01.AJx(c1b1);
                                            if (AJx == null) {
                                                c1b8.DwH(A002, c1b1);
                                            } else if (AJx instanceof AbstractC25491Md) {
                                                linkedList.add(new Pair(c1b1, AJx));
                                            }
                                        }
                                        Collections.sort(linkedList, c1b8.A02);
                                        for (Pair pair : linkedList) {
                                            AbstractC25491Md abstractC25491Md = (AbstractC25491Md) pair.second;
                                            C1B0 c1b0 = (C1B0) ((C1B1) pair.first);
                                            if (!c1b0.A00) {
                                                str622 = null;
                                            } else {
                                                C23131As c23131As = A002.A01;
                                                if (c23131As == null) {
                                                    c23131As = abstractC25491Md.A01.A01();
                                                }
                                                str622 = AbstractC25501Me.A00(c23131As, c1b0).A01;
                                            }
                                            if (!TextUtils.isEmpty(str622)) {
                                                A018 = new File(A018, str622);
                                            }
                                        }
                                    }
                                    if (!A018.isDirectory()) {
                                        A018.mkdirs();
                                    }
                                    C1FD.A00(c1b8, A002, A018);
                                    C1MR A07 = A017.A07(A00, A018);
                                    C1M7.A02(A07, A002);
                                    lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 2);
                                    return new AnonymousClass870(A07, new AtomicReference(), j522);
                                }
                                throw new IllegalStateException(AnonymousClass001.A0R("Base Cask not initialized ", A002.A02));
                            } catch (Throwable th) {
                                lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 3);
                                throw th;
                            }
                        }
                    };
                    break;
                case 6:
                    A01 = C18U.A01(C06090Tz.A05, c150526q1.A01, 36592416987873772L);
                    j = 800;
                    c150116pF = (C150116pF) interfaceC150126pG;
                    A012 = c150116pF.A00.A01();
                    str = "ard_remote";
                    str2 = "remote";
                    final String str622 = null;
                    final long j522 = j << 20;
                    final long j622 = 0 << 20;
                    interfaceC08830cm = new InterfaceC08830cm() { // from class: X.86q
                        /* JADX WARN: Type inference failed for: r7v0, types: [X.2oI, X.1MC] */
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            String str6222;
                            C1M7 A017 = C1M7.A01();
                            String A0R = AnonymousClass001.A0R("ard_", str2);
                            ?? c1mc = new C1MC();
                            c1mc.A00 = A012;
                            c1mc.A05 = str;
                            c1mc.A09 = false;
                            c1mc.A0A = true;
                            C24291Gy c24291Gy = new C24291Gy();
                            long j5222 = j522;
                            c24291Gy.A01 = j5222;
                            c24291Gy.A02 = j622;
                            c24291Gy.A03 = j622;
                            c1mc.A01 = c24291Gy.A00();
                            c1mc.A02 = new C1FC(((int) A01) * SandboxRepository.CACHE_TTL, false);
                            c1mc.A06 = str622;
                            C1MD A00 = c1mc.A00();
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A017.A00;
                            int hashCode = A0R.hashCode();
                            String str7 = A00.A05;
                            if (str7 == null) {
                                str7 = A0R;
                            }
                            lightweightQuickPerformanceLogger.markerStart(42991640, hashCode, "stash_name", str7);
                            try {
                                C1F9 A002 = C1M7.A00(A00, A0R, 5);
                                C1B8 c1b8 = A017.A03.A00;
                                C1B9 c1b9 = c1b8.A00;
                                if (c1b9 != null) {
                                    File A018 = c1b9.A01(C1B9.A00(A002.A02, A002.A00));
                                    ArrayList arrayList = new ArrayList(A002.A03.values());
                                    if (!arrayList.isEmpty()) {
                                        LinkedList<Pair> linkedList = new LinkedList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            C1B1 c1b1 = (C1B1) it.next();
                                            C1MU AJx = c1b8.A01.AJx(c1b1);
                                            if (AJx == null) {
                                                c1b8.DwH(A002, c1b1);
                                            } else if (AJx instanceof AbstractC25491Md) {
                                                linkedList.add(new Pair(c1b1, AJx));
                                            }
                                        }
                                        Collections.sort(linkedList, c1b8.A02);
                                        for (Pair pair : linkedList) {
                                            AbstractC25491Md abstractC25491Md = (AbstractC25491Md) pair.second;
                                            C1B0 c1b0 = (C1B0) ((C1B1) pair.first);
                                            if (!c1b0.A00) {
                                                str6222 = null;
                                            } else {
                                                C23131As c23131As = A002.A01;
                                                if (c23131As == null) {
                                                    c23131As = abstractC25491Md.A01.A01();
                                                }
                                                str6222 = AbstractC25501Me.A00(c23131As, c1b0).A01;
                                            }
                                            if (!TextUtils.isEmpty(str6222)) {
                                                A018 = new File(A018, str6222);
                                            }
                                        }
                                    }
                                    if (!A018.isDirectory()) {
                                        A018.mkdirs();
                                    }
                                    C1FD.A00(c1b8, A002, A018);
                                    C1MR A07 = A017.A07(A00, A018);
                                    C1M7.A02(A07, A002);
                                    lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 2);
                                    return new AnonymousClass870(A07, new AtomicReference(), j5222);
                                }
                                throw new IllegalStateException(AnonymousClass001.A0R("Base Cask not initialized ", A002.A02));
                            } catch (Throwable th) {
                                lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 3);
                                throw th;
                            }
                        }
                    };
                    break;
                case 7:
                    final long A017 = C18U.A01(C06090Tz.A05, c150526q1.A01, 36592416987677162L);
                    final C150116pF c150116pF3 = (C150116pF) interfaceC150126pG;
                    final boolean A018 = c150116pF3.A00.A01();
                    final String str7 = "ard_facetracker";
                    final String str8 = "fm";
                    final long j7 = 50 << 20;
                    final long j8 = 0 << 20;
                    interfaceC08830cm = new InterfaceC08830cm() { // from class: X.86q
                        /* JADX WARN: Type inference failed for: r7v0, types: [X.2oI, X.1MC] */
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            String str6222;
                            C1M7 A0172 = C1M7.A01();
                            String A0R = AnonymousClass001.A0R("ard_", str8);
                            ?? c1mc = new C1MC();
                            c1mc.A00 = A018;
                            c1mc.A05 = str7;
                            c1mc.A09 = false;
                            c1mc.A0A = true;
                            C24291Gy c24291Gy = new C24291Gy();
                            long j5222 = j7;
                            c24291Gy.A01 = j5222;
                            c24291Gy.A02 = j8;
                            c24291Gy.A03 = j8;
                            c1mc.A01 = c24291Gy.A00();
                            c1mc.A02 = new C1FC(((int) A017) * SandboxRepository.CACHE_TTL, false);
                            c1mc.A06 = str7;
                            C1MD A00 = c1mc.A00();
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A0172.A00;
                            int hashCode = A0R.hashCode();
                            String str72 = A00.A05;
                            if (str72 == null) {
                                str72 = A0R;
                            }
                            lightweightQuickPerformanceLogger.markerStart(42991640, hashCode, "stash_name", str72);
                            try {
                                C1F9 A002 = C1M7.A00(A00, A0R, 5);
                                C1B8 c1b8 = A0172.A03.A00;
                                C1B9 c1b9 = c1b8.A00;
                                if (c1b9 != null) {
                                    File A0182 = c1b9.A01(C1B9.A00(A002.A02, A002.A00));
                                    ArrayList arrayList = new ArrayList(A002.A03.values());
                                    if (!arrayList.isEmpty()) {
                                        LinkedList<Pair> linkedList = new LinkedList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            C1B1 c1b1 = (C1B1) it.next();
                                            C1MU AJx = c1b8.A01.AJx(c1b1);
                                            if (AJx == null) {
                                                c1b8.DwH(A002, c1b1);
                                            } else if (AJx instanceof AbstractC25491Md) {
                                                linkedList.add(new Pair(c1b1, AJx));
                                            }
                                        }
                                        Collections.sort(linkedList, c1b8.A02);
                                        for (Pair pair : linkedList) {
                                            AbstractC25491Md abstractC25491Md = (AbstractC25491Md) pair.second;
                                            C1B0 c1b0 = (C1B0) ((C1B1) pair.first);
                                            if (!c1b0.A00) {
                                                str6222 = null;
                                            } else {
                                                C23131As c23131As = A002.A01;
                                                if (c23131As == null) {
                                                    c23131As = abstractC25491Md.A01.A01();
                                                }
                                                str6222 = AbstractC25501Me.A00(c23131As, c1b0).A01;
                                            }
                                            if (!TextUtils.isEmpty(str6222)) {
                                                A0182 = new File(A0182, str6222);
                                            }
                                        }
                                    }
                                    if (!A0182.isDirectory()) {
                                        A0182.mkdirs();
                                    }
                                    C1FD.A00(c1b8, A002, A0182);
                                    C1MR A07 = A0172.A07(A00, A0182);
                                    C1M7.A02(A07, A002);
                                    lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 2);
                                    return new AnonymousClass870(A07, new AtomicReference(), j5222);
                                }
                                throw new IllegalStateException(AnonymousClass001.A0R("Base Cask not initialized ", A002.A02));
                            } catch (Throwable th) {
                                lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 3);
                                throw th;
                            }
                        }
                    };
                    break;
                case 8:
                    A01 = C18U.A01(C06090Tz.A05, c150526q1.A01, 36592416987677162L);
                    j = 50;
                    c150116pF = (C150116pF) interfaceC150126pG;
                    A012 = c150116pF.A00.A01();
                    str = "ard_hair_segmentation";
                    str2 = "hs";
                    final String str6222 = null;
                    final long j5222 = j << 20;
                    final long j6222 = 0 << 20;
                    interfaceC08830cm = new InterfaceC08830cm() { // from class: X.86q
                        /* JADX WARN: Type inference failed for: r7v0, types: [X.2oI, X.1MC] */
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            String str62222;
                            C1M7 A0172 = C1M7.A01();
                            String A0R = AnonymousClass001.A0R("ard_", str2);
                            ?? c1mc = new C1MC();
                            c1mc.A00 = A012;
                            c1mc.A05 = str;
                            c1mc.A09 = false;
                            c1mc.A0A = true;
                            C24291Gy c24291Gy = new C24291Gy();
                            long j52222 = j5222;
                            c24291Gy.A01 = j52222;
                            c24291Gy.A02 = j6222;
                            c24291Gy.A03 = j6222;
                            c1mc.A01 = c24291Gy.A00();
                            c1mc.A02 = new C1FC(((int) A01) * SandboxRepository.CACHE_TTL, false);
                            c1mc.A06 = str6222;
                            C1MD A00 = c1mc.A00();
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A0172.A00;
                            int hashCode = A0R.hashCode();
                            String str72 = A00.A05;
                            if (str72 == null) {
                                str72 = A0R;
                            }
                            lightweightQuickPerformanceLogger.markerStart(42991640, hashCode, "stash_name", str72);
                            try {
                                C1F9 A002 = C1M7.A00(A00, A0R, 5);
                                C1B8 c1b8 = A0172.A03.A00;
                                C1B9 c1b9 = c1b8.A00;
                                if (c1b9 != null) {
                                    File A0182 = c1b9.A01(C1B9.A00(A002.A02, A002.A00));
                                    ArrayList arrayList = new ArrayList(A002.A03.values());
                                    if (!arrayList.isEmpty()) {
                                        LinkedList<Pair> linkedList = new LinkedList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            C1B1 c1b1 = (C1B1) it.next();
                                            C1MU AJx = c1b8.A01.AJx(c1b1);
                                            if (AJx == null) {
                                                c1b8.DwH(A002, c1b1);
                                            } else if (AJx instanceof AbstractC25491Md) {
                                                linkedList.add(new Pair(c1b1, AJx));
                                            }
                                        }
                                        Collections.sort(linkedList, c1b8.A02);
                                        for (Pair pair : linkedList) {
                                            AbstractC25491Md abstractC25491Md = (AbstractC25491Md) pair.second;
                                            C1B0 c1b0 = (C1B0) ((C1B1) pair.first);
                                            if (!c1b0.A00) {
                                                str62222 = null;
                                            } else {
                                                C23131As c23131As = A002.A01;
                                                if (c23131As == null) {
                                                    c23131As = abstractC25491Md.A01.A01();
                                                }
                                                str62222 = AbstractC25501Me.A00(c23131As, c1b0).A01;
                                            }
                                            if (!TextUtils.isEmpty(str62222)) {
                                                A0182 = new File(A0182, str62222);
                                            }
                                        }
                                    }
                                    if (!A0182.isDirectory()) {
                                        A0182.mkdirs();
                                    }
                                    C1FD.A00(c1b8, A002, A0182);
                                    C1MR A07 = A0172.A07(A00, A0182);
                                    C1M7.A02(A07, A002);
                                    lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 2);
                                    return new AnonymousClass870(A07, new AtomicReference(), j52222);
                                }
                                throw new IllegalStateException(AnonymousClass001.A0R("Base Cask not initialized ", A002.A02));
                            } catch (Throwable th) {
                                lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 3);
                                throw th;
                            }
                        }
                    };
                    break;
                case 9:
                    A01 = C18U.A01(C06090Tz.A05, c150526q1.A01, 36592416987677162L);
                    j = 50;
                    c150116pF = (C150116pF) interfaceC150126pG;
                    A012 = c150116pF.A00.A01();
                    str = "ard_segmentation";
                    str2 = "sm";
                    final String str62222 = null;
                    final long j52222 = j << 20;
                    final long j62222 = 0 << 20;
                    interfaceC08830cm = new InterfaceC08830cm() { // from class: X.86q
                        /* JADX WARN: Type inference failed for: r7v0, types: [X.2oI, X.1MC] */
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            String str622222;
                            C1M7 A0172 = C1M7.A01();
                            String A0R = AnonymousClass001.A0R("ard_", str2);
                            ?? c1mc = new C1MC();
                            c1mc.A00 = A012;
                            c1mc.A05 = str;
                            c1mc.A09 = false;
                            c1mc.A0A = true;
                            C24291Gy c24291Gy = new C24291Gy();
                            long j522222 = j52222;
                            c24291Gy.A01 = j522222;
                            c24291Gy.A02 = j62222;
                            c24291Gy.A03 = j62222;
                            c1mc.A01 = c24291Gy.A00();
                            c1mc.A02 = new C1FC(((int) A01) * SandboxRepository.CACHE_TTL, false);
                            c1mc.A06 = str62222;
                            C1MD A00 = c1mc.A00();
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A0172.A00;
                            int hashCode = A0R.hashCode();
                            String str72 = A00.A05;
                            if (str72 == null) {
                                str72 = A0R;
                            }
                            lightweightQuickPerformanceLogger.markerStart(42991640, hashCode, "stash_name", str72);
                            try {
                                C1F9 A002 = C1M7.A00(A00, A0R, 5);
                                C1B8 c1b8 = A0172.A03.A00;
                                C1B9 c1b9 = c1b8.A00;
                                if (c1b9 != null) {
                                    File A0182 = c1b9.A01(C1B9.A00(A002.A02, A002.A00));
                                    ArrayList arrayList = new ArrayList(A002.A03.values());
                                    if (!arrayList.isEmpty()) {
                                        LinkedList<Pair> linkedList = new LinkedList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            C1B1 c1b1 = (C1B1) it.next();
                                            C1MU AJx = c1b8.A01.AJx(c1b1);
                                            if (AJx == null) {
                                                c1b8.DwH(A002, c1b1);
                                            } else if (AJx instanceof AbstractC25491Md) {
                                                linkedList.add(new Pair(c1b1, AJx));
                                            }
                                        }
                                        Collections.sort(linkedList, c1b8.A02);
                                        for (Pair pair : linkedList) {
                                            AbstractC25491Md abstractC25491Md = (AbstractC25491Md) pair.second;
                                            C1B0 c1b0 = (C1B0) ((C1B1) pair.first);
                                            if (!c1b0.A00) {
                                                str622222 = null;
                                            } else {
                                                C23131As c23131As = A002.A01;
                                                if (c23131As == null) {
                                                    c23131As = abstractC25491Md.A01.A01();
                                                }
                                                str622222 = AbstractC25501Me.A00(c23131As, c1b0).A01;
                                            }
                                            if (!TextUtils.isEmpty(str622222)) {
                                                A0182 = new File(A0182, str622222);
                                            }
                                        }
                                    }
                                    if (!A0182.isDirectory()) {
                                        A0182.mkdirs();
                                    }
                                    C1FD.A00(c1b8, A002, A0182);
                                    C1MR A07 = A0172.A07(A00, A0182);
                                    C1M7.A02(A07, A002);
                                    lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 2);
                                    return new AnonymousClass870(A07, new AtomicReference(), j522222);
                                }
                                throw new IllegalStateException(AnonymousClass001.A0R("Base Cask not initialized ", A002.A02));
                            } catch (Throwable th) {
                                lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 3);
                                throw th;
                            }
                        }
                    };
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    C18U.A01(C06090Tz.A05, c150526q1.A01, 36592416987677162L);
                    interfaceC08830cm = null;
                    break;
                case 17:
                    A01 = C18U.A01(C06090Tz.A05, c150526q1.A01, 36592451347415603L);
                    j = 1;
                    c150116pF = (C150116pF) interfaceC150126pG;
                    A012 = c150116pF.A00.A01();
                    str = "ard_scripting_packages";
                    str2 = "scripting";
                    final String str622222 = null;
                    final long j522222 = j << 20;
                    final long j622222 = 0 << 20;
                    interfaceC08830cm = new InterfaceC08830cm() { // from class: X.86q
                        /* JADX WARN: Type inference failed for: r7v0, types: [X.2oI, X.1MC] */
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            String str6222222;
                            C1M7 A0172 = C1M7.A01();
                            String A0R = AnonymousClass001.A0R("ard_", str2);
                            ?? c1mc = new C1MC();
                            c1mc.A00 = A012;
                            c1mc.A05 = str;
                            c1mc.A09 = false;
                            c1mc.A0A = true;
                            C24291Gy c24291Gy = new C24291Gy();
                            long j5222222 = j522222;
                            c24291Gy.A01 = j5222222;
                            c24291Gy.A02 = j622222;
                            c24291Gy.A03 = j622222;
                            c1mc.A01 = c24291Gy.A00();
                            c1mc.A02 = new C1FC(((int) A01) * SandboxRepository.CACHE_TTL, false);
                            c1mc.A06 = str622222;
                            C1MD A00 = c1mc.A00();
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A0172.A00;
                            int hashCode = A0R.hashCode();
                            String str72 = A00.A05;
                            if (str72 == null) {
                                str72 = A0R;
                            }
                            lightweightQuickPerformanceLogger.markerStart(42991640, hashCode, "stash_name", str72);
                            try {
                                C1F9 A002 = C1M7.A00(A00, A0R, 5);
                                C1B8 c1b8 = A0172.A03.A00;
                                C1B9 c1b9 = c1b8.A00;
                                if (c1b9 != null) {
                                    File A0182 = c1b9.A01(C1B9.A00(A002.A02, A002.A00));
                                    ArrayList arrayList = new ArrayList(A002.A03.values());
                                    if (!arrayList.isEmpty()) {
                                        LinkedList<Pair> linkedList = new LinkedList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            C1B1 c1b1 = (C1B1) it.next();
                                            C1MU AJx = c1b8.A01.AJx(c1b1);
                                            if (AJx == null) {
                                                c1b8.DwH(A002, c1b1);
                                            } else if (AJx instanceof AbstractC25491Md) {
                                                linkedList.add(new Pair(c1b1, AJx));
                                            }
                                        }
                                        Collections.sort(linkedList, c1b8.A02);
                                        for (Pair pair : linkedList) {
                                            AbstractC25491Md abstractC25491Md = (AbstractC25491Md) pair.second;
                                            C1B0 c1b0 = (C1B0) ((C1B1) pair.first);
                                            if (!c1b0.A00) {
                                                str6222222 = null;
                                            } else {
                                                C23131As c23131As = A002.A01;
                                                if (c23131As == null) {
                                                    c23131As = abstractC25491Md.A01.A01();
                                                }
                                                str6222222 = AbstractC25501Me.A00(c23131As, c1b0).A01;
                                            }
                                            if (!TextUtils.isEmpty(str6222222)) {
                                                A0182 = new File(A0182, str6222222);
                                            }
                                        }
                                    }
                                    if (!A0182.isDirectory()) {
                                        A0182.mkdirs();
                                    }
                                    C1FD.A00(c1b8, A002, A0182);
                                    C1MR A07 = A0172.A07(A00, A0182);
                                    C1M7.A02(A07, A002);
                                    lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 2);
                                    return new AnonymousClass870(A07, new AtomicReference(), j5222222);
                                }
                                throw new IllegalStateException(AnonymousClass001.A0R("Base Cask not initialized ", A002.A02));
                            } catch (Throwable th) {
                                lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, (short) 3);
                                throw th;
                            }
                        }
                    };
                    break;
            }
            AnonymousClass870 anonymousClass870 = (AnonymousClass870) interfaceC08830cm.get();
            synchronized (anonymousClass870) {
                stashARDFileCache = anonymousClass870.A00;
                if (stashARDFileCache == null) {
                    StashARDFileCache stashARDFileCache2 = StashARDFileCache.$redex_init_class;
                    stashARDFileCache = new StashARDFileCache(anonymousClass870.A01, anonymousClass870.A02);
                    anonymousClass870.A00 = stashARDFileCache;
                }
            }
            return stashARDFileCache;
        }
        throw new IllegalArgumentException("Asset Provider is empty");
    }
}
