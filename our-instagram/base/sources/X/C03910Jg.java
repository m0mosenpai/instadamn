package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03910Jg extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03910Jg(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(context, c211211o) { // from class: X.12I
            public final Context A00;
            public final C211211o A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "EagerReelNetworkRequestInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                UserSession userSession;
                AbstractC12990ll A08 = ((AnonymousClass122) this.A01.A00()).A08();
                if ((A08 instanceof UserSession) && (userSession = (UserSession) A08) != null && C18U.A06(C06090Tz.A05, userSession, 36328057458015334L)) {
                    C1L8.A00.A00(this.A00, userSession);
                    C1LD A00 = C1LB.A00(userSession);
                    if (C08750cd.A04.A02()) {
                        A00.A04(userSession);
                    }
                }
            }
        };
    }
}
