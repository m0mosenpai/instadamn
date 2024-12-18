package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.party.data.StoryPartyRepository;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Meb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50906Meb extends AbstractC52922bZ {
    public final UserSession A00;
    public final StoryPartyRepository A01;
    public final InterfaceC06180Ui A02;
    public final C05A A03;

    public C50906Meb(UserSession userSession, StoryPartyRepository storyPartyRepository) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = storyPartyRepository;
        this.A03 = AbstractC25225BEi.A1H(new C51761Mtk((CharSequence) null, (List) null, (DefaultConstructorMarker) null, 3, 47));
        this.A02 = C10M.A00(C05F.A00, 0, 1);
    }
}
