package X;

import android.content.DialogInterface;
import android.widget.CompoundButton;
import androidx.activity.ComponentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.OfP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnCancelListenerC55251OfP implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnCancelListenerC55251OfP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C193328hC c193328hC, Object obj, int i) {
        c193328hC.A0C(new DialogInterfaceOnCancelListenerC55251OfP(obj, i));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C22C A01;
        String str;
        switch (this.A00) {
            case 0:
            case 1:
                A01 = AnonymousClass229.A01(((MXB) this.A01).A08);
                str = "EXIT_DIALOG_CANCEL";
                break;
            case 2:
                C8YE c8ye = ((EditMediaInfoFragment) this.A01).A0Q;
                if (c8ye == null) {
                    return;
                }
                C8YE.A00(c8ye);
                return;
            case 3:
                A01 = AnonymousClass229.A01((UserSession) this.A01);
                str = "RESUME_DRAFT_EXIT_DIALOG_CANCEL";
                break;
            case 4:
                ((CompoundButton) this.A01).setChecked(false);
                return;
            case 5:
                ((InterfaceC16660sJ) this.A01).invoke(null);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                ((C145256gk) this.A01).A00();
                return;
            case 10:
                ((C54460O4o) this.A01).A00.A0H.A03(new C56698PEq(false));
                return;
            case 11:
                ((InterfaceC58068Pot) this.A01).D20();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C50685MZd.A00((C50685MZd) this.A01).A06(NVX.A00);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((ComponentActivity) this.A01).onBackPressed();
                return;
            case 14:
                ((C145176gc) this.A01).A18.EJJ();
                return;
        }
        A01.A1m(str);
    }
}
