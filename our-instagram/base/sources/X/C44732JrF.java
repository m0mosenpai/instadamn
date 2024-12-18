package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.JrF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44732JrF extends C3OO {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgView A04;

    public C44732JrF(View view) {
        super(view);
        this.A00 = view;
        this.A02 = AbstractC31176DnK.A0T(view, R.id.icon);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.title);
        this.A04 = (IgView) AbstractC166997dE.A0R(view, R.id.thread_state_indicator);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.chevron);
    }
}
