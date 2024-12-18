package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class E3J extends C3OO {
    public final Context A00;
    public final Drawable A01;
    public final TextView A02;
    public final GradientSpinnerAvatarView A03;
    public final /* synthetic */ C32605EXf A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3J(View view, C32605EXf c32605EXf) {
        super(view);
        this.A04 = c32605EXf;
        Context context = view.getContext();
        this.A00 = context;
        this.A02 = AbstractC167007dF.A0N(view, R.id.active_now_username);
        GradientSpinnerAvatarView A0f = AbstractC31176DnK.A0f(view, R.id.active_now_user_avatar);
        this.A03 = A0f;
        this.A01 = AbstractC31177DnL.A0A(context);
        A0f.setGradientSpinnerVisible(false);
        A0f.setGradientSpinnerActivated(false);
    }
}
