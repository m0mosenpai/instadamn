package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4YV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YV implements C4Z1, InterfaceC97394Yz, C4YW, C4YX {
    public int A00;
    public long A01;
    public long A02;
    public AbstractC98514bU A04;
    public AbstractC98234b2 A06;
    public C4YQ A07;
    public C93214Fx A08;
    public C93204Fw A09;
    public boolean A0B;
    public C4B6 A0D;
    public boolean A0E;
    public final int A0F;
    public final C4V3 A0G;
    public final C4XX A0H;
    public final C98044aj A0I;
    public final InterfaceC96674Wc A0J;
    public final InterfaceC97914aW A0K;
    public final C4XO A0L;
    public final ArrayList A0N;
    public final List A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final int[] A0S;
    public final C4B6[] A0T;
    public final C98044aj[] A0U;
    public final boolean[] A0V;
    public final C98134as A0W;
    public long A03 = -1;
    public boolean A0C = false;
    public Boolean A0A = null;
    public AbstractC98514bU A05 = null;
    public final C98004af A0M = new C98004af("Loader:ChunkSampleStream");
    public final C98034ai A0X = new Object();

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPd(InterfaceC98244b3 interfaceC98244b3, long j, long j2) {
        AbstractC98234b2 abstractC98234b2 = (AbstractC98234b2) interfaceC98244b3;
        this.A06 = null;
        this.A08 = null;
        this.A09 = null;
        this.A0K.D3A(abstractC98234b2);
        C4C7 c4c7 = abstractC98234b2.A06;
        C98254b4 c98254b4 = abstractC98234b2.A07;
        C98264b5 c98264b5 = new C98264b5(c98254b4.A01, c4c7, c98254b4.A02);
        C4XX c4xx = this.A0H;
        int i = abstractC98234b2.A01;
        int i2 = this.A0F;
        c4xx.A05(abstractC98234b2.A05, c98264b5, abstractC98234b2.A08, abstractC98234b2, null, i, i2, abstractC98234b2.A00, abstractC98234b2.A04, abstractC98234b2.A02);
        this.A0J.D7l(this);
    }

    public static int A00(C4YV c4yv, int i, int i2) {
        while (true) {
            i2++;
            ArrayList arrayList = c4yv.A0N;
            if (i2 < arrayList.size()) {
                int[] iArr = ((AbstractC98514bU) arrayList.get(i2)).A01;
                C4B8.A01(iArr);
                if (iArr[0] > i) {
                    break;
                }
            } else {
                i2 = arrayList.size();
                break;
            }
        }
        return i2 - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r10 > (r1 - r4.A03)) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1 A[LOOP:0: B:9:0x002e->B:52:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.AbstractC98514bU A01(int r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YV.A01(int):X.4bU");
    }

    private void A02(int i) {
        C4B6 c4b6;
        AbstractC98234b2 abstractC98234b2 = (AbstractC98234b2) this.A0N.get(i);
        C4B6 c4b62 = abstractC98234b2.A05;
        if ((!c4b62.equals(this.A0D) && !this.A0G.A0N) || (this.A0G.A0N && ((c4b6 = this.A0D) == null || !c4b62.A0T.equals(c4b6.A0T)))) {
            this.A0H.A06(c4b62, abstractC98234b2.A08, this.A0F, abstractC98234b2.A00, abstractC98234b2.A04);
        }
        this.A0D = c4b62;
    }

    private boolean A03(int i) {
        C98044aj c98044aj;
        AbstractC98514bU abstractC98514bU = (AbstractC98514bU) this.A0N.get(i);
        C98044aj c98044aj2 = this.A0I;
        int i2 = c98044aj2.A00 + c98044aj2.A03;
        int[] iArr = abstractC98514bU.A01;
        C4B8.A01(iArr);
        if (i2 <= iArr[0]) {
            int i3 = 0;
            do {
                C98044aj[] c98044ajArr = this.A0U;
                if (i3 >= c98044ajArr.length) {
                    return false;
                }
                c98044aj = c98044ajArr[i3];
                i3++;
            } while (c98044aj.A00 + c98044aj.A03 <= iArr[i3]);
        }
        return true;
    }

    public final boolean A04() {
        if (this.A02 == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    @Override // X.C4Z1
    public final void AGb(long j) {
        ArrayList arrayList = this.A0N;
        int size = arrayList.size() - 1;
        if (size >= 0 && Aii(j) >= 4000000) {
            AbstractC98474bQ abstractC98474bQ = (AbstractC98474bQ) arrayList.get(size);
            if (!abstractC98474bQ.A01()) {
                C98004af c98004af = this.A0M;
                if (c98004af.A01 != null && !A03(size)) {
                    arrayList.remove(size);
                    if (arrayList.isEmpty()) {
                        this.A02 = abstractC98474bQ.A04;
                    }
                    c98004af.A00();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (r17 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        if (r2.A02 != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[Catch: all -> 0x0177, TryCatch #0 {all -> 0x0177, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0012, B:8:0x0018, B:9:0x001f, B:11:0x0025, B:12:0x002b, B:18:0x0054, B:19:0x007a, B:20:0x0091, B:24:0x0099, B:26:0x009f, B:28:0x00a5, B:30:0x00b5, B:35:0x00bf, B:37:0x00c5, B:39:0x00ca, B:41:0x00d2, B:43:0x00db, B:45:0x00e2, B:47:0x00e6, B:49:0x00f2, B:51:0x00fe, B:52:0x011b, B:56:0x0126, B:58:0x012a, B:59:0x0130, B:62:0x013c, B:64:0x0143, B:65:0x0124, B:66:0x0106, B:67:0x010f, B:68:0x0110, B:70:0x0114, B:74:0x005b, B:75:0x0036, B:76:0x003b), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5 A[Catch: all -> 0x0177, TryCatch #0 {all -> 0x0177, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0012, B:8:0x0018, B:9:0x001f, B:11:0x0025, B:12:0x002b, B:18:0x0054, B:19:0x007a, B:20:0x0091, B:24:0x0099, B:26:0x009f, B:28:0x00a5, B:30:0x00b5, B:35:0x00bf, B:37:0x00c5, B:39:0x00ca, B:41:0x00d2, B:43:0x00db, B:45:0x00e2, B:47:0x00e6, B:49:0x00f2, B:51:0x00fe, B:52:0x011b, B:56:0x0126, B:58:0x012a, B:59:0x0130, B:62:0x013c, B:64:0x0143, B:65:0x0124, B:66:0x0106, B:67:0x010f, B:68:0x0110, B:70:0x0114, B:74:0x005b, B:75:0x0036, B:76:0x003b), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    @Override // X.C4Z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AJq(long r31, long r33) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YV.AJq(long, long):boolean");
    }

    @Override // X.C4Z1
    public final boolean AJr(C69080VhW c69080VhW) {
        Boolean bool = this.A0A;
        if (bool == null || bool.booleanValue() != c69080VhW.A02) {
            boolean z = c69080VhW.A02;
            Boolean valueOf = Boolean.valueOf(z);
            String.format("playWhenReady changed from %s to %b, this: %d", bool, valueOf, Integer.valueOf(hashCode()));
            this.A0A = valueOf;
            if (z) {
                C97894aU c97894aU = (C97894aU) this.A0K;
                c97894aU.A03 = Math.min(c97894aU.A03, 2);
                if (this.A0G.A0P) {
                    FBK((byte) 0, true);
                }
            } else {
                C4V3 c4v3 = this.A0G;
                if (c4v3.A0P) {
                    FBK((byte) 2, true);
                }
                if (!this.A0R && c4v3.A0H) {
                    AGb(c69080VhW.A01);
                }
            }
        }
        return AJq(c69080VhW.A01, -9223372036854775807L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.4b2] */
    @Override // X.C4Z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Aii(long r12) {
        /*
            r11 = this;
            java.util.ArrayList r5 = r11.A0N
            java.util.Iterator r10 = r5.iterator()
            r8 = 0
            r6 = 0
        La:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r4 = r10.next()
            X.4b2 r4 = (X.AbstractC98234b2) r4
            boolean r0 = r11.A04()
            if (r0 == 0) goto L31
            long r2 = r11.A02
        L1e:
            long r0 = r4.A02
            long r2 = java.lang.Math.min(r2, r0)
            long r0 = r4.A04
            long r0 = java.lang.Math.max(r0, r12)
            long r2 = r2 - r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto La
            long r6 = r6 + r2
            goto La
        L31:
            long r2 = r11.A01
            int r0 = r5.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r5.get(r0)
            X.4bQ r1 = (X.AbstractC98474bQ) r1
            boolean r0 = r1.A01()
            if (r0 != 0) goto L5a
            int r1 = r5.size()
            r0 = 1
            if (r1 <= r0) goto L60
            int r0 = r5.size()
            int r0 = r0 + (-2)
            java.lang.Object r1 = r5.get(r0)
            X.4b2 r1 = (X.AbstractC98234b2) r1
            if (r1 == 0) goto L60
        L5a:
            long r0 = r1.A02
            long r2 = java.lang.Math.max(r2, r0)
        L60:
            X.4aj r0 = r11.A0I
            long r0 = r0.A05()
            long r2 = java.lang.Math.max(r2, r0)
            goto L1e
        L6b:
            X.4bU r1 = r11.A05
            if (r1 == 0) goto L81
            long r4 = r1.A04
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L81
            long r2 = r1.A02
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 > 0) goto L81
            long r0 = java.lang.Math.max(r4, r12)
            long r2 = r2 - r0
            long r6 = r6 + r2
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YV.Aii(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r3 != 0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.4b2] */
    @Override // X.C4Z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Aik() {
        /*
            r5 = this;
            boolean r0 = r5.A0B
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r5.A04()
            if (r0 == 0) goto L10
            long r0 = r5.A02
            return r0
        L10:
            long r1 = r5.A01
            java.util.ArrayList r4 = r5.A0N
            int r0 = r4.size()
            int r0 = r0 + (-1)
            java.lang.Object r3 = r4.get(r0)
            X.4bQ r3 = (X.AbstractC98474bQ) r3
            boolean r0 = r3.A01()
            if (r0 != 0) goto L3b
            int r3 = r4.size()
            r0 = 1
            if (r3 <= r0) goto L41
            int r0 = r4.size()
            int r0 = r0 + (-2)
            java.lang.Object r3 = r4.get(r0)
            X.4b2 r3 = (X.AbstractC98234b2) r3
            if (r3 == 0) goto L41
        L3b:
            long r3 = r3.A02
            long r1 = java.lang.Math.max(r1, r3)
        L41:
            X.4aj r0 = r5.A0I
            long r3 = r0.A05()
            long r0 = java.lang.Math.max(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YV.Aik():long");
    }

    @Override // X.InterfaceC97394Yz
    public final void Coy() {
        C98004af c98004af = this.A0M;
        c98004af.Coy();
        this.A0I.A07();
        if (c98004af.A01 == null) {
            C97894aU c97894aU = (C97894aU) this.A0K;
            IOException iOException = c97894aU.A0F;
            if (iOException == null) {
                c97894aU.A0d.Coy();
                return;
            }
            throw iOException;
        }
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPZ(InterfaceC98244b3 interfaceC98244b3, long j, long j2, boolean z) {
        AbstractC98234b2 abstractC98234b2 = (AbstractC98234b2) interfaceC98244b3;
        this.A06 = null;
        C4C7 c4c7 = abstractC98234b2.A06;
        C98254b4 c98254b4 = abstractC98234b2.A07;
        this.A0H.A03(abstractC98234b2.A05, new C98264b5(c98254b4.A01, c4c7, c98254b4.A02), abstractC98234b2.A08, abstractC98234b2.A01, this.A0F, abstractC98234b2.A00, abstractC98234b2.A04, abstractC98234b2.A02);
        if (!z) {
            if (A04()) {
                this.A0I.A0C(false);
                for (C98044aj c98044aj : this.A0U) {
                    c98044aj.A0C(false);
                }
            } else if (this.A0R && !this.A0P && (abstractC98234b2 instanceof AbstractC98514bU)) {
                ArrayList arrayList = this.A0N;
                A01(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.A02 = this.A01;
                }
            }
            this.A0J.D7l(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0034, code lost:
    
        if (A03(r2) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    @Override // X.C4YW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C98014ag DPf(X.InterfaceC98244b3 r35, java.io.IOException r36, int r37, long r38, long r40) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YV.DPf(X.4b3, java.io.IOException, int, long, long):X.4ag");
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPv(InterfaceC98244b3 interfaceC98244b3, int i, long j, long j2) {
        AbstractC98234b2 abstractC98234b2 = (AbstractC98234b2) interfaceC98244b3;
        if (this.A0Q) {
            C4C7 c4c7 = abstractC98234b2.A06;
            C98254b4 c98254b4 = abstractC98234b2.A07;
            C98264b5 c98264b5 = new C98264b5(c98254b4.A01, c4c7, c98254b4.A02);
            C4XX c4xx = this.A0H;
            int i2 = abstractC98234b2.A01;
            int i3 = this.A0F;
            c4xx.A02(abstractC98234b2.A05, c98264b5, abstractC98234b2.A08, i2, i3, abstractC98234b2.A00, i, abstractC98234b2.A04, abstractC98234b2.A02);
        }
    }

    @Override // X.C4YX
    public final void DQ5() {
        this.A0I.A09();
        for (C98044aj c98044aj : this.A0U) {
            c98044aj.A09();
        }
        C4YQ c4yq = this.A07;
        if (c4yq != null) {
            C4YP c4yp = (C4YP) c4yq;
            synchronized (c4yp) {
                C122355gV c122355gV = (C122355gV) c4yp.A0M.remove(this);
                if (c122355gV != null) {
                    c122355gV.A03.A09();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // X.C4Z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ECm(long r16) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YV.ECm(long):void");
    }

    @Override // X.C4Z1
    public final void Eax(boolean z) {
        String valueOf = String.valueOf(this.A0A);
        Boolean valueOf2 = Boolean.valueOf(z);
        String.format("playWhenReady changed from %s to %b, this: %d", valueOf, valueOf2, Integer.valueOf(hashCode()));
        this.A0A = valueOf2;
        if (z) {
            C97894aU c97894aU = (C97894aU) this.A0K;
            c97894aU.A03 = Math.min(c97894aU.A03, 2);
        }
    }

    @Override // X.C4Z1
    public final void FBK(byte b, boolean z) {
        boolean z2;
        String str;
        InterfaceC92354Bq interfaceC92354Bq = ((C97894aU) this.A0K).A0c;
        if (interfaceC92354Bq instanceof InterfaceC97874aS) {
            InterfaceC92354Bq interfaceC92354Bq2 = ((C97864aR) ((InterfaceC97874aS) interfaceC92354Bq)).A01;
            if (interfaceC92354Bq2 instanceof InterfaceC92374Bs) {
                ((InterfaceC92374Bs) interfaceC92354Bq2).changeHttpPriority(b, z);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        Object[] objArr = {Integer.valueOf(b), Boolean.valueOf(z)};
        if (z2) {
            str = "Successfully update http/3 priority to %d and incremental %s";
        } else {
            str = "Failed update http/3 priority to %d and incremental %s";
        }
        String.format(str, objArr);
    }

    @Override // X.C4Z1
    public final boolean isLoading() {
        if (this.A0M.A01 == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.4ai] */
    public C4YV(C4V3 c4v3, C4XY c4xy, C4XR c4xr, C4XX c4xx, InterfaceC96674Wc interfaceC96674Wc, InterfaceC97914aW interfaceC97914aW, InterfaceC96344Us interfaceC96344Us, C4XO c4xo, int[] iArr, C4B6[] c4b6Arr, int i, long j) {
        this.A0F = i;
        this.A0S = iArr;
        this.A0T = c4b6Arr;
        this.A0K = interfaceC97914aW;
        this.A0J = interfaceC96674Wc;
        this.A0H = c4xx;
        this.A0L = c4xo;
        this.A0G = c4v3;
        ArrayList arrayList = new ArrayList();
        this.A0N = arrayList;
        this.A0O = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.A0U = new C98044aj[length];
        this.A0V = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        C98044aj[] c98044ajArr = new C98044aj[i2];
        c4xr.getClass();
        c4xy.getClass();
        C98044aj c98044aj = new C98044aj(c4xy, c4xr, interfaceC96344Us);
        this.A0I = c98044aj;
        iArr2[0] = i;
        c98044ajArr[0] = c98044aj;
        int i3 = 0;
        while (i3 < length) {
            C98044aj c98044aj2 = new C98044aj(null, null, interfaceC96344Us);
            this.A0U[i3] = c98044aj2;
            int i4 = i3 + 1;
            c98044ajArr[i4] = c98044aj2;
            iArr2[i4] = this.A0S[i3];
            i3 = i4;
        }
        this.A0W = new C98134as(iArr2, c98044ajArr);
        this.A02 = j;
        this.A01 = j;
        this.A0E = C2C5.A02(C2C1.A0O);
        this.A0R = C2C5.A02(C2C1.A0P);
        this.A0P = C2C5.A02(C2C1.A0X);
        this.A0Q = C2C5.A02(C2C1.A0l);
    }

    @Override // X.C4Z1
    public final long BWx() {
        if (A04()) {
            return this.A02;
        }
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        return ((AbstractC98234b2) this.A0N.get(r1.size() - 1)).A02;
    }

    @Override // X.InterfaceC97394Yz
    public final boolean CbZ() {
        if (!A04() && this.A0I.A0E(this.A0B)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC97394Yz
    public final int E7y(C96084Tr c96084Tr, C96094Ts c96094Ts, int i) {
        if (A04()) {
            return -3;
        }
        C98044aj c98044aj = this.A0I;
        int A04 = c98044aj.A04(c96084Tr, c96094Ts, i, this.A0B);
        if (A04 != -4) {
            return A04;
        }
        boolean z = this.A0G.A0Q;
        int i2 = c98044aj.A00 + c98044aj.A03;
        if (z) {
            int A00 = A00(this, i2, this.A00 - 1);
            while (true) {
                int i3 = this.A00;
                if (i3 > A00) {
                    return A04;
                }
                this.A00 = i3 + 1;
                A02(i3);
            }
        } else {
            int A002 = A00(this, i2 - 1, 0);
            while (A002 <= A002) {
                A02(A002);
                A002++;
            }
            return A04;
        }
    }

    @Override // X.InterfaceC97394Yz
    public final int Em7(long j) {
        int A00;
        if (A04()) {
            return 0;
        }
        C98044aj c98044aj = this.A0I;
        int A03 = c98044aj.A03(j, this.A0B);
        c98044aj.A0A(A03);
        if (A03 <= 0) {
            return A03;
        }
        boolean z = this.A0G.A0Q;
        int i = c98044aj.A00 + c98044aj.A03;
        if (z) {
            int A002 = A00(this, i, this.A00 - 1);
            while (true) {
                int i2 = this.A00;
                if (i2 > A002) {
                    return A03;
                }
                this.A00 = i2 + 1;
                A02(i2);
            }
        } else {
            int A003 = A00(this, i - A03, 0);
            if (A03 == 1) {
                A00 = A003;
            } else {
                A00 = A00(this, i - 1, A003);
            }
            while (A003 <= A00) {
                A02(A003);
                A003++;
            }
            return A03;
        }
    }

    @Override // X.InterfaceC97394Yz
    public final /* synthetic */ long CAC(int i) {
        return -9223372036854775807L;
    }
}
