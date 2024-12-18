package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.business.promote.model.PromoteAudiencePotentialReachStore;
import com.instagram.business.promote.model.PromoteData;

/* loaded from: classes11.dex */
public final class WDA {
    public C70121W4x A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final FragmentActivity A04;
    public final VG4 A05;
    public final W6E A06;
    public final PromoteAudiencePotentialReachStore A07;
    public final PromoteData A08;
    public final C1OK A09;
    public final C13400mQ A0A;
    public final Drawable A0B;
    public final View A0C;
    public final View A0D;
    public final View A0E;
    public final TextView A0F;

    public WDA(View view, FragmentActivity fragmentActivity, VG4 vg4, W6E w6e, PromoteData promoteData) {
        AbstractC25233BEq.A0x(1, vg4, promoteData, w6e);
        this.A05 = vg4;
        this.A04 = fragmentActivity;
        this.A08 = promoteData;
        this.A06 = w6e;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.potential_reach_number_view);
        this.A03 = A0N;
        this.A09 = new C1OK();
        C13400mQ c13400mQ = new C13400mQ(AbstractC167007dF.A0J(), new Wi0(this, 3), 300L);
        this.A0A = c13400mQ;
        this.A00 = C70121W4x.A01;
        A0N.setText(2131970377);
        Context context = view.getContext();
        Drawable drawable = context.getDrawable(R.drawable.instagram_info_pano_outline_24);
        this.A0B = drawable;
        if (drawable != null) {
            AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A08(context));
        }
        ImageView imageView = (ImageView) view.requireViewById(R.id.audience_size_education_icon);
        this.A02 = imageView;
        imageView.setImageDrawable(drawable);
        WNT.A00(imageView, 13, this);
        this.A01 = view.requireViewById(R.id.potential_reach_progress_bar);
        this.A0E = view.requireViewById(R.id.rating_too_specific_bar_container);
        this.A0C = view.requireViewById(R.id.rating_great_bar_container);
        this.A0D = view.requireViewById(R.id.rating_too_broad_bar_container);
        this.A07 = promoteData.A0r;
        TextView textView = (TextView) view.requireViewById(R.id.potential_reach_number_sub_title);
        this.A0F = textView;
        textView.setText(2131970379);
        c13400mQ.A00 = new C70839Whz(this);
        A00(this, 0, 0, false);
    }

    public static final void A00(WDA wda, int i, int i2, boolean z) {
        TextView textView = wda.A03;
        textView.setVisibility(0);
        wda.A01.setVisibility(8);
        if (z) {
            textView.setText(AnonymousClass001.A0g(WGs.A04(i), " - ", WGs.A04(i2)));
            wda.A02.setVisibility(0);
        } else {
            textView.setText(2131970377);
            wda.A02.setVisibility(8);
        }
    }

    public static final void A01(WDA wda, AudiencePotentialReachRating audiencePotentialReachRating) {
        Context context;
        int i;
        View view = wda.A0E;
        VRV.A00(view);
        View view2 = wda.A0C;
        VRV.A00(view2);
        View view3 = wda.A0D;
        VRV.A00(view3);
        if (audiencePotentialReachRating != null) {
            int i2 = audiencePotentialReachRating.A00;
            int ordinal = audiencePotentialReachRating.ordinal();
            if (ordinal != 4) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 1) {
                        if (ordinal == 0) {
                            context = view2.getContext();
                            i = R.attr.igds_color_stroke;
                        } else {
                            return;
                        }
                    } else {
                        view2 = view3;
                        context = view3.getContext();
                        i = R.attr.igds_color_gradient_yellow;
                    }
                } else {
                    view2 = view;
                    context = view.getContext();
                    i = R.attr.igds_color_error_or_destructive;
                }
            } else {
                context = view2.getContext();
                i = R.attr.igds_color_success;
            }
            int A0H = AbstractC53242c7.A0H(context, i);
            View A0R = AbstractC166997dE.A0R(view2, R.id.reach_rating_bar);
            TextView A0N = AbstractC167007dF.A0N(view2, R.id.reach_rating_text);
            AbstractC31172DnG.A1B(view2.getContext(), A0R, A0H);
            if (i2 != 0) {
                A0N.setVisibility(0);
                A0N.setText(i2);
            }
        }
    }

    public final void A02(PromoteAudienceInfo promoteAudienceInfo) {
        PromoteAudiencePotentialReachStore promoteAudiencePotentialReachStore = this.A07;
        if (!promoteAudiencePotentialReachStore.A00.containsKey(promoteAudienceInfo)) {
            this.A0A.A01(new C70121W4x(promoteAudienceInfo));
            return;
        }
        Object obj = promoteAudiencePotentialReachStore.A00.get(promoteAudienceInfo);
        if (obj != null) {
            PromoteAudiencePotentialReach promoteAudiencePotentialReach = (PromoteAudiencePotentialReach) obj;
            A00(this, promoteAudiencePotentialReach.A01, promoteAudiencePotentialReach.A02, WGs.A0R(promoteAudiencePotentialReach));
            A01(this, promoteAudiencePotentialReach.A03);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
