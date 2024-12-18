package X;

import android.content.Context;
import android.view.View;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class NAZ extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return AbstractC31174DnI.A0Z(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        IgdsListCell igdsListCell = (IgdsListCell) view;
        AbstractC167027dH.A12(igdsListCell, c6fg, c102884kP);
        AbstractC53658No5.A00(c6fg, c102884kP, igdsListCell);
        InterfaceC103384lE A0B = c102884kP.A0B(40);
        if (A0B != null) {
            igdsListCell.A0C(new ViewOnClickListenerC28665ClD(3, c6fg, c102884kP, A0B));
            igdsListCell.A0D(new C55516Ol9(0, c102884kP, c6fg, A0B));
            return null;
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        IgdsListCell igdsListCell = (IgdsListCell) view;
        C14360o3.A0B(igdsListCell, 0);
        igdsListCell.setOnClickListener(null);
        igdsListCell.A0D(null);
        igdsListCell.A0I("");
        igdsListCell.setEnabled(false);
        igdsListCell.A0K("", false);
        igdsListCell.A04();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public NAZ(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
