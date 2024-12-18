package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G1c implements GXP {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ DirectThreadKey A01;

    @Override // X.GXP
    public final void AEG(String str, String str2, String str3, String str4, String str5) {
        AbstractC165967bO.A00(this.A00).A0K(this.A01, str, str2, str3, str4, null);
    }

    public G1c(UserSession userSession, DirectThreadKey directThreadKey) {
        this.A00 = userSession;
        this.A01 = directThreadKey;
    }
}
