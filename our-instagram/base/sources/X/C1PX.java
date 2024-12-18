package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.1PX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PX extends C1PY {
    public final /* synthetic */ UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1PX(UserSession userSession, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(i, i2, z, z2, z3, z4);
        this.A00 = userSession;
    }

    @Override // X.C1PY
    public final /* bridge */ /* synthetic */ InterfaceC42381xS A02(final Integer num, Object obj, final int i) {
        final C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(num, 2);
        final Integer num2 = C05F.A00;
        final UserSession userSession = this.A00;
        return new InterfaceC42381xS(userSession, c41551w4, num, num2, i) { // from class: X.1xR
            public final C41551w4 A00;
            public final int A01;
            public final UserSession A02;
            public final Integer A03;
            public final Integer A04;

            @Override // X.InterfaceC42381xS
            public final /* synthetic */ boolean Boz() {
                return false;
            }

            @Override // X.InterfaceC42381xS
            public final long Ask() {
                long j = this.A00.A0F;
                if (j != 0) {
                    return j;
                }
                throw new IllegalStateException("Creation time has not been configured correctly for this ReelViewModel");
            }

            @Override // X.InterfaceC42381xS
            public final long B3I() {
                Long l = this.A00.A0H.A0j;
                if (l != null) {
                    return l.longValue();
                }
                return Long.MIN_VALUE;
            }

            @Override // X.InterfaceC42381xS
            public final int BA4() {
                Integer num3;
                Reel reel = this.A00.A0H;
                UserSession userSession2 = this.A02;
                synchronized (reel.A1n) {
                    if ((!C18U.A06(C06090Tz.A05, userSession2, 36313450271868945L)) && !reel.A0v.isEmpty()) {
                        num3 = ((C40971v4) reel.A0v.get(0)).A0P;
                    } else if (!reel.A15.isEmpty()) {
                        num3 = AbstractC41071vF.A05(userSession2, (C38321qM) reel.A15.get(0));
                    } else {
                        num3 = -1;
                        return num3.intValue();
                    }
                    if (num3 == null) {
                        return -1;
                    }
                    return num3.intValue();
                }
            }

            @Override // X.InterfaceC42381xS
            public final /* bridge */ /* synthetic */ Object BUM() {
                return this.A00;
            }

            @Override // X.InterfaceC42381xS
            public final Integer BeP() {
                return this.A03;
            }

            @Override // X.InterfaceC42381xS
            public final String Bo9() {
                String str = this.A00.A0I;
                if (str == null) {
                    return "-1";
                }
                return str;
            }

            @Override // X.InterfaceC42381xS
            public final int BoB() {
                return this.A01;
            }

            @Override // X.InterfaceC42381xS
            public final String BoF() {
                String str = this.A00.A0J;
                if (str == null) {
                    return "-1";
                }
                return str;
            }

            @Override // X.InterfaceC42381xS
            public final Integer Byg() {
                return this.A04;
            }

            @Override // X.InterfaceC42381xS
            public final boolean CVy() {
                return this.A00.A09;
            }

            @Override // X.InterfaceC42381xS
            public final /* synthetic */ void Ecr(boolean z) {
                throw new UnsupportedOperationException("Not supported");
            }

            {
                this.A00 = c41551w4;
                this.A01 = i;
                this.A04 = num;
                this.A03 = num2;
                c41551w4.A03 = num;
                this.A02 = userSession;
            }
        };
    }

    @Override // X.C1PY
    public final boolean A08() {
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321426027062700L)) {
            return C1PH.A00(userSession).A08();
        }
        if (C18U.A06(c06090Tz, userSession, 36321426026866089L)) {
            boolean z = C23051Ak.A05;
            return C23061Al.A00(userSession).A00(EnumC23071Am.A0e);
        }
        return false;
    }
}
