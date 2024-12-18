package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.MDy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50171MDy extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50171MDy(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v27, types: [X.92z, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AbstractC52922bZ abstractC52922bZ;
        C141796aw A00;
        Object obj;
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        MCG mcg;
        Context requireContext;
        int i2;
        String A0f;
        String str;
        Object invoke;
        Object invoke2;
        C07N c07n;
        Object invoke3;
        switch (this.A00) {
            case 0:
                return AbstractC46921Kp2.A00((UserSession) this.A02, ((DirectShareTarget) this.A01).A01());
            case 1:
                return new C47332Fc((Context) this.A01, (UserSession) this.A02);
            case 2:
                Fragment fragment = (Fragment) this.A02;
                requireContext = fragment.requireContext();
                i2 = 0;
                A0f = AbstractC167007dF.A0f(fragment.requireContext(), ((C2ED) this.A01).C7l(), 2131963946);
                str = "message_send_failure";
                C9GR.A00(requireContext, A0f, str, i2);
                return C0eB.A00;
            case 3:
                Fragment fragment2 = (Fragment) this.A02;
                requireContext = fragment2.requireContext();
                i2 = 0;
                A0f = AbstractC167007dF.A0f(fragment2.requireContext(), ((C2ED) this.A01).C7l(), 2131963946);
                str = "image_send_failure";
                C9GR.A00(requireContext, A0f, str, i2);
                return C0eB.A00;
            case 4:
                AbstractC161537Lo.A02(null, (InterfaceC25195BCs) ((C7HW) this.A02).A00.invoke(this.A01));
                return C0eB.A00;
            case 5:
                return new C48510Ld2(AbstractC166987dD.A0O((Context) this.A01), (UserSession) this.A02);
            case 6:
                return new C56140Ow0(AbstractC166987dD.A0O((Context) this.A01), (UserSession) this.A02);
            case 7:
                ScheduledExecutorService scheduledExecutorService = AbstractC55065OaL.A08;
                Context context = (Context) this.A01;
                UserSession userSession = (UserSession) this.A02;
                C54412O2s c54412O2s = new C54412O2s(userSession);
                String A04 = C18U.A04(C06090Tz.A05, userSession, 36891183502525336L);
                C14360o3.A0B(context, 0);
                return new C51452Mny(context, c54412O2s, A04);
            case 8:
                Context applicationContext = ((Context) this.A01).getApplicationContext();
                C14360o3.A0C(applicationContext, AbstractC111324zv.A00(19));
                return new StellaIpcDirectMessagingServiceClient((Application) applicationContext, (UserSession) this.A02);
            case 9:
                Context context2 = (Context) this.A01;
                UserSession userSession2 = (UserSession) this.A02;
                return new C48525LdN(context2, AbstractC12220kQ.A02(userSession2), userSession2);
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 18:
            case 43:
            case 44:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null && (invoke2 = interfaceC16820sZ.invoke()) != null) {
                    return invoke2;
                }
                return AbstractC25231BEo.A0V(this.A02);
            case 11:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 != null && (invoke = interfaceC16820sZ2.invoke()) != null) {
                    return invoke;
                }
                return ((ComponentActivity) this.A02).getDefaultViewModelCreationExtras();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 23:
            case 24:
            case 26:
            case 28:
            case 30:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case Seq.NULL_REFNUM /* 41 */:
            case 45:
            default:
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ3 == null || (invoke3 = interfaceC16820sZ3.invoke()) == null) {
                    InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A02);
                    if ((A0i instanceof C07N) && (c07n = (C07N) A0i) != null) {
                        return c07n.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke3;
            case 14:
                ((InterfaceC74953Yl) this.A02).Egh(this.A01);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                return new FQ2((C23031Ai) this.A01, (UserSession) this.A02);
            case 16:
                return new ContentFilterEngineImpl(C12L.A00, (UserSession) this.A02, new Object(), (ContentFilterDictionaryRegistrar) this.A01);
            case 17:
                UserSession userSession3 = (UserSession) this.A02;
                return new LEW((InterfaceC11380iw) this.A01, userSession3, userSession3.userId);
            case Process.SIGSTOP /* 19 */:
                C39141HKu c39141HKu = (C39141HKu) this.A02;
                C1M1 c1m1 = c39141HKu.A08;
                AbstractC59962oe abstractC59962oe = c39141HKu.A00;
                UserSession userSession4 = c39141HKu.A02;
                InterfaceC60442pS interfaceC60442pS = c39141HKu.A06;
                ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = c39141HKu.A01;
                return new AjD(abstractC59962oe, viewOnTouchListenerC60632pm, userSession4, c39141HKu.A03, interfaceC60442pS, new C39C(abstractC59962oe, viewOnTouchListenerC60632pm, userSession4, interfaceC60442pS, (C33P) this.A01, c39141HKu.Br6(), c1m1, C39B.A09), c39141HKu.Br6(), c1m1);
            case 20:
                return new C37318GcK((UserSession) this.A02, (C1M6) this.A01, 2);
            case 21:
                C38P c38p = (C38P) this.A02;
                C64842wi c64842wi = c38p.A0P;
                if (c64842wi == null) {
                    C14360o3.A0F("quickPromotionDelegate");
                    throw C00O.createAndThrow();
                }
                c64842wi.Dcp((C4NL) this.A01);
                c38p.A0X.invoke();
                return C0eB.A00;
            case 22:
                EL5 el5 = (EL5) this.A02;
                FanClubConsiderationViewModel A002 = EL5.A00(el5);
                FragmentActivity requireActivity = el5.requireActivity();
                C32907Edo c32907Edo = (C32907Edo) this.A01;
                A002.A0E(requireActivity, c32907Edo.A07, c32907Edo.A08, c32907Edo.A0A, c32907Edo.A0B, c32907Edo.A0I);
                return C0eB.A00;
            case 25:
                UserSession userSession5 = (UserSession) this.A02;
                return new C48511Ld7(C12L.A00, userSession5, new LI9((Context) this.A01, userSession5, AbstractC54071NvV.A00(), AbstractC54273Nyt.A00(userSession5)));
            case 27:
                ((C25671My) this.A01).A02((InterfaceC41501vz) this.A02, C2AS.class);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                EIU eiu = (EIU) this.A02;
                MUD mud = (MUD) this.A01;
                InterfaceC09390do interfaceC09390do = eiu.A07;
                C99694dm A003 = AbstractC99684dl.A00(AbstractC166987dD.A0r(interfaceC09390do));
                String valueOf = String.valueOf(eiu.A04.getValue());
                String A0t = AbstractC31173DnH.A0t(interfaceC09390do);
                String A15 = AbstractC25225BEi.A15(eiu.A06);
                String str2 = mud.A02;
                String str3 = mud.A01;
                C45126Jxv c45126Jxv = (C45126Jxv) mud.A00;
                String str4 = c45126Jxv.A01;
                String str5 = c45126Jxv.A03;
                String valueOf2 = String.valueOf(eiu.A05.getValue());
                C14360o3.A0B(valueOf, 1);
                AbstractC25234BEr.A1R(A0t, A15, str2, str3, str4);
                AbstractC167007dF.A1I(str5, 7, valueOf2);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(A003.A00, "ig_fan_club_gifting_flow_select_plan_action");
                A0f2.AAP("container_module", "profile");
                AbstractC31178DnM.A17(A0f2, valueOf);
                A0f2.A9K("gift_sender_igid", AbstractC25228BEl.A13(A0t));
                A0f2.A9K("gift_recipient_igid", AbstractC25228BEl.A13(A15));
                A0f2.AAP("gift_price", str2);
                A0f2.AAP("gift_length", str3);
                A0f2.AAP("product_id", str4);
                A0f2.AAP("sku", str5);
                AbstractC31180DnO.A1I(A0f2, valueOf2);
                FanClubGiftingViewModel fanClubGiftingViewModel = (FanClubGiftingViewModel) eiu.A08.getValue();
                FragmentActivity requireActivity2 = eiu.requireActivity();
                fanClubGiftingViewModel.A05.Egh(new C32919Ee0(fanClubGiftingViewModel.A00, false));
                C48511Ld7 c48511Ld7 = fanClubGiftingViewModel.A01;
                User user = (User) c45126Jxv.A00;
                String str6 = c45126Jxv.A03;
                String str7 = c45126Jxv.A01;
                String str8 = c45126Jxv.A02;
                AbstractC167027dH.A0a(1, user, str6, str7, str8);
                c48511Ld7.A02.put(AbstractC166987dD.A1L(user, str6), AbstractC208910l.A00(c48511Ld7.A03, C0JE.A00(new MBh(requireActivity2, c48511Ld7.A01, user, str6, str7, str8, null)), C10I.A00, Integer.MAX_VALUE));
                A00 = AbstractC141776au.A00(fanClubGiftingViewModel);
                mcg = new MCG(c45126Jxv, fanClubGiftingViewModel, (InterfaceC23621Ds) null, 1);
                AbstractC166987dD.A1Z(mcg, A00);
                return C0eB.A00;
            case 31:
                C45469KBe c45469KBe = (C45469KBe) this.A02;
                FR4 fr4 = new FR4(c45469KBe.requireActivity(), AbstractC166987dD.A0r(c45469KBe.A00));
                C51852Mvw c51852Mvw = (C51852Mvw) this.A01;
                fr4.A01(c51852Mvw.A0A, c51852Mvw.A08, c51852Mvw.A06);
                return C0eB.A00;
            case 32:
                C45469KBe c45469KBe2 = (C45469KBe) this.A02;
                String str9 = ((C26069Bfx) this.A01).A02;
                InterfaceC09390do interfaceC09390do2 = c45469KBe2.A00;
                new C6XJ(c45469KBe2.getActivity(), AbstractC31364DqT.A02().A01(AbstractC166987dD.A0r(interfaceC09390do2), AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do2), str9, "fan_club_guidance_user_list", C45469KBe.__redex_internal_original_name).A03()), AbstractC166987dD.A0o(interfaceC09390do2), ModalActivity.class, "profile").A0C(c45469KBe2.getActivity());
                return C0eB.A00;
            case 39:
                abstractC52922bZ = (AbstractC52922bZ) this.A02;
                A00 = AbstractC141776au.A00(abstractC52922bZ);
                obj = this.A01;
                interfaceC23621Ds = null;
                i = 15;
                mcg = new MCG(obj, abstractC52922bZ, interfaceC23621Ds, i);
                AbstractC166987dD.A1Z(mcg, A00);
                return C0eB.A00;
            case 40:
                abstractC52922bZ = (AbstractC52922bZ) this.A02;
                A00 = AbstractC141776au.A00(abstractC52922bZ);
                obj = this.A01;
                interfaceC23621Ds = null;
                i = 16;
                mcg = new MCG(obj, abstractC52922bZ, interfaceC23621Ds, i);
                AbstractC166987dD.A1Z(mcg, A00);
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                View.OnClickListener onClickListener = ((C51852Mvw) this.A01).A00;
                if (onClickListener != null) {
                    C51347Mm8 c51347Mm8 = (C51347Mm8) this.A02;
                    int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    onClickListener.onClick(c51347Mm8.A03);
                }
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C30E c30e = ((C26468Bmp) this.A02).A02;
                Object obj2 = this.A01;
                C14360o3.A0B(obj2, 0);
                c30e.A0Q.remove(obj2);
                return C0eB.A00;
            case 47:
                C49401LsZ c49401LsZ = new C49401LsZ((C51762Yz) this.A01);
                C26468Bmp c26468Bmp = (C26468Bmp) this.A02;
                c26468Bmp.A02.A0Q.add(c49401LsZ);
                return new C79353gg(new C50171MDy(46, c49401LsZ, c26468Bmp));
            case 48:
                ((C26389BlY) this.A02).A02.A0M((C33R) this.A01, null, false);
                return C0eB.A00;
            case 49:
                BF0 bf0 = new BF0(this.A01, 0);
                C26389BlY c26389BlY = (C26389BlY) this.A02;
                c26389BlY.A02.A0L(bf0, null, false);
                return new C79353gg(new C50171MDy(48, bf0, c26389BlY));
        }
    }
}
