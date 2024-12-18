package X;

import android.content.Context;
import com.facebook.msys.mci.AuthData;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.LcM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48469LcM implements InterfaceC1345866i {
    public final /* synthetic */ C47700L4h A00;
    public final /* synthetic */ AuthData A01;
    public final /* synthetic */ MessagingUser A02;
    public final /* synthetic */ KW1 A03;
    public final /* synthetic */ C47654L2n A04;
    public final /* synthetic */ MsysThreadId A05;
    public final /* synthetic */ Integer A06;

    public C48469LcM(C47700L4h c47700L4h, AuthData authData, MessagingUser messagingUser, KW1 kw1, C47654L2n c47654L2n, MsysThreadId msysThreadId, Integer num) {
        this.A00 = c47700L4h;
        this.A04 = c47654L2n;
        this.A03 = kw1;
        this.A05 = msysThreadId;
        this.A02 = messagingUser;
        this.A01 = authData;
        this.A06 = num;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        C18A c18a;
        Object A00;
        C47700L4h c47700L4h = this.A00;
        if (c47700L4h == null) {
            A00 = new C49221Lpc(this.A04);
        } else {
            KW1 kw1 = this.A03;
            Context context = kw1.A00;
            UserSession userSession = kw1.A01;
            AnonymousClass988 anonymousClass988 = kw1.A03;
            C7X7 c7x7 = kw1.A02;
            AbstractC167027dH.A0a(1, context, userSession, anonymousClass988, c7x7);
            if (AbstractC167007dF.A1Z(AbstractC47132Ef.A00(userSession).A1K)) {
                c18a = AnonymousClass189.A00(userSession);
            } else {
                c18a = null;
            }
            MsysThreadId msysThreadId = this.A05;
            MessagingUser messagingUser = this.A02;
            A00 = AbstractC46866Knz.A00(context, c47700L4h, null, this.A01, userSession, c7x7, anonymousClass988, messagingUser, this.A04, msysThreadId, c18a, this.A06, true);
        }
        c1346766r.A02(A00);
        c1346766r.A00();
    }
}
