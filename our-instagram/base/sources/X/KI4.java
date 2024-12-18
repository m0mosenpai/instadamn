package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KI4 extends AbstractC66412zI {
    public final C47245KuI A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44682JqR(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.item_appreciation_gift, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C48312LZl c48312LZl = (C48312LZl) interfaceC66482zP;
        C44682JqR c44682JqR = (C44682JqR) c3oo;
        AbstractC167017dG.A1N(c48312LZl, c44682JqR);
        ConstraintLayout constraintLayout = c44682JqR.A00;
        constraintLayout.setSelected(c48312LZl.A05);
        constraintLayout.setContentDescription(c48312LZl.A02);
        AbstractC56952jT.A02(constraintLayout, c44682JqR.itemView.getResources().getString(2131953071));
        c44682JqR.A01.setText(c48312LZl.A04);
        ViewOnClickListenerC48066LPr.A00(constraintLayout, 5, c48312LZl, this);
        c44682JqR.A02.setUrl(c48312LZl.A01, this.A01);
        Context A05 = AbstractC31172DnG.A05(c44682JqR);
        C7UR c7ur = C7UR.A0A;
        C14360o3.A0A(A05);
        C7US.A00(A05).A05(new C49465Lte(), c48312LZl.A00.getUrl());
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48312LZl.class;
    }

    public KI4(C47245KuI c47245KuI, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1Q(userSession, c47245KuI);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = c47245KuI;
    }
}
