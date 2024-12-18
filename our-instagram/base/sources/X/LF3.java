package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class LF3 {
    public static final C1QY A0C;
    public InterfaceC27191Tt A00;
    public InterfaceC150196pR A01;
    public InterfaceC148316m1 A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Matrix A06;
    public final ComposeView A07;
    public final C3PF A08;
    public final ConstrainedImageView A09;
    public final ConstrainedImageView A0A;
    public final IgImageView A0B;

    public LF3(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(view, 3);
        Resources resources = view.getResources();
        this.A04 = AbstractC166997dE.A09(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        ConstrainedImageView constrainedImageView = (ConstrainedImageView) AbstractC166997dE.A0R(view, R.id.asset_item);
        this.A0A = constrainedImageView;
        ConstrainedImageView constrainedImageView2 = (ConstrainedImageView) AbstractC166997dE.A0S(view, R.id.asset_item_overlay);
        this.A09 = constrainedImageView2;
        View requireViewById = view.requireViewById(R.id.mute_button);
        IgImageView igImageView = (IgImageView) requireViewById;
        Drawable drawable = igImageView.getResources().getDrawable(R.drawable.cutout_video_trim_screen_audio_button_background);
        Context A0L = AbstractC166997dE.A0L(igImageView);
        igImageView.setImageDrawable(new InsetDrawable(drawable, AbstractC166987dD.A0C(A0L, 8), AbstractC166987dD.A0C(A0L, 14), AbstractC166987dD.A0C(A0L, 8), AbstractC166987dD.A0C(A0L, 2)));
        igImageView.setActivated(true);
        C14360o3.A07(requireViewById);
        this.A0B = igImageView;
        this.A07 = (ComposeView) AbstractC166997dE.A0R(view, R.id.meme_hub_text_overlay);
        this.A06 = AbstractC166987dD.A0Q();
        this.A03 = AbstractC13880nE.A0I(AbstractC166997dE.A0L(constrainedImageView)).densityDpi;
        Context context = view.getContext();
        C3P9 A0s = AbstractC166987dD.A0s(constrainedImageView);
        A0s.A04 = new KKm(0, context, resources, interfaceC11380iw, userSession, this);
        A0s.A07 = true;
        A0s.A0D = true;
        this.A08 = A0s.A00();
        constrainedImageView2.setImageResource(R.drawable.right_bottom_triangle);
    }

    static {
        C1QX c1qx = new C1QX();
        c1qx.A04 = EnumC23341Bw.Image;
        c1qx.A03 = C1Ef.OnScreen;
        A0C = c1qx.A00();
    }
}
