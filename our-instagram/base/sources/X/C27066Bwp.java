package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bwp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27066Bwp extends AbstractC66422zJ {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.direct_text_message_text_view, viewGroup, false);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.addView(inflate);
        return new C25933Bda(linearLayout, this.A00, this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C26169Bhu c26169Bhu = (C26169Bhu) interfaceC66482zP;
        C25933Bda c25933Bda = (C25933Bda) c3oo;
        AbstractC167017dG.A1N(c26169Bhu, c25933Bda);
        LinearLayout linearLayout = c25933Bda.A01;
        TextView A0Q = AbstractC25230BEn.A0Q(linearLayout, R.id.direct_text_message_text_view);
        C7IM c7im = c26169Bhu.A00;
        C7R2 c7r2 = C7R2.A05;
        Drawable drawable = c25933Bda.A00;
        AbstractC162737Qk.A06(drawable, null, c7r2, c7im, false, false, false, false, false);
        A0Q.setText(c26169Bhu.A01);
        Context A0L = AbstractC166997dE.A0L(linearLayout);
        A0Q.setMaxWidth(C7N9.A00(A0L, false));
        A0Q.setTextColor(AbstractC162737Qk.A01(c7im, false));
        int A0C = AbstractC166987dD.A0C(A0L, 12);
        int A0C2 = AbstractC166987dD.A0C(A0L, 10);
        A0Q.setBackground(drawable);
        A0Q.setPadding(A0C, A0C2, A0C, A0C2);
        linearLayout.setGravity(8388613);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public C27066Bwp(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C26169Bhu.class;
    }
}
