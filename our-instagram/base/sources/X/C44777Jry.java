package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Jry, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44777Jry extends C3OO implements InterfaceC161797Mo {
    public final View A00;
    public final ViewStub A01;
    public final FrameLayout A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final C57012jc A0A;
    public final C57012jc A0B;
    public final C57012jc A0C;
    public final C57012jc A0D;
    public final C57012jc A0E;
    public final C57012jc A0F;
    public final C57012jc A0G;
    public final InterfaceC56392iX A0H;
    public final L3W A0I;
    public final L3W A0J;
    public final L3W A0K;
    public final GradientSpinnerAvatarView A0L;

    public C44777Jry(View view) {
        super(view);
        this.A00 = view;
        this.A09 = AbstractC166997dE.A0T(view, R.id.other_user_full_name_or_username);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) view.requireViewById(R.id.user_avatar);
        this.A0L = gradientSpinnerAvatarView;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.setFocusable(false);
        this.A02 = (FrameLayout) view.requireViewById(R.id.context_avatar_override);
        this.A01 = AbstractC31173DnH.A0G(view, R.id.direct_group_photo_faceswarm_stub);
        this.A06 = AbstractC166997dE.A0T(view, R.id.meta_verified_label);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.network_attribution);
        this.A07 = A0T;
        AbstractC25227BEk.A11(A0T);
        this.A0H = AbstractC37301Gc2.A0D(view, R.id.thread_labels);
        this.A0A = AbstractC31177DnL.A0U(view, R.id.change_name_and_photo);
        this.A0C = AbstractC31177DnL.A0U(view, R.id.thread_context_item_stub_0);
        this.A0D = AbstractC31177DnL.A0U(view, R.id.thread_context_item_stub_1);
        this.A0E = AbstractC31177DnL.A0U(view, R.id.thread_context_item_stub_2);
        this.A0F = AbstractC31177DnL.A0U(view, R.id.thread_context_item_stub_3);
        this.A0G = AbstractC31177DnL.A0U(view, R.id.thread_context_item_stub_4);
        this.A0B = AbstractC31177DnL.A0U(view, R.id.responsiveness_item);
        this.A03 = AbstractC31172DnG.A0B(view, R.id.null_state_shortcut_container);
        this.A0I = new L3W(view.requireViewById(R.id.null_state_item_1));
        this.A0J = new L3W(view.requireViewById(R.id.null_state_item_2));
        this.A0K = new L3W(view.requireViewById(R.id.null_state_item_3));
        this.A08 = AbstractC166997dE.A0T(view, R.id.privacy_disclosure_text);
        this.A05 = AbstractC166997dE.A0T(view, R.id.view_profile_button);
        this.A04 = AbstractC166997dE.A0T(view, R.id.view_channel_button);
    }
}
