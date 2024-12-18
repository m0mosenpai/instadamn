package X;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import com.google.common.collect.ImmutableList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.WRe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70324WRe implements XE1 {
    public static final C70130W5r A0X;
    public static final byte[] A0Y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public WFa A0C;
    public InterfaceC72026XFo A0D;
    public C69789VvU A0E;
    public ImmutableList A0F;
    public boolean A0G;
    public boolean A0H;
    public XG2[] A0I;
    public XG2[] A0J;
    public final int A0K;
    public final SparseArray A0L;
    public final WFa A0M;
    public final WFa A0N;
    public final WFa A0O;
    public final WFa A0P;
    public final WFa A0Q;
    public final C68880Vdc A0R;
    public final ArrayDeque A0S;
    public final ArrayDeque A0T;
    public final List A0U;
    public final byte[] A0V;
    public final InterfaceC72027XFp A0W;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        ImmutableList of;
        InterfaceC71837X6u A00 = AbstractC70002VzM.A00(xGj, true, false);
        if (A00 != null) {
            of = ImmutableList.of((Object) A00);
        } else {
            of = ImmutableList.of();
        }
        this.A0F = of;
        return AbstractC25229BEm.A1Z(A00);
    }

    static {
        C70116W4o c70116W4o = new C70116W4o();
        c70116W4o.A00("application/x-emsg");
        A0X = new C70130W5r(c70116W4o);
    }

    public static void A01(WFa wFa, C69477Vo0 c69477Vo0, int i) {
        wFa.A0O(i + 8);
        int A01 = wFa.A01() & 16777215;
        if ((A01 & 1) == 0) {
            boolean A1M = AbstractC167007dF.A1M(A01 & 2);
            int A07 = wFa.A07();
            if (A07 == 0) {
                Arrays.fill(c69477Vo0.A0E, 0, c69477Vo0.A00, false);
                return;
            }
            int i2 = c69477Vo0.A00;
            if (A07 == i2) {
                Arrays.fill(c69477Vo0.A0E, 0, A07, A1M);
                int i3 = wFa.A00 - wFa.A01;
                WFa wFa2 = c69477Vo0.A0G;
                wFa2.A0M(i3);
                c69477Vo0.A07 = true;
                c69477Vo0.A09 = true;
                wFa.A0R(wFa2.A02, 0, wFa2.A00);
                wFa2.A0O(0);
                c69477Vo0.A09 = false;
                return;
            }
            throw new VCM(AnonymousClass001.A02(A07, i2, "Senc sample count ", " is different from fragment sample count"), null, 1, true);
        }
        throw new VCM(AbstractC111324zv.A00(663), null, 1, false);
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        InterfaceC72026XFo interfaceC72026XFo2;
        int i = this.A0K;
        if ((i & 32) == 0) {
            interfaceC72026XFo2 = new C70333WRn(interfaceC72026XFo, this.A0W);
        } else {
            interfaceC72026XFo2 = interfaceC72026XFo;
        }
        this.A0D = interfaceC72026XFo2;
        this.A02 = 0;
        this.A00 = 0;
        XG2[] xg2Arr = new XG2[2];
        this.A0J = xg2Arr;
        int i2 = 0;
        int i3 = 0;
        int i4 = i & 4;
        int i5 = 100;
        if (i4 != 0) {
            xg2Arr[0] = interfaceC72026XFo2.F87(100, 5);
            i3 = 1;
            i5 = 101;
        }
        XG2[] xg2Arr2 = this.A0J;
        WDn.A01(AbstractC58319PtB.A1P(i3, xg2Arr2.length));
        XG2[] xg2Arr3 = (XG2[]) Arrays.copyOf(xg2Arr2, i3);
        this.A0J = xg2Arr3;
        for (XG2 xg2 : xg2Arr3) {
            xg2.AWZ(A0X);
        }
        List list = this.A0U;
        XG2[] xg2Arr4 = new XG2[list.size()];
        this.A0I = xg2Arr4;
        while (i2 < xg2Arr4.length) {
            XG2 F87 = this.A0D.F87(i5, 3);
            F87.AWZ((C70130W5r) list.get(i2));
            xg2Arr4 = this.A0I;
            xg2Arr4[i2] = F87;
            i2++;
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x05f5, code lost:
    
        if ((r1 & 1) == 0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0664, code lost:
    
        if (r32 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0d4c, code lost:
    
        throw new X.VCM(r1.toString(), null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0d2e, code lost:
    
        r1.append(r0);
        r1.append(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0aad, code lost:
    
        r51.A02 = 0;
        r51.A00 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0218, code lost:
    
        if (r10 == 1701671783) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0d69, code lost:
    
        throw new X.VCM(r1, null, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0cf0, code lost:
    
        throw new X.VCM(r3, null, 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0ae0, code lost:
    
        if (r51.A02 != 3) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0ae4, code lost:
    
        if (r12.A06 != false) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0ae6, code lost:
    
        r2 = r12.A05.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0aea, code lost:
    
        r6 = r12.A01;
        r3 = r2[r6];
        r51.A06 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0af2, code lost:
    
        if (r6 >= r12.A03) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0af4, code lost:
    
        r52.Em8(r3);
        r1 = r12.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0afb, code lost:
    
        if (r1 == null) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0afd, code lost:
    
        r4 = r12.A09;
        r3 = r4.A0G;
        r1 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0b03, code lost:
    
        if (r1 == 0) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0b05, code lost:
    
        r3.A0P(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0b08, code lost:
    
        r2 = r12.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0b0c, code lost:
    
        if (r4.A07 == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0b12, code lost:
    
        if (r4.A0E[r2] == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0b14, code lost:
    
        r3.A0P(r3.A08() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0b21, code lost:
    
        if (r12.A03() != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0b23, code lost:
    
        r51.A0E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0b27, code lost:
    
        r51.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0b2c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0b38, code lost:
    
        if (r12.A05.A03.A02 != 1) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0b3a, code lost:
    
        r51.A06 = r3 - 8;
        r52.Em8(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0b42, code lost:
    
        r3 = "audio/ac4".equals(r12.A05.A03.A07.A0Y);
        r2 = r51.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0b52, code lost:
    
        if (r3 == false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0b54, code lost:
    
        r51.A04 = r12.A00(r2, 7);
        r2 = r51.A06;
        r3 = r51.A0Q;
        X.AbstractC70001VzL.A00(r3, r2);
        r12.A08.ELL(r3, 7);
        r3 = r51.A04 + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0b6b, code lost:
    
        r51.A04 = r3;
        r51.A06 += r3;
        r51.A02 = 4;
        r51.A05 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0c4b, code lost:
    
        r3 = r12.A00(r2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0b2d, code lost:
    
        r2 = r12.A09.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0b76, code lost:
    
        r3 = r12.A05;
        r11 = r3.A03;
        r10 = r12.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0b7e, code lost:
    
        if (r12.A06 != false) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0b80, code lost:
    
        r2 = r3.A07[r12.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0b86, code lost:
    
        r6 = r11.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0b88, code lost:
    
        if (r6 == 0) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0b8a, code lost:
    
        r9 = r51.A0O;
        r8 = r9.A02;
        r8[0] = 0;
        r8[1] = 0;
        r8[2] = 0;
        r18 = r6 + 1;
        r17 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x0b98, code lost:
    
        r6 = r51.A04;
        r5 = r51.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0b9c, code lost:
    
        if (r6 >= r5) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0b9e, code lost:
    
        r6 = r51.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0ba0, code lost:
    
        if (r6 != 0) goto L720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0bfc, code lost:
    
        if (r51.A0H == false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0bfe, code lost:
    
        r7 = r51.A0N;
        r7.A0M(r6);
        r52.readFully(r7.A02, 0, r6);
        r10.ELL(r7, r51.A05);
        r6 = r51.A05;
        r16 = X.WFG.A00(r7.A02, r7.A00);
        r7.A0O("video/hevc".equals(r11.A07.A0Y) ? 1 : 0);
        r7.A0N(r16);
        X.AbstractC69806Vvs.A00(r7, r51.A0I, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0c30, code lost:
    
        r51.A04 += r6;
        r51.A05 -= r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0c3c, code lost:
    
        r6 = r10.ELK(r52, r6, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0ba2, code lost:
    
        r52.readFully(r8, r17, r18);
        r9.A0O(0);
        r5 = r9.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0bb0, code lost:
    
        if (r5 < 1) goto L721;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0bb2, code lost:
    
        r51.A05 = r5 - 1;
        r5 = r51.A0P;
        r5.A0O(0);
        r10.ELL(r5, 4);
        r10.ELL(r9, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0bc4, code lost:
    
        if (r51.A0I.length <= 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0bc6, code lost:
    
        r7 = r11.A07.A0Y;
        r15 = r8[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0bd2, code lost:
    
        if ("video/avc".equals(r7) == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x0bd7, code lost:
    
        if ((r15 & 31) == 6) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0be8, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0be9, code lost:
    
        r51.A0H = r5;
        r51.A04 += 5;
        r51.A06 += r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x0bdf, code lost:
    
        if ("video/hevc".equals(r7) == false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0be6, code lost:
    
        if (((r15 & 126) >> 1) != 39) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x0bf8, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x0ce0, code lost:
    
        r3 = "Invalid NAL length";
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0c64, code lost:
    
        if (r12.A06 != false) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0c66, code lost:
    
        r23 = r12.A05.A04[r12.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x0c6e, code lost:
    
        r6 = r12.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x0c72, code lost:
    
        if (r6 == null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0c74, code lost:
    
        r23 = (r23 == true ? 1 : 0) | X.AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        r4 = r6.A01;
        r23 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x0c7a, code lost:
    
        r10.ELS(r4, r23, r5, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x0c87, code lost:
    
        r5 = r51.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x0c8d, code lost:
    
        if (r5.isEmpty() != false) goto L727;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0c8f, code lost:
    
        r6 = (X.C69036Vgd) r5.removeFirst();
        r4 = r51.A03;
        r10 = r6.A00;
        r51.A03 = r4 - r10;
        r4 = r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x0ca0, code lost:
    
        if (r6.A02 == false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x0ca2, code lost:
    
        r4 = r4 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x0ca3, code lost:
    
        r9 = r51.A0J;
        r8 = r9.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x0ca7, code lost:
    
        if (r7 >= r8) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x0ca9, code lost:
    
        r9[r7].ELS(null, 1, r10, r51.A03, r4);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x0cd0, code lost:
    
        if (r12.A03() != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x0cd2, code lost:
    
        r51.A0E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x0cbd, code lost:
    
        r4 = null;
        r23 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0cbf, code lost:
    
        r23 = X.AbstractC167007dF.A1M(r12.A09.A0F[r12.A01] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x0c51, code lost:
    
        r6 = r51.A04;
        r5 = r51.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0c55, code lost:
    
        if (r6 >= r5) goto L731;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x0c57, code lost:
    
        r51.A04 += r10.ELK(r52, r5 - r6, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x0c41, code lost:
    
        r2 = r12.A09.A0C[r12.A01];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0d61 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7l(X.XGj r52, X.VZk r53) {
        /*
            Method dump skipped, instructions count: 3434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70324WRe.E7l(X.XGj, X.VZk):int");
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        SparseArray sparseArray = this.A0L;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C69789VvU) sparseArray.valueAt(i)).A02();
        }
        this.A0T.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0S.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public C70324WRe(InterfaceC72027XFp interfaceC72027XFp, List list, int i) {
        this.A0W = interfaceC72027XFp;
        this.A0K = i;
        this.A0U = Collections.unmodifiableList(list);
        this.A0R = new C68880Vdc();
        this.A0M = new WFa(16);
        this.A0P = new WFa(WFG.A01);
        this.A0O = new WFa(5);
        this.A0N = new WFa();
        byte[] bArr = new byte[16];
        this.A0V = bArr;
        this.A0Q = new WFa(bArr);
        this.A0S = new ArrayDeque();
        this.A0T = new ArrayDeque();
        this.A0L = new SparseArray();
        this.A0F = ImmutableList.of();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0D = InterfaceC72026XFo.A00;
        this.A0J = new XG2[0];
        this.A0I = new XG2[0];
    }

    public static DrmInitData A00(List list) {
        StringBuilder sb;
        String str;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C66408UFt c66408UFt = (C66408UFt) list.get(i);
            if (((W46) c66408UFt).A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c66408UFt.A00.A02;
                WFa wFa = new WFa(bArr);
                if (wFa.A00 >= 32) {
                    wFa.A0O(0);
                    int i2 = wFa.A00 - wFa.A01;
                    int A01 = wFa.A01();
                    if (A01 != i2) {
                        sb = new StringBuilder();
                        sb.append("Advertised atom size (");
                        sb.append(A01);
                        str = ") does not match buffer size: ";
                    } else {
                        i2 = wFa.A01();
                        if (i2 != 1886614376) {
                            sb = new StringBuilder();
                            str = "Atom type is not pssh: ";
                        } else {
                            i2 = (wFa.A01() >> 24) & 255;
                            if (i2 > 1) {
                                sb = new StringBuilder();
                                str = "Unsupported pssh version: ";
                            } else {
                                UUID uuid = new UUID(wFa.A0B(), wFa.A0B());
                                if (i2 == 1) {
                                    int A07 = wFa.A07();
                                    for (int i3 = 0; i3 < A07; i3++) {
                                        wFa.A0B();
                                        wFa.A0B();
                                    }
                                }
                                int A072 = wFa.A07();
                                int i4 = wFa.A00 - wFa.A01;
                                if (A072 != i4) {
                                    sb = new StringBuilder();
                                    sb.append("Atom data size (");
                                    sb.append(A072);
                                    sb.append(") does not match the bytes left: ");
                                    sb.append(i4);
                                    AbstractC63374Sil.A04("PsshAtomUtil", sb.toString());
                                } else {
                                    wFa.A0R(new byte[A072], 0, A072);
                                    arrayList.add(new DrmInitData.SchemeData("video/mp4", uuid, bArr));
                                }
                            }
                        }
                    }
                    sb.append(str);
                    sb.append(i2);
                    AbstractC63374Sil.A04("PsshAtomUtil", sb.toString());
                }
                AbstractC63374Sil.A04("FragmentedMp4Extractor", AbstractC111324zv.A00(688));
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]), false);
    }

    @Deprecated
    public C70324WRe() {
        this(InterfaceC72027XFp.A00, ImmutableList.of(), 32);
    }
}
