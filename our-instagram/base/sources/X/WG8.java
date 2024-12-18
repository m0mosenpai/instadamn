package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.lang.Thread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public class WG8 {
    public static final long A0P = AbstractC43593JPy.A09(TimeUnit.SECONDS);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C1125456i A04;
    public MediaComposition A05;
    public AbstractC66028TyQ A06;
    public AbstractC66028TyQ A07;
    public C69489VoC A08;
    public HashSet A09;
    public boolean A0A;
    public C1125456i[] A0B;
    public final long A0C;
    public final Handler A0D;
    public final W1m A0E;
    public final C69377VmN A0F;
    public final InterfaceC58019Po5 A0G;
    public final C69522Vql A0H;
    public final VK1 A0I;
    public final List A0J;
    public final Map A0K;
    public final Map A0L;
    public final ExecutorService A0M;
    public final Handler.Callback A0N;
    public final Thread.UncaughtExceptionHandler A0O;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.VIr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Tyj, java.lang.Object] */
    public static void A01(WG8 wg8) {
        List list;
        wg8.A00 = 0;
        ?? obj = new Object();
        W1m w1m = wg8.A0E;
        if (w1m != null) {
            W1m.A00(w1m, "audio_pipeline_release", null);
        }
        while (true) {
            list = wg8.A0J;
            if (list.isEmpty()) {
                break;
            }
            try {
                ((Future) list.remove(0)).get();
            } catch (Exception e) {
                C66046Tyj.A00(obj, e);
            }
        }
        list.clear();
        Map map = wg8.A0K;
        Iterator it = new HashSet(map.keySet()).iterator();
        while (it.hasNext()) {
            C67628Uti c67628Uti = new C67628Uti((C66046Tyj) obj, A00(wg8, AbstractC167007dF.A0B(it)));
            new Object().A00 = c67628Uti;
            c67628Uti.A00();
        }
        map.clear();
        wg8.A0M.shutdown();
        Handler handler = wg8.A0D;
        handler.removeCallbacksAndMessages(null);
        handler.getLooper().quit();
        wg8.A0F.A02.release();
        obj.A01();
    }

    public static InterfaceC71998XEm A00(WG8 wg8, int i) {
        Map map = wg8.A0K;
        Integer valueOf = Integer.valueOf(i);
        Future future = (Future) map.get(valueOf);
        if (future != null) {
            try {
                return (InterfaceC71998XEm) future.get();
            } catch (Exception e) {
                map.remove(valueOf);
                wg8.A0F.A01.disableTrack(i);
                Integer num = C05F.A01;
                C69522Vql c69522Vql = wg8.A0H;
                if (c69522Vql != null) {
                    c69522Vql.A00(num, e);
                }
            }
        }
        return null;
    }

    public static void A02(WG8 wg8) {
        boolean z;
        AbstractC66028TyQ abstractC66028TyQ = wg8.A06;
        int i = 0;
        if (abstractC66028TyQ != null) {
            abstractC66028TyQ.A00();
            z = true;
        } else {
            z = false;
        }
        HashMap hashMap = new HashMap();
        Iterator A14 = AbstractC166997dE.A14(wg8.A05.A06(EnumC1125356h.AUDIO));
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            Integer num = (Integer) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                hashMap.put(Integer.toString(i), new C69066VhH((C69688VtY) it.next(), num));
                i++;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator A142 = AbstractC166997dE.A14(hashMap);
        while (A142.hasNext()) {
            Map.Entry entry2 = (Map.Entry) A142.next();
            C1125456i c1125456i = ((C69066VhH) entry2.getValue()).A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long max = Math.max(0L, c1125456i.A03(timeUnit));
            long A02 = c1125456i.A02(timeUnit);
            if (A02 < 0) {
                A02 = Long.MAX_VALUE;
            }
            hashMap2.put(entry2.getKey(), new C1125456i(timeUnit, max, A02));
        }
        C67637Uts c67637Uts = new C67637Uts(wg8.A08.A0B, wg8, hashMap, hashMap2, 0);
        wg8.A06 = c67637Uts;
        if (z) {
            c67637Uts.A01(wg8.A02);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.Tyj, java.lang.Object] */
    public static void A03(WG8 wg8, Throwable th) {
        ?? obj = new Object();
        C66046Tyj.A00(obj, th);
        try {
            A01(wg8);
        } catch (Throwable unused) {
            C66046Tyj.A00(obj, th);
        }
        W1m w1m = wg8.A0E;
        if (w1m != null) {
            Throwable th2 = obj.A01;
            C14360o3.A0B(th2, 0);
            HashMap hashMap = new HashMap();
            String stackTraceString = android.util.Log.getStackTraceString(th2);
            C14360o3.A0A(stackTraceString);
            hashMap.put("error_trace", stackTraceString);
            W1m.A00(w1m, AbstractC111324zv.A00(3971), hashMap);
        }
        Integer num = C05F.A01;
        Throwable th3 = obj.A01;
        C69522Vql c69522Vql = wg8.A0H;
        if (c69522Vql != null) {
            c69522Vql.A00(num, th3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r6.A0A != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A04(X.WG8 r6) {
        /*
            long r1 = r6.A02
            long r3 = r6.A03
            r5 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto Le
            boolean r0 = r6.A0A
            r4 = 0
            if (r0 == 0) goto Lf
        Le:
            r4 = 1
        Lf:
            int r3 = r6.A00
            r0 = 2
            if (r3 != r0) goto L2a
            if (r4 == 0) goto L29
            X.56i r4 = r6.A04
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            X.VoC r0 = r6.A08
            X.U7W r0 = r0.A0B
            boolean r0 = r0.A1P()
            boolean r0 = r4.A06(r3, r1, r0)
            if (r0 == 0) goto L29
            r5 = 1
        L29:
            return r5
        L2a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WG8.A04(X.WG8):boolean");
    }

    public final void A05() {
        this.A0D.obtainMessage(5).sendToTarget();
    }

    public WG8(C58647PzK c58647PzK, W1m w1m, C69377VmN c69377VmN, InterfaceC58019Po5 interfaceC58019Po5, C69522Vql c69522Vql, C69489VoC c69489VoC, VK1 vk1, Integer num) {
        Integer num2;
        WIZ wiz = new WIZ(this, 0);
        this.A0N = wiz;
        C71647Wxu c71647Wxu = new C71647Wxu(this, 1);
        this.A0O = c71647Wxu;
        this.A08 = c69489VoC;
        this.A05 = c69489VoC.A08;
        this.A0G = interfaceC58019Po5;
        this.A0I = vk1;
        if (num == C05F.A00) {
            num2 = C05F.A03;
        } else {
            num2 = C05F.A04;
        }
        this.A0M = c58647PzK.A02(num2, null);
        this.A0J = new LinkedList();
        this.A0K = new HashMap();
        this.A0L = new HashMap();
        this.A0F = c69377VmN;
        this.A0H = c69522Vql;
        this.A0E = w1m;
        int i = c69489VoC.A0C.A04;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.A0C = (timeUnit.toMicros(1L) * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) / i;
        this.A04 = new C1125456i(timeUnit, -1L, -1L);
        this.A09 = new HashSet();
        HandlerThread handlerThread = new HandlerThread(MediaStreamTrack.AUDIO_TRACK_KIND, -16);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        this.A0D = new HandlerC66051Tyo(wiz, handlerThread.getLooper(), c71647Wxu);
    }
}
