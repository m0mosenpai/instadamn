package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes11.dex */
public final class U1I extends AbstractC66412zI {
    public final Fragment A00;
    public final UserSession A01;
    public final C65921TwS A02;
    public final InterfaceC72020XFi A03;
    public final boolean A04;

    public U1I(Fragment fragment, UserSession userSession, C65921TwS c65921TwS, InterfaceC72020XFi interfaceC72020XFi, boolean z) {
        C14360o3.A0B(userSession, 5);
        this.A02 = c65921TwS;
        this.A03 = interfaceC72020XFi;
        this.A00 = fragment;
        this.A04 = z;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        IgTextView igTextView;
        EnumC33510Erj enumC33510Erj;
        VA6 va6 = (VA6) interfaceC66482zP;
        C66478UJc c66478UJc = (C66478UJc) c3oo;
        if (c66478UJc != null && va6 != null) {
            C65921TwS c65921TwS = this.A02;
            InterfaceC72020XFi interfaceC72020XFi = this.A03;
            boolean z = this.A04;
            Fragment fragment = this.A00;
            UserSession userSession = this.A01;
            AbstractC167017dG.A1R(c65921TwS, interfaceC72020XFi);
            AbstractC167017dG.A1T(fragment, userSession);
            IgTextView igTextView2 = c66478UJc.A06;
            String str = va6.A04;
            igTextView2.setText(str);
            IgTextView igTextView3 = c66478UJc.A03;
            String str2 = va6.A03;
            igTextView3.setText(str2);
            String str3 = va6.A05;
            if (C14360o3.A0K(str3, "search_nullstate_ci_row_upsell")) {
                C19270xB c19270xB = new C19270xB("search_typeahead_small");
                c65921TwS.A07(c19270xB);
                View view = c66478UJc.A00;
                Context context = view.getContext();
                view.setPadding(context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC166997dE.A04(context, R.dimen.account_discovery_bottom_gap));
                C0fQ.A00(new WNR(18, c19270xB, va6, c65921TwS, fragment), view);
                CircularImageView circularImageView = c66478UJc.A08;
                AbstractC166997dE.A19(context, circularImageView, R.drawable.ig_illustrations_illo_contacts_permissions_refresh);
                circularImageView.setStrokeAlpha(0);
                igTextView2.setPadding(0, 0, 0, AbstractC167017dG.A04(context));
                igTextView2.setTextAppearance(R.style.PrivacyTextStyle);
                if (C18U.A06(C06090Tz.A06, userSession, 36320429593666039L)) {
                    igTextView3.setTextAppearance(R.style.igds_emphasized_body_2);
                    AbstractC166987dD.A1O(context, igTextView3, AbstractC53242c7.A0C(context));
                    C0fQ.A00(new WNR(19, c19270xB, va6, c65921TwS, fragment), igTextView3);
                    AbstractC31177DnL.A0z(igTextView2, context);
                } else {
                    igTextView3.setVisibility(8);
                    AbstractC31173DnH.A19(context.getResources(), igTextView2, 2131973004);
                    AbstractC166987dD.A1O(context, igTextView2, AbstractC53242c7.A09(context));
                    c66478UJc.A04.setVisibility(0);
                }
                AbstractC50522MSa.A0y(view);
                IgSimpleImageView igSimpleImageView = c66478UJc.A01;
                igSimpleImageView.setVisibility(0);
                C0fQ.A00(new WNR(20, c19270xB, va6, c65921TwS, fragment), igSimpleImageView);
                return;
            }
            if (C14360o3.A0K(str3, "search_invites_upsell")) {
                if (va6.A01 == C05F.A01) {
                    enumC33510Erj = EnumC33510Erj.SEARCH_ACCOUNT_TAB;
                } else {
                    enumC33510Erj = EnumC33510Erj.SEARCH_TYPEAHEAD;
                }
                View view2 = c66478UJc.A00;
                Context A0L = AbstractC166997dE.A0L(view2);
                AbstractC35249Fgi.A05(enumC33510Erj, userSession, C54P.A01(A0L, userSession));
                IgSimpleImageView igSimpleImageView2 = c66478UJc.A01;
                igSimpleImageView2.setVisibility(0);
                igTextView3.setVisibility(8);
                igTextView = c66478UJc.A05;
                igTextView.setVisibility(0);
                igTextView2.setVisibility(8);
                IgTextView igTextView4 = c66478UJc.A07;
                igTextView4.setVisibility(0);
                IgTextView igTextView5 = c66478UJc.A02;
                igTextView5.setVisibility(0);
                C19270xB c19270xB2 = new C19270xB("search_typeahead_small");
                interfaceC72020XFi.EDz(view2, va6.A00, va6.A04());
                C0fQ.A00(new WNR(21, c19270xB2, va6, c65921TwS, fragment), view2);
                C0fQ.A00(new WNR(22, c19270xB2, va6, c65921TwS, fragment), igSimpleImageView2);
                CircularImageView circularImageView2 = c66478UJc.A08;
                AbstractC166997dE.A19(A0L, circularImageView2, R.drawable.instagram_contacts_pano_outline_24);
                circularImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                circularImageView2.setStrokeAlpha(38);
                AbstractC31173DnH.A11(A0L, circularImageView2, AbstractC53242c7.A0H(A0L, R.attr.glyphColorPrimary));
                igTextView4.setText(str);
                igTextView.setText(str2);
                igTextView5.setText(va6.A02);
                if (!z) {
                    return;
                }
                AbstractC66174U2p.A01(view2);
                int A06 = AbstractC43594JPz.A06(circularImageView2.getContext());
                AbstractC43592JPx.A1F(circularImageView2, A06);
                circularImageView2.getLayoutParams().width = A06;
                igTextView.setLineSpacing(0.0f, 1.33f);
            } else {
                View view3 = c66478UJc.A00;
                interfaceC72020XFi.EDz(view3, va6.A00, va6.A04());
                WNX.A00(view3, c65921TwS, va6, fragment, 56);
                WNX.A00(igTextView3, c65921TwS, va6, fragment, 57);
                CircularImageView circularImageView3 = c66478UJc.A08;
                AbstractC166997dE.A19(view3.getContext(), circularImageView3, R.drawable.ig_illustrations_qp_search_refresh);
                if (!z) {
                    return;
                }
                AbstractC66174U2p.A01(view3);
                int A062 = AbstractC43594JPz.A06(circularImageView3.getContext());
                AbstractC43592JPx.A1F(circularImageView3, A062);
                circularImageView3.getLayoutParams().width = A062;
                igTextView3.setLineSpacing(0.0f, 1.33f);
                igTextView = igTextView3;
            }
            igTextView.setTextSize(0, AbstractC25228BEl.A0M(igTextView3).getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return VA6.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        return new C66478UJc(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_search_upsell, false));
    }
}
