package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;
import com.instagram.reels.store.ReelStore;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.14p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C218914p extends AbstractC18730w0 {
    public static long A00;
    public static InterfaceC219214s A01;
    public static Boolean A02;
    public static Boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static final Handler A07;
    public static final C218914p A08;
    public static final C18240vB A09;
    public static final Runnable A0A;
    public static final Runnable A0B;
    public static final Queue A0C;
    public static final CopyOnWriteArrayList A0D;
    public static final CopyOnWriteArrayList A0E;
    public static final CopyOnWriteArrayList A0F;
    public static final CopyOnWriteArrayList A0G;
    public static final AtomicInteger A0H;
    public static final Object A0I;
    public static final WeakHashMap A0J;
    public static final InterfaceC09390do A0K;

    public static final void A03(EnumC220415e enumC220415e, InterfaceC12870lZ interfaceC12870lZ) {
        C6K c6k;
        C14360o3.A0B(interfaceC12870lZ, 0);
        if (A01.FDN()) {
            InterfaceC09390do interfaceC09390do = CMN.A00;
            if (!((Map) interfaceC09390do.getValue()).containsKey(interfaceC12870lZ)) {
                int ordinal = enumC220415e.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        c6k = C6K.A03;
                    } else {
                        c6k = C6K.A04;
                    }
                } else {
                    c6k = C6K.A02;
                }
                Hd0 hd0 = Hd0.A03;
                EnumC39530Hcx enumC39530Hcx = EnumC39530Hcx.A02;
                C38688GzT c38688GzT = new C38688GzT(hd0, enumC39530Hcx, c6k, new J7Q(interfaceC12870lZ, 45));
                C38688GzT c38688GzT2 = new C38688GzT(Hd0.A02, enumC39530Hcx, c6k, new J7Q(interfaceC12870lZ, 44));
                ((Map) interfaceC09390do.getValue()).put(interfaceC12870lZ, AbstractC16960so.A1Q(c38688GzT, c38688GzT2));
                C38272GsH.A00(c38688GzT);
                C38272GsH.A00(c38688GzT2);
                return;
            }
            return;
        }
        A0E.addIfAbsent(interfaceC12870lZ);
        synchronized (A0I) {
            A0J.put(interfaceC12870lZ, enumC220415e);
        }
    }

    public static final void A04(EnumC220415e enumC220415e, InterfaceC12870lZ interfaceC12870lZ, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC12870lZ, 0);
        CopyOnWriteArrayList copyOnWriteArrayList = A0F;
        if (z2) {
            copyOnWriteArrayList.add(0, interfaceC12870lZ);
        } else {
            copyOnWriteArrayList.addIfAbsent(interfaceC12870lZ);
        }
        if (z) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = A0D;
            if (z2) {
                copyOnWriteArrayList2.add(0, interfaceC12870lZ);
            } else {
                copyOnWriteArrayList2.addIfAbsent(interfaceC12870lZ);
            }
        }
        synchronized (A0I) {
            A0J.put(interfaceC12870lZ, enumC220415e);
        }
    }

    public static final void A06(InterfaceC12870lZ interfaceC12870lZ) {
        C14360o3.A0B(interfaceC12870lZ, 0);
        if (A01.FDN()) {
            InterfaceC09390do interfaceC09390do = CMN.A00;
            List<C38688GzT> list = (List) ((Map) interfaceC09390do.getValue()).get(interfaceC12870lZ);
            if (list != null) {
                for (C38688GzT c38688GzT : list) {
                    IEN ien = C38272GsH.A01;
                    C14360o3.A0B(c38688GzT, 0);
                    IEN ien2 = C38272GsH.A01;
                    Object obj = ien.A01.get(c38688GzT.A02);
                    if (obj != null) {
                        ((java.util.Set) obj).remove(c38688GzT);
                        Object obj2 = ien2.A00.get(new C09530e4(c38688GzT.A01, c38688GzT.A03));
                        if (obj2 != null) {
                            ((java.util.Set) obj2).remove(c38688GzT);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
            ((Map) interfaceC09390do.getValue()).remove(interfaceC12870lZ);
            return;
        }
        synchronized (A0I) {
            A0J.remove(interfaceC12870lZ);
        }
        A0E.remove(interfaceC12870lZ);
    }

    public static final void A07(InterfaceC12870lZ interfaceC12870lZ) {
        C14360o3.A0B(interfaceC12870lZ, 0);
        synchronized (A0I) {
            A0J.remove(interfaceC12870lZ);
        }
        A0F.remove(interfaceC12870lZ);
        A0D.remove(interfaceC12870lZ);
    }

    public final void A0A(InterfaceC12870lZ interfaceC12870lZ) {
        C14360o3.A0B(interfaceC12870lZ, 0);
        A03(EnumC220415e.A03, interfaceC12870lZ);
    }

    public final void A0B(InterfaceC12870lZ interfaceC12870lZ) {
        C14360o3.A0B(interfaceC12870lZ, 0);
        A04(EnumC220415e.A02, interfaceC12870lZ, false, false);
    }

    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
    public final void Cv0(Activity activity) {
        C11T.A06("This operation must be run on UI thread.");
        A04 = true;
        Handler handler = A07;
        handler.postDelayed(A0B, 500L);
        C11T.A06("This operation must be run on UI thread.");
        A04 = true;
        Runnable runnable = A0A;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.14s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.14p, X.0lX] */
    static {
        ?? obj = new Object();
        A08 = obj;
        A0K = AbstractC09440dt.A00(EnumC09460dv.A02, C219014q.A00);
        A0H = new AtomicInteger();
        A01 = new Object();
        A0A = new Runnable() { // from class: X.14t
            /* JADX WARN: Removed duplicated region for block: B:103:0x02e7  */
            /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x023b  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0284 A[Catch: all -> 0x02d5, LOOP:1: B:44:0x0281->B:46:0x0284, LOOP_END, TryCatch #2 {all -> 0x02d5, blocks: (B:43:0x0243, B:46:0x0284, B:48:0x02cd), top: B:42:0x0243 }] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x02f4  */
            /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 763
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC219314t.run():void");
            }
        };
        A0B = new Runnable() { // from class: X.14u
            @Override // java.lang.Runnable
            public final void run() {
                if (!C218914p.A09()) {
                    C218914p.A03 = true;
                    C218914p.A00 = AwakeTimeSinceBootClock.INSTANCE.now() - 500;
                    CopyOnWriteArrayList copyOnWriteArrayList = C218914p.A0F;
                    int size = copyOnWriteArrayList.size();
                    AtomicInteger atomicInteger = C218914p.A0H;
                    int andIncrement = atomicInteger.getAndIncrement();
                    C218914p.A00().markerStart(694564060, andIncrement, false);
                    C218914p.A00().markerAnnotate(694564060, andIncrement, "operation", "onAppBackgrounded_timeSensitive");
                    C218914p.A00().markerAnnotate(694564060, andIncrement, "asl_session_id", C0L6.A01());
                    C218914p.A00().markerAnnotate(694564060, andIncrement, "number_of_listeners", size);
                    C218914p.A00().markerAnnotate(694564060, andIncrement, "thread_priority", Thread.currentThread().getPriority());
                    if (((List) AbstractC15930qn.A02.A06.invoke()).contains("onAppBackgrounded_timeSensitive")) {
                        if (((Boolean) AbstractC15930qn.A02.A05.invoke()).booleanValue()) {
                            try {
                                Iterator it = copyOnWriteArrayList.iterator();
                                while (it.hasNext()) {
                                    InterfaceC12870lZ interfaceC12870lZ = (InterfaceC12870lZ) it.next();
                                    String name = interfaceC12870lZ.getClass().getName();
                                    C14360o3.A07(name);
                                    int andIncrement2 = atomicInteger.getAndIncrement();
                                    C218914p.A00().markerStart(694559790, andIncrement2, false);
                                    C218914p.A00().markerAnnotate(694559790, andIncrement2, "operation", "onAppBackgrounded_timeSensitive");
                                    C218914p.A00().markerAnnotate(694559790, andIncrement2, "listener", AnonymousClass001.A0g("<cls>", name, "</cls>"));
                                    C218914p.A00().markerAnnotate(694559790, andIncrement2, "asl_session_id", C0L6.A01());
                                    if (((List) AbstractC15930qn.A02.A06.invoke()).contains("onAppBackgrounded_timeSensitive")) {
                                        try {
                                            interfaceC12870lZ.onAppBackgrounded();
                                        } catch (Throwable th) {
                                            C0f5 AEr = C18950wb.A00.AEr(false, null, 694559790, 0);
                                            AEr.ERI(th);
                                            AEr.report();
                                        }
                                    } else {
                                        interfaceC12870lZ.onAppBackgrounded();
                                    }
                                    C218914p.A00().markerEnd(694559790, andIncrement2, (short) 2);
                                }
                            } catch (Throwable th2) {
                                C0f5 AEr2 = C18950wb.A00.AEr(false, null, 694559790, 0);
                                AEr2.ERI(th2);
                                AEr2.report();
                            }
                        } else {
                            Iterator it2 = copyOnWriteArrayList.iterator();
                            while (it2.hasNext()) {
                                InterfaceC12870lZ interfaceC12870lZ2 = (InterfaceC12870lZ) it2.next();
                                try {
                                    String name2 = interfaceC12870lZ2.getClass().getName();
                                    C14360o3.A07(name2);
                                    int andIncrement3 = atomicInteger.getAndIncrement();
                                    C218914p.A00().markerStart(694559790, andIncrement3, false);
                                    C218914p.A00().markerAnnotate(694559790, andIncrement3, "operation", "onAppBackgrounded_timeSensitive");
                                    C218914p.A00().markerAnnotate(694559790, andIncrement3, "listener", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
                                    C218914p.A00().markerAnnotate(694559790, andIncrement3, "asl_session_id", C0L6.A01());
                                    if (((List) AbstractC15930qn.A02.A06.invoke()).contains("onAppBackgrounded_timeSensitive")) {
                                        try {
                                            interfaceC12870lZ2.onAppBackgrounded();
                                        } catch (Throwable th3) {
                                            C0f5 AEr3 = C18950wb.A00.AEr(false, null, 694559790, 0);
                                            AEr3.ERI(th3);
                                            AEr3.report();
                                        }
                                    } else {
                                        interfaceC12870lZ2.onAppBackgrounded();
                                    }
                                    C218914p.A00().markerEnd(694559790, andIncrement3, (short) 2);
                                } catch (Throwable th4) {
                                    C0f5 AEr4 = C18950wb.A00.AEr(false, null, 694559790, 0);
                                    AEr4.ERI(th4);
                                    AEr4.report();
                                }
                            }
                        }
                    } else {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            InterfaceC12870lZ interfaceC12870lZ3 = (InterfaceC12870lZ) it3.next();
                            String name3 = interfaceC12870lZ3.getClass().getName();
                            C14360o3.A07(name3);
                            int andIncrement4 = atomicInteger.getAndIncrement();
                            C218914p.A00().markerStart(694559790, andIncrement4, false);
                            C218914p.A00().markerAnnotate(694559790, andIncrement4, "operation", "onAppBackgrounded_timeSensitive");
                            C218914p.A00().markerAnnotate(694559790, andIncrement4, "listener", AnonymousClass001.A0g("<cls>", name3, "</cls>"));
                            C218914p.A00().markerAnnotate(694559790, andIncrement4, "asl_session_id", C0L6.A01());
                            if (((List) AbstractC15930qn.A02.A06.invoke()).contains("onAppBackgrounded_timeSensitive")) {
                                try {
                                    interfaceC12870lZ3.onAppBackgrounded();
                                } catch (Throwable th5) {
                                    C0f5 AEr5 = C18950wb.A00.AEr(false, null, 694559790, 0);
                                    AEr5.ERI(th5);
                                    AEr5.report();
                                }
                            } else {
                                interfaceC12870lZ3.onAppBackgrounded();
                            }
                            C218914p.A00().markerEnd(694559790, andIncrement4, (short) 2);
                        }
                    }
                    C218914p.A00().markerEnd(694564060, andIncrement, (short) 2);
                }
            }
        };
        A04 = true;
        A0E = new CopyOnWriteArrayList();
        A0G = new CopyOnWriteArrayList();
        A0F = new CopyOnWriteArrayList();
        A0D = new CopyOnWriteArrayList();
        A0J = new WeakHashMap(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        A0I = new Object();
        A0C = new ConcurrentLinkedQueue();
        C0o0 A002 = AbstractC14350nz.A00();
        A002.A01 = "backgroundDetector";
        A09 = new C18240vB(A002);
        A07 = new Handler(Looper.getMainLooper());
        AbstractC12860lY.A07(obj);
    }

    public static final QuickPerformanceLogger A00() {
        return (QuickPerformanceLogger) A0K.getValue();
    }

    public static final String A01() {
        Boolean bool = A02;
        if (bool != null) {
            if (bool.booleanValue()) {
                return "true";
            }
            return "false";
        }
        return "unset";
    }

    /* JADX WARN: Code restructure failed: missing block: B:420:0x0040, code lost:
    
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (X.AbstractC25061Kk.A00().A0D() != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x09a7 A[Catch: all -> 0x0bb5, LOOP:7: B:126:0x09a1->B:128:0x09a7, LOOP_END, TryCatch #10 {all -> 0x0bb5, blocks: (B:13:0x0054, B:16:0x007c, B:19:0x0083, B:20:0x0093, B:22:0x0099, B:29:0x00aa, B:25:0x00ae, B:32:0x00b2, B:34:0x00c4, B:35:0x00d3, B:37:0x00d9, B:39:0x0114, B:40:0x0118, B:42:0x0166, B:67:0x02fd, B:68:0x0309, B:70:0x030f, B:72:0x070a, B:74:0x0713, B:77:0x071c, B:78:0x072c, B:80:0x0732, B:87:0x0743, B:83:0x0747, B:90:0x074b, B:92:0x075b, B:93:0x076a, B:95:0x0770, B:97:0x07ab, B:98:0x07af, B:100:0x07fd, B:125:0x0995, B:126:0x09a1, B:128:0x09a7, B:102:0x0886, B:103:0x088a, B:105:0x0890, B:122:0x08fd, B:149:0x0985, B:150:0x090f, B:151:0x0913, B:153:0x0919, B:157:0x097c, B:155:0x096b, B:163:0x096f, B:166:0x077f, B:167:0x078e, B:169:0x0794, B:171:0x07a3, B:172:0x09b8, B:174:0x0a08, B:199:0x0ba0, B:176:0x0a91, B:177:0x0a95, B:179:0x0a9b, B:196:0x0b08, B:219:0x0b90, B:220:0x0b1a, B:221:0x0b1e, B:223:0x0b24, B:227:0x0b87, B:225:0x0b76, B:233:0x0b7a, B:44:0x01ee, B:45:0x01f2, B:47:0x01f8, B:64:0x0265, B:261:0x02ed, B:262:0x0277, B:263:0x027b, B:265:0x0281, B:269:0x02e4, B:267:0x02d3, B:275:0x02d7, B:278:0x00e8, B:279:0x00f7, B:281:0x00fd, B:283:0x010c, B:284:0x0320, B:286:0x0372, B:311:0x0702, B:288:0x03fb, B:289:0x03ff, B:291:0x0405, B:308:0x0472, B:331:0x06f2, B:332:0x0484, B:333:0x0488, B:335:0x048e, B:339:0x04f1, B:337:0x04e0, B:345:0x04e4, B:348:0x04fa, B:350:0x04fe, B:352:0x0551, B:377:0x06e9, B:354:0x05da, B:355:0x05de, B:357:0x05e4, B:374:0x0651, B:397:0x06d9, B:398:0x0663, B:399:0x0667, B:401:0x066d, B:405:0x06d0, B:403:0x06bf, B:411:0x06c3, B:49:0x01fe, B:55:0x025b, B:61:0x024a, B:59:0x024e, B:52:0x0244, B:159:0x0965, B:243:0x0176, B:244:0x017a, B:246:0x0180, B:250:0x01e2, B:248:0x01df, B:256:0x01d1, B:252:0x01cc, B:293:0x040b, B:299:0x0468, B:305:0x0457, B:303:0x045b, B:296:0x0451, B:229:0x0b70, B:313:0x0382, B:314:0x0386, B:316:0x038c, B:320:0x03ef, B:318:0x03de, B:326:0x03e2, B:107:0x0896, B:113:0x08f3, B:119:0x08e2, B:117:0x08e6, B:407:0x06b9, B:131:0x080d, B:132:0x0811, B:134:0x0817, B:138:0x087a, B:136:0x0869, B:144:0x086d, B:181:0x0aa1, B:187:0x0afe, B:193:0x0aed, B:191:0x0af1, B:201:0x0a18, B:202:0x0a1c, B:204:0x0a22, B:208:0x0a85, B:206:0x0a74, B:214:0x0a78, B:359:0x05ea, B:365:0x0647, B:371:0x0636, B:369:0x063a, B:271:0x02cd, B:379:0x0561, B:380:0x0565, B:382:0x056b, B:386:0x05ce, B:384:0x05bd, B:392:0x05c1, B:341:0x04da), top: B:12:0x0054, inners: #1, #3, #5, #6, #9, #11, #13, #14, #15, #16, #18, #19, #21, #23, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x030f A[Catch: all -> 0x0bb5, LOOP:3: B:68:0x0309->B:70:0x030f, LOOP_END, TryCatch #10 {all -> 0x0bb5, blocks: (B:13:0x0054, B:16:0x007c, B:19:0x0083, B:20:0x0093, B:22:0x0099, B:29:0x00aa, B:25:0x00ae, B:32:0x00b2, B:34:0x00c4, B:35:0x00d3, B:37:0x00d9, B:39:0x0114, B:40:0x0118, B:42:0x0166, B:67:0x02fd, B:68:0x0309, B:70:0x030f, B:72:0x070a, B:74:0x0713, B:77:0x071c, B:78:0x072c, B:80:0x0732, B:87:0x0743, B:83:0x0747, B:90:0x074b, B:92:0x075b, B:93:0x076a, B:95:0x0770, B:97:0x07ab, B:98:0x07af, B:100:0x07fd, B:125:0x0995, B:126:0x09a1, B:128:0x09a7, B:102:0x0886, B:103:0x088a, B:105:0x0890, B:122:0x08fd, B:149:0x0985, B:150:0x090f, B:151:0x0913, B:153:0x0919, B:157:0x097c, B:155:0x096b, B:163:0x096f, B:166:0x077f, B:167:0x078e, B:169:0x0794, B:171:0x07a3, B:172:0x09b8, B:174:0x0a08, B:199:0x0ba0, B:176:0x0a91, B:177:0x0a95, B:179:0x0a9b, B:196:0x0b08, B:219:0x0b90, B:220:0x0b1a, B:221:0x0b1e, B:223:0x0b24, B:227:0x0b87, B:225:0x0b76, B:233:0x0b7a, B:44:0x01ee, B:45:0x01f2, B:47:0x01f8, B:64:0x0265, B:261:0x02ed, B:262:0x0277, B:263:0x027b, B:265:0x0281, B:269:0x02e4, B:267:0x02d3, B:275:0x02d7, B:278:0x00e8, B:279:0x00f7, B:281:0x00fd, B:283:0x010c, B:284:0x0320, B:286:0x0372, B:311:0x0702, B:288:0x03fb, B:289:0x03ff, B:291:0x0405, B:308:0x0472, B:331:0x06f2, B:332:0x0484, B:333:0x0488, B:335:0x048e, B:339:0x04f1, B:337:0x04e0, B:345:0x04e4, B:348:0x04fa, B:350:0x04fe, B:352:0x0551, B:377:0x06e9, B:354:0x05da, B:355:0x05de, B:357:0x05e4, B:374:0x0651, B:397:0x06d9, B:398:0x0663, B:399:0x0667, B:401:0x066d, B:405:0x06d0, B:403:0x06bf, B:411:0x06c3, B:49:0x01fe, B:55:0x025b, B:61:0x024a, B:59:0x024e, B:52:0x0244, B:159:0x0965, B:243:0x0176, B:244:0x017a, B:246:0x0180, B:250:0x01e2, B:248:0x01df, B:256:0x01d1, B:252:0x01cc, B:293:0x040b, B:299:0x0468, B:305:0x0457, B:303:0x045b, B:296:0x0451, B:229:0x0b70, B:313:0x0382, B:314:0x0386, B:316:0x038c, B:320:0x03ef, B:318:0x03de, B:326:0x03e2, B:107:0x0896, B:113:0x08f3, B:119:0x08e2, B:117:0x08e6, B:407:0x06b9, B:131:0x080d, B:132:0x0811, B:134:0x0817, B:138:0x087a, B:136:0x0869, B:144:0x086d, B:181:0x0aa1, B:187:0x0afe, B:193:0x0aed, B:191:0x0af1, B:201:0x0a18, B:202:0x0a1c, B:204:0x0a22, B:208:0x0a85, B:206:0x0a74, B:214:0x0a78, B:359:0x05ea, B:365:0x0647, B:371:0x0636, B:369:0x063a, B:271:0x02cd, B:379:0x0561, B:380:0x0565, B:382:0x056b, B:386:0x05ce, B:384:0x05bd, B:392:0x05c1, B:341:0x04da), top: B:12:0x0054, inners: #1, #3, #5, #6, #9, #11, #13, #14, #15, #16, #18, #19, #21, #23, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0713 A[Catch: all -> 0x0bb5, TRY_LEAVE, TryCatch #10 {all -> 0x0bb5, blocks: (B:13:0x0054, B:16:0x007c, B:19:0x0083, B:20:0x0093, B:22:0x0099, B:29:0x00aa, B:25:0x00ae, B:32:0x00b2, B:34:0x00c4, B:35:0x00d3, B:37:0x00d9, B:39:0x0114, B:40:0x0118, B:42:0x0166, B:67:0x02fd, B:68:0x0309, B:70:0x030f, B:72:0x070a, B:74:0x0713, B:77:0x071c, B:78:0x072c, B:80:0x0732, B:87:0x0743, B:83:0x0747, B:90:0x074b, B:92:0x075b, B:93:0x076a, B:95:0x0770, B:97:0x07ab, B:98:0x07af, B:100:0x07fd, B:125:0x0995, B:126:0x09a1, B:128:0x09a7, B:102:0x0886, B:103:0x088a, B:105:0x0890, B:122:0x08fd, B:149:0x0985, B:150:0x090f, B:151:0x0913, B:153:0x0919, B:157:0x097c, B:155:0x096b, B:163:0x096f, B:166:0x077f, B:167:0x078e, B:169:0x0794, B:171:0x07a3, B:172:0x09b8, B:174:0x0a08, B:199:0x0ba0, B:176:0x0a91, B:177:0x0a95, B:179:0x0a9b, B:196:0x0b08, B:219:0x0b90, B:220:0x0b1a, B:221:0x0b1e, B:223:0x0b24, B:227:0x0b87, B:225:0x0b76, B:233:0x0b7a, B:44:0x01ee, B:45:0x01f2, B:47:0x01f8, B:64:0x0265, B:261:0x02ed, B:262:0x0277, B:263:0x027b, B:265:0x0281, B:269:0x02e4, B:267:0x02d3, B:275:0x02d7, B:278:0x00e8, B:279:0x00f7, B:281:0x00fd, B:283:0x010c, B:284:0x0320, B:286:0x0372, B:311:0x0702, B:288:0x03fb, B:289:0x03ff, B:291:0x0405, B:308:0x0472, B:331:0x06f2, B:332:0x0484, B:333:0x0488, B:335:0x048e, B:339:0x04f1, B:337:0x04e0, B:345:0x04e4, B:348:0x04fa, B:350:0x04fe, B:352:0x0551, B:377:0x06e9, B:354:0x05da, B:355:0x05de, B:357:0x05e4, B:374:0x0651, B:397:0x06d9, B:398:0x0663, B:399:0x0667, B:401:0x066d, B:405:0x06d0, B:403:0x06bf, B:411:0x06c3, B:49:0x01fe, B:55:0x025b, B:61:0x024a, B:59:0x024e, B:52:0x0244, B:159:0x0965, B:243:0x0176, B:244:0x017a, B:246:0x0180, B:250:0x01e2, B:248:0x01df, B:256:0x01d1, B:252:0x01cc, B:293:0x040b, B:299:0x0468, B:305:0x0457, B:303:0x045b, B:296:0x0451, B:229:0x0b70, B:313:0x0382, B:314:0x0386, B:316:0x038c, B:320:0x03ef, B:318:0x03de, B:326:0x03e2, B:107:0x0896, B:113:0x08f3, B:119:0x08e2, B:117:0x08e6, B:407:0x06b9, B:131:0x080d, B:132:0x0811, B:134:0x0817, B:138:0x087a, B:136:0x0869, B:144:0x086d, B:181:0x0aa1, B:187:0x0afe, B:193:0x0aed, B:191:0x0af1, B:201:0x0a18, B:202:0x0a1c, B:204:0x0a22, B:208:0x0a85, B:206:0x0a74, B:214:0x0a78, B:359:0x05ea, B:365:0x0647, B:371:0x0636, B:369:0x063a, B:271:0x02cd, B:379:0x0561, B:380:0x0565, B:382:0x056b, B:386:0x05ce, B:384:0x05bd, B:392:0x05c1, B:341:0x04da), top: B:12:0x0054, inners: #1, #3, #5, #6, #9, #11, #13, #14, #15, #16, #18, #19, #21, #23, #25 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02() {
        /*
            Method dump skipped, instructions count: 3011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218914p.A02():void");
    }

    public static final void A05(InterfaceC12870lZ interfaceC12870lZ) {
        A03(EnumC220415e.A03, interfaceC12870lZ);
    }

    public static final boolean A08() {
        Boolean bool = A02;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean A09() {
        Boolean bool = A03;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
    public final void Cv8(Activity activity, boolean z) {
        C14360o3.A0B(activity, 1);
        if (Systrace.A0E(1L)) {
            C0fO.A01("BD.onActivityWindowFocusChanged", 564544780);
        }
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = A0G;
            int size = copyOnWriteArrayList.size();
            AtomicInteger atomicInteger = A0H;
            int andIncrement = atomicInteger.getAndIncrement();
            A00().markerStart(694564060, andIncrement, false);
            A00().markerAnnotate(694564060, andIncrement, "operation", "onActivityWindowFocusChanged");
            A00().markerAnnotate(694564060, andIncrement, "asl_session_id", C0L6.A01());
            A00().markerAnnotate(694564060, andIncrement, "number_of_listeners", size);
            A00().markerAnnotate(694564060, andIncrement, "thread_priority", Thread.currentThread().getPriority());
            Iterator it = copyOnWriteArrayList.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                ReelStore reelStore = (ReelStore) it.next();
                String name = reelStore.getClass().getName();
                C14360o3.A07(name);
                int andIncrement2 = atomicInteger.getAndIncrement();
                A00().markerStart(694559790, andIncrement2, false);
                A00().markerAnnotate(694559790, andIncrement2, "operation", "onAppWindowFocusChanged");
                A00().markerAnnotate(694559790, andIncrement2, "listener", AnonymousClass001.A0g("<cls>", name, "</cls>"));
                A00().markerAnnotate(694559790, andIncrement2, "asl_session_id", C0L6.A01());
                if (!z) {
                    if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(reelStore.A09).A00, 36317491839571196L)) {
                        reelStore.A0W();
                    }
                }
                A00().markerEnd(694559790, andIncrement2, (short) 2);
            }
            A00().markerEnd(694564060, andIncrement, (short) 2);
            if (Systrace.A0E(1L)) {
                C0fO.A00(221469067);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1966315300);
            }
            throw th;
        }
    }

    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
    public final void Cv5(Activity activity) {
        A02();
    }
}
