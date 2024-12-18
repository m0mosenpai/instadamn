package X;

import android.content.DialogInterface;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder;
import java.util.List;

/* renamed from: X.OfL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnCancelListenerC55247OfL implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DialogInterfaceOnCancelListenerC55247OfL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        String str;
        switch (this.A00) {
            case 0:
                W55 w55 = (W55) this.A01;
                C42961yO.A0A.A05(new GS6((android.net.Uri) this.A02, w55, "cancel"));
                return;
            case 1:
                C131845xK.A00((C6FQ) this.A01, C6FW.A01, (InterfaceC103384lE) this.A02);
                return;
            case 2:
                ImmersiveReplyControlMenuViewBinder.A02(EnumC27369C5y.A02, (InterfaceC24901Jp) this.A01);
                return;
            case 3:
                ((C191578eE) this.A02).A06.A1O((EnumC50631MWs) this.A01, null, "PANAVIDEO_NOTIFICATION_CANCEL");
                return;
            case 4:
                ((C191578eE) this.A02).A06.A1O((EnumC50631MWs) this.A01, AbstractC166997dE.A0b(), "PANAVIDEO_NOTIFICATION_CANCEL");
                return;
            case 5:
                LLk.A0O((LLk) this.A01, "direct_request_allow_dialog_cancel", (List) this.A02);
                return;
            case 6:
            case 7:
                ((InterfaceC55362gb) this.A02).Dcp((C4NJ) this.A01);
                return;
            case 8:
            default:
                return;
            case 9:
                C33243Eld c33243Eld = (C33243Eld) this.A01;
                AbstractC35237FgW.A05(c33243Eld.A01, (CompoundButton) this.A02, false);
                return;
            case 10:
                GIF.A02((FragmentActivity) this.A02, (GIF) this.A01);
                return;
            case 11:
                C51041Mgr c51041Mgr = (C51041Mgr) ((C56044OuG) this.A02).A08.getValue();
                C105824pt c105824pt = ((C52997NcV) ((AbstractC53572Nme) this.A01)).A00.A0c;
                if (c105824pt != null) {
                    str = c105824pt.A0X;
                    str.getClass();
                } else {
                    str = null;
                }
                c51041Mgr.A03(str);
                PZD.A02(c51041Mgr, AbstractC141776au.A00(c51041Mgr), 29);
                return;
        }
    }
}
