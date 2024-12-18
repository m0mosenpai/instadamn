package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.CjY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnAttachStateChangeListenerC28592CjY implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C25341BJk A00;
    public final /* synthetic */ String A01;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C14360o3.A0B(view, 0);
        view.removeOnAttachStateChangeListener(this);
    }

    public ViewOnAttachStateChangeListenerC28592CjY(C25341BJk c25341BJk, String str) {
        this.A00 = c25341BJk;
        this.A01 = str;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        UserSession userSession = this.A00.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C25341BJk.A02, userSession), "ig_rights_management_media_notice_impression");
        if (A0f.isSampled()) {
            A0f.A9K("ig_user_id", AbstractC25228BEl.A13(userSession.userId));
            A0f.A9K("media_igid", AbstractC25228BEl.A13(this.A01));
            A0f.Cht();
        }
    }
}
