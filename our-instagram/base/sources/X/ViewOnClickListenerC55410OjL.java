package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OjL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55410OjL implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ String A03;

    public ViewOnClickListenerC55410OjL(Context context, UserSession userSession, C38321qM c38321qM, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c38321qM;
        this.A03 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1ON A07;
        NAD nad;
        int A05 = C0f9.A05(538894305);
        Context context = this.A00;
        UserSession userSession = this.A01;
        C38321qM c38321qM = this.A02;
        String str = this.A03;
        C57253Pbb c57253Pbb = new C57253Pbb(48, c38321qM, userSession);
        C50368MLv c50368MLv = new C50368MLv(context, 5);
        Integer A02 = C151866sW.A02(userSession, false);
        if (A02 == C05F.A00) {
            C2JM A0b = AbstractC25225BEi.A0b();
            AbstractC25231BEo.A18(AbstractC50524MSc.A06(str), A0b);
            A07 = AbstractC31178DnM.A0H(new C907442n(A0b, C51523Mp9.class, "ContentSchedulingPublishMutation", true), userSession);
            nad = new NAD(4, context, c50368MLv, c57253Pbb);
        } else {
            Integer num = C05F.A01;
            if (A02 == num) {
                C2JM A0b2 = AbstractC25225BEi.A0b();
                AbstractC25231BEo.A18(AbstractC50524MSc.A06(str), A0b2);
                A07 = AbstractC50524MSc.A07(A0b2, userSession, C51521Mp7.class, num, "ContentSchedulingPublishGenPopLinkedMutation");
                nad = new NAD(5, context, c50368MLv, c57253Pbb);
            } else {
                c50368MLv.invoke("Scheduling not enabled");
                C9GR.A07(context, 2131956782);
                C0f9.A0C(-1926869728, A05);
            }
        }
        A07.A00 = nad;
        C1GJ.A03(A07);
        C9GR.A07(context, 2131956782);
        C0f9.A0C(-1926869728, A05);
    }
}
