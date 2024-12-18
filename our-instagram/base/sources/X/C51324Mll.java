package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Mll, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51324Mll extends C3OO {
    public final Context A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C51324Mll(View view) {
        super(view);
        this.A00 = view.getContext();
        this.A03 = AbstractC25231BEo.A0d(view, R.id.title);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.subtitle);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.button);
    }
}
