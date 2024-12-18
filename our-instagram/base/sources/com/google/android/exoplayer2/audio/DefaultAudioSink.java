package com.google.android.exoplayer2.audio;

import X.AbstractC38301qK;
import X.AbstractC46512Bo;
import X.AbstractC63123SdR;
import X.C126345nV;
import X.C129405t2;
import X.C2A7;
import X.C2C1;
import X.C2C5;
import X.C4B6;
import X.C4B8;
import X.C4TU;
import X.C4UD;
import X.C4UE;
import X.C4UF;
import X.C4UG;
import X.C4UI;
import X.C4UJ;
import X.C4UK;
import X.C4UL;
import X.C4UM;
import X.C4UO;
import X.C4UP;
import X.C4UQ;
import X.C4US;
import X.C4UT;
import X.C4UU;
import X.C4UX;
import X.C4UY;
import X.C4UZ;
import X.C4WZ;
import X.C4Y5;
import X.C4Y7;
import X.C4Y8;
import X.C4Y9;
import X.C54373O1f;
import X.C72848Xp4;
import X.C96174Ua;
import X.InterfaceC96204Ud;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.util.Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.AndroidVideoDecoder;

/* loaded from: classes2.dex */
public final class DefaultAudioSink implements C4UO {
    public static int A0n;
    public static ExecutorService A0o;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public AudioTrack A0B;
    public C4WZ A0C;
    public C4UX A0D;
    public InterfaceC96204Ud A0E;
    public C4UY A0F;
    public C54373O1f A0G;
    public C129405t2 A0H;
    public C4UZ A0I;
    public C4UZ A0J;
    public ByteBuffer A0K;
    public ByteBuffer A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public C4UE[] A0V;
    public ByteBuffer[] A0W;
    public C4TU A0X;
    public C129405t2 A0Y;
    public C72848Xp4 A0Z;
    public final C4UD A0a;
    public final C4UG A0b;
    public final C4US A0c;
    public final C4UU A0d;
    public final C4UP A0e;
    public final ArrayDeque A0f;
    public final boolean A0g;
    public final C4UT A0h;
    public final C4UM A0i;
    public final C96174Ua A0j;
    public final C96174Ua A0k;
    public final C4UE[] A0l;
    public final C4UE[] A0m;
    public static final Object A0q = new Object();
    public static AtomicInteger A0p = new AtomicInteger(0);

