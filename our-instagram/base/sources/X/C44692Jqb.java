package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jqb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44692Jqb extends C3OO {
    public final View A00;
    public final UserSession A01;
    public final IgImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44692Jqb(View view, UserSession userSession) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A01 = userSession;
        this.A02 = AbstractC37302Gc3.A0K(view, R.id.gif_image);
        this.A00 = AbstractC166987dD.A0c(view, R.id.gif_image_container);
    }
}
