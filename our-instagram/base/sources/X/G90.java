package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G90 implements InterfaceC58152PqH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC144306fC A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public G90(Activity activity, UserSession userSession, InterfaceC144306fC interfaceC144306fC, String str, String str2, int i) {
        this.A02 = userSession;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = activity;
        this.A03 = interfaceC144306fC;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        UserSession userSession = this.A02;
        C142846ck A00 = AbstractC147806l5.A00(userSession);
        int i = this.A00;
        String str = this.A04;
        String str2 = this.A05;
        C25531Mh A0I = AbstractC31172DnG.A0I(A00);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, A00);
            AbstractC31174DnI.A1I(A0I, AbstractC111324zv.A00(3008));
            A0I.A0o("undo_button");
            A0I.A0h(AbstractC31179DnN.A0a(A0I, "story", str, str2, i));
            A0I.Cht();
        }
        Activity activity = this.A01;
        new C31605DuX(activity, userSession).A02(AbstractC1345466e.A05(AbstractC31171DnF.A0N(str)), C05F.A09);
        AbstractC34105F3h.A00(userSession).A00.remove(str);
        this.A03.FAS(userSession);
    }
}
