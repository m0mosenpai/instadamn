package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3hD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79623hD implements InterfaceC79643hF {
    public C3u8 A00;
    public UserSession A01;
    public InterfaceC60442pS A02;
    public final C38321qM A03;
    public final String A04;
    public final java.util.Set A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C79623hD(C3u8 c3u8, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        this(c3u8, userSession, c38321qM, interfaceC60442pS, null, C16910sj.A00);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC60442pS, 3);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.4Hy, java.lang.Object] */
    @Override // X.InterfaceC79643hF
    public final C93574Hy AWp() {
        C38321qM c38321qM = this.A03;
        if (c38321qM == null) {
            return null;
        }
        InterfaceC60442pS interfaceC60442pS = this.A02;
        boolean CdW = c38321qM.CdW();
        String str = this.A04;
        java.util.Set set = this.A05;
        C3u8 c3u8 = this.A00;
        ?? obj = new Object();
        obj.A01 = c38321qM;
        obj.A02 = interfaceC60442pS;
        obj.A06 = CdW;
        obj.A04 = str;
        obj.A05 = set;
        obj.A00 = c3u8;
        return obj;
    }

    @Override // X.InterfaceC79643hF
    public final String AWz() {
        C38321qM c38321qM = this.A03;
        if (c38321qM == null) {
            return null;
        }
        return AbstractC123955j9.A01(this.A01, c38321qM);
    }

    @Override // X.InterfaceC79643hF
    public final C5H3 AX0() {
        C38321qM c38321qM = this.A03;
        if (c38321qM == null) {
            return null;
        }
        return new C123965jA(this.A01, c38321qM);
    }

    @Override // X.InterfaceC79643hF
    public final C5H2 AX1() {
        if (this.A03 == null) {
            return null;
        }
        return new C5H2(this) { // from class: X.5j8
            public final String A00;
            public final String A01;
            public final String A02;
            public final boolean A03;

            @Override // X.C5H2
            public final String AZE() {
                return this.A00;
            }

            @Override // X.C5H2
            public final String CAP() {
                return this.A01;
            }

            @Override // X.C5H2
            public final String CAR() {
                return this.A02;
            }

            @Override // X.C5H2
            public final boolean CdW() {
                return this.A03;
            }

            {
                String organicTrackingToken;
                C38321qM c38321qM = this.A03;
                UserSession userSession = this.A01;
                this.A01 = AbstractC123955j9.A01(userSession, c38321qM);
                this.A03 = c38321qM.CdW();
                this.A00 = AbstractC41071vF.A07(userSession, c38321qM);
                if (c38321qM.CdW()) {
                    organicTrackingToken = AbstractC41071vF.A0F(userSession, c38321qM);
                } else {
                    organicTrackingToken = c38321qM.A0C.getOrganicTrackingToken();
                }
                this.A02 = organicTrackingToken;
            }
        };
    }

    public C79623hD(C3u8 c3u8, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, java.util.Set set) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC60442pS, 3);
        this.A03 = c38321qM;
        this.A01 = userSession;
        this.A00 = c3u8;
        this.A04 = str;
        this.A05 = set;
        this.A02 = AbstractC60952qJ.A00(interfaceC60442pS);
        if (c38321qM == null) {
            C0w9.A04("ig_automated_logging", "null media for IGAutomatedLoggingDefaultTrackingDataGenerator", Boolean.valueOf(C18U.A06(C06090Tz.A06, this.A01, 36312861864101187L)).booleanValue() ? 1 : 1000);
        }
    }
}
