package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: classes8.dex */
public final class LAG {
    public AnonymousClass195 A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final InterfaceC43071ya A03;
    public final C57112jm A04;
    public final L7U A05;
    public final Integer A06;
    public final java.util.Set A07;
    public final RecyclerView A08;
    public final UserSession A09;
    public final SpinnerImageView A0A;

    public final void A02(List list) {
        View view;
        if (!list.isEmpty()) {
            this.A05.A00(list);
            this.A01.setVisibility(0);
            this.A08.setVisibility(0);
            view = this.A0A;
        } else {
            view = this.A01;
        }
        view.setVisibility(8);
        this.A08.A0n(0);
    }

    public final void A03(List list) {
        View view;
        if (!list.isEmpty()) {
            L7U l7u = this.A05;
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0E.A00(new LZK((C45026JwH) it.next()));
            }
            l7u.A00.A05(A0E);
            this.A01.setVisibility(0);
            this.A08.setVisibility(0);
            view = this.A0A;
        } else {
            view = this.A01;
        }
        view.setVisibility(8);
        this.A08.A0n(0);
    }

    public final void A04(List list, InterfaceC19390xP interfaceC19390xP) {
        C14360o3.A0B(list, 0);
        if (AbstractC166987dD.A1b(list)) {
            this.A05.A00(list);
        }
        A01();
        this.A08.A0n(0);
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A00);
        if (interfaceC19390xP != null) {
            this.A00 = AbstractC25226BEj.A1L(new GSS(interfaceC19390xP, this, A0s, 22), AnonymousClass194.A02(C12L.A00.A04));
        }
    }

    public final void A00() {
        this.A08.setVisibility(4);
        SpinnerImageView spinnerImageView = this.A0A;
        spinnerImageView.setVisibility(0);
        AbstractC31171DnF.A1M(spinnerImageView);
    }

    public final void A01() {
        boolean A1N = AbstractC167007dF.A1N(this.A05.A00.getItemCount());
        View view = this.A01;
        if (!A1N) {
            view.setVisibility(0);
            this.A08.setVisibility(0);
            view = this.A0A;
        }
        view.setVisibility(8);
    }

    public final boolean A05() {
        return AbstractC167007dF.A1N(this.A05.A00.getItemCount());
    }

    public LAG(LinearLayout linearLayout, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC159877Ez interfaceC159877Ez, Integer num, Consumer consumer) {
        int i;
        int i2;
        this.A09 = userSession;
        C57112jm A00 = C57112jm.A00();
        this.A04 = A00;
        this.A07 = AbstractC31171DnF.A0l();
        Context context = linearLayout.getContext();
        this.A01 = linearLayout;
        TextView A0T = AbstractC166997dE.A0T(linearLayout, R.id.direct_star_tab_horizontal_section_header);
        this.A02 = A0T;
        RecyclerView A0G = AbstractC31172DnG.A0G(linearLayout, R.id.direct_star_tab_horizontal_section_recyclerview);
        this.A08 = A0G;
        this.A0A = (SpinnerImageView) linearLayout.requireViewById(R.id.direct_star_tab_horizontal_section_loading_spinner);
        this.A06 = num;
        if (num == C05F.A0N) {
            AbstractC37301Gc2.A0v(A0G, A00, abstractC59962oe);
        }
        this.A03 = new C44308Jhz(2, this, consumer);
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                i = 2131960486;
                break;
            case 1:
                i = 2131960488;
                break;
            case 2:
                i = 2131960496;
                break;
            default:
                i = 2131960494;
                break;
        }
        A0T.setText(i);
        switch (intValue) {
            case 0:
                i2 = 2131960487;
                break;
            case 1:
                i2 = 2131960489;
                break;
            case 2:
                i2 = 2131960497;
                break;
            default:
                i2 = 2131960495;
                break;
        }
        AbstractC166997dE.A18(context, A0T, i2);
        AbstractC31174DnI.A17(context, A0G, false);
        L7U l7u = new L7U(context, userSession, this, interfaceC159877Ez);
        this.A05 = l7u;
        A0G.setAdapter(l7u.A00);
        int A06 = AbstractC167017dG.A06(context);
        AbstractC37304Gc5.A0z(A0G, A06 * 2, A06);
        A0G.setItemAnimator(null);
    }
}
