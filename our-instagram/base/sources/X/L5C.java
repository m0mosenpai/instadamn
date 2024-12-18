package X;

import com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;

/* loaded from: classes8.dex */
public final class L5C {
    public String A00;
    public boolean A01;
    public final EnumC143276dS A02;
    public final EnumC143286dT A03;
    public final AvatarStickerSuggestionRepository A04;
    public final C167397dt A05;
    public final C006802i A06;
    public final UserSession A07;
    public final AvatarStickerInteractor A08;
    public final C05A A09;
    public final C0UO A0A;

    public /* synthetic */ L5C(EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, UserSession userSession, String str, int i, boolean z) {
        AvatarStickerInteractor avatarStickerInteractor = new AvatarStickerInteractor(null, userSession, 30);
        C006802i c006802i = C006802i.A0p;
        AvatarStickerSuggestionRepository avatarStickerSuggestionRepository = new AvatarStickerSuggestionRepository(c006802i, userSession, str, i, z);
        C167397dt c167397dt = new C167397dt(userSession);
        C14360o3.A0B(c006802i, 9);
        this.A07 = userSession;
        this.A02 = enumC143276dS;
        this.A03 = enumC143286dT;
        this.A08 = avatarStickerInteractor;
        this.A06 = c006802i;
        this.A04 = avatarStickerSuggestionRepository;
        this.A05 = c167397dt;
        C05A c05a = avatarStickerSuggestionRepository.A09;
        this.A09 = c05a;
        this.A0A = AbstractC208910l.A02(c05a);
        this.A00 = "";
    }
}