    private void A08(ByteBuffer byteBuffer, long j) {
        int write;
        InterfaceC96204Ud interfaceC96204Ud;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.A0L;
            boolean z = true;
            if (byteBuffer2 != null) {
                boolean z2 = false;
                if (byteBuffer2 == byteBuffer) {
                    z2 = true;
                }
                C4B8.A03(z2);
            } else {
                this.A0L = byteBuffer;
            }
            int remaining = byteBuffer.remaining();
            int i = Util.A00;
            if (this.A0U) {
                boolean z3 = false;
                if (j != -9223372036854775807L) {
                    z3 = true;
                }
                C4B8.A04(z3);
                write = this.A0B.write(byteBuffer, remaining, 1, j * 1000);
            } else {
                write = this.A0B.write(byteBuffer, remaining, 1);
            }
            this.A05 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((write != -6 && write != -32) || this.A09 <= 0) {
                    z = false;
                }
                C4Y5 c4y5 = new C4Y5(this.A0H.A07, write, z);
                InterfaceC96204Ud interfaceC96204Ud2 = this.A0E;
                if (interfaceC96204Ud2 != null) {
                    interfaceC96204Ud2.Cy6(c4y5);
                }
                if (!c4y5.A01) {
                    this.A0k.A00(c4y5);
                    return;
                }
                throw c4y5;
            }
            this.A0k.A00 = null;
            AudioTrack audioTrack = this.A0B;
            if (i >= 29 && audioTrack.isOffloadedPlayback()) {
                if (this.A09 > 0) {
                    this.A0P = false;
                }
                if (this.A0Q && (interfaceC96204Ud = this.A0E) != null && write < remaining && !this.A0P) {
                    interfaceC96204Ud.DWR();
                }
            }
            int i2 = this.A0H.A04;
            if (i2 == 0) {
                this.A0A += write;
            }
            if (write != remaining) {
                return;
            }
            if (i2 != 0) {
                if (byteBuffer != this.A0K) {
                    z = false;
                }
                C4B8.A04(z);
                this.A09 += this.A03 * this.A04;
            }
            this.A0L = null;
        }
    }

    @Override // X.C4UO
    public final void pause() {
        this.A0Q = false;
        if (this.A0B != null) {
            C4US c4us = this.A0c;
            c4us.A0H = 0L;
            c4us.A04 = 0;
            c4us.A02 = 0;
            c4us.A09 = 0L;
            c4us.A0B = 0L;
            c4us.A0E = 0L;
            c4us.A0Q = false;
            if (c4us.A0J == -9223372036854775807L) {
                C126345nV c126345nV = c4us.A0L;
                c126345nV.getClass();
                c126345nV.A00();
                this.A0B.pause();
            }
        }
    }

    public static long A00(DefaultAudioSink defaultAudioSink) {
        if (defaultAudioSink.A0H.A04 == 0) {
            return defaultAudioSink.A0A / r1.A05;
        }
        return defaultAudioSink.A09;
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x007b: IGET (r6 I:int) = (r0 I:X.5t2) A[Catch: 4Y8 -> 0x00a1] (LINE:123) X.5t2.A06 int, block:B:24:0x007a */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.5t2] */
    private AudioTrack A01(C129405t2 c129405t2) {
        ?? r0;
        AudioTrack audioTrack;
        try {
            boolean z = this.A0U;
            C4UX c4ux = this.A0D;
            int i = this.A01;
            try {
                if (Util.A00 >= 29) {
                    audioTrack = C129405t2.A01(c4ux, c129405t2, i, z);
                } else {
                    AudioAttributes A00 = C129405t2.A00(c4ux, z);
                    int i2 = c129405t2.A06;
                    int i3 = c129405t2.A02;
                    audioTrack = new AudioTrack(A00, new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(c129405t2.A03).build(), c129405t2.A00, 1, i);
                }
                AtomicInteger atomicInteger = A0p;
                atomicInteger.incrementAndGet();
                int state = audioTrack.getState();
                if (state == 1) {
                    return audioTrack;
                }
                try {
                    audioTrack.release();
                    atomicInteger.decrementAndGet();
                } catch (Exception e) {
                    AbstractC46512Bo.A05("DefaultAudioSink", String.format("buildAudioTrack: state=%d, audioTrackAllocated.get()=%d", Integer.valueOf(state), Integer.valueOf(atomicInteger.get())), e);
                }
                int i4 = c129405t2.A06;
                int i5 = c129405t2.A02;
                int i6 = c129405t2.A00;
                C4B6 c4b6 = c129405t2.A07;
                boolean z2 = true;
                if (c129405t2.A04 != 1) {
                    z2 = false;
                }
                throw new C4Y8(c4b6, null, state, i4, i5, i6, atomicInteger.get(), z2);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                int i7 = r0.A06;
                int i8 = r0.A02;
                int i9 = r0.A00;
                C4B6 c4b62 = r0.A07;
                boolean z3 = true;
                if (r0.A04 != 1) {
                    z3 = false;
                }
                throw new C4Y8(c4b62, e2, 0, i7, i8, i9, A0p.get(), z3);
            }
        } catch (C4Y8 e3) {
            InterfaceC96204Ud interfaceC96204Ud = this.A0E;
            if (interfaceC96204Ud != null) {
                interfaceC96204Ud.Cy6(e3);
            }
            throw e3;
        }
    }

    public static C4UZ A02(DefaultAudioSink defaultAudioSink) {
        C4UZ c4uz = defaultAudioSink.A0I;
        if (c4uz == null) {
            ArrayDeque arrayDeque = defaultAudioSink.A0f;
            if (!arrayDeque.isEmpty()) {
                return (C4UZ) arrayDeque.getLast();
            }
            return defaultAudioSink.A0J;
        }
        return c4uz;
    }

    private void A03(long j) {
        C4TU c4tu;
        boolean z;
        if (!this.A0U && "audio/raw".equals(this.A0H.A07.A0W)) {
            C4UG c4ug = this.A0b;
            c4tu = A02(this).A02;
            C4UK c4uk = ((C4UF) c4ug).A01;
            float f = c4tu.A01;
            if (c4uk.A01 != f) {
                c4uk.A01 = f;
                c4uk.A07 = true;
            }
            float f2 = c4tu.A00;
            if (c4uk.A00 != f2) {
                c4uk.A00 = f2;
                c4uk.A07 = true;
            }
        } else {
            c4tu = C4TU.A03;
        }
        if (!this.A0U && "audio/raw".equals(this.A0H.A07.A0W)) {
            C4UG c4ug2 = this.A0b;
            z = A02(this).A03;
            ((C4UF) c4ug2).A00.A05 = z;
        } else {
            z = false;
        }
        this.A0f.add(new C4UZ(c4tu, Math.max(0L, j), (A00(this) * 1000000) / this.A0H.A06, z));
        C4UE[] c4ueArr = this.A0H.A09;
        ArrayList arrayList = new ArrayList();
        for (C4UE c4ue : c4ueArr) {
            if (c4ue.isActive()) {
                arrayList.add(c4ue);
            } else {
                c4ue.flush();
            }
        }
        int size = arrayList.size();
        this.A0V = (C4UE[]) arrayList.toArray(new C4UE[size]);
        this.A0W = new ByteBuffer[size];
        int i = 0;
        while (true) {
            C4UE[] c4ueArr2 = this.A0V;
            if (i >= c4ueArr2.length) {
                break;
            }
            C4UE c4ue2 = c4ueArr2[i];
            c4ue2.flush();
            this.A0W[i] = c4ue2.BaE();
            i++;
        }
        InterfaceC96204Ud interfaceC96204Ud = this.A0E;
        if (interfaceC96204Ud != null) {
            interfaceC96204Ud.Dmu(z);
        }
    }

    private void A04(long j) {
        ByteBuffer byteBuffer;
        int length = this.A0V.length;
        int i = length;
        do {
            if (i > 0) {
                byteBuffer = this.A0W[i - 1];
            } else {
                byteBuffer = this.A0K;
                if (byteBuffer == null) {
                    byteBuffer = C4UE.A00;
                }
            }
            if (i == length) {
                A08(byteBuffer, j);
            } else {
                C4UE c4ue = this.A0V[i];
                if (i > this.A02) {
                    c4ue.E7Z(byteBuffer);
                }
                ByteBuffer BaE = c4ue.BaE();
                this.A0W[i] = BaE;
                if (BaE.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        } while (i >= 0);
    }

    private void A05(AudioTrack audioTrack) {
        C72848Xp4 c72848Xp4 = this.A0Z;
        if (c72848Xp4 == null) {
            c72848Xp4 = new C72848Xp4(this);
            this.A0Z = c72848Xp4;
        }
        c72848Xp4.A00(audioTrack);
    }

    public static void A07(DefaultAudioSink defaultAudioSink) {
        if (!defaultAudioSink.A0T) {
            defaultAudioSink.A0T = true;
            C4US c4us = defaultAudioSink.A0c;
            long A00 = A00(defaultAudioSink);
            c4us.A0I = C4US.A00(c4us);
            c4us.A0J = SystemClock.elapsedRealtime() * 1000;
            c4us.A06 = A00;
            defaultAudioSink.A0B.stop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r9.A0L != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0025 -> B:4:0x000a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A09(com.google.android.exoplayer2.audio.DefaultAudioSink r9) {
        /*
            int r8 = r9.A02
            r7 = -1
            r6 = 1
            r5 = 0
            if (r8 != r7) goto L2c
            r9.A02 = r5
            r8 = 0
        La:
            r4 = 1
        Lb:
            X.4UE[] r3 = r9.A0V
            int r0 = r3.length
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r0) goto L2e
            r0 = r3[r8]
            if (r4 == 0) goto L1c
            r0.E7Y()
        L1c:
            r9.A04(r1)
            boolean r0 = r0.CTt()
            if (r0 == 0) goto L39
            int r0 = r9.A02
            int r8 = r0 + 1
            r9.A02 = r8
            goto La
        L2c:
            r4 = 0
            goto Lb
        L2e:
            java.nio.ByteBuffer r0 = r9.A0L
            if (r0 == 0) goto L3a
            r9.A08(r0, r1)
            java.nio.ByteBuffer r0 = r9.A0L
            if (r0 == 0) goto L3a
        L39:
            return r5
        L3a:
            r9.A02 = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.A09(com.google.android.exoplayer2.audio.DefaultAudioSink):boolean");
    }

    @Override // X.C4UO
    public final void AJC(C4B6 c4b6, int[] iArr, int i) {
        C4UE[] c4ueArr;
        int i2;
        int intValue;
        int intValue2;
        int i3;
        int i4;
        int i5;
        int max;
        int A00;
        long j;
        if ("audio/raw".equals(c4b6.A0W)) {
            int i6 = c4b6.A0C;
            C4B8.A03(Util.A0G(i6));
            int i7 = c4b6.A06;
            i3 = Util.A03(i6, i7);
            c4ueArr = this.A0m;
            C4UU c4uu = this.A0d;
            int i8 = c4b6.A08;
            int i9 = c4b6.A09;
            c4uu.A03 = i8;
            c4uu.A02 = i9;
            C4UJ c4uj = new C4UJ(c4b6.A0G, i7, i6);
            for (C4UE c4ue : c4ueArr) {
                try {
                    C4UJ AJ5 = c4ue.AJ5(c4uj);
                    if (c4ue.isActive()) {
                        c4uj = AJ5;
                    }
                } catch (C4Y9 e) {
                    throw new C4Y7(c4b6, e);
                }
            }
            intValue = c4uj.A02;
            i2 = c4uj.A03;
            int i10 = c4uj.A01;
            intValue2 = Util.A00(i10);
            i4 = Util.A03(intValue, i10);
            i5 = 0;
        } else {
            c4ueArr = new C4UE[0];
            i2 = c4b6.A0G;
            Pair A002 = this.A0a.A00(c4b6);
            if (A002 != null) {
                intValue = ((Number) A002.first).intValue();
                intValue2 = ((Number) A002.second).intValue();
                i3 = -1;
                i4 = -1;
                i5 = 2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to configure passthrough for: ");
                sb.append(c4b6);
                throw new C4Y7(c4b6, sb.toString());
            }
        }
        if (intValue != 0) {
            if (intValue2 != 0) {
                int minBufferSize = AudioTrack.getMinBufferSize(i2, intValue2, intValue);
                boolean z = false;
                if (minBufferSize != -2) {
                    z = true;
                }
                C4B8.A04(z);
                int i11 = 1;
                if (i4 != -1) {
                    i11 = i4;
                }
                int i12 = c4b6.A05;
                if (i5 != 0) {
                    if (i5 != 1) {
                        int i13 = 250000;
                        if (intValue == 5) {
                            i13 = AndroidVideoDecoder.DEQUEUE_INPUT_TIMEOUT_US;
                        }
                        if (i12 != -1) {
                            A00 = AbstractC63123SdR.A01(RoundingMode.CEILING, i12, 8);
                        } else {
                            A00 = C4UL.A00(intValue);
                        }
                        j = i13;
                    } else {
                        A00 = C4UL.A00(intValue);
                        j = 50000000;
                    }
                    max = AbstractC38301qK.A01((j * A00) / 1000000);
                } else {
                    long j2 = i2;
                    long j3 = i11;
                    max = Math.max(AbstractC38301qK.A01(((250000 * j2) * j3) / 1000000), Math.min(minBufferSize * 4, AbstractC38301qK.A01(((750000 * j2) * j3) / 1000000)));
                }
                C129405t2 c129405t2 = new C129405t2(c4b6, c4ueArr, i3, i5, i4, i2, intValue2, intValue, (((Math.max(minBufferSize, (int) (max * 1.0d)) + i11) - 1) / i11) * i11, this.A0U);
                if (this.A0B != null) {
                    this.A0Y = c129405t2;
                    return;
                } else {
                    this.A0H = c129405t2;
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid output channel config (mode=");
            sb2.append(i5);
            sb2.append(") for: ");
            sb2.append(c4b6);
            throw new C4Y7(c4b6, sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid output encoding (mode=");
        sb3.append(i5);
        sb3.append(") for: ");
        sb3.append(c4b6);
        throw new C4Y7(c4b6, sb3.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r15 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        if (r15 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cf, code lost:
    
        if (r15 == false) goto L36;
     */
    @Override // X.C4UO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Auj(boolean r22) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.Auj(boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[RETURN] */
    @Override // X.C4UO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int B81(X.C4B6 r5) {
        /*
            r4 = this;
            java.lang.String r1 = r5.A0W
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            r3 = 0
            r2 = 2
            if (r0 == 0) goto L24
            int r1 = r5.A0C
            boolean r0 = com.google.android.exoplayer2.util.Util.A0G(r1)
            if (r0 != 0) goto L20
            java.lang.String r0 = "Invalid PCM encoding: "
            java.lang.String r1 = X.AnonymousClass001.A0O(r0, r1)
            java.lang.String r0 = "DefaultAudioSink"
            X.AbstractC46512Bo.A04(r0, r1)
        L1f:
            return r3
        L20:
            if (r1 == r2) goto L2c
            r2 = 1
            return r2
        L24:
            X.4UD r0 = r4.A0a
            android.util.Pair r0 = r0.A00(r5)
            if (r0 == 0) goto L1f
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.B81(X.4B6):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0380, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03ce, code lost:
    
        if (r4 != 3) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r31 == r1) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x025f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0474  */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, X.5ln] */
    @Override // X.C4UO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CJT(java.nio.ByteBuffer r31, int r32, long r33) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.CJT(java.nio.ByteBuffer, int, long):boolean");
    }

    @Override // X.C4UO
    public final boolean CLV() {
        if (this.A0B != null) {
            if (A00(this) > C4US.A00(this.A0c)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C4UO
    public final void Eaz(C4TU c4tu) {
        C4TU c4tu2 = C4TU.A03;
        A06(new C4TU(Math.max(0.1f, Math.min(c4tu.A01, 8.0f)), Math.max(0.1f, Math.min(c4tu.A00, 8.0f))), this, A02(this).A03);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.5ln] */
    @Override // X.C4UO
    public final void flush() {
        if (this.A0B != null) {
            this.A08 = 0L;
            this.A07 = 0L;
            this.A0A = 0L;
            this.A09 = 0L;
            this.A0P = false;
            this.A03 = 0;
            this.A0J = new C4UZ(A02(this).A02, 0L, 0L, A02(this).A03);
            this.A06 = 0L;
            this.A0I = null;
            this.A0f.clear();
            this.A0K = null;
            this.A04 = 0;
            this.A0L = null;
            this.A0T = false;
            this.A0O = false;
            this.A02 = -1;
            this.A0d.A04 = 0L;
            int i = 0;
            while (true) {
                C4UE[] c4ueArr = this.A0V;
                if (i >= c4ueArr.length) {
                    break;
                }
                C4UE c4ue = c4ueArr[i];
                c4ue.flush();
                this.A0W[i] = c4ue.BaE();
                i++;
            }
            C4US c4us = this.A0c;
            AudioTrack audioTrack = c4us.A0K;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.A0B.pause();
            }
            AudioTrack audioTrack2 = this.A0B;
            if (Util.A00 >= 29 && audioTrack2.isOffloadedPlayback()) {
                C72848Xp4 c72848Xp4 = this.A0Z;
                c72848Xp4.getClass();
                c72848Xp4.A01(this.A0B);
            }
            final ?? obj = new Object();
            C129405t2 c129405t2 = this.A0Y;
            if (c129405t2 != null) {
                this.A0H = c129405t2;
                this.A0Y = null;
            }
            c4us.A0H = 0L;
            c4us.A04 = 0;
            c4us.A02 = 0;
            c4us.A09 = 0L;
            c4us.A0B = 0L;
            c4us.A0E = 0L;
            c4us.A0Q = false;
            c4us.A0K = null;
            c4us.A0L = null;
            final AudioTrack audioTrack3 = this.A0B;
            final C4UP c4up = this.A0e;
            final InterfaceC96204Ud interfaceC96204Ud = this.A0E;
            c4up.A01();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (A0q) {
                ExecutorService executorService = A0o;
                if (executorService == null) {
                    executorService = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: X.5lo
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
                        }
                    });
                    A0o = executorService;
                }
                A0n++;
                executorService.execute(new Runnable() { // from class: X.5lp
                    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:41:0x0075
                        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                        */
                    @Override // java.lang.Runnable
                    public final void run() {
                        /*
                            r8 = this;
                            com.google.android.exoplayer2.audio.DefaultAudioSink r7 = r5
                            android.media.AudioTrack r0 = r1
                            X.4Ud r5 = r4
                            android.os.Handler r4 = r2
                            X.5ln r3 = r3
                            X.4UP r1 = r6
                            r6 = 0
                            r0.flush()     // Catch: java.lang.Throwable -> L49
                            r0.release()     // Catch: java.lang.Throwable -> L49
                            boolean r0 = r7.A0g
                            if (r0 == 0) goto L2f
                            if (r5 == 0) goto L2f
                            android.os.Looper r0 = r4.getLooper()
                            java.lang.Thread r0 = r0.getThread()
                            boolean r0 = r0.isAlive()
                            if (r0 == 0) goto L2f
                            X.WuM r0 = new X.WuM
                            r0.<init>()
                            r4.post(r0)
                        L2f:
                            r1.A02()
                            java.lang.Object r1 = com.google.android.exoplayer2.audio.DefaultAudioSink.A0q
                            monitor-enter(r1)
                            int r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.A0n     // Catch: java.lang.Throwable -> L46
                            int r0 = r0 + (-1)
                            com.google.android.exoplayer2.audio.DefaultAudioSink.A0n = r0     // Catch: java.lang.Throwable -> L46
                            if (r0 != 0) goto L44
                            java.util.concurrent.ExecutorService r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.A0o     // Catch: java.lang.Throwable -> L46
                            r0.shutdown()     // Catch: java.lang.Throwable -> L46
                            com.google.android.exoplayer2.audio.DefaultAudioSink.A0o = r6     // Catch: java.lang.Throwable -> L46
                        L44:
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
                            return
                        L46:
                            r2 = move-exception
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
                            throw r2
                        L49:
                            r2 = move-exception
                            boolean r0 = r7.A0g
                            if (r0 == 0) goto L66
                            if (r5 == 0) goto L66
                            android.os.Looper r0 = r4.getLooper()
                            java.lang.Thread r0 = r0.getThread()
                            boolean r0 = r0.isAlive()
                            if (r0 == 0) goto L66
                            X.WuM r0 = new X.WuM
                            r0.<init>()
                            r4.post(r0)
                        L66:
                            r1.A02()
                            java.lang.Object r1 = com.google.android.exoplayer2.audio.DefaultAudioSink.A0q
                            monitor-enter(r1)
                            int r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.A0n     // Catch: java.lang.Throwable -> L75
                            int r0 = r0 + (-1)
                            com.google.android.exoplayer2.audio.DefaultAudioSink.A0n = r0     // Catch: java.lang.Throwable -> L75
                            if (r0 != 0) goto L7e
                            goto L77
                        L75:
                            r2 = move-exception
                            goto L7e
                        L77:
                            java.util.concurrent.ExecutorService r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.A0o     // Catch: java.lang.Throwable -> L75
                            r0.shutdown()     // Catch: java.lang.Throwable -> L75
                            com.google.android.exoplayer2.audio.DefaultAudioSink.A0o = r6     // Catch: java.lang.Throwable -> L75
                        L7e:
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L75
                            throw r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC125435lp.run():void");
                    }
                });
            }
            this.A0B = null;
        }
        this.A0k.A00 = null;
        this.A0j.A00 = null;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.4UY] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.4Ua, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.4Ua, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.4UT, X.4UI] */
    public DefaultAudioSink(C4UD c4ud, C4UG c4ug, C4UM c4um) {
        this.A0a = c4ud;
        this.A0b = c4ug;
        this.A0i = c4um;
        C4UP c4up = new C4UP(C2A7.A00);
        this.A0e = c4up;
        c4up.A02();
        this.A0c = new C4US(new C4UQ(this));
        ?? c4ui = new C4UI();
        this.A0h = c4ui;
        C4UU c4uu = new C4UU();
        this.A0d = c4uu;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C4UI(), c4ui, c4uu);
        Collections.addAll(arrayList, ((C4UF) c4ug).A02);
        this.A0m = (C4UE[]) arrayList.toArray(new C4UE[0]);
        this.A0l = new C4UE[]{new C4UI()};
        this.A00 = 1.0f;
        this.A0D = C4UX.A02;
        this.A01 = 0;
        this.A0F = new Object();
        C4TU c4tu = C4TU.A03;
        this.A0J = new C4UZ(c4tu, 0L, 0L, false);
        this.A0X = c4tu;
        this.A02 = -1;
        this.A0V = new C4UE[0];
        this.A0W = new ByteBuffer[0];
        this.A0f = new ArrayDeque();
        this.A0j = new Object();
        this.A0k = new Object();
        this.A0g = C2C5.A02(C2C1.A05);
    }

    public static void A06(C4TU c4tu, DefaultAudioSink defaultAudioSink, boolean z) {
        C4UZ A02 = A02(defaultAudioSink);
        if (!c4tu.equals(A02.A02) || z != A02.A03) {
            C4UZ c4uz = new C4UZ(c4tu, -9223372036854775807L, -9223372036854775807L, z);
            if (defaultAudioSink.A0B != null) {
                defaultAudioSink.A0I = c4uz;
            } else {
                defaultAudioSink.A0J = c4uz;
            }
        }
    }

    @Override // X.C4UO
    public final void reset() {
        flush();
        for (C4UE c4ue : this.A0m) {
            c4ue.reset();
        }
        for (C4UE c4ue2 : this.A0l) {
            c4ue2.reset();
        }
        this.A0Q = false;
    }
}
