package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0CO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CO extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CO(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(context, c211211o) { // from class: X.13a
            public final Context A00;
            public final C211211o A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "ShareToFeedInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                boolean z;
                boolean z2;
                Context context2 = this.A00;
                C211211o c211211o2 = this.A01;
                AbstractC12990ll A08 = ((AnonymousClass122) c211211o2.A00()).A08();
                if (A08 instanceof UserSession) {
                    z = C18U.A06(C06090Tz.A05, A08, 36319682269027922L);
                } else {
                    z = false;
                }
                AbstractC14490oL.A08(context2, "com.instagram.share.handleractivity.ShareHandlerActivity", !z);
                AbstractC12990ll A082 = ((AnonymousClass122) c211211o2.A00()).A08();
                if (A082 instanceof UserSession) {
                    z2 = C18U.A06(C06090Tz.A05, A082, 36319682269027922L);
                } else {
                    z2 = false;
                }
                AbstractC14490oL.A08(context2, "com.instagram.share.handleractivity.ShareHandlerActivityMultipleFeedAlias", z2);
            }
        };
    }
}
