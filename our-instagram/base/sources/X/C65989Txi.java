package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Txi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65989Txi extends C3OO {
    public final View A00;
    public final View A01;
    public final IgTextView A02;
    public final IgImageView A03;

    public C65989Txi(View view) {
        super(view);
        this.A01 = view;
        this.A00 = view.requireViewById(R.id.floating_button_background);
        IgImageView igImageView = (IgImageView) view.requireViewById(R.id.floating_button_image);
        this.A03 = igImageView;
        AbstractC31173DnH.A11(view.getContext(), igImageView, R.color.design_dark_default_color_on_background);
        this.A02 = (IgTextView) view.requireViewById(R.id.floating_button_text);
    }
}
