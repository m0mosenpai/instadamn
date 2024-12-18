package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.I6c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40800I6c {
    public static final AbstractC42328Ioq A00(UserSession userSession, IJD ijd) {
        String str;
        Integer num;
        Integer num2;
        C14360o3.A0B(ijd, 0);
        Integer num3 = ijd.A02;
        C45095JxP c45095JxP = null;
        r5 = null;
        IIR iir = null;
        r5 = null;
        C39354HZt c39354HZt = null;
        if (num3 == null) {
            return null;
        }
        String str2 = ijd.A03;
        C41175IKo c41175IKo = ijd.A00;
        boolean z = ijd.A04;
        C38618GyL c38618GyL = ijd.A01;
        boolean z2 = true;
        boolean A1O = AbstractC167007dF.A1O(c38618GyL.A01);
        boolean z3 = c38618GyL.A03;
        if (c38618GyL.A00 <= 0) {
            z2 = false;
        }
        C41586IaZ c41586IaZ = new C41586IaZ(A1O, z3, z2, c38618GyL.A02);
        switch (num3.intValue()) {
            case 2:
                C14360o3.A0A(str2);
                C14360o3.A0B(str2, 1);
                return new AbstractC42328Ioq(c41586IaZ, C05F.A0C, str2, z);
            case 3:
                C40968ICp c40968ICp = c41175IKo.A04;
                if (c40968ICp != null) {
                    IFU ifu = c40968ICp.A00;
                    C103434lJ c103434lJ = ifu.A00;
                    if (c103434lJ == null) {
                        String str3 = ifu.A01;
                        C14360o3.A06(str3);
                        c103434lJ = AbstractC102744kB.A01(str3);
                        if (c103434lJ == null) {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    C1338462s A02 = C1338462s.A02(null, c103434lJ.A01());
                    C14360o3.A0A(str2);
                    C14360o3.A0A(A02);
                    return new C39340HZf(A02, c41586IaZ, str2, z);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 4:
                C14360o3.A0A(str2);
                C41146IJl c41146IJl = c41175IKo.A05;
                C14360o3.A0A(c41146IJl);
                String str4 = c41146IJl.A02;
                C14360o3.A06(str4);
                C41146IJl c41146IJl2 = c41175IKo.A05;
                C14360o3.A0A(c41146IJl2);
                String str5 = c41146IJl2.A04;
                C14360o3.A06(str5);
                C41146IJl c41146IJl3 = c41175IKo.A05;
                C14360o3.A0A(c41146IJl3);
                String str6 = c41146IJl3.A03;
                C41146IJl c41146IJl4 = c41175IKo.A05;
                C14360o3.A0A(c41146IJl4);
                boolean z4 = c41146IJl4.A05;
                C41146IJl c41146IJl5 = c41175IKo.A05;
                C14360o3.A0A(c41146IJl5);
                Integer num4 = c41146IJl5.A01;
                C14360o3.A06(num4);
                C41146IJl c41146IJl6 = c41175IKo.A05;
                C14360o3.A0A(c41146IJl6);
                return new C39347HZm(c41586IaZ, c41146IJl6.A00, num4, str2, str4, str5, str6, null, z, z4, false);
            case 7:
                C14360o3.A0A(str2);
                IIJ iij = c41175IKo.A08;
                C14360o3.A0A(iij);
                String str7 = iij.A02;
                C14360o3.A06(str7);
                IIJ iij2 = c41175IKo.A08;
                C14360o3.A0A(iij2);
                boolean z5 = iij2.A03;
                IIJ iij3 = c41175IKo.A08;
                C14360o3.A0A(iij3);
                Integer num5 = iij3.A00;
                IIJ iij4 = c41175IKo.A08;
                C14360o3.A0A(iij4);
                Integer num6 = iij4.A01;
                C14360o3.A06(num6);
                return new C39343HZi(c41586IaZ, num5, num6, str2, str7, z, z5);
            case 8:
                if (userSession == null) {
                    C0w9.A03("ProductDetailsPageParser", "Tried to parse HERO_CAROUSEL section with null userSession");
                    return null;
                }
                IFV ifv = c41175IKo.A09;
                if (ifv != null) {
                    List list = ifv.A01;
                    C14360o3.A06(list);
                    ArrayList A022 = AbstractC41661Ibt.A02(userSession, list);
                    IJ9 ij9 = ifv.A00;
                    if (ij9 != null && (str = ij9.A00.A03) != null) {
                        c39354HZt = AbstractC41661Ibt.A00(ij9, str);
                    }
                    C14360o3.A0A(str2);
                    return new C39341HZg(c41586IaZ, c39354HZt, str2, A022, z, false);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 11:
                IJC ijc = c41175IKo.A0A;
                if (ijc != null) {
                    IIK iik = ijc.A00;
                    if (iik != null && (num = iik.A01) != null) {
                        iir = new IIR(iik.A00, num, iik.A03, iik.A02);
                    }
                    String str8 = ijc.A04;
                    Integer num7 = ijc.A03;
                    C14360o3.A0A(num7);
                    return new C39344HZj(c41586IaZ, ijc.A01, iir, ijc.A02, num7, str2, str8, z);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C41147IJm c41147IJm = c41175IKo.A0B;
                if (c41147IJm != null) {
                    C14360o3.A0A(str2);
                    String str9 = c41147IJm.A04;
                    C14360o3.A06(str9);
                    Integer num8 = c41147IJm.A03;
                    C14360o3.A0A(num8);
                    C74293Vk c74293Vk = c41147IJm.A00;
                    C38883HAf c38883HAf = c41147IJm.A02;
                    C40973ICu c40973ICu = c41147IJm.A01;
                    if (c40973ICu == null || (num2 = c40973ICu.A00) == null) {
                        num2 = C05F.A00;
                    }
                    return new C39345HZk(c74293Vk, c38883HAf, c41586IaZ, num8, num2, str2, str9, z, c41147IJm.A05);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 23:
                C41079IGw c41079IGw = c41175IKo.A0G;
                if (c41079IGw != null) {
                    return new C39342HZh(c41586IaZ, c41079IGw.A00, str2, c41079IGw.A01, z, c41079IGw.A02);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 25:
                C14360o3.A0A(str2);
                C14360o3.A0B(str2, 1);
                return new AbstractC42328Ioq(c41586IaZ, C05F.A0I, str2, z);
            case 28:
                C14360o3.A0A(str2);
                C38819H7k c38819H7k = c41175IKo.A07.A00;
                C14360o3.A06(c38819H7k);
                C41033IFc c41033IFc = c41175IKo.A07.A02.A02;
                C14360o3.A06(c41033IFc);
                C41033IFc c41033IFc2 = c41175IKo.A07.A02.A00;
                C14360o3.A06(c41033IFc2);
                C41033IFc c41033IFc3 = c41175IKo.A07.A02.A01;
                C14360o3.A06(c41033IFc3);
                String str10 = c41175IKo.A07.A02.A03;
                C14360o3.A06(str10);
                IJA ija = c41175IKo.A07.A01;
                if (ija != null) {
                    int i = ija.A00;
                    String str11 = ija.A04;
                    C14360o3.A06(str11);
                    String str12 = ija.A03;
                    C14360o3.A06(str12);
                    String str13 = ija.A01;
                    C14360o3.A06(str13);
                    String str14 = ija.A02;
                    C14360o3.A06(str14);
                    c45095JxP = new C45095JxP(str11, str12, i, str13, str14);
                }
                return new C39346HZl(c45095JxP, c38819H7k, c41586IaZ, c41033IFc, c41033IFc2, c41033IFc3, str2, str10, z);
            default:
                C0w9.A03("ProductDetailsPageParser", AnonymousClass001.A0g("Unsupported section response of type ", I88.A00(num3), " parsed with parseSectionModel"));
                return null;
        }
    }
}
