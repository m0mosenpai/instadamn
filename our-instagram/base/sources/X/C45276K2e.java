package X;

import com.facebook.msys.mci.AuthData;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.K2e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45276K2e extends C0T6 implements MNO {
    public final AuthData A00;
    public final MessagingUser A01;
    public final C47654L2n A02;
    public final MsysThreadId A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45276K2e) {
                C45276K2e c45276K2e = (C45276K2e) obj;
                if (!C14360o3.A0K(this.A03, c45276K2e.A03) || !C14360o3.A0K(this.A01, c45276K2e.A01) || !C14360o3.A0K(this.A00, c45276K2e.A00) || this.A04 != c45276K2e.A04 || !C14360o3.A0K(this.A02, c45276K2e.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J = AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A03)));
        Integer num = this.A04;
        return AbstractC166987dD.A0I(this.A02, AbstractC167017dG.A0L(num, AbstractC46865Kny.A00(num), A0J));
    }

    public C45276K2e(AuthData authData, MessagingUser messagingUser, C47654L2n c47654L2n, MsysThreadId msysThreadId, Integer num) {
        AbstractC167027dH.A13(msysThreadId, messagingUser, authData);
        this.A03 = msysThreadId;
        this.A01 = messagingUser;
        this.A00 = authData;
        this.A04 = num;
        this.A02 = c47654L2n;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LoadCachedMessagesSideEffect(msysThreadId=");
        A1C.append(this.A03);
        A1C.append(", currentUser=");
        A1C.append(this.A01);
        A1C.append(", authData=");
        A1C.append(this.A00);
        A1C.append(", loadType=");
        Integer num = this.A04;
        if (num != null) {
            str = AbstractC46865Kny.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", viewModelGenerators=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
