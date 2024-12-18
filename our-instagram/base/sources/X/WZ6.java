package X;

import android.content.Context;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class WZ6 implements InterfaceC58194Pr0 {
    public static final InterfaceC71878X8l A0K = new C70345WRz(-9223372036854775807L, 0);
    public int A00;
    public InterfaceC65627Tpn A01;
    public XE1 A02;
    public XGj A03;
    public InterfaceC71878X8l A04;
    public W5N A05;
    public U7W A06;
    public boolean A07;
    public boolean A08;
    public final SparseArray A09;
    public final InterfaceC65302Tha A0A;
    public final C66397UFi A0B;
    public final C66397UFi A0C;
    public final C69514Vqd A0D;
    public final InterfaceC71875X8i A0E;
    public final InterfaceC71836X6t A0F;
    public final VZk A0G;
    public final ArrayDeque A0H;
    public final ArrayList A0I;
    public final java.util.Set A0J;

    private boolean A03() {
        VZk vZk;
        int E7l;
        XE1 xe1;
        try {
            W5N w5n = this.A05;
            if (w5n != null && (xe1 = this.A02) != null) {
                xe1.EMc(w5n.A00, w5n.A01);
                A01(this.A05.A00);
                this.A05 = null;
            }
            boolean z = false;
            while (true) {
                ArrayDeque arrayDeque = this.A0H;
                if (!arrayDeque.isEmpty()) {
                    if (this.A0J.contains(arrayDeque.peekFirst())) {
                        return true;
                    }
                    A00();
                } else {
                    if (z) {
                        return false;
                    }
                    try {
                        this.A02.getClass();
                        this.A03.getClass();
                        XE1 xe12 = this.A02;
                        XGj xGj = this.A03;
                        vZk = this.A0G;
                        E7l = xe12.E7l(xGj, vZk);
                    } catch (Exception | OutOfMemoryError e) {
                        AbstractC66043Tyf.A00("ExoPlayerMedia3Extractor", "advanceToSampleOrEndOfInput: Exception=%s", e);
                    }
                    if (E7l != -1) {
                        if (E7l == 1) {
                            A01(vZk.A00);
                        }
                    } else {
                        z = true;
                    }
                }
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // X.InterfaceC58194Pr0
    public final int E8O(ByteBuffer byteBuffer, int i) {
        if (!A03()) {
            return -1;
        }
        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
        C66397UFi c66397UFi = this.A0C;
        c66397UFi.A01 = byteBuffer;
        A02(c66397UFi, false);
        byteBuffer.flip();
        byteBuffer.position(0);
        c66397UFi.A01 = null;
        return byteBuffer.remaining();
    }

    @Override // X.InterfaceC58194Pr0
    public final void release() {
        SparseArray sparseArray;
        int i = 0;
        AbstractC66043Tyf.A00("ExoPlayerMedia3Extractor", "release", new Object[0]);
        while (true) {
            sparseArray = this.A09;
            if (i >= sparseArray.size()) {
                break;
            }
            ((WS6) sparseArray.valueAt(i)).A01(true);
            i++;
        }
        sparseArray.clear();
        if (this.A02 != null) {
            this.A02 = null;
        }
        this.A03 = null;
        this.A05 = null;
        InterfaceC65627Tpn interfaceC65627Tpn = this.A01;
        if (interfaceC65627Tpn != null) {
            try {
                interfaceC65627Tpn.close();
            } catch (IOException unused) {
            }
        }
        this.A01 = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.VZk] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.Vqd] */
    public WZ6(Context context, U7W u7w) {
        C70334WRo c70334WRo = new C70334WRo();
        C63634Sqw c63634Sqw = new C63634Sqw(context);
        this.A06 = u7w;
        this.A0F = c70334WRo;
        this.A0A = c63634Sqw;
        this.A04 = A0K;
        this.A0G = new Object();
        this.A0E = new WRB();
        this.A0I = new ArrayList();
        this.A09 = new SparseArray();
        this.A0H = new ArrayDeque();
        this.A0D = new Object();
        this.A0C = new C66397UFi(0);
        this.A0B = new C66397UFi(0);
        this.A0J = new HashSet();
    }

    private void A00() {
        long j;
        VJY vjy;
        C69569VrY c69569VrY = (C69569VrY) this.A0I.get(((Number) this.A0H.removeFirst()).intValue());
        if (!c69569VrY.A02) {
            C66399UFk c66399UFk = c69569VrY.A00;
            synchronized (c66399UFk) {
                WDn.A01(AbstractC58319PtB.A1P(((WS6) c66399UFk).A03 + 1, ((WS6) c66399UFk).A02));
                ((WS6) c66399UFk).A03++;
            }
            WFI wfi = c66399UFk.A0M;
            synchronized (c66399UFk) {
                int i = ((WS6) c66399UFk).A03;
                if (i != 0) {
                    long j2 = c66399UFk.A05;
                    long j3 = Long.MIN_VALUE;
                    int i2 = c66399UFk.A04;
                    int i3 = i2 + (i - 1);
                    int i4 = ((WS6) c66399UFk).A01;
                    if (i3 >= i4) {
                        i3 -= i4;
                    }
                    for (int i5 = 0; i5 < i; i5++) {
                        j3 = Math.max(j3, c66399UFk.A0I[i3]);
                        if ((c66399UFk.A0E[i3] & 1) != 0) {
                            break;
                        }
                        i3--;
                        if (i3 == -1) {
                            i3 = i4 - 1;
                        }
                    }
                    c66399UFk.A05 = Math.max(j2, j3);
                    ((WS6) c66399UFk).A02 -= i;
                    int i6 = ((WS6) c66399UFk).A00 + i;
                    ((WS6) c66399UFk).A00 = i6;
                    int i7 = i2 + i;
                    c66399UFk.A04 = i7;
                    if (i7 >= i4) {
                        c66399UFk.A04 = i7 - i4;
                    }
                    int i8 = i - i;
                    ((WS6) c66399UFk).A03 = i8;
                    if (i8 < 0) {
                        ((WS6) c66399UFk).A03 = 0;
                    }
                    W2F w2f = c66399UFk.A0N;
                    int i9 = 0;
                    while (true) {
                        SparseArray sparseArray = w2f.A01;
                        if (i9 >= sparseArray.size() - 1) {
                            break;
                        }
                        int i10 = i9 + 1;
                        if (i6 < sparseArray.keyAt(i10)) {
                            break;
                        }
                        w2f.A02.accept(sparseArray.valueAt(i9));
                        sparseArray.removeAt(i9);
                        int i11 = w2f.A00;
                        if (i11 > 0) {
                            w2f.A00 = i11 - 1;
                        }
                        i9 = i10;
                    }
                    if (((WS6) c66399UFk).A02 == 0) {
                        int i12 = c66399UFk.A04;
                        if (i12 == 0) {
                            i12 = ((WS6) c66399UFk).A01;
                        }
                        j = c66399UFk.A0G[i12 - 1] + c66399UFk.A0F[r1];
                    } else {
                        j = c66399UFk.A0G[c66399UFk.A04];
                    }
                } else {
                    j = -1;
                }
            }
            if (j == -1) {
                return;
            }
            while (true) {
                vjy = wfi.A01;
                if (j < vjy.A00) {
                    break;
                }
                InterfaceC71875X8i interfaceC71875X8i = wfi.A05;
                C68650VZi c68650VZi = vjy.A03;
                WRB wrb = (WRB) interfaceC71875X8i;
                synchronized (wrb) {
                    C68650VZi[] c68650VZiArr = wrb.A02;
                    int i13 = wrb.A01;
                    wrb.A01 = i13 + 1;
                    c68650VZiArr[i13] = c68650VZi;
                    wrb.A00--;
                    wrb.notifyAll();
                }
                VJY vjy2 = wfi.A01;
                vjy2.A03 = null;
                VJY vjy3 = vjy2.A02;
                vjy2.A02 = null;
                wfi.A01 = vjy3;
            }
            if (wfi.A02.A01 >= vjy.A01) {
                return;
            }
            wfi.A02 = vjy;
        }
    }

    private void A01(long j) {
        InterfaceC65627Tpn interfaceC65627Tpn = this.A01;
        if (interfaceC65627Tpn != null) {
            android.net.Uri uri = interfaceC65627Tpn.getUri();
            InterfaceC65627Tpn interfaceC65627Tpn2 = this.A01;
            if (interfaceC65627Tpn2 != null) {
                try {
                    interfaceC65627Tpn2.close();
                } catch (IOException unused) {
                }
            }
            InterfaceC65627Tpn interfaceC65627Tpn3 = this.A01;
            uri.getClass();
            long E2I = interfaceC65627Tpn3.E2I(new C62932SYa(uri, Collections.emptyMap(), j));
            if (E2I != -1) {
                E2I += j;
            }
            this.A03 = new C70328WRi(this.A01, j, E2I);
        }
    }

    private void A02(C66397UFi c66397UFi, boolean z) {
        Object obj;
        ArrayDeque arrayDeque = this.A0H;
        if (!arrayDeque.isEmpty()) {
            obj = arrayDeque.peekFirst();
        } else {
            obj = null;
        }
        ArrayList arrayList = this.A0I;
        obj.getClass();
        C66399UFk c66399UFk = ((C69569VrY) arrayList.get(((Number) obj).intValue())).A00;
        boolean z2 = false;
        int i = 0;
        if (z) {
            i = 4;
        }
        int i2 = i | 1;
        C69514Vqd c69514Vqd = this.A0D;
        int A00 = c66399UFk.A00(c66397UFi, c69514Vqd, i2);
        if (A00 == -5) {
            A00 = c66399UFk.A00(c66397UFi, c69514Vqd, i2);
        }
        c69514Vqd.A00 = null;
        if (A00 == -4) {
            z2 = true;
        }
        WDn.A02(z2);
    }

    @Override // X.InterfaceC58194Pr0
    public final int CA9() {
        return this.A0I.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d0, code lost:
    
        if (r11 != 22) goto L53;
     */
    @Override // X.InterfaceC58194Pr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.media.MediaFormat CAD(int r14) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZ6.CAD(int):android.media.MediaFormat");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[LOOP:0: B:12:0x004b->B:14:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // X.InterfaceC58194Pr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EMi(long r8, int r10) {
        /*
            r7 = this;
            java.util.Set r4 = r7.A0J
            int r0 = r4.size()
            r3 = 1
            if (r0 != r3) goto L66
            X.XE1 r2 = r7.A02
            boolean r0 = r2 instanceof X.C70326WRg
            if (r0 == 0) goto L66
            X.WRg r2 = (X.C70326WRg) r2
            java.util.ArrayList r1 = r7.A0I
            java.util.Iterator r0 = r4.iterator()
            int r0 = X.AbstractC167007dF.A0B(r0)
            java.lang.Object r0 = r1.get(r0)
            X.VrY r0 = (X.C69569VrY) r0
            X.UFk r0 = r0.A00
            int r0 = r0.A02
            X.VuW r0 = r2.A01(r0, r8)
        L29:
            if (r10 == 0) goto L63
            if (r10 == r3) goto L60
            X.W5N r3 = r0.A00
            X.W5N r6 = r0.A01
            long r4 = r6.A01
            long r0 = r8 - r4
            long r4 = java.lang.Math.abs(r0)
            long r0 = r3.A01
            long r8 = r8 - r0
            long r1 = java.lang.Math.abs(r8)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L45
            r3 = r6
        L45:
            java.util.ArrayDeque r0 = r7.A0H
            r0.clear()
            r2 = 0
        L4b:
            android.util.SparseArray r1 = r7.A09
            int r0 = r1.size()
            if (r2 >= r0) goto L6d
            java.lang.Object r1 = r1.valueAt(r2)
            X.WS6 r1 = (X.WS6) r1
            r0 = 0
            r1.A01(r0)
            int r2 = r2 + 1
            goto L4b
        L60:
            X.W5N r3 = r0.A01
            goto L45
        L63:
            X.W5N r3 = r0.A00
            goto L45
        L66:
            X.X8l r0 = r7.A04
            X.VuW r0 = r0.Bs4(r8)
            goto L29
        L6d:
            r7.A05 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZ6.EMi(long, int):void");
    }

    @Override // X.InterfaceC58194Pr0
    public final void EMv(int i) {
        this.A0J.add(Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0173, code lost:
    
        if (r0 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0307, code lost:
    
        if (r5 == (-1)) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03a5, code lost:
    
        if (r21.A04 == X.WZ6.A0K) goto L212;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0084. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0179 A[Catch: all -> 0x04b9, TryCatch #4 {, blocks: (B:11:0x0057, B:13:0x006e, B:15:0x0074, B:17:0x007c, B:18:0x0084, B:20:0x0089, B:21:0x0154, B:25:0x0179, B:26:0x017c, B:28:0x0183, B:30:0x018b, B:32:0x0193, B:35:0x019e, B:37:0x01a6, B:39:0x01ae, B:43:0x01b8, B:47:0x030b, B:49:0x0310, B:52:0x0316, B:53:0x0319, B:56:0x031d, B:57:0x0323, B:59:0x0329, B:61:0x0337, B:63:0x033f, B:65:0x0347, B:67:0x034f, B:69:0x0357, B:71:0x035f, B:171:0x01c4, B:174:0x01d0, B:176:0x01d8, B:178:0x01e0, B:180:0x01e8, B:182:0x01f6, B:184:0x01fe, B:187:0x0209, B:189:0x0211, B:191:0x0219, B:193:0x0220, B:195:0x0228, B:197:0x0230, B:199:0x0238, B:201:0x0240, B:203:0x0248, B:205:0x0250, B:207:0x0258, B:209:0x0260, B:211:0x0266, B:213:0x026e, B:215:0x0276, B:217:0x027e, B:219:0x0286, B:221:0x028e, B:223:0x0296, B:226:0x02a1, B:229:0x02ac, B:232:0x02b7, B:234:0x02bf, B:236:0x02c7, B:238:0x02cf, B:240:0x02d7, B:258:0x0095, B:259:0x009e, B:260:0x00a8, B:262:0x016e, B:264:0x014c, B:266:0x011c, B:267:0x00bc, B:268:0x00c6, B:271:0x00d6, B:273:0x00e3, B:276:0x00f2, B:277:0x00fb, B:278:0x0104, B:279:0x010d, B:280:0x0116, B:281:0x0123, B:282:0x012c, B:284:0x013a, B:286:0x0141, B:289:0x015a, B:290:0x0163), top: B:10:0x0057, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0183 A[Catch: all -> 0x04b9, TryCatch #4 {, blocks: (B:11:0x0057, B:13:0x006e, B:15:0x0074, B:17:0x007c, B:18:0x0084, B:20:0x0089, B:21:0x0154, B:25:0x0179, B:26:0x017c, B:28:0x0183, B:30:0x018b, B:32:0x0193, B:35:0x019e, B:37:0x01a6, B:39:0x01ae, B:43:0x01b8, B:47:0x030b, B:49:0x0310, B:52:0x0316, B:53:0x0319, B:56:0x031d, B:57:0x0323, B:59:0x0329, B:61:0x0337, B:63:0x033f, B:65:0x0347, B:67:0x034f, B:69:0x0357, B:71:0x035f, B:171:0x01c4, B:174:0x01d0, B:176:0x01d8, B:178:0x01e0, B:180:0x01e8, B:182:0x01f6, B:184:0x01fe, B:187:0x0209, B:189:0x0211, B:191:0x0219, B:193:0x0220, B:195:0x0228, B:197:0x0230, B:199:0x0238, B:201:0x0240, B:203:0x0248, B:205:0x0250, B:207:0x0258, B:209:0x0260, B:211:0x0266, B:213:0x026e, B:215:0x0276, B:217:0x027e, B:219:0x0286, B:221:0x028e, B:223:0x0296, B:226:0x02a1, B:229:0x02ac, B:232:0x02b7, B:234:0x02bf, B:236:0x02c7, B:238:0x02cf, B:240:0x02d7, B:258:0x0095, B:259:0x009e, B:260:0x00a8, B:262:0x016e, B:264:0x014c, B:266:0x011c, B:267:0x00bc, B:268:0x00c6, B:271:0x00d6, B:273:0x00e3, B:276:0x00f2, B:277:0x00fb, B:278:0x0104, B:279:0x010d, B:280:0x0116, B:281:0x0123, B:282:0x012c, B:284:0x013a, B:286:0x0141, B:289:0x015a, B:290:0x0163), top: B:10:0x0057, outer: #6 }] */
    @Override // X.InterfaceC58194Pr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ESw(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZ6.ESw(java.lang.String):void");
    }

    @Override // X.InterfaceC58194Pr0
    public final boolean AAz() {
        if (!A03()) {
            return false;
        }
        A00();
        return A03();
    }

    @Override // X.InterfaceC58194Pr0
    public final int Bq6() {
        if (!A03()) {
            return -1;
        }
        C66397UFi c66397UFi = this.A0B;
        A02(c66397UFi, true);
        int i = ((AbstractC68228VIo) c66397UFi).A00;
        int i2 = 0;
        if ((i & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) == 1073741824) {
            i2 = 2;
        }
        return i2 | (AbstractC167007dF.A1P(i & 1, 1) ? 1 : 0);
    }

    @Override // X.InterfaceC58194Pr0
    public final long Bq8() {
        if (!A03()) {
            return -1L;
        }
        C66397UFi c66397UFi = this.A0B;
        A02(c66397UFi, true);
        return c66397UFi.A00;
    }

    @Override // X.InterfaceC58194Pr0
    public final int Bq9() {
        if (!A03()) {
            return -1;
        }
        Object peekFirst = this.A0H.peekFirst();
        peekFirst.getClass();
        return ((Number) peekFirst).intValue();
    }
}
