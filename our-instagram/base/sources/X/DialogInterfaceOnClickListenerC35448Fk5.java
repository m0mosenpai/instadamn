package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.common.session.UserSession;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Fk5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35448Fk5 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public DialogInterfaceOnClickListenerC35448Fk5(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj3;
        this.A04 = obj2;
        this.A01 = obj;
        this.A03 = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Integer num;
        String str;
        String id;
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A02;
                UserSession userSession = (UserSession) this.A04;
                F3K.A00(context, userSession, new C36377G3d(1, this.A01, userSession, this.A03), C05F.A00);
                return;
            case 1:
                if (i != 0) {
                    if (i == 1) {
                        UserSession userSession2 = (UserSession) this.A04;
                        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                        AnonymousClass172 A00 = AbstractC35214Fg7.A00((InterfaceC50518MRv) this.A02);
                        if (A00 == null || (id = A00.getId()) == null) {
                            return;
                        }
                        WEz.A00(null, AbstractC69993VzD.A01(abstractC59962oe.requireActivity(), abstractC59962oe, userSession2, EnumC65855TvH.A0T, VG2.A0o, id));
                        return;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0c(AbstractC43591JPw.A00(1364), AbstractC43591JPw.A00(55), i));
                }
                UserSession userSession3 = (UserSession) this.A04;
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                InterfaceC50518MRv interfaceC50518MRv = (InterfaceC50518MRv) this.A02;
                C3o9 c3o9 = (C3o9) this.A03;
                Context requireContext = abstractC59962oe2.requireContext();
                boolean CVQ = interfaceC50518MRv.CVQ();
                AnonymousClass172 A002 = AbstractC35214Fg7.A00(interfaceC50518MRv);
                if (A002 == null) {
                    return;
                }
                String moduleName = abstractC59962oe2.getModuleName();
                int BJ8 = A002.BJ8();
                FollowStatus B7L = A002.B7L();
                if (JRE.A02(c3o9) != null) {
                    str = JRE.A07(c3o9);
                } else {
                    str = null;
                }
                F7C.A00(requireContext, abstractC59962oe2, null, userSession3, new FJ7(interfaceC50518MRv.Aa2().contains(userSession3.userId), interfaceC50518MRv.C7g()), null, null, A002, new C35199Ffr(AbstractC1578976y.A00(c3o9 instanceof MsysThreadId, CVQ), null, Boolean.valueOf(interfaceC50518MRv.isPending()), Boolean.valueOf(CVQ), moduleName, "direct_thread", B7L.name(), str, "DEFAULT", "DEFAULT", AbstractC166997dE.A0n(), BJ8), null, null);
                return;
            case 2:
                C35208Fg0 A003 = C35208Fg0.A04.A00();
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
                Integer num2 = C05F.A0N;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A03;
                Integer num3 = C05F.A1I;
                C14360o3.A0B(num3, 4);
                C35208Fg0.A01(interfaceC11380iw, abstractC12990ll, A003, num3, num2);
                C1UC c1uc = (FragmentActivity) this.A01;
                if (c1uc instanceof InterfaceC37222GaX) {
                    C14360o3.A0C(c1uc, "null cannot be cast to non-null type com.instagram.business.controller.BusinessConversionController");
                    ((InterfaceC37222GaX) c1uc).CJ5();
                    return;
                } else {
                    AbstractC10360h2 abstractC10360h2 = (AbstractC10360h2) this.A02;
                    abstractC10360h2.A18("reg_gdpr_entrance", 1);
                    abstractC10360h2.A0Z();
                    return;
                }
            case 3:
                C69730VuP c69730VuP = new C69730VuP((Hashtag) this.A04);
                c69730VuP.A08 = AbstractC25227BEk.A0p();
                Hashtag A004 = c69730VuP.A00();
                HashtagFollowButton hashtagFollowButton = (HashtagFollowButton) this.A01;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A02;
                GZ9 gz9 = (GZ9) this.A03;
                hashtagFollowButton.A01(interfaceC11380iw2, gz9, A004);
                gz9.D4c(A004);
                return;
            case 4:
                EnumC33316EoB enumC33316EoB = (EnumC33316EoB) this.A01;
                C07270a1 c07270a1 = (C07270a1) this.A04;
                enumC33316EoB.A00(c07270a1);
                dialogInterface.dismiss();
                Context context2 = (Context) this.A03;
                FM6 fm6 = (FM6) this.A02;
                AbstractC31176DnK.A11(context2, c07270a1, AbstractC31171DnF.A0R(fm6.A02), fm6.A01);
                return;
            case 5:
                EnumC33316EoB enumC33316EoB2 = (EnumC33316EoB) this.A01;
                enumC33316EoB2.A00((C07270a1) this.A03);
                dialogInterface.dismiss();
                InterfaceC37227Gac interfaceC37227Gac = (InterfaceC37227Gac) this.A02;
                if (interfaceC37227Gac == null) {
                    return;
                }
                C34691FQc c34691FQc = (C34691FQc) this.A04;
                switch (((C32982Efo) enumC33316EoB2).A00) {
                    case 4:
                        interfaceC37227Gac.Dki();
                        return;
                    case 5:
                        interfaceC37227Gac.Dkj();
                        return;
                    case 6:
                        interfaceC37227Gac.DQP();
                        return;
                    case 7:
                        interfaceC37227Gac.Do2(c34691FQc);
                        return;
                    case 8:
                        interfaceC37227Gac.Dkh();
                        return;
                    case 9:
                        interfaceC37227Gac.DV5();
                        return;
                    case 10:
                    case 11:
                    default:
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        interfaceC37227Gac.DoC();
                        return;
                }
            case 6:
                C83753oK c83753oK = (C83753oK) this.A02;
                C35272Fh7 c35272Fh7 = (C35272Fh7) this.A01;
                UserSession userSession4 = c35272Fh7.A04;
                C14360o3.A0B(userSession4, 0);
                C83753oK.A01(userSession4, "logout_password_saving_opt_in", "logout_spi", "spi", "logout_interaction");
                C83743oJ c83743oJ = (C83743oJ) this.A04;
                String str2 = userSession4.userId;
                InterfaceC11380iw interfaceC11380iw3 = new InterfaceC11380iw() { // from class: X.Fu6
                    public static final String __redex_internal_original_name = "LogoutDialogHelper$18$$ExternalSyntheticLambda0";

                    @Override // X.InterfaceC11380iw
                    public final String getModuleName() {
                        return AbstractC111324zv.A00(354);
                    }
                };
                Integer num4 = C05F.A0j;
                Context applicationContext = c35272Fh7.A01.getApplicationContext();
                Boolean bool = (Boolean) this.A03;
                c83743oJ.A08(applicationContext, interfaceC11380iw3, userSession4, bool, bool, num4, str2, true);
                C35272Fh7.A02(c83753oK, c35272Fh7, true);
                return;
            case 7:
                C1Q9 c1q9 = C1Q9.A1C;
                C07270a1 c07270a12 = (C07270a1) this.A04;
                C35230FgN A02 = c1q9.A02(c07270a12);
                EnumC31713DwI enumC31713DwI = EnumC31713DwI.A04;
                C35037FcA A06 = A02.A06(null, enumC31713DwI);
                InterfaceC37225Gaa interfaceC37225Gaa = (InterfaceC37225Gaa) this.A01;
                A06.A04("auth_type", interfaceC37225Gaa.AY9());
                A06.A02();
                FP3.A00.A00((AbstractC59962oe) this.A03, c07270a12, (InterfaceC37227Gac) this.A02, interfaceC37225Gaa, new C36553GAc(this, 0), enumC31713DwI);
                return;
            case 8:
            case 10:
                String A0g = AbstractC31171DnF.A0g(this.A04);
                ((C38321qM) this.A02).getId();
                C14360o3.A0A(dialogInterface);
                Activity activity = (Activity) this.A01;
                AbstractC31171DnF.A1P(activity);
                AbstractC31174DnI.A0d().A04((FragmentActivity) activity, (UserSession) this.A03, null, A0g, "view_self_opal_button", false, false);
                break;
            case 9:
                C35043FcG A0d = AbstractC31174DnI.A0d();
                String A0g2 = AbstractC31171DnF.A0g(this.A03);
                ((C38321qM) this.A02).getId();
                Activity activity2 = (Activity) this.A01;
                AbstractC31171DnF.A1P(activity2);
                A0d.A04((FragmentActivity) activity2, (UserSession) this.A04, null, A0g2, "view_user_opal_button", false, false);
                break;
            case 11:
                EM6 em6 = (EM6) this.A01;
                SavedCollection savedCollection = (SavedCollection) this.A02;
                List list = (List) this.A03;
                Runnable runnable = (Runnable) this.A04;
                EM6.A02(em6);
                SavedCollection savedCollection2 = em6.A0C;
                if (savedCollection2 == null) {
                    return;
                }
                AbstractC35260Fgu.A01(em6.requireContext(), em6, em6.A05, savedCollection2, savedCollection, runnable, list);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Context context3 = (Context) this.A02;
                C07270a1 c07270a13 = (C07270a1) this.A03;
                C83803oP c83803oP = (C83803oP) this.A04;
                String str3 = c83803oP.A05;
                if (str3 != null) {
                    String str4 = c83803oP.A06;
                    C14360o3.A0A(str4);
                    C1ON A04 = AbstractC35276FhB.A04(context3, c07270a13, str3, str4, c83803oP.A02());
                    A04.A00 = (C1P1) this.A01;
                    C1GJ.A03(A04);
                    boolean z = C31514Dsy.A04;
                    synchronized (C31514Dsy.class) {
                        C31514Dsy.A00 = System.currentTimeMillis();
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                InterfaceC37203GaE interfaceC37203GaE = (InterfaceC37203GaE) this.A02;
                interfaceC37203GaE.D6t();
                C31714DwJ c31714DwJ = new C31714DwJ(interfaceC37203GaE, 10);
                UserSession userSession5 = (UserSession) this.A04;
                AbstractC129875tr.A00(userSession5).A08((Activity) this.A01, c31714DwJ, userSession5, (User) this.A03);
                return;
            case 14:
                C56135Ovv c56135Ovv = (C56135Ovv) this.A03;
                BonusPromoDialogType bonusPromoDialogType = (BonusPromoDialogType) this.A01;
                if (bonusPromoDialogType == BonusPromoDialogType.A05) {
                    num = C05F.A0u;
                } else {
                    num = C05F.A1I;
                }
                c56135Ovv.A00(num, null, null, null);
                AbstractC166987dD.A1Z(new C57148PXa((UserSession) this.A04, bonusPromoDialogType, ((E6I) this.A02).A01, null, 1), AbstractC167017dG.A0w(C12L.A00, 891600198));
                return;
            default:
                return;
        }
        dialogInterface.dismiss();
    }

    public DialogInterfaceOnClickListenerC35448Fk5(Activity activity, UserSession userSession, C38321qM c38321qM, User user, int i) {
        this.A00 = i;
        switch (i) {
            case 8:
            case 10:
                this.A04 = user;
                this.A02 = c38321qM;
                this.A01 = activity;
                this.A03 = userSession;
                break;
            case 9:
            default:
                this.A03 = user;
                this.A02 = c38321qM;
                this.A01 = activity;
                this.A04 = userSession;
                break;
        }
    }
}
