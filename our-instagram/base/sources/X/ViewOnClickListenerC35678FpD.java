package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment;
import java.util.ArrayList;

/* renamed from: X.FpD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35678FpD implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC35678FpD(C33192Eke c33192Eke, int i) {
        this.A00 = i;
        this.A01 = c33192Eke;
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC35678FpD(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        Context context;
        String str2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(328883967);
                C32340EMm c32340EMm = (C32340EMm) this.A01;
                AbstractC13900nG.A00(c32340EMm.requireContext(), c32340EMm.A04);
                C9GR.A07(c32340EMm.requireContext(), 2131974978);
                i = 1508051173;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1085979149);
                C33192Eke c33192Eke = (C33192Eke) this.A01;
                InterfaceC09390do interfaceC09390do = c33192Eke.A00;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                long A03 = AbstractC31176DnK.A03(C455127l.A03(AbstractC166987dD.A0r(interfaceC09390do)), A0r);
                Integer num = C05F.A0Q;
                Long valueOf = Long.valueOf(A03);
                C16920sk c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C461329x.A04(A0r, null, num, valueOf, c16920sk);
                AbstractC25226BEj.A1Q(c33192Eke);
                Context requireContext = c33192Eke.requireContext();
                AbstractC31176DnK.A11(requireContext, AbstractC166987dD.A0o(interfaceC09390do), AbstractC31171DnF.A0R("https://www.facebook.com/help/instagram/750317295927782/?cms_platform=android-app&helpref=platform_switcher"), requireContext.getString(2131965052));
                i = 456312912;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(1999409131);
                C33192Eke c33192Eke2 = (C33192Eke) this.A01;
                InterfaceC09390do interfaceC09390do2 = c33192Eke2.A00;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                long A07 = AbstractC31174DnI.A07(AbstractC166987dD.A0r(interfaceC09390do2));
                C14360o3.A0B(A0r2, 0);
                AbstractC31178DnM.A1O(A0r2, null, C05F.A0P, A07);
                AbstractC25226BEj.A1Q(c33192Eke2);
                i = -242009522;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(1792921076);
                FI8 fi8 = ((C33189Ekb) this.A01).A00;
                if (fi8 == null) {
                    str = "dailyLimitRemindAgainMenuItemListener";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment = (TimeSpentReminderFullyBlockingFragment) fi8.A00.A01;
                AnonymousClass280.A01.A09(timeSpentReminderFullyBlockingFragment.A01, 0L);
                AbstractC31179DnN.A14(AbstractC31176DnK.A0L(null, timeSpentReminderFullyBlockingFragment.A01), "daily_limit_reminder", "daily_limit_reminder_ignore_button");
                AbstractC25231BEo.A16(timeSpentReminderFullyBlockingFragment);
                i = -320540986;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(519407203);
                TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment2 = (TimeSpentReminderFullyBlockingFragment) this.A01;
                UserSession userSession = timeSpentReminderFullyBlockingFragment2.A01;
                AbstractC31172DnG.A1S(userSession, C05F.A0N, timeSpentReminderFullyBlockingFragment2.A02.A00, AbstractC31176DnK.A03(C455127l.A03(userSession), userSession));
                Context requireContext2 = timeSpentReminderFullyBlockingFragment2.requireContext();
                AbstractC31176DnK.A11(requireContext2, timeSpentReminderFullyBlockingFragment2.A01, AbstractC31171DnF.A0R("https://help.instagram.com/414934160431303?ref=bsa"), requireContext2.getString(2131965052));
                i = -352041351;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(-1423445113);
                TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment3 = (TimeSpentReminderFullyBlockingFragment) this.A01;
                C461529z.A06(timeSpentReminderFullyBlockingFragment3.requireActivity(), timeSpentReminderFullyBlockingFragment3.A01);
                C455127l.A03(timeSpentReminderFullyBlockingFragment3.A01).A0U();
                i = 927272220;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(-767015194);
                TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment4 = (TimeSpentReminderFullyBlockingFragment) this.A01;
                UserSession userSession2 = timeSpentReminderFullyBlockingFragment4.A01;
                EnumC33408Epf enumC33408Epf = timeSpentReminderFullyBlockingFragment4.A03;
                long A032 = AbstractC31176DnK.A03(C455127l.A03(userSession2), userSession2);
                Integer num2 = C05F.A0M;
                Long valueOf2 = Long.valueOf(A032);
                C16920sk c16920sk2 = C16920sk.A00;
                C14360o3.A0C(c16920sk2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C461329x.A04(userSession2, enumC33408Epf, num2, valueOf2, c16920sk2);
                C455127l.A03(timeSpentReminderFullyBlockingFragment4.A01).A0S();
                FragmentActivity activity = timeSpentReminderFullyBlockingFragment4.getActivity();
                activity.getClass();
                activity.finish();
                i = -1497404262;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-895203074);
                TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment5 = (TimeSpentReminderFullyBlockingFragment) this.A01;
                UserSession userSession3 = timeSpentReminderFullyBlockingFragment5.A01;
                String str3 = timeSpentReminderFullyBlockingFragment5.A02.A00;
                long A072 = AbstractC31174DnI.A07(userSession3);
                C14360o3.A0B(userSession3, 0);
                AbstractC31172DnG.A1S(userSession3, C05F.A01, str3, A072);
                UserSession userSession4 = timeSpentReminderFullyBlockingFragment5.A01;
                AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
                C14360o3.A0B(userSession4, 0);
                long A06 = AbstractC31177DnL.A06();
                InterfaceC19610xo A0e = AbstractC31174DnI.A0e(userSession4, anonymousClass282);
                A0e.E7G(AbstractC111324zv.A00(1504), A06 + C18U.A01(C06090Tz.A05, userSession4, 36597454985366356L));
                A0e.apply();
                AbstractC25227BEk.A1B(timeSpentReminderFullyBlockingFragment5);
                C455127l.A03(timeSpentReminderFullyBlockingFragment5.A01).A0S();
                i = -1122103916;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(-1302032630);
                TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment6 = (TimeSpentReminderFullyBlockingFragment) this.A01;
                UserSession userSession5 = timeSpentReminderFullyBlockingFragment6.A01;
                C14360o3.A0B(userSession5, 0);
                C189448aO A0y = AbstractC25225BEi.A0y(userSession5);
                A0y.A01();
                A0y.A02();
                A0y.A0S = new C189458aP(null, null, "", 0, 0).A00();
                A0y.A0U = null;
                C189478aR A00 = A0y.A00();
                C1VE c1ve = C1VE.A02;
                if (c1ve != null) {
                    FI8 fi82 = new FI8(this);
                    FragmentActivity requireActivity = timeSpentReminderFullyBlockingFragment6.requireActivity();
                    C1VE.A00(c1ve);
                    C33189Ekb c33189Ekb = new C33189Ekb();
                    c33189Ekb.A00 = fi82;
                    A00.A02(requireActivity, c33189Ekb);
                    AbstractC31179DnN.A14(AbstractC31172DnG.A0Q(null, timeSpentReminderFullyBlockingFragment6.A01, 0), "daily_limit_reminder", "daily_limit_more_option_button");
                }
                i = 570007090;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(-975582324);
                TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment7 = (TimeSpentReminderFullyBlockingFragment) this.A01;
                UserSession userSession6 = timeSpentReminderFullyBlockingFragment7.A01;
                EnumC33408Epf enumC33408Epf2 = timeSpentReminderFullyBlockingFragment7.A03;
                long A033 = AbstractC31176DnK.A03(C455127l.A03(userSession6), userSession6);
                Integer num3 = C05F.A0O;
                Long valueOf3 = Long.valueOf(A033);
                C16920sk c16920sk3 = C16920sk.A00;
                C14360o3.A0C(c16920sk3, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C461329x.A04(userSession6, enumC33408Epf2, num3, valueOf3, c16920sk3);
                C1VE c1ve2 = C1VE.A02;
                if (c1ve2 != null) {
                    C1VH A002 = C1VE.A00(c1ve2);
                    EnumC33408Epf enumC33408Epf3 = timeSpentReminderFullyBlockingFragment7.A03;
                    if (enumC33408Epf3 == null) {
                        enumC33408Epf3 = EnumC33408Epf.A0I;
                    }
                    C72743Nv A01 = A002.A01(timeSpentReminderFullyBlockingFragment7.A01, enumC33408Epf3);
                    C140966Yy A0P = AbstractC31173DnH.A0P(timeSpentReminderFullyBlockingFragment7.requireActivity(), timeSpentReminderFullyBlockingFragment7.A01);
                    A0P.A0E(A01);
                    A0P.A04();
                }
                i = -1307813705;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(-2078865287);
                TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment8 = (TimeSpentReminderFullyBlockingFragment) this.A01;
                UserSession userSession7 = timeSpentReminderFullyBlockingFragment8.A01;
                AbstractC31172DnG.A1S(userSession7, C05F.A0Y, timeSpentReminderFullyBlockingFragment8.A02.A00, AbstractC31176DnK.A03(C455127l.A03(userSession7), userSession7));
                C1VE c1ve3 = C1VE.A02;
                if (c1ve3 != null) {
                    C72743Nv A012 = C1VE.A00(c1ve3).A01(timeSpentReminderFullyBlockingFragment8.A01, EnumC33408Epf.A0H);
                    C140966Yy A0P2 = AbstractC31173DnH.A0P(timeSpentReminderFullyBlockingFragment8.requireActivity(), timeSpentReminderFullyBlockingFragment8.A01);
                    A0P2.A0E(A012);
                    A0P2.A04();
                }
                i = 1258401194;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(-428028289);
                AbstractC31171DnF.A1N(this.A01);
                i = 479678469;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C32361ENi c32361ENi = (C32361ENi) this.A01;
                boolean z = c32361ENi.A03;
                C23031Ai c23031Ai = c32361ENi.A02;
                int i2 = 2;
                if (z) {
                    i2 = 1;
                }
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
                A0w.E7D(AbstractC111324zv.A00(3329), i2);
                A0w.apply();
                AbstractC25651Mw.A00(c32361ENi.getSession()).E4s(new C36096FwW(c32361ENi.A03));
                ((Activity) c32361ENi.requireContext()).onBackPressed();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-1563703603);
                Context context2 = view.getContext();
                UserSession userSession8 = (UserSession) this.A01;
                C3DN A013 = C3DN.A00.A01(context2);
                if (A013 != null) {
                    IgFragmentFactoryImpl.A00();
                    C32361ENi c32361ENi2 = new C32361ENi();
                    c32361ENi2.setArguments(AbstractC31178DnM.A05(userSession8));
                    A013.A0J(c32361ENi2);
                }
                i = -1668743661;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = C0f9.A05(1279568732);
                C33201Eko c33201Eko = (C33201Eko) this.A01;
                InterfaceC09390do interfaceC09390do3 = c33201Eko.A01;
                InterfaceC19610xo A0w2 = AbstractC166987dD.A0w(AbstractC25230BEn.A0l(interfaceC09390do3));
                A0w2.E7G(MSV.A00(497), 0L);
                A0w2.apply();
                new C69758Vuv(c33201Eko.requireContext(), AbstractC166987dD.A0r(interfaceC09390do3)).A02(0L);
                AbstractC31175DnJ.A0m(c33201Eko.getContext(), "CCU Timestamps have been reset");
                i = 1128068530;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(-917599088);
                C33201Eko c33201Eko2 = (C33201Eko) this.A01;
                Context requireContext3 = c33201Eko2.requireContext();
                InterfaceC09390do interfaceC09390do4 = c33201Eko2.A01;
                if (C54P.A01(requireContext3, AbstractC166987dD.A0r(interfaceC09390do4))) {
                    FPV fpv = FPV.A01;
                    if (fpv == null) {
                        fpv = new FPV();
                        FPV.A01 = fpv;
                    }
                    fpv.A00(c33201Eko2.requireContext(), AbstractC166987dD.A0r(interfaceC09390do4));
                    context = c33201Eko2.getContext();
                    str2 = "CCU has been initialized. Please put your app in the background and allow time for CCU to complete.";
                } else {
                    context = c33201Eko2.getContext();
                    str2 = "You need to turn on Contact Importing in order to test CCU";
                }
                C9GR.A03(context, str2, null, 1);
                i = -1809174489;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A05 = C0f9.A05(-2120948943);
                Fragment fragment = (Fragment) this.A01;
                AbstractC31177DnL.A11(fragment);
                AbstractC25233BEq.A14(fragment);
                i = 1767567108;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(-1972986089);
                C32227EHl c32227EHl = (C32227EHl) this.A01;
                new C63397SjR(c32227EHl.requireActivity(), AbstractC166987dD.A0r(c32227EHl.A00), C2Fb.A49, AbstractC31192Dnb.A00(0, 42, 98), false).A0A();
                i = -394319563;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(-1052684329);
                HCZ hcz = (HCZ) this.A01;
                FB6.A00();
                InterfaceC09390do interfaceC09390do5 = hcz.A0E;
                String str4 = AbstractC166987dD.A0r(interfaceC09390do5).token;
                int i3 = hcz.A00;
                C153806vp c153806vp = hcz.A02;
                if (c153806vp == null) {
                    str = "selectStateProvider";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                ArrayList<String> A1F = AbstractC166987dD.A1F(c153806vp.A02.keySet());
                EnumC33380EpD enumC33380EpD = EnumC33380EpD.A04;
                C14360o3.A0B(str4, 0);
                EO2 eo2 = new EO2();
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION_SUBTYPE", enumC33380EpD.A00);
                AbstractC31171DnF.A12(A0b, str4);
                A0b.putInt("ARGUMENT_NUM_MEDIA_COLLECTIONS", i3);
                A0b.putStringArrayList(AbstractC111324zv.A00(160), A1F);
                AbstractC31179DnN.A0y(eo2, AbstractC31173DnH.A0J(A0b, eo2, hcz), interfaceC09390do5);
                i = 516469008;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(-1734568532);
                EMN.A02((EMN) this.A01);
                i = -1414208471;
                C0f9.A0C(i, A05);
                return;
            default:
                C38262Gs5 c38262Gs5 = (C38262Gs5) this.A01;
                FragmentActivity requireActivity2 = c38262Gs5.A05.requireActivity();
                UserSession userSession9 = c38262Gs5.A07;
                new FRV(requireActivity2, new C684436h(requireActivity2, userSession9), userSession9).A01(null, null);
                return;
        }
    }

    public ViewOnClickListenerC35678FpD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
