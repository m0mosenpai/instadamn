package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G9D implements InterfaceC190658cN {
    public final /* synthetic */ C33229ElM A00;
    public final /* synthetic */ Boolean A01;
    public final /* synthetic */ String A02;

    public G9D(C33229ElM c33229ElM, Boolean bool, String str) {
        this.A00 = c33229ElM;
        this.A02 = str;
        this.A01 = bool;
    }

    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        C33229ElM c33229ElM = this.A00;
        UserSession userSession = c33229ElM.A00;
        if (z) {
            C83743oJ A01 = C83743oJ.A01(userSession);
            String str = this.A02;
            Integer num = C05F.A0N;
            UserSession userSession2 = c33229ElM.A00;
            Context context = c33229ElM.getContext();
            Boolean bool = this.A01;
            A01.A08(context, c33229ElM, userSession2, bool, bool, num, str, true);
            return true;
        }
        boolean A0J = C83743oJ.A01(userSession).A0J(c33229ElM.A00.userId);
        C193328hC A0O = AbstractC31175DnJ.A0O(c33229ElM);
        int i = 2131972172;
        if (A0J) {
            i = 2131952988;
        }
        A0O.A0A(i);
        int i2 = 2131972173;
        if (A0J) {
            i2 = 2131952989;
        }
        AbstractC31179DnN.A11(c33229ElM, A0O, i2);
        A0O.A0J(new DialogInterfaceOnClickListenerC35331Fi8(1, c33229ElM, A0J), 2131972171);
        AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC35453FkA.A00(c33229ElM, 50), A0O);
        return false;
    }
}
