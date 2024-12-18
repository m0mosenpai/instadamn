package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.upsell.data.CLNoticeRepository;

/* renamed from: X.Mg4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50997Mg4 extends AbstractC52922bZ {
    public boolean A00;
    public final C2GT A01;
    public final EnumC201878wK A02;
    public final CLNoticeRepository A03;
    public final C05A A04;
    public final C0UO A05;
    public final UserSession A06;

    public C50997Mg4(UserSession userSession, EnumC201878wK enumC201878wK, CLNoticeRepository cLNoticeRepository, String str) {
        AbstractC53470Nkx abstractC53470Nkx;
        AbstractC167007dF.A1E(userSession, 1, enumC201878wK);
        this.A06 = userSession;
        this.A03 = cLNoticeRepository;
        this.A02 = enumC201878wK;
        C008002u A00 = C10E.A00(C52488NKg.A00);
        this.A04 = A00;
        this.A05 = A00;
        C15340po A1I = MSW.A1I(new MBo(2, null), A00);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, A1I);
        if (C55220Oej.A05(userSession)) {
            abstractC53470Nkx = C52489NKh.A00;
        } else if (C2TN.A06(AbstractC166997dE.A0Y(userSession)) && C14360o3.A0K(str, "original") && AbstractC166987dD.A0x(userSession).getInt("clips_audio_filters_privacy_snackbar_shown_count", 0) < 1 && AbstractC185298Jv.A02(userSession)) {
            abstractC53470Nkx = C52487NKf.A00;
        } else {
            if (cLNoticeRepository == null) {
                return;
            }
            AbstractC23641Du.A05(anonymousClass191, new D4z(this, null, 7), AbstractC141776au.A00(this));
            AbstractC23641Du.A05(anonymousClass191, new C43172J6r(cLNoticeRepository, null, 2), ((C4A7) cLNoticeRepository).A01);
            return;
        }
        A00(abstractC53470Nkx, this);
    }

    public static final void A00(AbstractC53470Nkx abstractC53470Nkx, C50997Mg4 c50997Mg4) {
        if (!(abstractC53470Nkx instanceof C52488NKg)) {
            if (!c50997Mg4.A00) {
                c50997Mg4.A00 = true;
            } else {
                return;
            }
        }
        do {
        } while (!MSX.A1Z(abstractC53470Nkx, c50997Mg4.A04));
    }
}
