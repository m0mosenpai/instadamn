package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5rC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128435rC {
    public static final /* synthetic */ C128435rC A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5rD] */
    public static final C128445rD A00(final UserSession userSession, final C1M6 c1m6, final InterfaceC115345Ji interfaceC115345Ji) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c1m6, 2);
        return new InterfaceC128455rE(userSession, c1m6, interfaceC115345Ji) { // from class: X.5rD
            public final C1M6 A00;
            public final InterfaceC25391Lt A01;
            public final InterfaceC115345Ji A02;
            public final C127745py A03;
            public final boolean A04;

            {
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330084679828143L);
                InterfaceC25391Lt A002 = C25361Lq.A00(userSession);
                C127745py c127745py = new C127745py(userSession, c1m6);
                C14360o3.A0B(A002, 5);
                this.A02 = interfaceC115345Ji;
                this.A00 = c1m6;
                this.A04 = A06;
                this.A01 = A002;
                this.A03 = c127745py;
            }

            @Override // X.InterfaceC128455rE
            public final HashMap AUi(String str) {
                InterfaceC25391Lt interfaceC25391Lt = this.A01;
                List EMt = interfaceC25391Lt.EMt(this.A02);
                if (!this.A04) {
                    interfaceC25391Lt.EGJ(EMt);
                }
                return this.A03.A00(str, EMt);
            }
        };
    }
}
