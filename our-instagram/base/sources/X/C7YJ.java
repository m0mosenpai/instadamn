package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7YJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7YJ implements C7YK, C7YL {
    public boolean A00;
    public final AbstractC59962oe A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C7YM A04;
    public final C7YI A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC08830cm A09;

    public C7YJ(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7YI c7yi, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(abstractC59962oe, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(c7yi, 4);
        this.A03 = userSession;
        this.A01 = abstractC59962oe;
        this.A02 = interfaceC11380iw;
        this.A05 = c7yi;
        this.A09 = interfaceC08830cm;
        this.A06 = AbstractC09440dt.A01(new C9ED(this, 25));
        this.A08 = AbstractC09440dt.A01(new C9ED(this, 27));
        this.A04 = new C7YM(new C9EP(this, 4));
        this.A07 = AbstractC09440dt.A01(new C9ED(this, 26));
    }

    public final void A01(EnumC46283KeF enumC46283KeF, C7T3 c7t3, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, boolean z) {
        Integer num;
        EnumC46290KeM enumC46290KeM;
        C14360o3.A0B(c7t3, 0);
        AbstractC59962oe abstractC59962oe = this.A01;
        Context context = abstractC59962oe.getContext();
        if (context != null) {
            UserSession userSession = this.A03;
            LGX lgx = new LGX(userSession, context);
            if (lgx.A01()) {
                lgx.A00();
                return;
            }
            Context requireContext = abstractC59962oe.requireContext();
            InterfaceC09390do interfaceC09390do = this.A08;
            RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId A00 = AbstractC55155OdJ.A00(requireContext, userSession, (C7T2) interfaceC09390do.getValue(), c7t3);
            InterfaceC163837Ux C7r = A00(this).C7r();
            if (!AbstractC34133F4j.A00(abstractC59962oe.requireActivity(), abstractC59962oe.requireContext(), abstractC59962oe, userSession, C7r)) {
                AbstractC55155OdJ.A02(requireContext, enumC46283KeF, userSession, (C7T2) interfaceC09390do.getValue(), c7t3);
                AbstractC1570673l.A00(userSession);
                C135976Dc A01 = AbstractC135966Db.A01(userSession);
                if (z) {
                    enumC46290KeM = EnumC46290KeM.VIDEO;
                } else {
                    enumC46290KeM = EnumC46290KeM.AUDIO;
                }
                A01.A0H(enumC46290KeM);
                boolean CVY = A00(this).C7r().CVY();
                List<User> BSH = ((C7T2) interfaceC09390do.getValue()).BSH();
                ArrayList arrayList = new ArrayList();
                for (User user : BSH) {
                    if (user.CYY()) {
                        String A07 = AbstractC101904i3.A07(user);
                        C14360o3.A07(A07);
                        arrayList.add(A07);
                    }
                }
                GR1 gr1 = new GR1(requireContext, enumC46283KeF, this, A00, c7t3, rtcStartCoWatchPlaybackArguments, z);
                if (A00(this).AHB(EnumC2054697t.A10)) {
                    InterfaceC09390do interfaceC09390do2 = this.A06;
                    RunnableC36900GNv runnableC36900GNv = null;
                    if (!new C1CM(((C31227DoA) interfaceC09390do2.getValue()).A00).A07(false)) {
                        C193328hC c193328hC = new C193328hC(requireContext);
                        c193328hC.A0A(2131976772);
                        c193328hC.A09(2131976771);
                        c193328hC.A07();
                        C0fJ.A00(c193328hC.A02());
                        num = C05F.A00;
                    } else {
                        if (A00(this).C7r().CeQ()) {
                            String C7I = A00(this).C7r().C7I();
                            C7YM c7ym = this.A04;
                            if (C7I != null) {
                                c7ym.A03 = true;
                                if (!arrayList.isEmpty() && (A00(this).C7r().CX1() || C18U.A06(C06090Tz.A05, userSession, 36313579120691368L))) {
                                    if (C18U.A06(C06090Tz.A05, userSession, 36315868338065050L)) {
                                        runnableC36900GNv = new RunnableC36900GNv(this, A00);
                                    }
                                    C36004Fv2.A00(requireContext, userSession, runnableC36900GNv, gr1, arrayList);
                                    return;
                                }
                                if (((C31227DoA) interfaceC09390do2.getValue()).A0D(CVY)) {
                                    User user2 = (User) A00(this).C7r().BSH().get(0);
                                    RunnableC36901GNw runnableC36901GNw = new RunnableC36901GNw(this, user2);
                                    C14360o3.A0A(user2);
                                    C14360o3.A0B(user2, 2);
                                    if (!user2.A26()) {
                                        C193328hC c193328hC2 = new C193328hC(requireContext);
                                        c193328hC2.A05 = requireContext.getString(2131976818);
                                        c193328hC2.A0r(requireContext.getString(2131976817, user2.getUsername()));
                                        c193328hC2.A0F(DialogInterfaceOnClickListenerC28556Cio.A00);
                                        c193328hC2.A0H(new AO6(runnableC36901GNw), 2131976819);
                                        C0fJ.A00(c193328hC2.A02());
                                        return;
                                    }
                                    C1ON A002 = FXS.A00(userSession);
                                    A002.A00 = new C32476ESc(requireContext, userSession, gr1);
                                    C1GJ.A03(A002);
                                    return;
                                }
                                if (F77.A00(userSession).A00(abstractC59962oe, gr1, A00(this).C7r().C7I(), BSH, CVY)) {
                                    return;
                                }
                                gr1.run();
                                return;
                            }
                            c7ym.A00 = c7t3;
                            c7ym.A02 = Boolean.valueOf(z);
                            c7ym.A01 = rtcStartCoWatchPlaybackArguments;
                            c7ym.A03 = false;
                            ((WD9) this.A07.getValue()).A02(A00(this).C7r().C7U());
                            return;
                        }
                        AbstractC55155OdJ.A03(userSession, A00, C05F.A01);
                        String format = String.format("mThread is null for thread id: %s. Entry point: %s", Arrays.copyOf(new Object[]{A00(this).C7r().C7I(), c7t3}, 2));
                        C14360o3.A07(format);
                        C0w9.A03("Unable to start video call", format);
                        return;
                    }
                } else {
                    num = C05F.A0C;
                }
            } else {
                num = C05F.A0N;
            }
            AbstractC55155OdJ.A03(userSession, A00, num);
        }
    }

    @Override // X.C7YK
    public final void COT(EnumC46283KeF enumC46283KeF, C7T3 c7t3, boolean z, boolean z2) {
        C14360o3.A0B(c7t3, 0);
        UserSession userSession = this.A03;
        AbstractC59962oe abstractC59962oe = this.A01;
        if (AbstractC31273Dov.A00(abstractC59962oe.requireContext(), userSession).A0C((C7T2) this.A08.getValue())) {
            if (z2) {
                Context requireContext = abstractC59962oe.requireContext();
                AO5 ao5 = new AO5(new RunnableC24846Az7(enumC46283KeF, this, c7t3, z));
                DialogInterfaceOnClickListenerC35418Fjb dialogInterfaceOnClickListenerC35418Fjb = DialogInterfaceOnClickListenerC35418Fjb.A00;
                int i = 2131976801;
                if (z) {
                    i = 2131976810;
                }
                String string = requireContext.getString(i);
                C14360o3.A0A(string);
                int i2 = 2131976800;
                if (z) {
                    i2 = 2131976809;
                }
                String string2 = requireContext.getString(i2);
                C14360o3.A0A(string2);
                C193328hC c193328hC = new C193328hC(requireContext);
                c193328hC.A05 = string;
                c193328hC.A0d(ao5, string2);
                c193328hC.A0D(dialogInterfaceOnClickListenerC35418Fjb);
                c193328hC.A04();
                c193328hC.A0C(null);
                C0fJ.A00(c193328hC.A02());
                InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                String A00 = AbstractC43591JPw.A00(934);
                int i3 = interfaceC19630xq.getInt(A00, 0);
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7D(A00, i3 + 1);
                ARD.apply();
                return;
            }
            A01(enumC46283KeF, c7t3, null, z);
        }
    }

    public static final C7U0 A00(C7YJ c7yj) {
        Object obj = c7yj.A09.get();
        C14360o3.A07(obj);
        return (C7U0) obj;
    }

    @Override // X.C7YL
    public final void DO9(String str, boolean z) {
        AbstractC54148Nwk.A00(this.A03).A03(C05F.A0N);
        A01(null, C7T3.A09, null, !z);
    }
}
