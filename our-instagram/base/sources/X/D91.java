package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.model.venue.Venue;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class D91 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D91(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A07 = obj2;
        this.A06 = obj3;
        this.A09 = z;
        this.A05 = obj4;
        this.A04 = obj5;
        this.A02 = obj6;
        this.A01 = obj7;
        this.A08 = obj8;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0071. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int length;
        String str;
        C45127Jxw c45127Jxw;
        String str2;
        String str3;
        String str4;
        String str5;
        String A0f;
        View.OnClickListener lq1;
        View.OnClickListener lpm;
        String A0f2;
        View.OnClickListener viewOnClickListenerC42032Ik1;
        C92584Cs c92584Cs;
        int i;
        int i2;
        int i3;
        String iconicHorizonWorldName;
        View.OnClickListener lq12;
        switch (this.A00) {
            case 2:
                UserSession userSession = (UserSession) this.A08;
                List<C43Q> list = (List) this.A06;
                C38321qM c38321qM = (C38321qM) this.A04;
                C75113Zb c75113Zb = (C75113Zb) this.A05;
                C76683cG c76683cG = (C76683cG) this.A07;
                Context context = (Context) this.A01;
                Object obj = this.A02;
                boolean z = this.A09;
                list.size();
                ArrayList A1E = AbstractC166987dD.A1E();
                for (C43Q c43q : list) {
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    String str6 = null;
                    String str7 = "";
                    switch (c43q.ordinal()) {
                        case 0:
                            A0f = AbstractC167007dF.A0f(context, C151366re.A00(userSession), 2131953257);
                            C14360o3.A07(A0f);
                            lq1 = new LQ1(60, c38321qM, obj);
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case 1:
                        case 6:
                        case 10:
                        case 11:
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        case 18:
                        case 22:
                            AnonymousClass016.A16(A1E2, A1E);
                        case 2:
                            InterfaceC09390do interfaceC09390do = c76683cG.A02;
                            interfaceC09390do.getValue();
                            C115015Hw A00 = C115005Hv.A00(userSession, c38321qM, false);
                            C115025Hx c115025Hx = new C115025Hx((C115005Hv) interfaceC09390do.getValue());
                            ViewOnClickListenerC77633dn viewOnClickListenerC77633dn = new ViewOnClickListenerC77633dn(userSession, null, new D8M(45, c75113Zb, A00), new C50364MLq(c115025Hx, A00, c75113Zb, 35), true);
                            User A14 = AbstractC25226BEj.A14(c38321qM);
                            if (A14 == null) {
                                str = "";
                            } else {
                                str = A14.getUsername();
                            }
                            String A0f3 = AbstractC167007dF.A0f(context, str, 2131976911);
                            C14360o3.A07(A0f3);
                            A1E2.add(new C45127Jxw(A0f3, viewOnClickListenerC77633dn));
                            if (AbstractC115035Hy.A02(userSession, A00) && (str4 = A00.A05) != null && str4.length() != 0) {
                                User A142 = AbstractC25226BEj.A14(c38321qM);
                                if (A142 == null) {
                                    str5 = "";
                                } else {
                                    str5 = A142.getUsername();
                                }
                                String A0f4 = AbstractC167007dF.A0f(context, str5, 2131976911);
                                C14360o3.A07(A0f4);
                                A1E2.add(new C45127Jxw(A0f4, new ViewOnClickListenerC48068LPt(30, A00, c75113Zb, c115025Hx)));
                            }
                            if (A00.A0E) {
                                User A143 = AbstractC25226BEj.A14(c38321qM);
                                if (A143 == null || (str3 = A143.A03.CAk()) == null) {
                                    str3 = "";
                                }
                                A1E2.add(new C45127Jxw(str3, new LQ1(56, c38321qM, obj)));
                            }
                            if (z && A00.A0A && AbstractC41071vF.A0Y(c38321qM.A1a())) {
                                User A144 = AbstractC25226BEj.A14(c38321qM);
                                if (A144 == null || (str2 = A144.A03.CAk()) == null) {
                                    str2 = "";
                                }
                                A1E2.add(new C45127Jxw(str2, new LPM(9, userSession, obj, c75113Zb, c38321qM)));
                            }
                            if (A00.A0B) {
                                String str8 = A00.A02;
                                if (str8 != null) {
                                    str7 = str8;
                                }
                                c45127Jxw = new C45127Jxw(str7, new ViewOnClickListenerC48068LPt(31, c75113Zb, obj, c38321qM));
                                A1E2.add(c45127Jxw);
                                AnonymousClass016.A16(A1E2, A1E);
                            } else {
                                AnonymousClass016.A16(A1E2, A1E);
                            }
                            break;
                        case 3:
                            MUG A002 = C76683cG.A00(context, c38321qM);
                            Object A0J = AbstractC001800i.A0J(c38321qM.A3Z());
                            if (A0J != null) {
                                lpm = new LPM(10, A0J, obj, c75113Zb, c38321qM);
                                A0f2 = AbstractC167007dF.A0f(context, A002.A00.toString(), 2131976911);
                                C14360o3.A07(A0f2);
                                c45127Jxw = new C45127Jxw(A0f2, lpm);
                                A1E2.add(c45127Jxw);
                                AnonymousClass016.A16(A1E2, A1E);
                            } else {
                                AnonymousClass016.A16(A1E2, A1E);
                            }
                        case 4:
                            Venue A27 = c38321qM.A27();
                            if (A27 != null) {
                                LQ1 lq13 = new LQ1(62, c38321qM, obj);
                                if (A27.A00() != null) {
                                    c45127Jxw = new C45127Jxw(AbstractC166997dE.A0p(context, 2131976856), lq13);
                                    A1E2.add(c45127Jxw);
                                }
                            }
                            AnonymousClass016.A16(A1E2, A1E);
                        case 5:
                            C51761Mtk A02 = c76683cG.A02(context, c38321qM, null, c75113Zb);
                            if (A02 != null && (c92584Cs = (C92584Cs) A02.A02) != null && c92584Cs.A05) {
                                viewOnClickListenerC42032Ik1 = new LQ1(61, c38321qM, obj);
                            } else {
                                viewOnClickListenerC42032Ik1 = new ViewOnClickListenerC42032Ik1(A02, 31);
                            }
                            lpm = viewOnClickListenerC42032Ik1;
                            A0f2 = context.getString(2131976889);
                            C14360o3.A07(A0f2);
                            c45127Jxw = new C45127Jxw(A0f2, lpm);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                            break;
                        case 7:
                            A0f = AbstractC166997dE.A0p(context, 2131976889);
                            i = 32;
                            lq12 = new ViewOnClickListenerC48068LPt(i, c76683cG, c38321qM, c75113Zb);
                            lq1 = lq12;
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case 8:
                            lpm = new ViewOnClickListenerC28654Cl2(0, c75113Zb, obj, c38321qM, c76683cG.A01(context, c38321qM, null), userSession);
                            A0f2 = context.getString(2131976889);
                            C14360o3.A07(A0f2);
                            c45127Jxw = new C45127Jxw(A0f2, lpm);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case 9:
                            User A145 = AbstractC25226BEj.A14(c38321qM);
                            if (A145 != null) {
                                str7 = A145.getUsername();
                            }
                            A0f = AbstractC167007dF.A0f(context, str7, 2131976911);
                            C14360o3.A07(A0f);
                            i2 = 57;
                            lq12 = new LQ1(i2, c38321qM, obj);
                            lq1 = lq12;
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            A0f = AbstractC166997dE.A0p(context, 2131976896);
                            i3 = 58;
                            lq12 = new LQ1(i3, c76683cG, c38321qM);
                            lq1 = lq12;
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case 14:
                            A0f = AbstractC166997dE.A0p(context, 2131976846);
                            i3 = 59;
                            lq12 = new LQ1(i3, c76683cG, c38321qM);
                            lq1 = lq12;
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case Process.SIGTERM /* 15 */:
                            A0f = AbstractC166997dE.A0p(context, 2131976859);
                            lq1 = new ViewOnClickListenerC48074LPz(c76683cG, 55);
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case 16:
                            A0f = AbstractC166997dE.A0p(context, 2131976845);
                            i3 = 54;
                            lq12 = new LQ1(i3, c76683cG, c38321qM);
                            lq1 = lq12;
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case 17:
                            A0f = AbstractC166997dE.A0p(context, 2131977108);
                            lq1 = new ViewOnClickListenerC48068LPt(27, c75113Zb, obj, c38321qM);
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case Process.SIGSTOP /* 19 */:
                            User A146 = AbstractC25226BEj.A14(c38321qM);
                            if (A146 != null) {
                                str6 = A146.getUsername();
                            }
                            A0f = AbstractC167007dF.A0f(context, str6, 2131976911);
                            C14360o3.A07(A0f);
                            i = 28;
                            lq12 = new ViewOnClickListenerC48068LPt(i, c76683cG, c38321qM, c75113Zb);
                            lq1 = lq12;
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case 20:
                            A0f = AbstractC166997dE.A0p(context, 2131976867);
                            i2 = 53;
                            lq12 = new LQ1(i2, c38321qM, obj);
                            lq1 = lq12;
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case 21:
                            A0f = AbstractC166997dE.A0p(context, 2131976895);
                            i3 = 55;
                            lq12 = new LQ1(i3, c76683cG, c38321qM);
                            lq1 = lq12;
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        case 23:
                            InterfaceC43580JMo A0t = AbstractC25226BEj.A0t(c38321qM);
                            if (A0t != null && (iconicHorizonWorldName = A0t.getIconicHorizonWorldName()) != null) {
                                str7 = iconicHorizonWorldName;
                            }
                            A0f = AbstractC167007dF.A0f(context, str7, 2131976897);
                            C14360o3.A07(A0f);
                            i3 = 52;
                            lq12 = new LQ1(i3, c76683cG, c38321qM);
                            lq1 = lq12;
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                            break;
                        case 24:
                            A0f = AbstractC166997dE.A0p(context, 2131976868);
                            i = 29;
                            lq12 = new ViewOnClickListenerC48068LPt(i, c76683cG, c38321qM, c75113Zb);
                            lq1 = lq12;
                            c45127Jxw = new C45127Jxw(A0f, lq1);
                            A1E2.add(c45127Jxw);
                            AnonymousClass016.A16(A1E2, A1E);
                        default:
                            throw B4Z.A00();
                    }
                }
                C45127Jxw[] c45127JxwArr = (C45127Jxw[]) A1E.toArray(new C45127Jxw[0]);
                if (c45127JxwArr != null && (length = c45127JxwArr.length) != 0) {
                    C14360o3.A0B(userSession, 1);
                    C14360o3.A0B(context, 0);
                    C50674MYs c50674MYs = new C50674MYs(context, userSession);
                    int i4 = 0;
                    do {
                        C45127Jxw c45127Jxw2 = c45127JxwArr[i4];
                        c50674MYs.A0B(c45127Jxw2.A01, (View.OnClickListener) c45127Jxw2.A00);
                        i4++;
                    } while (i4 < length);
                    new C31727DwY(c50674MYs).A07(context);
                } else {
                    C0K8.A0C("MediaHeaderCyclicSubtitleUseCase", "Actions are empty");
                }
                return C0eB.A00;
            case 3:
                Context A0N = AbstractC25229BEm.A0N(this.A06);
                C26589Bom c26589Bom = (C26589Bom) this.A08;
                UserSession userSession2 = c26589Bom.A03;
                InterfaceC60442pS interfaceC60442pS = c26589Bom.A04;
                C120985dq c120985dq = c26589Bom.A01;
                C37644Ghd c37644Ghd = c26589Bom.A02;
                C40971v4 c40971v4 = (C40971v4) this.A01;
                C27910CRv c27910CRv = c26589Bom.A05;
                C29091CsI c29091CsI = new C29091CsI(c40971v4, c26589Bom, 5);
                C51762Yz c51762Yz = (C51762Yz) this.A03;
                EnumC71343Hv enumC71343Hv = EnumC71343Hv.A0H;
                C37616GhB c37616GhB = (C37616GhB) this.A04;
                CZK czk = (CZK) this.A02;
                boolean z2 = this.A09;
                C06090Tz c06090Tz = C06090Tz.A05;
                return new C25728BYo(A0N, enumC71343Hv, (C2XI) this.A05, (C2XI) this.A07, c51762Yz, c29091CsI, c120985dq, c37644Ghd, userSession2, interfaceC60442pS, c40971v4, c27910CRv, czk, c37616GhB, z2, C18U.A06(c06090Tz, userSession2, 36315112426114074L), C18U.A06(c06090Tz, userSession2, 36315112426048537L));
            default:
                Context context2 = (Context) this.A03;
                UserSession userSession3 = (UserSession) this.A07;
                C7T2 c7t2 = (C7T2) this.A06;
                boolean z3 = this.A09;
                AbstractC55155OdJ.A01(context2, (EnumC46283KeF) this.A08, (InterfaceC11380iw) this.A05, userSession3, c7t2, (RtcCallFunnelSessionId) this.A01, (C7T3) this.A04, (RtcStartCoWatchPlaybackArguments) this.A02, z3);
                return C0eB.A00;
        }
    }
}
