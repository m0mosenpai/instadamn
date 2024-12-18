package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.12E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12E extends AbstractC211911v {
    public final Context A00;
    public final C211211o A01;

    public C12E(Context context, C211211o c211211o) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = c211211o;
    }

    @Override // X.AbstractC211911v
    public final void A04(C226418s c226418s) {
        C14360o3.A0B(c226418s, 0);
        long j = super.A01;
        long j2 = super.A00;
        c226418s.A0Q(c226418s.A02, "FEED_REQUEST_INIT_START", j);
        c226418s.A0Q(c226418s.A02, "FEED_REQUEST_INIT_END", j2);
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "FeedRequestInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        C1CA c1ca = C1CA.A03;
        C1CC.A09 = c1ca;
        AnonymousClass523 anonymousClass523 = C1CC.A03;
        if (anonymousClass523 != null) {
            C19L c19l = anonymousClass523.A04;
            AbstractC23641Du.A05(AnonymousClass191.A00, new C57167PZl(anonymousClass523, c1ca, null, 5), c19l);
        }
        AbstractC12990ll A08 = ((AnonymousClass122) this.A01.A00()).A08();
        if (A08 instanceof UserSession) {
            UserSession userSession = (UserSession) A08;
            C17570ts.A00(userSession);
            C1CI A00 = C1CH.A00(userSession);
            if (C08750cd.A04.A02()) {
                A00.A04(this.A00, userSession, null, false);
            } else {
                A00.A06(false);
                boolean z = AbstractC58327PtK.A00;
                AbstractC58327PtK.A06(new C9FO(5, this, A00, A08));
            }
            if (C18U.A06(C06090Tz.A05, A08, 36327486225529461L)) {
                AbstractC62432si.A02 = true;
            }
        }
    }
}
