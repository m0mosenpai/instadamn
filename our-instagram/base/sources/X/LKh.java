package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes8.dex */
public final class LKh {
    public final UserSession A00;
    public final MessageIdentifier A01;
    public final String A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public LKh(UserSession userSession, MessageIdentifier messageIdentifier, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = messageIdentifier;
        this.A04 = AbstractC09440dt.A01(new C37017GSy(this, 4));
        this.A03 = AbstractC09440dt.A01(new C37017GSy(this, 3));
    }

    public static C2EC A00(LKh lKh) {
        return (C2EC) lKh.A03.getValue();
    }

    public static String A01(LKh lKh, C81543kP c81543kP, C2ED c2ed) {
        return C160857It.A00(c81543kP, lKh.A00.userId, c2ed.C7g());
    }

    public static C09530e4 A02(LKh lKh) {
        return new C09530e4("message_client_context_id", lKh.A01.A00());
    }

    public static C09530e4 A03(LKh lKh, C81543kP c81543kP, C2ED c2ed) {
        return new C09530e4("user_type", C160857It.A00(c81543kP, lKh.A00.userId, c2ed.C7g()));
    }
}
