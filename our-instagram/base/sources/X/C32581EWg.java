package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.EWg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32581EWg extends AbstractC61132qb {
    public final int A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final DirectThreadKey A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C32581EWg(InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectThreadKey directThreadKey, String str, String str2, String str3, int i) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = directThreadKey;
        this.A06 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A04 = str3;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0B(userSession, 0);
        DirectDailyPromptsResponseListRepository directDailyPromptsResponseListRepository = (DirectDailyPromptsResponseListRepository) userSession.A01(DirectDailyPromptsResponseListRepository.class, new C37056GUm(userSession, 18));
        DirectThreadKey directThreadKey = this.A03;
        String str = this.A06;
        String str2 = this.A05;
        int i = this.A00;
        return new C31831Dyp(interfaceC11380iw, userSession, F2C.A00(userSession), directDailyPromptsResponseListRepository, directThreadKey, str, str2, this.A04, i);
    }
}
