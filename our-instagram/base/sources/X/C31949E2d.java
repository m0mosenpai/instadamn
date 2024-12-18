package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.E2d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31949E2d extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31949E2d(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.title_text);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.content_text);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.learn_more_link);
    }
}
