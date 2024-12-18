package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ET7 extends C1P1 {
    public final /* synthetic */ ViewOnClickListenerC126195nG A00;
    public final /* synthetic */ User A01;

    public ET7(ViewOnClickListenerC126195nG viewOnClickListenerC126195nG, User user) {
        this.A01 = user;
        this.A00 = viewOnClickListenerC126195nG;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        Integer num;
        int A03 = C0f9.A03(665759370);
        ViewOnClickListenerC126195nG viewOnClickListenerC126195nG = this.A00;
        User user = viewOnClickListenerC126195nG.A00;
        if (user == this.A01) {
            if (user.A1w()) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            viewOnClickListenerC126195nG.A01 = num;
            ViewOnClickListenerC126195nG.A01(viewOnClickListenerC126195nG);
        }
        C0f9.A0A(1971994941, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-249404092);
        int A032 = C0f9.A03(-889390030);
        User user = this.A01;
        user.A17(true);
        C08730cb c08730cb = C17060sy.A01;
        ViewOnClickListenerC126195nG viewOnClickListenerC126195nG = this.A00;
        C17P A0T = AbstractC31171DnF.A0T(viewOnClickListenerC126195nG.A04, c08730cb);
        Integer Afv = A0T.Afv();
        int i = 1;
        if (Afv != null) {
            i = Afv.intValue() + 1;
        }
        A0T.EQG(Integer.valueOf(i));
        if (viewOnClickListenerC126195nG.A00 == user) {
            viewOnClickListenerC126195nG.A01 = C05F.A00;
            ViewOnClickListenerC126195nG.A01(viewOnClickListenerC126195nG);
        }
        C0f9.A0A(1333490445, A032);
        C0f9.A0A(326716238, A03);
    }
}
