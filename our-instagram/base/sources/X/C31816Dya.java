package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Dya, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31816Dya extends AbstractC52922bZ {
    public final UserSession A00;
    public final DirectThreadKey A01;
    public final String A02;
    public final InterfaceC09390do A03;
    public final C0UO A04;
    public final DirectDailyPromptsResponseListRepository A05;

    public C31816Dya(UserSession userSession, DirectDailyPromptsResponseListRepository directDailyPromptsResponseListRepository, DirectThreadKey directThreadKey, String str) {
        AbstractC25233BEq.A0w(2, str, directThreadKey, directDailyPromptsResponseListRepository);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = directThreadKey;
        this.A05 = directDailyPromptsResponseListRepository;
        this.A03 = AbstractC09440dt.A01(new C37056GUm(this, 21));
        C31199Dni c31199Dni = new C31199Dni(12, new InterfaceC19390xP[]{directDailyPromptsResponseListRepository.A0A, directDailyPromptsResponseListRepository.A05}, this);
        this.A04 = AbstractC208910l.A01(new C51755Mte((Object) null, 17), AbstractC141776au.A00(this), c31199Dni, C10I.A01);
    }
}
