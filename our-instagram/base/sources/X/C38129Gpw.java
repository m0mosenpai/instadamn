package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gpw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38129Gpw extends AbstractC64162vb {
    public final UserSession A00;
    public final C38082GpB A01;
    public final InterfaceC60442pS A02;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        String str;
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
        C38162GqT c38162GqT = (C38162GqT) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, abstractC127945qN, c38162GqT);
        if (abstractC127945qN instanceof C37931GmT) {
            C38082GpB c38082GpB = this.A01;
            if (c38082GpB != null) {
                c38082GpB.A03(((C37931GmT) abstractC127945qN).BQN(), this.A02.getModuleName());
            }
            C38208GrD c38208GrD = new C38208GrD(this.A00, (C37931GmT) abstractC127945qN);
            InterfaceC60442pS interfaceC60442pS = this.A02;
            C127915qK c127915qK = c38162GqT.A01;
            UserSession userSession = c38208GrD.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36315881225260723L)) {
                C37931GmT c37931GmT = c38208GrD.A01;
                C38321qM BQN = c37931GmT.BQN();
                C82713mZ A02 = AbstractC82703mY.A02(userSession, BQN, interfaceC60442pS, null, 0, -1, "impression");
                if (A02 != null) {
                    A02.A09(0);
                    AbstractC37302Gc3.A1R(A02);
                    A02.A08 = c37931GmT.A00.getPosition();
                    A02.A8J = AbstractC41071vF.A0R(userSession, BQN);
                    int i = c127915qK.A02;
                    if (i == A1R) {
                        int i2 = c127915qK.A04;
                        if (i2 == 2) {
                            str = "one_by_two";
                        } else {
                            if (i2 == A1R) {
                                str = "one_by_one";
                            }
                            str = "other";
                        }
                    } else {
                        if (i == 2 && c127915qK.A04 == 2) {
                            str = "two_by_two";
                        }
                        str = "other";
                    }
                    A02.A5V = str;
                    C32U.A0A(userSession, A02, BQN);
                    C32U.A0D(userSession, A02, BQN, "impression");
                    C32U.A0E(userSession, A02, BQN, interfaceC60442pS, 0);
                    return;
                }
                return;
            }
            c38208GrD.A00(interfaceC60442pS, "impression");
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
        AbstractC167017dG.A1N(abstractC127945qN, obj2);
        if (abstractC127945qN instanceof C37931GmT) {
            C38082GpB c38082GpB = this.A01;
            if (c38082GpB != null) {
                c38082GpB.A03(((C37931GmT) abstractC127945qN).BQN(), this.A02.getModuleName());
            }
            new C38208GrD(this.A00, (C37931GmT) abstractC127945qN).A00(this.A02, "sub_impression");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38129Gpw(com.instagram.common.session.UserSession r3, X.C38082GpB r4, X.InterfaceC60442pS r5) {
        /*
            r2 = this;
            X.2tB r0 = X.AbstractC62712tA.A00(r3)
            X.2tC r0 = r0.A00
            X.1BX r1 = r0.A01
            X.C14360o3.A07(r1)
            X.Gpx r0 = new X.Gpx
            r0.<init>(r3)
            r2.<init>(r1, r0)
            r2.A00 = r3
            r2.A02 = r5
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38129Gpw.<init>(com.instagram.common.session.UserSession, X.GpB, X.2pS):void");
    }
}
