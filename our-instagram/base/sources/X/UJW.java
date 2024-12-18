package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes11.dex */
public final class UJW extends C3OO {
    public final C68708Vak A00;
    public final IgFrameLayout A01;
    public final IgFrameLayout A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final InterfaceC56392iX A06;
    public final IgBouncyUfiButtonImageView A07;
    public final GradientSpinnerAvatarView A08;

    public UJW(View view) {
        super(view);
        this.A08 = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(view, R.id.avatar);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.username);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.timestamp);
        this.A05 = AbstractC167007dF.A0T(view, R.id.gift_badge);
        this.A07 = (IgBouncyUfiButtonImageView) AbstractC166997dE.A0R(view, R.id.like_button);
        this.A01 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.like_button_click_area);
        this.A02 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.more_button_click_area);
        this.A06 = AbstractC166997dE.A0X(view, R.id.internal_badge);
        this.A00 = new C68708Vak();
    }
}
