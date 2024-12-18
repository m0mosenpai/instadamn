package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.7Xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164547Xt implements InterfaceC163977Vl {
    public final AbstractC59962oe A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final C164537Xs A04;
    public final C7XS A05;
    public final InterfaceC60442pS A06;
    public final int A07;
    public final String A08;
    public final InterfaceC08830cm A09;
    public final boolean A0A;

    @Override // X.InterfaceC163977Vl
    public final void D9g(C3o9 c3o9, Integer num, boolean z, boolean z2) {
        AbstractC31602DuU kWi;
        C14360o3.A0B(num, 3);
        InterfaceC163837Ux C7r = A00(this).C7r();
        AbstractC59962oe abstractC59962oe = this.A00;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = this.A03;
        if (!AbstractC34133F4j.A00(abstractC59962oe.requireActivity(), requireContext, abstractC59962oe, userSession, C7r)) {
            if (A00(this).C7r().CeQ()) {
                if (A00(this).C7r().CeW() && C28151Xt.A02 != null) {
                    C18920wW c18920wW = this.A02;
                    String C7q = A00(this).C7r().C7q();
                    List C7U = A00(this).C7r().C7U();
                    C14360o3.A0B(c18920wW, 0);
                    C75R.A06(c18920wW, null, null, "click", "delete_in_thread", C7q, C7U);
                }
                if (c3o9 != null) {
                    if (c3o9 instanceof DirectThreadKey) {
                        kWi = AbstractC46919Kp0.A00(abstractC59962oe.requireActivity(), userSession);
                    } else {
                        kWi = new KWi(abstractC59962oe.requireActivity(), userSession);
                    }
                    kWi.A03(c3o9, num, z2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // X.InterfaceC163977Vl
    public final void DLo(EnumC223459tc enumC223459tc, C2EE c2ee) {
    }

    @Override // X.InterfaceC163977Vl
    public final void Dfb(String str) {
        boolean CVY = A00(this).C7r().CVY();
        boolean CeQ = A00(this).C7r().CeQ();
        if (CVY) {
            if (CeQ) {
                if (A00(this).C7r().CeW() && C28151Xt.A02 != null) {
                    C18920wW c18920wW = this.A02;
                    String C7q = A00(this).C7r().C7q();
                    List C7U = A00(this).C7r().C7U();
                    C14360o3.A0B(c18920wW, 0);
                    C75R.A06(c18920wW, null, null, "click", "report_in_thread", C7q, C7U);
                }
                UserSession userSession = this.A03;
                LL1.A01(this.A00.requireActivity(), this.A01, userSession, null, EnumC65855TvH.A0T, VG2.A0o, new C46098Kay(this), str, null, str, A00(this).C7r().C7I(), null, null, A00(this).C7r().CX1(), false, false);
            } else {
                throw new IllegalStateException("Check failed.");
            }
        } else if (CeQ) {
            if (A00(this).C7r().CeW() && C28151Xt.A02 != null) {
                C18920wW c18920wW2 = this.A02;
                String C7q2 = A00(this).C7r().C7q();
                List C7U2 = A00(this).C7r().C7U();
                C14360o3.A0B(c18920wW2, 0);
                C75R.A06(c18920wW2, null, null, "click", "report_in_thread", C7q2, C7U2);
            }
            UserSession userSession2 = this.A03;
            FragmentActivity requireActivity = this.A00.requireActivity();
            String C7I = A00(this).C7r().C7I();
            boolean CX1 = A00(this).C7r().CX1();
            boolean z = A00(this).C7r().B90() instanceof MsysThreadId;
            LL1.A04(requireActivity, this.A01, userSession2, new C46097Kax(this), str, C7I, 0, CX1, z, false);
        } else {
            throw new IllegalStateException("Check failed.");
        }
        this.A05.D0E();
    }

    public static final C7U0 A00(C164547Xt c164547Xt) {
        Object obj = c164547Xt.A09.get();
        C14360o3.A07(obj);
        return (C7U0) obj;
    }

    public static final void A01(C164547Xt c164547Xt, String str) {
        UserSession userSession = c164547Xt.A03;
        InterfaceC60442pS interfaceC60442pS = c164547Xt.A06;
        String str2 = userSession.userId;
        List singletonList = Collections.singletonList(A00(c164547Xt).C7r().C7I());
        C14360o3.A07(singletonList);
        C162337Ov.A0T(interfaceC60442pS, userSession, str, str2, c164547Xt.A08, "thread_view", null, singletonList, AbstractC46759KmG.A00(A00(c164547Xt)), c164547Xt.A07, 0);
    }

    @Override // X.InterfaceC163977Vl
    public final void Czh(User user) {
        EnumC33464Eqz enumC33464Eqz;
        AbstractC59962oe abstractC59962oe = this.A00;
        UserSession userSession = this.A03;
        C7U0 A00 = A00(this);
        InterfaceC60442pS interfaceC60442pS = this.A06;
        C18920wW c18920wW = this.A02;
        String str = this.A08;
        int i = this.A07;
        boolean z = this.A0A;
        C14360o3.A0B(abstractC59962oe, 0);
        C14360o3.A0B(A00, 2);
        C14360o3.A0B(c18920wW, 4);
        InterfaceC163837Ux C7r = A00.C7r();
        if (C7r.CeQ()) {
            if (C7r.CeW() && C28151Xt.A02 != null) {
                boolean CVY = C7r.CVY();
                String A002 = AbstractC1577276g.A00(A00);
                List C7U = C7r.C7U();
                EnumC1579076z A003 = AbstractC1578976y.A00(z, CVY);
                if (C7r.CX1() && CVY) {
                    enumC33464Eqz = EnumC33464Eqz.GXAC;
                } else {
                    enumC33464Eqz = EnumC33464Eqz.DEFAULT;
                }
                C75R.A06(c18920wW, A003, enumC33464Eqz, "click", "block_in_thread", A002, C7U);
            }
            GIi gIi = new GIi(userSession, A00);
            if (user != null) {
                String str2 = userSession.userId;
                List singletonList = Collections.singletonList(C7r.C7I());
                C14360o3.A07(singletonList);
                C162337Ov.A0T(interfaceC60442pS, userSession, "direct_request_block_click", str2, str, "thread_view", null, singletonList, AbstractC46759KmG.A00(A00), i, 0);
                String moduleName = interfaceC60442pS.getModuleName();
                int BJ8 = user.BJ8();
                FollowStatus B7L = user.B7L();
                F7C.A00(abstractC59962oe.requireActivity(), abstractC59962oe, null, userSession, new FJ7(C7r.CPb(userSession.userId), C7r.C7W().A08), null, null, user, new C35199Ffr(null, null, Boolean.valueOf(C7r.CaB()), Boolean.valueOf(C7r.CVY()), moduleName, "direct_thread", B7L.name(), C7r.C7I(), "DEFAULT", "DEFAULT", UUID.randomUUID().toString(), BJ8), null, gIi);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public C164547Xt(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, C164537Xs c164537Xs, C7XS c7xs, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC08830cm interfaceC08830cm, int i, boolean z) {
        this.A03 = userSession;
        this.A00 = abstractC59962oe;
        this.A06 = interfaceC60442pS;
        this.A01 = interfaceC11380iw;
        this.A02 = c18920wW;
        this.A0A = z;
        this.A07 = i;
        this.A08 = str;
        this.A05 = c7xs;
        this.A09 = interfaceC08830cm;
        this.A04 = c164537Xs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0172, code lost:
    
        if (X.C2E8.A07(r5) == false) goto L58;
     */
    @Override // X.InterfaceC163977Vl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CuI() {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164547Xt.CuI():void");
    }

    @Override // X.InterfaceC163977Vl
    public final void DOj(C3o9 c3o9) {
        if (A00(this).C7r().CeQ()) {
            if (A00(this).C7r().CeW() && C28151Xt.A02 != null) {
                C18920wW c18920wW = this.A02;
                String C7q = A00(this).C7r().C7q();
                List C7U = A00(this).C7r().C7U();
                C14360o3.A0B(c18920wW, 0);
                C75R.A06(c18920wW, null, null, "click", "leave_group_option", C7q, C7U);
            }
            if (c3o9 instanceof DirectThreadKey) {
                AbstractC35214Fg7.A01(this.A00.requireContext(), this.A03, JRE.A01(c3o9));
                return;
            } else {
                C0w9.A03(C51B.__redex_internal_original_name, "Leave msys group thread not supported");
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // X.InterfaceC163977Vl
    public final void CuJ(C2EE c2ee) {
        CuI();
    }
}
