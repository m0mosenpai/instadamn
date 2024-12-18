package X;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class A8T {
    public ComposeView A00;
    public final UserSession A01;
    public final View A02;

    public A8T(View view, UserSession userSession) {
        ComposeView composeView;
        this.A02 = view;
        this.A01 = userSession;
        View inflate = AbstractC167007dF.A0M(view, R.id.text2filter_prompt_stub).inflate();
        if (inflate instanceof ComposeView) {
            composeView = (ComposeView) inflate;
        } else {
            composeView = null;
        }
        this.A00 = composeView;
        if (composeView != null) {
            composeView.setContent(C5UA.A03(new C30496Dbf(this, 31), 283484163));
        }
    }
}
