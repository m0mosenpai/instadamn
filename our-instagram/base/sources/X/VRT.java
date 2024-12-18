package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VRT {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(View view, FragmentActivity fragmentActivity, XIGIGBoostDestination xIGIGBoostDestination, XEK xek, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        AbstractC43594JPz.A1P(userSession, list);
        C70399WUb A00 = C70399WUb.A00(userSession);
        C14360o3.A07(A00);
        AbstractC23021Ah.A00(userSession);
        AbstractC166997dE.A0S(view, R.id.promote_preview_title_text).setVisibility(z ? 8 : 0);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.promote_preview_subtitle_text);
        A0N.setVisibility(z ? 8 : 0);
        AbstractC166987dD.A1P(fragmentActivity, A0N, 2131970869);
        AbstractC166997dE.A0S(view, R.id.promote_preview_subtitle_divider).setVisibility(8);
        InterfaceC72021XFj interfaceC72021XFj = (InterfaceC72021XFj) fragmentActivity;
        if (interfaceC72021XFj.BiY().A0D()) {
            MSY.A0y(view, R.id.promote_preview_ab_banner_stub);
            if (imageUrl != null) {
                ((IgImageView) view.requireViewById(R.id.banner_thumbnail)).setUrl(imageUrl, interfaceC11380iw);
            }
            if (str != null) {
                AbstractC31176DnK.A1F(view, str, R.id.banner_title);
            }
        }
        if (list.contains(AdsAPIInstagramPosition.A0G)) {
            WNV.A00(AbstractC167017dG.A0U(view, R.id.feed_button_stub), 60, xek, A00);
        }
        AdsAPIInstagramPosition adsAPIInstagramPosition = AdsAPIInstagramPosition.A0F;
        if (list.contains(adsAPIInstagramPosition)) {
            WNV.A00(AbstractC167017dG.A0U(view, R.id.stories_button_stub), 62, xek, A00);
        }
        if (list.contains(AdsAPIInstagramPosition.A05)) {
            WNV.A00(AbstractC167017dG.A0U(view, R.id.explore_button_stub), 59, xek, A00);
        }
        if (list.contains(AdsAPIInstagramPosition.A0C)) {
            WNV.A00(AbstractC167017dG.A0U(view, R.id.reel_button_stub), 61, xek, A00);
        }
        AbstractC166997dE.A0S(view, R.id.post_uneditable_hint_divider).setVisibility(8);
        if (list.contains(adsAPIInstagramPosition)) {
            View A0U = AbstractC167017dG.A0U(view, R.id.performance_disclaimer_stub);
            C14360o3.A0C(A0U, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
            Context A0L = AbstractC166997dE.A0L(view);
            String A0p = AbstractC166997dE.A0p(A0L, 2131970865);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC31177DnL.A0b(A0L, A0p, 2131970863));
            AnonymousClass773.A03(spannableStringBuilder, new VB7(xek, A0L.getColor(AbstractC53242c7.A06(A0L))), A0p);
            AbstractC31176DnK.A1G((TextView) A0U, spannableStringBuilder);
            if (WGQ.A02(xIGIGBoostDestination, userSession, z2) && z3 && !z) {
                View A0U2 = AbstractC167017dG.A0U(view, R.id.fb_placement_disclaimer);
                C14360o3.A0C(A0U2, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
                TextView textView = (TextView) A0U2;
                if (xIGIGBoostDestination == XIGIGBoostDestination.A07) {
                    i = 2131970860;
                } else if (xIGIGBoostDestination == XIGIGBoostDestination.A0G) {
                    i = 2131970844;
                }
                textView.setText(i);
                textView.setVisibility(0);
            }
        }
        AbstractC31177DnL.A0H(AbstractC166997dE.A0S(view, R.id.performance_disclaimer_divider)).setMargins(0, (int) AbstractC13880nE.A04(fragmentActivity, 24), 0, 0);
        if (z4) {
            IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.ads_creative_optimizations_row);
            igdsListCell.setVisibility(0);
            igdsListCell.A0G(EnumC53237Nga.A08, true);
            Context context = igdsListCell.getContext();
            igdsListCell.A0I(AbstractC166997dE.A0p(context, 2131970834));
            VB6 vb6 = new VB6(xek, context.getColor(AbstractC53242c7.A06(context)));
            String A0p2 = AbstractC166997dE.A0p(context, 2131970831);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(AbstractC31177DnL.A0b(context, A0p2, 2131970832));
            AnonymousClass773.A03(spannableStringBuilder2, vb6, A0p2);
            igdsListCell.A0H(spannableStringBuilder2);
            MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
            C14360o3.A07(linkMovementMethod);
            igdsListCell.A0B(linkMovementMethod);
            PromoteData BiY = interfaceC72021XFj.BiY();
            ((XFZ) fragmentActivity).Bia();
            EnumC68198VFq enumC68198VFq = BiY.A14;
            igdsListCell.setChecked(enumC68198VFq != null && (enumC68198VFq == EnumC68198VFq.OPT_IN || enumC68198VFq == EnumC68198VFq.DEFAULT_OPT_IN));
            igdsListCell.A0E(new C70951Wkx(0, A00, BiY));
        }
    }
}
