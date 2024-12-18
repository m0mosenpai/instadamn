package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.E2v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31967E2v extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final C7ZX A02;
    public final View A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31967E2v(View view, C7ZX c7zx) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = view;
        this.A02 = c7zx;
        this.A00 = AbstractC166997dE.A0S(view, R.id.message_comments_pill_container);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.comments_number);
    }
}
