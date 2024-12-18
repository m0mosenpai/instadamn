package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E3a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31972E3a extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final GradientSpinnerAvatarView A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31972E3a(Context context, View view, Integer num) {
        super(view);
        Drawable A04;
        int A06 = AbstractC167007dF.A06(1, view, context);
        this.A01 = view;
        this.A06 = AbstractC31176DnK.A0f(view, R.id.avatar);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.avatar_badge);
        this.A03 = A0D;
        this.A05 = AbstractC25231BEo.A0d(view, R.id.username);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.user_fullname);
        if (num != null) {
            if (num.intValue() != 8) {
                A04 = AbstractC172497mJ.A03(context, R.drawable.close_friends_star_small, A06);
            } else {
                int[] iArr = new int[5];
                C50L.A03(context, null, iArr, R.style.GradientPatternStyle);
                A04 = C3LQ.A04(context, iArr, R.drawable.instagram_star_pano_filled_12);
            }
            A0D.setImageDrawable(A04);
        }
        View A0E = AbstractC31173DnH.A0E(AbstractC167007dF.A0M(view, R.id.action_button_container_view_stub), R.layout.action_button_container_panavision);
        this.A00 = A0E.requireViewById(R.id.add);
        this.A02 = A0E.requireViewById(R.id.remove);
    }
}
