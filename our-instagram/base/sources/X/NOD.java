package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;

/* loaded from: classes9.dex */
public final class NOD extends AbstractC51215Mk0 {
    public final IgTextView A00;
    public final IgdsBulletCell A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NOD(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.incentives_text_view);
        this.A01 = (IgdsBulletCell) AbstractC166997dE.A0R(view, R.id.incentives_bullet_cell);
    }
}
