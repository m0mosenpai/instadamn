package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;

/* loaded from: classes6.dex */
public final class EYD extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E2M(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_locked_chat_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        EY6 ey6 = (EY6) interfaceC66482zP;
        E2M e2m = (E2M) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, ey6, e2m);
        IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) AbstractC166997dE.A0R(e2m.itemView, R.id.people_cell);
        e2m.itemView.setVisibility(0);
        TextView textView = igdsPeopleCell.A05;
        textView.setText(2131963956);
        C85963sQ.A0B(textView, false);
        IgdsPeopleCell.A00(null, e2m.A00, null, null, null, igdsPeopleCell, null, null, igdsPeopleCell.A0C, A1R);
        Context A0L = AbstractC166997dE.A0L(e2m.itemView);
        Integer num = C05F.A0C;
        igdsPeopleCell.A05(new EZM(A0L, null, num, num, AbstractC53242c7.A0B(AbstractC31172DnG.A05(e2m))), null);
        ViewOnClickListenerC35666Fp0.A00(igdsPeopleCell, 4, ey6);
        boolean z = ey6.A03;
        C58652mO c58652mO = e2m.A02;
        if (z) {
            c58652mO.setVisible(A1R, A1R);
            c58652mO.E4S();
        } else {
            c58652mO.setVisible(A1R, false);
            C14360o3.A0A(c58652mO.EMk(1.0f));
        }
        UserSession userSession = ey6.A00;
        C14360o3.A0B(userSession, 0);
        C06090Tz A00 = C06090Tz.A00(new C06090Tz());
        A00.A02 = A1R;
        boolean A06 = C18U.A06(A00, userSession, 36320867680003027L);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("inbox isLockedChatONFromMC: ");
        A1C.append(A06);
        A1C.append(" src: ");
        A1C.append(A00.A00.A00.getSource());
        String obj = A1C.toString();
        InterfaceC02590Ai A09 = AbstractC31179DnN.A09(userSession);
        if (A09.isSampled()) {
            AbstractC31171DnF.A1C(A09, AbstractC43591JPw.A00(215));
            AbstractC31175DnJ.A17(A09, obj);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return EY6.class;
    }
}
