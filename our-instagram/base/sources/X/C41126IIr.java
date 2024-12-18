package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.IIr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41126IIr {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final C908843f A04;

    public C41126IIr(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = AbstractC25231BEo.A0d(view, R.id.prompt_text);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.add_yours_participation_facepile);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.add_yours_participation_count);
        this.A04 = new C908843f(view);
    }
}
