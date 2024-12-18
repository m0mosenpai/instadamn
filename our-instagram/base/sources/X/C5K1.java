package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5K1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5K1 {
    public static final /* synthetic */ C5K1 A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5K2] */
    public static final C5K2 A00(final UserSession userSession, final C1M6 c1m6, final InterfaceC115345Ji interfaceC115345Ji) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c1m6, 2);
        return new C5K3(userSession, c1m6, interfaceC115345Ji) { // from class: X.5K2
            public final C1M6 A00;
            public final C5K4 A01;
            public final InterfaceC25391Lt A02;
            public final InterfaceC115345Ji A03;
            public final boolean A04;

            {
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330084679828143L);
                InterfaceC25391Lt A002 = C25361Lq.A00(userSession);
                C5K4 c5k4 = new C5K4(userSession, c1m6);
                C14360o3.A0B(A002, 5);
                this.A03 = interfaceC115345Ji;
                this.A00 = c1m6;
                this.A04 = A06;
                this.A02 = A002;
                this.A01 = c5k4;
            }

            @Override // X.C5K3
            public final HashMap AUU(String str) {
                InterfaceC25391Lt interfaceC25391Lt = this.A02;
                List EMt = interfaceC25391Lt.EMt(this.A03);
                if (!this.A04) {
                    interfaceC25391Lt.EGJ(EMt);
                }
                return this.A01.A00(str, EMt);
            }
        };
    }
}
