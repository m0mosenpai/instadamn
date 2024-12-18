package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.FiT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35352FiT implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public DialogInterfaceOnClickListenerC35352FiT(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A04 = str;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C35272Fh7 c35272Fh7;
        boolean z;
        switch (this.A00) {
            case 0:
                String str = this.A04;
                InterfaceC94534Ng interfaceC94534Ng = (InterfaceC94534Ng) this.A02;
                InterfaceC55722hD interfaceC55722hD = (InterfaceC55722hD) this.A01;
                for (Integer num : C05F.A00(5)) {
                    interfaceC55722hD.AHg(interfaceC94534Ng, num, str);
                }
                return;
            case 1:
                C35233FgQ.A01((Context) this.A01, (C35233FgQ) this.A03, (EnumC33444EqG) this.A02, this.A04);
                return;
            case 2:
                Context context = (Context) this.A01;
                UserSession userSession = (UserSession) this.A03;
                C63397SjR A0y = AbstractC25228BEl.A0y(context, userSession, C2Fb.A16, this.A04);
                A0y.A0E(userSession.userId);
                AbstractC31175DnJ.A1M((InterfaceC11380iw) this.A02, A0y);
                return;
            case 3:
                C2ED c2ed = (C2ED) this.A02;
                String str2 = c2ed.BKb().A00;
                if (str2 != null) {
                    AbstractC34146F4w.A00(((C31280Dp2) this.A03).A03, str2, this.A04);
                }
                ((InterfaceC37152GYp) this.A01).AJt(c2ed.BKb(), 2);
                return;
            case 4:
                C14360o3.A0B(dialogInterface, 0);
                G4W.A05(EnumC33511Erk.CANCEL, (FRk) this.A02, (C7U0) this.A01, this.A04);
                dialogInterface.dismiss();
                return;
            case 5:
                AbstractC166987dD.A1Z(new MC9(this.A03, this.A02, this.A04, (InterfaceC23621Ds) null, 41), C07Y.A00((ComponentActivity) this.A01));
                return;
            case 6:
                c35272Fh7 = (C35272Fh7) this.A01;
                UserSession userSession2 = c35272Fh7.A04;
                InterfaceC11380iw interfaceC11380iw = c35272Fh7.A03;
                AbstractC35076Fcn.A00(interfaceC11380iw, userSession2, "logout_d3_remember_tapped");
                Object obj = this.A02;
                if (obj == EnumC33353Eom.A02) {
                    C83743oJ c83743oJ = (C83743oJ) this.A03;
                    java.util.Set BOd = C0BQ.A00(userSession2).BOd();
                    Integer num2 = C05F.A0j;
                    Context applicationContext = c35272Fh7.A01.getApplicationContext();
                    Boolean A0a = AbstractC166997dE.A0a();
                    c83743oJ.A07(applicationContext, interfaceC11380iw, userSession2, A0a, A0a, num2, BOd, true);
                    C35272Fh7.A06(c35272Fh7);
                    return;
                }
                EnumC33353Eom enumC33353Eom = EnumC33353Eom.A04;
                z = true;
                C83743oJ c83743oJ2 = (C83743oJ) this.A03;
                if (obj == enumC33353Eom) {
                    c83743oJ2.A08(c35272Fh7.A01.getApplicationContext(), interfaceC11380iw, userSession2, true, true, C05F.A0j, userSession2.userId, true);
                    C35272Fh7.A05(c35272Fh7);
                    return;
                }
                c83743oJ2.A09(c35272Fh7.A01.getApplicationContext(), interfaceC11380iw, userSession2, C05F.A0j, this.A04, true);
                C35272Fh7.A0A(c35272Fh7, z);
                return;
            case 7:
                c35272Fh7 = (C35272Fh7) this.A01;
                AbstractC35076Fcn.A00(c35272Fh7.A03, c35272Fh7.A04, "logout_d3_cancel_tapped");
                Object obj2 = this.A02;
                if (obj2 != EnumC33353Eom.A02) {
                    if (obj2 != EnumC33353Eom.A04) {
                        C83743oJ c83743oJ3 = (C83743oJ) this.A03;
                        String str3 = this.A04;
                        C83803oP A02 = C83743oJ.A02(c83743oJ3, str3);
                        A02.A0A = true;
                        c83743oJ3.A00.put(str3, A02);
                        z = false;
                        c83743oJ3.A0B(null, null, null, false);
                        C35272Fh7.A0A(c35272Fh7, z);
                        return;
                    }
                    C35272Fh7.A05(c35272Fh7);
                    return;
                }
                C35272Fh7.A06(c35272Fh7);
                return;
            case 8:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                InterfaceC11380iw interfaceC11380iw2 = AbstractC34914Fa0.A00;
                C14360o3.A0B(interfaceC11380iw2, 1);
                C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw2, abstractC12990ll);
                C69436VnL c69436VnL = (C69436VnL) this.A02;
                String str4 = this.A04;
                C65761Ttc.A00(A01, c69436VnL, "ig_quiet_mode_confirmation_toast_edit_tap", str4);
                AbstractC31178DnM.A0j((Activity) this.A01, AbstractC31178DnM.A06("entrypoint", str4), abstractC12990ll, ModalActivity.class, "quiet_mode_settings");
                return;
            case 9:
                if (C1VE.A02 == null) {
                    return;
                }
                UserSession userSession3 = (UserSession) this.A03;
                EnumC33408Epf A012 = AbstractC35219FgC.A01(this.A04);
                long A07 = AbstractC31174DnI.A07(userSession3);
                Integer num3 = C05F.A0H;
                Long valueOf = Long.valueOf(A07);
                C16920sk c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C461329x.A04(userSession3, A012, num3, valueOf, c16920sk);
                AbstractC31176DnK.A0d((Activity) this.A02, AbstractC166987dD.A0b(), userSession3, ModalActivity.class, AbstractC111324zv.A00(5497)).A0C((Context) this.A01);
                return;
            case 10:
                C1VE c1ve = C1VE.A02;
                if (c1ve == null) {
                    return;
                }
                UserSession userSession4 = (UserSession) this.A03;
                EnumC33408Epf A013 = AbstractC35219FgC.A01(this.A04);
                long A072 = AbstractC31174DnI.A07(userSession4);
                Integer num4 = C05F.A0H;
                Long valueOf2 = Long.valueOf(A072);
                C16920sk c16920sk2 = C16920sk.A00;
                C14360o3.A0C(c16920sk2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C461329x.A04(userSession4, A013, num4, valueOf2, c16920sk2);
                AbstractC31177DnL.A16(C1VE.A00(c1ve).A01(userSession4, EnumC33408Epf.A0I), (FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                return;
            default:
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
                String str5 = this.A04;
                User user = (User) this.A02;
                C41181vS c41181vS = (C41181vS) this.A03;
                UserSession userSession5 = reelDashboardFragment.A06;
                C14360o3.A0B(userSession5, 0);
                AbstractC31278Dp0.A0H(userSession5, str5, user.getId());
                C38264Gs7 c38264Gs7 = (C38264Gs7) reelDashboardFragment.mListAdapter.A0C.get(c41181vS.A0j);
                if (c38264Gs7 != null) {
                    C37986GnW c37986GnW = c38264Gs7.A0k;
                    C41181vS c41181vS2 = c37986GnW.A03;
                    c41181vS2.getClass();
                    C35003Fba c35003Fba = c41181vS2.A04;
                    if (c35003Fba != null) {
                        c35003Fba.A00(user);
                        c37986GnW.A07();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
