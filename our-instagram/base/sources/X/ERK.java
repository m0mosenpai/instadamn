package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ERK extends AbstractC65632xz {
    public final UserSession A00;
    public final User A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERK(UserSession userSession, User user) {
        this.A00 = userSession;
        this.A01 = user;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1732555082);
        if (view != null) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.banner.viewbinder.BannerRowBottomSheetViewBinder.Holder");
            FN4 fn4 = (FN4) tag;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.profile.bindergroup.banner.intf.BannerItemIntf");
            AnonymousClass749 anonymousClass749 = (AnonymousClass749) obj;
            AbstractC167007dF.A1E(fn4, 0, anonymousClass749);
            fn4.A03.setImageResource(anonymousClass749.BEo());
            fn4.A02.setText(anonymousClass749.getTitle());
            IgTextView igTextView = fn4.A01;
            String subtitle = anonymousClass749.getSubtitle();
            igTextView.setText(subtitle);
            int i2 = 0;
            if (subtitle == null || AbstractC001900j.A0T(subtitle)) {
                i2 = 8;
            }
            igTextView.setVisibility(i2);
            ViewOnClickListenerC31724DwT.A00(fn4.A00, 49, anonymousClass749);
        }
        C0f9.A0A(678230290, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1680792054);
        if (viewGroup != null) {
            View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.profile_bottomsheet_banner_item, false);
            A0C.setTag(new FN4(A0C));
            C0f9.A0A(44167828, A03);
            return A0C;
        }
        IllegalArgumentException A0n = AbstractC25227BEk.A0n();
        C0f9.A0A(-1921880282, A03);
        throw A0n;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
