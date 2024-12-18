package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* loaded from: classes7.dex */
public final class HFT extends AbstractC65632xz {
    public final C07T A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final ReelDashboardFragment A03;
    public final Integer A04;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((QuestionResponsesModelIntf) obj).BjV().hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return ((QuestionResponsesModelIntf) obj).Bja();
    }

    public HFT(C07T c07t, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ReelDashboardFragment reelDashboardFragment, Integer num) {
        this.A00 = c07t;
        this.A02 = userSession;
        this.A03 = reelDashboardFragment;
        this.A04 = num;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1790784485);
        C38372Gu9 c38372Gu9 = new C38372Gu9(this.A00, this.A01, this.A02, this.A03, this.A04);
        ((RecyclerView) view).setAdapter(c38372Gu9);
        c38372Gu9.A00 = (QuestionResponsesModelIntf) obj;
        List list = c38372Gu9.A02;
        list.clear();
        list.addAll(c38372Gu9.A00.Boe());
        C38372Gu9.A00(c38372Gu9);
        C0f9.A0A(-1953902624, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(583779263);
        Context context = viewGroup.getContext();
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.reels_question_responses_list, viewGroup, false);
        AbstractC31174DnI.A17(context, recyclerView, false);
        C0f9.A0A(1228259415, A03);
        return recyclerView;
    }
}
