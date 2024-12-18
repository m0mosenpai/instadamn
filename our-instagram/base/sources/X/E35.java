package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes6.dex */
public final class E35 extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final RoundedCornerImageView A03;

    public E35(View view) {
        super(view);
        this.A00 = view;
        View requireViewById = view.requireViewById(R.id.image_view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) requireViewById;
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        Context context = view.getContext();
        roundedCornerImageView.setPlaceHolderColor(AbstractC31173DnH.A03(roundedCornerImageView.getContext(), context, R.attr.igds_color_photo_placeholder));
        C14360o3.A07(requireViewById);
        this.A03 = roundedCornerImageView;
        View requireViewById2 = view.requireViewById(R.id.title_view);
        TextView textView = (TextView) requireViewById2;
        textView.setTypeface(AbstractC167017dG.A0R(context));
        C14360o3.A07(requireViewById2);
        this.A02 = textView;
        this.A01 = AbstractC167007dF.A0N(view, R.id.subtitle_view);
    }
}
