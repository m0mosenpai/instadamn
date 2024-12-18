package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButtonBase;

/* renamed from: X.3jy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81283jy extends AbstractC81293jz implements C3Ow, C33R {
    public View A00;
    public View A01;
    public ImageView A02;
    public TextView A03;
    public ColorFilterAlphaImageView A04;
    public C76293bZ A05;
    public C76853cX A06;
    public C33R A07;
    public C75113Zb A08;
    public L0N A09;
    public FollowButtonBase A0A;
    public IgdsButton A0B;
    public final int A0C;
    public final View A0D;
    public final ViewGroup A0E;
    public final TextView A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final CircularImageView A0I;
    public final InterfaceC56392iX A0J;
    public final InterfaceC56392iX A0K;
    public final InterfaceC56392iX A0L;
    public final InterfaceC56392iX A0M;
    public final InterfaceC56392iX A0N;
    public final InterfaceC56392iX A0O;
    public final InterfaceC56392iX A0P;
    public final InterfaceC56392iX A0Q;
    public final InterfaceC56392iX A0R;
    public final InterfaceC56392iX A0S;
    public final InterfaceC56392iX A0T;
    public final InterfaceC56392iX A0U;
    public final InterfaceC56392iX A0V;
    public final InterfaceC56392iX A0W;
    public final InterfaceC56392iX A0X;
    public final InterfaceC56392iX A0Y;
    public final InterfaceC56392iX A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d;
    public final InterfaceC09390do A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final InterfaceC56392iX A0i;
    public final InterfaceC09390do A0j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81283jy(ViewGroup viewGroup) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A0E = viewGroup;
        this.A0j = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EE(this, 39));
        this.A0W = AbstractC56372iV.A01(super.A00.findViewById(R.id.profile_feed_ad_preview_disclaimer_stub), false, false);
        View requireViewById = viewGroup.requireViewById(R.id.row_feed_photo_profile_imageview);
        C14360o3.A07(requireViewById);
        this.A0I = (CircularImageView) requireViewById;
        this.A0V = AbstractC56372iV.A01(viewGroup.findViewById(R.id.row_feed_photo_profile_badge_stub), false, false);
        View requireViewById2 = viewGroup.requireViewById(R.id.row_feed_photo_profile_name);
        C14360o3.A07(requireViewById2);
        this.A0F = (TextView) requireViewById2;
        View requireViewById3 = viewGroup.requireViewById(R.id.secondary_label);
        C14360o3.A07(requireViewById3);
        this.A0G = (TextView) requireViewById3;
        View requireViewById4 = viewGroup.requireViewById(R.id.tertiary_label);
        C14360o3.A07(requireViewById4);
        this.A0H = (TextView) requireViewById4;
        this.A0L = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.cyclic_subtitle_layout_stub), false, false);
        this.A0b = AbstractC09440dt.A01(new C9EE(this, 33));
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewGroup.findViewById(R.id.row_right_aligned_follow_button_stub), false, false);
        A01.EZv(C85903sJ.A00);
        this.A0X = A01;
        InterfaceC56392iX A012 = AbstractC56372iV.A01(viewGroup.findViewById(R.id.row_right_aligned_follow_button_base_stub), false, false);
        A012.EZv(C85913sK.A00);
        this.A0Y = A012;
        this.A0N = AbstractC56372iV.A01(viewGroup.findViewById(R.id.row_feed_collaborative_profile_facepile_stub), false, false);
        View requireViewById5 = viewGroup.requireViewById(R.id.divider);
        C14360o3.A07(requireViewById5);
        this.A0D = requireViewById5;
        this.A0Z = AbstractC56372iV.A01(viewGroup.findViewById(R.id.row_feed_view_shop_button_stub), false, false);
        this.A0P = AbstractC56372iV.A01(viewGroup.findViewById(R.id.row_feed_favorites_badge_stub), false, false);
        this.A0O = AbstractC56372iV.A01(viewGroup.findViewById(R.id.row_feed_fan_club_badge_stub), false, false);
        this.A0K = AbstractC56372iV.A01(viewGroup.findViewById(R.id.row_feed_close_friends_badge_stub), false, false);
        this.A0S = AbstractC56372iV.A01(viewGroup.findViewById(R.id.row_feed_opal_badge_stub), false, false);
        this.A0C = viewGroup.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        this.A0i = AbstractC56372iV.A01(viewGroup.findViewById(R.id.subscribe_button_stub), false, false);
        this.A0M = AbstractC56372iV.A01(viewGroup.findViewById(R.id.feed_more_button_stub), false, false);
        this.A0T = AbstractC56372iV.A01(viewGroup.findViewById(R.id.post_dismiss_button_stub), false, false);
        this.A0U = AbstractC56372iV.A01(viewGroup.findViewById(R.id.post_dismiss_small_button_stub), false, false);
        this.A0Q = AbstractC56372iV.A01(viewGroup.findViewById(R.id.live_badge_stub), false, false);
        this.A0R = AbstractC56372iV.A01(viewGroup.findViewById(R.id.media_timestamp_stub), false, false);
        this.A0J = AbstractC56372iV.A01(viewGroup.findViewById(R.id.add_post_button_stub), false, false);
        this.A0f = AbstractC09440dt.A01(new C9EE(this, 37));
        this.A0g = AbstractC09440dt.A01(new C9EE(this, 38));
        this.A0c = AbstractC09440dt.A01(new C9EE(this, 34));
        this.A0a = AbstractC09440dt.A01(new C9EE(this, 32));
        this.A0e = AbstractC09440dt.A01(new C9EE(this, 36));
        this.A0h = AbstractC09440dt.A01(new C9EE(this, 40));
        this.A0d = AbstractC09440dt.A01(new C9EE(this, 35));
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        C33R c33r = this.A07;
        if (c33r != null) {
            c33r.DSJ(c75113Zb, i);
        }
        C76293bZ c76293bZ = this.A05;
        if ((c76293bZ != null && !c76293bZ.A08) || i != 51) {
            return;
        }
        AbstractC13160m2.A02(super.A00, C04870Ng.A00, c75113Zb.A1u ? 0 : 8, 75L);
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    public final IgdsButton A00() {
        IgdsButton igdsButton = this.A0B;
        if (igdsButton == null) {
            igdsButton = (IgdsButton) this.A0i.getView();
            this.A0B = igdsButton;
            if (igdsButton == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return igdsButton;
    }

    @Override // X.C3Ow
    public final RectF AeS() {
        return AbstractC13880nE.A0G(this.A0I);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A0I;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A0I);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return (GradientSpinner) this.A0j.getValue();
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A0I.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A0I.setVisibility(0);
    }
}
