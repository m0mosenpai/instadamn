package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.BlockButton;

/* renamed from: X.Vkz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69291Vkz {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final BlockButton A04;

    public C69291Vkz(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        this.A03 = AbstractC31176DnK.A0U(viewGroup, R.id.row_search_user_imageview);
        this.A01 = AbstractC167007dF.A0N(viewGroup, R.id.row_search_user_fullname);
        TextView A0N = AbstractC167007dF.A0N(viewGroup, R.id.row_search_user_username);
        this.A02 = A0N;
        this.A04 = (BlockButton) AbstractC166997dE.A0R(viewGroup, R.id.block_button);
        AbstractC37300Gc1.A0d(A0N, true);
    }
}
