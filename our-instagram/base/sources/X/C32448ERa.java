package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.ERa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32448ERa extends AbstractC65632xz {
    public boolean A00;
    public final UserSession A01;
    public final InterfaceC16620sF A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32448ERa(UserSession userSession, InterfaceC16620sF interfaceC16620sF, boolean z) {
        this.A01 = userSession;
        this.A00 = z;
        this.A02 = interfaceC16620sF;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = C0f9.A03(1054539688);
        if (view == null) {
            i2 = 748417925;
        } else {
            if (obj != null) {
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.banner.viewbinder.FeaturedReorderViewBinder.Holder");
                C34619FNc c34619FNc = (C34619FNc) tag;
                AnonymousClass749 anonymousClass749 = (AnonymousClass749) obj;
                boolean z = this.A00;
                AbstractC167017dG.A1O(c34619FNc, anonymousClass749);
                c34619FNc.A03.setImageResource(anonymousClass749.BEo());
                c34619FNc.A01.setText(anonymousClass749.getTitle());
                String subtitle = anonymousClass749.getSubtitle();
                if (subtitle != null) {
                    c34619FNc.A00.setText(AnonymousClass001.A0u(" ", "•", " ", subtitle));
                }
                int i3 = 8;
                c34619FNc.A04.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
                IgImageView igImageView = c34619FNc.A02;
                if (anonymousClass749.Bwm()) {
                    i3 = 0;
                }
                igImageView.setVisibility(i3);
                ViewOnClickListenerC31724DwT.A00(igImageView, 50, anonymousClass749);
            }
            i2 = -23640820;
        }
        C0f9.A0A(i2, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1781146835);
        if (viewGroup != null) {
            InterfaceC16620sF interfaceC16620sF = this.A02;
            View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.profile_featured_reorder_banner_item, AbstractC25229BEm.A1Y(interfaceC16620sF));
            A0C.setTag(new C34619FNc(A0C));
            A0C.setOnTouchListener(new ViewOnTouchListenerC35710Fpk(interfaceC16620sF, 4));
            C0f9.A0A(-438168702, A03);
            return A0C;
        }
        IllegalArgumentException A0n = AbstractC25227BEk.A0n();
        C0f9.A0A(-1813123667, A03);
        throw A0n;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
