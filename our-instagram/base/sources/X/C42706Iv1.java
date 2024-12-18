package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.api.SaveApiUtil;

/* renamed from: X.Iv1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42706Iv1 implements JPc {
    public final FragmentActivity A00;
    public final InterfaceC60442pS A01;
    public final EnumC39626Hek A02;
    public final C1M1 A03;

    @Override // X.JPc
    public final boolean ABD() {
        return true;
    }

    @Override // X.JGC
    public final void D4F(UserSession userSession, String str, String str2) {
        new ILL(userSession, this.A01.getModuleName()).A00(this.A00, str, "igtv_user_view_profile_button");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.ICf, java.lang.Object] */
    @Override // X.JPc
    public final void D4O(Context context, UserSession userSession, C38321qM c38321qM, int i) {
        EnumC77213d7 enumC77213d7;
        FragmentActivity fragmentActivity = this.A00;
        C1M1 c1m1 = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        boolean CcN = c38321qM.CcN();
        C172077lc.A00(userSession).A04(c38321qM, C05F.A01);
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        if (CcN) {
            enumC77213d7 = EnumC77213d7.A03;
        } else {
            enumC77213d7 = EnumC77213d7.A04;
        }
        SaveApiUtil.A04(fragmentActivity, context, userSession, c38321qM, interfaceC60442pS, null, enumC77213d7, null, c1m1, null, null, null, i, 0, -1);
        ?? obj = new Object();
        obj.A00 = c38321qM;
        A00.E4s(new C36110Fwk(obj, EnumC33416Epn.A05, null, false));
        int i2 = 2131972832;
        if (CcN) {
            i2 = 2131976210;
        }
        C9GR.A01(context, null, i2, 0);
    }

    public C42706Iv1(FragmentActivity fragmentActivity, InterfaceC60442pS interfaceC60442pS, EnumC39626Hek enumC39626Hek, C1M1 c1m1) {
        this.A00 = fragmentActivity;
        this.A01 = interfaceC60442pS;
        this.A03 = c1m1;
        this.A02 = enumC39626Hek;
    }

    @Override // X.JPc
    public final void D3p(Context context, DialogInterfaceOnDismissListenerC41846Ig0 dialogInterfaceOnDismissListenerC41846Ig0, JPd jPd, EnumC39625Hej enumC39625Hej) {
        C193328hC A0O;
        int i;
        switch (enumC39625Hej.ordinal()) {
            case 0:
                dialogInterfaceOnDismissListenerC41846Ig0.A00(jPd);
                return;
            case 1:
                I1Z.A00(null, dialogInterfaceOnDismissListenerC41846Ig0.A01, dialogInterfaceOnDismissListenerC41846Ig0.A02, jPd.BQN());
                return;
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            default:
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Option: ");
                A1C.append(enumC39625Hej);
                A1C.append(" not supported, Entry point: ");
                A1C.append(this.A02);
                C0w9.A03("IGTVLongPressOptionsHandlerImpl.onClickExtraMenuOptions", AbstractC166997dE.A0x(".getEntryPointString()", A1C));
                return;
            case 3:
                AbstractC41766Iei.A00(dialogInterfaceOnDismissListenerC41846Ig0.A01.requireContext(), dialogInterfaceOnDismissListenerC41846Ig0.A03, dialogInterfaceOnDismissListenerC41846Ig0.A02, jPd.BQN(), jPd.AiE());
                return;
            case 4:
                AbstractC59962oe abstractC59962oe = dialogInterfaceOnDismissListenerC41846Ig0.A01;
                UserSession userSession = dialogInterfaceOnDismissListenerC41846Ig0.A02;
                C38321qM BQN = jPd.BQN();
                String id = jPd.getId();
                if (id != null) {
                    AbstractC41766Iei.A06(abstractC59962oe, dialogInterfaceOnDismissListenerC41846Ig0.A03, userSession, BQN, id, AbstractC111324zv.A00(2521));
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 5:
                AbstractC59962oe abstractC59962oe2 = dialogInterfaceOnDismissListenerC41846Ig0.A01;
                UserSession userSession2 = dialogInterfaceOnDismissListenerC41846Ig0.A02;
                C38321qM BQN2 = jPd.BQN();
                String id2 = jPd.getId();
                if (id2 != null) {
                    AbstractC41766Iei.A05(abstractC59962oe2, dialogInterfaceOnDismissListenerC41846Ig0.A03, userSession2, BQN2, id2, AbstractC111324zv.A00(2521));
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 6:
                FragmentActivity requireActivity = dialogInterfaceOnDismissListenerC41846Ig0.A01.requireActivity();
                UserSession userSession3 = dialogInterfaceOnDismissListenerC41846Ig0.A02;
                String str = dialogInterfaceOnDismissListenerC41846Ig0.A04;
                C38321qM BQN3 = jPd.BQN();
                String id3 = jPd.getId();
                if (id3 != null) {
                    AbstractC41766Iei.A04(requireActivity, userSession3, BQN3, str, id3);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC41766Iei.A01(dialogInterfaceOnDismissListenerC41846Ig0.A01.requireContext(), dialogInterfaceOnDismissListenerC41846Ig0.A02, jPd.BQN(), dialogInterfaceOnDismissListenerC41846Ig0.A03, dialogInterfaceOnDismissListenerC41846Ig0.A04);
                return;
            case 14:
                AbstractC41766Iei.A07(dialogInterfaceOnDismissListenerC41846Ig0.A01, dialogInterfaceOnDismissListenerC41846Ig0.A02);
                return;
            case Process.SIGTERM /* 15 */:
                AbstractC41766Iei.A02(dialogInterfaceOnDismissListenerC41846Ig0, dialogInterfaceOnDismissListenerC41846Ig0.A01, dialogInterfaceOnDismissListenerC41846Ig0.A02, jPd.BQN());
                return;
            case 16:
                AbstractC41766Iei.A03(dialogInterfaceOnDismissListenerC41846Ig0, dialogInterfaceOnDismissListenerC41846Ig0.A01, dialogInterfaceOnDismissListenerC41846Ig0.A02, jPd.BQN(), jPd.CY4());
                return;
            case 17:
                AbstractC59962oe abstractC59962oe3 = dialogInterfaceOnDismissListenerC41846Ig0.A01;
                UserSession userSession4 = dialogInterfaceOnDismissListenerC41846Ig0.A02;
                C38321qM BQN4 = jPd.BQN();
                A0O = AbstractC31175DnJ.A0O(abstractC59962oe3);
                A0O.A0A(2131976690);
                A0O.A09(2131976689);
                A0O.A0K(new Og5(3, dialogInterfaceOnDismissListenerC41846Ig0, abstractC59962oe3, userSession4, BQN4), 2131964218);
                i = 15;
                break;
            case 18:
                A0O = AbstractC31171DnF.A0H(dialogInterfaceOnDismissListenerC41846Ig0.A01.requireActivity());
                A0O.A0A(2131964227);
                A0O.A09(2131964226);
                A0O.A0L(DialogInterfaceOnClickListenerC41836Ifq.A00(jPd, 17), 2131972171);
                i = 18;
                break;
            case 21:
                AbstractC41766Iei.A08(dialogInterfaceOnDismissListenerC41846Ig0.A01, dialogInterfaceOnDismissListenerC41846Ig0.A02, jPd.BQN(), dialogInterfaceOnDismissListenerC41846Ig0.A03.getModuleName());
                return;
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C38321qM BQN5 = jPd.BQN();
                UserSession userSession5 = dialogInterfaceOnDismissListenerC41846Ig0.A02;
                EnumC39625Hej A00 = OPB.A00(BQN5);
                if (A00 == null) {
                    return;
                }
                OPB.A01(dialogInterfaceOnDismissListenerC41846Ig0.A01, userSession5, jPd.BQN(), A00, "videox_viewer");
                return;
            case 32:
                InterfaceC60442pS interfaceC60442pS = dialogInterfaceOnDismissListenerC41846Ig0.A03;
                AbstractC59962oe abstractC59962oe4 = dialogInterfaceOnDismissListenerC41846Ig0.A01;
                FragmentActivity requireActivity2 = abstractC59962oe4.requireActivity();
                C38321qM BQN6 = jPd.BQN();
                UserSession userSession6 = dialogInterfaceOnDismissListenerC41846Ig0.A02;
                if (!C37855Gl9.A0C(userSession6, BQN6)) {
                    return;
                }
                AbstractC86593tX.A0U(abstractC59962oe4, requireActivity2, C22P.A2p, interfaceC60442pS, userSession6, BQN6, null);
                return;
            case 33:
            case 34:
            case 35:
            case 36:
                AbstractC59962oe abstractC59962oe5 = dialogInterfaceOnDismissListenerC41846Ig0.A01;
                Context requireContext = abstractC59962oe5.requireContext();
                UserSession userSession7 = dialogInterfaceOnDismissListenerC41846Ig0.A02;
                C38321qM BQN7 = jPd.BQN();
                C37855Gl9.A00.A0H(requireContext, AbstractC018607g.A00(abstractC59962oe5), userSession7, BQN7, dialogInterfaceOnDismissListenerC41846Ig0.A03.getModuleName());
                return;
        }
        AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC41836Ifq.A00(dialogInterfaceOnDismissListenerC41846Ig0, i), A0O);
    }
}
