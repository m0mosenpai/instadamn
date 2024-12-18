package X;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4aZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97944aZ implements InterfaceC97954aa {
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
    public SparseArray A0C;
    public C4XF A0D;
    public C98424bL A0E;
    public C97974ac A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC98054ak[] A0I;
    public InterfaceC98054ak[] A0J;
    public final int A0K;
    public final InterfaceC98054ak A0L;
    public final C97964ab A0M;
    public final C97974ac A0N;
    public final C97974ac A0O;
    public final C97974ac A0P;
    public final C97974ac A0Q;
    public final C97974ac A0R;
    public final ArrayDeque A0S;
    public final ArrayDeque A0T;
    public final List A0U;
    public final boolean A0V;
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

    public static void A01(C98434bM c98434bM, C97974ac c97974ac, int i) {
        c97974ac.A0G(i + 8);
        int A01 = c97974ac.A01() & 16777215;
        if ((A01 & 1) == 0) {
            int i2 = A01 & 2;
            boolean z = false;
            if (i2 != 0) {
                z = true;
            }
            int A04 = c97974ac.A04();
            int i3 = c98434bM.A00;
            if (A04 == i3) {
                Arrays.fill(c98434bM.A0E, 0, A04, z);
                int i4 = c97974ac.A00 - c97974ac.A01;
                C97974ac c97974ac2 = c98434bM.A0G;
                c97974ac2.A0E(i4);
                c98434bM.A07 = true;
                c98434bM.A09 = true;
                c97974ac.A0J(c97974ac2.A02, 0, c97974ac2.A00);
                c97974ac2.A0G(0);
                c98434bM.A09 = false;
                return;
            }
            throw new IOException(AnonymousClass001.A02(A04, i3, "Length mismatch: ", ", "));
        }
        throw new IOException(AbstractC111324zv.A00(663));
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x07bd, code lost:
    
        if ((r1 & 1) == 0) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0a75, code lost:
    
        r56.A02 = 0;
        r56.A00 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0b2e, code lost:
    
        r2 = r10.A07.A0A;
        r4 = r10.A01;
        r3 = r2[r4];
        r56.A06 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0b3a, code lost:
    
        if (r4 >= r10.A03) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0b3c, code lost:
    
        r57.Em8(r3);
        r2 = r56.A0E;
        r1 = X.C98424bL.A00(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0b45, code lost:
    
        if (r1 == null) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0b47, code lost:
    
        r4 = r2.A07;
        r3 = r4.A0G;
        r1 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0b4d, code lost:
    
        if (r1 == 0) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0b4f, code lost:
    
        r3.A0H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0b52, code lost:
    
        r2 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0b56, code lost:
    
        if (r4.A07 == false) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0b5c, code lost:
    
        if (r4.A0E[r2] == false) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0b5e, code lost:
    
        r3.A0H(r3.A05() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0b67, code lost:
    
        r4 = r56.A0E;
        r4.A01++;
        r3 = r4.A00 + 1;
        r4.A00 = r3;
        r1 = r4.A07.A0B;
        r2 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0b7d, code lost:
    
        if (r3 != r1[r2]) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0b7f, code lost:
    
        r4.A02 = r2 + 1;
        r4.A00 = 0;
        r56.A0E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0b89, code lost:
    
        r56.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0b8e, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0b93, code lost:
    
        if (r10.A05.A02 != 1) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0b95, code lost:
    
        r56.A06 = r3 - 8;
        r57.Em8(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0b9d, code lost:
    
        r5 = r56.A0E;
        r2 = X.C98424bL.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0ba3, code lost:
    
        if (r2 != null) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0ba5, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0ba6, code lost:
    
        r56.A04 = r3;
        r56.A06 += r3;
        r56.A02 = 4;
        r56.A05 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0bb1, code lost:
    
        r3 = r56.A0E;
        r2 = r3.A07;
        r2 = r3.A05;
        r12 = r3.A06;
        r2 = r3.A01;
        r30 = r2.A0C[r2];
        r2 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0bcb, code lost:
    
        if (r2 == 0) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0bcd, code lost:
    
        r13 = r56.A0P;
        r11 = r13.A02;
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r21 = r2 + 1;
        r20 = 4 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0bdb, code lost:
    
        r2 = r56.A04;
        r3 = r56.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0bdf, code lost:
    
        if (r2 >= r3) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0be1, code lost:
    
        r3 = r56.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0be3, code lost:
    
        if (r3 != 0) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0c41, code lost:
    
        if (r56.A0H == false) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0c43, code lost:
    
        r10 = r56.A0O;
        r10.A0E(r3);
        r57.readFully(r10.A02, 0, r3);
        r12.ELN(r10, r56.A05);
        r4 = r56.A05;
        r3 = X.AbstractC97984ad.A00(r10.A02, r10.A00);
        r10.A0G("video/hevc".equals(r2.A07.A0W) ? 1 : 0);
        r10.A0F(r3);
        r2 = r56.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0c72, code lost:
    
        r8 = r10.A00;
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0c7a, code lost:
    
        if ((r8 - r10.A01) <= 1) goto L772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0c7c, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0c81, code lost:
    
        if ((r8 - r10.A01) != 0) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0d26, code lost:
    
        r3 = r10.A02();
        r5 = r5 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0d2d, code lost:
    
        if (r3 == 255) goto L781;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0c84, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0c89, code lost:
    
        if ((r8 - r10.A01) != 0) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0d1b, code lost:
    
        r2 = r10.A02();
        r3 = r3 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x0d22, code lost:
    
        if (r2 == 255) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0c8c, code lost:
    
        r2 = r10.A01;
        r17 = r2 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0c91, code lost:
    
        if (r3 == (-1)) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0c94, code lost:
    
        if (r3 > (r8 - r2)) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0c96, code lost:
    
        if (r5 != 4) goto L774;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0c9a, code lost:
    
        if (r3 < 8) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0c9c, code lost:
    
        r2 = r10.A02();
        r8 = r10.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0ca6, code lost:
    
        if (r8 != 49) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0ca8, code lost:
    
        r14 = r10.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x0cac, code lost:
    
        r16 = r10.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0cb2, code lost:
    
        if (r8 != 47) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0cb4, code lost:
    
        r10.A0H(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0cb9, code lost:
    
        if (r2 != 181) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0cbb, code lost:
    
        if (r8 == 49) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0cbd, code lost:
    
        if (r8 != 47) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0cbf, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x0cc4, code lost:
    
        if (r16 == 3) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0cc7, code lost:
    
        if (r8 != 49) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0ccc, code lost:
    
        if (r14 == 1195456820) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0cce, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x0cd0, code lost:
    
        r15 = r15 & r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0cd2, code lost:
    
        if (r15 == false) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0cd4, code lost:
    
        r3 = r10.A02();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x0cdb, code lost:
    
        if ((r3 & 64) == 0) goto L777;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0cdd, code lost:
    
        r10.A0H(1);
        r14 = (r3 & 31) * 3;
        r5 = r10.A01;
        r3 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x0ce9, code lost:
    
        if (r8 >= r3) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x0ceb, code lost:
    
        r2 = r2[r8];
        r10.A0G(r5);
        r2.ELN(r10, r14);
        r2.ELT(null, 1, r14, 0, r30);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0d14, code lost:
    
        r10.A0G(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x0cc6, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0d03, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x0d05, code lost:
    
        X.AbstractC46512Bo.A04("CeaUtil", X.AbstractC111324zv.A00(689));
        r17 = r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x0c8b, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x0c83, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0d35, code lost:
    
        r56.A04 += r4;
        r56.A05 -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x0d31, code lost:
    
        r4 = r12.ELR(r57, r3, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x0be5, code lost:
    
        r57.readFully(r11, r20, r21);
        r13.A0G(0);
        r2 = r13.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0bf3, code lost:
    
        if (r2 < 1) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x0bf5, code lost:
    
        r56.A05 = r2 - 1;
        r2 = r56.A0Q;
        r2.A0G(0);
        r12.ELN(r2, 4);
        r12.ELN(r13, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0c07, code lost:
    
        if (r56.A0I.length <= 0) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x0c09, code lost:
    
        r4 = r2.A07.A0W;
        r5 = r11[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x0c17, code lost:
    
        if ("video/avc".equals(r4) == false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0c1c, code lost:
    
        if ((r5 & 31) == 6) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0c2d, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x0c2e, code lost:
    
        r56.A0H = r2;
        r56.A04 += 5;
        r56.A06 += r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x0c24, code lost:
    
        if ("video/hevc".equals(r4) == false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0c2b, code lost:
    
        if (((r5 & 126) >> 1) != 39) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0c3d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x0e2f, code lost:
    
        throw new java.io.IOException("Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x0da7, code lost:
    
        r10 = r2.A0F[r2];
        r5 = r56.A0E;
        r2 = X.C98424bL.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x0db3, code lost:
    
        if (r2 == null) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x0db5, code lost:
    
        r10 = (r10 ? 1 : 0) | X.AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        r4 = r2.A01;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x0dba, code lost:
    
        if (r5 == null) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x0dbc, code lost:
    
        r1 = r5.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x0dbe, code lost:
    
        if (r1 == null) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x0dc6, code lost:
    
        if (r1.A07.A0W != "application/x-mp4-vtt") goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x0dc8, code lost:
    
        r10 = (r10 == true ? 1 : 0) | 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0dca, code lost:
    
        r12.ELT(r4, r10, r3, 0, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x0dd3, code lost:
    
        r2 = r56.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x0dd9, code lost:
    
        if (r2.isEmpty() != false) goto L785;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x0ddb, code lost:
    
        r2 = (X.C72728Xm0) r2.removeFirst();
        r1 = r56.A03;
        r9 = r2.A00;
        r56.A03 = r1 - r9;
        r1 = r2.A01 + r30;
        r8 = r56.A0J;
        r5 = r8.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0df0, code lost:
    
        if (r4 >= r5) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0df2, code lost:
    
        r8[r4].ELT(null, 1, r9, r56.A03, r1);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0e04, code lost:
    
        r4 = r56.A0E;
        r4.A01++;
        r3 = r4.A00 + 1;
        r4.A00 = r3;
        r1 = r4.A07.A0B;
        r2 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x0e1a, code lost:
    
        if (r3 != r1[r2]) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0e1c, code lost:
    
        r4.A02 = r2 + 1;
        r4.A00 = 0;
        r56.A0E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x0e02, code lost:
    
        r4 = null;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0d96, code lost:
    
        r2 = r56.A04;
        r3 = r56.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x0d9a, code lost:
    
        if (r2 >= r3) goto L789;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0d9c, code lost:
    
        r56.A04 += r12.ELR(r57, r3 - r2, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x0d41, code lost:
    
        r10 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x0d43, code lost:
    
        if (r10 == 0) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x0d45, code lost:
    
        r13 = r5.A07.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x0d49, code lost:
    
        r12 = r5.A07;
        r3 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0d4f, code lost:
    
        if (r12.A07 == false) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x0d51, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x0d56, code lost:
    
        if (r12.A0E[r3] != false) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0d59, code lost:
    
        r4 = r5.A09;
        r3 = r4.A02;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0d5e, code lost:
    
        if (r11 == false) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0d60, code lost:
    
        r2 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x0d62, code lost:
    
        r3[0] = (byte) (r2 | r10);
        r4.A0G(0);
        r5 = r5.A06;
        r5.ELN(r4, 1);
        r5.ELN(r13, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x0d71, code lost:
    
        if (r11 != false) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x0d73, code lost:
    
        r3 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x0d80, code lost:
    
        r4 = r12.A0G;
        r3 = r4.A05();
        r4.A0H(-2);
        r2 = (r3 * 6) + 2;
        r5.ELN(r4, r2);
        r3 = (r10 + 1) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0d58, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x0d77, code lost:
    
        r2 = r2.A04;
        r13 = r5.A08;
        r10 = r2.length;
        r13.A0I(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03c6, code lost:
    
        if (r3 == 1701671783) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0e30 A[SYNTHETIC] */
    @Override // X.InterfaceC97954aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7m(X.InterfaceC98284b7 r57, X.C4XJ r58) {
        /*
            Method dump skipped, instructions count: 3640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97944aZ.E7m(X.4b7, X.4XJ):int");
    }

    @Override // X.InterfaceC97954aa
    public final void EMc(long j, long j2) {
        SparseArray sparseArray = this.A0C;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C98424bL) sparseArray.valueAt(i)).A01();
        }
        this.A0T.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0S.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public C97944aZ(InterfaceC98054ak interfaceC98054ak, List list, int i, boolean z) {
        this.A0K = i;
        this.A0U = Collections.unmodifiableList(list);
        this.A0L = interfaceC98054ak;
        this.A0V = z;
        this.A0M = new C97964ab();
        this.A0N = new C97974ac(16);
        this.A0Q = new C97974ac(AbstractC97984ad.A01);
        this.A0P = new C97974ac(5);
        this.A0O = new C97974ac();
        byte[] bArr = new byte[16];
        this.A0W = bArr;
        this.A0R = new C97974ac(bArr);
        this.A0S = new ArrayDeque();
        this.A0T = new ArrayDeque();
        this.A0C = new SparseArray();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A02 = 0;
        this.A00 = 0;
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

    @Override // X.InterfaceC97954aa
    public final void CNm(C4XF c4xf) {
        this.A0D = c4xf;
    }

    public C97944aZ() {
        this(null, Collections.emptyList(), 0, false);
    }
}
