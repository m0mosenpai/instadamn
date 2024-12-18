package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.OBn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54638OBn {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C54638OBn(Context context) {
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.layout_also_share_app_item);
        C14360o3.A07(A0C);
        this.A00 = A0C;
        this.A01 = AbstractC31176DnK.A0T(A0C, R.id.app_icon);
        this.A03 = AbstractC25231BEo.A0d(A0C, R.id.app_title);
        this.A02 = AbstractC25231BEo.A0d(A0C, R.id.dot_separator);
    }
}
