package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.ETf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32505ETf extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ FragmentActivity A03;
    public final /* synthetic */ C6FQ A04;
    public final /* synthetic */ C6FW A05;
    public final /* synthetic */ InterfaceC103384lE A06;
    public final /* synthetic */ InterfaceC103384lE A07;
    public final /* synthetic */ UserSession A08;

    public C32505ETf(FragmentActivity fragmentActivity, C6FQ c6fq, C6FW c6fw, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, UserSession userSession, int i, int i2, int i3) {
        this.A03 = fragmentActivity;
        this.A08 = userSession;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A07 = interfaceC103384lE;
        this.A05 = c6fw;
        this.A04 = c6fq;
        this.A06 = interfaceC103384lE2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1042391553);
        InterfaceC103384lE interfaceC103384lE = this.A07;
        C131845xK.A00(this.A04, this.A05, interfaceC103384lE);
        C0f9.A0A(1177259845, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C0f9.A03(-2014555250);
        ED5 ed5 = (ED5) obj;
        int A0N = AbstractC167017dG.A0N(ed5, 1106761629);
        if (ed5.A04) {
            FragmentActivity fragmentActivity = this.A03;
            UserSession userSession = this.A08;
            int i = this.A02;
            int i2 = this.A01;
            int i3 = this.A00;
            InterfaceC103384lE interfaceC103384lE = this.A06;
            FK8 fk8 = new FK8(this.A04, this.A05, interfaceC103384lE);
            C14360o3.A0B(userSession, 1);
            if (fragmentActivity != null) {
                C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
                String str2 = ed5.A03;
                if (str2 != null) {
                    A0H.A05 = str2;
                    String str3 = ed5.A00;
                    if (str3 != null) {
                        A0H.A0r(str3);
                        String str4 = ed5.A01;
                        if (str4 != null) {
                            A0H.A0d(new DialogInterfaceOnClickListenerC35366Fih(fragmentActivity, fk8, userSession, i, i2, i3), str4);
                            String str5 = ed5.A02;
                            if (str5 != null) {
                                A0H.A0c(DialogInterfaceOnClickListenerC35454FkB.A00(userSession, 53), str5);
                                AbstractC166987dD.A1W(A0H);
                            } else {
                                str = "secondaryButtonText";
                            }
                        } else {
                            str = "primaryButtonText";
                        }
                    } else {
                        str = "bodyText";
                    }
                } else {
                    str = DialogModule.KEY_TITLE;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        } else {
            InterfaceC103384lE interfaceC103384lE2 = this.A07;
            C131845xK.A00(this.A04, this.A05, interfaceC103384lE2);
        }
        C0f9.A0A(-1749053310, A0N);
        C0f9.A0A(-1995246555, A03);
    }
}
