package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;

/* renamed from: X.DpX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31311DpX extends AbstractC46524KiP {
    public InterfaceC50428MOi A00;
    public KwF A01;
    public C2EC A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C163947Vi A05;
    public final AnonymousClass996 A07;
    public final C31310DpW A08;
    public final C23031Ai A09;
    public final C9HY A06 = new C9HY(this);
    public final InterfaceC50487MQp A0A = new C31307DpT(this);

    public static void A00(C31311DpX c31311DpX) {
        InterfaceC50429MOj interfaceC50429MOj = ((AbstractC46524KiP) c31311DpX).A00;
        if (interfaceC50429MOj != null) {
            interfaceC50429MOj.onDismiss();
        }
        C2EC c2ec = c31311DpX.A02;
        if (c2ec != null) {
            AnonymousClass996 anonymousClass996 = c31311DpX.A07;
            String C7I = c2ec.C7I();
            if (!TextUtils.isEmpty(C7I)) {
                anonymousClass996.A03.remove(C7I);
            }
        }
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(c31311DpX.A09);
        A0w.E77("unsend_warning_banner_dismissed", true);
        A0w.apply();
    }

    @Override // X.AbstractC46524KiP
    public final void A02() {
        C2EC c2ec = this.A02;
        if (c2ec != null) {
            AnonymousClass996 anonymousClass996 = this.A07;
            String C7I = c2ec.C7I();
            if (!TextUtils.isEmpty(C7I)) {
                anonymousClass996.A03.remove(C7I);
            }
        }
    }

    @Override // X.AbstractC46524KiP
    public final void A03() {
        C2EC c2ec = this.A02;
        if (c2ec != null) {
            InterfaceC50428MOi interfaceC50428MOi = this.A00;
            if (A08(c2ec) && interfaceC50428MOi != null) {
                interfaceC50428MOi.EJ0(this);
            }
            AnonymousClass996 anonymousClass996 = this.A07;
            String C7I = c2ec.C7I();
            C9HY c9hy = this.A06;
            if (!TextUtils.isEmpty(C7I)) {
                anonymousClass996.A03.put(C7I, c9hy);
            }
        }
    }

    @Override // X.AbstractC46524KiP
    public final void A04(boolean z) {
        C2EC c2ec = this.A02;
        if (c2ec != null) {
            KwF kwF = this.A01;
            if (kwF != null) {
                if (!kwF.A00.isShown() && A08(this.A02)) {
                    this.A01.A00.setVisibility(0);
                    C31310DpW c31310DpW = this.A08;
                    C2EC c2ec2 = this.A02;
                    c2ec2.getClass();
                    C31310DpW.A00(c31310DpW, c2ec2, "show");
                    InterfaceC19630xq interfaceC19630xq = this.A09.A01;
                    AbstractC167007dF.A18(interfaceC19630xq, "unsend_warning_banner_shown_count", interfaceC19630xq.getInt("unsend_warning_banner_shown_count", 0) + 1);
                    AbstractC22715A0l.A00(this.A04);
                } else {
                    this.A01.A00.setVisibility(8);
                }
            }
            AnonymousClass996 anonymousClass996 = this.A07;
            String C7I = c2ec.C7I();
            C9HY c9hy = this.A06;
            if (!TextUtils.isEmpty(C7I)) {
                anonymousClass996.A03.put(C7I, c9hy);
            }
        }
    }

    @Override // X.AbstractC46524KiP
    public final boolean A05() {
        KwF kwF = this.A01;
        if (kwF != null && kwF.A00.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 == false) goto L6;
     */
    @Override // X.AbstractC46524KiP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A06(android.content.Context r6) {
        /*
            r5 = this;
            X.2EC r0 = r5.A02
            if (r0 == 0) goto Lb
            boolean r1 = r0.CbK()
            r0 = 1
            if (r1 != 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            X.MQp r4 = r5.A0A
            if (r0 == 0) goto L2d
            r0 = 2131960794(0x7f1323da, float:1.9558267E38)
            java.lang.String r3 = r6.getString(r0)
            r0 = 2131960793(0x7f1323d9, float:1.9558265E38)
        L1a:
            java.lang.String r2 = r6.getString(r0)
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r6)
            X.KwF r0 = new X.KwF
            r0.<init>(r1, r4, r3, r2)
            r5.A01 = r0
            android.view.ViewStub r0 = r0.A00
            return r0
        L2d:
            r0 = 2131960802(0x7f1323e2, float:1.9558283E38)
            java.lang.String r3 = r6.getString(r0)
            r0 = 2131960801(0x7f1323e1, float:1.955828E38)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31311DpX.A06(android.content.Context):android.view.View");
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        if (c2ec != null && A08(c2ec)) {
            this.A00 = interfaceC50428MOi;
            this.A02 = c2ec;
            interfaceC37159GYw.Dpu(this);
            return;
        }
        interfaceC37159GYw.onFailure();
    }

    public final boolean A08(C2EC c2ec) {
        if (C18U.A06(C06090Tz.A05, this.A04, 36310430909464681L)) {
            InterfaceC19630xq interfaceC19630xq = this.A09.A01;
            if (!interfaceC19630xq.getBoolean("unsend_warning_banner_dismissed", false) && interfaceC19630xq.getInt("unsend_warning_banner_shown_count", 0) < 2) {
                c2ec.getClass();
                String C7I = c2ec.C7I();
                if (C7I != null && AbstractC31174DnI.A1X(interfaceC19630xq, AbstractC111324zv.A00(1357), C7I)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C31311DpX(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C163947Vi c163947Vi) {
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A09 = AbstractC23021Ah.A00(userSession);
        this.A07 = (AnonymousClass996) userSession.A01(AnonymousClass996.class, new AnonymousClass997(userSession));
        this.A08 = new C31310DpW(interfaceC11380iw, userSession);
        this.A05 = c163947Vi;
    }
}
