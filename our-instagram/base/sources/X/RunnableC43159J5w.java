package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.J5w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43159J5w implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C22P A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C5JK A03;
    public final /* synthetic */ PendingRecipient A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public RunnableC43159J5w(Activity activity, C22P c22p, UserSession userSession, C5JK c5jk, PendingRecipient pendingRecipient, String str, boolean z) {
        this.A02 = userSession;
        this.A01 = c22p;
        this.A05 = str;
        this.A03 = c5jk;
        this.A04 = pendingRecipient;
        this.A06 = z;
        this.A00 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A02;
        C22P c22p = this.A01;
        if (c22p == null) {
            c22p = C22P.A0z;
        }
        INH A0C = AbstractC86593tX.A0C(c22p);
        A0C.A0M = this.A05;
        A0C.A06 = this.A03;
        A0C.A0B = this.A04;
        A0C.A0s = true;
        A0C.A0v = this.A06;
        Bundle A00 = A0C.A00();
        Activity activity = this.A00;
        C6XJ A02 = C6XJ.A02(activity, A00, userSession, TransparentModalActivity.class, "clips_camera");
        A02.A0J = C6XJ.A0Q;
        A02.A0C(activity);
    }
}
