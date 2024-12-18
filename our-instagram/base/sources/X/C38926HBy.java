package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata;
import com.instagram.save.api.SaveApiUtil;
import java.util.List;

/* renamed from: X.HBy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38926HBy extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PopularReelsCreatorViewerInsightsFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final InterfaceC60442pS A01 = AbstractC60952qJ.A01("clips_viewer_insight_sheet", true, false);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_viewer_insight_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String string;
        C38321qM A0F;
        List At7;
        JLM jlm;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("media_position");
        } else {
            i = -1;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string = bundle3.getString("media_id")) != null && (A0F = AbstractC37304Gc5.A0F(string, this.A00)) != null && (At7 = A0F.A0C.At7()) != null && (jlm = (JLM) AbstractC001800i.A0J(At7)) != null) {
            PopularReelWithFollowersInsightMetadata BeV = jlm.BeV();
            Context context = view.getContext();
            AbstractC166987dD.A1P(context, AbstractC166997dE.A0T(view, R.id.title), 2131969755);
            ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.text_row_container);
            if (BeV != null) {
                Context context2 = A0C.getContext();
                Resources resources = context2.getResources();
                if (BeV.getPlayCount() > 0) {
                    View inflate = LayoutInflater.from(context2).inflate(R.layout.layout_popular_reels_creator_viewer_insight_text_row, (ViewGroup) null);
                    A0C.addView(inflate);
                    AbstractC31173DnH.A0I(inflate, R.id.icon).setImageResource(R.drawable.instagram_eye_pano_outline_24);
                    TextView A0T = AbstractC166997dE.A0T(inflate, R.id.text);
                    Integer valueOf = Integer.valueOf(BeV.getPlayCount());
                    C14360o3.A0A(resources);
                    AbstractC31177DnL.A0r(context2, A0T, C84963qk.A03(resources, valueOf), 2131957255);
                }
                if (BeV.getLikeCount() > 0) {
                    View inflate2 = LayoutInflater.from(context2).inflate(R.layout.layout_popular_reels_creator_viewer_insight_text_row, (ViewGroup) null);
                    A0C.addView(inflate2);
                    AbstractC31173DnH.A0I(inflate2, R.id.icon).setImageResource(R.drawable.instagram_heart_pano_outline_24);
                    TextView A0T2 = AbstractC166997dE.A0T(inflate2, R.id.text);
                    Integer valueOf2 = Integer.valueOf(BeV.getLikeCount());
                    C14360o3.A0A(resources);
                    AbstractC31177DnL.A0r(context2, A0T2, C84963qk.A03(resources, valueOf2), 2131957252);
                }
                if (BeV.getReshareCount() > 0) {
                    View inflate3 = LayoutInflater.from(context2).inflate(R.layout.layout_popular_reels_creator_viewer_insight_text_row, (ViewGroup) null);
                    A0C.addView(inflate3);
                    AbstractC31173DnH.A0I(inflate3, R.id.icon).setImageResource(R.drawable.instagram_direct_pano_outline_24);
                    TextView A0T3 = AbstractC166997dE.A0T(inflate3, R.id.text);
                    Integer valueOf3 = Integer.valueOf(BeV.getReshareCount());
                    C14360o3.A0A(resources);
                    AbstractC31177DnL.A0r(context2, A0T3, C84963qk.A03(resources, valueOf3), 2131957257);
                }
            }
            TextView A0N = AbstractC167007dF.A0N(view, R.id.subtitle);
            if (A0C.getChildCount() > 0) {
                AbstractC166987dD.A1P(context, A0N, 2131969753);
            } else {
                AbstractC166987dD.A1P(context, A0N, 2131969754);
                A0N.setGravity(17);
            }
            AbstractC167007dF.A0M(view, R.id.divider).inflate();
            C64P c64p = (C64P) AbstractC166997dE.A0R(view, R.id.action_buttons);
            if (BeV != null && BeV.BR1() != null) {
                c64p.setPrimaryAction(context.getString(2131969751), new ViewOnClickListenerC42029Ijy(42, context, BeV, this));
                if (!A0F.CcN()) {
                    c64p.setSecondaryAction(context.getString(2131969752), new ViewOnClickListenerC42028Ijx(i, 10, A0F, this));
                    return;
                }
                return;
            }
            if (A0F.CcN()) {
                return;
            }
            c64p.setPrimaryAction(context.getString(2131969752), new ViewOnClickListenerC42028Ijx(i, 11, A0F, this));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public static final void A00(C38321qM c38321qM, C38926HBy c38926HBy, int i) {
        Context context = c38926HBy.getContext();
        if (context != null) {
            EnumC77213d7 enumC77213d7 = EnumC77213d7.A04;
            SaveApiUtil.A05(c38926HBy.requireActivity(), context, AbstractC166987dD.A0r(c38926HBy.A00), c38321qM, c38926HBy.A01, enumC77213d7, i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1747897457);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_popular_reels_creator_viewer_insight_fragment, viewGroup, false);
        C0f9.A09(-1241899428, A02);
        return inflate;
    }
}
