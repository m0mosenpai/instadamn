package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.BdY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25931BdY extends C3OO {
    public final IgSimpleImageView A00;
    public final IgTextView A01;
    public final IgTextView A02;

    public C25931BdY(View view) {
        super(view);
        this.A00 = (IgSimpleImageView) AbstractC166997dE.A0R(this.itemView, R.id.bullet_cell_icon);
        this.A02 = AbstractC25231BEo.A0d(this.itemView, R.id.bullet_cell_title);
        this.A01 = AbstractC25231BEo.A0d(this.itemView, R.id.bullet_cell_body);
    }
}
