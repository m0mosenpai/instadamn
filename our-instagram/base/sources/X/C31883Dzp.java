package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dzp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31883Dzp extends C2UU {
    public C38266GsB A00;
    public List A01 = AbstractC166987dD.A1E();
    public final UserSession A02;
    public final User A03;
    public final FK3 A04;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        TextView textView;
        int i2;
        TextView textView2;
        int i3;
        C31935E1p c31935E1p = (C31935E1p) c3oo;
        EnumC33369Ep2 enumC33369Ep2 = (EnumC33369Ep2) this.A01.get(i);
        Context A05 = AbstractC31172DnG.A05(c31935E1p);
        switch (enumC33369Ep2.ordinal()) {
            case 0:
                textView = c31935E1p.A00;
                i2 = 2131953938;
                textView.setText(i2);
                AbstractC166987dD.A1O(A05, textView, AbstractC53242c7.A03(A05));
                break;
            case 1:
                textView = c31935E1p.A00;
                AbstractC31177DnL.A0r(A05, textView, this.A03.getFullName(), 2131953939);
                AbstractC166987dD.A1O(A05, textView, AbstractC53242c7.A03(A05));
                break;
            case 2:
                textView2 = c31935E1p.A00;
                i3 = 2131972215;
                textView2.setText(i3);
                break;
            case 3:
                User user = this.A03;
                if (user.BJ8() == 1) {
                    AbstractC31177DnL.A0r(A05, c31935E1p.A00, user.getFullName(), 2131966328);
                    break;
                } else {
                    textView2 = c31935E1p.A00;
                    i3 = 2131966327;
                    textView2.setText(i3);
                    break;
                }
            case 4:
                textView2 = c31935E1p.A00;
                i3 = 2131966330;
                textView2.setText(i3);
                break;
            case 5:
                textView2 = c31935E1p.A00;
                i3 = 2131976876;
                if (this.A03.BJ8() == 1) {
                    i3 = 2131976843;
                }
                textView2.setText(i3);
                break;
            case 6:
                textView2 = c31935E1p.A00;
                i3 = 2131966331;
                textView2.setText(i3);
                break;
            case 7:
                textView2 = c31935E1p.A00;
                i3 = 2131966324;
                if (C18U.A06(C06090Tz.A05, this.A02, 36318221981718579L)) {
                    i3 = 2131966325;
                }
                textView2.setText(i3);
                break;
            case 8:
                textView2 = c31935E1p.A00;
                i3 = 2131966332;
                if (C18U.A06(C06090Tz.A05, this.A02, 36318221981718579L)) {
                    i3 = 2131966333;
                }
                textView2.setText(i3);
                break;
            case 9:
                textView2 = c31935E1p.A00;
                i3 = 2131974598;
                textView2.setText(i3);
                break;
            case 10:
                C38266GsB c38266GsB = this.A00;
                if (c38266GsB != null && !c38266GsB.A0D) {
                    textView = c31935E1p.A00;
                    i2 = 2131972510;
                } else {
                    textView = c31935E1p.A00;
                    i2 = 2131976190;
                }
                textView.setText(i2);
                AbstractC166987dD.A1O(A05, textView, AbstractC53242c7.A03(A05));
                break;
            case 11:
                textView2 = c31935E1p.A00;
                i3 = 2131971808;
                textView2.setText(i3);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                textView2 = c31935E1p.A00;
                i3 = 2131971827;
                textView2.setText(i3);
                break;
        }
        ViewOnClickListenerC35670Fp5.A00(c31935E1p.itemView, 33, this, enumC33369Ep2);
        c31935E1p.itemView.setTag(Integer.valueOf(i));
    }

    public C31883Dzp(UserSession userSession, C38266GsB c38266GsB, User user, FK3 fk3) {
        this.A02 = userSession;
        this.A03 = user;
        this.A00 = c38266GsB;
        this.A04 = fk3;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(2105412558);
        int size = this.A01.size();
        C0f9.A0A(2001500387, A03);
        return size;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31935E1p(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_reel_dashboard_actions_row));
    }
}
