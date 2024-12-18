package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.direct.DirectSearchPrompt;

/* loaded from: classes6.dex */
public final class E3B extends C3OO {
    public int A00;
    public DirectSearchPrompt A01;
    public final TextView A02;
    public final IgSimpleImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3B(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC31178DnM.A0C(view);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.icon);
    }
}
