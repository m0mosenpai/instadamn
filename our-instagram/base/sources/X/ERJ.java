package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ERJ extends AbstractC65632xz {
    public final UserSession A00;
    public final C32279EJq A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERJ(UserSession userSession, C32279EJq c32279EJq) {
        this.A00 = userSession;
        this.A01 = c32279EJq;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = C0f9.A03(-1297744938);
        if (view == null) {
            i2 = 170133023;
        } else {
            if (obj != null) {
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.banner.viewbinder.AvailableBannersViewBinder.Holder");
                FN3 fn3 = (FN3) tag;
                AnonymousClass749 anonymousClass749 = (AnonymousClass749) obj;
                C32279EJq c32279EJq = this.A01;
                AbstractC25233BEq.A0v(0, fn3, anonymousClass749, c32279EJq);
                fn3.A03.setImageResource(anonymousClass749.BEo());
                fn3.A02.setText(anonymousClass749.getTitle());
                String subtitle = anonymousClass749.getSubtitle();
                if (subtitle != null) {
                    fn3.A01.setText(AnonymousClass001.A0u(" ", "•", " ", subtitle));
                }
                ViewOnClickListenerC35687FpM.A00(fn3.A00, 13, anonymousClass749, c32279EJq);
            }
            i2 = 123502588;
        }
        C0f9.A0A(i2, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1989181848);
        if (viewGroup != null) {
            View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.profile_available_banner_item, false);
            A0C.setTag(new FN3(A0C));
            C0f9.A0A(298853910, A03);
            return A0C;
        }
        IllegalArgumentException A0n = AbstractC25227BEk.A0n();
        C0f9.A0A(-1850096506, A03);
        throw A0n;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
