package X;

import com.instagram.api.schemas.MediaNoticeIcon;
import com.instagram.api.schemas.MetaPlaceDict;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.api.schemas.ThreadHeaderStyle;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CXa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28026CXa {
    public static final List A01(List list) {
        C26036BfP c26036BfP;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            InterfaceC132245y2 interfaceC132245y2 = (InterfaceC132245y2) obj;
            if (i == 0) {
                c26036BfP = new C26036BfP(false, false, true, false, false);
            } else {
                boolean z = true;
                if (i == list.size() - 1) {
                    c26036BfP = new C26036BfP(false, false, false, true, false);
                } else {
                    if (i2 >= list.size() || !(list.get(i2) instanceof C6HT)) {
                        z = false;
                    }
                    c26036BfP = new C26036BfP(false, false, false, false, z);
                }
            }
            A0q.add(A00(interfaceC132245y2, c26036BfP));
            i = i2;
        }
        return A0q;
    }

    public static final InterfaceC132245y2 A00(InterfaceC132245y2 interfaceC132245y2, C26036BfP c26036BfP) {
        InterfaceC132245y2 c26148BhZ;
        if (interfaceC132245y2 instanceof C132235y1) {
            C132235y1 c132235y1 = (C132235y1) interfaceC132245y2;
            C132175xv c132175xv = c132235y1.A04;
            ImageUrl imageUrl = c132235y1.A06;
            String str = c132235y1.A0B;
            String str2 = c132235y1.A0F;
            int i = c132235y1.A00;
            FollowStatus followStatus = c132235y1.A07;
            boolean z = c132235y1.A0U;
            boolean z2 = c132235y1.A0O;
            boolean z3 = c132235y1.A0J;
            boolean z4 = c132235y1.A0Q;
            EnumC132215xz enumC132215xz = c132235y1.A03;
            boolean z5 = c132235y1.A0P;
            Double d = c132235y1.A08;
            boolean z6 = c132235y1.A0L;
            boolean z7 = c132235y1.A0G;
            boolean z8 = c132235y1.A0V;
            boolean z9 = c132235y1.A0I;
            boolean z10 = c132235y1.A0H;
            boolean z11 = c132235y1.A0X;
            boolean z12 = c132235y1.A0W;
            TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant = c132235y1.A02;
            boolean z13 = c132235y1.A0N;
            boolean z14 = c132235y1.A0M;
            boolean z15 = c132235y1.A0R;
            String str3 = c132235y1.A0A;
            String str4 = c132235y1.A0E;
            String str5 = c132235y1.A0D;
            boolean z16 = c132235y1.A0Y;
            Long l = c132235y1.A09;
            MetaPlaceDict metaPlaceDict = c132235y1.A01;
            boolean z17 = c132235y1.A0K;
            boolean z18 = c132235y1.A0T;
            boolean z19 = c132235y1.A0S;
            String str6 = c132235y1.A0C;
            AbstractC25233BEq.A0w(0, c132175xv, str, str2);
            AbstractC25229BEm.A1K(followStatus, 6, enumC132215xz);
            C14360o3.A0B(textPostAppHeaderFollowVariant, 21);
            c26148BhZ = new C132235y1(metaPlaceDict, textPostAppHeaderFollowVariant, enumC132215xz, c132175xv, c26036BfP, imageUrl, followStatus, d, l, str, str2, str3, str4, str5, str6, i, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19);
        } else if (interfaceC132245y2 instanceof C6HF) {
            C6HF c6hf = (C6HF) interfaceC132245y2;
            C132175xv c132175xv2 = c6hf.A01;
            boolean z20 = c6hf.A0B;
            ImageUrl imageUrl2 = c6hf.A03;
            String str7 = c6hf.A06;
            String str8 = c6hf.A08;
            FollowStatus followStatus2 = c6hf.A04;
            boolean z21 = c6hf.A0C;
            String str9 = c6hf.A07;
            String str10 = c6hf.A05;
            int i2 = c6hf.A00;
            boolean z22 = c6hf.A0A;
            boolean z23 = c6hf.A09;
            AbstractC25233BEq.A0x(0, c132175xv2, str7, str8);
            AbstractC167007dF.A1I(followStatus2, 6, str9);
            c26148BhZ = new C6HF(c132175xv2, c26036BfP, imageUrl2, followStatus2, str7, str8, str9, str10, i2, z20, z21, z22, z23);
        } else if (interfaceC132245y2 instanceof C69S) {
            C69S c69s = (C69S) interfaceC132245y2;
            C132175xv c132175xv3 = c69s.A00;
            C5Hc c5Hc = c69s.A03;
            boolean z24 = c69s.A05;
            boolean z25 = c69s.A06;
            boolean z26 = c69s.A04;
            boolean z27 = c69s.A07;
            Integer num = c69s.A02;
            AbstractC167017dG.A1O(c132175xv3, c5Hc);
            c26148BhZ = new C69S(c132175xv3, c26036BfP, num, c5Hc, z24, z25, z26, z27);
        } else if (interfaceC132245y2 instanceof C132325yB) {
            C132325yB c132325yB = (C132325yB) interfaceC132245y2;
            C132175xv c132175xv4 = c132325yB.A02;
            int i3 = c132325yB.A00;
            boolean z28 = c132325yB.A0B;
            int i4 = c132325yB.A01;
            boolean z29 = c132325yB.A0C;
            boolean z30 = c132325yB.A08;
            C5Hc c5Hc2 = c132325yB.A06;
            boolean z31 = c132325yB.A07;
            boolean z32 = c132325yB.A09;
            boolean z33 = c132325yB.A0E;
            boolean z34 = c132325yB.A0D;
            C132275y6 c132275y6 = c132325yB.A05;
            InterfaceC132315yA interfaceC132315yA = c132325yB.A04;
            boolean z35 = c132325yB.A0A;
            AbstractC167007dF.A1H(c132175xv4, 0, c5Hc2);
            c26148BhZ = new C132325yB(c132175xv4, c26036BfP, interfaceC132315yA, c132275y6, c5Hc2, i3, i4, z28, z29, z30, z31, z32, z33, z34, z35);
        } else if (interfaceC132245y2 instanceof C6HT) {
            C6HT c6ht = (C6HT) interfaceC132245y2;
            C132175xv c132175xv5 = c6ht.A05;
            int i5 = c6ht.A00;
            int i6 = c6ht.A01;
            int i7 = c6ht.A02;
            int i8 = c6ht.A03;
            boolean z36 = c6ht.A0H;
            boolean z37 = c6ht.A0I;
            boolean z38 = c6ht.A0F;
            boolean z39 = c6ht.A0C;
            boolean z40 = c6ht.A0A;
            boolean z41 = c6ht.A0D;
            boolean z42 = c6ht.A0B;
            boolean z43 = c6ht.A0M;
            boolean z44 = c6ht.A0L;
            String str11 = c6ht.A08;
            C132275y6 c132275y62 = c6ht.A07;
            RepostRestrictedReason repostRestrictedReason = c6ht.A04;
            C5Hc c5Hc3 = c6ht.A09;
            boolean z45 = c6ht.A0G;
            boolean z46 = c6ht.A0J;
            boolean z47 = c6ht.A0E;
            boolean z48 = c6ht.A0K;
            C14360o3.A0B(c132175xv5, 0);
            C14360o3.A0B(c5Hc3, 18);
            c26148BhZ = new C6HT(repostRestrictedReason, c132175xv5, c26036BfP, c132275y62, str11, c5Hc3, i5, i6, i7, i8, z36, z37, z38, z39, z40, z41, z42, z43, z44, z45, z46, z47, z48);
        } else if (C9BY.A00(interfaceC132245y2, 0)) {
            C132175xv c132175xv6 = (C132175xv) ((C9BY) interfaceC132245y2).A02;
            C14360o3.A0B(c132175xv6, 0);
            c26148BhZ = new C9BY(c132175xv6, c26036BfP, 0);
        } else if (interfaceC132245y2 instanceof C26146BhX) {
            C26146BhX c26146BhX = (C26146BhX) interfaceC132245y2;
            C132175xv c132175xv7 = c26146BhX.A00;
            boolean z49 = c26146BhX.A02;
            C14360o3.A0B(c132175xv7, 0);
            c26148BhZ = new C26146BhX(c132175xv7, c26036BfP, z49);
        } else if (interfaceC132245y2 instanceof C6HU) {
            C6HU c6hu = (C6HU) interfaceC132245y2;
            C132175xv c132175xv8 = c6hu.A01;
            int i9 = c6hu.A00;
            C5Hc c5Hc4 = c6hu.A02;
            boolean z50 = c6hu.A03;
            AbstractC167007dF.A1E(c132175xv8, 0, c5Hc4);
            c26148BhZ = new C6HU(c132175xv8, c26036BfP, c5Hc4, i9, z50);
        } else if (C26156Bhh.A00(interfaceC132245y2, 0)) {
            C26156Bhh c26156Bhh = (C26156Bhh) interfaceC132245y2;
            C132175xv c132175xv9 = (C132175xv) c26156Bhh.A03;
            boolean z51 = c26156Bhh.A05;
            InterfaceC109864xE interfaceC109864xE = (InterfaceC109864xE) c26156Bhh.A01;
            C14360o3.A0B(c132175xv9, 0);
            c26148BhZ = new C26156Bhh(interfaceC109864xE, c132175xv9, c26036BfP, 0, z51);
        } else if (C26156Bhh.A00(interfaceC132245y2, 1)) {
            C26156Bhh c26156Bhh2 = (C26156Bhh) interfaceC132245y2;
            C132175xv c132175xv10 = (C132175xv) c26156Bhh2.A03;
            boolean z52 = c26156Bhh2.A05;
            InterfaceC109864xE interfaceC109864xE2 = (InterfaceC109864xE) c26156Bhh2.A01;
            C14360o3.A0B(c132175xv10, 0);
            c26148BhZ = new C26156Bhh(interfaceC109864xE2, c132175xv10, c26036BfP, 1, z52);
        } else if (C26155Bhg.A00(interfaceC132245y2, 1)) {
            C132175xv c132175xv11 = (C132175xv) ((C26155Bhg) interfaceC132245y2).A02;
            C14360o3.A0B(c132175xv11, 0);
            c26148BhZ = new C26155Bhg(c132175xv11, c26036BfP, 1);
        } else if (interfaceC132245y2 instanceof C26150Bhb) {
            C26150Bhb c26150Bhb = (C26150Bhb) interfaceC132245y2;
            C132175xv c132175xv12 = c26150Bhb.A00;
            boolean z53 = c26150Bhb.A03;
            String str12 = c26150Bhb.A01;
            C5Hc c5Hc5 = c26150Bhb.A02;
            C14360o3.A0B(c132175xv12, 0);
            c26148BhZ = new C26150Bhb(c132175xv12, c26036BfP, str12, c5Hc5, z53);
        } else if (interfaceC132245y2 instanceof C6HI) {
            C6HI c6hi = (C6HI) interfaceC132245y2;
            C132175xv c132175xv13 = c6hi.A01;
            boolean z54 = c6hi.A03;
            C45123Jxs c45123Jxs = c6hi.A00;
            boolean z55 = c6hi.A04;
            AbstractC167007dF.A1E(c132175xv13, 0, c45123Jxs);
            c26148BhZ = new C6HI(c45123Jxs, c132175xv13, c26036BfP, z54, z55);
        } else if (C9C5.A00(interfaceC132245y2, 0)) {
            C9C5 c9c5 = (C9C5) interfaceC132245y2;
            C132175xv c132175xv14 = (C132175xv) c9c5.A04;
            boolean z56 = c9c5.A06;
            InterfaceC132185xw interfaceC132185xw = (InterfaceC132185xw) c9c5.A02;
            C38641Gyi c38641Gyi = (C38641Gyi) c9c5.A01;
            AbstractC25233BEq.A0w(0, c132175xv14, interfaceC132185xw, c38641Gyi);
            c26148BhZ = new C9C5(c132175xv14, c26036BfP, interfaceC132185xw, c38641Gyi, z56);
        } else if (C26157Bhi.A00(interfaceC132245y2, 0)) {
            C26157Bhi c26157Bhi = (C26157Bhi) interfaceC132245y2;
            C132175xv c132175xv15 = (C132175xv) c26157Bhi.A03;
            MediaNoticeIcon mediaNoticeIcon = (MediaNoticeIcon) c26157Bhi.A01;
            String str13 = c26157Bhi.A07;
            String str14 = c26157Bhi.A06;
            String str15 = c26157Bhi.A05;
            AbstractC167027dH.A0a(0, c132175xv15, mediaNoticeIcon, str13, str14);
            C14360o3.A0B(str15, 5);
            c26148BhZ = new C26157Bhi(mediaNoticeIcon, c132175xv15, c26036BfP, str13, str14, str15);
        } else if (C26155Bhg.A00(interfaceC132245y2, 0)) {
            C132175xv c132175xv16 = (C132175xv) ((C26155Bhg) interfaceC132245y2).A02;
            C14360o3.A0B(c132175xv16, 0);
            c26148BhZ = new C26155Bhg(c132175xv16, c26036BfP, 0);
        } else if (C9BY.A00(interfaceC132245y2, 1)) {
            C132175xv c132175xv17 = (C132175xv) ((C9BY) interfaceC132245y2).A02;
            C14360o3.A0B(c132175xv17, 0);
            c26148BhZ = new C9BY(c132175xv17, c26036BfP, 1);
        } else if (interfaceC132245y2 instanceof C6HH) {
            C6HH c6hh = (C6HH) interfaceC132245y2;
            C132175xv c132175xv18 = c6hh.A01;
            C25999Ben c25999Ben = c6hh.A00;
            AbstractC167007dF.A1D(c132175xv18, 0, c25999Ben);
            c26148BhZ = new C6HH(c25999Ben, c132175xv18, c26036BfP);
        } else if (interfaceC132245y2 instanceof C6HW) {
            C6HW c6hw = (C6HW) interfaceC132245y2;
            C132175xv c132175xv19 = c6hw.A00;
            boolean z57 = c6hw.A02;
            boolean z58 = c6hw.A01;
            C14360o3.A0B(c132175xv19, 0);
            c26148BhZ = new C6HW(c132175xv19, c26036BfP, z57, z58);
        } else if (interfaceC132245y2 instanceof C6HX) {
            C6HX c6hx = (C6HX) interfaceC132245y2;
            C132175xv c132175xv20 = c6hx.A02;
            String str16 = c6hx.A03;
            int i10 = c6hx.A00;
            int i11 = c6hx.A01;
            C5Hc c5Hc6 = c6hx.A04;
            AbstractC167007dF.A1D(c132175xv20, 0, str16);
            C14360o3.A0B(c5Hc6, 5);
            c26148BhZ = new C6HX(c132175xv20, c26036BfP, str16, c5Hc6, i10, i11);
        } else if (interfaceC132245y2 instanceof C26154Bhf) {
            C26154Bhf c26154Bhf = (C26154Bhf) interfaceC132245y2;
            C132175xv c132175xv21 = c26154Bhf.A01;
            boolean z59 = c26154Bhf.A08;
            C26024BfD c26024BfD = c26154Bhf.A04;
            boolean z60 = c26154Bhf.A07;
            boolean z61 = c26154Bhf.A0A;
            boolean z62 = c26154Bhf.A09;
            InterfaceC132315yA interfaceC132315yA2 = c26154Bhf.A03;
            boolean z63 = c26154Bhf.A06;
            int i12 = c26154Bhf.A00;
            boolean z64 = c26154Bhf.A0B;
            Integer num2 = c26154Bhf.A05;
            C14360o3.A0B(c132175xv21, 0);
            c26148BhZ = new C26154Bhf(c132175xv21, c26036BfP, interfaceC132315yA2, c26024BfD, num2, i12, z59, z60, z61, z62, z63, z64);
        } else if (interfaceC132245y2 instanceof C26153Bhe) {
            C26153Bhe c26153Bhe = (C26153Bhe) interfaceC132245y2;
            C132175xv c132175xv22 = c26153Bhe.A02;
            boolean z65 = c26153Bhe.A08;
            boolean z66 = c26153Bhe.A07;
            String str17 = c26153Bhe.A05;
            String str18 = c26153Bhe.A06;
            int i13 = c26153Bhe.A00;
            InterfaceC132315yA interfaceC132315yA3 = c26153Bhe.A04;
            int i14 = c26153Bhe.A01;
            C14360o3.A0B(c132175xv22, 0);
            c26148BhZ = new C26153Bhe(c132175xv22, c26036BfP, interfaceC132315yA3, str17, str18, i13, i14, z65, z66);
        } else if (interfaceC132245y2 instanceof C26147BhY) {
            C26147BhY c26147BhY = (C26147BhY) interfaceC132245y2;
            C132175xv c132175xv23 = c26147BhY.A00;
            String str19 = c26147BhY.A01;
            boolean z67 = c26147BhY.A02;
            AbstractC167007dF.A1D(c132175xv23, 0, str19);
            c26148BhZ = new C26147BhY(c132175xv23, c26036BfP, str19, z67);
        } else if (interfaceC132245y2 instanceof C26151Bhc) {
            C26151Bhc c26151Bhc = (C26151Bhc) interfaceC132245y2;
            C132175xv c132175xv24 = c26151Bhc.A00;
            String str20 = c26151Bhc.A07;
            String str21 = c26151Bhc.A02;
            String str22 = c26151Bhc.A05;
            String str23 = c26151Bhc.A06;
            String str24 = c26151Bhc.A04;
            String str25 = c26151Bhc.A03;
            AbstractC25233BEq.A0v(0, c132175xv24, str20, str21);
            c26148BhZ = new C26151Bhc(c132175xv24, c26036BfP, str20, str21, str22, str23, str24, str25);
        } else if (C9CF.A00(interfaceC132245y2, 1)) {
            C9CF c9cf = (C9CF) interfaceC132245y2;
            C132175xv c132175xv25 = (C132175xv) c9cf.A02;
            String str26 = c9cf.A04;
            String str27 = c9cf.A03;
            AbstractC25233BEq.A0v(0, c132175xv25, str26, str27);
            c26148BhZ = new C9CF(c132175xv25, c26036BfP, str26, str27, 1);
        } else if (interfaceC132245y2 instanceof C132285y7) {
            C132285y7 c132285y7 = (C132285y7) interfaceC132245y2;
            C132175xv c132175xv26 = c132285y7.A00;
            InterfaceC132185xw interfaceC132185xw2 = c132285y7.A02;
            boolean z68 = c132285y7.A05;
            boolean z69 = c132285y7.A07;
            boolean z70 = c132285y7.A06;
            boolean z71 = c132285y7.A04;
            boolean z72 = c132285y7.A08;
            boolean z73 = c132285y7.A09;
            Integer num3 = c132285y7.A03;
            AbstractC167007dF.A1D(c132175xv26, 0, interfaceC132185xw2);
            c26148BhZ = new C132285y7(c132175xv26, c26036BfP, interfaceC132185xw2, num3, z68, z69, z70, z71, z72, z73);
        } else if (interfaceC132245y2 instanceof C132265y5) {
            C132265y5 c132265y5 = (C132265y5) interfaceC132245y2;
            C132175xv c132175xv27 = c132265y5.A03;
            int i15 = c132265y5.A00;
            String str28 = c132265y5.A07;
            boolean z74 = c132265y5.A0A;
            int i16 = c132265y5.A01;
            EnumC132255y4 enumC132255y4 = c132265y5.A05;
            C132275y6 c132275y63 = c132265y5.A06;
            InterfaceC99414dE interfaceC99414dE = c132265y5.A02;
            boolean z75 = c132265y5.A0C;
            boolean z76 = c132265y5.A0B;
            boolean z77 = c132265y5.A0D;
            boolean z78 = c132265y5.A08;
            boolean z79 = c132265y5.A09;
            AbstractC167007dF.A1E(c132175xv27, 0, str28);
            C14360o3.A0B(enumC132255y4, 6);
            c26148BhZ = new C132265y5(interfaceC99414dE, c132175xv27, c26036BfP, enumC132255y4, c132275y63, str28, i15, i16, z74, z75, z76, z77, z78, z79);
        } else if (interfaceC132245y2 instanceof C6HE) {
            C6HE c6he = (C6HE) interfaceC132245y2;
            C132175xv c132175xv28 = c6he.A03;
            int i17 = c6he.A00;
            int i18 = c6he.A01;
            String str29 = c6he.A08;
            boolean z80 = c6he.A0A;
            EnumC132255y4 enumC132255y42 = c6he.A05;
            C132275y6 c132275y64 = c6he.A07;
            InterfaceC99414dE interfaceC99414dE2 = c6he.A02;
            InterfaceC132185xw interfaceC132185xw3 = c6he.A06;
            boolean z81 = c6he.A0B;
            boolean z82 = c6he.A09;
            boolean z83 = c6he.A0C;
            boolean z84 = c6he.A0D;
            AbstractC25229BEm.A1I(c132175xv28, 0, enumC132255y42);
            c26148BhZ = new C6HE(interfaceC99414dE2, c132175xv28, c26036BfP, enumC132255y42, interfaceC132185xw3, c132275y64, str29, i17, i18, z80, z81, z82, z83, z84);
        } else if (interfaceC132245y2 instanceof C26149Bha) {
            C26149Bha c26149Bha = (C26149Bha) interfaceC132245y2;
            C132175xv c132175xv29 = c26149Bha.A02;
            String str30 = c26149Bha.A03;
            ThreadHeaderStyle threadHeaderStyle = c26149Bha.A01;
            int i19 = c26149Bha.A00;
            AbstractC167007dF.A1D(c132175xv29, 0, str30);
            c26148BhZ = new C26149Bha(threadHeaderStyle, c132175xv29, c26036BfP, str30, i19);
        } else if (C9C5.A00(interfaceC132245y2, 1)) {
            C9C5 c9c52 = (C9C5) interfaceC132245y2;
            C132175xv c132175xv30 = (C132175xv) c9c52.A02;
            boolean z85 = c9c52.A06;
            Integer num4 = (Integer) c9c52.A03;
            AbstractC167007dF.A1E(c132175xv30, 0, num4);
            c26148BhZ = new C9C5(c132175xv30, c26036BfP, num4, z85);
        } else if (C9CF.A00(interfaceC132245y2, 2)) {
            C9CF c9cf2 = (C9CF) interfaceC132245y2;
            C132175xv c132175xv31 = (C132175xv) c9cf2.A02;
            String str31 = c9cf2.A03;
            String str32 = c9cf2.A04;
            C14360o3.A0B(c132175xv31, 0);
            AbstractC167007dF.A1E(str31, 2, str32);
            c26148BhZ = new C9CF(c132175xv31, c26036BfP, str31, str32, 2);
        } else if (interfaceC132245y2 instanceof C132305y9) {
            C132305y9 c132305y9 = (C132305y9) interfaceC132245y2;
            C132175xv c132175xv32 = c132305y9.A01;
            boolean z86 = c132305y9.A0D;
            boolean z87 = c132305y9.A0E;
            boolean z88 = c132305y9.A0B;
            boolean z89 = c132305y9.A08;
            boolean z90 = c132305y9.A06;
            boolean z91 = c132305y9.A09;
            boolean z92 = c132305y9.A07;
            boolean z93 = c132305y9.A0G;
            String str33 = c132305y9.A05;
            boolean z94 = c132305y9.A0I;
            boolean z95 = c132305y9.A0H;
            C132275y6 c132275y65 = c132305y9.A04;
            InterfaceC132315yA interfaceC132315yA4 = c132305y9.A03;
            RepostRestrictedReason repostRestrictedReason2 = c132305y9.A00;
            boolean z96 = c132305y9.A0C;
            boolean z97 = c132305y9.A0F;
            boolean z98 = c132305y9.A0A;
            C14360o3.A0B(c132175xv32, 0);
            c26148BhZ = new C132305y9(repostRestrictedReason2, c132175xv32, c26036BfP, interfaceC132315yA4, c132275y65, str33, z86, z87, z88, z89, z90, z91, z92, z93, z94, z95, z96, z97, z98);
        } else if (interfaceC132245y2 instanceof C26152Bhd) {
            C26152Bhd c26152Bhd = (C26152Bhd) interfaceC132245y2;
            C132175xv c132175xv33 = c26152Bhd.A00;
            String str34 = c26152Bhd.A03;
            String str35 = c26152Bhd.A02;
            Integer num5 = c26152Bhd.A01;
            boolean z99 = c26152Bhd.A04;
            AbstractC167007dF.A1F(c132175xv33, 0, num5);
            c26148BhZ = new C26152Bhd(c132175xv33, c26036BfP, num5, str34, str35, z99);
        } else if (interfaceC132245y2 instanceof C6HG) {
            C6HG c6hg = (C6HG) interfaceC132245y2;
            C132175xv c132175xv34 = c6hg.A02;
            String str36 = c6hg.A07;
            C25996Bek c25996Bek = c6hg.A05;
            boolean z100 = c6hg.A08;
            String str37 = c6hg.A06;
            int i20 = c6hg.A00;
            EnumC132255y4 enumC132255y43 = c6hg.A04;
            int i21 = c6hg.A01;
            C14360o3.A0B(c132175xv34, 0);
            AbstractC167007dF.A1E(str36, 2, c25996Bek);
            C14360o3.A0B(enumC132255y43, 7);
            c26148BhZ = new C6HG(c132175xv34, c26036BfP, enumC132255y43, c25996Bek, str36, str37, i20, i21, z100);
        } else if (C9CF.A00(interfaceC132245y2, 0)) {
            C9CF c9cf3 = (C9CF) interfaceC132245y2;
            C132175xv c132175xv35 = (C132175xv) c9cf3.A02;
            String str38 = c9cf3.A04;
            String str39 = c9cf3.A03;
            C14360o3.A0B(c132175xv35, 0);
            AbstractC167007dF.A1E(str38, 2, str39);
            c26148BhZ = new C9CF(c132175xv35, c26036BfP, str38, str39, 0);
        } else if (interfaceC132245y2 instanceof C6HV) {
            C6HV c6hv = (C6HV) interfaceC132245y2;
            C132175xv c132175xv36 = c6hv.A00;
            C5Hc c5Hc7 = c6hv.A01;
            C14360o3.A0B(c132175xv36, 0);
            C14360o3.A0B(c5Hc7, 2);
            c26148BhZ = new C6HV(c132175xv36, c26036BfP, c5Hc7);
        } else if (C26157Bhi.A00(interfaceC132245y2, 1)) {
            C26157Bhi c26157Bhi2 = (C26157Bhi) interfaceC132245y2;
            C132175xv c132175xv37 = (C132175xv) c26157Bhi2.A03;
            String str40 = c26157Bhi2.A06;
            String str41 = c26157Bhi2.A07;
            String str42 = c26157Bhi2.A05;
            String str43 = c26157Bhi2.A04;
            ImageUrl imageUrl3 = (ImageUrl) c26157Bhi2.A01;
            AbstractC167007dF.A1E(c132175xv37, 0, str41);
            c26148BhZ = new C26157Bhi(c132175xv37, c26036BfP, imageUrl3, str40, str41, str42, str43);
        } else if (interfaceC132245y2 instanceof C26148BhZ) {
            C26148BhZ c26148BhZ2 = (C26148BhZ) interfaceC132245y2;
            C132175xv c132175xv38 = c26148BhZ2.A00;
            String str44 = c26148BhZ2.A01;
            String str45 = c26148BhZ2.A02;
            boolean z101 = c26148BhZ2.A03;
            C14360o3.A0B(c132175xv38, 0);
            AbstractC167007dF.A1E(str44, 2, str45);
            c26148BhZ = new C26148BhZ(c132175xv38, c26036BfP, str44, str45, z101);
        } else {
            throw B4Z.A00();
        }
        return c26148BhZ;
    }
}
