package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.KHt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45630KHt extends AbstractC66412zI {
    public final C47244KuH A00;
    public final InterfaceC11380iw A01;

    public C45630KHt(C47244KuH c47244KuH, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(c47244KuH, 2);
        this.A01 = interfaceC11380iw;
        this.A00 = c47244KuH;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44730JrD(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_gifting_creator_header, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        C45652KIp c45652KIp = (C45652KIp) interfaceC66482zP;
        C44730JrD c44730JrD = (C44730JrD) c3oo;
        AbstractC167007dF.A1K(c45652KIp, c44730JrD);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = c44730JrD.A04;
        gradientSpinnerAvatarView.A0F(null, this.A01, c45652KIp.A01);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        c44730JrD.A01.setText(c45652KIp.A02);
        IgTextView igTextView = c44730JrD.A02;
        igTextView.setText(c45652KIp.A03);
        LQ0.A02(c44730JrD.A00, 44, this);
        View view = c44730JrD.itemView;
        Context context = view.getContext();
        int A05 = AbstractC166997dE.A05(view.getResources());
        boolean z = c45652KIp.A04;
        if (z) {
            i = 0;
        } else {
            i = c45652KIp.A00;
        }
        igTextView.setPadding(A05, 0, A05, i);
        if (z) {
            InterfaceC56392iX interfaceC56392iX = c44730JrD.A03;
            interfaceC56392iX.getView().setPadding(0, A05, 0, c45652KIp.A00);
            ((IgdsBanner) interfaceC56392iX.getView()).setDividerColor(AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_separator));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45652KIp.class;
    }
}
