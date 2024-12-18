package X;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6fY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144526fY {
    public C38321qM A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final IgSimpleImageView A06;
    public final IgImageView A07;

    public C144526fY(C57012jc c57012jc) {
        View requireViewById = c57012jc.A01().requireViewById(R.id.secret_sticker_consumption_container);
        C14360o3.A07(requireViewById);
        this.A03 = requireViewById;
        View requireViewById2 = requireViewById.requireViewById(R.id.secret_sticker_drawable_container);
        C14360o3.A07(requireViewById2);
        this.A04 = requireViewById2;
        View requireViewById3 = requireViewById2.requireViewById(R.id.secret_sticker_view);
        C14360o3.A07(requireViewById3);
        this.A06 = (IgSimpleImageView) requireViewById3;
        View requireViewById4 = requireViewById.requireViewById(R.id.forward_tap_eating_view);
        C14360o3.A07(requireViewById4);
        this.A05 = requireViewById4;
        View requireViewById5 = requireViewById.requireViewById(R.id.backward_tap_eating_view);
        C14360o3.A07(requireViewById5);
        this.A02 = requireViewById5;
        View requireViewById6 = requireViewById.requireViewById(R.id.media_cover);
        final IgImageView igImageView = (IgImageView) requireViewById6;
        igImageView.A0I = new InterfaceC65702y7() { // from class: X.6fZ
            @Override // X.InterfaceC65702y7
            public final void EGm(Bitmap bitmap, IgImageView igImageView2) {
                C14360o3.A0B(igImageView2, 0);
                C14360o3.A0B(bitmap, 1);
                igImageView2.setImageBitmap(BlurUtil.blur(bitmap, 0.4f, 10));
                igImageView2.setColorFilter(igImageView2.getContext().getColor(AbstractC53242c7.A0H(IgImageView.this.getContext(), R.attr.igds_color_legibility_gradient)), PorterDuff.Mode.SRC_OVER);
            }
        };
        C14360o3.A07(requireViewById6);
        this.A07 = igImageView;
    }
}
