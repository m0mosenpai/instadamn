package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes6.dex */
public final class G4D implements InterfaceC164877Za {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ DirectThreadKey A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC164877Za
    public final void DBP() {
    }

    @Override // X.InterfaceC164877Za
    public final void DKW() {
    }

    @Override // X.InterfaceC164877Za
    public final void DKX() {
    }

    public G4D(UserSession userSession, DirectThreadKey directThreadKey, String str) {
        this.A00 = userSession;
        this.A01 = directThreadKey;
        this.A02 = str;
    }

    @Override // X.InterfaceC164877Za
    public final void DTC(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        C7TG A00 = AbstractC165967bO.A00(this.A00);
        DirectThreadKey directThreadKey = this.A01;
        String str5 = this.A02;
        if (messageIdentifier != null) {
            A00.A0K(directThreadKey, str5, "CREATED", messageIdentifier.A01, str, messageIdentifier.A00());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC164877Za
    public final void Dd3(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        C7TG A00 = AbstractC165967bO.A00(this.A00);
        DirectThreadKey directThreadKey = this.A01;
        String str3 = this.A02;
        if (messageIdentifier != null) {
            A00.A0K(directThreadKey, str3, "DELETED", messageIdentifier.A01, null, messageIdentifier.A00());
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
