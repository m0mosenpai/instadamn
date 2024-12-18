package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9V3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9V3 extends C3OO implements InterfaceC177987vX {
    public C195608l0 A00;
    public boolean A01;
    public final GradientDrawable A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final ConstraintLayout A06;
    public final UserSession A07;
    public final IgSimpleImageView A08;
    public final IgSimpleImageView A09;
    public final IgImageView A0A;
    public final InterfaceC195388ke A0B;
    public final C177907vP A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9V3(ConstraintLayout constraintLayout, C9BW c9bw, UserSession userSession, InterfaceC195388ke interfaceC195388ke) {
        super(constraintLayout);
        int i;
        C14360o3.A0B(constraintLayout, 1);
        this.A06 = constraintLayout;
        this.A0B = interfaceC195388ke;
        this.A07 = userSession;
        this.A00 = null;
        IgImageView A0T = AbstractC167007dF.A0T(constraintLayout, R.id.gallery_grid_item_thumbnail);
        this.A0A = A0T;
        View requireViewById = constraintLayout.requireViewById(R.id.gallery_grid_item_label);
        TextView textView = (TextView) requireViewById;
        Context A0L = AbstractC166997dE.A0L(textView);
        Resources resources = textView.getResources();
        textView.setTextSize(AbstractC13880nE.A02(A0L, resources.getDimension(R.dimen.abc_text_size_menu_header_material)));
        textView.setTypeface(null, 1);
        textView.setTextColor(resources.getColor(AbstractC53242c7.A0H(A0L, R.attr.igds_color_secondary_text_on_media), null));
        C14360o3.A07(requireViewById);
        this.A05 = textView;
        this.A09 = (IgSimpleImageView) AbstractC166997dE.A0R(constraintLayout, R.id.gallery_grid_item_top_left_icon);
        this.A08 = (IgSimpleImageView) AbstractC166997dE.A0R(constraintLayout, R.id.gallery_grid_item_bottom_left_icon);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        this.A02 = gradientDrawable;
        C177907vP c177907vP = new C177907vP(AbstractC166997dE.A0L(constraintLayout));
        this.A0C = c177907vP;
        View requireViewById2 = constraintLayout.requireViewById(R.id.gallery_grid_item_selection_circle);
        ImageView imageView = (ImageView) requireViewById2;
        imageView.setImageDrawable(c177907vP);
        C14360o3.A07(requireViewById2);
        this.A04 = imageView;
        View A0S = AbstractC166997dE.A0S(constraintLayout, R.id.gallery_grid_item_selection_overlay);
        this.A03 = A0S;
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(constraintLayout);
        C206279Bk c206279Bk = (C206279Bk) c9bw.A01;
        String A04 = AbstractC188868Yc.A04((Integer) c206279Bk.A05);
        c110964z8.A0F(R.id.background_color, A04);
        c110964z8.A0F(R.id.gallery_grid_item_thumbnail, A04);
        c110964z8.A0F(R.id.gallery_grid_item_selection_overlay, A04);
        c110964z8.A0G(constraintLayout);
        A0T.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int A0H = AbstractC166987dD.A0H(c206279Bk.A01);
        if (A0H != 1) {
            if (A0H == 0) {
                ConstraintLayout constraintLayout2 = this.A06;
                ViewOnClickListenerC23249ASk.A00(constraintLayout2, 16, this);
                constraintLayout2.setOnLongClickListener(new LQL(this, 3));
            } else {
                throw B4Z.A00();
            }
        } else {
            ConstraintLayout constraintLayout3 = this.A06;
            C3P9 A0s = AbstractC166987dD.A0s(constraintLayout3);
            A0s.A0D = true;
            A0s.A07 = true;
            A0s.A02 = 0.92f;
            A0s.A04 = new C48540Ldd(this, 0);
            A0s.A00();
            C3P9 A0s2 = AbstractC166987dD.A0s(this.A04);
            A0s2.A01(constraintLayout3);
            A0s2.A0D = true;
            A0s2.A07 = true;
            A0s2.A02 = 0.92f;
            A0s2.A04 = new C48540Ldd(this, 1);
            A0s2.A00();
        }
        int A0H2 = AbstractC166987dD.A0H(((C206259Bi) c9bw.A00).A04);
        if (A0H2 != 2) {
            if (A0H2 != 0) {
                if (A0H2 == 1) {
                    i = R.color.bright_foreground_disabled_material_dark;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i = R.color.action_bar_semi_transparent_white;
            }
        } else {
            i = R.color.black_50_transparent;
        }
        A0S.setBackgroundColor(A0S.getContext().getColor(i));
    }

    @Override // X.InterfaceC177987vX
    public final void DU5() {
        this.A01 = true;
    }

    public static final boolean A00(C9V3 c9v3) {
        BBC bbc;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) c9v3.A0A.getDrawable();
        if (bitmapDrawable != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            C14360o3.A07(bitmap);
            bbc = new C9NP(bitmap);
        } else {
            bbc = AiD.A00;
        }
        BBC bbc2 = bbc;
        C195608l0 c195608l0 = c9v3.A00;
        if (c195608l0 != null) {
            c9v3.A06.post(new RunnableC24765Axn(c9v3, c195608l0, bbc2));
            return true;
        }
        return false;
    }
}
