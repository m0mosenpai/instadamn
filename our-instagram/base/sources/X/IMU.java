package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class IMU {
    public C40948IBv A00;
    public InterfaceC43460JHy A01;
    public boolean A03;
    public final UserSession A05;
    public final InterfaceC43448JHm A06;
    public final C154796xU A07;
    public final InterfaceC60442pS A08;
    public final HashMap A09;
    public boolean A02 = true;
    public boolean A04 = false;

    public final void A00(InterfaceC65262xO interfaceC65262xO) {
        C25621Ms Bo1 = this.A06.Bo1(interfaceC65262xO);
        HashMap hashMap = this.A09;
        if (hashMap != null) {
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                AbstractC37303Gc4.A16(Bo1, A14);
            }
        }
        C154796xU c154796xU = this.A07;
        AbstractC2044893h.A06(Bo1, c154796xU.A03.A07);
        C1ON A0N = Bo1.A0N();
        InterfaceC43460JHy interfaceC43460JHy = this.A01;
        interfaceC43460JHy.getClass();
        c154796xU.A03(A0N, new HL8(this, interfaceC43460JHy));
    }

    public IMU(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC43448JHm interfaceC43448JHm, InterfaceC60442pS interfaceC60442pS, String str, HashMap hashMap, boolean z) {
        this.A05 = userSession;
        this.A08 = interfaceC60442pS;
        this.A06 = interfaceC43448JHm;
        this.A09 = hashMap;
        this.A03 = z;
        this.A00 = new C40948IBv(userSession);
        this.A07 = new C154796xU(context, abstractC018607g, userSession, str, true);
    }
}
