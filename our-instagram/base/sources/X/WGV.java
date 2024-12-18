package X;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WGV {
    public static final long A0c;
    public static final long A0d;
    public long A03;
    public YCL A04;
    public WG8 A05;
    public C69522Vql A06;
    public AbstractC66028TyQ A07;
    public AbstractC66028TyQ A08;
    public long A0D;
    public YCL A0E;
    public final C58647PzK A0G;
    public final W1m A0H;
    public final InterfaceC58019Po5 A0I;
    public final C55070OaQ A0J;
    public final C69409Vmt A0L;
    public final C69489VoC A0M;
    public final VK1 A0N;
    public final ExecutorService A0S;
    public final X9T A0U;
    public final C70129W5q A0V;
    public final XES A0W;
    public final XCA A0X;
    public final ExecutorService A0Y;
    public volatile long A0a;
    public volatile boolean A0b;
    public final Map A0R = new HashMap();
    public final List A0P = new ArrayList();
    public long A02 = A0c;
    public boolean A0A = false;
    public volatile long A0Z = 0;
    public boolean A0C = false;
    public boolean A09 = false;
    public long A01 = -1;
    public long A00 = 0;
    public final Map A0Q = new HashMap();
    public boolean A0F = false;
    public boolean A0B = true;
    public final long A0T = TimeUnit.SECONDS.toMicros(10);
    public final HashMap A0O = new HashMap();
    public final W4J A0K = new W4J();

    public static void A04(EnumC1125356h enumC1125356h, WGV wgv, long j, boolean z) {
        long min;
        if (wgv.A0M.A0B.A0K()) {
            min = wgv.A0D;
        } else {
            min = Math.min(wgv.A0a - j, wgv.A0D);
        }
        wgv.A06(enumC1125356h, wgv.A00(enumC1125356h, j, j + min), z);
    }

    public static void A05(EnumC1125356h enumC1125356h, WGV wgv, java.util.Set set, long j) {
        long j2;
        Object obj;
        U7W u7w = wgv.A0M.A0B;
        if (u7w.A0K()) {
            j2 = wgv.A0D;
        } else {
            j2 = wgv.A0T;
        }
        ArrayList A00 = wgv.A00(enumC1125356h, j, j + j2);
        if (set != null && u7w.A0J()) {
            A00.removeAll(set);
        }
        W4J w4j = wgv.A0K;
        W4J.A00(w4j);
        ArrayList arrayList = new ArrayList();
        Map map = w4j.A00;
        SparseArray sparseArray = (SparseArray) map.get(enumC1125356h);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                AbstractC166997dE.A1W(arrayList, sparseArray.keyAt(i));
            }
        }
        Iterator it = new HashSet(arrayList).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            if (!A00.contains(number)) {
                W4J.A00(w4j);
                SparseArray sparseArray2 = (SparseArray) map.get(enumC1125356h);
                if (sparseArray2 != null) {
                    obj = sparseArray2.get(intValue);
                    sparseArray2.remove(intValue);
                } else {
                    obj = null;
                }
                obj.getClass();
                wgv.A0P.add(wgv.A0S.submit(new U7L(1, wgv, obj)));
            }
        }
    }

    public final void A09() {
        AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "pausePlayback", new Object[0]);
        long j = this.A0Z;
        AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "resetPlayer", new Object[0]);
        this.A0C = false;
        this.A01 = -1L;
        this.A00 = j;
        this.A0A = false;
        WG8 wg8 = this.A05;
        if (wg8 != null) {
            wg8.A0D.obtainMessage(6).sendToTarget();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.Tyj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Tyj, java.lang.Object] */
    public final void A0A() {
        AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "releasePlayer", new Object[0]);
        try {
            ?? obj = new Object();
            WG8 wg8 = this.A05;
            if (wg8 != null) {
                try {
                    wg8.A05();
                } catch (Throwable th) {
                    C66046Tyj.A00(obj, th);
                }
            }
            EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
            ?? obj2 = new Object();
            W4J w4j = this.A0K;
            W4J.A00(w4j);
            ArrayList arrayList = new ArrayList();
            Map map = w4j.A00;
            SparseArray sparseArray = (SparseArray) map.get(enumC1125356h);
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    AbstractC166997dE.A1W(arrayList, sparseArray.keyAt(i));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Future A01 = w4j.A01(enumC1125356h, ((Integer) it.next()).intValue());
                if (A01 != null && !A01.isCancelled()) {
                    try {
                        new C67628Uti((C66046Tyj) obj2, (InterfaceC71998XEm) A01.get()).A00();
                    } catch (Throwable th2) {
                        AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "releaseAllDemuxDecoderWrappersRealtime: Exception=%s", th2);
                    }
                }
            }
            W4J.A00(w4j);
            map.remove(enumC1125356h);
            List list = this.A0P;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    ((Future) it2.next()).get();
                } catch (Throwable th3) {
                    AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "releaseAllDemuxDecoderWrappersRealtime: releaseCallable Exception=%s", th3);
                }
            }
            list.clear();
            obj2.A01();
            th = null;
        } catch (Throwable th4) {
            th = th4;
        }
        AbstractC66028TyQ abstractC66028TyQ = this.A08;
        if (abstractC66028TyQ != null) {
            abstractC66028TyQ.A00();
            this.A08 = null;
        }
        AbstractC66028TyQ abstractC66028TyQ2 = this.A07;
        if (abstractC66028TyQ2 != null) {
            abstractC66028TyQ2.A00();
            this.A07 = null;
        }
        ExecutorService executorService = this.A0Y;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.A0S.shutdown();
        if (th == null) {
            return;
        }
        AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "releasePlayer: releaseException=%s", th);
        throw th;
    }

    public final void A0B(long j) {
        AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "seekPlayer: playbackPositionUs=%s", Long.valueOf(j));
        this.A0Z = Math.max(Math.min(j, this.A0a - 1), 0L);
        long j2 = this.A0Z;
        AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "resetPlayer", new Object[0]);
        this.A0C = false;
        this.A01 = -1L;
        this.A00 = j2;
        this.A0A = false;
        EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
        long j3 = this.A0Z;
        Map map = this.A0R;
        U7W u7w = this.A0M.A0B;
        ArrayList A02 = AbstractC70158WDt.A02(enumC1125356h, u7w, map, j3);
        if (u7w.A0L()) {
            A03(enumC1125356h);
        } else {
            A05(enumC1125356h, this, null, this.A0Z);
            A06(enumC1125356h, A02, true);
            this.A0Q.put(enumC1125356h, new HashSet(A02));
        }
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            long j4 = this.A0Z;
            AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "seekTrackTo: trackType=%s, targetPtsUs=%s, presentationTrackIndex=%s", enumC1125356h, Long.valueOf(j4), num);
            int intValue = num.intValue();
            InterfaceC71998XEm A08 = A08(enumC1125356h, intValue);
            Object obj = map.get(enumC1125356h);
            obj.getClass();
            Object obj2 = ((SparseArray) obj).get(intValue);
            obj2.getClass();
            long A03 = ((C1125456i) obj2).A03(TimeUnit.MICROSECONDS);
            if (A03 < 0) {
                A03 = 0;
            }
            HashMap hashMap = this.A0O;
            if (hashMap.containsKey(num)) {
                A08.FCj((C1125456i) hashMap.get(num));
            }
            A08.EMh(j4 - A03);
        }
        WG8 wg8 = this.A05;
        if (wg8 != null) {
            AbstractC58318PtA.A1F(wg8.A0D, Long.valueOf(this.A0Z), 4);
        }
    }

    static {
        long pow = (long) (Math.pow(10.0d, 6.0d) / 30.0d);
        A0c = pow;
        A0d = pow / 2;
    }

    private ArrayList A00(EnumC1125356h enumC1125356h, long j, long j2) {
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = (SparseArray) this.A0R.get(enumC1125356h);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                C1125456i c1125456i = (C1125456i) sparseArray.valueAt(i);
                U7W u7w = this.A0M.A0B;
                if (u7w.A0F()) {
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    C1125456i c1125456i2 = new C1125456i(timeUnit, j, j2);
                    boolean A1P = u7w.A1P();
                    if (c1125456i.A05(c1125456i2, A1P)) {
                        AbstractC166997dE.A1W(hashSet, keyAt);
                    }
                    if (j2 > this.A0a) {
                        if (!c1125456i.A05(new C1125456i(timeUnit, 0L, j2 - this.A0a), A1P)) {
                        }
                        AbstractC166997dE.A1W(hashSet, keyAt);
                    }
                } else {
                    TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                    if (j2 >= c1125456i.A03(timeUnit2)) {
                        if (j > c1125456i.A02(timeUnit2)) {
                        }
                        AbstractC166997dE.A1W(hashSet, keyAt);
                    }
                }
            }
        }
        return new ArrayList(hashSet);
    }

    private void A01(long j) {
        long max;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(10L);
        if (j < 0) {
            if (j < timeUnit.toNanos(-200L)) {
                max = TimeUnit.NANOSECONDS.toMicros(-j);
            } else {
                max = this.A02 + micros;
            }
        } else if (j > timeUnit.toNanos(200L)) {
            max = A0d;
        } else {
            max = Math.max(this.A02 - micros, A0d);
        }
        this.A02 = max;
    }

    private void A02(long j) {
        C55070OaQ c55070OaQ;
        if (!this.A0M.A0B.A0H() && (c55070OaQ = this.A0J) != null) {
            c55070OaQ.A02(j);
        }
    }

    private void A03(EnumC1125356h enumC1125356h) {
        HashSet hashSet;
        long j = this.A0Z;
        ArrayList A02 = AbstractC70158WDt.A02(enumC1125356h, this.A0M.A0B, this.A0R, j);
        HashSet hashSet2 = new HashSet(A02);
        Map map = this.A0Q;
        Collection<?> collection = (Collection) map.get(enumC1125356h);
        if (collection != null) {
            hashSet2.removeAll(collection);
            hashSet = new HashSet(collection);
            hashSet.removeAll(A02);
        } else {
            hashSet = null;
        }
        A05(enumC1125356h, this, hashSet, this.A0Z);
        A04(enumC1125356h, this, this.A0Z, false);
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            A08(enumC1125356h, AbstractC167007dF.A0B(it)).EMh(0L);
        }
        map.put(enumC1125356h, new HashSet(A02));
    }

    private void A06(EnumC1125356h enumC1125356h, List list, boolean z) {
        C69489VoC c69489VoC = this.A0M;
        MediaComposition mediaComposition = c69489VoC.A08;
        mediaComposition.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (!this.A0b) {
                W4J w4j = this.A0K;
                int intValue = number.intValue();
                W4J.A00(w4j);
                Map map = w4j.A00;
                SparseArray sparseArray = (SparseArray) map.get(enumC1125356h);
                if (sparseArray == null || sparseArray.get(intValue) == null) {
                    EnumC1125356h enumC1125356h2 = EnumC1125356h.VIDEO;
                    if (enumC1125356h2.equals(enumC1125356h)) {
                        VK1 vk1 = this.A0N;
                        ExecutorService executorService = this.A0Y;
                        executorService.getClass();
                        XCA xca = this.A0X;
                        xca.getClass();
                        C70129W5q c70129W5q = this.A0V;
                        C1125956n A04 = mediaComposition.A04(enumC1125356h2, intValue);
                        C0J8.A05(A04, "mc: %s", mediaComposition);
                        InterfaceC71998XEm A00 = vk1.A00(c70129W5q, (C1125756l) new ArrayList(A04.A04).get(0), c69489VoC, xca, executorService, true);
                        AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "createDemuxDecodeWrapperCallable", new Object[0]);
                        Future submit = this.A0S.submit(new CallableC71668WyL(intValue, 1, this, A00));
                        W4J.A00(w4j);
                        Map map2 = w4j.A01;
                        SparseArray sparseArray2 = (SparseArray) map2.get(enumC1125356h);
                        SparseArray sparseArray3 = (SparseArray) map.get(enumC1125356h);
                        if (sparseArray2 == null) {
                            sparseArray2 = new SparseArray();
                            map2.put(enumC1125356h, sparseArray2);
                        }
                        if (sparseArray3 == null) {
                            sparseArray3 = new SparseArray();
                            map.put(enumC1125356h, sparseArray3);
                        }
                        sparseArray2.put(intValue, A00);
                        sparseArray3.put(intValue, submit);
                    } else {
                        AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "maybePreloadDemuxDecodeWrappers: UnsupportedOperationException", new Object[0]);
                        throw new UnsupportedOperationException();
                    }
                }
            } else {
                AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "maybePreloadDemuxDecodeWrappers: CancellationException", new Object[0]);
                throw new CancellationException();
            }
        }
        if (z) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Number number2 = (Number) it2.next();
                if (!this.A0b) {
                    Future A01 = this.A0K.A01(enumC1125356h, number2.intValue());
                    A01.getClass();
                    A01.get();
                } else {
                    AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "maybePreloadDemuxDecodeWrappers: ensureLoaded CancellationException", new Object[0]);
                    throw new CancellationException();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r6 == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad A[LOOP:2: B:79:0x01a7->B:81:0x01ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0240 A[LOOP:3: B:89:0x023a->B:91:0x0240, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A07(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGV.A07(long, boolean):long");
    }

    public final InterfaceC71998XEm A08(EnumC1125356h enumC1125356h, int i) {
        Future A01 = this.A0K.A01(enumC1125356h, i);
        if (A01 != null) {
            return (InterfaceC71998XEm) A01.get();
        }
        AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "getDemuxDecodeWrapperRealtime: Null future for presentationTrack=%s", AbstractC25228BEl.A1Y(i));
        throw new Exception(AnonymousClass001.A0O("Null future for presentationTrack=", i));
    }

    /* JADX WARN: Type inference failed for: r21v0, types: [X.XEI, java.lang.Object] */
    public final void A0C(C69522Vql c69522Vql, HashSet hashSet) {
        C69439VnO c69439VnO;
        this.A06 = c69522Vql;
        Map map = this.A0R;
        map.clear();
        this.A0Q.clear();
        EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
        C69489VoC c69489VoC = this.A0M;
        InterfaceC58019Po5 interfaceC58019Po5 = this.A0I;
        AbstractC70158WDt.A03(interfaceC58019Po5, enumC1125356h, c69489VoC, map);
        MediaComposition mediaComposition = c69489VoC.A08;
        mediaComposition.getClass();
        EnumC1125356h enumC1125356h2 = EnumC1125356h.AUDIO;
        HashMap A07 = mediaComposition.A07(enumC1125356h2);
        if (A07 != null && !A07.isEmpty()) {
            InterfaceC71995XEj ALF = this.A0U.ALF();
            C70087W2j c70087W2j = c69489VoC.A0C;
            int i = c70087W2j.A04;
            int i2 = c70087W2j.A01;
            Integer num = VYJ.A00;
            W25 w25 = new W25(i, i2);
            C69065VhG c69065VhG = new C69065VhG(w25, w25, A07.size());
            if (c69489VoC.A0B.A0n() && ALF.getWarmupDurationInSec() != 0 && !hashSet.isEmpty()) {
                ALF.configure(c69065VhG);
                VK1 vk1 = this.A0N;
                C67629Utj c67629Utj = new C67629Utj(this.A0G, this.A0H, new C69377VmN(ALF, new Object(), this.A0J, null, c69489VoC), interfaceC58019Po5, this.A06, this, c69489VoC, vk1, C05F.A00);
                Handler handler = c67629Utj.A0D;
                handler.obtainMessage(3).sendToTarget();
                AbstractC58318PtA.A1F(handler, MSY.A0D(hashSet, ALF.getWarmupDurationInSec()), 9);
                c67629Utj.A0F.A02.FDt();
                c67629Utj.A05();
            }
            ALF.configure(c69065VhG);
            C55070OaQ c55070OaQ = this.A0J;
            if (c55070OaQ != null && (c69439VnO = c55070OaQ.A05) != null) {
                c69439VnO.A03 = w25;
            }
            YCL ycl = new YCL(i, c70087W2j.A01);
            this.A0E = ycl;
            VK1 vk12 = this.A0N;
            Utk utk = new Utk(this.A0G, this.A0H, new C69377VmN(ALF, ycl, c55070OaQ, null, c69489VoC), interfaceC58019Po5, this.A06, this, c69489VoC, vk12, C05F.A00);
            this.A05 = utk;
            utk.A0D.obtainMessage(3).sendToTarget();
            this.A04 = this.A05.A0F.A02.BmY();
        }
        long A00 = AbstractC66047Tyk.A00(interfaceC58019Po5, enumC1125356h, mediaComposition);
        if (A00 <= 0 && c69489VoC.A0B.A07()) {
            A00 = AbstractC66047Tyk.A00(interfaceC58019Po5, enumC1125356h2, mediaComposition);
        }
        this.A0a = A00;
        this.A0D = Math.min(TimeUnit.SECONDS.toMicros(2L), this.A0a);
        AbstractC1808580n.A03("MultipleTrackCoordinator.decoderPreloading");
        boolean z = true;
        A04(enumC1125356h, this, 0L, true);
        AbstractC1808580n.A01();
        this.A0C = false;
        this.A09 = false;
        this.A01 = -1L;
        this.A00 = 0L;
        this.A0A = false;
        this.A0F = true;
        this.A0O.clear();
        C69409Vmt c69409Vmt = this.A0L;
        WZN wzn = new WZN(c69409Vmt);
        WZL wzl = new WZL(c69409Vmt);
        U7W u7w = c69489VoC.A0B;
        this.A08 = AbstractC70158WDt.A00(wzl, wzn, u7w, map);
        AbstractC66028TyQ abstractC66028TyQ = this.A07;
        if (abstractC66028TyQ != null) {
            abstractC66028TyQ.A00();
        } else {
            z = false;
        }
        C67638Utt A01 = AbstractC70158WDt.A01(mediaComposition, new X9W() { // from class: X.WZI
            @Override // X.X9W
            public final void DRT(Integer num2, MediaEffect mediaEffect) {
                C69409Vmt c69409Vmt2 = WGV.this.A0L;
                int intValue = num2.intValue();
                C14360o3.A0B(mediaEffect, 1);
                Iterator A15 = AbstractC166997dE.A15(c69409Vmt2.A07);
                while (A15.hasNext()) {
                    ((C66036TyY) AbstractC31176DnK.A0j(A15)).EFF(mediaEffect, intValue);
                }
            }
        }, new X9X() { // from class: X.WZK
            @Override // X.X9X
            public final void DRU(Integer num2, MediaEffect mediaEffect) {
                C69409Vmt c69409Vmt2 = WGV.this.A0L;
                int intValue = num2.intValue();
                C14360o3.A0B(mediaEffect, 1);
                Iterator A15 = AbstractC166997dE.A15(c69409Vmt2.A07);
                while (A15.hasNext()) {
                    ((C66036TyY) AbstractC31176DnK.A0j(A15)).A8L(mediaEffect, intValue);
                }
            }
        }, u7w);
        this.A07 = A01;
        if (z) {
            A01.A01(this.A0Z);
        }
    }

    public WGV(C58647PzK c58647PzK, W1m w1m, X9T x9t, InterfaceC58019Po5 interfaceC58019Po5, C70129W5q c70129W5q, C55070OaQ c55070OaQ, C69409Vmt c69409Vmt, C69489VoC c69489VoC, XCA xca, VK1 vk1) {
        ThreadPoolExecutor threadPoolExecutor;
        int size;
        this.A0N = vk1;
        this.A0G = c58647PzK;
        this.A0U = x9t;
        this.A0M = c69489VoC;
        this.A0V = c70129W5q;
        this.A0L = c69409Vmt;
        this.A0X = xca;
        this.A0I = interfaceC58019Po5;
        this.A0H = w1m;
        this.A0J = c55070OaQ;
        MediaComposition mediaComposition = c69489VoC.A08;
        EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
        if (mediaComposition != null && mediaComposition.A07(enumC1125356h) != null && (size = mediaComposition.A07(enumC1125356h).size()) != 0) {
            threadPoolExecutor = c58647PzK.A01(C05F.A0C, size);
        } else {
            threadPoolExecutor = null;
        }
        this.A0Y = threadPoolExecutor;
        this.A0S = c58647PzK.A02(C05F.A02, null);
        this.A0W = c69489VoC.A07;
    }
}
