package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.GGw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36727GGw implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;
    public final Object A02;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C36727GGw(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.2pF] */
    @Override // X.InterfaceC1119153d
    public final void Czx() {
        UserSession userSession;
        C22P c22p;
        Activity activity;
        Activity activity2;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                C45466KBb c45466KBb = (C45466KBb) this.A02;
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(c45466KBb.A0j()));
                A0w.E77(AbstractC43591JPw.A00(1022), true);
                A0w.apply();
                if (((C14510oO) this.A01).A00) {
                    C45466KBb.A0R(c45466KBb, AbstractC43591JPw.A00(431));
                    return;
                }
                IgEditText igEditText = c45466KBb.A0I;
                if (igEditText == null) {
                    str = "noteEditText";
                    break;
                } else {
                    F3X.A00(igEditText);
                    return;
                }
            case 1:
                C31727DwY c31727DwY = (C31727DwY) this.A02;
                View view = c31727DwY.A01;
                int i2 = c31727DwY.A00;
                if (i2 >= 0 && view != null) {
                    ((C50676MYu) c31727DwY.A04.A05.A01.get(i2)).A0A.onClick(view);
                    InterfaceC145226gh interfaceC145226gh = c31727DwY.A03.A03;
                    if (interfaceC145226gh != null) {
                        interfaceC145226gh.DkJ(view, c31727DwY.A00);
                    }
                } else {
                    InterfaceC145226gh interfaceC145226gh2 = c31727DwY.A03.A03;
                    if (interfaceC145226gh2 != null && i2 == -2) {
                        interfaceC145226gh2.DB7();
                    }
                }
                c31727DwY.A01 = null;
                c31727DwY.A00 = -2;
                return;
            case 2:
                ENN enn = (ENN) this.A02;
                Fragment fragment = (Fragment) this.A01;
                User user = enn.A02;
                if (user == null) {
                    return;
                }
                String id = user.getId();
                InterfaceC09390do interfaceC09390do = enn.A0L;
                if (!C14360o3.A0K(id, AbstractC31173DnH.A0t(interfaceC09390do))) {
                    return;
                }
                enn.A02 = null;
                C1DX A0Z = AbstractC31176DnK.A0Z(interfaceC09390do);
                String str2 = enn.A07;
                if (str2 == null) {
                    str = "mediaId";
                    break;
                } else {
                    C38321qM A02 = A0Z.A02(str2);
                    if (A02 != null) {
                        AbstractC31364DqT.A03().A00(fragment, AbstractC018607g.A00(fragment), enn, null, null, AbstractC166987dD.A0r(interfaceC09390do), A02.A1g(AbstractC166987dD.A0r(interfaceC09390do)));
                        return;
                    }
                    C9GR.A03(enn.getContext(), enn.getString(2131966067), "media_cache_retrieval_failed", 0);
                    return;
                }
            case 3:
                FQN fqn = (FQN) this.A02;
                ?? obj = new Object();
                Integer num = fqn.A01;
                if (num == null) {
                    return;
                }
                boolean z = true;
                switch (num.intValue()) {
                    case 0:
                        userSession = fqn.A04;
                        C1571673v.A05(fqn.A03, userSession, EnumC1571773w.A05, "post_creation_tap", userSession.userId);
                        C43822JZk A00 = AbstractC208269Jl.A00(userSession);
                        c22p = C22P.A43;
                        A00.A07(c22p, true);
                        activity = fqn.A02;
                        z = false;
                        AbstractC35094Fd5.A02(activity, c22p, userSession, null, z, z);
                        break;
                    case 1:
                        UserSession userSession2 = fqn.A04;
                        C1571673v.A05(fqn.A03, userSession2, EnumC1571773w.A05, "story_creation_tap", userSession2.userId);
                        C43822JZk A002 = AbstractC208269Jl.A00(userSession2);
                        C22P c22p2 = C22P.A43;
                        A002.A07(c22p2, true);
                        AbstractC35094Fd5.A01(fqn.A02, c22p2, userSession2, null, null, 17452);
                        break;
                    case 2:
                        UserSession userSession3 = fqn.A04;
                        C1571673v.A06(fqn.A03, userSession3, EnumC1571773w.A05, MSV.A00(464), userSession3.userId, "user_profile_header");
                        AbstractC50558MTp.A06(fqn.A02, EnumC53243Ngg.A0G, userSession3, true);
                        break;
                    case 3:
                        UserSession userSession4 = fqn.A04;
                        C1571673v.A05(fqn.A03, userSession4, EnumC1571773w.A05, "reel_creation_tap", userSession4.userId);
                        C43822JZk A003 = AbstractC208269Jl.A00(userSession4);
                        C22P c22p3 = C22P.A43;
                        A003.A07(c22p3, true);
                        INH A0C = AbstractC86593tX.A0C(c22p3);
                        A0C.A0m = true;
                        A0C.A0B = null;
                        A0C.A0v = !C18U.A06(C06090Tz.A05, userSession4, 36329367420289321L);
                        Bundle A004 = A0C.A00();
                        A004.putBoolean("modal_dismiss_on_cancel", true);
                        if (AbstractC55822hN.A01(userSession4)) {
                            A004.putBoolean(AbstractC111324zv.A00(283), true);
                        }
                        AbstractC31176DnK.A0w(fqn.A02, A004, userSession4, "clips_camera");
                        break;
                    case 4:
                        UserSession userSession5 = fqn.A04;
                        C1571673v.A05(fqn.A03, userSession5, EnumC1571773w.A05, "live_creation_tap", userSession5.userId);
                        AbstractC208269Jl.A00(userSession5).A07(C22P.A43, true);
                        AbstractC31176DnK.A0w(fqn.A02, AbstractC166987dD.A0b(), userSession5, "universal_creation_live_camera");
                        break;
                    case 5:
                        UserSession userSession6 = fqn.A04;
                        C1571673v.A05(fqn.A03, userSession6, EnumC1571773w.A05, "ai_creation_tap", userSession6.userId);
                        boolean A06 = C18U.A06(AbstractC166997dE.A0U(userSession6), userSession6, 36330101860090558L);
                        String A005 = AbstractC111324zv.A00(1498);
                        Bundle A0b = AbstractC166987dD.A0b();
                        if (A06) {
                            A0b.putString(A005, "universal_create_menu");
                            activity2 = fqn.A02;
                            i = 3481;
                        } else {
                            A0b.putString(A005, "universal_create_menu");
                            A0b.putBoolean(AbstractC111324zv.A00(452), C18U.A06(C06090Tz.A05, userSession6, 36330101859893947L));
                            activity2 = fqn.A02;
                            i = 3483;
                        }
                        C6XJ A03 = C6XJ.A03(activity2, A0b, userSession6, ModalActivity.class, AbstractC111324zv.A00(i));
                        A03.A08();
                        A03.A0C(activity2);
                        break;
                    case 6:
                        UserSession userSession7 = fqn.A04;
                        C1571673v.A05(fqn.A03, userSession7, EnumC1571773w.A05, "made_for_you_creation_tap", userSession7.userId);
                        Activity activity3 = fqn.A02;
                        AbstractC46689Kl6.A00(activity3, AbstractC166987dD.A0O(activity3), EnumC33503Erc.ACR_BROWSER_ENTRY_POINT_PROFILE_CREATION_MENU, C22P.A3v, userSession7, obj);
                        break;
                    case 7:
                        C1Y6 A006 = AbstractC69888VxF.A00();
                        UserSession userSession8 = fqn.A04;
                        Activity activity4 = fqn.A02;
                        C14360o3.A0C(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        A006.A09((FragmentActivity) activity4, userSession8, "universal_creation_menu");
                        break;
                    case 8:
                        UserSession userSession9 = fqn.A04;
                        C1571673v.A05(fqn.A03, userSession9, EnumC1571773w.A05, "fundraiser_creation_tap", userSession9.userId);
                        Activity activity5 = fqn.A02;
                        HashMap A1G = AbstractC166987dD.A1G();
                        A1G.put("source_name", "PROFILE_COMPOSER");
                        C66277U6x A01 = C66277U6x.A01("com.instagram.social_impact.standalone_fundraiser_creation.view", A1G);
                        IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(userSession9);
                        A0C2.A0l = false;
                        A0C2.A0U = "";
                        A0C2.A0i = true;
                        AbstractC31177DnL.A0n(activity5, W6d.A00(A0C2, A01), userSession9, ModalActivity.class, "bloks");
                        break;
                    case 10:
                        InterfaceC37154GYr A012 = AbstractC35055FcS.A01(fqn.A04, new ChannelCreationFlowExtraArgs(null, null, null), ChannelCreationSource.A0A, null, false);
                        Activity activity6 = fqn.A02;
                        C14360o3.A0C(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        A012.Cgf((FragmentActivity) activity6);
                        break;
                    case 11:
                        userSession = fqn.A04;
                        C1571673v.A05(fqn.A03, userSession, EnumC1571773w.A05, "quiet_post_creation_tap", userSession.userId);
                        C43822JZk A007 = AbstractC208269Jl.A00(userSession);
                        c22p = C22P.A43;
                        A007.A07(c22p, true);
                        activity = fqn.A02;
                        AbstractC35094Fd5.A02(activity, c22p, userSession, null, z, z);
                        break;
                }
                fqn.A01 = null;
                return;
            case 4:
                C455127l.A03((UserSession) this.A02).A0S();
                ((FI9) this.A01).A00.invoke();
                return;
            default:
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
