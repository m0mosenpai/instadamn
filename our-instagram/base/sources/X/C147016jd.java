package X;

import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.Arrays;

/* renamed from: X.6jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147016jd extends AbstractC60592pi implements InterfaceC62892tS, InterfaceC147026je, InterfaceC146776jF {
    public InterfaceC147026je A00;
    public final UserSession A01;
    public final C147036jf A02;
    public final InterfaceC60442pS A03;
    public final C3A9 A04;
    public final C3G2 A05;
    public final C145826hf A06;
    public final InterfaceC114805Gn A07;
    public final String A08;
    public final boolean A09;
    public final Fragment A0A;
    public final ReelViewerFragment A0B;

    public C147016jd(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C145826hf c145826hf, InterfaceC114805Gn interfaceC114805Gn, ReelViewerFragment reelViewerFragment, String str) {
        C3A9 c3a9;
        C14360o3.A0B(interfaceC114805Gn, 3);
        C14360o3.A0B(c145826hf, 4);
        C14360o3.A0B(userSession, 5);
        C14360o3.A0B(c3g2, 6);
        this.A0A = fragment;
        this.A0B = reelViewerFragment;
        this.A07 = interfaceC114805Gn;
        this.A06 = c145826hf;
        this.A01 = userSession;
        this.A05 = c3g2;
        this.A03 = interfaceC60442pS;
        this.A08 = str;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 2342154994902041435L);
        this.A09 = A06;
        if (A06) {
            c3a9 = null;
        } else {
            c3a9 = new C3A9(new C42598ItH(userSession, interfaceC114805Gn), new C42599ItI(fragment, reelViewerFragment), Arrays.asList(new HLP(userSession, this, interfaceC114805Gn)));
        }
        this.A04 = c3a9;
        this.A02 = new C147036jf(interfaceC11380iw, userSession);
    }

    @Override // X.InterfaceC146776jF
    public final void DNe(InterfaceC43071ya interfaceC43071ya, C41181vS c41181vS, C149716oO c149716oO) {
        C14360o3.A0B(c41181vS, 1);
        A00(c41181vS);
    }

    @Override // X.InterfaceC147026je
    public final void DNf(C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 0);
        if (!this.A09) {
            A00(c41181vS);
        }
    }

    @Override // X.InterfaceC146776jF
    public final void DNw(InterfaceC43071ya interfaceC43071ya, C41181vS c41181vS, C149716oO c149716oO) {
        User user;
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c149716oO, 2);
        int i = c149716oO.A02.A0I;
        C41551w4 c41551w4 = c149716oO.A00;
        C141596ac C00 = ((C146226iL) this.A07).A0C.C00(c41181vS);
        if (c41181vS.A0e == EnumC41231vY.A05) {
            InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(this.A01).A01;
            int i2 = interfaceC19630xq.getInt("empty_story_state_impression_count", 0) + 1;
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7D("empty_story_state_impression_count", i2);
            ARD.apply();
            this.A02.A01(false, Integer.valueOf(i), EnumC33444EqG.A08.toString());
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        C00.A0P = uptimeMillis;
        if (C00.A0O < 0) {
            C00.A0O = uptimeMillis;
        }
        if (C00.A0N < 0 || uptimeMillis == -1) {
            C00.A0N = uptimeMillis;
        }
        C38321qM c38321qM = c41181vS.A0b;
        C105824pt c105824pt = c41181vS.A0c;
        if (c38321qM != null && c38321qM.A5n()) {
            C145826hf c145826hf = this.A06;
            InterfaceC60442pS interfaceC60442pS = this.A03;
            C14360o3.A0B(interfaceC60442pS, 1);
            AbstractC41647Ibf.A02(c38321qM, interfaceC60442pS, c145826hf.A06, C05F.A0C);
        } else if (c105824pt != null) {
            c105824pt.A03();
            if (!C17060sy.A01.A01(this.A01).equals(c105824pt.A03()) && c105824pt.A08()) {
                C145826hf c145826hf2 = this.A06;
                InterfaceC60442pS interfaceC60442pS2 = this.A03;
                C14360o3.A0B(interfaceC60442pS2, 1);
                AbstractC41647Ibf.A02(c105824pt, interfaceC60442pS2, c145826hf2.A06, C05F.A0N);
            }
        }
        if (this.A09) {
            this.A06.A0I(c41551w4, C00, i);
            C37947Gmp.A00.A03(this.A01, c41181vS, this.A05);
        }
        UserSession userSession = this.A01;
        boolean z = false;
        C14360o3.A0B(userSession, 0);
        C56131Ovr c56131Ovr = (C56131Ovr) userSession.A01(C56131Ovr.class, new C57557PgV(userSession, 16));
        C3G2 c3g2 = this.A05;
        String str = this.A08;
        C14360o3.A0B(c3g2, 0);
        boolean z2 = false;
        if (c3g2 == C3G2.A1L || (c3g2 == C3G2.A1c && "story_daily_digest".equals(str))) {
            z = true;
        }
        if (!c41181vS.CdW() && !c41181vS.A1Q() && (((user = c41181vS.A0i) == null || !user.equals(C17060sy.A01.A01(c56131Ovr.A01))) && !c41181vS.A0R && c41181vS.CY4())) {
            z2 = true;
        }
        if (z && z2) {
            c56131Ovr.A00 = System.currentTimeMillis();
        }
        InterfaceC147026je interfaceC147026je = this.A00;
        if (interfaceC147026je != null) {
            interfaceC147026je.DNx(c41181vS, i);
        }
    }

    @Override // X.InterfaceC147026je
    public final void DNx(C41181vS c41181vS, int i) {
        C14360o3.A0B(c41181vS, 0);
        if (!this.A09) {
            InterfaceC114805Gn interfaceC114805Gn = this.A07;
            C41551w4 Blt = interfaceC114805Gn.Blt(i);
            C141596ac C00 = ((C146226iL) interfaceC114805Gn).A0C.C00(c41181vS);
            if (Blt != null) {
                this.A06.A0I(Blt, C00, i);
                C37947Gmp.A00.A03(this.A01, c41181vS, this.A05);
            }
        }
    }

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r0.A00 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (r2.isResumed() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
    
        if (r9 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        if (r7 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        if (X.C3YS.A00(r4).A05(r1) == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.C41181vS r13) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147016jd.A00(X.1vS):void");
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        Integer num;
        if (i < i2) {
            num = C05F.A0N;
        } else {
            num = C05F.A0C;
        }
        InterfaceC114805Gn interfaceC114805Gn = this.A07;
        C41551w4 Blt = interfaceC114805Gn.Blt(i2);
        if (Blt != null) {
            C41181vS A08 = Blt.A08(this.A01);
            if (interfaceC114805Gn.C00(A08).A0W == C05F.A15) {
                C141596ac C00 = interfaceC114805Gn.C00(A08);
                C00.A0W = num;
                if (num == C05F.A0C || num == C05F.A0N) {
                    C00.A0q = true;
                }
            }
        }
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
        C3A9 c3a9 = this.A04;
        if (c3a9 != null) {
            c3a9.A01();
        }
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
        if (i2 > i && i >= 0) {
            InterfaceC114805Gn interfaceC114805Gn = this.A07;
            if (i < ((C146226iL) interfaceC114805Gn).A0C.A00() && interfaceC114805Gn.getItem(i) != null) {
                C41551w4 c41551w4 = (C41551w4) interfaceC114805Gn.getItem(i);
                C14360o3.A0A(c41551w4);
                Reel reel = c41551w4.A0H;
                UserSession userSession = this.A01;
                if (!reel.A16(userSession)) {
                    if (reel.A1P) {
                        this.A06.A0C.A06.put("nux_story", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                    } else {
                        int size = reel.A0O(userSession).size();
                        for (int A03 = reel.A03(userSession); A03 < size; A03++) {
                            C41181vS A0A = reel.A0A(userSession, A03);
                            C14360o3.A07(A0A);
                            if (A0A.CY4() && A0A.A0b != null) {
                                C64022vN c64022vN = this.A06.A0C;
                                String id = reel.getId();
                                C38321qM c38321qM = A0A.A0b;
                                C14360o3.A0A(c38321qM);
                                String id2 = c38321qM.getId();
                                C64022vN.A02(c38321qM.A2E(userSession), id, id2, c64022vN.A05, c38321qM.A1B());
                            }
                        }
                    }
                    if (this.A05 == C3G2.A1L) {
                        if (!C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(userSession).A00, 36317491839898880L)) {
                            reel.A1V = true;
                            System.currentTimeMillis();
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C3A9 c3a9 = this.A04;
        if (c3a9 != null) {
            c3a9.A01();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C3A9 c3a9 = this.A04;
        if (c3a9 != null) {
            c3a9.A01();
        }
    }
}
