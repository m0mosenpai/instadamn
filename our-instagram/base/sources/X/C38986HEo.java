package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.HEo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38986HEo extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = C0f9.A03(351645435);
        if (view == null) {
            i2 = 1220392489;
        } else {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type instagram.features.stories.dashboard.ReelDashboardAnonymousViewersBinder.Holder");
            IG9 ig9 = (IG9) tag;
            C14360o3.A0C(obj, "null cannot be cast to non-null type instagram.features.stories.dashboard.ReelDashboardAnonymousViewers");
            IG8 ig8 = (IG8) obj;
            AbstractC167017dG.A1N(ig9, ig8);
            ig9.A01.setText(ig8.A01);
            ig9.A00.setText(ig8.A00);
            i2 = -236932649;
        }
        C0f9.A0A(i2, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1810952087);
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.reel_dashboard_anonymous_viewers, viewGroup, false);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) inflate.findViewById(R.id.anonymous_viewers_image);
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        }
        inflate.setTag(new IG9(AbstractC25230BEn.A0Q(inflate, R.id.anonymous_viewers_header), AbstractC25230BEn.A0Q(inflate, R.id.anonymous_viewers_body)));
        C0f9.A0A(249953586, A0G);
        return inflate;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
