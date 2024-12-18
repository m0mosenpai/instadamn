package X;

import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.common.AvatarInfo;
import com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository;
import com.instagram.avatars.graphql.AvatarMutationRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.profile.avatars.AvatarProfileViewModel$postEventWithPosesFromCache$1;

/* renamed from: X.Dqa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31370Dqa extends AbstractC52922bZ implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "AvatarProfileViewModel";
    public final C2GT A00;
    public final C2GT A01;
    public final C2GT A02;
    public final C149666oJ A03;
    public final C149656oI A04;
    public final AvatarCustomizationOptionsRepository A05;
    public final AvatarMutationRepository A06;
    public final AvatarStore A07;
    public final C12210kP A08;
    public final UserSession A09;
    public final C31371Dqb A0A;
    public final String A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C0UO A0F;
    public final C0UO A0G;
    public final C0UO A0H;

    public final void A02(String str, Boolean bool) {
        C141796aw A00;
        C50125MBz c50125MBz;
        UserSession userSession = this.A09;
        String str2 = "COIN_FLIP_ANIMATED_FRAME_POP";
        if (C18U.A06(C06090Tz.A05, userSession, 36315915583295180L)) {
            str2 = "COIN_FLIP_STATIC";
        } else if (AbstractC31248DoW.A04(userSession)) {
            str2 = "COIN_FLIP_ANIMATED_CUSTOMIZATION";
        } else if (AbstractC31248DoW.A02(userSession)) {
            str2 = "COIN_FLIP_ANIMATED_FRAME_POP_V2";
        } else {
            AbstractC31248DoW.A01(userSession);
        }
        if (str == null) {
            A00 = AbstractC141776au.A00(this);
            c50125MBz = new C50125MBz(this, bool, str, str2, null, 15);
        } else {
            if (!AbstractC31248DoW.A06(userSession, false)) {
                return;
            }
            A00 = AbstractC141776au.A00(this);
            c50125MBz = new C50125MBz(this, str, str2, (InterfaceC23621Ds) null, 16);
        }
        AbstractC166987dD.A1Z(c50125MBz, A00);
    }

    public final void A04(boolean z, String str, String str2, String str3) {
        AbstractC166987dD.A1Z(new C57150PXo(this, str, str2, str3, null, 0, z), AbstractC141776au.A00(this));
    }

    public static final AvatarCoinFlipSticker A00(InterfaceC151496rt interfaceC151496rt) {
        C151486rs c151486rs = (C151486rs) interfaceC151496rt;
        return new AvatarCoinFlipSticker(c151486rs.A05, AbstractC31177DnL.A03(c151486rs.A04), AbstractC31177DnL.A03(c151486rs.A01), AbstractC167017dG.A0K(c151486rs.A02), AbstractC31177DnL.A03(c151486rs.A03), c151486rs.A00);
    }

    public final void A03(boolean z, String str, String str2) {
        C152086st c152086st;
        AvatarCoinFlipConfig avatarCoinFlipConfig;
        C05A c05a = this.A0E;
        if (c05a.getValue() instanceof C152086st) {
            if (A05() != z && z) {
                this.A0A.A02(this.A09.userId, false);
            }
            if (AbstractC31248DoW.A03(this.A09)) {
                Object value = c05a.getValue();
                if (value instanceof C152086st) {
                    c152086st = (C152086st) value;
                } else {
                    c152086st = null;
                }
                boolean z2 = false;
                if (c152086st != null && (avatarCoinFlipConfig = c152086st.A00) != null && avatarCoinFlipConfig.A08 == z) {
                    z2 = true;
                }
                Object value2 = c05a.getValue();
                C14360o3.A0C(value2, "null cannot be cast to non-null type com.instagram.profile.avatars.AvatarProfileViewModel.SelfAvatarUiState.AvatarProfileConfigReceived");
                AbstractC166987dD.A1Z(new AvatarProfileViewModel$postEventWithPosesFromCache$1((C152086st) value2, this, str, str2, null, !z2, z), AbstractC141776au.A00(this));
                return;
            }
            Object value3 = c05a.getValue();
            C14360o3.A0C(value3, "null cannot be cast to non-null type com.instagram.profile.avatars.AvatarProfileViewModel.SelfAvatarUiState.AvatarProfileConfigReceived");
            C152086st c152086st2 = (C152086st) value3;
            AvatarCoinFlipConfig avatarCoinFlipConfig2 = c152086st2.A00;
            AvatarCoinFlipConfig avatarCoinFlipConfig3 = null;
            AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = null;
            if (avatarCoinFlipConfig2 != null) {
                if (z) {
                    avatarCoinFlipBackgroundOptionResponse = avatarCoinFlipConfig2.A04;
                }
                AvatarCoinFlipSticker avatarCoinFlipSticker = avatarCoinFlipConfig2.A05;
                AvatarCoinFlipSticker avatarCoinFlipSticker2 = avatarCoinFlipConfig2.A06;
                String str3 = avatarCoinFlipConfig2.A07;
                boolean z3 = avatarCoinFlipConfig2.A09;
                EnumC152426tV enumC152426tV = avatarCoinFlipConfig2.A00;
                boolean z4 = avatarCoinFlipConfig2.A03;
                AvatarInfo avatarInfo = avatarCoinFlipConfig2.A01;
                boolean z5 = avatarCoinFlipConfig2.A02;
                AbstractC167017dG.A1N(avatarCoinFlipSticker, avatarCoinFlipSticker2);
                avatarCoinFlipConfig3 = new AvatarCoinFlipConfig(avatarCoinFlipBackgroundOptionResponse, avatarCoinFlipSticker, avatarCoinFlipSticker2, enumC152426tV, avatarInfo, str3, z, z3, z, z4, z5);
            }
            String str4 = c152086st2.A01;
            String str5 = c152086st2.A02;
            boolean z6 = c152086st2.A03;
            AbstractC167017dG.A1O(str4, str5);
            c05a.Egh(new C152086st(avatarCoinFlipConfig3, str4, str5, z6));
        }
    }

    public final boolean A05() {
        C05A c05a = this.A0E;
        if (c05a.getValue() instanceof C152086st) {
            Object value = c05a.getValue();
            C14360o3.A0C(value, "null cannot be cast to non-null type com.instagram.profile.avatars.AvatarProfileViewModel.SelfAvatarUiState.AvatarProfileConfigReceived");
            AvatarCoinFlipConfig avatarCoinFlipConfig = ((C152086st) value).A00;
            if (avatarCoinFlipConfig != null && avatarCoinFlipConfig.A08) {
                return true;
            }
            return false;
        }
        return false;
    }

    public /* synthetic */ C31370Dqa(AvatarCustomizationOptionsRepository avatarCustomizationOptionsRepository, UserSession userSession, String str) {
        C31371Dqb c31371Dqb = new C31371Dqb(userSession, C21B.A00(userSession));
        AvatarStore A00 = C20Y.A00(userSession);
        C12210kP A0P = AbstractC31177DnL.A0P(userSession);
        C149666oJ c149666oJ = new C149666oJ(C21B.A00(userSession));
        C149656oI c149656oI = new C149656oI(c149666oJ, A00, userSession);
        AvatarMutationRepository avatarMutationRepository = new AvatarMutationRepository(C20Y.A00(userSession), userSession);
        AbstractC25234BEr.A1P(userSession, str, A00);
        C14360o3.A0B(A0P, 5);
        this.A09 = userSession;
        this.A0B = str;
        this.A0A = c31371Dqb;
        this.A07 = A00;
        this.A08 = A0P;
        this.A03 = c149666oJ;
        this.A04 = c149656oI;
        this.A05 = avatarCustomizationOptionsRepository;
        this.A06 = avatarMutationRepository;
        A0P.A00 = this;
        C008002u A002 = C10E.A00(C31382Dqm.A00);
        this.A0E = A002;
        this.A0H = A002;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A02 = AbstractC58232lf.A00(anonymousClass191, A002);
        C008002u A003 = C10E.A00(C31381Dql.A00);
        this.A0D = A003;
        this.A0G = A003;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, A003);
        C008002u A004 = C10E.A00(C31380Dqk.A00);
        this.A0C = A004;
        this.A0F = A004;
        this.A00 = AbstractC58232lf.A00(anonymousClass191, A004);
    }

    public final void A01() {
        AbstractC31176DnK.A1Z(this, AbstractC141776au.A00(this), 13);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0B;
    }
}
