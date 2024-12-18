package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172757ml {
    public final int A00 = AbstractC02650Ap.A00();
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public final boolean A00() {
        return ((Boolean) this.A07.getValue()).booleanValue();
    }

    public C172757ml(Context context, UserSession userSession) {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C9EX(this, 15));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C9F9(11, userSession, this));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C9F9(12, userSession, this));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C9F9(8, context, this));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C9F9(9, userSession, this));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C9F9(10, userSession, this));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C9F9(13, userSession, this));
    }
}
