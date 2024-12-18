package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;

/* renamed from: X.7Ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160677Ib {
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A03, new C9EZ(this, 45));

    public final boolean A00(int i) {
        if (((AbstractCollection) this.A01.getValue()).contains(Integer.valueOf(i))) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36326618641283072L)) {
                return true;
            }
        }
        return false;
    }

    public C160677Ib(UserSession userSession) {
        this.A00 = userSession;
    }
}
