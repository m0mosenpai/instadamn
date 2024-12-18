package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.Iq0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42399Iq0 implements InterfaceC50450MPe {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C22P A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C5JK A03;
    public final /* synthetic */ PendingRecipient A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C42399Iq0(Activity activity, C22P c22p, UserSession userSession, C5JK c5jk, PendingRecipient pendingRecipient, String str, boolean z) {
        this.A02 = userSession;
        this.A01 = c22p;
        this.A00 = activity;
        this.A05 = str;
        this.A03 = c5jk;
        this.A04 = pendingRecipient;
        this.A06 = z;
    }

    @Override // X.InterfaceC50450MPe
    public final void D9U() {
        UserSession userSession = this.A02;
        Activity activity = this.A00;
        String str = this.A05;
        C11T.A03(new RunnableC43159J5w(activity, this.A01, userSession, this.A03, this.A04, str, this.A06));
    }

    @Override // X.InterfaceC50450MPe
    public final void Dej(C38321qM c38321qM) {
        UserSession userSession = this.A02;
        C22P c22p = this.A01;
        if (c22p == null) {
            c22p = C22P.A0z;
        }
        INH A0C = AbstractC86593tX.A0C(c22p);
        C37855Gl9 c37855Gl9 = C37855Gl9.A00;
        Activity activity = this.A00;
        c37855Gl9.A0G(activity, null, c38321qM, A0C);
        A0C.A0M = this.A05;
        A0C.A06 = this.A03;
        A0C.A0B = this.A04;
        C6XJ A02 = C6XJ.A02(activity, A0C.A00(), userSession, TransparentModalActivity.class, "clips_camera");
        A02.A0J = C6XJ.A0Q;
        A02.A0C(activity);
    }
}
