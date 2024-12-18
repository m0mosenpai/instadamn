package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ClientDisplayMethod;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaInfo;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gmy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37956Gmy extends C17T implements InterfaceC38901rP {
    public Map A00;
    public C5FP A01;
    public User A02;
    public List A03;
    public List A04;
    public List A05;

    @Override // X.InterfaceC38901rP
    public final /* synthetic */ C72859XpF AKi() {
        return new C72859XpF(this);
    }

    @Override // X.InterfaceC38901rP
    public final C5FH AeV() {
        return (C5FH) A05(1870032591, HO3.class);
    }

    @Override // X.InterfaceC38901rP
    public final C5FJ Ale() {
        return (C5FJ) A05(-1077203130, C39296HWa.class);
    }

    @Override // X.InterfaceC38901rP
    public final List Am4() {
        return A08(-621740981, HNR.class);
    }

    @Override // X.InterfaceC38901rP
    public final List Aph() {
        return this.A03;
    }

    @Override // X.InterfaceC38901rP
    public final List B07() {
        return this.A04;
    }

    @Override // X.InterfaceC38901rP
    public final List B4l() {
        return A08(1100400847, HOv.class);
    }

    @Override // X.InterfaceC38901rP
    public final CommentGiphyMediaInfoIntf B9s() {
        return (CommentGiphyMediaInfoIntf) A05(-1436406007, ImmutablePandoCommentGiphyMediaInfo.class);
    }

    @Override // X.InterfaceC38901rP
    public final C5FM BH1() {
        return (C5FM) A05(132339363, HO7.class);
    }

    @Override // X.InterfaceC38901rP
    public final ClientDisplayMethod BHo() {
        return (ClientDisplayMethod) A0N(-2006428187, C38003Gno.A00);
    }

    @Override // X.InterfaceC38901rP
    public final InterfaceC110874yz BKr() {
        return (InterfaceC110874yz) A05(50528879, HWd.class);
    }

    @Override // X.InterfaceC38901rP
    public final C5FP BR3() {
        C5FP c5fp = this.A01;
        if (c5fp == null) {
            return (C5FP) A05(1939536937, C39293HVu.class);
        }
        return c5fp;
    }

    @Override // X.InterfaceC38901rP
    public final Map BSP() {
        Map map = this.A00;
        if (map == null) {
            return null;
        }
        return map;
    }

    @Override // X.InterfaceC38901rP
    public final List Bfk() {
        List list = this.A05;
        if (list == null) {
            return A08(-795108594, C37956Gmy.class);
        }
        return list;
    }

    @Override // X.InterfaceC38901rP
    public final PrivateReplyStatus Bgi() {
        return (PrivateReplyStatus) A0N(-1482485725, C37957Gmz.A00);
    }

    @Override // X.InterfaceC38901rP
    public final CommentRestrictStatus Boq() {
        return (CommentRestrictStatus) A0N(-1016940458, C38004Gnp.A00);
    }

    @Override // X.InterfaceC38901rP
    public final User CDj() {
        return this.A02;
    }

    @Override // X.InterfaceC38901rP
    public final InterfaceC38901rP EBK(C1DY c1dy) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ImmutableList A08 = A08(-1095989798, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A03 = arrayList;
        ImmutableList A082 = A08(486741610, ImmutablePandoUserDict.class);
        if (A082 != null) {
            arrayList2 = AbstractC167017dG.A0q(A082);
            Iterator<E> it2 = A082.iterator();
            while (it2.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        this.A04 = arrayList2;
        C5FP BR3 = BR3();
        ArrayList arrayList3 = null;
        if (BR3 != null) {
            BR3.EBL(c1dy);
        } else {
            BR3 = null;
        }
        this.A01 = BR3;
        Map map = this.A00;
        if (map == null) {
            map = null;
        }
        this.A00 = map;
        List<InterfaceC38901rP> Bfk = Bfk();
        if (Bfk != null) {
            arrayList3 = AbstractC167017dG.A0q(Bfk);
            for (InterfaceC38901rP interfaceC38901rP : Bfk) {
                interfaceC38901rP.EBK(c1dy);
                arrayList3.add(interfaceC38901rP);
            }
        }
        this.A05 = arrayList3;
        this.A02 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    @Override // X.InterfaceC38901rP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C38891rO F4U(X.C1DY r77) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37956Gmy.F4U(X.1DY):X.1rO");
    }

    @Override // X.InterfaceC38901rP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, XMJ.A01(this));
    }

    @Override // X.InterfaceC38901rP
    public final String Aeu() {
        return A0i(305089521);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean AlD() {
        return getOptionalBooleanValueByHashCode(-283409056);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean AlM() {
        return getOptionalBooleanValueByHashCode(-1396240391);
    }

    @Override // X.InterfaceC38901rP
    public final Integer AnX() {
        return getOptionalIntValueByHashCode(1267713356);
    }

    @Override // X.InterfaceC38901rP
    public final Integer AnY() {
        return getOptionalIntValueByHashCode(1273208079);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean ApZ() {
        return getOptionalBooleanValueByHashCode(24600275);
    }

    @Override // X.InterfaceC38901rP
    public final Integer Apa() {
        return getOptionalIntValueByHashCode(-1115490574);
    }

    @Override // X.InterfaceC38901rP
    public final Integer Apd() {
        return getOptionalIntValueByHashCode(1921522759);
    }

    @Override // X.InterfaceC38901rP
    public final Long Asa() {
        return A0L(1369680106);
    }

    @Override // X.InterfaceC38901rP
    public final Long Asc() {
        return A0L(345905359);
    }

    @Override // X.InterfaceC38901rP
    public final String AwB() {
        return A0i(549275112);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean AxM() {
        return getOptionalBooleanValueByHashCode(1217885931);
    }

    @Override // X.InterfaceC38901rP
    public final List Aym() {
        return getOptionalStringListByHashCode(-1555260660);
    }

    @Override // X.InterfaceC38901rP
    public final Integer B6i() {
        return getOptionalIntValueByHashCode(105301171);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BC2() {
        return getOptionalBooleanValueByHashCode(2143988456);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BC8() {
        return getOptionalBooleanValueByHashCode(1633569809);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BCA() {
        return getOptionalBooleanValueByHashCode(-2064566367);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BCr() {
        return getOptionalBooleanValueByHashCode(-1472279412);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BDu() {
        return getOptionalBooleanValueByHashCode(-1930057933);
    }

    @Override // X.InterfaceC38901rP
    public final String BFC() {
        return A0i(-1029753481);
    }

    @Override // X.InterfaceC38901rP
    public final String BQW() {
        return A0i(1939359080);
    }

    @Override // X.InterfaceC38901rP
    public final String BWz() {
        return A0i(-906049888);
    }

    @Override // X.InterfaceC38901rP
    public final String BX0() {
        return A0i(-969918350);
    }

    @Override // X.InterfaceC38901rP
    public final Integer BXf() {
        return getOptionalIntValueByHashCode(1403811773);
    }

    @Override // X.InterfaceC38901rP
    public final Integer BY4() {
        return getOptionalIntValueByHashCode(2000642893);
    }

    @Override // X.InterfaceC38901rP
    public final String BbH() {
        return A0j(1376653744);
    }

    @Override // X.InterfaceC38901rP
    public final Integer BbI() {
        return getOptionalIntValueByHashCode(-750624739);
    }

    @Override // X.InterfaceC38901rP
    public final String Bn2() {
        return A0j(-970659207);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BwH() {
        return getOptionalBooleanValueByHashCode(-891289493);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean Bwn() {
        return getOptionalBooleanValueByHashCode(-830329114);
    }

    @Override // X.InterfaceC38901rP
    public final Integer C6j() {
        return getOptionalIntValueByHashCode(-1037596717);
    }

    @Override // X.InterfaceC38901rP
    public final Integer CBl() {
        return getOptionalIntValueByHashCode(3575610);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CRq() {
        return getOptionalBooleanValueByHashCode(-1836173183);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CRr() {
        return getOptionalBooleanValueByHashCode(1334628252);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CVO() {
        return getOptionalBooleanValueByHashCode(-1601470495);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CVs() {
        return getOptionalBooleanValueByHashCode(-1992631607);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CXR() {
        return getOptionalBooleanValueByHashCode(463106423);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CXS() {
        return getOptionalBooleanValueByHashCode(1676427141);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CZM() {
        return getOptionalBooleanValueByHashCode(-1179762421);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CaI() {
        return getOptionalBooleanValueByHashCode(-524107635);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CbP() {
        return getOptionalBooleanValueByHashCode(-1900900517);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CbW() {
        return getOptionalBooleanValueByHashCode(1373552544);
    }

    @Override // X.InterfaceC38901rP
    public final Boolean Cfs() {
        return getOptionalBooleanValueByHashCode(249420380);
    }

    @Override // X.InterfaceC38901rP
    public final C38891rO F4V(C1DV c1dv) {
        return F4U(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC38901rP
    public final String getBackgroundColor() {
        return AbstractC37301Gc2.A0n(this);
    }

    @Override // X.InterfaceC38901rP
    public final String getMediaId() {
        return A0f();
    }

    @Override // X.InterfaceC38901rP
    public final String getPk() {
        return AbstractC37301Gc2.A0k(this);
    }

    @Override // X.InterfaceC38901rP
    public final String getText() {
        return A0X();
    }

    @Override // X.InterfaceC38901rP
    public final String getTextColor() {
        return AbstractC37301Gc2.A0l(this);
    }
}
