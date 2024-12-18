package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.E3i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31980E3i extends C3OO {
    public ImageView A00;
    public CircularImageView A01;
    public final View A02;
    public final ViewGroup A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final /* synthetic */ C31874Dzg A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31980E3i(ViewGroup viewGroup, C31874Dzg c31874Dzg) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 2);
        this.A06 = c31874Dzg;
        this.A03 = viewGroup;
        this.A04 = AbstractC25231BEo.A0d(viewGroup, R.id.row_user_username);
        this.A05 = AbstractC25231BEo.A0d(viewGroup, R.id.row_user_info);
        this.A01 = AbstractC31176DnK.A0U(viewGroup, R.id.user_profile_pic);
        this.A00 = AbstractC31176DnK.A0D(viewGroup, R.id.close_friends_icon);
        this.A02 = AbstractC166997dE.A0S(viewGroup, R.id.row_user_message);
    }
}
