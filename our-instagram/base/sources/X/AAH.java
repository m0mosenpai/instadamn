package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes4.dex */
public final class AAH {
    public final ConstraintLayout A00;
    public final IgSimpleImageView A01;
    public final IgSimpleImageView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final IgLinearLayout A07;

    public AAH(InterfaceC56392iX interfaceC56392iX) {
        C14360o3.A0B(interfaceC56392iX, 1);
        ConstraintLayout constraintLayout = (ConstraintLayout) interfaceC56392iX.getView();
        this.A00 = constraintLayout;
        this.A02 = (IgSimpleImageView) AbstractC166997dE.A0R(constraintLayout, R.id.sticker_image);
        IgLinearLayout igLinearLayout = (IgLinearLayout) AbstractC166997dE.A0R(constraintLayout, R.id.emoji_container);
        this.A07 = igLinearLayout;
        this.A03 = AbstractC167007dF.A0T(igLinearLayout, R.id.heart_emoji);
        this.A04 = AbstractC167007dF.A0T(igLinearLayout, R.id.laughing_emoji);
        this.A05 = AbstractC167007dF.A0T(igLinearLayout, R.id.open_mouth_emoji);
        this.A06 = AbstractC167007dF.A0T(igLinearLayout, R.id.sad_emoji);
        this.A01 = (IgSimpleImageView) AbstractC166997dE.A0R(igLinearLayout, R.id.more_emojis);
    }
}
