package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E3m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31984E3m extends C3OO {
    public ImmutableList A00;
    public InterfaceC56392iX A01;
    public GradientSpinnerAvatarView A02;
    public Long A03;
    public final ViewGroup A04;
    public final FrameLayout A05;
    public final TextView A06;
    public final IgTextView A07;

    public C31984E3m(View view) {
        super(view);
        this.A04 = AbstractC31173DnH.A0F(view, R.id.row_inbox_container);
        this.A07 = AbstractC31172DnG.A0X(view, R.id.row_inbox_username);
        this.A02 = (GradientSpinnerAvatarView) view.requireViewById(R.id.avatar_container);
        this.A01 = AbstractC166997dE.A0X(view, R.id.group_photo_faceswarm_stub);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.row_inbox_digest);
        this.A06 = A0T;
        FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.inbox_option_view);
        this.A05 = frameLayout;
        A0T.setMaxLines(2);
        frameLayout.setVisibility(8);
        this.A03 = AbstractC167007dF.A0d();
        this.A00 = ImmutableList.of();
    }
}
