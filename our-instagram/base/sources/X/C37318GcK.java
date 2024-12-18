package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GcK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37318GcK implements InterfaceC85683rx {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C37318GcK(UserSession userSession, C1M6 c1m6, int i) {
        this.A00 = i;
        this.A02 = userSession;
        this.A01 = c1m6;
    }

    @Override // X.InterfaceC85683rx
    public final Map Bbk(String str) {
        final EnumC64222vh enumC64222vh;
        final C1M6 c1m6;
        final C5KA c5ka;
        final C5KD c5kd;
        final int i;
        int i2 = this.A00;
        final UserSession userSession = (UserSession) this.A02;
        switch (i2) {
            case 0:
                enumC64222vh = EnumC64222vh.A03;
                c1m6 = (C1M6) this.A01;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c1m6, 2);
                c5ka = new C5KA(enumC64222vh);
                c5kd = null;
                i = 104;
                break;
            case 1:
                enumC64222vh = EnumC64222vh.A04;
                c1m6 = (C1M6) this.A01;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c1m6, 2);
                c5ka = new C5KA(enumC64222vh);
                c5kd = null;
                i = 104;
                break;
            case 2:
                enumC64222vh = EnumC64222vh.A05;
                c1m6 = (C1M6) this.A01;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c1m6, 2);
                c5ka = new C5KA(enumC64222vh);
                c5kd = null;
                i = 104;
                break;
            case 3:
                enumC64222vh = EnumC64222vh.A06;
                c1m6 = (C1M6) this.A01;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c1m6, 2);
                c5ka = new C5KA(enumC64222vh);
                c5kd = null;
                i = 104;
                break;
            case 4:
                enumC64222vh = EnumC64222vh.A09;
                c1m6 = (C1M6) this.A01;
                AbstractC167007dF.A1F(userSession, 0, c1m6);
                c5ka = new C5KA(enumC64222vh);
                c5kd = new C5KD(userSession, c1m6, "seen_sponsored_reels", "seen_organic_reels");
                i = 72;
                break;
            case 5:
                enumC64222vh = EnumC64222vh.A09;
                c1m6 = (C1M6) this.A01;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c1m6, 2);
                c5ka = new C5KA(enumC64222vh);
                c5kd = null;
                i = 104;
                break;
            default:
                enumC64222vh = EnumC64222vh.A08;
                c1m6 = (C1M6) this.A01;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c1m6, 2);
                c5ka = new C5KA(enumC64222vh);
                c5kd = null;
                i = 104;
                break;
        }
        return new C5KC(userSession, c1m6, c5kd, c5ka, enumC64222vh, i) { // from class: X.5KB
            public final C1M6 A00;
            public final C5KF A01;
            public final C5KD A02;
            public final InterfaceC115345Ji A03;
            public final EnumC64222vh A04;
            public final InterfaceC09390do A05;
            public final boolean A06;

            {
                boolean z;
                C5KF c5kf = null;
                if ((i & 8) != 0) {
                    z = C18U.A06(C06090Tz.A05, userSession, 36330084679828143L);
                } else {
                    z = false;
                }
                r8 = (i & 16) != 0 ? new C5KA(enumC64222vh) : c5ka;
                r7 = (i & 32) != 0 ? new C5KD(userSession, c1m6, "ad_and_netego_realtime_information", "organic_realtime_information") : c5kd;
                if ((i & 64) != 0) {
                    if ((enumC64222vh == EnumC64222vh.A09 && C18U.A06(C06090Tz.A05, userSession, 36313527580952663L)) || (enumC64222vh == EnumC64222vh.A04 && C18U.A06(C06090Tz.A05, userSession, 36313527581018200L))) {
                        c5kf = new C42986Izc(userSession);
                    } else {
                        c5kf = new C5KF() { // from class: X.5KE
                            @Override // X.C5KF
                            public final void DFH(EnumC64222vh enumC64222vh2, Map map) {
                            }
                        };
                    }
                }
                C14360o3.A0B(r7, 6);
                C14360o3.A0B(c5kf, 7);
                this.A04 = enumC64222vh;
                this.A00 = c1m6;
                this.A06 = z;
                this.A03 = r8;
                this.A02 = r7;
                this.A01 = c5kf;
                this.A05 = AbstractC09440dt.A01(new C206839Do(userSession, 14));
                if (!C18U.A06(C06090Tz.A05, userSession, 36317650750150087L)) {
                    this.A05.getValue().hashCode();
                }
            }

            @Override // X.C5KC
            public final HashMap AUZ(String str2) {
                InterfaceC09390do interfaceC09390do = this.A05;
                List EMt = ((InterfaceC25391Lt) interfaceC09390do.getValue()).EMt(this.A03);
                if (!this.A06) {
                    ((InterfaceC25391Lt) interfaceC09390do.getValue()).EGJ(EMt);
                }
                HashMap A02 = this.A02.A02(str2, EMt);
                this.A01.DFH(this.A04, A02);
                return A02;
            }
        }.AUZ(str);
    }
}
