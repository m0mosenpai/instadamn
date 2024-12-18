package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes7.dex */
public final class HF5 extends AbstractC65632xz {
    public final GZD A00;
    public final ReelDashboardFragment A01;

    public HF5(GZD gzd, ReelDashboardFragment reelDashboardFragment) {
        C14360o3.A0B(reelDashboardFragment, 2);
        this.A00 = gzd;
        this.A01 = reelDashboardFragment;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 1649351374);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type instagram.features.stories.dashboard.ReelDashboardSearchBarBinderGroup.Holder");
        C41118IIj c41118IIj = (C41118IIj) tag;
        if (c41118IIj.A01) {
            c41118IIj.A03.A0E.requestFocus();
        }
        C41181vS c41181vS = c41118IIj.A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type instagram.features.stories.dashboard.ReelDashboardSearchBarBinderGroup.SearchBarModel");
        C41181vS c41181vS2 = ((IE6) obj).A00;
        if (!C14360o3.A0K(c41181vS, c41181vS2)) {
            IgdsInlineSearchBox igdsInlineSearchBox = c41118IIj.A03;
            igdsInlineSearchBox.A02 = null;
            igdsInlineSearchBox.clearFocus();
            igdsInlineSearchBox.A0E.setText((CharSequence) null);
            igdsInlineSearchBox.A02 = this.A00;
        }
        c41118IIj.A00 = c41181vS2;
        Context context = c41118IIj.A02;
        int A03 = AbstractC167017dG.A03(context);
        C124385ju c124385ju = new C124385ju(context, 1.0f, AbstractC53242c7.A0H(context, R.attr.dividerColor), 48);
        c124385ju.A00(A03, 0, A03, 0);
        c41118IIj.A03.setBackground(c124385ju);
        C0f9.A0A(1350940996, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1774180289);
        View A0A = AbstractC31176DnK.A0A(AbstractC31177DnL.A0E(viewGroup, 1), viewGroup, R.layout.search_bar_with_blur_text);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) A0A.findViewById(R.id.search_box_with_blur);
        C14360o3.A0A(igdsInlineSearchBox);
        A0A.setTag(new C41118IIj(A0A, viewGroup, this.A00, igdsInlineSearchBox, this.A01));
        C0f9.A0A(-1599229059, A03);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
