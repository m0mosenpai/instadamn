package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5Jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115355Jj {
    public static final /* synthetic */ C115355Jj A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5Jk] */
    public static final C115365Jk A00(final UserSession userSession, final C1M6 c1m6, final InterfaceC115345Ji interfaceC115345Ji) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c1m6, 2);
        return new InterfaceC115375Jl(userSession, c1m6, interfaceC115345Ji) { // from class: X.5Jk
            public final C115385Jm A00;
            public final C1M6 A01;
            public final InterfaceC25391Lt A02;
            public final InterfaceC115345Ji A03;
            public final boolean A04;

            {
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330084679828143L);
                InterfaceC25391Lt A002 = C25361Lq.A00(userSession);
                C115385Jm c115385Jm = new C115385Jm(userSession, c1m6);
                C14360o3.A0B(A002, 5);
                this.A03 = interfaceC115345Ji;
                this.A01 = c1m6;
                this.A04 = A06;
                this.A02 = A002;
                this.A00 = c115385Jm;
            }

            @Override // X.InterfaceC115375Jl
            public final HashMap AUb(String str) {
                InterfaceC25391Lt interfaceC25391Lt = this.A02;
                List EMt = interfaceC25391Lt.EMt(this.A03);
                if (!this.A04) {
                    interfaceC25391Lt.EGJ(EMt);
                }
                return this.A00.A00(str, EMt);
            }
        };
    }
}
