package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteAdsManagerActionType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes11.dex */
public final class V34 extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC71976XDj A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V34(Context context, InterfaceC71976XDj interfaceC71976XDj, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = interfaceC11380iw;
        this.A01 = interfaceC71976XDj;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        int i2;
        View view2;
        int A03 = C0f9.A03(170014293);
        AbstractC167017dG.A1P(view, obj);
        C69432VnH c69432VnH = (C69432VnH) view.getTag();
        if (c69432VnH != null) {
            InterfaceC11380iw interfaceC11380iw = this.A02;
            InterfaceC71976XDj interfaceC71976XDj = this.A01;
            InterfaceC72003XEr interfaceC72003XEr = (InterfaceC72003XEr) obj;
            AbstractC25233BEq.A0x(3, interfaceC11380iw, interfaceC71976XDj, interfaceC72003XEr);
            C69460Vnj c69460Vnj = c69432VnH.A07;
            Context context = c69432VnH.A00;
            WEF.A01(context, interfaceC71976XDj, c69460Vnj, interfaceC72003XEr, interfaceC11380iw);
            C69460Vnj c69460Vnj2 = c69432VnH.A08;
            InterfaceC72003XEr interfaceC72003XEr2 = (InterfaceC72003XEr) AbstractC001800i.A0J(interfaceC72003XEr.BzE());
            if (interfaceC72003XEr2 != null) {
                WEF.A01(context, interfaceC71976XDj, c69460Vnj2, interfaceC72003XEr2, interfaceC11380iw);
                c69460Vnj.A01.setVisibility(0);
                c69460Vnj.A0B.setText("A");
                c69432VnH.A02.setVisibility(0);
                c69460Vnj2.A01.setVisibility(0);
                c69460Vnj2.A0B.setText("B");
                textView = c69432VnH.A05;
                i2 = 2131976823;
            } else {
                c69460Vnj2.A02.setVisibility(8);
                c69460Vnj2.A00.setVisibility(8);
                c69432VnH.A02.setVisibility(8);
                c69460Vnj.A01.setVisibility(8);
                textView = c69432VnH.A05;
                i2 = 2131976849;
            }
            textView.setText(i2);
            int i3 = 0;
            if (PromoteAdsManagerActionType.A00.A00(interfaceC72003XEr) == PromoteAdsManagerActionType.A04) {
                c69432VnH.A03.setVisibility(8);
                view2 = c69432VnH.A01;
            } else {
                View view3 = c69432VnH.A03;
                view3.setVisibility(0);
                WNV.A00(view3, 49, interfaceC71976XDj, interfaceC72003XEr);
                if (interfaceC72003XEr.CXK()) {
                    View view4 = c69432VnH.A04;
                    view4.setVisibility(0);
                    WNV.A00(view4, 51, interfaceC71976XDj, interfaceC72003XEr);
                    if (interfaceC72003XEr.BWj() > 0) {
                        c69432VnH.A09.setVisibility(0);
                        TextView textView2 = c69432VnH.A06;
                        textView2.setVisibility(0);
                        MSX.A15(textView2, interfaceC72003XEr.BWj());
                        C0f9.A0A(1047636026, A03);
                        return;
                    }
                    i3 = 8;
                    c69432VnH.A09.setVisibility(8);
                    view2 = c69432VnH.A06;
                } else {
                    view2 = c69432VnH.A04;
                    i3 = 8;
                }
            }
            view2.setVisibility(i3);
            C0f9.A0A(1047636026, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(1366293363, A03);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -458835979);
        Context context = this.A00;
        View A07 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(context), viewGroup, R.layout.promotion_list_view, false);
        TextView A0H = AbstractC65702TsY.A0H(A07, R.id.new_leads_count);
        IgImageView igImageView = (IgImageView) AbstractC166997dE.A0S(A07, R.id.new_leads_blue_dot);
        View A0S = AbstractC166997dE.A0S(A07, R.id.ad_tools_view_insights_row);
        TextView A0H2 = AbstractC65702TsY.A0H(A0S, R.id.secondary_text);
        A07.setTag(new C69432VnH(context, AbstractC166997dE.A0S(A07, R.id.promotion_row_internal_separator_view), A0S, AbstractC166997dE.A0S(A07, R.id.new_leads_arrow), AbstractC166997dE.A0S(A07, R.id.boost_list_view_bottom_padding), A0H, A0H2, WEF.A00(AbstractC166997dE.A0S(A07, R.id.primary_promotion_row_view), AbstractC166997dE.A0S(A07, R.id.primary_status_view)), WEF.A00(AbstractC166997dE.A0S(A07, R.id.secondary_promotion_row_view), AbstractC166997dE.A0S(A07, R.id.secondary_status_view)), igImageView));
        C0f9.A0A(2055401161, A0G);
        return A07;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
