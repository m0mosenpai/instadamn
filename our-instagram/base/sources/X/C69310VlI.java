package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.VlI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69310VlI {
    public C41219IMi A00;
    public final Context A01;
    public final IgFrameLayout A02;
    public final IgBouncyUfiButtonImageView A03;
    public final IgBouncyUfiButtonImageView A04;

    public C69310VlI(View view) {
        this.A01 = AbstractC166997dE.A0L(view);
        this.A02 = (IgFrameLayout) AbstractC166987dD.A0c(view, R.id.button_container);
        this.A03 = (IgBouncyUfiButtonImageView) AbstractC166987dD.A0c(view, R.id.save_button);
        this.A04 = (IgBouncyUfiButtonImageView) AbstractC166987dD.A0c(view, R.id.three_dot_menu);
    }
}
