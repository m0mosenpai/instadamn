package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.ProfessionalClipsUpsellType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfo;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf;
import com.instagram.model.shopping.clips.ClipsShoppingInfo;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import java.util.List;

/* renamed from: X.3x8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88513x8 extends C0T6 implements C3x9 {
    public final C84053op A00;
    public final InterfaceC83973oh A01;
    public final C5HE A02;
    public final ClipsBreakingCreatorInfo A03;
    public final ClipsCreationEntryPoint A04;
    public final C5HL A05;
    public final C5HM A06;
    public final MusicCanonicalType A07;
    public final MusicInfo A08;
    public final OriginalSoundData A09;
    public final OriginalityInfo A0A;
    public final ProfessionalClipsUpsellType A0B;
    public final C84023om A0C;
    public final InterfaceC84103ov A0D;
    public final C5HG A0E;
    public final C5HJ A0F;
    public final C84123oy A0G;
    public final ClipsContextualHighlightInfo A0H;
    public final C84153p2 A0I;
    public final C5HN A0J;
    public final InterfaceC110214xq A0K;
    public final C5HR A0L;
    public final ClipsShoppingInfo A0M;
    public final Boolean A0N;
    public final Boolean A0O;
    public final Boolean A0P;
    public final Boolean A0Q;
    public final Boolean A0R;
    public final Boolean A0S;
    public final Boolean A0T;
    public final Boolean A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final List A0Z;
    public final List A0a;

    @Override // X.C3x9
    public final C3x9 EBI(C1DY c1dy) {
        return this;
    }

    @Override // X.C3x9
    public final C88513x8 F4I(C1DY c1dy) {
        return this;
    }

    @Override // X.C3x9
    public final C88513x8 F4J(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88513x8) {
                C88513x8 c88513x8 = (C88513x8) obj;
                if (!C14360o3.A0K(this.A01, c88513x8.A01) || !C14360o3.A0K(this.A0C, c88513x8.A0C) || !C14360o3.A0K(this.A02, c88513x8.A02) || !C14360o3.A0K(this.A00, c88513x8.A00) || this.A07 != c88513x8.A07 || !C14360o3.A0K(this.A0D, c88513x8.A0D) || !C14360o3.A0K(this.A0E, c88513x8.A0E) || !C14360o3.A0K(this.A03, c88513x8.A03) || !C14360o3.A0K(this.A0F, c88513x8.A0F) || this.A04 != c88513x8.A04 || !C14360o3.A0K(this.A0G, c88513x8.A0G) || !C14360o3.A0K(this.A0H, c88513x8.A0H) || !C14360o3.A0K(this.A0Z, c88513x8.A0Z) || !C14360o3.A0K(this.A0N, c88513x8.A0N) || !C14360o3.A0K(this.A05, c88513x8.A05) || !C14360o3.A0K(this.A0V, c88513x8.A0V) || !C14360o3.A0K(this.A0O, c88513x8.A0O) || !C14360o3.A0K(this.A0P, c88513x8.A0P) || !C14360o3.A0K(this.A0Q, c88513x8.A0Q) || !C14360o3.A0K(this.A0R, c88513x8.A0R) || !C14360o3.A0K(this.A0S, c88513x8.A0S) || !C14360o3.A0K(this.A0I, c88513x8.A0I) || !C14360o3.A0K(this.A06, c88513x8.A06) || !C14360o3.A0K(this.A0W, c88513x8.A0W) || !C14360o3.A0K(this.A08, c88513x8.A08) || !C14360o3.A0K(this.A0J, c88513x8.A0J) || !C14360o3.A0K(this.A09, c88513x8.A09) || !C14360o3.A0K(this.A0A, c88513x8.A0A) || this.A0B != c88513x8.A0B || !C14360o3.A0K(this.A0X, c88513x8.A0X) || !C14360o3.A0K(this.A0a, c88513x8.A0a) || !C14360o3.A0K(this.A0M, c88513x8.A0M) || !C14360o3.A0K(this.A0T, c88513x8.A0T) || !C14360o3.A0K(this.A0U, c88513x8.A0U) || !C14360o3.A0K(this.A0Y, c88513x8.A0Y) || !C14360o3.A0K(this.A0K, c88513x8.A0K) || !C14360o3.A0K(this.A0L, c88513x8.A0L)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC83973oh interfaceC83973oh = this.A01;
        int hashCode = (interfaceC83973oh == null ? 0 : interfaceC83973oh.hashCode()) * 31;
        C84023om c84023om = this.A0C;
        int hashCode2 = (hashCode + (c84023om == null ? 0 : c84023om.hashCode())) * 31;
        C5HE c5he = this.A02;
        int hashCode3 = (hashCode2 + (c5he == null ? 0 : c5he.hashCode())) * 31;
        C84053op c84053op = this.A00;
        int hashCode4 = (hashCode3 + (c84053op == null ? 0 : c84053op.hashCode())) * 31;
        MusicCanonicalType musicCanonicalType = this.A07;
        int hashCode5 = (hashCode4 + (musicCanonicalType == null ? 0 : musicCanonicalType.hashCode())) * 31;
        InterfaceC84103ov interfaceC84103ov = this.A0D;
        int hashCode6 = (hashCode5 + (interfaceC84103ov == null ? 0 : interfaceC84103ov.hashCode())) * 31;
        C5HG c5hg = this.A0E;
        int hashCode7 = (hashCode6 + (c5hg == null ? 0 : c5hg.hashCode())) * 31;
        ClipsBreakingCreatorInfo clipsBreakingCreatorInfo = this.A03;
        int hashCode8 = (hashCode7 + (clipsBreakingCreatorInfo == null ? 0 : clipsBreakingCreatorInfo.hashCode())) * 31;
        C5HJ c5hj = this.A0F;
        int hashCode9 = (hashCode8 + (c5hj == null ? 0 : c5hj.hashCode())) * 31;
        ClipsCreationEntryPoint clipsCreationEntryPoint = this.A04;
        int hashCode10 = (hashCode9 + (clipsCreationEntryPoint == null ? 0 : clipsCreationEntryPoint.hashCode())) * 31;
        C84123oy c84123oy = this.A0G;
        int hashCode11 = (hashCode10 + (c84123oy == null ? 0 : c84123oy.hashCode())) * 31;
        ClipsContextualHighlightInfo clipsContextualHighlightInfo = this.A0H;
        int hashCode12 = (hashCode11 + (clipsContextualHighlightInfo == null ? 0 : clipsContextualHighlightInfo.hashCode())) * 31;
        List list = this.A0Z;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.A0N;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        C5HL c5hl = this.A05;
        int hashCode15 = (hashCode14 + (c5hl == null ? 0 : c5hl.hashCode())) * 31;
        String str = this.A0V;
        int hashCode16 = (hashCode15 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.A0O;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A0P;
        int hashCode18 = (hashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A0Q;
        int hashCode19 = (hashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A0R;
        int hashCode20 = (hashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A0S;
        int hashCode21 = (hashCode20 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        C84153p2 c84153p2 = this.A0I;
        int hashCode22 = (hashCode21 + (c84153p2 == null ? 0 : c84153p2.hashCode())) * 31;
        C5HM c5hm = this.A06;
        int hashCode23 = (hashCode22 + (c5hm == null ? 0 : c5hm.hashCode())) * 31;
        String str2 = this.A0W;
        int hashCode24 = (hashCode23 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MusicInfo musicInfo = this.A08;
        int hashCode25 = (hashCode24 + (musicInfo == null ? 0 : musicInfo.hashCode())) * 31;
        C5HN c5hn = this.A0J;
        int hashCode26 = (hashCode25 + (c5hn == null ? 0 : c5hn.hashCode())) * 31;
        OriginalSoundData originalSoundData = this.A09;
        int hashCode27 = (hashCode26 + (originalSoundData == null ? 0 : originalSoundData.hashCode())) * 31;
        OriginalityInfo originalityInfo = this.A0A;
        int hashCode28 = (hashCode27 + (originalityInfo == null ? 0 : originalityInfo.hashCode())) * 31;
        ProfessionalClipsUpsellType professionalClipsUpsellType = this.A0B;
        int hashCode29 = (hashCode28 + (professionalClipsUpsellType == null ? 0 : professionalClipsUpsellType.hashCode())) * 31;
        String str3 = this.A0X;
        int hashCode30 = (hashCode29 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.A0a;
        int hashCode31 = (hashCode30 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ClipsShoppingInfo clipsShoppingInfo = this.A0M;
        int hashCode32 = (hashCode31 + (clipsShoppingInfo == null ? 0 : clipsShoppingInfo.hashCode())) * 31;
        Boolean bool7 = this.A0T;
        int hashCode33 = (hashCode32 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A0U;
        int hashCode34 = (hashCode33 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str4 = this.A0Y;
        int hashCode35 = (hashCode34 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InterfaceC110214xq interfaceC110214xq = this.A0K;
        int hashCode36 = (hashCode35 + (interfaceC110214xq == null ? 0 : interfaceC110214xq.hashCode())) * 31;
        C5HR c5hr = this.A0L;
        return hashCode36 + (c5hr != null ? c5hr.hashCode() : 0);
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ C128865s0 AKg() {
        return new C128865s0(this);
    }

    @Override // X.C3x9
    public final InterfaceC83973oh AYE() {
        return this.A01;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ InterfaceC84033on AZi() {
        return this.A0C;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ C5HF Acs() {
        return this.A02;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ InterfaceC84063oq Adx() {
        return this.A00;
    }

    @Override // X.C3x9
    public final MusicCanonicalType Ae6() {
        return this.A07;
    }

    @Override // X.C3x9
    public final InterfaceC84103ov Ai5() {
        return this.A0D;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ C5HH AiB() {
        return this.A0E;
    }

    @Override // X.C3x9
    public final ClipsBreakingCreatorInfo AiC() {
        return this.A03;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ C5HK Amv() {
        return this.A0F;
    }

    @Override // X.C3x9
    public final ClipsCreationEntryPoint AoE() {
        return this.A04;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ InterfaceC84133oz Aqs() {
        return this.A0G;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ ClipsContextualHighlightInfoIntf ArW() {
        return this.A0H;
    }

    @Override // X.C3x9
    public final List AvR() {
        return this.A0Z;
    }

    @Override // X.C3x9
    public final Boolean Ay0() {
        return this.A0N;
    }

    @Override // X.C3x9
    public final C5HL B3d() {
        return this.A05;
    }

    @Override // X.C3x9
    public final String B5N() {
        return this.A0V;
    }

    @Override // X.C3x9
    public final Boolean BDx() {
        return this.A0O;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ InterfaceC84163p3 BPh() {
        return this.A0I;
    }

    @Override // X.C3x9
    public final C5HM BSU() {
        return this.A06;
    }

    @Override // X.C3x9
    public final MusicInfo BVc() {
        return this.A08;
    }

    @Override // X.C3x9
    public final C5HN BYO() {
        return this.A0J;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ OriginalSoundDataIntf BZw() {
        return this.A09;
    }

    @Override // X.C3x9
    public final OriginalityInfo Ba3() {
        return this.A0A;
    }

    @Override // X.C3x9
    public final ProfessionalClipsUpsellType BhS() {
        return this.A0B;
    }

    @Override // X.C3x9
    public final List Bp8() {
        return this.A0a;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ ClipsShoppingInfoIntf Buh() {
        return this.A0M;
    }

    @Override // X.C3x9
    public final Boolean Bvv() {
        return this.A0T;
    }

    @Override // X.C3x9
    public final Boolean Bwz() {
        return this.A0U;
    }

    @Override // X.C3x9
    public final String C2z() {
        return this.A0Y;
    }

    @Override // X.C3x9
    public final InterfaceC110214xq C5g() {
        return this.A0K;
    }

    @Override // X.C3x9
    public final /* bridge */ /* synthetic */ C5HS CGA() {
        return this.A0L;
    }

    @Override // X.C3x9
    public final Boolean CUJ() {
        return this.A0P;
    }

    @Override // X.C3x9
    public final Boolean CUL() {
        return this.A0Q;
    }

    @Override // X.C3x9
    public final Boolean CbJ() {
        return this.A0R;
    }

    @Override // X.C3x9
    public final Boolean Cd0() {
        return this.A0S;
    }

    @Override // X.C3x9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsMetadataDict", AbstractC37362Gd4.A00(this));
    }

    @Override // X.C3x9
    public final String getMusicCanonicalId() {
        return this.A0W;
    }

    @Override // X.C3x9
    public final String getReusableTextAttributeString() {
        return this.A0X;
    }

    public C88513x8(C84053op c84053op, InterfaceC83973oh interfaceC83973oh, C5HE c5he, ClipsBreakingCreatorInfo clipsBreakingCreatorInfo, ClipsCreationEntryPoint clipsCreationEntryPoint, C5HL c5hl, C5HM c5hm, MusicCanonicalType musicCanonicalType, MusicInfo musicInfo, OriginalSoundData originalSoundData, OriginalityInfo originalityInfo, ProfessionalClipsUpsellType professionalClipsUpsellType, C84023om c84023om, InterfaceC84103ov interfaceC84103ov, C5HG c5hg, C5HJ c5hj, C84123oy c84123oy, ClipsContextualHighlightInfo clipsContextualHighlightInfo, C84153p2 c84153p2, C5HN c5hn, InterfaceC110214xq interfaceC110214xq, C5HR c5hr, ClipsShoppingInfo clipsShoppingInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str, String str2, String str3, String str4, List list, List list2) {
        this.A01 = interfaceC83973oh;
        this.A0C = c84023om;
        this.A02 = c5he;
        this.A00 = c84053op;
        this.A07 = musicCanonicalType;
        this.A0D = interfaceC84103ov;
        this.A0E = c5hg;
        this.A03 = clipsBreakingCreatorInfo;
        this.A0F = c5hj;
        this.A04 = clipsCreationEntryPoint;
        this.A0G = c84123oy;
        this.A0H = clipsContextualHighlightInfo;
        this.A0Z = list;
        this.A0N = bool;
        this.A05 = c5hl;
        this.A0V = str;
        this.A0O = bool2;
        this.A0P = bool3;
        this.A0Q = bool4;
        this.A0R = bool5;
        this.A0S = bool6;
        this.A0I = c84153p2;
        this.A06 = c5hm;
        this.A0W = str2;
        this.A08 = musicInfo;
        this.A0J = c5hn;
        this.A09 = originalSoundData;
        this.A0A = originalityInfo;
        this.A0B = professionalClipsUpsellType;
        this.A0X = str3;
        this.A0a = list2;
        this.A0M = clipsShoppingInfo;
        this.A0T = bool7;
        this.A0U = bool8;
        this.A0Y = str4;
        this.A0K = interfaceC110214xq;
        this.A0L = c5hr;
    }
}
