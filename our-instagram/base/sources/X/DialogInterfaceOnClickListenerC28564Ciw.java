package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Ciw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28564Ciw implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DialogInterfaceOnClickListenerC28564Ciw(C6FQ c6fq, C102884kP c102884kP, InterfaceC09390do interfaceC09390do, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 2:
            case 3:
            case 4:
                this.A02 = c6fq;
                this.A03 = c102884kP;
                this.A01 = interfaceC09390do;
                break;
            case 1:
            default:
                this.A03 = c6fq;
                this.A01 = c102884kP;
                this.A02 = interfaceC09390do;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C6FQ c6fq;
        InterfaceC103384lE A0A;
        Object obj;
        InterfaceC83733oI interfaceC83733oI;
        switch (this.A00) {
            case 0:
            case 2:
            case 3:
            case 4:
                c6fq = (C6FQ) this.A02;
                A0A = ((C102884kP) this.A03).A0A();
                obj = this.A01;
                C131845xK.A00(c6fq, (C6FW) AbstractC166987dD.A17((InterfaceC09390do) obj), A0A);
                return;
            case 1:
                c6fq = (C6FQ) this.A03;
                A0A = ((C102884kP) this.A01).A0A();
                obj = this.A02;
                C131845xK.A00(c6fq, (C6FW) AbstractC166987dD.A17((InterfaceC09390do) obj), A0A);
                return;
            case 5:
                C7TT c7tt = (C7TT) this.A02;
                Map map = c7tt.A0e;
                if (map == null || (interfaceC83733oI = c7tt.A0P) == null) {
                    return;
                }
                InterfaceC37261oP A00 = C37321oV.A00();
                C7UA c7ua = (C7UA) this.A03;
                FragmentActivity fragmentActivity = (FragmentActivity) c7ua.A02.invoke();
                UserSession userSession = ((C7VI) c7ua).A00.A00;
                User user = (User) this.A01;
                if (user == null) {
                    return;
                }
                A00.Cgm(fragmentActivity, userSession, user, interfaceC83733oI.toString(), "CreatorAIBetaDisclosure", map);
                return;
            case 6:
                C14360o3.A0B(dialogInterface, 0);
                LnQ lnQ = (LnQ) this.A02;
                C3o9 c3o9 = (C3o9) this.A03;
                LnQ.A00(null, null, lnQ, (AbstractC46511KiA) this.A01, c3o9, null, C30089DNx.A00, C30445Daq.A00, C30748Dfl.A00, false);
                dialogInterface.dismiss();
                return;
            case 7:
                LnQ lnQ2 = (LnQ) this.A02;
                C3o9 c3o92 = (C3o9) this.A03;
                LnQ.A00(null, null, lnQ2, (AbstractC46511KiA) this.A01, c3o92, null, C30090DNy.A00, new C25344BJn(lnQ2, 32), new MCZ(lnQ2, 2), true);
                return;
            case 8:
                AbstractC27671Vv abstractC27671Vv = (AbstractC27671Vv) this.A02;
                UserSession userSession2 = (UserSession) this.A03;
                Context context = (Context) this.A01;
                C29812DDe c29812DDe = C29812DDe.A00;
                C14360o3.A0B(c29812DDe, 2);
                abstractC27671Vv.A00(context, userSession2).A0A(c29812DDe);
                dialogInterface.dismiss();
                return;
            case 9:
                AbstractC51174MjI.A01((C128175qm) this.A01, (C47Z) this.A02, (AbstractC51174MjI) this.A03);
                return;
            case 10:
                AbstractC40768I4w.A00((Fragment) this.A01, (UserSession) this.A03, (C38321qM) this.A02);
                return;
            default:
                return;
        }
    }

    public DialogInterfaceOnClickListenerC28564Ciw(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }
}
