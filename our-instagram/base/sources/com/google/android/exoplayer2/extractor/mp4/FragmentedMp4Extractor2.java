package com.google.android.exoplayer2.extractor.mp4;

import X.AbstractC111324zv;
import X.AbstractC167007dF;
import X.AbstractC46512Bo;
import X.AbstractC58319PtB;
import X.AbstractC70023Vzj;
import X.AbstractC97984ad;
import X.AbstractC98304b9;
import X.AnonymousClass001;
import X.C4B3;
import X.C4B6;
import X.C4B8;
import X.C4XF;
import X.C69079VhV;
import X.C69790VvV;
import X.C93194Fv;
import X.C97964ab;
import X.C97974ac;
import X.C98314bA;
import X.C98434bM;
import X.InterfaceC97954aa;
import X.InterfaceC98054ak;
import X.InterfaceC98284b7;
import X.W6c;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class FragmentedMp4Extractor2 implements InterfaceC97954aa {
    public static final C4B6 A0X;
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
    public long A0C;
    public C4XF A0D;
    public C69790VvV A0E;
    public C97974ac A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC98054ak[] A0I;
    public InterfaceC98054ak[] A0J;
    public final int A0K;
    public final SparseArray A0L;
    public final InterfaceC98054ak A0M;
    public final C97964ab A0N;
    public final C97974ac A0O;
    public final C97974ac A0P;
    public final C97974ac A0Q;
    public final C97974ac A0R;
    public final C97974ac A0S;
    public final ArrayDeque A0T;
    public final ArrayDeque A0U;
    public final List A0V;
    public final byte[] A0W;

    @Override // X.InterfaceC97954aa
    public final boolean EmL(InterfaceC98284b7 interfaceC98284b7) {
        return AbstractC70023Vzj.A00(interfaceC98284b7, true);
    }

    static {
        C4B3 c4b3 = new C4B3();
        c4b3.A0U = "application/x-emsg";
        A0X = new C4B6(c4b3);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    public static void A01(C98434bM c98434bM, C97974ac c97974ac, int i) {
        c97974ac.A0G(i + 8);
        int A01 = c97974ac.A01() & 16777215;
        if ((A01 & 1) == 0) {
            boolean A1M = AbstractC167007dF.A1M(A01 & 2);
            int A04 = c97974ac.A04();
            if (A04 == 0) {
                Arrays.fill(c98434bM.A0E, 0, c98434bM.A00, false);
                return;
            }
            int i2 = c98434bM.A00;
            if (A04 == i2) {
                Arrays.fill(c98434bM.A0E, 0, A04, A1M);
                int i3 = c97974ac.A00 - c97974ac.A01;
                C97974ac c97974ac2 = c98434bM.A0G;
                c97974ac2.A0E(i3);
                c98434bM.A07 = true;
                c98434bM.A09 = true;
                c97974ac.A0J(c97974ac2.A02, 0, c97974ac2.A00);
                c97974ac2.A0G(0);
                c98434bM.A09 = false;
                return;
            }
            throw C93194Fv.A00(AnonymousClass001.A02(A04, i2, "Senc sample count ", " is different from fragment sample count"), null);
        }
        ?? iOException = new IOException(AbstractC111324zv.A00(663), null);
        iOException.A01 = false;
        iOException.A00 = 1;
        throw iOException;
    }

    @Override // X.InterfaceC97954aa
    public final void CNm(C4XF c4xf) {
        int i;
        this.A0D = c4xf;
        this.A02 = 0;
        this.A00 = 0;
        InterfaceC98054ak[] interfaceC98054akArr = new InterfaceC98054ak[2];
        this.A0J = interfaceC98054akArr;
        InterfaceC98054ak interfaceC98054ak = this.A0M;
        int i2 = 0;
        if (interfaceC98054ak != null) {
            interfaceC98054akArr[0] = interfaceC98054ak;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.A0K & 4) != 0) {
            interfaceC98054akArr[i] = c4xf.F88(100, 5);
            i++;
            i3 = 101;
        }
        InterfaceC98054ak[] interfaceC98054akArr2 = this.A0J;
        C4B8.A03(AbstractC58319PtB.A1P(i, interfaceC98054akArr2.length));
        InterfaceC98054ak[] interfaceC98054akArr3 = (InterfaceC98054ak[]) Arrays.copyOf(interfaceC98054akArr2, i);
        this.A0J = interfaceC98054akArr3;
        for (InterfaceC98054ak interfaceC98054ak2 : interfaceC98054akArr3) {
            interfaceC98054ak2.AWa(A0X);
        }
        List list = this.A0V;
        InterfaceC98054ak[] interfaceC98054akArr4 = new InterfaceC98054ak[list.size()];
        this.A0I = interfaceC98054akArr4;
        while (i2 < interfaceC98054akArr4.length) {
            InterfaceC98054ak F88 = this.A0D.F88(i3, 3);
            F88.AWa((C4B6) list.get(i2));
            interfaceC98054akArr4 = this.A0I;
            interfaceC98054akArr4[i2] = F88;
            i2++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0e5d, code lost:
    
        r2 = new java.io.IOException(r1, null);
        r2.A01 = false;
        r2.A00 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0e67, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x05eb, code lost:
    
        if ((r1 & 1) == 0) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x065c, code lost:
    
        if (r19 == false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0e4e, code lost:
    
        throw X.C93194Fv.A00(r1.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0e31, code lost:
    
        r1.append(r0);
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0ab8, code lost:
    
        r55.A02 = 0;
        r55.A00 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0dee, code lost:
    
        throw X.C93194Fv.A00(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0af5, code lost:
    
        if (r55.A02 != 3) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0af9, code lost:
    
        if (r7.A06 != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0afb, code lost:
    
        r1 = r7.A05.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0aff, code lost:
    
        r4 = r7.A01;
        r2 = r1[r4];
        r55.A06 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0b07, code lost:
    
        if (r4 >= r7.A03) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0b09, code lost:
    
        r56.Em8(r2);
        r1 = r7.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0b10, code lost:
    
        if (r1 == null) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0b12, code lost:
    
        r4 = r7.A08;
        r3 = r4.A0G;
        r1 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0b18, code lost:
    
        if (r1 == 0) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0b1a, code lost:
    
        r3.A0H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0b1d, code lost:
    
        r2 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0b21, code lost:
    
        if (r4.A07 == false) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0b27, code lost:
    
        if (r4.A0E[r2] == false) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0b29, code lost:
    
        r3.A0H(r3.A05() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0b36, code lost:
    
        if (r7.A03() != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0b38, code lost:
    
        r55.A0E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0b3c, code lost:
    
        r55.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0b41, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0b4d, code lost:
    
        if (r7.A05.A03.A02 != 1) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0b4f, code lost:
    
        r55.A06 = r2 - 8;
        r56.Em8(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0b57, code lost:
    
        r2 = "audio/ac4".equals(r7.A05.A03.A07.A0W);
        r1 = r55.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0b67, code lost:
    
        if (r2 == false) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0b69, code lost:
    
        r55.A04 = r7.A00(r1, 7);
        r1 = r55.A06;
        r2 = r55.A0S;
        X.AbstractC63092Scs.A01(r2, r1);
        r7.A07.ELN(r2, 7);
        r2 = r55.A04 + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0b80, code lost:
    
        r55.A04 = r2;
        r55.A06 += r2;
        r55.A02 = 4;
        r55.A05 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0d3e, code lost:
    
        r2 = r7.A00(r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0b42, code lost:
    
        r1 = r7.A08.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0b8b, code lost:
    
        r4 = r7.A05;
        r1 = r4.A03;
        r2 = r7.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0b95, code lost:
    
        if (r7.A06 != false) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0b97, code lost:
    
        r4 = r4.A07[r7.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0b9d, code lost:
    
        r12 = r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0ba1, code lost:
    
        if (r12 == 0) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0ba3, code lost:
    
        r1 = r55.A0Q;
        r11 = r1.A02;
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r23 = r12 + 1;
        r22 = 4 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0bb3, code lost:
    
        r1 = r55.A04;
        r10 = r55.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0bb7, code lost:
    
        if (r1 >= r10) goto L769;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0bb9, code lost:
    
        r10 = r55.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0bbb, code lost:
    
        if (r10 != 0) goto L770;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0c1d, code lost:
    
        if (r55.A0H == false) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0c1f, code lost:
    
        r12 = r55.A0P;
        r12.A0E(r10);
        r56.readFully(r12.A02, 0, r10);
        r2.ELN(r12, r55.A05);
        r16 = r55.A05;
        r10 = X.AbstractC97984ad.A00(r12.A02, r12.A00);
        r12.A0G("video/hevc".equals(r1.A07.A0W) ? 1 : 0);
        r12.A0F(r10);
        r1 = r55.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0c50, code lost:
    
        r14 = r12.A00;
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0c58, code lost:
    
        if ((r14 - r12.A01) <= 1) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0c5a, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x0c5f, code lost:
    
        if ((r14 - r12.A01) != 0) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0d17, code lost:
    
        r10 = r12.A02();
        r13 = r13 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0d1e, code lost:
    
        if (r10 == 255) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0c62, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0c67, code lost:
    
        if ((r14 - r12.A01) != 0) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0d0c, code lost:
    
        r10 = r12.A02();
        r15 = r15 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0d13, code lost:
    
        if (r10 == 255) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0c6a, code lost:
    
        r1 = r12.A01;
        r19 = r1 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0c70, code lost:
    
        if (r15 == (-1)) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0c73, code lost:
    
        if (r15 > (r14 - r1)) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0c75, code lost:
    
        if (r13 != 4) goto L777;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0c79, code lost:
    
        if (r15 < 8) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0c7b, code lost:
    
        r10 = r12.A02();
        r14 = r12.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0c85, code lost:
    
        if (r14 != 49) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0c87, code lost:
    
        r18 = r12.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x0c8b, code lost:
    
        r17 = r12.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0c91, code lost:
    
        if (r14 != 47) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0c93, code lost:
    
        r12.A0H(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0c98, code lost:
    
        if (r10 != 181) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x0c9a, code lost:
    
        if (r14 == 49) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0c9c, code lost:
    
        if (r14 != 47) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0c9e, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x0ca3, code lost:
    
        if (r17 == 3) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0ca6, code lost:
    
        if (r14 != 49) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x0cad, code lost:
    
        if (r18 == 1195456820) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x0caf, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0cb1, code lost:
    
        r15 = r15 & r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0cb3, code lost:
    
        if (r15 == false) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x0cb5, code lost:
    
        r13 = r12.A02();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x0cbc, code lost:
    
        if ((r13 & 64) == 0) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0cbe, code lost:
    
        r12.A0H(1);
        r15 = (r13 & 31) * 3;
        r1 = r12.A01;
        r14 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x0ccc, code lost:
    
        if (r10 >= r14) goto L781;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x0cce, code lost:
    
        r13 = r1[r10];
        r12.A0G(r1);
        r13.ELN(r12, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x0cdf, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L789;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0ce1, code lost:
    
        r13.ELT(null, 1, r15, 0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x0cf0, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x0d05, code lost:
    
        r12.A0G(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0ca5, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0cf3, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x0cf6, code lost:
    
        X.AbstractC46512Bo.A04("CeaUtil", X.AbstractC111324zv.A00(689));
        r19 = r12.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0c69, code lost:
    
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x0c61, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0d26, code lost:
    
        r55.A04 += r16;
        r55.A05 -= r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x0d22, code lost:
    
        r16 = r2.ELR(r56, r10, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x0bbd, code lost:
    
        r56.readFully(r11, r22, r23);
        r1.A0G(0);
        r1 = r1.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0bcd, code lost:
    
        if (r1 < 1) goto L768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0bcf, code lost:
    
        r55.A05 = r1 - 1;
        r1 = r55.A0R;
        r1.A0G(0);
        r2.ELN(r1, 4);
        r2.ELN(r1, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x0be3, code lost:
    
        if (r55.A0I.length <= 0) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0be5, code lost:
    
        r12 = r1.A07.A0W;
        r13 = r11[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x0bf3, code lost:
    
        if ("video/avc".equals(r12) == false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x0bf8, code lost:
    
        if ((r13 & 31) == 6) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x0c09, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x0c0a, code lost:
    
        r55.A0H = r1;
        r55.A04 += 5;
        r55.A06 += r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x0c00, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x0c07, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x0c19, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x0de6, code lost:
    
        r1 = "Invalid NAL length";
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x0d57, code lost:
    
        if (r7.A06 != false) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0d59, code lost:
    
        r13 = r7.A05.A04[r7.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0d61, code lost:
    
        r3 = r7.A01();
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0d65, code lost:
    
        if (r3 == null) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x0d67, code lost:
    
        r13 = (r13 == true ? 1 : 0) | X.AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x0d6a, code lost:
    
        if (r3 == null) goto L624;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0d6c, code lost:
    
        r9 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x0d6e, code lost:
    
        r1 = r55.A0E;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0d70, code lost:
    
        if (r1 == null) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x0d72, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0d80, code lost:
    
        if ("application/x-mp4-vtt".equals(r1.A05.A03.A07.A0W) == false) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x0d82, code lost:
    
        r13 = (r13 == true ? 1 : 0) | 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0d84, code lost:
    
        r2.ELT(r9, r13, r10, 0, r4);
        r55.A0A = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x0d8f, code lost:
    
        r2 = r55.A0U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x0d95, code lost:
    
        if (r2.isEmpty() != false) goto L790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x0d97, code lost:
    
        r3 = (X.C69078VhU) r2.removeFirst();
        r1 = r55.A03;
        r11 = r3.A00;
        r55.A03 = r1 - r11;
        r1 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x0da8, code lost:
    
        if (r3.A02 == false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x0daa, code lost:
    
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0dab, code lost:
    
        r10 = r55.A0J;
        r9 = r10.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x0daf, code lost:
    
        if (r8 >= r9) goto L793;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0db1, code lost:
    
        r10[r8].ELT(null, 1, r11, r55.A03, r1);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x0dd6, code lost:
    
        if (r7.A03() != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x0dd8, code lost:
    
        r55.A0E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0dc3, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x0dc5, code lost:
    
        r13 = X.AbstractC167007dF.A1M(r7.A08.A0F[r7.A01] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0d44, code lost:
    
        r1 = r55.A04;
        r10 = r55.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x0d48, code lost:
    
        if (r1 >= r10) goto L794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0d4a, code lost:
    
        r55.A04 += r2.ELR(r56, r10 - r1, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0d34, code lost:
    
        r4 = r7.A08.A0C[r7.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023d, code lost:
    
        if (r5 == 1701671783) goto L155;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0e5b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v100, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // X.InterfaceC97954aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7m(X.InterfaceC98284b7 r56, X.C4XJ r57) {
        /*
            Method dump skipped, instructions count: 3688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.E7m(X.4b7, X.4XJ):int");
    }

    @Override // X.InterfaceC97954aa
    public final void EMc(long j, long j2) {
        SparseArray sparseArray = this.A0L;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C69790VvV) sparseArray.valueAt(i)).A02();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0B = j2;
        this.A0T.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public FragmentedMp4Extractor2(InterfaceC98054ak interfaceC98054ak, List list, int i) {
        this.A0A = -9223372036854775807L;
        this.A0K = i;
        this.A0V = Collections.unmodifiableList(list);
        this.A0M = interfaceC98054ak;
        this.A0N = new C97964ab();
        this.A0O = new C97974ac(16);
        this.A0R = new C97974ac(AbstractC97984ad.A01);
        this.A0Q = new C97974ac(5);
        this.A0P = new C97974ac();
        byte[] bArr = new byte[16];
        this.A0W = bArr;
        this.A0S = new C97974ac(bArr);
        this.A0T = new ArrayDeque();
        this.A0U = new ArrayDeque();
        this.A0L = new SparseArray();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0D = C4XF.A00;
        this.A0J = new InterfaceC98054ak[0];
        this.A0I = new InterfaceC98054ak[0];
    }

    public static DrmInitData A00(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C98314bA c98314bA = (C98314bA) list.get(i);
            if (((AbstractC98304b9) c98314bA).A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c98314bA.A00.A02;
                C69079VhV A00 = W6c.A00(bArr);
                if (A00 == null) {
                    AbstractC46512Bo.A04("FragmentedMp4Extractor", AbstractC111324zv.A00(688));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(null, "video/mp4", A00.A01, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]), false);
    }

    public FragmentedMp4Extractor2() {
        this(null, Collections.emptyList(), 0);
    }
}
