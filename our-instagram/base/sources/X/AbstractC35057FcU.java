package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FcU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35057FcU {
    public static final void A00(View view, InterfaceC148366m6 interfaceC148366m6) {
        AbstractC31176DnK.A1E(view, R.id.bottom_divider, 0);
        view.setVisibility(8);
        interfaceC148366m6.DWL();
    }

    public static final void A01(View view, EnumC81843l3 enumC81843l3, String str) {
        String A0f;
        TextView A0e = AbstractC166987dD.A0e(view, R.id.title);
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.message);
        Context context = view.getContext();
        C14360o3.A0A(context);
        EnumC81843l3 enumC81843l32 = EnumC81843l3.A04;
        if (enumC81843l3 == enumC81843l32) {
            A0f = context.getString(2131959919);
        } else {
            A0f = AbstractC167007dF.A0f(context, str, 2131959917);
        }
        C14360o3.A0A(A0f);
        int i = 2131959916;
        if (enumC81843l3 == enumC81843l32) {
            i = 2131959918;
        }
        String A0f2 = AbstractC167007dF.A0f(context, str, i);
        C14360o3.A0A(A0f2);
        A0e.setText(A0f);
        A0e.setContentDescription(A0f);
        A0e2.setText(A0f2);
        A0e2.setContentDescription(A0f2);
    }

    public static final void A02(UserSession userSession, C2EE c2ee) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("banner_type", String.valueOf(c2ee.Aiu()));
        String C7I = c2ee.C7I();
        List BSH = c2ee.BSH();
        ArrayList A0q = AbstractC167017dG.A0q(BSH);
        Iterator it = BSH.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1V(A0q, it);
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "direct_thread_banner_impression");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1F(A0f, C7I);
            A0f.AAK(C4SX.A00(userSession.userId), "user_igid");
            A0f.AAk(AbstractC43591JPw.A00(1270), A0q);
            A0f.A9M("extra_data", A1G);
            A0f.Cht();
        }
    }
}
