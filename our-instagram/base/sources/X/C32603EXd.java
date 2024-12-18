package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;
import java.util.List;

/* renamed from: X.EXd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32603EXd extends AbstractC66412zI {
    public final Context A00;
    public final UserSession A01;
    public final C57112jm A02;
    public final C32315ELe A03;
    public final Integer A04;

    public C32603EXd(Context context, UserSession userSession, C57112jm c57112jm, C32315ELe c32315ELe, Integer num) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = num;
        this.A03 = c32315ELe;
        this.A02 = c57112jm;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E21(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.interest_title_and_sub_interests_pill_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C32081E8f c32081E8f = (C32081E8f) interfaceC66482zP;
        E21 e21 = (E21) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c32081E8f, e21);
        UserSession userSession = this.A01;
        Context context = this.A00;
        Integer num = this.A04;
        C32315ELe c32315ELe = this.A03;
        C57112jm c57112jm = this.A02;
        C14360o3.A0B(userSession, 0);
        AbstractC25233BEq.A0x(A1a ? 1 : 0, context, num, c32315ELe);
        C14360o3.A0B(c57112jm, 6);
        C5QE c5qe = c32081E8f.A00;
        if (c5qe != null) {
            str = c5qe.A01(AbstractC166997dE.A0M(context)).toString();
        } else {
            str = null;
        }
        TextView textView = e21.A00;
        Resources A0M = AbstractC166997dE.A0M(context);
        C5QE c5qe2 = c32081E8f.A01;
        C14360o3.A0B(c5qe2, 1);
        A1C.A00(context, textView, c5qe2.A01(A0M).toString(), str);
        HorizontalFlowLayout horizontalFlowLayout = e21.A01;
        horizontalFlowLayout.removeAllViews();
        List list = c32081E8f.A02;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C51758Mth c51758Mth = (C51758Mth) obj;
                boolean z = false;
                E30 e30 = new E30(AbstractC25226BEj.A0R(LayoutInflater.from(context), horizontalFlowLayout, R.layout.subinterest_round_pill, false), null);
                if (i == 0) {
                    z = true;
                }
                F8N.A00(context, userSession, c57112jm, c32315ELe, e30, new C32077E8b(c51758Mth, z), num);
                View view = e30.A00;
                AbstractC13880nE.A0U(view, AbstractC166987dD.A0C(context, 8));
                horizontalFlowLayout.addView(view);
                i = i2;
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32081E8f.class;
    }
}
