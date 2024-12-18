package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.Pbo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57266Pbo extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ OXR A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57266Pbo(Context context, OXR oxr, UserSession userSession, C38321qM c38321qM, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A05 = z;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = c38321qM;
        this.A02 = oxr;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        long j = i * 1000;
        Locale locale = Locale.US;
        String A10 = AbstractC43593JPy.A10(new SimpleDateFormat("EEE, LLL d", locale), j);
        String A102 = AbstractC43593JPy.A10(new SimpleDateFormat("h:mm a z", locale), j);
        int i2 = 2131956770;
        if (this.A05) {
            i2 = 2131956771;
        }
        Context context = this.A01;
        C9GR.A09(context, AbstractC31174DnI.A0t(context, A10, A102, i2));
        UserSession userSession = this.A03;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C38321qM c38321qM = this.A04;
        A00.E4s(new C56007Ote(c38321qM, i));
        JKD Ar6 = c38321qM.A0C.Ar6();
        if (Ar6 != null) {
            c38321qM.A0C.ES4(new C38709H2v(Integer.valueOf(i), Ar6.CEH()));
        }
        C1DW.A00(userSession).A01(c38321qM, true, false);
        OXR oxr = this.A02;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(oxr.A01, "content_scheduling_submit");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1G(A0f, oxr.A00.A00);
            AbstractC31171DnF.A1A(A0f, "schedule_picker");
            A0f.Cht();
        }
        return C0eB.A00;
    }
}
