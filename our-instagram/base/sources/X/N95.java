package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes9.dex */
public final class N95 extends AbstractC65632xz {
    public final Context A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final ReelDashboardFragment A03;

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-512439740);
        if (view != null && view.getTag() != null) {
            CallerContext callerContext = AbstractC50624MWl.A01;
            Context context = this.A00;
            UserSession userSession = this.A02;
            AbstractC59962oe abstractC59962oe = this.A01;
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.fxcal.upsell.storyviewer.FxShareToFbRowViewBinder.Holder");
            C54799OJt c54799OJt = (C54799OJt) tag;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.fxcal.upsell.storyviewer.FxShareToFbRowModel");
            OAD oad = (OAD) obj;
            ReelDashboardFragment reelDashboardFragment = this.A03;
            C14360o3.A0B(context, 0);
            JQ0.A1O(userSession, abstractC59962oe, c54799OJt, oad, reelDashboardFragment);
            C196068lw c196068lw = C196058lv.A08;
            C196058lv A00 = C196068lw.A00(userSession);
            CallerContext callerContext2 = AbstractC50624MWl.A01;
            C131995xZ A002 = A00.A00(callerContext2);
            oad.A01 = c196068lw.A04(callerContext2, userSession);
            oad.A00 = C196008lp.A00(userSession);
            if (!oad.A01 && C55156OdK.A03(oad)) {
                LinearLayout linearLayout = c54799OJt.A01;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                C14360o3.A0F("container");
                throw C00O.createAndThrow();
            }
            C55156OdK.A00(context, abstractC59962oe, userSession, A002, oad, c54799OJt, reelDashboardFragment);
            String str = c54799OJt.A0B;
            if (str == null || !str.equals(oad.A02.A0j)) {
                c54799OJt.A0B = oad.A02.A0j;
                ViewTreeObserverOnGlobalLayoutListenerC55500Okt viewTreeObserverOnGlobalLayoutListenerC55500Okt = new ViewTreeObserverOnGlobalLayoutListenerC55500Okt(1, c54799OJt, userSession, oad);
                if (c54799OJt.A00 != null) {
                    LinearLayout linearLayout2 = c54799OJt.A01;
                    if (linearLayout2 != null) {
                        linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(c54799OJt.A00);
                    }
                    C14360o3.A0F("container");
                    throw C00O.createAndThrow();
                }
                c54799OJt.A00 = viewTreeObserverOnGlobalLayoutListenerC55500Okt;
                LinearLayout linearLayout3 = c54799OJt.A01;
                if (linearLayout3 != null) {
                    linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC55500Okt);
                }
                C14360o3.A0F("container");
                throw C00O.createAndThrow();
            }
        }
        C0f9.A0A(-32887213, A03);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public N95(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, ReelDashboardFragment reelDashboardFragment) {
        AbstractC25234BEr.A1P(context, userSession, reelDashboardFragment);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A03 = reelDashboardFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.OJt] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1298594701);
        CallerContext callerContext = AbstractC50624MWl.A01;
        View inflate = AbstractC31172DnG.A09(this.A00).inflate(R.layout.row_share_to_fb_layout, viewGroup, false);
        ?? obj = new Object();
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4));
        LinearLayout linearLayout = (LinearLayout) inflate;
        C14360o3.A0B(linearLayout, 0);
        obj.A01 = linearLayout;
        obj.A06 = AbstractC37301Gc2.A0D(inflate, R.id.icon);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) inflate.requireViewById(R.id.fb_profile_avatar);
        C14360o3.A0B(gradientSpinnerAvatarView, 0);
        obj.A0A = gradientSpinnerAvatarView;
        IgTextView A0X = AbstractC31172DnG.A0X(inflate, R.id.title);
        C14360o3.A0B(A0X, 0);
        obj.A04 = A0X;
        obj.A08 = AbstractC37301Gc2.A0D(inflate, R.id.subtitle);
        obj.A07 = AbstractC37301Gc2.A0D(inflate, R.id.share_button_group);
        obj.A05 = AbstractC37301Gc2.A0D(inflate, R.id.auto_share_buttons);
        IgdsButton A0W = AbstractC31173DnH.A0W(inflate, R.id.share_button_evergreen);
        C14360o3.A0B(A0W, 0);
        obj.A09 = A0W;
        IgTextView A0X2 = AbstractC31172DnG.A0X(inflate, R.id.shared_button_evergreen);
        C14360o3.A0B(A0X2, 0);
        obj.A02 = A0X2;
        linearLayout.setTag(obj);
        C0f9.A0A(-11400096, A03);
        return inflate;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
