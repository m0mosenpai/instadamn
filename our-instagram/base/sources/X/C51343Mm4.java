package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Mm4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51343Mm4 extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgdsSwitch A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51343Mm4(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166987dD.A0c(view, R.id.row_container);
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.row_title);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.row_subtitle);
        this.A04 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.row_primary_image);
        this.A01 = (ImageView) AbstractC166987dD.A0c(view, R.id.row_end_image);
        this.A05 = (IgdsSwitch) AbstractC166987dD.A0c(view, R.id.row_toggle);
    }
}
