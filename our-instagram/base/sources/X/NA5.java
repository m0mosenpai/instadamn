package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NA5 extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C1P1 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C6WQ A04;
    public final /* synthetic */ C19L A05;
    public final /* synthetic */ boolean A06;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-637620406);
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
        int A0N = AbstractC167017dG.A0N(interfaceC40821up, -479235306);
        C19L c19l = this.A05;
        C38321qM c38321qM = this.A03;
        boolean z = this.A06;
        AbstractC166987dD.A1Z(new C71765X2b(interfaceC40821up, this.A01, this.A02, c38321qM, null, z), c19l);
        C0f9.A0A(1854732366, A0N);
        C0f9.A0A(-1419373508, A03);
    }

    public NA5(Context context, C1P1 c1p1, UserSession userSession, C38321qM c38321qM, C6WQ c6wq, C19L c19l, boolean z) {
        this.A05 = c19l;
        this.A04 = c6wq;
        this.A01 = c1p1;
        this.A03 = c38321qM;
        this.A06 = z;
        this.A02 = userSession;
        this.A00 = context;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String string;
        String errorMessage;
        int A03 = C0f9.A03(968253956);
        C14360o3.A0B(abstractC115105If, 0);
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
        if (interfaceC40821up != null && (errorMessage = interfaceC40821up.getErrorMessage()) != null && errorMessage.hashCode() == 2083820669 && errorMessage.equals("User has already pinned maximum amount of clips")) {
            string = AbstractC166997dE.A0r(this.A00.getResources(), AbstractC166997dE.A0i(C06090Tz.A05, this.A02, 36600366971883393L), 2131957226);
        } else {
            boolean z = this.A06;
            Resources resources = this.A00.getResources();
            int i = 2131957227;
            if (z) {
                i = 2131957225;
            }
            string = resources.getString(i);
        }
        C14360o3.A0A(string);
        C14360o3.A0B(string, 0);
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        A0Y.A0D = string;
        A0Y.A0O = true;
        C41451vu.A01.E4s(new C3KD(A0Y.A00()));
        C0f9.A0A(1291023905, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(816766579);
        AbstractC166987dD.A1Z(new PZU(this.A04, this.A01, (InterfaceC23621Ds) null, 47), this.A05);
        C0f9.A0A(282779280, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(850505732);
        AbstractC166987dD.A1Z(new GSQ(this.A04, null, 46), this.A05);
        C0f9.A0A(230473125, A03);
    }
}
