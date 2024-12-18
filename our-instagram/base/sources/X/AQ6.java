package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AQ6 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C218539lP A01;

    public AQ6(UserSession userSession, C218539lP c218539lP) {
        this.A01 = c218539lP;
        this.A00 = userSession;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C218539lP c218539lP = this.A01;
        AbstractC35249Fgi.A05(EnumC33510Erj.STORY_POST_CAPTURE_FLOW, c218539lP.A03, C54P.A01(AbstractC166997dE.A0L(c218539lP.A02), this.A00));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A01.A02.removeOnAttachStateChangeListener(this);
    }
}
