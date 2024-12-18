package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ClipsBreakingCreatorInfoImpl;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.ImmutablePandoClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ImmutablePandoMusicInfo;
import com.instagram.api.schemas.ImmutablePandoOriginalSoundData;
import com.instagram.api.schemas.ImmutablePandoOriginalityInfo;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.OriginalityInfoImpl;
import com.instagram.api.schemas.ProfessionalClipsUpsellType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfo;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf;
import com.instagram.clips.model.metadata.ImmutablePandoClipsContextualHighlightInfo;
import com.instagram.model.shopping.clips.ClipsShoppingInfo;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.clips.ImmutablePandoClipsShoppingInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gn9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37967Gn9 extends C17T implements C3x9 {
    public MusicInfo A00;
    public OriginalSoundDataIntf A01;
    public OriginalityInfo A02;
    public InterfaceC84163p3 A03;
    public ClipsShoppingInfoIntf A04;

    @Override // X.C3x9
    public final /* synthetic */ C128865s0 AKg() {
        return new C128865s0(this);
    }

    @Override // X.C3x9
    public final InterfaceC83973oh AYE() {
        return (InterfaceC83973oh) A05(1001495785, C37968GnA.class);
    }

    @Override // X.C3x9
    public final InterfaceC84033on AZi() {
        return (InterfaceC84033on) A05(-2003368305, C37971GnD.class);
    }

    @Override // X.C3x9
    public final C5HF Acs() {
        return (C5HF) A05(-1977325147, HNb.class);
    }

    @Override // X.C3x9
    public final InterfaceC84063oq Adx() {
        return (InterfaceC84063oq) A05(-1777287968, C37977GnJ.class);
    }

    @Override // X.C3x9
    public final MusicCanonicalType Ae6() {
        return (MusicCanonicalType) A0N(1549378051, C37976GnI.A00);
    }

    @Override // X.C3x9
    public final InterfaceC84103ov Ai5() {
        return (InterfaceC84103ov) A05(456993778, C37969GnB.class);
    }

    @Override // X.C3x9
    public final C5HH AiB() {
        return (C5HH) A05(77953264, HVk.class);
    }

    @Override // X.C3x9
    public final ClipsBreakingCreatorInfo AiC() {
        return (ClipsBreakingCreatorInfo) A05(1935181085, ImmutablePandoClipsBreakingCreatorInfo.class);
    }

    @Override // X.C3x9
    public final C5HK Amv() {
        return (C5HK) A05(602859274, HVl.class);
    }

    @Override // X.C3x9
    public final ClipsCreationEntryPoint AoE() {
        return (ClipsCreationEntryPoint) A0N(-674115137, C37973GnF.A00);
    }

    @Override // X.C3x9
    public final InterfaceC84133oz Aqs() {
        return (InterfaceC84133oz) A05(835063916, C37972GnE.class);
    }

    @Override // X.C3x9
    public final ClipsContextualHighlightInfoIntf ArW() {
        return (ClipsContextualHighlightInfoIntf) A05(-26040313, ImmutablePandoClipsContextualHighlightInfo.class);
    }

    @Override // X.C3x9
    public final List AvR() {
        return A08(773495299, HNe.class);
    }

    @Override // X.C3x9
    public final C5HL B3d() {
        return (C5HL) A05(942813469, C0Y.class);
    }

    @Override // X.C3x9
    public final InterfaceC84163p3 BPh() {
        InterfaceC84163p3 interfaceC84163p3 = this.A03;
        if (interfaceC84163p3 == null) {
            return (InterfaceC84163p3) A05(-1255143223, C37966Gn8.class);
        }
        return interfaceC84163p3;
    }

    @Override // X.C3x9
    public final C5HM BSU() {
        return (C5HM) A05(858181173, HNi.class);
    }

    @Override // X.C3x9
    public final MusicInfo BVc() {
        MusicInfo musicInfo = this.A00;
        if (musicInfo == null) {
            return (MusicInfo) A05(-780321144, ImmutablePandoMusicInfo.class);
        }
        return musicInfo;
    }

    @Override // X.C3x9
    public final C5HN BYO() {
        return (C5HN) A05(-1574173540, C1N.class);
    }

    @Override // X.C3x9
    public final OriginalSoundDataIntf BZw() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A01;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1082512652, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    @Override // X.C3x9
    public final OriginalityInfo Ba3() {
        OriginalityInfo originalityInfo = this.A02;
        if (originalityInfo == null) {
            return (OriginalityInfo) A05(319613552, ImmutablePandoOriginalityInfo.class);
        }
        return originalityInfo;
    }

    @Override // X.C3x9
    public final ProfessionalClipsUpsellType BhS() {
        return (ProfessionalClipsUpsellType) A0N(-2101878632, C37974GnG.A00);
    }

    @Override // X.C3x9
    public final List Bp8() {
        return A08(452501036, C39292HVp.class);
    }

    @Override // X.C3x9
    public final ClipsShoppingInfoIntf Buh() {
        ClipsShoppingInfoIntf clipsShoppingInfoIntf = this.A04;
        if (clipsShoppingInfoIntf == null) {
            return (ClipsShoppingInfoIntf) A05(-1648702171, ImmutablePandoClipsShoppingInfo.class);
        }
        return clipsShoppingInfoIntf;
    }

    @Override // X.C3x9
    public final InterfaceC110214xq C5g() {
        return (InterfaceC110214xq) A05(-180351661, C39290HVn.class);
    }

    @Override // X.C3x9
    public final C5HS CGA() {
        return (C5HS) A05(-1919345731, C1O.class);
    }

    @Override // X.C3x9
    public final C88513x8 F4I(C1DY c1dy) {
        C83963og c83963og;
        C84023om c84023om;
        C5HE c5he;
        C84053op c84053op;
        C84093ou c84093ou;
        C5HG c5hg;
        ClipsBreakingCreatorInfoImpl clipsBreakingCreatorInfoImpl;
        C5HJ c5hj;
        C84123oy c84123oy;
        ClipsContextualHighlightInfo clipsContextualHighlightInfo;
        ArrayList arrayList;
        C26125BhB c26125BhB;
        C84153p2 c84153p2;
        C38696H2h c38696H2h;
        MusicInfoImpl musicInfoImpl;
        C26160Bhl c26160Bhl;
        OriginalSoundData originalSoundData;
        OriginalityInfoImpl originalityInfoImpl;
        ArrayList arrayList2;
        ClipsShoppingInfo clipsShoppingInfo;
        C110204xp c110204xp;
        C5HR c5hr;
        InterfaceC83973oh AYE = AYE();
        if (AYE != null) {
            c83963og = AYE.Erq();
        } else {
            c83963og = null;
        }
        InterfaceC84033on AZi = AZi();
        if (AZi != null) {
            c84023om = AZi.F47();
        } else {
            c84023om = null;
        }
        C5HF Acs = Acs();
        if (Acs != null) {
            c5he = Acs.Err();
        } else {
            c5he = null;
        }
        InterfaceC84063oq Adx = Adx();
        if (Adx != null) {
            c84053op = Adx.Er6();
        } else {
            c84053op = null;
        }
        MusicCanonicalType Ae6 = Ae6();
        InterfaceC84103ov Ai5 = Ai5();
        if (Ai5 != null) {
            c84093ou = Ai5.F4B();
        } else {
            c84093ou = null;
        }
        C5HH AiB = AiB();
        if (AiB != null) {
            c5hg = AiB.F4C();
        } else {
            c5hg = null;
        }
        ClipsBreakingCreatorInfo AiC = AiC();
        if (AiC != null) {
            clipsBreakingCreatorInfoImpl = AiC.Ert();
        } else {
            clipsBreakingCreatorInfoImpl = null;
        }
        C5HK Amv = Amv();
        if (Amv != null) {
            c5hj = Amv.F4D();
        } else {
            c5hj = null;
        }
        ClipsCreationEntryPoint AoE = AoE();
        InterfaceC84133oz Aqs = Aqs();
        if (Aqs != null) {
            c84123oy = Aqs.F4E();
        } else {
            c84123oy = null;
        }
        ClipsContextualHighlightInfoIntf ArW = ArW();
        if (ArW != null) {
            clipsContextualHighlightInfo = ArW.F4F();
        } else {
            clipsContextualHighlightInfo = null;
        }
        List AvR = AvR();
        if (AvR != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(AvR, 10));
            Iterator it = AvR.iterator();
            while (it.hasNext()) {
                arrayList.add(((JKA) it.next()).Eru());
            }
        } else {
            arrayList = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-868996171);
        C5HL B3d = B3d();
        if (B3d != null) {
            c26125BhB = B3d.Erw();
        } else {
            c26125BhB = null;
        }
        String A0i = A0i(1946971043);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(1341613631);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(-1203018013);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(-972691210);
        Boolean optionalBooleanValueByHashCode5 = getOptionalBooleanValueByHashCode(1980945272);
        Boolean optionalBooleanValueByHashCode6 = getOptionalBooleanValueByHashCode(-1430549093);
        InterfaceC84163p3 BPh = BPh();
        if (BPh != null) {
            c84153p2 = BPh.F4G(c1dy);
        } else {
            c84153p2 = null;
        }
        C5HM BSU = BSU();
        if (BSU != null) {
            c38696H2h = BSU.Es0();
        } else {
            c38696H2h = null;
        }
        String A0i2 = A0i(1139251232);
        MusicInfo BVc = BVc();
        if (BVc != null) {
            musicInfoImpl = BVc.Ewy(c1dy);
        } else {
            musicInfoImpl = null;
        }
        C5HN BYO = BYO();
        if (BYO != null) {
            c26160Bhl = BYO.F4K();
        } else {
            c26160Bhl = null;
        }
        OriginalSoundDataIntf BZw = BZw();
        if (BZw != null) {
            originalSoundData = BZw.Exi(c1dy);
        } else {
            originalSoundData = null;
        }
        OriginalityInfo Ba3 = Ba3();
        if (Ba3 != null) {
            originalityInfoImpl = Ba3.Exl(c1dy);
        } else {
            originalityInfoImpl = null;
        }
        ProfessionalClipsUpsellType BhS = BhS();
        String A0i3 = A0i(-606554222);
        List Bp8 = Bp8();
        if (Bp8 != null) {
            arrayList2 = new ArrayList(AbstractC06950Ym.A1E(Bp8, 10));
            Iterator it2 = Bp8.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InterfaceC93104Fm) it2.next()).F4O());
            }
        } else {
            arrayList2 = null;
        }
        ClipsShoppingInfoIntf Buh = Buh();
        if (Buh != null) {
            clipsShoppingInfo = Buh.F5z(c1dy);
        } else {
            clipsShoppingInfo = null;
        }
        Boolean optionalBooleanValueByHashCode7 = getOptionalBooleanValueByHashCode(-208443098);
        Boolean optionalBooleanValueByHashCode8 = getOptionalBooleanValueByHashCode(-1903327430);
        String A0i4 = A0i(-876697698);
        InterfaceC110214xq C5g = C5g();
        if (C5g != null) {
            c110204xp = C5g.F4L();
        } else {
            c110204xp = null;
        }
        C5HS CGA = CGA();
        if (CGA != null) {
            c5hr = CGA.F4P();
        } else {
            c5hr = null;
        }
        return new C88513x8(c84053op, c83963og, c5he, clipsBreakingCreatorInfoImpl, AoE, c26125BhB, c38696H2h, Ae6, musicInfoImpl, originalSoundData, originalityInfoImpl, BhS, c84023om, c84093ou, c5hg, c5hj, c84123oy, clipsContextualHighlightInfo, c84153p2, c26160Bhl, c110204xp, c5hr, clipsShoppingInfo, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalBooleanValueByHashCode5, optionalBooleanValueByHashCode6, optionalBooleanValueByHashCode7, optionalBooleanValueByHashCode8, A0i, A0i2, A0i3, A0i4, arrayList, arrayList2);
    }

    @Override // X.C3x9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37362Gd4.A00(this));
    }

    @Override // X.C3x9
    public final Boolean Ay0() {
        return getOptionalBooleanValueByHashCode(-868996171);
    }

    @Override // X.C3x9
    public final String B5N() {
        return A0i(1946971043);
    }

    @Override // X.C3x9
    public final Boolean BDx() {
        return getOptionalBooleanValueByHashCode(1341613631);
    }

    @Override // X.C3x9
    public final Boolean Bvv() {
        return getOptionalBooleanValueByHashCode(-208443098);
    }

    @Override // X.C3x9
    public final Boolean Bwz() {
        return getOptionalBooleanValueByHashCode(-1903327430);
    }

    @Override // X.C3x9
    public final String C2z() {
        return A0i(-876697698);
    }

    @Override // X.C3x9
    public final Boolean CUJ() {
        return getOptionalBooleanValueByHashCode(-1203018013);
    }

    @Override // X.C3x9
    public final Boolean CUL() {
        return getOptionalBooleanValueByHashCode(-972691210);
    }

    @Override // X.C3x9
    public final Boolean CbJ() {
        return getOptionalBooleanValueByHashCode(1980945272);
    }

    @Override // X.C3x9
    public final Boolean Cd0() {
        return getOptionalBooleanValueByHashCode(-1430549093);
    }

    @Override // X.C3x9
    public final C3x9 EBI(C1DY c1dy) {
        InterfaceC84163p3 BPh = BPh();
        ClipsShoppingInfoIntf clipsShoppingInfoIntf = null;
        if (BPh != null) {
            BPh.EBH(c1dy);
        } else {
            BPh = null;
        }
        this.A03 = BPh;
        MusicInfo BVc = BVc();
        if (BVc != null) {
            BVc.E9O(c1dy);
        } else {
            BVc = null;
        }
        this.A00 = BVc;
        OriginalSoundDataIntf BZw = BZw();
        if (BZw != null) {
            BZw.E9V(c1dy);
        } else {
            BZw = null;
        }
        this.A01 = BZw;
        OriginalityInfo Ba3 = Ba3();
        if (Ba3 != null) {
            Ba3.E9W(c1dy);
        } else {
            Ba3 = null;
        }
        this.A02 = Ba3;
        ClipsShoppingInfoIntf Buh = Buh();
        if (Buh != null) {
            Buh.EBn(c1dy);
            clipsShoppingInfoIntf = Buh;
        }
        this.A04 = clipsShoppingInfoIntf;
        return this;
    }

    @Override // X.C3x9
    public final C88513x8 F4J(C1DV c1dv) {
        return F4I(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // X.C3x9
    public final String getMusicCanonicalId() {
        return A0i(1139251232);
    }

    @Override // X.C3x9
    public final String getReusableTextAttributeString() {
        return A0i(-606554222);
    }
}
