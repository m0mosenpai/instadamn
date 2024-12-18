package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LmW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49044LmW implements InterfaceC164877Za, InterfaceC165017Zq, InterfaceC165227aB {
    public final Handler A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final C162507Pn A03;
    public final AvatarReactionsRepository A04;
    public final C164337Ww A05;
    public final C7X1 A06;
    public final C7X0 A07;
    public final C7VS A08;
    public final C7X3 A09;
    public final InterfaceC08830cm A0A;
    public final InterfaceC08830cm A0B;
    public final InterfaceC08830cm A0C;
    public final InterfaceC08830cm A0D;
    public final InterfaceC09390do A0E;

    private final void A01(C2EY c2ey, String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, boolean z2) {
        if (AbstractC34068F1w.A00(this.A01.requireActivity(), this.A02, ((C7U0) AbstractC31172DnG.A0y(this.A0B)).C7r().Afi()) && z2) {
            if (z) {
                if (str != null) {
                    DTM(c2ey, new MessageIdentifier(str, str2), str3, str5, j);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else if (A03(c2ey, str, str2, str3, str4, str5, str6, j, true)) {
                A02(str, true, str5);
                final C164337Ww c164337Ww = this.A05;
                c164337Ww.E3k();
                this.A00.postDelayed(new Runnable() { // from class: X.M0i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C164337Ww.this.EKo();
                    }
                }, 3000L);
            }
            C7VS c7vs = this.A08;
            if (c7vs.A02 == null && !c7vs.A06) {
                c7vs.A06 = true;
            }
        }
    }

    @Override // X.InterfaceC164877Za
    public final void DBP() {
    }

    @Override // X.InterfaceC164877Za
    public final void DTC(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        String str5;
        String str6 = null;
        if (messageIdentifier != null) {
            str5 = messageIdentifier.A01;
            str6 = messageIdentifier.A00();
        } else {
            str5 = null;
        }
        A01(c2ey, str5, str6, str, str2, str3, str4, j, z, z2);
    }

    @Override // X.InterfaceC165227aB
    public final void DTM(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        String str3;
        String str4;
        if (messageIdentifier != null) {
            str3 = messageIdentifier.A01;
            str4 = messageIdentifier.A00();
        } else {
            str3 = null;
            str4 = null;
        }
        A03(c2ey, str3, str4, str, null, str2, null, j, false);
        A02(messageIdentifier != null ? messageIdentifier.A01 : null, false, str2);
    }

    public /* synthetic */ C49044LmW(Handler handler, AbstractC59962oe abstractC59962oe, UserSession userSession, C164337Ww c164337Ww, C7X1 c7x1, C7X0 c7x0, C7VS c7vs, C7X3 c7x3, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4) {
        C162507Pn c162507Pn = new C162507Pn(userSession);
        AvatarReactionsRepository A00 = C7UN.A00(userSession);
        AbstractC25234BEr.A0j(1, abstractC59962oe, handler, c164337Ww, c7x1);
        C14360o3.A0B(c7vs, 6);
        AbstractC25233BEq.A0y(7, c7x3, interfaceC08830cm, interfaceC08830cm2);
        C14360o3.A0B(A00, 14);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A00 = handler;
        this.A05 = c164337Ww;
        this.A06 = c7x1;
        this.A08 = c7vs;
        this.A09 = c7x3;
        this.A0B = interfaceC08830cm;
        this.A0D = interfaceC08830cm2;
        this.A0A = interfaceC08830cm3;
        this.A0C = interfaceC08830cm4;
        this.A07 = c7x0;
        this.A03 = c162507Pn;
        this.A04 = A00;
        this.A0E = AbstractC09440dt.A00(EnumC09460dv.A02, new C50249MHe(this, 35));
    }

    private final C45059Jwo A00(String str, String str2) {
        InterfaceC08830cm interfaceC08830cm = this.A0B;
        C7TT A0V = AbstractC31174DnI.A0V((C7U0) AbstractC31172DnG.A0y(interfaceC08830cm));
        if (str2 != null) {
            if (this.A03.A00(A0V.A0b, A0V.A08, ((C7U0) AbstractC31172DnG.A0y(interfaceC08830cm)).CYS(str))) {
                return this.A04.A02(str2);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(java.lang.String r9, boolean r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49044LmW.A02(java.lang.String, boolean, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
    
        if (r34.equals("❤") == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A03(X.C2EY r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, long r38, boolean r40) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49044LmW.A03(X.2EY, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean):boolean");
    }

    @Override // X.InterfaceC164877Za
    public final void DKW() {
        String str;
        C34507FIt c34507FIt = new C34507FIt(this.A02);
        InterfaceC163837Ux A0X = AbstractC31176DnK.A0X(this.A0B);
        int AdZ = A0X.AdZ();
        InterfaceC83733oI interfaceC83733oI = A0X.C7W().A0P;
        if (interfaceC83733oI != null) {
            str = AbstractC31171DnF.A0c(interfaceC83733oI);
        } else {
            str = null;
        }
        AbstractC31172DnG.A0d(c34507FIt.A01).A0W("emoji_moderation_nux_rendered", "impression", "emoji_moderation_nux", "multi_react_overflow_menu", str, A0X.C7q(), null, AdZ);
    }

    @Override // X.InterfaceC164877Za
    public final void DKX() {
        String str;
        C34507FIt c34507FIt = new C34507FIt(this.A02);
        InterfaceC163837Ux A0X = AbstractC31176DnK.A0X(this.A0B);
        int AdZ = A0X.AdZ();
        InterfaceC83733oI interfaceC83733oI = A0X.C7W().A0P;
        if (interfaceC83733oI != null) {
            str = AbstractC31171DnF.A0c(interfaceC83733oI);
        } else {
            str = null;
        }
        AbstractC31172DnG.A0d(c34507FIt.A01).A0W("emoji_moderation_bottom_sheet_rendered", "tap", "emoji_moderation_nux", "multi_react_overflow_menu", str, A0X.C7q(), null, AdZ);
    }

    @Override // X.InterfaceC165017Zq
    public final void DT8(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
        String str4;
        String str5;
        InterfaceC08830cm interfaceC08830cm = this.A0B;
        InterfaceC163837Ux C7r = ((C7U0) AbstractC31172DnG.A0y(interfaceC08830cm)).C7r();
        AbstractC59962oe abstractC59962oe = this.A01;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = this.A02;
        if (!AbstractC34133F4j.A00(abstractC59962oe.requireActivity(), requireContext, abstractC59962oe, userSession, C7r)) {
            String str6 = null;
            if (((AnonymousClass988) this.A0D.get()).A1U) {
                str4 = AbstractC47991LKc.A00(userSession, AbstractC31174DnI.A0V((C7U0) AbstractC31172DnG.A0y(interfaceC08830cm)).A08);
            } else {
                str4 = null;
            }
            if (messageIdentifier != null) {
                str5 = messageIdentifier.A01;
                str6 = messageIdentifier.A00();
            } else {
                str5 = null;
            }
            A01(c2ey, str5, str6, str4, NetInfoModule.CONNECTION_TYPE_NONE, str, str3, j, z, true);
        }
    }

    @Override // X.InterfaceC164877Za
    public final void Dd3(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        DTM(c2ey, messageIdentifier, str, str2, j);
    }
}
