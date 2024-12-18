package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.textureview.CircularTextureView;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class PJ4 implements YP5 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final PopupWindow A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final View A08;
    public final CircularImageView A09;
    public final CircularImageView A0A;
    public final CircularTextureView A0B;

    public PJ4(Context context) {
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.layout_iglive_livewith_invitation_popup);
        this.A08 = A0C;
        this.A03 = new PopupWindow(A0C, -1, -2, true);
        CircularImageView circularImageView = (CircularImageView) AbstractC166987dD.A0c(A0C, R.id.iglive_sender_avatar_imageview);
        this.A0A = circularImageView;
        CircularImageView circularImageView2 = (CircularImageView) AbstractC166987dD.A0c(A0C, R.id.iglive_camera_preview_overlay_stroke);
        this.A09 = circularImageView2;
        this.A04 = AbstractC25230BEn.A0Q(A0C, R.id.iglive_invitation_attribution_message);
        this.A07 = AbstractC25230BEn.A0Q(A0C, R.id.iglive_invitation_privacy_description);
        this.A0B = (CircularTextureView) AbstractC166987dD.A0c(A0C, R.id.iglive_camera_preview_texture);
        this.A06 = AbstractC25230BEn.A0Q(A0C, R.id.iglive_livewith_invitation_confirm);
        this.A05 = AbstractC25230BEn.A0Q(A0C, R.id.iglive_livewith_invitation_cancel);
        circularImageView2.A02 = true;
        circularImageView.A02 = true;
    }

    public final void A00(View view, PopupWindow.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, User user, User user2) {
        C14360o3.A0B(view, 0);
        AbstractC167007dF.A1E(user, 1, interfaceC11380iw);
        this.A02 = false;
        this.A00 = false;
        AbstractC31173DnH.A1T(interfaceC11380iw, this.A0A, user);
        AbstractC31173DnH.A1T(interfaceC11380iw, this.A09, user2);
        Ok4.A00(this.A06, 44, this);
        Ok4.A00(this.A05, 45, this);
        this.A0B.setVisibility(8);
        PopupWindow popupWindow = this.A03;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setSoftInputMode(16);
        popupWindow.setAnimationStyle(R.style.PopupAnimationStyle);
        popupWindow.showAtLocation(view, 80, 0, 0);
        popupWindow.setOnDismissListener(onDismissListener);
        popupWindow.setTouchInterceptor(new ViewOnTouchListenerC50553MTk(this, 20));
    }

    @Override // X.YP5
    public final void EQw(InterfaceC174767qC interfaceC174767qC) {
    }

    @Override // X.YP5
    public final CircularTextureView Ak1() {
        return this.A0B;
    }
}
