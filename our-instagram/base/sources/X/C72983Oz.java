package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;

/* renamed from: X.3Oz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72983Oz extends C3OO {
    public C140626Xq A00;
    public String A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final LinearLayout A05;
    public final TextView A06;
    public final View A07;
    public final RecyclerReelAvatarView A08;

    public final View A00() {
        RecyclerReelAvatarView recyclerReelAvatarView = this.A08;
        if (recyclerReelAvatarView != null) {
            return ((C3P2) recyclerReelAvatarView.getHolder().A03.getValue()).A0K;
        }
        View view = this.A07;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C72983Oz(View view) {
        super(view);
        View requireViewById = view.requireViewById(R.id.outer_container);
        C14360o3.A07(requireViewById);
        LinearLayout linearLayout = (LinearLayout) requireViewById;
        this.A05 = linearLayout;
        AbstractC56952jT.A04(linearLayout, C05F.A01);
        this.A07 = view.findViewById(R.id.avatar_container);
        this.A08 = (RecyclerReelAvatarView) view.findViewById(R.id.avatar_view);
        this.A03 = view.findViewById(R.id.badge_background);
        this.A04 = (ImageView) view.findViewById(R.id.badge_icon);
        this.A06 = (TextView) view.findViewById(R.id.badge_label);
        this.A02 = view.findViewById(R.id.avatar_image_view);
    }
}
