package X;

import android.content.DialogInterface;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Ogm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnDismissListenerC55324Ogm implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnDismissListenerC55324Ogm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C193328hC c193328hC, Object obj, int i) {
        c193328hC.A0g(new DialogInterfaceOnDismissListenerC55324Ogm(obj, i));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC1118853a interfaceC1118853a;
        Object A1B;
        switch (this.A00) {
            case 0:
                C1Y6.A01((C1Y6) this.A01);
                return;
            case 1:
                A1B = AbstractC25226BEj.A1B(this.A01);
                AbstractC166987dD.A1Y(A1B);
                return;
            case 2:
                AbstractC23021Ah.A00(((C52254NAu) this.A01).A0P).A1a(true);
                return;
            case 3:
                if (dialogInterface == null) {
                    return;
                }
                MXB mxb = (MXB) this.A01;
                if (!dialogInterface.equals(mxb.A00)) {
                    return;
                }
                mxb.A00 = null;
                mxb.A02 = null;
                return;
            case 4:
            case 10:
            case 14:
            case 20:
            default:
                A1B = this.A01;
                AbstractC166987dD.A1Y(A1B);
                return;
            case 5:
                ((C8JT) this.A01).A0d = false;
                return;
            case 6:
                ((C23031Ai) this.A01).A1f(true);
                return;
            case 7:
                AbstractC167007dF.A0x(((EditMediaInfoFragment) this.A01).mPostOverlayView);
                return;
            case 8:
                ((NA1) this.A01).A03.getParentFragmentManager().A12();
                return;
            case 9:
                N5Z n5z = ((C56449P4k) this.A01).A01;
                n5z.A0R = false;
                n5z.A01 = null;
                return;
            case 11:
                OAE oae = ((C55040OZm) this.A01).A05;
                CallerContext callerContext = AbstractC50624MWl.A01;
                MSY.A1F(oae.A01.A00());
                C38262Gs5 c38262Gs5 = oae.A02.mListAdapter;
                if (c38262Gs5 == null) {
                    return;
                }
                c38262Gs5.A08();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                N5U n5u = (N5U) this.A01;
                N5U.A04(n5u);
                N5U.A05(n5u);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((InterfaceC58153PqI) this.A01).onDismiss();
                return;
            case Process.SIGTERM /* 15 */:
                return;
            case 16:
                DialogInterface.OnDismissListener onDismissListener = ((C55909Os0) this.A01).A01;
                if (onDismissListener == null) {
                    return;
                }
                onDismissListener.onDismiss(dialogInterface);
                return;
            case 17:
                interfaceC1118853a = ((OC7) this.A01).A02;
                break;
            case 18:
                AbstractC167017dG.A0y(AbstractC31172DnG.A0C(this.A01), C3DN.A00);
                return;
            case Process.SIGSTOP /* 19 */:
                ((C54460O4o) this.A01).A00.A0H.A03(new C56698PEq(false));
                return;
            case 21:
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(((AbstractC51174MjI) this.A01).A07));
                A0w.E77("has_seen_share_to_direct_dialog_from_draft", true);
                A0w.apply();
                return;
            case 22:
                interfaceC1118853a = ((C145176gc) this.A01).A18;
                break;
        }
        interfaceC1118853a.EJJ();
    }
}
