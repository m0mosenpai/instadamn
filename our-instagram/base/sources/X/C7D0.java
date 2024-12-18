package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7D0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7D0 extends AbstractC159317Cr {
    public final UserSession A00;
    public final C159347Cu A01;

    public C7D0(UserSession userSession, C159347Cu c159347Cu) {
        super(C14360o3.A0K(C18U.A04(C06090Tz.A05, userSession, 36887674514899731L), "A") ? 2131971098 : 2131971097);
        this.A00 = userSession;
        this.A01 = c159347Cu;
    }

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        UserSession userSession = this.A00;
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A01;
        C0YR[] c0yrArr = C2056398n.A0d;
        int intValue = ((Number) interfaceC16530ry.CES(A00, c0yrArr[33])).intValue() + 1;
        interfaceC16530ry.Egi(A00, Integer.valueOf(intValue), c0yrArr[33]);
        C2056398n A002 = AbstractC2056298m.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        A002.A02.Egi(A002, Long.valueOf(currentTimeMillis), c0yrArr[34]);
    }
}
