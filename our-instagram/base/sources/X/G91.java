package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class G91 implements InterfaceC58152PqH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C35121FeO A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ C14510oO A05;
    public final /* synthetic */ boolean A06;

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public G91(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C35121FeO c35121FeO, User user, C14510oO c14510oO, boolean z) {
        this.A05 = c14510oO;
        this.A02 = userSession;
        this.A04 = user;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
        this.A03 = c35121FeO;
        this.A06 = z;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        this.A05.A00 = true;
        UserSession userSession = this.A02;
        User user = this.A04;
        List A1J = AbstractC166987dD.A1J(user.getId());
        FVL.A01(C35817Frt.A00, C35845FsL.A00, userSession, A1J, false);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Context context = this.A00;
        C35121FeO c35121FeO = new C35121FeO(interfaceC11380iw, userSession);
        Object obj = new Object();
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0D = AbstractC31178DnM.A0c(context, user, 2131953378);
        A0K.A0L = true;
        AbstractC31175DnJ.A0l(context, A0K, 2131953377);
        A0K.A0A(new G99(1, context, interfaceC11380iw, userSession, c35121FeO, user, obj));
        A0K.A01 = 5000;
        AbstractC31175DnJ.A0p(context.getResources(), A0K);
        AbstractC31178DnM.A1S(A0K);
        C35121FeO c35121FeO2 = this.A03;
        String id = user.getId();
        InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO2);
        AbstractC31180DnO.A1G(EnumC33496ErV.APPROVE_TOAST, A00);
        A00.AAP("target_user_id", id);
        C35121FeO.A01(A00, c35121FeO2);
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        C14510oO c14510oO = this.A05;
        if (c14510oO.A00) {
            c14510oO.A00 = false;
            return;
        }
        C35121FeO c35121FeO = this.A03;
        String id = this.A04.getId();
        InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
        AbstractC31180DnO.A1H(EnumC33496ErV.APPROVE_TOAST, A00);
        A00.AAP("target_user_id", id);
        C35121FeO.A01(A00, c35121FeO);
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        if (this.A06) {
            C35266Fh1.A04(this.A02, C35266Fh1.A00);
        }
        C35121FeO c35121FeO = this.A03;
        String id = this.A04.getId();
        InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
        AbstractC31178DnM.A12(EnumC33496ErV.APPROVE_TOAST, A00);
        A00.AAP("target_user_id", id);
        C35121FeO.A01(A00, c35121FeO);
    }
}
