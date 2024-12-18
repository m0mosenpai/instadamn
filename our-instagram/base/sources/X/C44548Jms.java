package X;

import android.content.Context;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import java.util.ArrayList;

/* renamed from: X.Jms, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44548Jms extends AbstractC52922bZ {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final C2GT A04;
    public final BrandedContentSettingsRepository A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final MediaKitRepository A08;
    public final MonetizationRepository A09;
    public final C1AU A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC24731Iq A0C;
    public final InterfaceC19390xP A0D;
    public final C05A A0E;
    public final C0UO A0F;
    public final boolean A0G;
    public final Context A0H;

    public C44548Jms(Context context, BrandedContentSettingsRepository brandedContentSettingsRepository, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MediaKitRepository mediaKitRepository, MonetizationRepository monetizationRepository, C1AU c1au) {
        C14360o3.A0B(context, 1);
        AbstractC25234BEr.A0j(2, userSession, interfaceC11380iw, brandedContentSettingsRepository, monetizationRepository);
        AbstractC167017dG.A1U(mediaKitRepository, c1au);
        this.A0H = context;
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
        this.A05 = brandedContentSettingsRepository;
        this.A09 = monetizationRepository;
        this.A08 = mediaKitRepository;
        this.A0A = c1au;
        this.A0B = AbstractC09440dt.A01(new C50163MDq(this, 23));
        this.A0G = AbstractC167007dF.A1T(AbstractC166997dE.A0Y(userSession).A03.AkG());
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A0E = A0z;
        this.A0F = A0z;
        this.A04 = AbstractC31172DnG.A0E(AnonymousClass111.A00(new C11950ju(new InterfaceC19390xP[]{A00(brandedContentSettingsRepository.A0D), A00(brandedContentSettingsRepository.A0C), A00(brandedContentSettingsRepository.A0B), A00(brandedContentSettingsRepository.A0A), A00(brandedContentSettingsRepository.A09), A00(brandedContentSettingsRepository.A08), A00(A0z), A00(mediaKitRepository.A0B)}, 2), AnonymousClass111.A00));
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A0C = c24721Ip;
        this.A0D = AbstractC07080Za.A03(c24721Ip);
    }

    private final InterfaceC19390xP A00(InterfaceC19390xP interfaceC19390xP) {
        return C0ST.A01(AnonymousClass111.A01(new MCC(this, null, 37), interfaceC19390xP));
    }

    public final void A02() {
        if (C18U.A06(C06090Tz.A05, this.A07, 36319364441578717L)) {
            AbstractC166987dD.A1Z(new MC3(this, (InterfaceC23621Ds) null, 32), AbstractC141776au.A00(this));
        }
    }

    public final void A03() {
        UserMonetizationProductType userMonetizationProductType;
        ArrayList A1N = AbstractC16960so.A1N(UserMonetizationProductType.A06);
        UserSession userSession = this.A07;
        if (C4A4.A03(userSession, 36316791756165782L)) {
            userMonetizationProductType = UserMonetizationProductType.A07;
        } else {
            userMonetizationProductType = UserMonetizationProductType.A08;
        }
        A1N.add(userMonetizationProductType);
        C141796aw A00 = AbstractC141776au.A00(this);
        MCK mck = new MCK(A1N, this, (InterfaceC23621Ds) null, 0);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mck, A00);
        A02();
        if (C4A4.A01(userSession)) {
            AbstractC23641Du.A05(anonymousClass191, new MCC(this, null, 36), AbstractC141776au.A00(this));
        }
        if (LB9.A01(userSession)) {
            AbstractC23641Du.A05(anonymousClass191, new MC3(this, (InterfaceC23621Ds) null, 33), AbstractC141776au.A00(this));
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36316267770024139L)) {
            AbstractC23641Du.A05(anonymousClass191, new MC3(this, (InterfaceC23621Ds) null, 34), AbstractC141776au.A00(this));
        }
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A05.A03.A01();
    }

    public static final void A01(AbstractC33528Es2 abstractC33528Es2, C44548Jms c44548Jms) {
        AbstractC166987dD.A1Z(new MCK(abstractC33528Es2, c44548Jms, (InterfaceC23621Ds) null, 1), AbstractC141776au.A00(c44548Jms));
    }
}
