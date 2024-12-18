package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Dyn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31829Dyn extends AbstractC52922bZ {
    public final C5Fn A00;
    public final UserSession A01;
    public final C2DS A02;
    public final List A03;
    public final C05A A04;
    public final C0UO A05;

    public C31829Dyn(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = C2JD.A00(userSession);
        C008002u A1H = AbstractC25225BEi.A1H(new MUG(false, (List) null, (List) null, 7, (DefaultConstructorMarker) null, 11));
        this.A04 = A1H;
        this.A03 = AbstractC166987dD.A1E();
        this.A05 = AbstractC208910l.A02(A1H);
        this.A00 = AbstractC31180DnO.A0J(userSession, C4HC.A00);
    }

    public final void A00() {
        Object value;
        MUG mug;
        boolean z;
        ArrayList A0q;
        C05A c05a = this.A04;
        do {
            value = c05a.getValue();
            mug = (MUG) value;
            z = !mug.A01;
            List<C32089E8n> list = (List) mug.A00;
            A0q = AbstractC167017dG.A0q(list);
            for (C32089E8n c32089E8n : list) {
                String str = c32089E8n.A01;
                String str2 = c32089E8n.A02;
                String str3 = c32089E8n.A03;
                AbstractC46972Dl abstractC46972Dl = c32089E8n.A00;
                boolean z2 = c32089E8n.A05;
                boolean z3 = c32089E8n.A06;
                boolean z4 = c32089E8n.A04;
                C14360o3.A0B(str, 0);
                AbstractC167027dH.A13(str2, str3, abstractC46972Dl);
                A0q.add(new C32089E8n(abstractC46972Dl, str, str2, str3, z2, z3, z4, z));
            }
        } while (!c05a.AIi(value, MUG.A00(A0q, AbstractC001800i.A0T(C34890FZc.A00, (Collection) mug.A03), z)));
    }

    public final void maybeShowNuxBanner() {
        Object value;
        MUG mug;
        C2056398n A00 = AbstractC2056298m.A00(this.A01);
        if (!AbstractC167017dG.A1b(A00, A00.A0N, C2056398n.A0d, 29)) {
            C05A c05a = this.A04;
            do {
                value = c05a.getValue();
                mug = (MUG) value;
            } while (!c05a.AIi(value, MUG.A00((List) mug.A00, AbstractC001800i.A0T(C34889FZb.A00, (Collection) mug.A03), mug.A01)));
        }
    }
}
