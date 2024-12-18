package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class J4V implements Runnable {
    public final /* synthetic */ C140366Wq A00;
    public final /* synthetic */ AnonymousClass308 A01;

    public J4V(C140366Wq c140366Wq, AnonymousClass308 anonymousClass308) {
        this.A01 = anonymousClass308;
        this.A00 = c140366Wq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AnonymousClass308 anonymousClass308 = this.A01;
        if (AbstractC75423a9.A00(anonymousClass308.A07(), anonymousClass308)) {
            C38321qM A07 = anonymousClass308.A07();
            String str2 = null;
            List list = A07.A0d.A00(A07.A1X()).A00;
            C140366Wq c140366Wq = this.A00;
            UserSession userSession = anonymousClass308.A0T;
            C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, anonymousClass308.A07(), anonymousClass308, "comment_button");
            A0F.A09(anonymousClass308.A01);
            C1M1 c1m1 = anonymousClass308.A0a;
            if (c1m1 != null) {
                str = IQ1.A00(c1m1);
            } else {
                str = null;
            }
            A0F.A4m = str;
            if (c1m1 != null) {
                str2 = IQ1.A01(c1m1);
            }
            A0F.A6h = str2;
            A0F.A3Z = AbstractC31171DnF.A0V(c140366Wq.A0G.A0N.getCurrentScans().get());
            A0F.A80 = list;
            C32U.A0E(userSession, A0F, anonymousClass308.A07(), anonymousClass308, anonymousClass308.A00);
        }
        String id = anonymousClass308.A07().getId();
        if (id != null) {
            String moduleName = anonymousClass308.getModuleName();
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession2 = anonymousClass308.A0T;
            AnonymousClass548.A00().A00().A00(anonymousClass308.A0O, null, new C26025BfE(EnumC120785dO.PEEK_MEDIA_COMMENT, null, 0, 0, null, null, null, id, null, moduleName, null, null, null, null, null, null, null, null, null, null, null, anonymousClass308.A07().A0s(), C14360o3.A0K(c08730cb.A01(userSession2), anonymousClass308.A07().A2E(userSession2)), anonymousClass308.isOrganicEligible(), anonymousClass308.isSponsoredEligible(), true, false, false, false, false, anonymousClass308.A07().A63(), false, false, false, false, false, false, true, false, anonymousClass308.A07().A4t(), false, false, false, false, false, false, false, false), userSession2, null, null, C18U.A06(C06090Tz.A05, userSession2, 36318741671516604L), true, anonymousClass308.A07().CdW());
            anonymousClass308.A0G = false;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
