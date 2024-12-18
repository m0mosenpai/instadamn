package X;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.avatars.coinflip.CoinFlipAvatarImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.72v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1569172v extends ConstraintLayout {
    public ConstraintLayout A00;
    public CoinFlipAvatarImageView A01;
    public IgImageView A02;
    public IgImageView A03;
    public String A04;
    public boolean A05;

    public final void setBackgroundUrl(String str) {
        C14360o3.A0B(str, 0);
        this.A04 = str;
    }

    public final void setCircleBackgroundImage(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A04 = imageUrl.getUrl();
        this.A02.setUrl(imageUrl, interfaceC11380iw);
    }

    public void setProfilePicUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A03.setUrl(imageUrl, interfaceC11380iw);
    }

    public final void setProfilePicView(IgImageView igImageView) {
        C14360o3.A0B(igImageView, 0);
        this.A03 = igImageView;
    }

    public final CoinFlipAvatarImageView getAvatarView() {
        return this.A01;
    }

    public final String getBackgroundUrl() {
        return this.A04;
    }

    public final IgImageView getCircleView() {
        return this.A02;
    }

    public final Drawable getDrawable() {
        return this.A03.getDrawable();
    }

    public final IgImageView getProfilePicView() {
        return this.A03;
    }

    public final void setAvatarImageDrawable(Drawable drawable) {
        CoinFlipAvatarImageView coinFlipAvatarImageView = this.A01;
        coinFlipAvatarImageView.setVisibility(0);
        coinFlipAvatarImageView.setImageDrawable(drawable);
        if (this.A05 && (drawable instanceof C74P)) {
            ConstraintLayout constraintLayout = this.A00;
            if (constraintLayout.isLaidOut() && !constraintLayout.isLayoutRequested()) {
                this.A01.setTopMarginRatio(((C74P) drawable).A01);
            } else {
                constraintLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC31541DtR(drawable, this));
            }
        }
        this.A02.setVisibility(0);
        this.A03.setVisibility(4);
    }

    public final void setCircleBackgroundColor(int i) {
        IgImageView igImageView = this.A02;
        igImageView.A09();
        igImageView.setBackgroundColor(i);
    }

    public final void setFramePopEnabled(boolean z) {
        this.A05 = z;
    }
}
