package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LqO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49268LqO implements MQ2 {
    public final /* synthetic */ KDO A00;

    public C49268LqO(KDO kdo) {
        this.A00 = kdo;
    }

    @Override // X.MQ2
    public final void Crd(MessagingUser messagingUser) {
        C47378KwT c47378KwT = this.A00.A03;
        if (c47378KwT != null) {
            C49091LnH c49091LnH = c47378KwT.A00;
            C189478aR c189478aR = c49091LnH.A02;
            if (c189478aR != null) {
                c189478aR.A07();
            }
            c49091LnH.A01 = messagingUser;
        }
    }

    @Override // X.MQ2
    public final void D4U(String str) {
        KDO kdo = this.A00;
        C47378KwT c47378KwT = kdo.A03;
        if (c47378KwT != null) {
            String str2 = kdo.A07;
            if (str2 != null) {
                String str3 = kdo.A06;
                long j = kdo.A02;
                C2EY c2ey = kdo.A04;
                if (c2ey != null) {
                    C49091LnH c49091LnH = c47378KwT.A00;
                    c49091LnH.A00.DTM(c2ey, new MessageIdentifier(str2, str3), str, "users_list", j);
                    C189478aR c189478aR = c49091LnH.A02;
                    if (c189478aR != null) {
                        c189478aR.A07();
                        return;
                    }
                    return;
                }
                C14360o3.A0F("messageContentType");
                throw C00O.createAndThrow();
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
