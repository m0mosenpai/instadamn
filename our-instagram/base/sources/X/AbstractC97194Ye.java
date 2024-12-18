package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import com.facebook.common.dextricks.Constants;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: X.4Ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97194Ye extends AbstractC96044Tn {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public MediaFormat A09;
    public C4Y3 A0A;
    public C4B6 A0B;
    public C4B6 A0C;
    public C4B6 A0D;
    public C98154au A0E;
    public C5T9 A0F;
    public C72765Xmh A0G;
    public InterfaceC53292cD A0H;
    public C2IG A0I;
    public C117395Sy A0J;
    public C5T0 A0K;
    public ByteBuffer A0L;
    public ArrayDeque A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public float A0e;
    public float A0f;
    public long A0g;
    public long A0h;
    public MediaCrypto A0i;
    public C5T9 A0j;
    public Object A0k;
    public String A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public final MediaCodec.BufferInfo A0s;
    public final C2VQ A0t;
    public final C96094Ts A0u;
    public final C96094Ts A0v;
    public final C117405Sz A0w;
    public final C4BL A0x;
    public final ArrayDeque A0y;
    public final ArrayList A0z;
    public final boolean A10;
    public final float A11;
    public final C96094Ts A12;
    public final InterfaceC117375Sw A13;
    public final C96014Tk A14;
    public final boolean A15;

    private void A00() {
        this.A0N = false;
        this.A0w.clear();
        this.A0v.clear();
        this.A0P = false;
        this.A0O = false;
    }

    private boolean A09(C4B6 c4b6) {
        if (this.A0H == null || this.A01 == 3 || super.A01 == 0) {
            return true;
        }
        float f = this.A0f;
        C4B6[] c4b6Arr = super.A08;
        c4b6Arr.getClass();
        float A0O = A0O(c4b6, c4b6Arr, f);
        float f2 = this.A0e;
        if (f2 == A0O) {
            return true;
        }
        if (A0O == -1.0f) {
            A01();
            return false;
        }
        if (f2 == -1.0f && A0O <= this.A11) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat(AbstractC111324zv.A00(492), A0O);
        this.A0H.setParameters(bundle);
        this.A0e = A0O;
        return true;
    }

    @Override // X.AbstractC96044Tn
    public void A0I() {
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC96044Tn
    public void A0J() {
        try {
            A00();
            A0Z();
        } finally {
            C5T9 c5t9 = this.A0F;
            if (c5t9 != null) {
                c5t9.EE2(null);
            }
            this.A0F = null;
        }
    }

    @Override // X.AbstractC96044Tn
    public void A0K() {
        this.A0C = null;
        A07(C5T0.A03);
        this.A0y.clear();
        if (this.A0r) {
            A0J();
        } else {
            A0p();
        }
    }

    @Override // X.AbstractC96044Tn
    public void A0L(long j, boolean z) {
        int i;
        this.A0U = false;
        this.A0Z = false;
        this.A0a = false;
        if (this.A0O) {
            this.A0w.clear();
            this.A0v.clear();
            this.A0P = false;
        } else if (A0p()) {
            A0Y();
        }
        C96144Tx c96144Tx = this.A0K.A02;
        synchronized (c96144Tx) {
            i = c96144Tx.A01;
        }
        if (i > 0) {
            this.A0d = true;
        }
        this.A0K.A02.A00();
        this.A0y.clear();
    }

    public float A0O(C4B6 c4b6, C4B6[] c4b6Arr, float f) {
        int i = -1;
        for (C4B6 c4b62 : c4b6Arr) {
            int i2 = c4b62.A0G;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3 == 2) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A0P(X.C4B6 r12, X.C4BL r13) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97194Ye.A0P(X.4B6, X.4BL):int");
    }

    public C5TF A0Q(C4B6 c4b6, C4B6 c4b62, C2IG c2ig) {
        int i;
        String str;
        int i2;
        C98174aw c98174aw = (C98174aw) this;
        if (C2C5.A02(C2C1.A0L) && !c98174aw.A0t.A0B) {
            str = c2ig.A03;
            i2 = 0;
            i = 4;
        } else {
            C5TF A05 = c2ig.A05(c4b6, c4b62);
            i = A05.A00;
            if (c4b62.A0B > c98174aw.A00) {
                i |= 64;
            }
            if (C2C5.A02(C2C1.A0J) && (c4b6.A08 != 0 || c4b6.A09 != 0 || c4b62.A08 != 0 || c4b62.A09 != 0)) {
                i |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            str = c2ig.A03;
            if (i != 0) {
                i2 = 0;
            } else {
                i2 = A05.A01;
            }
        }
        return new C5TF(c4b6, c4b62, str, i2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        if ("audio/raw".equals(r15.A0W) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C5TH A0S(android.media.MediaCrypto r14, X.C4B6 r15, X.C2IG r16, float r17) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97194Ye.A0S(android.media.MediaCrypto, X.4B6, X.2IG, float):X.5TH");
    }

    public ArrayList A0U(C4B6 c4b6, C4BL c4bl, boolean z) {
        return C46762Co.A04(c4b6, C98174aw.A00(c4b6, ((C98174aw) this).A0A, c4bl, z));
    }

    public void A0V() {
        ((DefaultAudioSink) ((C98174aw) this).A0A).A0S = true;
    }

    public void A0X() {
        this.A04 = -1;
        this.A0u.A02 = null;
        this.A05 = -1;
        this.A0L = null;
        this.A0g = -9223372036854775807L;
        this.A0T = false;
        this.A0V = false;
        this.A0W = false;
        this.A0z.clear();
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A0h = -9223372036854775807L;
        C72765Xmh c72765Xmh = this.A0G;
        if (c72765Xmh != null) {
            c72765Xmh.A00 = 0L;
            c72765Xmh.A01 = 0L;
            c72765Xmh.A02 = false;
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = this.A0n ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0Z() {
        try {
            InterfaceC53292cD interfaceC53292cD = this.A0H;
            if (interfaceC53292cD != null) {
                if (this.A0q) {
                    C2VR.A05.A02(this.A14.A00, this.A0t, interfaceC53292cD, C05F.A01, this.A0l, A0n());
                } else {
                    interfaceC53292cD.release();
                }
                this.A0E.A03++;
                A0m(this.A0I.A03);
            }
            this.A0H = null;
            this.A0l = null;
            try {
                MediaCrypto mediaCrypto = this.A0i;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.A0H = null;
            this.A0l = null;
            try {
                MediaCrypto mediaCrypto2 = this.A0i;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void A0d(MediaFormat mediaFormat, C4B6 c4b6) {
        int i;
        C98174aw c98174aw = (C98174aw) this;
        C4B6 c4b62 = c98174aw.A01;
        try {
            if (c4b62 == null) {
                if (c98174aw.A0H != null) {
                    if ("audio/raw".equals(c4b6.A0W)) {
                        i = c4b6.A0C;
                    } else if (mediaFormat.containsKey("pcm-encoding")) {
                        i = mediaFormat.getInteger("pcm-encoding");
                    } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                        i = Util.A02(mediaFormat.getInteger("v-bits-per-sample"));
                    } else {
                        i = 2;
                    }
                    C4B3 c4b3 = new C4B3();
                    c4b3.A0U = "audio/raw";
                    c4b3.A0A = i;
                    c4b3.A04 = mediaFormat.getInteger("channel-count");
                    c4b3.A0E = mediaFormat.getInteger("sample-rate");
                    if (!C2C5.A02(C2C1.A0A)) {
                        c4b3.A06 = c4b6.A08;
                        c4b3.A07 = c4b6.A09;
                    }
                    c4b62 = new C4B6(c4b3);
                }
                c98174aw.A0A.AJC(c4b6, null, 0);
                return;
            }
            c98174aw.A0A.AJC(c4b6, null, 0);
            return;
        } catch (C4Y7 e) {
            throw c98174aw.A0F(e.A00, e, 5001, false);
        }
        c4b6 = c4b62;
    }

    public void A0e(C4B6 c4b6) {
    }

    public void A0f(C4B6 c4b6) {
    }

    public void A0h(C96094Ts c96094Ts) {
    }

    public abstract void A0i(C96094Ts c96094Ts);

    public void A0j(C5TH c5th, String str, long j, long j2) {
        C96184Ub c96184Ub = ((C98174aw) this).A09;
        c96184Ub.A00.post(new RunnableC127555pY(c96184Ub, str, j2));
    }

    public void A0k(final Exception exc) {
        AbstractC46512Bo.A05("MediaCodecAudioRenderer2", "Audio codec error", exc);
        final C96184Ub c96184Ub = ((C98174aw) this).A09;
        c96184Ub.A00.post(new Runnable() { // from class: X.WuJ
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    public void A0l(String str) {
        C96184Ub c96184Ub = ((C98174aw) this).A09;
        c96184Ub.A00.post(new RunnableC127545pX(c96184Ub, str));
    }

    public void A0m(String str) {
        final C96184Ub c96184Ub = ((C98174aw) this).A09;
        c96184Ub.A00.post(new Runnable() { // from class: X.WrJ
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    public boolean A0o() {
        return false;
    }

    public final boolean A0q(C4B6 c4b6) {
        return c4b6 != null && this.A0c && "video/av01".equalsIgnoreCase(c4b6.A0W);
    }

    public boolean A0r(C4B6 c4b6, InterfaceC53292cD interfaceC53292cD, ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2, long j3, boolean z, boolean z2) {
        C98174aw c98174aw = (C98174aw) this;
        byteBuffer.getClass();
        if (c98174aw.A01 != null && (i2 & 2) != 0) {
            interfaceC53292cD.getClass();
            interfaceC53292cD.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            if (interfaceC53292cD != null) {
                interfaceC53292cD.releaseOutputBuffer(i, false);
            }
            c98174aw.A0E.A0B += i3;
            ((DefaultAudioSink) c98174aw.A0A).A0S = true;
            return true;
        }
        if (c98174aw.A0B && byteBuffer.limit() > byteBuffer.position()) {
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            ByteBuffer allocate = ByteBuffer.allocate(limit - position);
            allocate.put(byteBuffer);
            allocate.flip();
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            C96184Ub c96184Ub = c98174aw.A09;
            c96184Ub.A00.post(new RunnableC71552Ww1(c96184Ub, allocate.array(), j3 / 1000));
        }
        try {
            if (c98174aw.A0A.CJT(byteBuffer, i3, j3)) {
                if (interfaceC53292cD != null) {
                    interfaceC53292cD.releaseOutputBuffer(i, false);
                }
                c98174aw.A0E.A09 += i3;
                return true;
            }
            return false;
        } catch (C4Y5 e) {
            throw c98174aw.A0F(c4b6, e, 5002, e.A01);
        } catch (C4Y8 e2) {
            throw c98174aw.A0F(c98174aw.A02, e2, 5001, e2.A01);
        }
    }

    public boolean A0s(C2IG c2ig) {
        return true;
    }

    private void A01() {
        if (this.A0T) {
            this.A02 = 1;
            this.A01 = 3;
        } else {
            A0Z();
            A0Y();
        }
    }

    private void A02() {
        try {
            this.A0H.flush();
        } finally {
            A0X();
        }
    }

    private void A03() {
        int i = this.A01;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.A0Z = true;
                    A0W();
                    return;
                } else {
                    A0Z();
                    A0Y();
                    return;
                }
            }
            A02();
            A04();
            return;
        }
        A02();
    }

    private void A04() {
        InterfaceC71856X7o AtS = this.A0F.AtS();
        if (AtS instanceof WbV) {
            try {
                this.A0i.setMediaDrmSession(((WbV) AtS).A02);
            } catch (MediaCryptoException e) {
                throw A0F(this.A0C, e, 6006, false);
            }
        }
        A06(this.A0F);
        this.A02 = 0;
        this.A01 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0145, code lost:
    
        if ("c2.android.aac.decoder".equals(r5) == false) goto L38;
     */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.Xmh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [X.2cD, X.5TJ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(android.media.MediaCrypto r27, X.C2IG r28) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97194Ye.A05(android.media.MediaCrypto, X.2IG):void");
    }

    private void A06(C5T9 c5t9) {
        C5T9 c5t92 = this.A0j;
        if (c5t92 != c5t9) {
            if (c5t9 != null) {
                c5t9.A7J(null);
            }
            if (c5t92 != null) {
                c5t92.EE2(null);
            }
        }
        this.A0j = c5t9;
    }

    private void A07(C5T0 c5t0) {
        this.A0K = c5t0;
        if (c5t0.A01 != -9223372036854775807L) {
            this.A0p = true;
        }
    }

    private boolean A08(int i) {
        C96084Tr c96084Tr = super.A0C;
        c96084Tr.A01 = null;
        c96084Tr.A00 = null;
        C96094Ts c96094Ts = this.A12;
        c96094Ts.clear();
        int A0E = A0E(c96084Tr, c96094Ts, i | 4);
        if (A0E == -5) {
            A0R(c96084Tr);
            return true;
        }
        if (A0E == -4 && (((AbstractC96104Tt) c96094Ts).A00 & 4) == 4) {
            this.A0U = true;
            A03();
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4au] */
    @Override // X.AbstractC96044Tn
    public void A0M(boolean z, boolean z2) {
        this.A0E = new Object();
        this.A08 = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r1 >= r5) goto L14;
     */
    @Override // X.AbstractC96044Tn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0N(X.C4B6[] r9, long r10, long r12) {
        /*
            r8 = this;
            X.5T0 r0 = r8.A0K
            long r1 = r0.A01
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L16
            X.5T0 r0 = new X.5T0
            r0.<init>(r3, r12)
            r8.A07(r0)
        L15:
            return
        L16:
            java.util.ArrayDeque r7 = r8.A0y
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L42
            long r5 = r8.A06
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r1 = r8.A0h
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L42
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L42
        L2e:
            X.5T0 r0 = new X.5T0
            r0.<init>(r3, r12)
            r8.A07(r0)
            X.5T0 r0 = r8.A0K
            long r1 = r0.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L15
            r8.A0V()
            return
        L42:
            long r1 = r8.A06
            X.5T0 r0 = new X.5T0
            r0.<init>(r1, r12)
            r7.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97194Ye.A0N(X.4B6[], long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r1 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        if (A09(r10) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ed, code lost:
    
        if (r7 != false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C5TF A0R(X.C96084Tr r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97194Ye.A0R(X.4Tr):X.5TF");
    }

    public RF5 A0T(C2IG c2ig, Throwable th) {
        return new RF5(c2ig, th);
    }

    public final void A0W() {
        if (this instanceof C98174aw) {
            C98174aw c98174aw = (C98174aw) this;
            try {
                DefaultAudioSink defaultAudioSink = (DefaultAudioSink) c98174aw.A0A;
                if (!defaultAudioSink.A0O && defaultAudioSink.A0B != null && DefaultAudioSink.A09(defaultAudioSink)) {
                    DefaultAudioSink.A07(defaultAudioSink);
                    defaultAudioSink.A0O = true;
                }
            } catch (C4Y5 e) {
                throw c98174aw.A0F(e.A00, e, 5002, e.A01);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fa A[Catch: 5Sy -> 0x0241, TryCatch #1 {5Sy -> 0x0241, blocks: (B:58:0x00a2, B:114:0x00ab, B:117:0x00bc, B:119:0x00c8, B:120:0x00ef, B:122:0x00f5, B:124:0x00f9, B:126:0x0101, B:128:0x0111, B:131:0x0118, B:133:0x0123, B:134:0x0126, B:136:0x0129, B:138:0x012f, B:60:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x015b, B:67:0x0163, B:68:0x0169, B:70:0x016d, B:73:0x017b, B:81:0x0184, B:83:0x0191, B:84:0x0195, B:103:0x019c, B:88:0x019e, B:90:0x01da, B:91:0x01e1, B:93:0x01ed, B:94:0x01ef, B:97:0x01f7, B:141:0x0240, B:100:0x01fa, B:109:0x0227, B:111:0x022a, B:140:0x0236), top: B:57:0x00a2, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01da A[Catch: 5Sy -> 0x0241, TryCatch #1 {5Sy -> 0x0241, blocks: (B:58:0x00a2, B:114:0x00ab, B:117:0x00bc, B:119:0x00c8, B:120:0x00ef, B:122:0x00f5, B:124:0x00f9, B:126:0x0101, B:128:0x0111, B:131:0x0118, B:133:0x0123, B:134:0x0126, B:136:0x0129, B:138:0x012f, B:60:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x015b, B:67:0x0163, B:68:0x0169, B:70:0x016d, B:73:0x017b, B:81:0x0184, B:83:0x0191, B:84:0x0195, B:103:0x019c, B:88:0x019e, B:90:0x01da, B:91:0x01e1, B:93:0x01ed, B:94:0x01ef, B:97:0x01f7, B:141:0x0240, B:100:0x01fa, B:109:0x0227, B:111:0x022a, B:140:0x0236), top: B:57:0x00a2, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed A[Catch: 5Sy -> 0x0241, TryCatch #1 {5Sy -> 0x0241, blocks: (B:58:0x00a2, B:114:0x00ab, B:117:0x00bc, B:119:0x00c8, B:120:0x00ef, B:122:0x00f5, B:124:0x00f9, B:126:0x0101, B:128:0x0111, B:131:0x0118, B:133:0x0123, B:134:0x0126, B:136:0x0129, B:138:0x012f, B:60:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x015b, B:67:0x0163, B:68:0x0169, B:70:0x016d, B:73:0x017b, B:81:0x0184, B:83:0x0191, B:84:0x0195, B:103:0x019c, B:88:0x019e, B:90:0x01da, B:91:0x01e1, B:93:0x01ed, B:94:0x01ef, B:97:0x01f7, B:141:0x0240, B:100:0x01fa, B:109:0x0227, B:111:0x022a, B:140:0x0236), top: B:57:0x00a2, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0169 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Y() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97194Ye.A0Y():void");
    }

    public void A0b(long j) {
        this.A0h = j;
        while (true) {
            ArrayDeque arrayDeque = this.A0y;
            if (!arrayDeque.isEmpty() && j >= ((C5T0) arrayDeque.peek()).A00) {
                A07((C5T0) arrayDeque.poll());
                A0V();
            } else {
                return;
            }
        }
    }

    public final void A0c(long j) {
        Object obj;
        Object obj2;
        C96144Tx c96144Tx = this.A0K.A02;
        synchronized (c96144Tx) {
            obj = null;
            while (true) {
                int i = c96144Tx.A01;
                if (i <= 0) {
                    break;
                }
                long[] jArr = c96144Tx.A02;
                int i2 = c96144Tx.A00;
                if (j - jArr[i2] < 0) {
                    break;
                }
                Object[] objArr = c96144Tx.A03;
                obj = objArr[i2];
                objArr[i2] = null;
                c96144Tx.A00 = (i2 + 1) % objArr.length;
                c96144Tx.A01 = i - 1;
            }
        }
        C4B6 c4b6 = (C4B6) obj;
        if (c4b6 == null && this.A0p && this.A09 != null) {
            C96144Tx c96144Tx2 = this.A0K.A02;
            synchronized (c96144Tx2) {
                int i3 = c96144Tx2.A01;
                if (i3 != 0) {
                    boolean z = false;
                    if (i3 > 0) {
                        z = true;
                    }
                    C4B8.A04(z);
                    Object[] objArr2 = c96144Tx2.A03;
                    int i4 = c96144Tx2.A00;
                    obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    c96144Tx2.A00 = (i4 + 1) % objArr2.length;
                    c96144Tx2.A01 = i3 - 1;
                } else {
                    obj2 = null;
                }
            }
            c4b6 = (C4B6) obj2;
        }
        if (c4b6 != null) {
            this.A0D = c4b6;
        } else if (!this.A0S || (c4b6 = this.A0D) == null) {
            return;
        }
        A0d(this.A09, c4b6);
        this.A0S = false;
        this.A0p = false;
    }

    public boolean A0n() {
        return false;
    }

    public final boolean A0p() {
        if (this.A0H == null) {
            return false;
        }
        int i = this.A01;
        if (i != 3 && ((!this.A0m || this.A0Q) && !A0o())) {
            if (i == 2) {
                try {
                    A04();
                } catch (C4Y3 e) {
                    AbstractC46512Bo.A06("MediaCodecRenderer2", "Failed to update the DRM session, releasing the codec instead.", e);
                    A0Z();
                    return true;
                }
            }
            A02();
            return false;
        }
        A0Z();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // X.InterfaceC96054To
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean CbZ() {
        /*
            r5 = this;
            X.4B6 r0 = r5.A0C
            if (r0 != 0) goto L2b
            java.lang.Integer r0 = X.C05F.A01
        L6:
            r5.A06 = r0
        L8:
            X.4B6 r0 = r5.A0C
            if (r0 == 0) goto L38
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L29
            int r0 = r5.A05
            if (r0 >= 0) goto L29
            long r3 = r5.A0g
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L38
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L38
        L29:
            r0 = 1
            return r0
        L2b:
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L8
            int r0 = r5.A05
            if (r0 >= 0) goto L8
            java.lang.Integer r0 = X.C05F.A0N
            goto L6
        L38:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97194Ye.CbZ():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00ee, code lost:
    
        A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01a0, code lost:
    
        if (r36.A03 != 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01a2, code lost:
    
        r6.clear();
        r36.A03 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01a7, code lost:
    
        r36.A0U = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01ab, code lost:
    
        if (r36.A0T != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01ad, code lost:
    
        A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0394, code lost:
    
        if (r36.A0R != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0396, code lost:
    
        r36.A0H.queueInputBuffer(r36.A04, 0, 0, 0, 4);
        r36.A04 = -1;
        r6.A02 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x04ae, code lost:
    
        if (r2[0].getClassName().equals("android.media.MediaCodec") != false) goto L262;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0494 A[Catch: IllegalStateException -> 0x0496, DONT_GENERATE, TryCatch #3 {IllegalStateException -> 0x0496, blocks: (B:8:0x0013, B:10:0x0017, B:13:0x001b, B:15:0x001f, B:18:0x0027, B:20:0x0032, B:21:0x0037, B:23:0x0044, B:26:0x0058, B:29:0x03aa, B:31:0x03c2, B:33:0x03d0, B:34:0x0491, B:35:0x0493, B:36:0x0494, B:38:0x03ca, B:98:0x03ce, B:40:0x03d5, B:42:0x03d9, B:43:0x03e4, B:45:0x03e8, B:48:0x03ec, B:50:0x03f9, B:51:0x040c, B:89:0x046e, B:320:0x0482, B:64:0x042a, B:66:0x042e, B:67:0x0431, B:70:0x0435, B:73:0x0439, B:55:0x0421, B:83:0x0428, B:57:0x043f, B:59:0x0443, B:60:0x044f, B:63:0x0458, B:92:0x041d, B:99:0x0063, B:103:0x0067, B:319:0x047f, B:101:0x0483, B:105:0x006a, B:106:0x006f, B:108:0x0073, B:304:0x0080, B:307:0x008d, B:309:0x0091, B:311:0x0095, B:116:0x00ee, B:118:0x00f1, B:120:0x00f5, B:122:0x00fa, B:124:0x00fe, B:126:0x0102, B:128:0x010a, B:130:0x0117, B:265:0x011b, B:267:0x011f, B:268:0x0133, B:132:0x0137, B:135:0x013c, B:137:0x0146, B:139:0x015a, B:140:0x015c, B:142:0x016e, B:145:0x0172, B:147:0x0178, B:254:0x0189, B:256:0x018d, B:257:0x0192, B:154:0x0197, B:243:0x019e, B:245:0x01a2, B:246:0x01a7, B:248:0x01ad, B:249:0x0392, B:251:0x0396, B:156:0x01b2, B:158:0x01b6, B:235:0x01ba, B:238:0x01c1, B:161:0x01c5, B:165:0x01d0, B:167:0x01d4, B:169:0x01d8, B:170:0x01e0, B:171:0x01e5, B:173:0x01eb, B:175:0x01f5, B:176:0x01f7, B:178:0x01fb, B:179:0x0202, B:182:0x020f, B:184:0x0216, B:185:0x0274, B:186:0x0227, B:188:0x0225, B:189:0x0249, B:191:0x0250, B:192:0x0259, B:194:0x025d, B:196:0x0265, B:197:0x026b, B:198:0x026f, B:213:0x02ea, B:214:0x02eb, B:217:0x046c, B:218:0x046d, B:219:0x0271, B:220:0x02ed, B:222:0x02ff, B:223:0x0302, B:230:0x0307, B:226:0x0327, B:225:0x0316, B:232:0x045c, B:260:0x017f, B:262:0x033d, B:111:0x00e4, B:113:0x00e8, B:272:0x0348, B:274:0x0354, B:275:0x0363, B:277:0x036e, B:281:0x037c, B:283:0x0386, B:285:0x009b, B:279:0x0380, B:286:0x00a0, B:288:0x00ce, B:291:0x00db, B:316:0x0475, B:317:0x047d), top: B:7:0x0013, inners: #5 }] */
    @Override // X.InterfaceC96054To
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EGW(long r37, long r39) {
        /*
            Method dump skipped, instructions count: 1237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97194Ye.EGW(long, long):void");
    }

    @Override // X.AbstractC96044Tn, X.InterfaceC96054To
    public void Eb2(float f, float f2) {
        this.A00 = f;
        this.A0f = f2;
        A09(this.A0B);
    }

    @Override // X.InterfaceC96074Tq
    public final int EpR(C4B6 c4b6) {
        try {
            return A0P(c4b6, this.A0x);
        } catch (C40J e) {
            throw A0F(c4b6, e, 4002, false);
        }
    }

    public AbstractC97194Ye(C96014Tk c96014Tk, C2VQ c2vq, InterfaceC117375Sw interfaceC117375Sw, C4BL c4bl, Object obj, float f, int i, boolean z, boolean z2) {
        super(i);
        this.A0c = false;
        this.A0X = false;
        c2vq.getClass();
        this.A0t = c2vq;
        this.A14 = c96014Tk;
        this.A0k = obj;
        this.A13 = interfaceC117375Sw;
        this.A0x = c4bl;
        this.A10 = z;
        this.A11 = f;
        this.A0Y = z2;
        this.A12 = new C96094Ts(0);
        this.A0u = new C96094Ts(0);
        this.A0v = new C96094Ts(2);
        C117405Sz c117405Sz = new C117405Sz();
        this.A0w = c117405Sz;
        this.A0z = new ArrayList();
        this.A0s = new MediaCodec.BufferInfo();
        this.A00 = 1.0f;
        this.A0f = 1.0f;
        this.A0y = new ArrayDeque();
        A07(C5T0.A03);
        c117405Sz.A01(0);
        ((C96094Ts) c117405Sz).A02.order(ByteOrder.nativeOrder());
        this.A0e = -1.0f;
        this.A03 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A0g = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A0h = -9223372036854775807L;
        this.A02 = 0;
        this.A01 = 0;
        this.A0r = C2C5.A02(C2C1.A14);
        this.A0q = C2C5.A02(C2C1.A15);
        this.A15 = C2C5.A02(C2C1.A1C);
    }

    public final void A0a() {
        A0X();
        this.A0A = null;
        this.A0G = null;
        this.A0M = null;
        this.A0I = null;
        this.A0B = null;
        this.A09 = null;
        this.A0S = false;
        this.A0Q = false;
        this.A0e = -1.0f;
        this.A0m = false;
        this.A0R = false;
        this.A0n = false;
        this.A03 = 0;
        this.A0o = false;
    }

    public void A0g(C4B6 c4b6, String str) {
        A0f(c4b6);
    }
}
