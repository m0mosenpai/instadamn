package X;

import java.io.IOException;

/* renamed from: X.OwG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56150OwG implements InterfaceC25601Mq {
    public final C222015v A00;
    public final InterfaceC57927PmX A01;

    public final InterfaceC40801un A00(C3JY c3jy) {
        C14360o3.A0B(c3jy, 0);
        InterfaceC26481Qd A00 = c3jy.A00();
        try {
            if (A00 != null) {
                C16L A01 = this.A00.A01(A00.AjT());
                A01.A1J();
                if (A01.A11() != null) {
                    InterfaceC40801un E3V = this.A01.E3V(A01);
                    E3V.setStatusCode(c3jy.A02);
                    try {
                        A01.close();
                    } catch (IOException unused) {
                    }
                    A00.AIH();
                    return E3V;
                }
                throw MSW.A0y(AbstractC111324zv.A00(3737));
            }
            throw MSW.A0y("Response body is missing");
        } finally {
        }
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        C3JY c3jy = (C3JY) obj;
        C14360o3.A0B(c3jy, 0);
        return A00(c3jy);
    }

    public C56150OwG(C222015v c222015v, InterfaceC57927PmX interfaceC57927PmX) {
        this.A01 = interfaceC57927PmX;
        this.A00 = c222015v;
    }
}
