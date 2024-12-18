package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class HEB extends C7E1 {
    public C41128IIt A00;
    public final List A01 = AbstractC166987dD.A1E();

    public HEB(C41128IIt c41128IIt, C41006IEb c41006IEb) {
        this.A00 = c41128IIt;
        int size = c41128IIt.A04.size();
        for (int i = 0; i < size; i++) {
            this.A01.add(new C38988HEq(AbstractC167007dF.A1X(this.A00.A01, C05F.A01)));
        }
        if (this.A00.A01 == C05F.A01) {
            this.A01.add(new C38989HEr(c41006IEb));
        }
        A0A(this.A01);
        A0C();
    }

    public final void A0C() {
        A06();
        C41128IIt c41128IIt = this.A00;
        List list = c41128IIt.A04;
        C14360o3.A07(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            Object obj2 = this.A01.get(i);
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.common.adapter.bindergroup.BinderGroup<com.instagram.feed.model.MultiQuestionSurvey.PossibleAnswer, java.lang.Void>");
            A08((InterfaceC65642y0) obj2, obj);
        }
        if (c41128IIt.A01 == C05F.A01) {
            List list2 = this.A01;
            Object obj3 = list2.get(AbstractC25226BEj.A05(list2));
            C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.common.adapter.bindergroup.BinderGroup<com.instagram.feed.model.MultiQuestionSurvey.Question, java.lang.Void>");
            A08((InterfaceC65642y0) obj3, c41128IIt);
        }
        A07();
    }
}
