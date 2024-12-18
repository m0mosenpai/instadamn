package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.EaZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32708EaZ extends C32710Eab {
    public final UserSession A00;

    @Override // X.C32710Eab, X.C32711Eac, X.E48
    public final void A01(C32716Eah c32716Eah) {
        super.A01(c32716Eah);
        if (c32716Eah.A01.A04 != null) {
            Context A05 = AbstractC31172DnG.A05(this);
            TextView textView = (TextView) ((C32711Eac) this).A02.A0I.getView();
            C14360o3.A0A(A05);
            textView.setText(C23831Eq.A08(A05, r1.intValue()));
            AbstractC166987dD.A1O(A05, textView, AbstractC53242c7.A0A(A05));
            textView.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32708EaZ(View view, UserSession userSession, FQ9 fq9, int i, boolean z) {
        super(view, userSession, fq9, i, z);
        AbstractC167017dG.A1P(userSession, fq9);
        this.A00 = userSession;
    }
}
