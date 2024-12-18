package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.8Eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184008Eh extends IgFrameLayout {
    public int A00;
    public boolean A01;
    public final IgFrameLayout A02;
    public final IgImageView A03;

    public C184008Eh(Context context, int i) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.immersive_photo_control_button, this);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout");
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
        this.A02 = igFrameLayout;
        View requireViewById = igFrameLayout.requireViewById(R.id.immersive_photo_control_button_icon);
        C14360o3.A07(requireViewById);
        this.A03 = (IgImageView) requireViewById;
        this.A00 = R.drawable.instagram_circle_block_pano_outline_24;
        this.A01 = true;
        A00();
        this.A00 = i;
    }

    private final void A00() {
        IgImageView igImageView;
        int i;
        boolean z = this.A01;
        IgFrameLayout igFrameLayout = this.A02;
        if (z) {
            igFrameLayout.setScaleX(1.25f);
            igFrameLayout.setScaleY(1.25f);
            Context context = getContext();
            C14360o3.A07(context);
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), this.A00);
            C14360o3.A07(decodeResource);
            Bitmap A00 = C50L.A00(context, decodeResource);
            igImageView = this.A03;
            igImageView.setImageBitmap(A00);
            igImageView.clearColorFilter();
            i = R.drawable.immersive_photo_control_button_active_background;
        } else {
            igFrameLayout.setScaleX(1.0f);
            igFrameLayout.setScaleY(1.0f);
            igImageView = this.A03;
            igImageView.setImageResource(this.A00);
            Context context2 = getContext();
            igImageView.setColorFilter(context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igds_color_icon_on_media)));
            i = R.drawable.immersive_photo_control_button_inactive_background;
        }
        igImageView.setBackgroundResource(i);
    }

    public final void setActive(boolean z) {
        this.A01 = z;
        A00();
    }
}
