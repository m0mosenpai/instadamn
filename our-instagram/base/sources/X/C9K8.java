package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.direct.view.ReshareTogglePickerView;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.9K8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9K8 implements C8DK {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public TextView A07;
    public TextView A08;
    public ReshareTogglePickerView A09;
    public EphemeralMediaToggleView A0A;
    public InterfaceC09390do A0B;
    public GradientSpinnerAvatarView A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final InterfaceC56392iX A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final Context A0N;
    public final AnonymousClass840 A0O;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r13 == 5) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9K8(android.content.Context r7, android.view.View r8, android.view.View r9, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r10, X.AnonymousClass840 r11, int r12, int r13, boolean r14, boolean r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9K8.<init>(android.content.Context, android.view.View, android.view.View, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.840, int, int, boolean, boolean, boolean, boolean):void");
    }

    public final void A00(InterfaceC11380iw interfaceC11380iw, DirectCameraViewModel directCameraViewModel) {
        ImageUrl imageUrl;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0C;
        if (gradientSpinnerAvatarView != null && (imageUrl = directCameraViewModel.A02) != null) {
            if (directCameraViewModel.A07) {
                gradientSpinnerAvatarView.A0G(null, interfaceC11380iw, imageUrl, directCameraViewModel.A01);
            } else {
                gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, imageUrl);
            }
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            gradientSpinnerAvatarView.setGradientSpinnerActivated(false);
        }
    }

    public final void A01(InterfaceC11380iw interfaceC11380iw, DirectCameraViewModel directCameraViewModel, boolean z) {
        ImageUrl imageUrl;
        C14360o3.A0B(interfaceC11380iw, 1);
        View view = this.A0H.getView();
        if (z) {
            TextView A0N = AbstractC167007dF.A0N(this.A0D, R.id.direct_reply_avatar_button_text_toggle);
            A0N.setPadding(0, 0, 0, 0);
            A0N.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.instagram_arrow_right_pano_filled_24, 0);
            return;
        }
        if (!this.A0M && !this.A0L) {
            if (directCameraViewModel.A07) {
                IgImageView A0T = AbstractC167007dF.A0T(view, R.id.reply_button_double_avatar_back);
                IgImageView A0T2 = AbstractC167007dF.A0T(view, R.id.reply_button_double_avatar_front);
                ImageUrl imageUrl2 = directCameraViewModel.A02;
                if (imageUrl2 != null) {
                    A0T2.setUrl(imageUrl2, interfaceC11380iw);
                }
                ImageUrl imageUrl3 = directCameraViewModel.A01;
                if (imageUrl3 != null) {
                    A0T.setUrl(imageUrl3, interfaceC11380iw);
                }
                this.A02 = view.findViewById(R.id.reply_button_double_avatar_back_container);
                this.A03 = view.findViewById(R.id.reply_button_double_avatar_front_container);
                return;
            }
            boolean z2 = directCameraViewModel.A08;
            Context context = view.getContext();
            int i = R.drawable.direct_large_avatar_button_background;
            if (z2) {
                i = R.drawable.direct_large_avatar_button_background_shhmode;
            }
            view.setBackground(context.getDrawable(i));
            ImageUrl imageUrl4 = directCameraViewModel.A02;
            if (imageUrl4 == null) {
                return;
            }
            AbstractC167007dF.A0T(view, R.id.reply_button_single_avatar).setUrl(imageUrl4, interfaceC11380iw);
            return;
        }
        View view2 = this.A0D;
        Context context2 = view2.getContext();
        TextView A0N2 = AbstractC167007dF.A0N(view2, R.id.direct_reply_avatar_button_text_toggle);
        int i2 = this.A00;
        int i3 = 2131960425;
        if (i2 == 9) {
            i3 = 2131954985;
        }
        AbstractC166987dD.A1P(context2, A0N2, i3);
        if (i2 == 9) {
            return;
        }
        ViewStub A0M = AbstractC167007dF.A0M(view2, R.id.direct_reply_avatar_button_toggle_stub);
        View view3 = this.A0G;
        AbstractC13880nE.A0c(view3, view3.getPaddingStart());
        A0M.setLayoutResource(R.layout.direct_multi_media_tray_button_stacked_avatar);
        View inflate = A0M.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.stackedavatar.StackedAvatarView");
        StackedAvatarView stackedAvatarView = (StackedAvatarView) inflate;
        boolean z3 = directCameraViewModel.A07;
        if (z3) {
            stackedAvatarView.A03(context2, R.dimen.abc_dialog_padding_top_material);
            stackedAvatarView.setPadding(2, 6, 0, 0);
        } else {
            stackedAvatarView.A03(context2, R.dimen.abc_dialog_padding_material);
        }
        ImageUrl imageUrl5 = directCameraViewModel.A02;
        if (z3) {
            imageUrl = directCameraViewModel.A01;
        } else {
            imageUrl = null;
        }
        stackedAvatarView.setUrls(imageUrl5, imageUrl, interfaceC11380iw);
        stackedAvatarView.setRingColor(AbstractC167007dF.A09(context2, R.attr.igds_color_primary_button_on_media));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    @Override // X.C8DK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ede(boolean r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9K8.Ede(boolean):void");
    }

    @Override // X.C8DK
    public final void EQs(boolean z) {
        View view = this.A04;
        if (view != null) {
            view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }
}
