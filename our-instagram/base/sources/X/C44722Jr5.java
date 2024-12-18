package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Jr5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44722Jr5 extends C3OO {
    public final IgTextView A00;
    public final IgImageView A01;
    public final GradientSpinnerAvatarView A02;
    public final /* synthetic */ C44574Jnz A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44722Jr5(View view, C44574Jnz c44574Jnz) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A03 = c44574Jnz;
        this.A02 = (GradientSpinnerAvatarView) AbstractC166987dD.A0c(view, R.id.reply_avatar_container);
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.profile_name);
        this.A01 = AbstractC37302Gc3.A0K(view, R.id.reply_remove_icon);
    }
}
