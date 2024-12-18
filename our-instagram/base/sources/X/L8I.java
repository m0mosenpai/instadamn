package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creator.ghostwriter.ui.GhostWriterView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.dismissablecallout.DismissableCallout;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.wellbeing.respectfulcommentnudge.views.LightweightNudgeBanner;
import java.util.List;

/* loaded from: classes8.dex */
public final class L8I {
    public View A00;
    public IgImageView A01;
    public IgImageView A02;
    public GradientSpinnerAvatarView A03;
    public IgImageView A04;
    public IgImageView A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final ViewStub A09;
    public final ViewStub A0A;
    public final UserSession A0B;
    public final DismissableCallout A0C;
    public final ComposerAutoCompleteTextView A0D;
    public final InterfaceC09390do A0E;
    public final View A0F;
    public final View A0G;
    public final ViewGroup A0H;
    public final ViewStub A0I;
    public final TextView A0J;
    public final IgdsBanner A0K;
    public final C7OC A0L;
    public final LightweightNudgeBanner A0M;

    public L8I(View view, Fragment fragment, UserSession userSession, C7OC c7oc) {
        this.A0B = userSession;
        this.A07 = view;
        this.A0L = c7oc;
        this.A0G = AbstractC166997dE.A0S(view, R.id.layout_comment_composer_parent_container);
        View A0S = AbstractC166997dE.A0S(view, R.id.layout_comment_composer_container);
        this.A06 = A0S;
        this.A0F = AbstractC166997dE.A0S(view, R.id.layout_comment_disabled_composer_container);
        this.A0J = AbstractC167007dF.A0N(view, R.id.layout_comment_disabled_composer_textview);
        this.A0C = (DismissableCallout) AbstractC166997dE.A0R(view, R.id.layout_comment_composer_callout);
        this.A0A = AbstractC167007dF.A0M(view, R.id.layout_comment_composer_emoji_picker_v1_stub);
        this.A0I = AbstractC167007dF.A0M(view, R.id.layout_comment_composer_quick_replies_stub);
        this.A0M = (LightweightNudgeBanner) AbstractC166997dE.A0R(view, R.id.lightweight_nudge);
        this.A0K = (IgdsBanner) AbstractC166997dE.A0R(view, R.id.hide_similar_comments_banner);
        this.A09 = AbstractC167007dF.A0M(view, R.id.carousel_comment_tooltip_banner_stub);
        this.A0E = AbstractC09440dt.A00(EnumC09460dv.A02, new C29906DGu(this, 3));
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.layout_comment_composer_edittext_container);
        if (C18U.A06(C06090Tz.A05, this.A0B, 36319527650205166L)) {
            A0C.setVisibility(8);
            View A0U = AbstractC167017dG.A0U(view, R.id.ghost_writer_root_container_view_stub);
            AbstractC43592JPx.A1T(A0U);
            A0C = (ViewGroup) A0U;
        } else {
            this.A01 = AbstractC31172DnG.A0a(A0C, R.id.layout_comment_thread_gift_button);
        }
        this.A0H = A0C;
        if (A0C instanceof GhostWriterView) {
            GhostWriterView ghostWriterView = (GhostWriterView) A0C;
            ghostWriterView.setVisibility(0);
            InterfaceC018407e A00 = ViewTreeViewModelStoreOwner.A00(ghostWriterView);
            if (A00 != null) {
                ghostWriterView.A00 = (C44492Jly) new C52942bb(new C45563KFc(userSession), A00).A00(C44492Jly.class);
                ghostWriterView.A02.setOnClickListener(new ViewOnClickListenerC48071LPw(ghostWriterView, 0));
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = fragment.getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, ghostWriterView, null, 33), C07Y.A00(viewLifecycleOwner));
                this.A0D = ghostWriterView.A03;
                IgTextView igTextView = ghostWriterView.A01;
                this.A00 = igTextView;
                this.A08 = igTextView;
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        this.A0D = (ComposerAutoCompleteTextView) A0C.requireViewById(R.id.layout_comment_thread_edittext);
        this.A08 = A0C.requireViewById(R.id.layout_comment_thread_post_button_click_area);
        this.A04 = AbstractC31172DnG.A0a(A0C, R.id.layout_comment_thread_animated_image_picker_button);
        this.A02 = AbstractC31172DnG.A0a(A0C, R.id.layout_comment_thread_mention_button);
        this.A05 = AbstractC31172DnG.A0a(A0C, R.id.visual_reply_icon);
        this.A03 = (GradientSpinnerAvatarView) A0C.findViewById(R.id.layout_comment_composer_avatar);
        this.A00 = A0S.requireViewById(R.id.layout_comment_thread_post_button_icon);
    }

    public final void A00(Integer num, String str) {
        Object value;
        Integer num2;
        List list;
        C14360o3.A0B(str, 1);
        ViewGroup viewGroup = this.A0H;
        if (viewGroup instanceof GhostWriterView) {
            C45127Jxw c45127Jxw = new C45127Jxw(str, 32, num);
            C44492Jly c44492Jly = ((GhostWriterView) viewGroup).A00;
            if (c44492Jly == null) {
                C14360o3.A0F("viewModel");
                throw C00O.createAndThrow();
            }
            AnonymousClass195 anonymousClass195 = c44492Jly.A01;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            C05A c05a = c44492Jly.A03;
            do {
                value = c05a.getValue();
                num2 = C05F.A0C;
                list = (List) ((C51761Mtk) value).A00;
                C14360o3.A0B(list, 1);
            } while (!c05a.AIi(value, new C51761Mtk(num2, list)));
            c44492Jly.A01 = null;
            c44492Jly.A00 = c45127Jxw;
        }
    }
}
