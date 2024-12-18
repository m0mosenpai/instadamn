package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IsM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42543IsM implements C5H9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42543IsM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.C5H9
    public final void A8X(C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, String str) {
        UserSession userSession;
        int i = this.A00;
        C14360o3.A0B(c82713mZ, 2);
        Object obj = this.A02;
        switch (i) {
            case 0:
                userSession = ((C39373HaD) obj).A00;
                break;
            case 1:
                userSession = ((C37474Ges) obj).A01;
                break;
            default:
                userSession = ((C39372HaC) obj).A00;
                break;
        }
        c82713mZ.A0K(userSession, (C40971v4) this.A01);
    }
}
