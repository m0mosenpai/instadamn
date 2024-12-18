package X;

import android.os.SystemClock;
import com.google.android.exoplayer2.util.Util;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4Uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96364Uu implements InterfaceC96374Uv {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A05;
    public int A06;
    public long A07;
    public boolean A08;
    public final C2A4 A09;
    public final C461429y A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final int A0F;
    public final int A0G;
    public final C2A5 A0H;
    public final C96314Up A0I;
    public final C460529p A0J;
    public final C96334Ur A0K;
    public long A04 = -9223372036854775807L;
    public volatile long A0L = -9223372036854775807L;
    public volatile long A0M = -9223372036854775807L;

    private void A00(boolean z) {
        this.A06 = 0;
        this.A08 = false;
        if (z) {
            C96334Ur c96334Ur = this.A0K;
            synchronized (c96334Ur) {
                c96334Ur.A00(0);
            }
        }
        this.A0L = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
    }

    @Override // X.InterfaceC96374Uv
    public final long Aeq() {
        return 0L;
    }

    @Override // X.InterfaceC96374Uv
    public final void DaT() {
        A00(false);
    }

    @Override // X.InterfaceC96374Uv
    public final boolean EKr() {
        return false;
    }

    @Override // X.InterfaceC96374Uv
    public final void onReleased() {
        A00(true);
    }

    @Override // X.InterfaceC96374Uv
    public final void onStopped() {
        A00(true);
    }

    @Override // X.InterfaceC96374Uv
    public final InterfaceC96344Us AbB() {
        return this.A0K;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r6 != 5) goto L15;
     */
    @Override // X.InterfaceC96374Uv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Duu(X.C4WU r10, X.InterfaceC96054To[] r11, X.C4WE[] r12) {
        /*
            r9 = this;
            int r7 = r9.A0G
            r0 = -1
            if (r7 != r0) goto L46
            r8 = 0
            r7 = 0
        L7:
            int r0 = r11.length
            if (r8 >= r0) goto L46
            r0 = r12[r8]
            if (r0 == 0) goto L26
            r0 = r11[r8]
            X.4Tn r0 = (X.AbstractC96044Tn) r0
            int r6 = r0.A0B
            boolean r5 = r9.A05
            r4 = 0
            r3 = 5
            r2 = 3
            r1 = 2
            r0 = 1
            if (r5 == 0) goto L2f
            if (r6 == r0) goto L2c
            if (r6 == r1) goto L29
            if (r6 == r2) goto L3d
            if (r6 == r3) goto L3d
        L25:
            int r7 = r7 + r4
        L26:
            int r8 = r8 + 1
            goto L7
        L29:
            int r4 = r9.A01
            goto L25
        L2c:
            int r4 = r9.A00
            goto L25
        L2f:
            if (r6 == r0) goto L43
            if (r6 == r1) goto L40
            if (r6 == r2) goto L3d
            if (r6 == r3) goto L3d
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L3d:
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L25
        L40:
            r4 = 13107200(0xc80000, float:1.8367099E-38)
            goto L25
        L43:
            r4 = 3538944(0x360000, float:4.959117E-39)
            goto L25
        L46:
            r9.A06 = r7
            X.4Ur r0 = r9.A0K
            r0.A00(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96364Uu.Duu(X.4WU, X.4To[], X.4WE[]):void");
    }

    @Override // X.InterfaceC96374Uv
    public final void ETX(long j, long j2) {
        this.A0L = j;
        this.A0M = j2;
    }

    @Override // X.InterfaceC96374Uv
    public final boolean EiL(C69336Vli c69336Vli) {
        long j = c69336Vli.A02;
        if (j < 0) {
            j = this.A07;
        } else {
            this.A07 = j;
        }
        return EiM(c69336Vli.A00, j, c69336Vli.A01, c69336Vli.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r1.A01() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r2 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        if (r1.A01() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r1 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ee, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0010, B:11:0x0023, B:17:0x002d, B:20:0x003b, B:22:0x0041, B:24:0x0049, B:26:0x004d, B:28:0x0051, B:32:0x005f, B:36:0x008f, B:39:0x0099, B:41:0x009d, B:44:0x00a7, B:49:0x00f8, B:50:0x0100, B:52:0x0104, B:56:0x011e, B:60:0x011b, B:61:0x00ae, B:63:0x00b6, B:65:0x00bb, B:69:0x00c4, B:71:0x00c8, B:72:0x00cb, B:74:0x00cf, B:78:0x00d9, B:79:0x00db, B:82:0x00e7, B:84:0x00d6, B:85:0x00e4, B:88:0x0066, B:90:0x006e, B:92:0x0073, B:96:0x007c, B:98:0x0080, B:99:0x0083, B:101:0x008b, B:107:0x0017), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0010, B:11:0x0023, B:17:0x002d, B:20:0x003b, B:22:0x0041, B:24:0x0049, B:26:0x004d, B:28:0x0051, B:32:0x005f, B:36:0x008f, B:39:0x0099, B:41:0x009d, B:44:0x00a7, B:49:0x00f8, B:50:0x0100, B:52:0x0104, B:56:0x011e, B:60:0x011b, B:61:0x00ae, B:63:0x00b6, B:65:0x00bb, B:69:0x00c4, B:71:0x00c8, B:72:0x00cb, B:74:0x00cf, B:78:0x00d9, B:79:0x00db, B:82:0x00e7, B:84:0x00d6, B:85:0x00e4, B:88:0x0066, B:90:0x006e, B:92:0x0073, B:96:0x007c, B:98:0x0080, B:99:0x0083, B:101:0x008b, B:107:0x0017), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8 A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0010, B:11:0x0023, B:17:0x002d, B:20:0x003b, B:22:0x0041, B:24:0x0049, B:26:0x004d, B:28:0x0051, B:32:0x005f, B:36:0x008f, B:39:0x0099, B:41:0x009d, B:44:0x00a7, B:49:0x00f8, B:50:0x0100, B:52:0x0104, B:56:0x011e, B:60:0x011b, B:61:0x00ae, B:63:0x00b6, B:65:0x00bb, B:69:0x00c4, B:71:0x00c8, B:72:0x00cb, B:74:0x00cf, B:78:0x00d9, B:79:0x00db, B:82:0x00e7, B:84:0x00d6, B:85:0x00e4, B:88:0x0066, B:90:0x006e, B:92:0x0073, B:96:0x007c, B:98:0x0080, B:99:0x0083, B:101:0x008b, B:107:0x0017), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104 A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0010, B:11:0x0023, B:17:0x002d, B:20:0x003b, B:22:0x0041, B:24:0x0049, B:26:0x004d, B:28:0x0051, B:32:0x005f, B:36:0x008f, B:39:0x0099, B:41:0x009d, B:44:0x00a7, B:49:0x00f8, B:50:0x0100, B:52:0x0104, B:56:0x011e, B:60:0x011b, B:61:0x00ae, B:63:0x00b6, B:65:0x00bb, B:69:0x00c4, B:71:0x00c8, B:72:0x00cb, B:74:0x00cf, B:78:0x00d9, B:79:0x00db, B:82:0x00e7, B:84:0x00d6, B:85:0x00e4, B:88:0x0066, B:90:0x006e, B:92:0x0073, B:96:0x007c, B:98:0x0080, B:99:0x0083, B:101:0x008b, B:107:0x0017), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6 A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0010, B:11:0x0023, B:17:0x002d, B:20:0x003b, B:22:0x0041, B:24:0x0049, B:26:0x004d, B:28:0x0051, B:32:0x005f, B:36:0x008f, B:39:0x0099, B:41:0x009d, B:44:0x00a7, B:49:0x00f8, B:50:0x0100, B:52:0x0104, B:56:0x011e, B:60:0x011b, B:61:0x00ae, B:63:0x00b6, B:65:0x00bb, B:69:0x00c4, B:71:0x00c8, B:72:0x00cb, B:74:0x00cf, B:78:0x00d9, B:79:0x00db, B:82:0x00e7, B:84:0x00d6, B:85:0x00e4, B:88:0x0066, B:90:0x006e, B:92:0x0073, B:96:0x007c, B:98:0x0080, B:99:0x0083, B:101:0x008b, B:107:0x0017), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    @Override // X.InterfaceC96374Uv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean EiM(float r18, long r19, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96364Uu.EiM(float, long, long, boolean):boolean");
    }

    @Override // X.InterfaceC96374Uv
    public final boolean Ejt(float f, long j, long j2, boolean z, boolean z2) {
        long j3;
        if (f != 1.0f) {
            j = Math.round(j / f);
        }
        if (z) {
            if (z2) {
                j3 = C461429y.A00(this.A0A, 9) * 1000;
            } else {
                long j4 = this.A0L;
                long j5 = this.A0M;
                if (j4 == -9223372036854775807L) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j6 = this.A04;
                    if (j6 == -9223372036854775807L) {
                        this.A04 = elapsedRealtime;
                    } else if (elapsedRealtime - j6 > j5) {
                        this.A0L = -9223372036854775807L;
                        this.A04 = -9223372036854775807L;
                    }
                }
                long j7 = this.A0L;
                if (j7 != -9223372036854775807L) {
                    UUID uuid = C4YL.A04;
                    j3 = Util.A07(j7);
                } else {
                    j3 = this.A02;
                }
            }
        } else {
            j3 = ((float) this.A03) * 1.0f;
        }
        if (j3 > 0 && j < j3) {
            return false;
        }
        this.A0L = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        return true;
    }

    public C96364Uu(C2A5 c2a5, C96314Up c96314Up, C460529p c460529p, C2A4 c2a4, C461429y c461429y, C96334Ur c96334Ur, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        C4B8.A05(i >= 0, AnonymousClass001.A0g("mBufferForPlaybackMs", " cannot be less than ", "0"));
        C4B8.A05(i2 >= 0, AnonymousClass001.A0g("mBufferForPlaybackAfterRebufferMs", " cannot be less than ", "0"));
        this.A0K = c96334Ur;
        this.A03 = i * 1000;
        this.A02 = i2 * 1000;
        this.A0A = c461429y;
        this.A0G = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A05 = z;
        this.A0E = z2;
        this.A0I = c96314Up;
        this.A09 = c2a4;
        this.A0H = c2a5;
        this.A0J = c460529p;
        this.A0C = atomicBoolean;
        this.A0B = atomicBoolean2;
        this.A0D = z3;
        this.A0F = i6;
    }
}
