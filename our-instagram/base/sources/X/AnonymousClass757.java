package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.757, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass757 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AbstractC153666vb A01;
    public final /* synthetic */ C153676vc A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass757(AbstractC153666vb abstractC153666vb, C153676vc c153676vc, long j, boolean z, boolean z2) {
        super(1);
        this.A01 = abstractC153666vb;
        this.A02 = c153676vc;
        this.A00 = j;
        this.A03 = z;
        this.A04 = z2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        C14360o3.A0B(anonymousClass435, 0);
        AbstractC153666vb abstractC153666vb = this.A01;
        boolean z = abstractC153666vb instanceof C153656va;
        if (z) {
            C154836xY c154836xY = ((C153656va) abstractC153666vb).A00;
            if (c154836xY.A00 == C05F.A00) {
                c154836xY.A00 = C05F.A01;
                c154836xY.A0E("graphql_model_conversion_start");
            }
        }
        UserSession userSession = abstractC153666vb.A05;
        C14360o3.A0B(userSession, 0);
        C72083XNc A00 = AnonymousClass755.A00(userSession, anonymousClass435);
        if (z) {
            C154836xY c154836xY2 = ((C153656va) abstractC153666vb).A00;
            if (c154836xY2.A00 == C05F.A01) {
                c154836xY2.A00 = C05F.A0C;
                c154836xY2.A0E("graphql_model_conversion_end");
            }
        }
        if (anonymousClass435.A00.isFinal) {
            C006802i.A0p.markEventBuilder(224331318, "clips_fetch").annotate("isRefreshing", this.A04).annotate("isHeadLoad", this.A03).annotate("duration", System.currentTimeMillis() - this.A00).report();
        }
        return A00;
    }
}
