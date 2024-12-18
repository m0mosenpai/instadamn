package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.reels.dashboard.ui.quickreaction.ReactionCountBarView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes7.dex */
public final class HIV extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final ReelDashboardFragment A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42331Iot c42331Iot = (C42331Iot) interfaceC66482zP;
        C38466Gvn c38466Gvn = (C38466Gvn) c3oo;
        c38466Gvn.A01.setUrl(C148336m3.A04.A04(c42331Iot.A04), this.A01);
        int i = c42331Iot.A00;
        c38466Gvn.A00.setText(C84963qk.A02(this.A00.getResources(), Integer.valueOf(i)));
        ReactionCountBarView reactionCountBarView = c38466Gvn.A02;
        reactionCountBarView.setVisibility(0);
        reactionCountBarView.setFillPercentage(i / c42331Iot.A02);
        C0fQ.A00(new ViewOnClickListenerC42027Ijw(12, this, c42331Iot), c38466Gvn.itemView);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38466Gvn(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reel_reaction_item));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42331Iot.class;
    }

    public HIV(Context context, InterfaceC11380iw interfaceC11380iw, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A02 = reelDashboardFragment;
    }
}
