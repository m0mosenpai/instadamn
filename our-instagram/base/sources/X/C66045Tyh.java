package X;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Process;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Tyh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66045Tyh implements InterfaceC71998XEm {
    public int A00;
    public long A01;
    public MYB A02;
    public WDI A03;
    public C69198VjR A04;
    public C68242VJe A05;
    public B52 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final Context A0G;
    public final InterfaceC58019Po5 A0H;
    public final C70129W5q A0I;
    public final X9V A0J;
    public final InterfaceC58105PpU A0K;
    public final C69489VoC A0L;
    public final XCA A0M;
    public final InterfaceC71895X9c A0N;
    public final ExecutorService A0O;
    public volatile long A0P;
    public volatile InterfaceC72006XEu A0Q;
    public volatile InterfaceC71997XEl A0R;
    public volatile Future A0S;
    public volatile boolean A0T;
    public volatile boolean A0U;
    public volatile boolean A0V;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A03() {
        /*
            r9 = this;
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "cancelExtractionFuture"
            A07(r0, r1)
            java.util.concurrent.Future r0 = r9.A0S
            if (r0 == 0) goto L94
            java.util.concurrent.Future r0 = r9.A0S
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L94
            X.B52 r5 = r9.A06
            boolean r0 = r5.A00
            java.lang.String r4 = "cancelExtractionFuture Throwable=%s"
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            if (r0 == 0) goto L71
            java.lang.String r0 = "cancelExtractionFuture mExtractFuturelock.isEnabled"
            A07(r0, r1)
            r9.A0V = r3
            long r1 = r9.A01     // Catch: java.lang.Throwable -> L3c
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L36
            java.util.concurrent.Future r7 = r9.A0S     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L3c
            r7.get(r1, r0)     // Catch: java.lang.Throwable -> L3c
            goto L44
        L36:
            java.util.concurrent.Future r0 = r9.A0S     // Catch: java.lang.Throwable -> L3c
            r0.get()     // Catch: java.lang.Throwable -> L3c
            goto L44
        L3c:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L66
            A07(r4, r0)     // Catch: java.lang.Throwable -> L66
        L44:
            boolean r0 = r9.A09
            if (r0 == 0) goto L4d
            java.util.concurrent.Future r0 = r9.A0S
            r0.cancel(r3)
        L4d:
            boolean r0 = r5.A00
            if (r0 == 0) goto L54
            r5.lock()
        L54:
            java.lang.String r1 = "cancelExtractionFuture mExtractFuturelock.open"
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L5c
            A07(r1, r0)     // Catch: java.lang.Throwable -> L5c
            goto L8a
        L5c:
            r1 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L61
            throw r1
        L61:
            r0 = move-exception
            X.AbstractC61625Rqp.A00(r1, r0)
            throw r1
        L66:
            r1 = move-exception
            boolean r0 = r9.A09
            if (r0 == 0) goto L70
            java.util.concurrent.Future r0 = r9.A0S
            r0.cancel(r3)
        L70:
            throw r1
        L71:
            java.lang.String r0 = "cancelExtractionFuture: mExtractFuture.cancel"
            A07(r0, r1)
            java.util.concurrent.Future r0 = r9.A0S
            r0.cancel(r3)
            java.util.concurrent.Future r0 = r9.A0S     // Catch: java.lang.Throwable -> L81
            r0.get()     // Catch: java.lang.Throwable -> L81
            return
        L81:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            A07(r4, r0)
            return
        L8a:
            r5.close()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "cancelExtractionFuture mExtractFuturelock done"
            A07(r0, r1)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66045Tyh.A03():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a6  */
    @Override // X.InterfaceC71998XEm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJ6(int r19) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66045Tyh.AJ6(int):void");
    }

    @Override // X.InterfaceC71998XEm
    public final void FCj(C1125456i c1125456i) {
        A07("updateTrim", new Object[0]);
        A03();
        this.A0Q.FCl(c1125456i);
        this.A0C = false;
    }

    @Override // X.InterfaceC71998XEm
    public final void cancel() {
        A07("cancel", new Object[0]);
        this.A0T = true;
        A03();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Tyj, java.lang.Object] */
    @Override // X.InterfaceC71998XEm
    public final void release() {
        A07("release", new Object[0]);
        if (this.A07) {
            cancel();
        }
        ?? obj = new Object();
        new C67628Uti((C66046Tyj) obj, this.A0Q).A00();
        InterfaceC71997XEl interfaceC71997XEl = this.A0R;
        if (interfaceC71997XEl != null) {
            try {
                interfaceC71997XEl.AVe();
            } catch (Throwable th) {
                C66046Tyj.A00(obj, th);
            }
        }
        obj.A01();
    }

    private long A00(long j) {
        C68242VJe c68242VJe = this.A05;
        if (c68242VJe != null && j >= 0) {
            if (!c68242VJe.A04) {
                c68242VJe.A00 = c68242VJe.A03.A00(TimeUnit.MICROSECONDS, j);
                c68242VJe.A04 = true;
            }
            c68242VJe.A01 = ((float) c68242VJe.A01) + (((float) (j - c68242VJe.A02)) / c68242VJe.A00);
            c68242VJe.A00 = c68242VJe.A03.A00(TimeUnit.MICROSECONDS, j);
            c68242VJe.A02 = j;
            return c68242VJe.A01;
        }
        return j;
    }

    private C69198VjR A01() {
        MediaComposition mediaComposition = this.A0L.A08;
        if (mediaComposition != null) {
            C69198VjR c69198VjR = new C69198VjR(mediaComposition);
            EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
            int i = this.A00;
            c69198VjR.A00 = enumC1125356h;
            C1125956n A04 = c69198VjR.A03.A04(enumC1125356h, i);
            c69198VjR.A01 = A04;
            if (A04 != null) {
                Iterator A0n = AbstractC65702TsY.A0n(A04.A06);
                c69198VjR.A02 = A0n;
                if (A0n != null && A0n.hasNext()) {
                    c69198VjR.A02.next();
                }
                return c69198VjR;
            }
            throw new IllegalArgumentException("Requested Track is not available");
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.VJe, java.lang.Object] */
    private C68242VJe A02() {
        C69489VoC c69489VoC = this.A0L;
        MediaComposition mediaComposition = c69489VoC.A08;
        if (mediaComposition != null) {
            C66042Tye c66042Tye = new C66042Tye(mediaComposition, c69489VoC.A0B.A1P());
            c66042Tye.A01(EnumC1125356h.VIDEO, this.A00);
            ?? obj = new Object();
            obj.A04 = false;
            obj.A00 = 1.0f;
            obj.A02 = 0L;
            obj.A01 = 0L;
            obj.A03 = c66042Tye;
            return obj;
        }
        return null;
    }

    private void A04() {
        if (!this.A0D && !this.A0E) {
            A07("throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not started", new Object[0]);
            throw new Exception("VideoDemuxDecodeWrapper not started");
        }
    }

    private void A05(MediaFormat mediaFormat) {
        MYB myb;
        int i;
        int i2;
        WDI wdi = this.A03;
        if (wdi != null && (myb = this.A02) != null && this.A0L.A0B.A0B()) {
            boolean A1M = AbstractC167007dF.A1M(myb.A04 % 180);
            int i3 = myb.A05;
            int i4 = myb.A03;
            if (i4 > -1 && i3 > -1) {
                int i5 = i3;
                int i6 = i4;
                if (A1M) {
                    i5 = i4;
                    i6 = i3;
                }
                if (wdi.A0B % 180 != 0) {
                    i = wdi.A0A;
                    i2 = wdi.A0C;
                } else {
                    i = wdi.A0C;
                    i2 = wdi.A0A;
                }
                int i7 = i3 * i4;
                int i8 = i * i2;
                if (i7 >= i8) {
                    i5 = i;
                }
                if (i7 >= i8) {
                    i6 = i2;
                }
                int i9 = i5;
                if (A1M) {
                    i9 = i6;
                }
                mediaFormat.setInteger(IgReactMediaPickerNativeModule.WIDTH, i9);
                if (!A1M) {
                    i5 = i6;
                }
                mediaFormat.setInteger(IgReactMediaPickerNativeModule.HEIGHT, i5);
            }
        }
    }

    private void A06(MediaFormat mediaFormat, InterfaceC71997XEl interfaceC71997XEl, int i, boolean z, boolean z2) {
        String str;
        long j;
        MYB myb;
        if (interfaceC71997XEl != null && mediaFormat != null) {
            Exception e = null;
            ArrayList arrayList = new ArrayList();
            if (z2) {
                WDI wdi = this.A03;
                if (wdi != null && (myb = this.A02) != null) {
                    U7W u7w = this.A0L.A0B;
                    if (u7w.A0A()) {
                        boolean A1M = AbstractC167007dF.A1M(myb.A04 % 180);
                        int i2 = myb.A05;
                        int i3 = myb.A03;
                        int A03 = u7w.A03();
                        int A02 = u7w.A02();
                        if (i3 > -1 && i2 > -1 && A03 > -1 && A02 > -1) {
                            int i4 = A02;
                            if (wdi.A0B % 180 == 0) {
                                i4 = A03;
                                A03 = A02;
                            }
                            if (i4 * A03 < i2 * i3) {
                                int i5 = i4;
                                if (A1M) {
                                    i5 = A03;
                                }
                                mediaFormat.setInteger(IgReactMediaPickerNativeModule.WIDTH, i5);
                                int i6 = A03;
                                if (A1M) {
                                    i6 = i4;
                                }
                                mediaFormat.setInteger(IgReactMediaPickerNativeModule.HEIGHT, i6);
                                wdi.A0C = i4;
                                wdi.A0A = A03;
                            }
                        }
                    }
                }
            } else {
                A05(mediaFormat);
            }
            int i7 = 0;
            while (i7 < 4) {
                try {
                    interfaceC71997XEl.E5f(mediaFormat, this.A0L.A0B, arrayList, i, z);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    if (!(e instanceof IllegalStateException)) {
                        break;
                    }
                    if (e.getMessage() != null && e.getMessage().startsWith("codec name:")) {
                        arrayList.add(e.getMessage().substring(11));
                    } else if (!this.A0L.A0B.A1C()) {
                        break;
                    }
                    i7++;
                }
            }
            if (e instanceof MediaCodec.CodecException) {
                str = AbstractC1126356r.A03((MediaCodec.CodecException) e);
            } else {
                str = "null";
            }
            ActivityManager activityManager = (ActivityManager) this.A0G.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                j = memoryInfo.availMem;
            } else {
                j = -1;
            }
            long j2 = C0I4.A03;
            long j3 = C0I4.A02;
            long j4 = C0I4.A04;
            long j5 = C0I4.A01;
            A07("prepareDecoderWithRetry: media format=%s, number of retries=%s, blacklisted decoders=%s, availMem=%s, successCreateCodecs=%d, requestReleaseCodecs=%d, successReleaseCodecs=%d, failedReleaseCodecs=%d, badThreads=%s, mediaCodecException=%s, Exception=%s", mediaFormat, Integer.valueOf(i7), Arrays.toString(arrayList.toArray()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), C0II.A00(), str, e);
            StringBuilder sb = new StringBuilder();
            sb.append("media format:");
            sb.append(mediaFormat);
            sb.append(", number of retries:");
            sb.append(i7);
            sb.append(", avail mem:");
            sb.append(j);
            sb.append(", successCreateCodecs:");
            sb.append(j2);
            sb.append(", requestReleaseCodecs:");
            sb.append(j3);
            sb.append(", successReleaseCodecs:");
            sb.append(j4);
            sb.append(", failedReleaseCodecs:");
            sb.append(j5);
            sb.append(", badThreads:");
            sb.append(C0II.A00());
            sb.append(", blacklisted decoders:");
            sb.append(Arrays.toString(arrayList.toArray()));
            throw new IllegalStateException(MSZ.A0u(" mediaCodecException: ", str, sb), e);
        }
        throw new NullPointerException("videoDecoder or mediaFormat is null");
    }

    public static void A07(String str, Object... objArr) {
        AbstractC66043Tyf.A00(AbstractC111324zv.A00(1860), str, objArr);
    }

    @Override // X.InterfaceC71998XEm
    public final long AO3() {
        AbstractC1808580n.A03("VideoDemuxDecodeWrapper.decodeFrameAndAdvance");
        A04();
        this.A0C = false;
        long j = this.A0P;
        try {
            InterfaceC71997XEl interfaceC71997XEl = this.A0R;
            long j2 = this.A0F;
            long AO5 = interfaceC71997XEl.AO5(j2) + j;
            while (AO5 < 0 && !this.A0R.Cei() && !this.A0T) {
                AbstractC1808580n.A03("VideoDemuxDecodeWrapper.decodeFrameAndAdvanceLoop");
                AO5 = this.A0P + this.A0R.AO5(j2);
                AbstractC1808580n.A01();
            }
            if (this.A0S.isDone() && !this.A0U) {
                this.A0S.get();
                this.A0U = true;
            }
            if (this.A0R.Cei() && !this.A0U) {
                if (this.A08) {
                    A07("decodeFrameAndAdvance mEnableCancelDecoderExtractFuture", new Object[0]);
                    A03();
                } else {
                    this.A0S.get();
                }
            }
            long A00 = A00(AO5);
            AbstractC1808580n.A01();
            return A00;
        } catch (IllegalStateException e) {
            throw new IllegalStateException(AnonymousClass001.A0Q("Previous Enqueue Buffer: ", j), e);
        }
    }

    @Override // X.InterfaceC71998XEm
    public final long Aw1() {
        C1125956n c1125956n;
        long Aw1 = this.A0R.Aw1() + this.A0P;
        C69198VjR c69198VjR = this.A04;
        if (c69198VjR != null && (c1125956n = c69198VjR.A01) != null && !new ArrayList(c1125956n.A06).isEmpty()) {
            AbstractC1126356r.A07(AbstractC167007dF.A1W(this.A04.A00), "No track is selected");
            return Aw1;
        }
        return A00(Aw1);
    }

    @Override // X.InterfaceC71998XEm
    public final C54837OLw BQe() {
        return this.A0Q.BQe();
    }

    @Override // X.InterfaceC71998XEm
    public final boolean CSP() {
        return this.A0R.Cei();
    }

    @Override // X.InterfaceC71998XEm
    public final void FDy() {
        AbstractC1808580n.A03("VideoDemuxDecodeWrapper.warmup");
        A04();
        while (this.A0R.Aw1() + this.A0P < 0 && !this.A0R.Cei() && !this.A0T) {
            this.A0R.AO5(this.A0F);
        }
        this.A0C = true;
        AbstractC1808580n.A01();
    }

    @Override // X.InterfaceC71998XEm
    public final void start() {
        if (this.A0B) {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            A07("start", new Object[0]);
            this.A0V = false;
            this.A0S = this.A0O.submit(new CallableC208669La(this, threadPriority, 6));
            this.A0E = true;
            return;
        }
        A07("throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", new Object[0]);
        throw new Exception("VideoDemuxDecodeWrapper not configured");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.locks.ReentrantLock, X.B52] */
    public C66045Tyh(Context context, InterfaceC58019Po5 interfaceC58019Po5, C70129W5q c70129W5q, X9V x9v, InterfaceC58105PpU interfaceC58105PpU, C69489VoC c69489VoC, XCA xca, InterfaceC71895X9c interfaceC71895X9c, ExecutorService executorService, boolean z) {
        long j;
        this.A0G = context;
        this.A0O = executorService;
        this.A0L = c69489VoC;
        this.A0N = interfaceC71895X9c;
        this.A0J = x9v;
        this.A0H = interfaceC58019Po5;
        this.A0K = interfaceC58105PpU;
        this.A0I = c70129W5q;
        this.A0M = xca;
        this.A0D = z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (z) {
            j = 10;
        } else {
            j = 250;
        }
        this.A0F = (int) timeUnit.toMicros(j);
        U7W u7w = c69489VoC.A0B;
        this.A0A = u7w.A0S();
        this.A07 = u7w.A0s();
        this.A08 = u7w.A0t();
        boolean A0w = u7w.A0w();
        ?? reentrantLock = new ReentrantLock();
        reentrantLock.A00 = A0w;
        this.A06 = reentrantLock;
        this.A09 = u7w.A0v();
        this.A01 = u7w.A0i();
        this.A03 = c69489VoC.A06;
    }

    @Override // X.InterfaceC71998XEm
    public final void AO4(long j) {
        A04();
        while (Aw1() <= j && !this.A0R.Cei() && !this.A0T) {
            AO3();
        }
    }

    @Override // X.InterfaceC71998XEm
    public final void EMh(long j) {
        float f;
        C1125956n c1125956n;
        A07("seekTo: ptsUs=%s", Long.valueOf(j));
        if (this.A0B) {
            boolean z = this.A0D;
            if (!z && this.A0E) {
                A07("throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper has already started", new Object[0]);
                throw new Exception("VideoDemuxDecodeWrapper has already started");
            }
            C69198VjR c69198VjR = this.A04;
            if (c69198VjR != null && (c1125956n = c69198VjR.A01) != null && !new ArrayList(c1125956n.A06).isEmpty()) {
                C69198VjR A01 = A01();
                this.A04 = A01;
                AbstractC1126356r.A07(AbstractC167007dF.A1W(A01.A00), "No track is selected");
            } else {
                float f2 = (float) j;
                C69489VoC c69489VoC = this.A0L;
                MediaComposition mediaComposition = c69489VoC.A08;
                if (mediaComposition != null) {
                    C66042Tye c66042Tye = new C66042Tye(mediaComposition, c69489VoC.A0B.A1P());
                    c66042Tye.A01(EnumC1125356h.VIDEO, this.A00);
                    f = c66042Tye.A00(TimeUnit.MICROSECONDS, j);
                } else {
                    f = 1.0f;
                }
                j = f2 * f;
            }
            long j2 = 0;
            if (z) {
                if (this.A0C && j == 0) {
                    return;
                }
                this.A0C = false;
                A07("seekTo mIsRealtime", new Object[0]);
                A03();
                this.A0R.flush();
                this.A0Q.EMh(j);
                if (this.A0Q.Bq8() > 0) {
                    j2 = this.A0Q.Bq8();
                }
                this.A0P = j2;
                this.A05 = A02();
                start();
                return;
            }
            if (j < 0) {
                return;
            }
            this.A0Q.EMh(j);
            return;
        }
        A07("throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", new Object[0]);
        throw new Exception("VideoDemuxDecodeWrapper not configured");
    }
}
