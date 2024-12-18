package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.GfS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37510GfS implements JH7 {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final InterfaceC65282xQ A02;
    public final String A03;
    public final Fragment A04;
    public final C38R A05;

    public C37510GfS(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, C38R c38r, String str) {
        C14360o3.A0B(c38r, 4);
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A04 = fragment;
        this.A05 = c38r;
        this.A02 = interfaceC65282xQ;
        this.A03 = str;
    }

    @Override // X.JH7
    public final void Dlp(C38321qM c38321qM, C75113Zb c75113Zb) {
        UserSession userSession = this.A00;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        AbstractC41775Ier.A05(userSession, c38321qM, interfaceC60442pS, c75113Zb, AbstractC40636Hzu.A00(AbstractC76443bo.A00(userSession, c38321qM, interfaceC60442pS)), this.A03, null, null, null, false);
        if (IBO.A00.A02(userSession, c38321qM)) {
            Context context = this.A04.getContext();
            if (context != null) {
                C3MG.A00();
                C3MF.A00(context, userSession, c38321qM, new C42832Ix8(1, this, c38321qM), "cta_bar");
            }
        } else {
            HashMap hashMap = C3MF.A05;
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                hashMap.put(A2u, null);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C76513bv c76513bv = IBN.A00;
        if (c76513bv.A04(c38321qM).size() > 1) {
            Context context2 = this.A04.getContext();
            if (context2 != null) {
                C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                AbstractC25226BEj.A1M(context2, A0y, 2131973944);
                C189478aR A00 = A0y.A00();
                C41769Iel A0T = C1XJ.A00.A0T();
                ArrayList A1F = AbstractC166987dD.A1F(c76513bv.A04(c38321qM));
                A00.A03(context2, A0T.A0G(userSession, new HZZ(0, this, c38321qM, c75113Zb, A00), null, interfaceC60442pS.getModuleName(), "cta_bar", c38321qM.getId(), c38321qM.CAR(), A1F));
                return;
            }
            return;
        }
        User user = (User) AbstractC001800i.A0J(c76513bv.A04(c38321qM));
        if (user == null) {
            return;
        }
        A00(this, c38321qM, c75113Zb, user, "cta_bar");
    }

    public static final void A00(C37510GfS c37510GfS, C38321qM c38321qM, C75113Zb c75113Zb, User user, String str) {
        C41749IeN A0O;
        FragmentActivity activity = c37510GfS.A04.getActivity();
        if (activity != null && (A0O = C1XJ.A00.A0O(activity, c37510GfS.A00, c38321qM, c37510GfS.A01, c75113Zb, user, str, c37510GfS.A03)) != null) {
            A0O.A05();
        }
    }

    @Override // X.JH7
    public final void EDj(View view, C38321qM c38321qM) {
        this.A05.A00(view, c38321qM);
    }
}
