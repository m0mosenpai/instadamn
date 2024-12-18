package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.EnumSet;

/* renamed from: X.IaV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41582IaV {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC61432r6 A03;

    public static final void A00(C41582IaV c41582IaV, C38321qM c38321qM, EnumC75193Zm enumC75193Zm, C75113Zb c75113Zb, String str) {
        C14360o3.A0B(enumC75193Zm, 0);
        c75113Zb.A0m = enumC75193Zm;
        InterfaceC61432r6 interfaceC61432r6 = c41582IaV.A03;
        EnumSet enumSet = AbstractC41573IaM.A00;
        if (enumC75193Zm == EnumC75193Zm.A0A) {
            interfaceC61432r6.DVi(new C6T6(null, null, str, ""), AnonymousClass317.A0Y, c38321qM, c75113Zb);
        }
        UserSession userSession = c41582IaV.A01;
        int i = c75113Zb.A03;
        InterfaceC60442pS interfaceC60442pS = c41582IaV.A02;
        AbstractC11060iN.A00(userSession);
        String id = c38321qM.getId();
        User A2E = c38321qM.A2E(userSession);
        A2E.getClass();
        C82713mZ A0M = AbstractC37302Gc3.A0M(interfaceC60442pS, "instagram_ad_", "hide_response");
        A0M.A7Q = c38321qM.CAR();
        A0M.A76 = "hide_button";
        A0M.A61 = id;
        A0M.A4T = AbstractC41071vF.A07(userSession, c38321qM);
        A0M.A4c = A2E.getId();
        A0M.A5P = AbstractC38851rI.A06(A2E.B7L());
        A0M.A0N(c38321qM.BRp());
        if (str == null) {
            str = AbstractC111324zv.A00(2531);
        }
        A0M.A6v = str;
        String A0H = AbstractC41071vF.A0H(userSession, c38321qM.getId());
        if (A0H != null) {
            A0M.A5e = A0H;
        }
        AbstractC37302Gc3.A1R(A0M);
        C32U.A0X(A0M, AbstractC25229BEm.A0h(userSession, id), i);
        C32U.A0H(userSession, A0M, interfaceC60442pS);
    }

    public C41582IaV(Activity activity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC61432r6 interfaceC61432r6) {
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = activity;
        this.A03 = interfaceC61432r6;
    }
}
