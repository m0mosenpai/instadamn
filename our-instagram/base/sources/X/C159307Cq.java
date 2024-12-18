package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159307Cq extends AbstractC159317Cr {
    public final UserSession A00;
    public final InterfaceC16820sZ A01;

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        UserSession userSession = this.A00;
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A0X;
        C0YR[] c0yrArr = C2056398n.A0d;
        int intValue = ((Number) interfaceC16530ry.CES(A00, c0yrArr[35])).intValue() + 1;
        interfaceC16530ry.Egi(A00, Integer.valueOf(intValue), c0yrArr[35]);
        C2056398n A002 = AbstractC2056298m.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        A002.A0Y.Egi(A002, Long.valueOf(currentTimeMillis), c0yrArr[36]);
    }

    public C159307Cq(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        super(2131971108);
        this.A00 = userSession;
        this.A01 = interfaceC16820sZ;
    }
}
