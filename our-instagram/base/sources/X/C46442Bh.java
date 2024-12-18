package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2Bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46442Bh {
    public C2BE A00;
    public C2BE A01;
    public final Context A02;
    public final C46462Bj A03;
    public final InterfaceC460229m A04;
    public final C2BZ A05;
    public final C2A4 A06;
    public final C46432Bg A07;
    public final C46272Ao A08;
    public final C461429y A09;
    public final HeroPlayerSetting A0A;
    public final Object A0B = new Object();
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final Map A0F;
    public final Queue A0G;
    public final AtomicReference A0H;
    public final AtomicReference A0I;
    public final InterfaceC460429o A0J;
    public final Map A0K;
    public final boolean A0L;

    public static C4BT A01(C4BB c4bb, int i) {
        Integer num;
        long j;
        int i2 = 0;
        if (c4bb != null) {
            C4B0 A01 = c4bb.A01();
            if (A01 == null) {
                j = 0;
            } else {
                j = A01.A02 + A01.A01;
            }
            int i3 = (int) (j + ((long) (((c4bb.A02.A05 / 8.0d) * i) / 1000.0d)));
            if (i3 != 0) {
                if ((c4bb instanceof C4B9) && (i2 = (int) ((C4B9) c4bb).A02) < i3) {
                    num = C05F.A01;
                    return new C4BT(i2, num);
                }
                return new C4BT(i3, C05F.A0C);
            }
        }
        num = C05F.A00;
        return new C4BT(i2, num);
    }

    public final C4BT A08(C2A2 c2a2, C4BS c4bs, C4BB c4bb) {
        long j;
        Integer num;
        int i = 0;
        if (c4bb == null) {
            num = C05F.A00;
        } else {
            int i2 = this.A0A.A0X;
            int ordinal = c2a2.ordinal();
            if (ordinal == 4 || ordinal == 3 || ordinal == 2 || ordinal == 1) {
                i2 = 0;
            }
            c4bs.A00 = i2;
            C4B0 A01 = c4bb.A01();
            if (A01 == null) {
                j = 0;
            } else {
                j = A01.A02 + A01.A01;
            }
            long j2 = j + ((long) ((c4bb.A02.A05 / 8.0d) * (i2 / 1000.0d)));
            if (j2 > 0) {
                num = C05F.A0N;
            } else {
                i = (int) j2;
                num = C05F.A0Y;
            }
        }
        return new C4BT(i, num);
    }

    private C4BT A00(C4BB c4bb, int i) {
        boolean A01;
        int i2;
        long j;
        Integer num;
        if (c4bb == null) {
            i2 = 0;
            num = C05F.A00;
        } else {
            C2A4 c2a4 = this.A06;
            if (c2a4 == null) {
                A01 = false;
            } else {
                A01 = c2a4.A01();
            }
            HeroPlayerSetting heroPlayerSetting = this.A0A;
            if (A01) {
                i2 = heroPlayerSetting.A0O;
            } else {
                i2 = heroPlayerSetting.A0N;
            }
            C4B0 A012 = c4bb.A01();
            if (A012 == null) {
                j = 0;
            } else {
                j = A012.A02 + A012.A01;
            }
            long j2 = j + ((long) (((c4bb.A02.A05 / 8.0d) * i) / 1000.0d));
            if (i2 < j2) {
                num = C05F.A0N;
            } else {
                i2 = (int) j2;
                num = C05F.A0Y;
            }
        }
        return new C4BT(i2, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C92274Bh A02(X.C2B4 r20, X.C4AZ r21, com.facebook.exoplayer.monitor.VpsEventCallback r22, X.C2BB r23, X.C4AP r24, X.C5QS r25, X.C46442Bh r26, X.C4BB r27, java.lang.String r28, java.lang.String r29, java.util.concurrent.atomic.AtomicReference r30, long r31, boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            X.4AK r1 = X.C4AK.PROGRESSIVE
            r6 = r24
            X.4AN r0 = r6.A0D
            X.4AK r0 = r0.A07
            r2 = r26
            if (r1 != r0) goto L22
            int r0 = r6.A02
            if (r0 != 0) goto L22
            X.2A4 r0 = r2.A06
            if (r0 == 0) goto L1d
            boolean r0 = r0.A01()
            r1 = 500000(0x7a120, float:7.00649E-40)
            if (r0 != 0) goto L20
        L1d:
            r1 = 256000(0x3e800, float:3.58732E-40)
        L20:
            r6.A02 = r1
        L22:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r8 = r2.A0A
            X.2BZ r5 = r2.A05
            X.29o r9 = r2.A0J
            X.4Bh r0 = new X.4Bh
            r14 = r31
            r13 = r30
            r12 = r29
            r19 = r36
            r4 = r23
            r18 = r35
            r3 = r22
            r17 = r34
            r2 = r21
            r1 = r20
            r16 = r33
            r7 = r25
            r10 = r27
            r11 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46442Bh.A02(X.2B4, X.4AZ, com.facebook.exoplayer.monitor.VpsEventCallback, X.2BB, X.4AP, X.5QS, X.2Bh, X.4BB, java.lang.String, java.lang.String, java.util.concurrent.atomic.AtomicReference, long, boolean, boolean, boolean, boolean):X.4Bh");
    }

    public static C98444bN A03(AtomicReference atomicReference) {
        if (atomicReference != null && atomicReference.get() != null && ((C98224b1) atomicReference.get()).A02 != null && (((C98224b1) atomicReference.get()).A02 instanceof C4XE)) {
            InterfaceC98454bO interfaceC98454bO = ((C4XE) ((C98224b1) atomicReference.get()).A02).A00;
            if ((interfaceC98454bO instanceof C98444bN) && interfaceC98454bO != null) {
                InterfaceC98454bO interfaceC98454bO2 = ((C4XE) ((C98224b1) atomicReference.get()).A02).A00;
                if (interfaceC98454bO2 instanceof C98444bN) {
                    return (C98444bN) interfaceC98454bO2;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r8 == X.C05F.A0j) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(X.C46442Bh r6, X.C91954Ab r7, java.lang.Integer r8) {
        /*
            boolean r3 = r6.A0L
            if (r3 == 0) goto L24
            X.2Bg r5 = r6.A07
            if (r5 == 0) goto L24
            X.4AP r4 = r7.A02
            X.2Bj r0 = r6.A03
            java.util.LinkedList r2 = r0.A04
            monitor-enter(r2)
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r1
        L18:
            X.4Ad r1 = new X.4Ad
            r1.<init>(r4, r0)
            X.29d r0 = r5.A00
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r0 = r0.A0G
            r0.callback(r1)
        L24:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r6.A0A
            boolean r2 = r0.A2v
            java.lang.Integer r0 = X.C05F.A00
            if (r8 == r0) goto L36
            java.lang.Integer r0 = X.C05F.A01
            if (r8 == r0) goto L35
            java.lang.Integer r0 = X.C05F.A0j
            r2 = 0
            if (r8 != r0) goto L36
        L35:
            r2 = 1
        L36:
            X.2Bj r4 = r6.A03
            r1 = 1
            X.4Ai r0 = new X.4Ai
            r0.<init>(r7, r1)
            X.C46462Bj.A00(r0, r4, r2)
            if (r3 == 0) goto L60
            X.2Bg r3 = r6.A07
            if (r3 == 0) goto L60
            X.4AP r2 = r7.A02
            java.util.LinkedList r0 = r4.A04
            monitor-enter(r0)
            r0.size()     // Catch: java.lang.Throwable -> L51
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r1
        L54:
            X.4Al r1 = new X.4Al
            r1.<init>(r2)
            X.29d r0 = r3.A00
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r0 = r0.A0G
            r0.callback(r1)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46442Bh.A05(X.2Bh, X.4Ab, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r0.A01() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r6 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A06(boolean r6) {
        /*
            r5 = this;
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r4 = r5.A0A
            boolean r0 = r4.A1X
            r3 = 0
            if (r0 == 0) goto La
            r2 = 1
            if (r6 != 0) goto Lb
        La:
            r2 = 0
        Lb:
            X.29y r1 = r5.A09
            if (r1 == 0) goto L23
            r0 = 12
            int r1 = X.C461429y.A00(r1, r0)
            r0 = 1
            if (r1 != r0) goto L23
            X.2A4 r0 = r5.A06
            if (r0 == 0) goto L23
            boolean r0 = r0.A01()
            r1 = 1
            if (r0 == 0) goto L24
        L23:
            r1 = 0
        L24:
            boolean r0 = r4.A2O
            r0 = r0 ^ 1
            if (r0 != 0) goto L2e
            if (r1 != 0) goto L2e
            if (r2 == 0) goto L2f
        L2e:
            r3 = 1
        L2f:
            r0 = r3 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46442Bh.A06(boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x017e, code lost:
    
        if ((r17 instanceof X.C4B9) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01b1, code lost:
    
        if (r2 <= 0) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4BU A09(com.facebook.exoplayer.monitor.VpsEventCallback r15, X.C4BS r16, X.C4BB r17, X.C4BB r18, java.lang.String r19, java.lang.String r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46442Bh.A09(com.facebook.exoplayer.monitor.VpsEventCallback, X.4BS, X.4BB, X.4BB, java.lang.String, java.lang.String, int, int, boolean):X.4BU");
    }

    public final void A0A(C2B4 c2b4, C4AZ c4az, VpsEventCallback vpsEventCallback, C2BB c2bb, C4AP c4ap, C5QS c5qs, C4BB c4bb, String str, String str2, AtomicReference atomicReference, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        C92274Bh A02 = A02(c2b4, c4az, vpsEventCallback, c2bb, c4ap, c5qs, this, c4bb, str, str2, atomicReference, j, z, z2, z3, z4);
        C4AN c4an = c4ap.A0D;
        AbstractC459729h.A01("UnifiedPrefetchManager", "video: %s queuing prefetch task, from origin %s subOrigin %s with tag %s and module %s", str, c4an.A0A, c4an.A0B, "", "");
        if (this.A0A.A0w.A0R) {
            A02.AQ5();
            A02.onComplete();
        } else {
            A05(this, A02, c4ap.A0F);
        }
    }

    public final boolean A0C(C4BB c4bb, String str) {
        boolean z = false;
        List asList = Arrays.asList("".split(";"));
        if (str != null && asList.contains(str)) {
            z = true;
        }
        if (z) {
            return false;
        }
        C2A4 c2a4 = this.A06;
        if (c2a4 != null) {
            c2a4.A01();
        }
        if (c4bb.A03().contains("webm")) {
            return false;
        }
        return true;
    }

    public C46442Bh(Context context, InterfaceC460229m interfaceC460229m, C2BZ c2bz, C2A4 c2a4, C46432Bg c46432Bg, C46272Ao c46272Ao, C461429y c461429y, HeroPlayerSetting heroPlayerSetting, InterfaceC460429o interfaceC460429o, Map map, AtomicReference atomicReference) {
        this.A03 = new C46462Bj(new C46452Bi(this, heroPlayerSetting));
        this.A05 = c2bz;
        this.A06 = c2a4;
        this.A0F = map;
        this.A0A = heroPlayerSetting;
        this.A04 = interfaceC460229m;
        this.A0J = interfaceC460429o;
        this.A07 = c46432Bg;
        this.A02 = context;
        this.A08 = c46272Ao;
        AtomicReference atomicReference2 = new AtomicReference();
        this.A0I = atomicReference2;
        atomicReference2.set(false);
        this.A0H = atomicReference;
        this.A0K = new HashMap();
        this.A0L = heroPlayerSetting.A2n || heroPlayerSetting.A2p;
        this.A09 = c461429y;
        this.A0D = Arrays.asList("".split(";"));
        this.A0C = Arrays.asList("".split(";"));
        this.A0E = Arrays.asList(heroPlayerSetting.A0z.grootPrefetchSuboriginBlocklist.split(";"));
        this.A0G = new ArrayDeque();
        C46472Bk.A02.A00.add(new Object() { // from class: X.2Bl
        });
    }

    public final C4AZ A07(Integer num) {
        switch (num.intValue()) {
            case 3:
                return C4AZ.LOW;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return C4AZ.URGENT;
            default:
                return C4AZ.HIGH;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0412, code lost:
    
        if (r0 != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (X.AbstractC97784aH.A01(r14.A19, r14.A2x) != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent, com.facebook.exoplayer.ipc.VideoPlayerServiceEvent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v101, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(final com.facebook.exoplayer.monitor.VpsEventCallback r66, final X.C4AP r67, final X.C46442Bh r68) {
        /*
            Method dump skipped, instructions count: 2498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46442Bh.A04(com.facebook.exoplayer.monitor.VpsEventCallback, X.4AP, X.2Bh):void");
    }

    /* JADX WARN: Type inference failed for: r25v0, types: [X.4AO, java.lang.Object] */
    public final void A0B(C2B4 c2b4, VpsEventCallback vpsEventCallback, C2BB c2bb, C4AP c4ap, C4BB c4bb, Integer num, Integer num2, AtomicReference atomicReference, AtomicReference atomicReference2, int i, int i2, int i3, long j, long j2, boolean z, boolean z2, boolean z3) {
        int i4;
        int i5;
        C4AN c4an = c4ap.A0D;
        String str = c4an.A0A;
        String str2 = c4an.A0B;
        String str3 = c4an.A0C;
        String str4 = c4an.A0G;
        if (str4 != null) {
            boolean z4 = c4an.A0M;
            boolean z5 = c4an.A0N;
            Integer num3 = c4ap.A0F;
            long j3 = c4ap.A09;
            boolean z6 = c4ap.A0M;
            long j4 = c4ap.A08;
            long j5 = c4ap.A06;
            boolean z7 = c4ap.A0W;
            boolean z8 = c4ap.A0J;
            boolean z9 = c4ap.A0U;
            long j6 = i;
            if (j4 >= j6) {
                j4 = -1;
            }
            C4B6 c4b6 = c4bb.A02;
            String str5 = c4b6.A0T;
            AbstractC459729h.A01("UnifiedPrefetchManager", "video: %s representation id: %s, width: %d from origin %s and suborigin %s and source(tag) %s is being prefetched", str4, str5, Integer.valueOf(c4b6.A0L), str, str2, "");
            ArrayList arrayList = new ArrayList();
            InterfaceC97364Yw A00 = c4bb.A00();
            C4B0 c4b0 = c4bb.A03;
            if (c4b0 == null) {
                i4 = 2;
            } else if (A00 != null) {
                arrayList.add(new Pair(c4b0.A00(c4bb.A03()), Integer.valueOf((int) c4b0.A01)));
                i4 = 2;
                long B6h = A00.B6h();
                long BsK = (A00.BsK(j6) + B6h) - 1;
                if (BsK == -1) {
                    BsK = B6h;
                }
                int i6 = i3;
                while (B6h <= BsK) {
                    C4B0 BsR = A00.BsR(B6h);
                    int i7 = (int) BsR.A01;
                    long Azu = A00.Azu(B6h, -9223372036854775807L);
                    if (i7 < 0) {
                        i7 = (int) (((((float) Azu) / 1000000.0f) * c4b6.A05) / 8.0f);
                    }
                    if (Azu <= 0) {
                        i5 = -1;
                    } else {
                        i5 = i3;
                        if (i6 < i7) {
                            i5 = i6;
                        }
                    }
                    arrayList.add(new Pair(BsR.A00(c4bb.A03()), Integer.valueOf(i5)));
                    i6 -= i7;
                    if (i6 < 0) {
                        break;
                    } else {
                        B6h++;
                    }
                }
            } else {
                i4 = 2;
                arrayList.add(new Pair(c4b0.A00(c4bb.A03()), Integer.valueOf(i3)));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Integer num4 = (Integer) pair.second;
                int intValue = num4.intValue();
                AbstractC459729h.A01("UnifiedPrefetchManager", "video prefetch: %s url: %s %d", str4, pair.first, num4);
                C5QS c5qs = null;
                C4AN c4an2 = new C4AN((android.net.Uri) pair.first, null, C4AM.GENERAL, C4AK.DASH_VOD, str4, null, null, str, str2, str3, null, C4AL.A00(num), null, null, null, Collections.emptyMap(), z4, z5, false, false);
                String A02 = c4bb.A02();
                int i8 = c4b6.A05;
                String str6 = c4b6.A0N.A07;
                if (str6 == null) {
                    str6 = new String();
                }
                C4AP c4ap2 = new C4AP(EnumC46372Az.PREFETCH, new Object(), c4an2, null, null, num3, num2, A02, str6, "UnifiedPrefetchManager", intValue, i2, 0, i8, i, j2, j3, j4, j5, true, z6, z7, z8, z9);
                boolean z10 = i2 != i4 ? atomicReference != null : atomicReference2 != null;
                if (A06(z8) && A00 == null && z10 && !z7) {
                    c5qs = new C5QS(c2b4, vpsEventCallback, c2bb, c4ap2, this, c4bb, atomicReference2, atomicReference, i2, i3, j, z, z2, z3);
                }
                boolean z11 = i2 == i4;
                C4AZ A07 = A07(c4ap2.A0F);
                AtomicReference atomicReference3 = atomicReference;
                if (i2 == i4) {
                    atomicReference3 = atomicReference2;
                }
                A0A(c2b4, A07, vpsEventCallback, c2bb, c4ap2, c5qs, c4bb, str4, str5, atomicReference3, j, z11, z, z2, z3);
            }
        }
    }
}
