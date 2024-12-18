package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class ARH implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public ARH(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(190135337);
        AnonymousClass229.A01(this.A00).A09.A0T("CUTOUT_STICKER_DELETION_DIALOG_CANCEL_TAP", this.A01);
        C0f9.A0C(328270573, A05);
    }
}
