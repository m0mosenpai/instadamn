package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.gradient.IGGradientView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GvI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38435GvI extends C3OO {
    public final IgTextView A00;
    public final IgImageButton A01;

    public C38435GvI(View view) {
        super(view);
        this.A01 = (IgImageButton) AbstractC166987dD.A0c(view, R.id.image_button);
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.title_text);
        view.findViewById(R.id.overlay).setBackground(IGGradientView.A00.A01(GradientDrawable.Orientation.BOTTOM_TOP, 153));
    }
}
