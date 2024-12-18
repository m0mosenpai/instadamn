package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class BKZ extends AbstractC37623GhI implements JIH, C38Y, InterfaceC80063hv, InterfaceC31029DkS {
    public C45124Jxt A00;
    public boolean A01;
    public final Context A02;
    public final Fragment A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C37560GgG A07;
    public final java.util.Set A08 = new LinkedHashSet();
    public final Handler A03 = AbstractC167007dF.A0J();

    private final void A01(boolean z) {
        C38321qM c38321qM;
        C86013sY c86013sY;
        Object obj;
        boolean z2;
        C120985dq A09;
        boolean z3 = z;
        C25370BKn A0F = this.A07.A0F();
        C37556GgC c37556GgC = super.A02;
        C45124Jxt c45124Jxt = null;
        if (c37556GgC != null && (A09 = c37556GgC.A09(c37556GgC.A03())) != null) {
            c38321qM = A09.A02;
        } else {
            c38321qM = null;
        }
        if (A0F != null) {
            c86013sY = A0F.A0C;
        } else {
            c86013sY = null;
        }
        C45124Jxt c45124Jxt2 = this.A00;
        if (c45124Jxt2 != null) {
            obj = c45124Jxt2.A03;
        } else {
            obj = null;
        }
        if (!C14360o3.A0K(c38321qM, obj) && c86013sY != null) {
            AbstractC86533tR.A00(c86013sY);
        }
        if (A0F != null && c86013sY != null && c38321qM != null) {
            C45124Jxt c45124Jxt3 = this.A00;
            if (c45124Jxt3 != null) {
                z3 = c45124Jxt3.A01;
            }
            if (c45124Jxt3 != null) {
                z2 = c45124Jxt3.A00;
            } else {
                z2 = false;
            }
            c45124Jxt = new C45124Jxt(c86013sY, c38321qM, A0F, z3, z2);
        }
        this.A00 = c45124Jxt;
        if (c86013sY != null) {
            c86013sY.A01 = this;
        }
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
        C86013sY c86013sY;
        Object obj;
        boolean z;
        C45124Jxt c45124Jxt;
        C86013sY c86013sY2;
        C38321qM c38321qM;
        boolean A1R = AbstractC167007dF.A1R(0, c120985dq, list);
        if (this.A00 == null) {
            UserSession userSession = this.A06;
            C14360o3.A0B(userSession, 0);
            A01(AbstractC75373a4.A06(userSession));
        }
        C45124Jxt c45124Jxt2 = this.A00;
        String str = null;
        if (c45124Jxt2 != null && (c86013sY = (C86013sY) c45124Jxt2.A04) != null && c86013sY.A03.A01() != null) {
            C45124Jxt c45124Jxt3 = this.A00;
            if (c45124Jxt3 != null) {
                obj = c45124Jxt3.A03;
            } else {
                obj = null;
            }
            if (!C14360o3.A0K(obj, c120985dq.A02)) {
                C0f5 AEp = C18950wb.A01.AEp("ClipsVideoSubtitlesCuingMismatch", 817902720);
                AEp.ABW(DialogModule.KEY_MESSAGE, "Cue caught for wrong media id in NON-Litho impl");
                AEp.report();
                return;
            }
            C4S7 Av4 = this.A07.Av4();
            if (Av4 == null) {
                return;
            }
            C45124Jxt c45124Jxt4 = this.A00;
            if (c45124Jxt4 != null && (c38321qM = (C38321qM) c45124Jxt4.A03) != null) {
                UserSession userSession2 = this.A06;
                Boolean valueOf = Boolean.valueOf(Av4.A00);
                boolean CdW = c38321qM.CdW();
                boolean Cff = c38321qM.Cff();
                boolean A5A = c38321qM.A5A();
                boolean A4T = c38321qM.A4T();
                List CAf = c38321qM.A0C.CAf();
                C75363a3 CFR = c38321qM.CFR();
                User A14 = AbstractC25226BEj.A14(c38321qM);
                if (A14 != null) {
                    str = A14.getId();
                }
                if (AbstractC75343a1.A09(userSession2, CFR, valueOf, str, AbstractC25226BEj.A1F(c38321qM), CAf, false, CdW, Cff, A5A, A4T) == A1R) {
                    z = true;
                    C45124Jxt c45124Jxt5 = this.A00;
                    if (c45124Jxt5 != null) {
                        c45124Jxt5.A00 = false;
                    }
                    if (!this.A01 && AbstractC166987dD.A1b(list)) {
                        list.add(0, AnonymousClass001.A0E(this.A02.getString(2131954803), '[', ']'));
                        this.A01 = A1R;
                    }
                    c45124Jxt = this.A00;
                    if (c45124Jxt != null || (c86013sY2 = (C86013sY) c45124Jxt.A04) == null) {
                    }
                    AbstractC86533tR.A02(c86013sY2, list, z);
                    return;
                }
            }
            z = false;
            c45124Jxt = this.A00;
            if (c45124Jxt != null) {
            }
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        this.A01 = false;
        UserSession userSession = this.A06;
        C14360o3.A0B(userSession, 0);
        A01(AbstractC75373a4.A06(userSession));
        C45124Jxt c45124Jxt = this.A00;
        if (c45124Jxt != null) {
            c45124Jxt.A00 = false;
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    @Override // X.InterfaceC31029DkS
    public final void EFZ(BO6 bo6) {
        C14360o3.A0B(bo6, 0);
        this.A08.remove(bo6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
    
        if (X.AbstractC75373a4.A0D(r7) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C45124Jxt r13, X.C51757Mtg r14, X.BKZ r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKZ.A00(X.Jxt, X.Mtg, X.BKZ, boolean):void");
    }

    @Override // X.AbstractC37623GhI
    public final void A09() {
        C37556GgC c37556GgC = super.A02;
        if (c37556GgC != null) {
            c37556GgC.A0H(this);
        }
        this.A00 = null;
    }

    @Override // X.AbstractC37623GhI
    public final void A0A() {
        this.A07.A99(this);
        C37556GgC c37556GgC = super.A02;
        if (c37556GgC != null) {
            c37556GgC.A0G(this);
        }
    }

    public final void A0B(boolean z) {
        String str;
        C45124Jxt c45124Jxt = this.A00;
        if (c45124Jxt != null && c45124Jxt.A01 != z) {
            c45124Jxt.A01 = z;
            if (!c45124Jxt.A00) {
                C37560GgG c37560GgG = this.A07;
                if (z) {
                    str = AbstractC75373a4.A00(this.A06, AbstractC25226BEj.A1F((C38321qM) c45124Jxt.A03));
                } else {
                    str = null;
                }
                c37560GgG.A0Z(true, str);
            }
        }
    }

    @Override // X.InterfaceC31029DkS
    public final void A98(BO6 bo6) {
        this.A08.add(bo6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (X.AbstractC75373a4.A0D(r5) != false) goto L24;
     */
    @Override // X.InterfaceC80063hv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSK(X.C51757Mtg r18) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKZ.DSK(X.Mtg):void");
    }

    @Override // X.C38Y
    public final void DXR(int i) {
        C45124Jxt c45124Jxt;
        C86013sY c86013sY;
        if (C18U.A06(C06090Tz.A05, this.A06, 36318200505505807L) && (c45124Jxt = this.A00) != null && (c86013sY = (C86013sY) c45124Jxt.A04) != null) {
            AbstractC86533tR.A00(c86013sY);
        }
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        C45124Jxt c45124Jxt;
        C38321qM c38321qM;
        C45124Jxt c45124Jxt2;
        C86013sY c86013sY;
        if (C18U.A06(C06090Tz.A05, this.A06, 36318200505571344L) && (c45124Jxt = this.A00) != null && (c38321qM = (C38321qM) c45124Jxt.A03) != null && !c38321qM.A5A() && (c45124Jxt2 = this.A00) != null && (c86013sY = (C86013sY) c45124Jxt2.A04) != null) {
            AbstractC86533tR.A00(c86013sY);
        }
    }

    public BKZ(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C37560GgG c37560GgG) {
        this.A02 = context;
        this.A04 = fragment;
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A07 = c37560GgG;
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }
}
