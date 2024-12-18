package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JXg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43767JXg extends C3OO {
    public ImageView A00;
    public ImageView A01;
    public C57012jc A02;
    public C57012jc A03;
    public InterfaceC56392iX A04;
    public C43773JXm A05;
    public C3o9 A06;
    public final ViewGroup A07;
    public final TextView A08;
    public final IgTextView A09;
    public final IgTextView A0A;
    public final C57012jc A0B;
    public final C57012jc A0C;
    public final C57012jc A0D;
    public final C57012jc A0E;
    public final C57012jc A0F;
    public final C57012jc A0G;
    public final C57012jc A0H;
    public final C57012jc A0I;
    public final C57012jc A0J;
    public final C57012jc A0K;
    public final C57012jc A0L;
    public final InterfaceC56392iX A0M;
    public final InterfaceC56392iX A0N;
    public final C31447Drr A0O;
    public final C43770JXj A0P;
    public final C43769JXi A0Q;
    public final C43768JXh A0R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43767JXg(View view, C69433Ad c69433Ad, boolean z) {
        super(view);
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.row_inbox_container);
        C14360o3.A07(requireViewById);
        ViewGroup viewGroup = (ViewGroup) requireViewById;
        this.A07 = viewGroup;
        View requireViewById2 = viewGroup.requireViewById(R.id.row_inbox_username);
        C14360o3.A07(requireViewById2);
        IgTextView igTextView = (IgTextView) requireViewById2;
        this.A0A = igTextView;
        this.A0F = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.internal_badge));
        View requireViewById3 = viewGroup.requireViewById(R.id.row_inbox_digest);
        C14360o3.A07(requireViewById3);
        IgTextView igTextView2 = (IgTextView) requireViewById3;
        this.A09 = igTextView2;
        View requireViewById4 = viewGroup.requireViewById(R.id.row_inbox_timestamp);
        C14360o3.A07(requireViewById4);
        this.A08 = (TextView) requireViewById4;
        this.A0H = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.profile_context_stub));
        C43773JXm c43773JXm = null;
        this.A0M = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.thread_labels), false, false);
        this.A0D = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.inbox_flag_stub));
        this.A0C = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.toggle_stub));
        this.A0K = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.unread_badge_stub));
        this.A0L = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.unread_pill_nudge_stub));
        this.A0N = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.thread_nudge_stub), false, false);
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        this.A0R = new C43768JXh(context);
        this.A0E = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.inbox_option_stub));
        View requireViewById5 = viewGroup.requireViewById(R.id.inbox_reply_button_stub);
        C14360o3.A07(requireViewById5);
        this.A0J = new C57012jc((ViewStub) requireViewById5);
        View requireViewById6 = viewGroup.requireViewById(R.id.inbox_call_button_stub);
        C14360o3.A07(requireViewById6);
        this.A0B = new C57012jc((ViewStub) requireViewById6);
        View requireViewById7 = viewGroup.requireViewById(R.id.inbox_read_missed_call_stub);
        C14360o3.A07(requireViewById7);
        this.A0I = new C57012jc((ViewStub) requireViewById7);
        View requireViewById8 = viewGroup.requireViewById(R.id.avatar_container);
        C14360o3.A07(requireViewById8);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.group_photo_faceswarm_stub), false, false);
        C31447Drr c31447Drr = new C31447Drr(new C57012jc((ViewStub) viewGroup.requireViewById(R.id.pulse_emitter_stub)), new C57012jc((ViewStub) viewGroup.requireViewById(R.id.pulsing_image_view_stub)), new C57012jc((ViewStub) viewGroup.requireViewById(R.id.live_badge_stub)), A01, (GradientSpinnerAvatarView) requireViewById8);
        this.A0O = c31447Drr;
        ViewStub viewStub = (ViewStub) viewGroup.requireViewById(R.id.row_inbox_mute_stub);
        if (z) {
            this.A02 = new C57012jc(viewStub);
            this.A03 = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.row_inbox_pin_stub));
        } else {
            View inflate = viewStub.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
            this.A00 = (ImageView) inflate;
            View inflate2 = ((ViewStub) viewGroup.requireViewById(R.id.row_inbox_pin_stub)).inflate();
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
            this.A01 = (ImageView) inflate2;
        }
        this.A04 = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.row_inbox_flag_stub), false, false);
        View requireViewById9 = viewGroup.requireViewById(R.id.inbox_play_media_stub);
        C14360o3.A07(requireViewById9);
        this.A0Q = new C43769JXi((ViewStub) requireViewById9);
        View requireViewById10 = viewGroup.requireViewById(R.id.inbox_play_pile_stub);
        C14360o3.A07(requireViewById10);
        this.A0P = new C43770JXj((ViewStub) requireViewById10);
        this.A0G = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.inbox_option_space_stub));
        if (c69433Ad != null) {
            GradientSpinnerAvatarView gradientSpinnerAvatarView = c31447Drr.A04;
            C14360o3.A0C(gradientSpinnerAvatarView, "null cannot be cast to non-null type com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView");
            c43773JXm = new C43773JXm(new C43772JXl(gradientSpinnerAvatarView, new C43771JXk(gradientSpinnerAvatarView.getContext(), C05F.A00, TimeUnit.MILLISECONDS)), c69433Ad);
        }
        this.A05 = c43773JXm;
        igTextView.A00 = true;
        igTextView2.A00 = true;
    }
}
