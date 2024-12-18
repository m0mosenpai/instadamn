package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.swipenavigation.PositionConfig;

/* renamed from: X.ARl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23227ARl implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C685736u A01;

    public ViewOnClickListenerC23227ARl(UserSession userSession, C685736u c685736u) {
        this.A00 = userSession;
        this.A01 = c685736u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1471543860);
        AbstractC135966Db.A01(this.A00).A0E(EnumC46303KeZ.A0Y);
        C60662pp c60662pp = this.A01.A0O;
        AnonymousClass396 anonymousClass396 = c60662pp.A07;
        if (anonymousClass396 != null) {
            anonymousClass396.A00.onPause();
        }
        InterfaceC53892dT A07 = c60662pp.A07();
        if (A07 != null) {
            A07.FBp(new PositionConfig(null, null, null, "on_launch_direct_inbox_from_notes_in_feed", null, null, null, null, null, null, null, null, null, 1.0f, 0, true));
        }
        C0f9.A0C(-1156356182, A05);
    }
}
