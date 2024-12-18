package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Map;

/* renamed from: X.768, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass768 extends AbstractC161727Mh implements C7AX, InterfaceC161737Mi {
    public final UserSession A00;
    public final AnonymousClass769 A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;
    public final Integer A05;
    public final C7AX A06;

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        return this.A06.CFg(directMessageIdentifier);
    }

    public AnonymousClass768(UserSession userSession, C7SP c7sp, C7ZX c7zx, AnonymousClass988 anonymousClass988, AnonymousClass767 anonymousClass767, C7IM c7im, C18A c18a, Integer num, Map map) {
        super(c7sp, anonymousClass767, c7zx);
        this.A00 = userSession;
        this.A04 = c18a;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A05 = num;
        this.A01 = new AnonymousClass769(map);
        this.A06 = anonymousClass767;
    }
}
