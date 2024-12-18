package X;

import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;

/* renamed from: X.KGu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45606KGu extends AbstractC61132qb {
    public final C51758Mth A00;
    public final EnumC143276dS A01;
    public final EnumC143286dT A02;
    public final L39 A03;
    public final UserSession A04;
    public final AbstractC46518KiH A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A04;
        AvatarStickerInteractor avatarStickerInteractor = new AvatarStickerInteractor(null, userSession, 30);
        C142016bK A00 = AbstractC149786oX.A00(userSession);
        EnumC143286dT enumC143286dT = this.A02;
        EnumC143276dS enumC143276dS = this.A01;
        String str = this.A08;
        C14360o3.A0B(userSession, 0);
        C77A c77a = (C77A) userSession.A01(C77A.class, MHS.A00(userSession, 40));
        AbstractC46518KiH abstractC46518KiH = this.A05;
        return new C44543Jmn(this.A00, enumC143276dS, enumC143286dT, this.A03, userSession, A00, c77a, avatarStickerInteractor, abstractC46518KiH, this.A06, str, this.A07, this.A09);
    }

    public C45606KGu(C51758Mth c51758Mth, EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, L39 l39, UserSession userSession, AbstractC46518KiH abstractC46518KiH, Integer num, String str, String str2, boolean z) {
        AbstractC167027dH.A13(userSession, enumC143286dT, enumC143276dS);
        C14360o3.A0B(l39, 8);
        this.A04 = userSession;
        this.A02 = enumC143286dT;
        this.A01 = enumC143276dS;
        this.A00 = c51758Mth;
        this.A05 = abstractC46518KiH;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = l39;
        this.A09 = z;
        this.A06 = num;
    }
}
