package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5tT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129645tT {
    public static final /* synthetic */ C129645tT A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5tU] */
    public static final C129655tU A00(final UserSession userSession, final C1M6 c1m6) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c1m6, 2);
        return new InterfaceC129665tV(userSession, c1m6) { // from class: X.5tU
            public final C127445pN A00;
            public final InterfaceC25391Lt A01;
            public final InterfaceC115345Ji A02;
            public final boolean A03;

            /* JADX WARN: Type inference failed for: r2v1, types: [X.5Ji, java.lang.Object] */
            {
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330084679828143L);
                InterfaceC25391Lt A002 = C25361Lq.A00(userSession);
                ?? obj = new Object();
                C127445pN c127445pN = new C127445pN(userSession, c1m6);
                C14360o3.A0B(A002, 5);
                this.A03 = A06;
                this.A01 = A002;
                this.A02 = obj;
                this.A00 = c127445pN;
            }

            @Override // X.InterfaceC129665tV
            public final HashMap AUb(String str) {
                InterfaceC25391Lt interfaceC25391Lt = this.A01;
                List EMt = interfaceC25391Lt.EMt(this.A02);
                if (!this.A03) {
                    interfaceC25391Lt.EGJ(EMt);
                }
                return this.A00.A00(str, EMt);
            }
        };
    }
}
