package X;

import android.content.Context;
import com.facebook.msys.mci.AuthData;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Laq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48376Laq implements C6D2 {
    public final /* synthetic */ C51760Mtj A00;
    public final /* synthetic */ AuthData A01;
    public final /* synthetic */ MessagingUser A02;
    public final /* synthetic */ KW2 A03;
    public final /* synthetic */ C47654L2n A04;
    public final /* synthetic */ MsysThreadId A05;
    public final /* synthetic */ Integer A06;

    public C48376Laq(C51760Mtj c51760Mtj, AuthData authData, MessagingUser messagingUser, KW2 kw2, C47654L2n c47654L2n, MsysThreadId msysThreadId, Integer num) {
        this.A03 = kw2;
        this.A05 = msysThreadId;
        this.A02 = messagingUser;
        this.A01 = authData;
        this.A06 = num;
        this.A04 = c47654L2n;
        this.A00 = c51760Mtj;
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C18A c18a;
        C47700L4h c47700L4h = (C47700L4h) obj;
        C14360o3.A0B(c47700L4h, 0);
        KW2 kw2 = this.A03;
        UserSession userSession = kw2.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36315125308722207L)) {
            AbstractC46920Kp1.A00(userSession).A01.put(Long.valueOf(this.A05.A00), c47700L4h);
        }
        Context context = kw2.A00;
        AnonymousClass988 anonymousClass988 = kw2.A03;
        C7X7 c7x7 = kw2.A02;
        AbstractC167027dH.A0a(1, context, userSession, anonymousClass988, c7x7);
        if (AbstractC167007dF.A1Z(AbstractC47132Ef.A00(userSession).A1K)) {
            c18a = AnonymousClass189.A00(userSession);
        } else {
            c18a = null;
        }
        MsysThreadId msysThreadId = this.A05;
        MessagingUser messagingUser = this.A02;
        AuthData authData = this.A01;
        Integer num = this.A06;
        return AbstractC46866Knz.A00(context, c47700L4h, this.A00, authData, userSession, c7x7, anonymousClass988, messagingUser, this.A04, msysThreadId, c18a, num, false);
    }
}
