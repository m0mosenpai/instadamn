package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C5H extends C5J {
    public View A00;
    public C59952od A01;
    public TextView A02;
    public final C37546Gg2 A03;
    public final UserSession A04;

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00 = null;
        this.A02 = null;
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        View A0U = AbstractC167017dG.A0U(view, R.id.clips_comment_composer_stub);
        if (A0U != null) {
            this.A02 = AbstractC166997dE.A0T(A0U, R.id.comment_composer_text_view);
        } else {
            A0U = null;
        }
        this.A00 = A0U;
        TextView textView = this.A02;
        if (textView != null) {
            AbstractC166987dD.A1P(textView.getContext(), textView, 2131956168);
            C0fQ.A00(new ViewOnClickListenerC28604Cjt(this, 0), textView);
            AbstractC56952jT.A01(textView);
        }
    }

    @Override // X.AbstractC37623GhI
    public final void A09() {
        C37556GgC c37556GgC = super.A02;
        if (c37556GgC != null) {
            c37556GgC.A0H(this);
        }
    }

    @Override // X.AbstractC37623GhI
    public final void A0A() {
        C37556GgC c37556GgC = super.A02;
        if (c37556GgC != null) {
            c37556GgC.A0G(this);
        }
        A00();
    }

    public C5H(UserSession userSession, C37546Gg2 c37546Gg2) {
        this.A03 = c37546Gg2;
        this.A04 = userSession;
    }

    private final void A00() {
        int intValue;
        C120985dq A0F;
        EnumC129395t1 enumC129395t1;
        Integer A0l = AbstractC25233BEq.A0l(this);
        if (A0l != null && (intValue = A0l.intValue()) >= 0) {
            AbstractC37552Gg8 abstractC37552Gg8 = this.A03.A0A;
            if (intValue < abstractC37552Gg8.A0B() && (A0F = abstractC37552Gg8.A0F(intValue)) != null && (enumC129395t1 = A0F.A01) != EnumC129395t1.A0H && enumC129395t1 != EnumC129395t1.A08 && !C76493bt.A0B(A0F) && enumC129395t1 != EnumC129395t1.A09) {
                AbstractC167007dF.A0w(this.A00);
                return;
            }
        }
        AbstractC167007dF.A0x(this.A00);
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        A00();
    }
}
