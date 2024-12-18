package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.4z7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110954z7 {
    public static final void A00(Context context, CardView cardView, IgImageView igImageView, FollowStatus followStatus) {
        int i;
        FollowStatus followStatus2 = FollowStatus.A06;
        if (followStatus == followStatus2) {
            i = R.drawable.instagram_user_follow_pano_outline_24;
        } else {
            FollowStatus followStatus3 = FollowStatus.A07;
            i = R.drawable.instagram_user_following_pano_outline_24;
            if (followStatus == followStatus3) {
                i = R.drawable.instagram_user_requested_pano_filled_24;
            }
        }
        igImageView.setImageResource(i);
        C14360o3.A0A(context);
        int i2 = R.attr.igds_color_secondary_icon;
        if (followStatus == followStatus2) {
            i2 = R.attr.igds_color_primary_icon;
        }
        igImageView.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A0H(context, i2))));
        int i3 = R.color.callout_background;
        if (followStatus == followStatus2) {
            i3 = R.color.igds_elevated_background;
        }
        cardView.setCardBackgroundColor(context.getColor(i3));
    }

    public static final void A01(View view, View view2, float f, float f2) {
        C56302iJ c56302iJ;
        View findViewById = view.findViewById(R.id.facepile_constraint);
        C14360o3.A07(findViewById);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if ((layoutParams instanceof C56302iJ) && (c56302iJ = (C56302iJ) layoutParams) != null) {
            C110964z8 c110964z8 = new C110964z8();
            int i = c56302iJ.A0I;
            c110964z8.A0I(constraintLayout);
            C152756u3 c152756u3 = C110964z8.A02(c110964z8, R.id.hyper2).A03;
            c152756u3.A0F = R.id.center;
            c152756u3.A0G = i;
            c152756u3.A00 = f;
            C152756u3 c152756u32 = C110964z8.A02(c110964z8, R.id.hyper3).A03;
            c152756u32.A0F = R.id.center;
            c152756u32.A0G = i;
            c152756u32.A00 = f2;
            c110964z8.A0G(constraintLayout);
            view2.bringToFront();
        }
    }
}
