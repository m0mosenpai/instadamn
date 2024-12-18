package X;

import com.instagram.api.schemas.ClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ClipsBreakingCreatorInfoImpl;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
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
import com.instagram.model.shopping.clips.ClipsShoppingInfo;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C128865s0 {
    public InterfaceC84063oq A00;
    public InterfaceC83973oh A01;
    public C5HF A02;
    public ClipsBreakingCreatorInfo A03;
    public ClipsCreationEntryPoint A04;
    public C5HL A05;
    public C5HM A06;
    public MusicCanonicalType A07;
    public MusicInfo A08;
    public OriginalSoundDataIntf A09;
    public OriginalityInfo A0A;
    public ProfessionalClipsUpsellType A0B;
    public InterfaceC84033on A0C;
    public InterfaceC84103ov A0D;
    public C5HH A0E;
    public C5HK A0F;
    public InterfaceC84133oz A0G;
    public ClipsContextualHighlightInfoIntf A0H;
    public InterfaceC84163p3 A0I;
    public C5HN A0J;
    public InterfaceC110214xq A0K;
    public C5HS A0L;
    public ClipsShoppingInfoIntf A0M;
    public Boolean A0N;
    public Boolean A0O;
    public Boolean A0P;
    public Boolean A0Q;
    public Boolean A0R;
    public Boolean A0S;
    public Boolean A0T;
    public Boolean A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public List A0Z;
    public List A0a;
    public final C3x9 A0b;

    public final C88513x8 A00() {
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
        C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
        InterfaceC83973oh interfaceC83973oh = this.A01;
        if (interfaceC83973oh != null) {
            c83963og = interfaceC83973oh.Erq();
        } else {
            c83963og = null;
        }
        InterfaceC84033on interfaceC84033on = this.A0C;
        if (interfaceC84033on != null) {
            c84023om = interfaceC84033on.F47();
        } else {
            c84023om = null;
        }
        C5HF c5hf = this.A02;
        if (c5hf != null) {
            c5he = c5hf.Err();
        } else {
            c5he = null;
        }
        InterfaceC84063oq interfaceC84063oq = this.A00;
        if (interfaceC84063oq != null) {
            c84053op = interfaceC84063oq.Er6();
        } else {
            c84053op = null;
        }
        MusicCanonicalType musicCanonicalType = this.A07;
        InterfaceC84103ov interfaceC84103ov = this.A0D;
        if (interfaceC84103ov != null) {
            c84093ou = interfaceC84103ov.F4B();
        } else {
            c84093ou = null;
        }
        C5HH c5hh = this.A0E;
        if (c5hh != null) {
            c5hg = c5hh.F4C();
        } else {
            c5hg = null;
        }
        ClipsBreakingCreatorInfo clipsBreakingCreatorInfo = this.A03;
        if (clipsBreakingCreatorInfo != null) {
            clipsBreakingCreatorInfoImpl = clipsBreakingCreatorInfo.Ert();
        } else {
            clipsBreakingCreatorInfoImpl = null;
        }
        C5HK c5hk = this.A0F;
        if (c5hk != null) {
            c5hj = c5hk.F4D();
        } else {
            c5hj = null;
        }
        ClipsCreationEntryPoint clipsCreationEntryPoint = this.A04;
        InterfaceC84133oz interfaceC84133oz = this.A0G;
        if (interfaceC84133oz != null) {
            c84123oy = interfaceC84133oz.F4E();
        } else {
            c84123oy = null;
        }
        ClipsContextualHighlightInfoIntf clipsContextualHighlightInfoIntf = this.A0H;
        if (clipsContextualHighlightInfoIntf != null) {
            clipsContextualHighlightInfo = clipsContextualHighlightInfoIntf.F4F();
        } else {
            clipsContextualHighlightInfo = null;
        }
        List list = this.A0Z;
        if (list != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((JKA) it.next()).Eru());
            }
        } else {
            arrayList = null;
        }
        Boolean bool = this.A0N;
        C5HL c5hl = this.A05;
        C26125BhB Erw = c5hl != null ? c5hl.Erw() : null;
        String str = this.A0V;
        Boolean bool2 = this.A0O;
        Boolean bool3 = this.A0P;
        Boolean bool4 = this.A0Q;
        Boolean bool5 = this.A0R;
        Boolean bool6 = this.A0S;
        InterfaceC84163p3 interfaceC84163p3 = this.A0I;
        if (interfaceC84163p3 != null) {
            c84153p2 = interfaceC84163p3.F4G(c1dy);
        } else {
            c84153p2 = null;
        }
        C5HM c5hm = this.A06;
        if (c5hm != null) {
            c38696H2h = c5hm.Es0();
        } else {
            c38696H2h = null;
        }
        String str2 = this.A0W;
        MusicInfo musicInfo = this.A08;
        if (musicInfo != null) {
            musicInfoImpl = musicInfo.Ewy(c1dy);
        } else {
            musicInfoImpl = null;
        }
        C5HN c5hn = this.A0J;
        if (c5hn != null) {
            c26160Bhl = c5hn.F4K();
        } else {
            c26160Bhl = null;
        }
        OriginalSoundDataIntf originalSoundDataIntf = this.A09;
        if (originalSoundDataIntf != null) {
            originalSoundData = originalSoundDataIntf.Exi(c1dy);
        } else {
            originalSoundData = null;
        }
        OriginalityInfo originalityInfo = this.A0A;
        if (originalityInfo != null) {
            originalityInfoImpl = originalityInfo.Exl(c1dy);
        } else {
            originalityInfoImpl = null;
        }
        ProfessionalClipsUpsellType professionalClipsUpsellType = this.A0B;
        String str3 = this.A0X;
        List list2 = this.A0a;
        if (list2 != null) {
            arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InterfaceC93104Fm) it2.next()).F4O());
            }
        } else {
            arrayList2 = null;
        }
        ClipsShoppingInfoIntf clipsShoppingInfoIntf = this.A0M;
        if (clipsShoppingInfoIntf != null) {
            clipsShoppingInfo = clipsShoppingInfoIntf.F5z(c1dy);
        } else {
            clipsShoppingInfo = null;
        }
        Boolean bool7 = this.A0T;
        Boolean bool8 = this.A0U;
        String str4 = this.A0Y;
        InterfaceC110214xq interfaceC110214xq = this.A0K;
        if (interfaceC110214xq != null) {
            c110204xp = interfaceC110214xq.F4L();
        } else {
            c110204xp = null;
        }
        C5HS c5hs = this.A0L;
        if (c5hs != null) {
            c5hr = c5hs.F4P();
        } else {
            c5hr = null;
        }
        return new C88513x8(c84053op, c83963og, c5he, clipsBreakingCreatorInfoImpl, clipsCreationEntryPoint, Erw, c38696H2h, musicCanonicalType, musicInfoImpl, originalSoundData, originalityInfoImpl, professionalClipsUpsellType, c84023om, c84093ou, c5hg, c5hj, c84123oy, clipsContextualHighlightInfo, c84153p2, c26160Bhl, c110204xp, c5hr, clipsShoppingInfo, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, str, str2, str3, str4, arrayList, arrayList2);
    }

    public C128865s0(C3x9 c3x9) {
        this.A0b = c3x9;
        this.A01 = c3x9.AYE();
        this.A0C = c3x9.AZi();
        this.A02 = c3x9.Acs();
        this.A00 = c3x9.Adx();
        this.A07 = c3x9.Ae6();
        this.A0D = c3x9.Ai5();
        this.A0E = c3x9.AiB();
        this.A03 = c3x9.AiC();
        this.A0F = c3x9.Amv();
        this.A04 = c3x9.AoE();
        this.A0G = c3x9.Aqs();
        this.A0H = c3x9.ArW();
        this.A0Z = c3x9.AvR();
        this.A0N = c3x9.Ay0();
        this.A05 = c3x9.B3d();
        this.A0V = c3x9.B5N();
        this.A0O = c3x9.BDx();
        this.A0P = c3x9.CUJ();
        this.A0Q = c3x9.CUL();
        this.A0R = c3x9.CbJ();
        this.A0S = c3x9.Cd0();
        this.A0I = c3x9.BPh();
        this.A06 = c3x9.BSU();
        this.A0W = c3x9.getMusicCanonicalId();
        this.A08 = c3x9.BVc();
        this.A0J = c3x9.BYO();
        this.A09 = c3x9.BZw();
        this.A0A = c3x9.Ba3();
        this.A0B = c3x9.BhS();
        this.A0X = c3x9.getReusableTextAttributeString();
        this.A0a = c3x9.Bp8();
        this.A0M = c3x9.Buh();
        this.A0T = c3x9.Bvv();
        this.A0U = c3x9.Bwz();
        this.A0Y = c3x9.C2z();
        this.A0K = c3x9.C5g();
        this.A0L = c3x9.CGA();
    }
}
