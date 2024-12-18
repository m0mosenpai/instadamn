package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JqV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44686JqV extends C3OO {
    public final ViewGroup A00;
    public final IgTextView A01;
    public final IgImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44686JqV(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = (ViewGroup) view;
        this.A02 = AbstractC37302Gc3.A0K(view, R.id.alt_text_carousel_image_view);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.alt_text_carousel_text_view);
    }
}
