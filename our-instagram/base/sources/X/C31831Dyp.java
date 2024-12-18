package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Dyp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31831Dyp extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public final UserSession A01;
    public final C35039FcC A02;
    public final DirectDailyPromptsResponseListRepository A03;
    public final DirectThreadKey A04;
    public final InterfaceC62602sz A05;
    public final String A06;
    public final C05A A07;
    public final C0UO A08;
    public final C0UO A09;
    public final int A0A;
    public final InterfaceC11380iw A0B;
    public final C36297Fzr A0C;
    public final String A0D;
    public final String A0E;

    public final boolean A01(boolean z, boolean z2) {
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null && !anonymousClass195.CRW()) {
            return false;
        }
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A00);
        this.A00 = AbstractC25226BEj.A1L(new PYe(this, A0s, 1, z2, z), AbstractC141776au.A00(this));
        return true;
    }

    public C31831Dyp(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C35039FcC c35039FcC, DirectDailyPromptsResponseListRepository directDailyPromptsResponseListRepository, DirectThreadKey directThreadKey, String str, String str2, String str3, int i) {
        AnonymousClass059 A02;
        AbstractC25234BEr.A1R(interfaceC11380iw, directDailyPromptsResponseListRepository, directThreadKey, str, str2);
        C14360o3.A0B(str3, 8);
        this.A01 = userSession;
        this.A0B = interfaceC11380iw;
        this.A03 = directDailyPromptsResponseListRepository;
        this.A04 = directThreadKey;
        this.A0E = str;
        this.A06 = str2;
        this.A0A = i;
        this.A0D = str3;
        this.A02 = c35039FcC;
        C008002u A00 = C10E.A00(C36431G5g.A00);
        this.A07 = A00;
        this.A08 = AbstractC208910l.A02(A00);
        C0UO c0uo = directDailyPromptsResponseListRepository.A08;
        C0UO c0uo2 = directDailyPromptsResponseListRepository.A06;
        C0UO c0uo3 = directDailyPromptsResponseListRepository.A04;
        C0UO c0uo4 = directDailyPromptsResponseListRepository.A05;
        C0UO c0uo5 = directDailyPromptsResponseListRepository.A07;
        C0UO c0uo6 = directDailyPromptsResponseListRepository.A0A;
        C35039FcC c35039FcC2 = directDailyPromptsResponseListRepository.A01;
        if (c35039FcC2 != null) {
            A02 = c35039FcC2.A01(str2);
        } else {
            A02 = AbstractC208910l.A02(AbstractC31171DnF.A0o());
        }
        C31199Dni c31199Dni = new C31199Dni(13, new InterfaceC19390xP[]{c0uo, c0uo2, c0uo3, c0uo4, c0uo5, c0uo6, A02}, this);
        this.A09 = AbstractC208910l.A01(C36432G5h.A00, AbstractC141776au.A00(this), c31199Dni, C10I.A01);
        this.A05 = new C36745GHo(this, 7);
        this.A0C = AbstractC34062F1p.A00(userSession);
        if (c35039FcC != null) {
            c35039FcC.A02(str2);
            AbstractC166987dD.A1Z(new MCO(this, (InterfaceC23621Ds) null, 29), AbstractC141776au.A00(this));
        }
    }

    public final void A00(String str, boolean z) {
        String str2;
        String str3;
        C7TG A00 = AbstractC165967bO.A00(this.A01);
        DirectThreadKey directThreadKey = this.A04;
        if (!z) {
            str2 = "CREATED";
            str3 = "❤";
        } else {
            str2 = "DELETED";
            str3 = null;
        }
        A00.A0K(directThreadKey, "daily_prompt", str2, str, str3, this.A0E);
        C36297Fzr c36297Fzr = this.A0C;
        String str4 = directThreadKey.A00;
        String str5 = directThreadKey.A01;
        int i = this.A0A;
        String str6 = this.A0D;
        C36297Fzr.A02(c36297Fzr, str4, str5, "daily_prompt_response_upvoted", "tap", "upvote_button", "daily_prompt_responses_sheet", AbstractC25232BEp.A1F(AbstractC43591JPw.A00(332), str, AbstractC166987dD.A1L("is_upvoted", AbstractC31172DnG.A0z(!z ? 1 : 0)), AbstractC166987dD.A1L("user_type", str6)), i);
    }
}
