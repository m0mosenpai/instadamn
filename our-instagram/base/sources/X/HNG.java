package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGLiveGameStatus;
import com.instagram.api.schemas.IGLiveGames;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HNG extends C17T implements InterfaceC37961pd {
    public InterfaceC109924xK A00;
    public User A01;
    public List A02;
    public List A03;
    public List A04;

    @Override // X.InterfaceC37961pd
    public final InterfaceC109904xI AaN() {
        return (InterfaceC109904xI) getTreeValueByHashCode(-1521819552, C39182HMl.class);
    }

    @Override // X.InterfaceC37961pd
    public final InterfaceC109064vV AiH() {
        return (InterfaceC109064vV) getTreeValueByHashCode(837538200, C39224HPv.class);
    }

    @Override // X.InterfaceC37961pd
    public final User AiL() {
        return this.A01;
    }

    @Override // X.InterfaceC37961pd
    public final InterfaceC109924xK AnE() {
        InterfaceC109924xK interfaceC109924xK = this.A00;
        if (interfaceC109924xK == null) {
            return (InterfaceC109924xK) getTreeValueByHashCode(1954389749, V8Y.class);
        }
        return interfaceC109924xK;
    }

    @Override // X.InterfaceC37961pd
    public final List AnI() {
        return getOptionalTreeListByHashCode(1619779893, C39234HQl.class);
    }

    @Override // X.InterfaceC37961pd
    public final List Aop() {
        return this.A02;
    }

    @Override // X.InterfaceC37961pd
    public final IGLiveGames AuQ() {
        return (IGLiveGames) A0N(1468517112, J97.A00);
    }

    @Override // X.InterfaceC37961pd
    public final InterfaceC108554ug AxU() {
        return (InterfaceC108554ug) getTreeValueByHashCode(-119788168, HQZ.class);
    }

    @Override // X.InterfaceC37961pd
    public final IGLiveGameStatus B9S() {
        return (IGLiveGameStatus) A0N(17796319, J98.A00);
    }

    @Override // X.InterfaceC37961pd
    public final InterfaceC109944xO B9U() {
        return (InterfaceC109944xO) getTreeValueByHashCode(-1253023032, HP6.class);
    }

    @Override // X.InterfaceC37961pd
    public final InterfaceC109094vY BRN() {
        return (InterfaceC109094vY) getTreeValueByHashCode(-1513490504, C68055V8h.class);
    }

    @Override // X.InterfaceC37961pd
    public final List CCw() {
        return A0p(1853545970, new C50356MLi(this, 14));
    }

    @Override // X.InterfaceC37961pd
    public final InterfaceC109844xC CDz() {
        return (InterfaceC109844xC) getTreeValueByHashCode(-1847653564, C52632NQf.class);
    }

    @Override // X.InterfaceC37961pd
    public final List CG6() {
        return this.A04;
    }

    @Override // X.InterfaceC37961pd
    public final InterfaceC37961pd E8l(C1DY c1dy) {
        User user;
        ArrayList arrayList;
        ArrayList arrayList2;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(1786177973, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            user = AbstractC37300Gc1.A0N(c1dy, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A01 = user;
        InterfaceC109924xK AnE = AnE();
        ArrayList arrayList3 = null;
        if (AnE != null) {
            AnE.E96(c1dy);
        } else {
            AnE = null;
        }
        this.A00 = AnE;
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(-767350927, ImmutablePandoUserDict.class);
        if (optionalTreeListByHashCode != null) {
            arrayList = AbstractC167017dG.A0q(optionalTreeListByHashCode);
            Iterator<E> it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        List<InterfaceC102194ip> sponsorTags = getSponsorTags();
        if (sponsorTags != null) {
            arrayList3 = AbstractC167017dG.A0q(sponsorTags);
            for (InterfaceC102194ip interfaceC102194ip : sponsorTags) {
                interfaceC102194ip.E9u(c1dy);
                arrayList3.add(interfaceC102194ip);
            }
        }
        this.A03 = arrayList3;
        ImmutableList optionalTreeListByHashCode2 = getOptionalTreeListByHashCode(739041181, ImmutablePandoUserDict.class);
        if (optionalTreeListByHashCode2 != null) {
            arrayList2 = AbstractC167017dG.A0q(optionalTreeListByHashCode2);
            Iterator<E> it2 = optionalTreeListByHashCode2.iterator();
            while (it2.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        this.A04 = arrayList2;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f8  */
    @Override // X.InterfaceC37961pd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C37941pb ErP(X.C1DY r70) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HNG.ErP(X.1DY):X.1pb");
    }

    @Override // X.InterfaceC37961pd
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39782Hks.A00(this));
    }

    @Override // X.InterfaceC37961pd
    public final List getSponsorTags() {
        List list = this.A03;
        if (list == null) {
            return getOptionalTreeListByHashCode(-1676707298, HT3.class);
        }
        return list;
    }

    @Override // X.InterfaceC37961pd
    public final Long AiI() {
        return A0L(246302041);
    }

    @Override // X.InterfaceC37961pd
    public final String AiK() {
        return getStringValueByHashCode(539770505);
    }

    @Override // X.InterfaceC37961pd
    public final String AiM() {
        return getStringValueByHashCode(-439008606);
    }

    @Override // X.InterfaceC37961pd
    public final String AiN() {
        return getStringValueByHashCode(-351684304);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean Aro() {
        return A0B(711754413);
    }

    @Override // X.InterfaceC37961pd
    public final String AsG() {
        return getStringValueByHashCode(-1105496811);
    }

    @Override // X.InterfaceC37961pd
    public final String AvW() {
        return getStringValueByHashCode(610303846);
    }

    @Override // X.InterfaceC37961pd
    public final String AvY() {
        return getStringValueByHashCode(-306570024);
    }

    @Override // X.InterfaceC37961pd
    public final String B1q() {
        return getStringValueByHashCode(-849397074);
    }

    @Override // X.InterfaceC37961pd
    public final Integer B3A() {
        return getOptionalIntValueByHashCode(250178387);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean B4R() {
        return A0B(-1603026769);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean BDi() {
        return A0B(1002875341);
    }

    @Override // X.InterfaceC37961pd
    public final Long BF7() {
        return AbstractC37303Gc4.A0P(this);
    }

    @Override // X.InterfaceC37961pd
    public final Long BGN() {
        return A0L(-1913559045);
    }

    @Override // X.InterfaceC37961pd
    public final Integer BHU() {
        return getOptionalIntValueByHashCode(962182482);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean BJ5() {
        return A0B(1826537454);
    }

    @Override // X.InterfaceC37961pd
    public final Long BO1() {
        return A0L(-556318521);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean BVw() {
        return A0B(104264043);
    }

    @Override // X.InterfaceC37961pd
    public final Integer BYH() {
        return getOptionalIntValueByHashCode(2030838443);
    }

    @Override // X.InterfaceC37961pd
    public final String Be6() {
        return getStringValueByHashCode(1879474642);
    }

    @Override // X.InterfaceC37961pd
    public final String BiS() {
        return getStringValueByHashCode(1683225983);
    }

    @Override // X.InterfaceC37961pd
    public final Integer BjB() {
        return getOptionalIntValueByHashCode(615083646);
    }

    @Override // X.InterfaceC37961pd
    public final String BjX() {
        return A0j(964289780);
    }

    @Override // X.InterfaceC37961pd
    public final Integer Bk9() {
        return getOptionalIntValueByHashCode(-1456594659);
    }

    @Override // X.InterfaceC37961pd
    public final Long Bok() {
        return A0L(1233754776);
    }

    @Override // X.InterfaceC37961pd
    public final Integer BsD() {
        return getOptionalIntValueByHashCode(-960041127);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean Bw3() {
        return A0B(-914544340);
    }

    @Override // X.InterfaceC37961pd
    public final Long BxV() {
        return A0L(126023082);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean C2c() {
        return A0B(-1005449935);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean C41() {
        return A0B(1063758359);
    }

    @Override // X.InterfaceC37961pd
    public final Integer C9y() {
        return getOptionalIntValueByHashCode(-253163307);
    }

    @Override // X.InterfaceC37961pd
    public final Float CF6() {
        return A0K(706299096);
    }

    @Override // X.InterfaceC37961pd
    public final Float CG4() {
        return A0K(479826082);
    }

    @Override // X.InterfaceC37961pd
    public final Integer CGc() {
        return getOptionalIntValueByHashCode(1941332754);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean CU2() {
        return A0B(1716077986);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean CUv() {
        return A0B(13224064);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean CXc() {
        return A0B(-326622034);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean CXd() {
        return A0B(-1480468020);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean CZg() {
        return A0B(-155996292);
    }

    @Override // X.InterfaceC37961pd
    public final Integer CaW() {
        return getOptionalIntValueByHashCode(-843726979);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean CcP() {
        return A0B(-433113869);
    }

    @Override // X.InterfaceC37961pd
    public final Boolean Cfq() {
        return A0B(187141712);
    }

    @Override // X.InterfaceC37961pd
    public final C37941pb ErQ(C1DV c1dv) {
        return ErP(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // X.InterfaceC37961pd
    public final String getDashManifest() {
        return getStringValueByHashCode(1128191036);
    }

    @Override // X.InterfaceC37961pd
    public final String getMediaId() {
        return getStringValueByHashCode(-900774058);
    }

    @Override // X.InterfaceC37961pd
    public final String getOrganicTrackingToken() {
        return getStringValueByHashCode(-1133964731);
    }

    @Override // X.InterfaceC37961pd
    public final String getPreview() {
        return getStringValueByHashCode(-318184504);
    }
}
