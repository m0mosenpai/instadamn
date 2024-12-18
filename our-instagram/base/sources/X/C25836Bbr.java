package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bbr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25836Bbr extends AbstractC52922bZ {
    public final UserSession A00;
    public final InterfaceC06180Ui A01;
    public final InterfaceC06180Ui A02;
    public final InterfaceC15070pN A03;
    public final InterfaceC15070pN A04;

    public C25836Bbr(UserSession userSession, String str) {
        AbstractC167007dF.A1D(userSession, 1, str);
        this.A00 = userSession;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 1, 0);
        this.A02 = A00;
        this.A04 = new C06160Ug(null, A00);
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A01 = A002;
        this.A03 = new C06160Ug(null, A002);
        C141796aw A003 = AbstractC141776au.A00(this);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new D4v(this, null, 11), A003);
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "summary_id");
        C2JM A0b = AbstractC25225BEi.A0b();
        C28909CpI.A00(new C28911CpL(this, 3), new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "request_data"), "IGCommentInsightsSummaryInfoQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59361QdJ.class, false, null, 0, null, "xdt_get_comment_summary_by_comment_summary_id", AbstractC166987dD.A1E()), AbstractC40691uc.A01(this.A00), this, 5);
    }
}
