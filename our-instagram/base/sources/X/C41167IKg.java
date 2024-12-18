package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.IKg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41167IKg {
    public ImageUrl A00;
    public final int A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final RoundedCornerImageView A08;
    public final RoundedCornerImageView A09;
    public final RoundedCornerImageView A0A;
    public final View.OnClickListener A0B;
    public final View.OnClickListener A0C;
    public final ViewStub A0D;

    public C41167IKg(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A0D = viewStub;
        this.A0C = onClickListener;
        this.A0B = onClickListener2;
        View inflate = viewStub.inflate();
        Context context = inflate.getContext();
        AbstractC31172DnG.A1B(context, inflate, AbstractC53242c7.A0H(context, R.attr.backgroundColorSecondary));
        C0fQ.A00(onClickListener2, inflate);
        this.A04 = inflate;
        View requireViewById = inflate.requireViewById(R.id.thumbnail_image_view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) requireViewById;
        C3OB c3ob = C3OB.A02;
        roundedCornerImageView.setBitmapShaderScaleType(c3ob);
        C14360o3.A07(requireViewById);
        this.A0A = roundedCornerImageView;
        View requireViewById2 = inflate.requireViewById(R.id.secondary_thumbnail_image_view);
        RoundedCornerImageView roundedCornerImageView2 = (RoundedCornerImageView) requireViewById2;
        roundedCornerImageView2.setBitmapShaderScaleType(c3ob);
        C14360o3.A07(requireViewById2);
        this.A08 = roundedCornerImageView2;
        View requireViewById3 = inflate.requireViewById(R.id.tertiary_thumbnail_image_view);
        RoundedCornerImageView roundedCornerImageView3 = (RoundedCornerImageView) requireViewById3;
        roundedCornerImageView3.setBitmapShaderScaleType(c3ob);
        C14360o3.A07(requireViewById3);
        this.A09 = roundedCornerImageView3;
        this.A07 = AbstractC167007dF.A0N(inflate, R.id.title_text);
        this.A06 = AbstractC167007dF.A0N(inflate, R.id.subtitle_text);
        View requireViewById4 = inflate.requireViewById(R.id.cta_text);
        TextView textView = (TextView) requireViewById4;
        AbstractC37300Gc1.A0d(textView, true);
        C0fQ.A00(onClickListener, textView);
        C14360o3.A07(requireViewById4);
        this.A05 = textView;
        this.A02 = inflate.findViewById(R.id.secondary_thumbnail_image_frame);
        this.A03 = inflate.findViewById(R.id.tertiary_thumbnail_image_frame);
        this.A01 = AbstractC25228BEl.A0M(viewStub).getDimensionPixelSize(R.dimen.container_height);
    }
}
