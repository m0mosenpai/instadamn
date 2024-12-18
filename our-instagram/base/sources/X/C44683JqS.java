package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.JqS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44683JqS extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44683JqS(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A02 = AbstractC31176DnK.A0U(view, R.id.avatar_view);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.username);
    }
}
