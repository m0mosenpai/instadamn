package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HEr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38989HEr extends AbstractC65632xz {
    public final C41006IEb A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C38989HEr(C41006IEb c41006IEb) {
        this.A00 = c41006IEb;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1744485476);
        AbstractC167017dG.A1P(view, obj);
        if (view.getTag() != null) {
            if (i == 0) {
                C41128IIt c41128IIt = (C41128IIt) obj;
                int size = c41128IIt.A04.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    if (((C41101IHs) c41128IIt.A04.get(i3)).A03) {
                        i2++;
                    }
                }
                Context A0L = AbstractC166997dE.A0L(view);
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.survey.MultiQuestionSurveyNextViewBinder.Holder");
                IC6 ic6 = (IC6) tag;
                boolean A1O = AbstractC167007dF.A1O(i2);
                C41006IEb c41006IEb = this.A00;
                AbstractC167017dG.A1Q(ic6, c41006IEb);
                String A0p = AbstractC166997dE.A0p(A0L, 2131974792);
                View view2 = ic6.A00;
                AbstractC25230BEn.A0Q(view2, R.id.button_multi_select_next).setText(A0p);
                view2.setEnabled(A1O);
                ViewOnClickListenerC42032Ik1.A01(AbstractC166987dD.A0c(view2, R.id.button_multi_select_next), 25, c41006IEb);
            } else {
                IllegalStateException A14 = AbstractC166987dD.A14("Unsupported view type");
                C0f9.A0A(-70605271, A03);
                throw A14;
            }
        }
        C0f9.A0A(2062890344, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1418851760);
        if (i == 0) {
            View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.answers_footer, false);
            A0C.setTag(new IC6(A0C));
            C0f9.A0A(1832828184, A0G);
            return A0C;
        }
        IllegalStateException A14 = AbstractC166987dD.A14("Unsupported view type");
        C0f9.A0A(785749397, A0G);
        throw A14;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
