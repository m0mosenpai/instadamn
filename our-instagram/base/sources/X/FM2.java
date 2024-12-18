package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class FM2 {
    public final Context A00;
    public final View A01;
    public final UserSession A02;
    public final IgTextView A03;

    public FM2(Context context, ViewStub viewStub, UserSession userSession) {
        C14360o3.A0B(viewStub, 2);
        this.A02 = userSession;
        View inflate = viewStub.inflate();
        this.A01 = inflate;
        IgTextView A0d = AbstractC25231BEo.A0d(inflate, R.id.xac_thread_disabled_text);
        this.A03 = A0d;
        Context context2 = inflate.getContext();
        String A0p = AbstractC166997dE.A0p(context2, 2131960899);
        this.A00 = context2;
        String A0f = AbstractC167007dF.A0f(context, A0p, 2131960898);
        int A02 = AbstractC31174DnI.A02(context);
        AnonymousClass773.A07(new EPN(new C012804r(16, A0p), this, C05F.A01, A0p, A02), A0d, A0p, A0f);
    }
}
