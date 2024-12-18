package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.BdW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25929BdW extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25929BdW(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC167007dF.A0T(view, R.id.earned_achievement_list_item_image);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.earned_achievement_list_item_title);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.earned_achievement_list_item_date_earned);
    }
}
