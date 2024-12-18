package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.ERe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32452ERe extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final ReelDashboardFragment A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32452ERe(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ReelDashboardFragment reelDashboardFragment) {
        AbstractC167027dH.A13(interfaceC11380iw, userSession, reelDashboardFragment);
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A02 = reelDashboardFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1709057617);
        AbstractC167017dG.A1P(view, obj);
        ((RecyclerView) view).setAdapter(new C31881Dzn(this.A00, this.A01, (C41181vS) obj, this.A02));
        C0f9.A0A(-1131916831, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1294040431);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_dashboard_prompt_replies, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(9));
        RecyclerView recyclerView = (RecyclerView) inflate;
        AbstractC31174DnI.A17(context, recyclerView, false);
        C0f9.A0A(1246409320, A0G);
        return recyclerView;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
