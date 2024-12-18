package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Duw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31630Duw extends AbstractC66422zJ {
    public final UserSession A00;
    public final C31619Dul A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.suggestions_footer_row, viewGroup, false);
        IgTextView A0d = AbstractC25231BEo.A0d(inflate, R.id.title);
        ViewOnClickListenerC35682FpH.A01(A0d, 18, this);
        return new C31933E1n(inflate, A0d);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31607DuZ c31607DuZ = (C31607DuZ) interfaceC66482zP;
        C31933E1n c31933E1n = (C31933E1n) c3oo;
        AbstractC167007dF.A1K(c31607DuZ, c31933E1n);
        if (AbstractC25225BEi.A07(C06090Tz.A05, this.A00, 36600852305350700L) == 2) {
            c31933E1n.itemView.setVisibility(0);
            c31933E1n.A00.setText(c31607DuZ.A00);
        } else {
            c31933E1n.itemView.setVisibility(8);
        }
    }

    public C31630Duw(UserSession userSession, C31619Dul c31619Dul) {
        this.A00 = userSession;
        this.A01 = c31619Dul;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C31607DuZ.class;
    }
}
