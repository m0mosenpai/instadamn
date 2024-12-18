package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC96034Tm extends AbstractC96044Tn {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public MediaFormat A07;
    public C4B6 A08;
    public C98154au A09;
    public C5T9 A0A;
    public InterfaceC53292cD A0B;
    public C2IG A0C;
    public C4Y6 A0D;
    public C96134Tw A0E;
    public ByteBuffer A0F;
    public ArrayDeque A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public long A0R;
    public C5T9 A0S;
    public String A0T;
    public boolean A0U;
    public final MediaCodec.BufferInfo A0V;
    public final C96014Tk A0W;
    public final C2VQ A0X;
    public final C96084Tr A0Y;
    public final C96094Ts A0Z;
    public final C4BL A0a;
    public final List A0b;
    public final boolean A0c;
    public final C96094Ts A0d;
    public final C4XR A0e;
    public final ArrayDeque A0f;
    public final boolean A0g;
    public final boolean A0h;

    private void A0A() {
        this.A02 = -1;
        this.A0Z.A02 = null;
    }

    @Override // X.AbstractC96044Tn
    public void A0I() {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC96044Tn
    public void A0K() {
        this.A08 = null;
        this.A0E = C96134Tw.A01;
        this.A0f.clear();
        this.A0G = null;
        try {
            A0R();
            try {
                C5T9 c5t9 = this.A0A;
                if (c5t9 != null) {
                    c5t9.EE2(null);
                }
                try {
                    C5T9 c5t92 = this.A0S;
                    if (c5t92 != null && c5t92 != this.A0A) {
                        c5t92.EE2(null);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    C5T9 c5t93 = this.A0S;
                    if (c5t93 != null && c5t93 != this.A0A) {
                        c5t93.EE2(null);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                C5T9 c5t94 = this.A0A;
                if (c5t94 != null) {
                    c5t94.EE2(null);
                }
                try {
                    C5T9 c5t95 = this.A0S;
                    if (c5t95 != null && c5t95 != this.A0A) {
                        c5t95.EE2(null);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    C5T9 c5t96 = this.A0S;
                    if (c5t96 != null && c5t96 != this.A0A) {
                        c5t96.EE2(null);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // X.AbstractC96044Tn
    public void A0L(long j, boolean z) {
        this.A0I = false;
        this.A0L = false;
        if (this.A0B != null) {
            A0Q();
        }
        synchronized (this.A0E.A00) {
        }
        this.A0E.A00.A00();
        this.A0f.clear();
    }

    @Override // X.AbstractC96044Tn
    public void A0N(C4B6[] c4b6Arr, long j, long j2) {
    }

    public void A0T(long j) {
    }

    public void A0U(C4B6 c4b6) {
        DrmInitData drmInitData;
        int i;
        int A00;
        boolean z = this instanceof C96024Tl;
        if (z) {
            C96024Tl c96024Tl = (C96024Tl) this;
            if (c96024Tl.A0W(c4b6) || ((A00 = C2C5.A00(C2C6.A07)) > 0 && c4b6 != null && c4b6.A0L > A00)) {
                c96024Tl.A0f.A02 = false;
            }
        }
        C4B6 c4b62 = this.A08;
        this.A08 = c4b6;
        DrmInitData drmInitData2 = c4b6.A0O;
        if (c4b62 == null) {
            drmInitData = null;
        } else {
            drmInitData = c4b62.A0O;
        }
        if (!Util.A0I(drmInitData2, drmInitData)) {
            C4B6 c4b63 = this.A08;
            if (c4b63.A0O != null) {
                C4XR c4xr = this.A0e;
                if (c4xr != null) {
                    C5T9 A7O = c4xr.A7O(c4b63, null);
                    this.A0S = A7O;
                    if (A7O == this.A0A) {
                        A7O.EE2(null);
                    }
                } else {
                    throw A0F(c4b63, new IllegalStateException("Media requires a DrmSessionManager"), 4005, false);
                }
            } else {
                this.A0S = null;
            }
        }
        if (this.A0S == this.A0A && this.A0B != null) {
            C2IG c2ig = this.A0C;
            C4B6 c4b64 = this.A08;
            if (z) {
                C96024Tl c96024Tl2 = (C96024Tl) this;
                if (c96024Tl2.A0W(((AbstractC96034Tm) c96024Tl2).A08) && c4b62.A0W.equals(c4b64.A0W) && c4b62.A0F == c4b64.A0F) {
                    return;
                }
                if (C96024Tl.A06(c4b62, c4b64, c2ig.A04)) {
                    int i2 = c4b64.A0L;
                    C98574bb c98574bb = c96024Tl2.A0P;
                    if (i2 <= c98574bb.A02 && c4b64.A0A <= c98574bb.A00 && C96024Tl.A00(c4b64) <= c96024Tl2.A0P.A01) {
                        if (c4b62.A00(c4b64)) {
                            return;
                        }
                        this.A0U = true;
                        this.A00 = 1;
                        return;
                    }
                }
            } else {
                C4UB c4ub = (C4UB) this;
                if (c4ub.A0X.A0B && c4b64.A0B <= c4ub.A00 && (((i = c2ig.A05(c4b62, c4b64).A01) == 2 || i == 3) && c4b62.A08 == 0 && c4b62.A09 == 0 && c4b64.A08 == 0 && c4b64.A09 == 0)) {
                    return;
                }
            }
        }
        this.A0G = null;
        if (this.A0H) {
            this.A01 = 1;
        } else {
            A0R();
            A0S();
        }
    }

    public abstract void A0V(C96094Ts c96094Ts);

    public final boolean A0W(C4B6 c4b6) {
        return c4b6 != null && this.A0O && "video/av01".equalsIgnoreCase(c4b6.A0W);
    }

    private void A09() {
        if (this.A01 == 2) {
            A0R();
            A0S();
        } else {
            this.A0L = true;
            A0P();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x021c, code lost:
    
        if ("audio/raw".equals(r11.A0W) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if (r3.A0A == (-1)) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a1 A[Catch: Exception -> 0x0301, TryCatch #0 {Exception -> 0x0301, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0013, B:8:0x001f, B:13:0x0048, B:14:0x0039, B:15:0x004f, B:18:0x005f, B:20:0x007e, B:24:0x009b, B:26:0x00a5, B:28:0x00aa, B:30:0x00b2, B:32:0x00c6, B:37:0x00cb, B:40:0x01c7, B:41:0x01d2, B:46:0x00f5, B:53:0x0109, B:48:0x01c0, B:57:0x0130, B:59:0x0160, B:60:0x0163, B:62:0x016a, B:63:0x016d, B:65:0x0186, B:66:0x0189, B:68:0x0195, B:70:0x01a0, B:71:0x01a8, B:72:0x01aa, B:74:0x01b4, B:76:0x01b8, B:79:0x01e8, B:81:0x01f0, B:89:0x0288, B:90:0x028e, B:92:0x02a1, B:93:0x02aa, B:109:0x01ff, B:111:0x0215, B:113:0x021f, B:115:0x0245, B:116:0x0248, B:118:0x0252, B:120:0x025a, B:122:0x0260, B:123:0x026d, B:125:0x027d, B:126:0x0285, B:129:0x0024, B:131:0x002b), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0B(android.media.MediaCrypto r32, X.C2IG r33) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC96034Tm.A0B(android.media.MediaCrypto, X.2IG):void");
    }

    private boolean A0C(int i) {
        C96084Tr c96084Tr = super.A0C;
        c96084Tr.A01 = null;
        c96084Tr.A00 = null;
        C96094Ts c96094Ts = this.A0d;
        c96094Ts.clear();
        int A0E = A0E(c96084Tr, c96094Ts, i | 4);
        if (A0E == -5) {
            A0U(c96084Tr.A00);
            return true;
        }
        if (A0E == -4 && (((AbstractC96104Tt) c96094Ts).A00 & 4) == 4) {
            this.A0I = true;
            A09();
            return false;
        }
        return false;
    }

    @Override // X.AbstractC96044Tn
    public void A0J() {
        if (this.A0g) {
            A0R();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4au] */
    @Override // X.AbstractC96044Tn
    public void A0M(boolean z, boolean z2) {
        this.A09 = new Object();
        this.A06 = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r2 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A0O(X.C4B6 r5, X.C4BL r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C4UB
            if (r0 == 0) goto L28
            r3 = r4
            X.4UB r3 = (X.C4UB) r3
            java.lang.String r2 = r5.A0W
            if (r2 == 0) goto L2c
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L31
            X.4UO r0 = r3.A0A
            com.google.android.exoplayer2.audio.DefaultAudioSink r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r0
            int r0 = r0.B81(r5)
            if (r0 == 0) goto L31
            X.2IG r0 = X.C46762Co.A01(r1)
            if (r0 == 0) goto L31
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L28:
            java.lang.String r2 = r5.A0W
            if (r2 != 0) goto L31
        L2c:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L31:
            r0 = 0
            java.util.List r0 = r6.Aw3(r2, r7, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC96034Tm.A0O(X.4B6, X.4BL, boolean):java.util.List");
    }

    public final void A0P() {
        if (this instanceof C4UB) {
            C4UB c4ub = (C4UB) this;
            try {
                DefaultAudioSink defaultAudioSink = (DefaultAudioSink) c4ub.A0A;
                if (!defaultAudioSink.A0O && defaultAudioSink.A0B != null && DefaultAudioSink.A09(defaultAudioSink)) {
                    DefaultAudioSink.A07(defaultAudioSink);
                    defaultAudioSink.A0O = true;
                }
            } catch (C4Y5 e) {
                throw c4ub.A0F(e.A00, e, 5002, e.A01);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd A[Catch: 4Y6 -> 0x01ee, TryCatch #3 {4Y6 -> 0x01ee, blocks: (B:17:0x0030, B:74:0x0035, B:77:0x0045, B:79:0x0051, B:80:0x0078, B:82:0x007e, B:84:0x0082, B:86:0x008a, B:88:0x009a, B:91:0x00a1, B:93:0x00a5, B:94:0x00aa, B:96:0x00af, B:19:0x00c9, B:21:0x00cd, B:23:0x00d5, B:24:0x00e6, B:26:0x00ee, B:27:0x00f4, B:29:0x0101, B:31:0x0107, B:33:0x010b, B:35:0x0111, B:40:0x0117, B:50:0x011f, B:42:0x0134, B:54:0x0128, B:55:0x0129, B:57:0x013a, B:59:0x0178, B:60:0x017f, B:62:0x018c, B:63:0x018e, B:66:0x0196, B:72:0x01ed, B:69:0x0199, B:71:0x01e3, B:98:0x00be, B:99:0x00c8), top: B:16:0x0030, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee A[Catch: 4Y6 -> 0x01ee, TryCatch #3 {4Y6 -> 0x01ee, blocks: (B:17:0x0030, B:74:0x0035, B:77:0x0045, B:79:0x0051, B:80:0x0078, B:82:0x007e, B:84:0x0082, B:86:0x008a, B:88:0x009a, B:91:0x00a1, B:93:0x00a5, B:94:0x00aa, B:96:0x00af, B:19:0x00c9, B:21:0x00cd, B:23:0x00d5, B:24:0x00e6, B:26:0x00ee, B:27:0x00f4, B:29:0x0101, B:31:0x0107, B:33:0x010b, B:35:0x0111, B:40:0x0117, B:50:0x011f, B:42:0x0134, B:54:0x0128, B:55:0x0129, B:57:0x013a, B:59:0x0178, B:60:0x017f, B:62:0x018c, B:63:0x018e, B:66:0x0196, B:72:0x01ed, B:69:0x0199, B:71:0x01e3, B:98:0x00be, B:99:0x00c8), top: B:16:0x0030, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3 A[Catch: 4Y6 -> 0x01ee, TRY_ENTER, TryCatch #3 {4Y6 -> 0x01ee, blocks: (B:17:0x0030, B:74:0x0035, B:77:0x0045, B:79:0x0051, B:80:0x0078, B:82:0x007e, B:84:0x0082, B:86:0x008a, B:88:0x009a, B:91:0x00a1, B:93:0x00a5, B:94:0x00aa, B:96:0x00af, B:19:0x00c9, B:21:0x00cd, B:23:0x00d5, B:24:0x00e6, B:26:0x00ee, B:27:0x00f4, B:29:0x0101, B:31:0x0107, B:33:0x010b, B:35:0x0111, B:40:0x0117, B:50:0x011f, B:42:0x0134, B:54:0x0128, B:55:0x0129, B:57:0x013a, B:59:0x0178, B:60:0x017f, B:62:0x018c, B:63:0x018e, B:66:0x0196, B:72:0x01ed, B:69:0x0199, B:71:0x01e3, B:98:0x00be, B:99:0x00c8), top: B:16:0x0030, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0S() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC96034Tm.A0S():void");
    }

    @Override // X.InterfaceC96054To
    public boolean CbZ() {
        Integer num;
        if (this.A08 == null) {
            num = C05F.A01;
        } else if (this.A0Q) {
            num = C05F.A0C;
        } else {
            if (!A0G() && this.A03 < 0) {
                num = C05F.A0N;
            }
            if (this.A08 == null && !this.A0Q) {
                if (!A0G() && this.A03 < 0) {
                    long j = this.A0R;
                    if (j != -9223372036854775807L && SystemClock.elapsedRealtime() < j) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
        }
        super.A06 = num;
        return this.A08 == null ? false : false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x02a9, code lost:
    
        if (r1 != false) goto L164;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:306:0x0260. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04da A[Catch: all -> 0x05ee, TryCatch #7 {all -> 0x05ee, blocks: (B:222:0x04a5, B:223:0x04cb, B:226:0x04dd, B:228:0x04da, B:262:0x047e), top: B:221:0x04a5 }] */
    @Override // X.InterfaceC96054To
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EGW(long r29, long r31) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC96034Tm.EGW(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r3 == 2) goto L11;
     */
    @Override // X.InterfaceC96074Tq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int EpR(X.C4B6 r12) {
        /*
            r11 = this;
            X.4BL r1 = r11.A0a     // Catch: X.C40J -> Lb0
            r5 = r11
            boolean r0 = r11 instanceof X.C4UB     // Catch: X.C40J -> Lb0
            if (r0 == 0) goto La0
            X.4UB r5 = (X.C4UB) r5     // Catch: X.C40J -> Lb0
            java.lang.String r6 = r12.A0W     // Catch: X.C40J -> Lb0
            boolean r0 = X.C2IH.A04(r6)     // Catch: X.C40J -> Lb0
            r2 = 0
            if (r0 != 0) goto L13
            goto L63
        L13:
            int r3 = r12.A07     // Catch: X.C40J -> Lb0
            if (r3 == 0) goto L1b
            r0 = 2
            r10 = 0
            if (r3 != r0) goto L1c
        L1b:
            r10 = 1
        L1c:
            r9 = 4
            r3 = 8
            if (r10 == 0) goto L3c
            java.lang.String r4 = "audio/raw"
            boolean r0 = r4.equals(r6)     // Catch: X.C40J -> Lb0
            if (r0 != 0) goto L3c
            X.4UO r0 = r5.A0A     // Catch: X.C40J -> Lb0
            com.google.android.exoplayer2.audio.DefaultAudioSink r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r0     // Catch: X.C40J -> Lb0
            int r0 = r0.B81(r12)     // Catch: X.C40J -> Lb0
            if (r0 == 0) goto L3c
            X.2IG r0 = X.C46762Co.A01(r4)     // Catch: X.C40J -> Lb0
            if (r0 == 0) goto L3c
            r8 = 44
            return r8
        L3c:
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r6)     // Catch: X.C40J -> Lb0
            r8 = 1
            if (r0 == 0) goto L65
            X.4UO r7 = r5.A0A     // Catch: X.C40J -> Lb0
            int r6 = r12.A06     // Catch: X.C40J -> Lb0
            int r4 = r12.A0C     // Catch: X.C40J -> Lb0
            com.google.android.exoplayer2.audio.DefaultAudioSink r7 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r7     // Catch: X.C40J -> Lb0
            boolean r0 = com.google.android.exoplayer2.util.Util.A0G(r4)     // Catch: X.C40J -> Lb0
            if (r0 != 0) goto L65
            X.4UD r0 = r7.A0a     // Catch: X.C40J -> Lb0
            int[] r0 = r0.A00     // Catch: X.C40J -> Lb0
            int r0 = java.util.Arrays.binarySearch(r0, r4)     // Catch: X.C40J -> Lb0
            if (r0 < 0) goto L64
            r0 = -1
            if (r6 == r0) goto L65
            if (r6 > r3) goto L64
            goto L65
        L63:
            r8 = 0
        L64:
            return r8
        L65:
            int r4 = r12.A06     // Catch: X.C40J -> Lb0
            java.util.List r1 = r5.A0O(r12, r1, r2)     // Catch: X.C40J -> Lb0
            boolean r0 = r1.isEmpty()     // Catch: X.C40J -> Lb0
            if (r0 == 0) goto L74
            r8 = 129(0x81, float:1.81E-43)
            return r8
        L74:
            if (r10 != 0) goto L79
            r8 = 130(0x82, float:1.82E-43)
            return r8
        L79:
            java.lang.Object r2 = r1.get(r2)     // Catch: X.C40J -> Lb0
            X.2IG r2 = (X.C2IG) r2     // Catch: X.C40J -> Lb0
            int r0 = r12.A0G     // Catch: X.C40J -> Lb0
            r1 = -1
            if (r0 == r1) goto L8a
            boolean r0 = r2.A07(r0)     // Catch: X.C40J -> Lb0
            if (r0 == 0) goto L9b
        L8a:
            if (r4 == r1) goto L92
            boolean r0 = r2.A06(r4)     // Catch: X.C40J -> Lb0
            if (r0 == 0) goto L9b
        L92:
            boolean r0 = r2.A0A(r12)     // Catch: X.C40J -> Lb0
            if (r0 == 0) goto L9c
            r3 = 16
            goto L9c
        L9b:
            r9 = 3
        L9c:
            r8 = r3 | 32
            r8 = r8 | r9
            return r8
        La0:
            boolean r0 = r11.A0W(r12)     // Catch: X.C40J -> Lb0
            if (r0 == 0) goto La9
            r8 = 20
            return r8
        La9:
            boolean r0 = r11.A0N     // Catch: X.C40J -> Lb0
            int r8 = X.C96024Tl.A01(r12, r1, r0)     // Catch: X.C40J -> Lb0
            return r8
        Lb0:
            r2 = move-exception
            r1 = 4002(0xfa2, float:5.608E-42)
            r0 = 0
            X.4Y3 r0 = r11.A0F(r12, r2, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC96034Tm.EpR(X.4B6):int");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.4Tr, java.lang.Object] */
    public AbstractC96034Tm(C96014Tk c96014Tk, C2VQ c2vq, C4XR c4xr, C4BL c4bl, int i, boolean z) {
        super(i);
        this.A0O = false;
        this.A0K = false;
        c2vq.getClass();
        this.A0X = c2vq;
        this.A0W = c96014Tk;
        this.A0a = c4bl;
        this.A0e = c4xr;
        this.A0c = z;
        this.A0Z = new C96094Ts(0);
        this.A0d = new C96094Ts(0);
        this.A0Y = new Object();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A0f = new ArrayDeque();
        this.A0E = C96134Tw.A01;
        this.A00 = 0;
        this.A01 = 0;
        this.A04 = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        this.A0g = C2C5.A02(C2C1.A1P);
        this.A0h = C2C5.A02(C2C1.A1C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r1.A0K) < 500) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0Q() {
        /*
            r7 = this;
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0R = r1
            r7.A0A()
            r0 = -1
            r7.A03 = r0
            r0 = 0
            r7.A0F = r0
            r5 = 1
            r7.A0P = r5
            r6 = 0
            r7.A0Q = r6
            r7.A0M = r6
            java.util.List r0 = r7.A0b
            r0.clear()
            r7.A0J = r6
            r7.A05 = r1
            r1 = r7
            boolean r0 = r7 instanceof X.C96024Tl
            if (r0 == 0) goto L39
            X.4Tl r1 = (X.C96024Tl) r1
            boolean r0 = r1.A0U
            if (r0 == 0) goto L39
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.A0K
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L4f
        L39:
            int r0 = r7.A01
            if (r0 != 0) goto L4f
            X.2cD r0 = r7.A0B
            r0.flush()
            r7.A0H = r6
        L44:
            boolean r0 = r7.A0U
            if (r0 == 0) goto L4e
            X.4B6 r0 = r7.A08
            if (r0 == 0) goto L4e
            r7.A00 = r5
        L4e:
            return
        L4f:
            r7.A0R()
            r7.A0S()
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC96034Tm.A0Q():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0R() {
        boolean z;
        this.A0R = -9223372036854775807L;
        A0A();
        this.A03 = -1;
        this.A0F = null;
        this.A07 = null;
        this.A0Q = false;
        this.A0M = false;
        this.A0b.clear();
        this.A0C = null;
        this.A0U = false;
        this.A0H = false;
        this.A00 = 0;
        this.A01 = 0;
        InterfaceC53292cD interfaceC53292cD = this.A0B;
        if (interfaceC53292cD != null) {
            this.A09.A03++;
            try {
                C2VR c2vr = C2VR.A05;
                if (this instanceof C96024Tl) {
                    z = true;
                } else {
                    z = false;
                }
                c2vr.A02(this.A0W.A00, this.A0X, interfaceC53292cD, C05F.A01, this.A0T, z);
                this.A0B = null;
                C5T9 c5t9 = this.A0A;
                if (c5t9 != null && this.A0S != c5t9) {
                    try {
                        c5t9.EE2(null);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                this.A0B = null;
                C5T9 c5t92 = this.A0A;
                if (c5t92 != null && this.A0S != c5t92) {
                    try {
                        c5t92.EE2(null);
                    } finally {
                    }
                }
                throw th;
            }
        }
    }
}
