package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ETM extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public ETM(UserSession userSession, String str, String str2, String str3, int i) {
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A02 = str3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1110107045);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        AbstractC25651Mw.A00(this.A01).E4s(new C7MN(this.A04, this.A03, this.A00, false));
        C0f9.A0A(-1926575050, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C0f9.A03(-98625440);
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
        int A0N = AbstractC167017dG.A0N(interfaceC40821up, 63436318);
        super.onSuccess(interfaceC40821up);
        UserSession userSession = this.A01;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        String str2 = this.A04;
        String str3 = this.A03;
        A00.E4s(new C7MN(str2, str3, this.A00, true));
        FGM fgm = ((EBP) interfaceC40821up).A00;
        if (fgm != null && (str = fgm.A00) != null) {
            F2C.A00(userSession).A04(str3, this.A02, str);
        }
        C0f9.A0A(1158808983, A0N);
        C0f9.A0A(-308200525, A03);
    }
}
