package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.HEs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38990HEs extends AbstractC65632xz {
    public final InterfaceC11380iw A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C38990HEs(InterfaceC11380iw interfaceC11380iw) {
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        String username;
        int A03 = C0f9.A03(1841492073);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        if (i == 0) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.genericsurvey.ui.BusinessCardViewBinder.Holder");
            IKF ikf = (IKF) tag;
            C41221IMm c41221IMm = (C41221IMm) obj;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            boolean A1T = AbstractC31175DnJ.A1T(1, ikf, c41221IMm);
            C14360o3.A0B(interfaceC11380iw, A06);
            AbstractC31173DnH.A1T(interfaceC11380iw, ikf.A07, c41221IMm.A00());
            String fullName = c41221IMm.A00().getFullName();
            if (fullName != null && fullName.length() != 0) {
                textView = ikf.A06;
                username = c41221IMm.A00().getFullName();
            } else {
                textView = ikf.A06;
                username = c41221IMm.A00().getUsername();
            }
            textView.setText(username);
            String category = c41221IMm.A00().A03.getCategory();
            if (category != null && category.length() != 0) {
                TextView textView2 = ikf.A05;
                textView2.setVisibility(A1T ? 1 : 0);
                textView2.setText(c41221IMm.A00().A03.getCategory());
            } else {
                ikf.A05.setVisibility(8);
                Context context = textView.getContext();
                Resources resources = context.getResources();
                textView.setPadding(A1T ? 1 : 0, (int) AbstractC13880nE.A00(context, resources.getDimension(R.dimen.abc_button_padding_horizontal_material)), A1T ? 1 : 0, (int) AbstractC13880nE.A00(context, resources.getDimension(R.dimen.account_discovery_bottom_gap)));
            }
            c41221IMm.A01();
            if (AbstractC166987dD.A1b(c41221IMm.A01())) {
                if (ikf.A00 == null) {
                    View inflate = ikf.A04.inflate();
                    C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) inflate;
                    ikf.A00 = viewGroup;
                    if (viewGroup != null) {
                        ikf.A01 = (IgImageView) viewGroup.findViewById(R.id.grid_image_1);
                        ikf.A02 = (IgImageView) viewGroup.findViewById(R.id.grid_image_2);
                        ikf.A03 = (IgImageView) viewGroup.findViewById(R.id.grid_image_3);
                    }
                }
                IgImageView igImageView = ikf.A01;
                if (igImageView != null) {
                    igImageView.setUrl((ImageUrl) c41221IMm.A01().get(A1T ? 1 : 0), interfaceC11380iw);
                    IgImageView igImageView2 = ikf.A02;
                    if (igImageView2 != null) {
                        igImageView2.setUrl((ImageUrl) c41221IMm.A01().get(1), interfaceC11380iw);
                        IgImageView igImageView3 = ikf.A03;
                        if (igImageView3 != null) {
                            igImageView3.setUrl((ImageUrl) c41221IMm.A01().get(A06), interfaceC11380iw);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            C0f9.A0A(1024167221, A03);
            return;
        }
        UnsupportedOperationException A1D = AbstractC166987dD.A1D("View type unhandled");
        C0f9.A0A(1231610929, A03);
        throw A1D;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1725037757);
        if (i == 0) {
            View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.business_card, false);
            A0C.setTag(new IKF(A0C));
            C0f9.A0A(1501799293, A0G);
            return A0C;
        }
        UnsupportedOperationException A1D = AbstractC166987dD.A1D("Unhandled view type");
        C0f9.A0A(-571381236, A0G);
        throw A1D;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
