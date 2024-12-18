package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class Ov8 implements InterfaceC66482zP {
    public final UserSession A00;
    public final boolean A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "opal_row_view_model";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        boolean z;
        Ov8 ov8 = (Ov8) obj;
        boolean z2 = this.A01;
        if (ov8 != null) {
            z = ov8.A01;
        } else {
            z = false;
        }
        if (z2 != z) {
            return false;
        }
        return true;
    }

    public Ov8(boolean z, UserSession userSession) {
        this.A01 = z;
        this.A00 = userSession;
    }
}
