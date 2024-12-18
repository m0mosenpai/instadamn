package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eaa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32709Eaa extends C32710Eab {
    public final FFF A00;
    public final UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32709Eaa(View view, UserSession userSession, FQ9 fq9, FFF fff, int i, boolean z) {
        super(view, userSession, fq9, i, z);
        AbstractC167017dG.A1P(userSession, fq9);
        C14360o3.A0B(fff, 6);
        this.A01 = userSession;
        this.A00 = fff;
        AbstractC13880nE.A0o(((C32711Eac) this).A02.A04.getView(), view, R.dimen.abc_button_padding_horizontal_material);
    }

    @Override // X.C32710Eab, X.C32711Eac, X.E48
    public final void A01(C32716Eah c32716Eah) {
        super.A01(c32716Eah);
        if (c32716Eah.A01.A04 != null) {
            Context A05 = AbstractC31172DnG.A05(this);
            TextView textView = (TextView) ((C32711Eac) this).A02.A0I.getView();
            C14360o3.A0A(A05);
            textView.setText(C23831Eq.A08(A05, r1.intValue()));
            AbstractC166987dD.A1O(A05, textView, AbstractC53242c7.A0A(textView.getContext()));
            textView.setVisibility(0);
        }
        CompoundButton compoundButton = (CompoundButton) ((C32711Eac) this).A02.A04.getView();
        if (c32716Eah.A09) {
            compoundButton.setVisibility(0);
            compoundButton.setOnCheckedChangeListener(null);
            compoundButton.setChecked(c32716Eah.A0A);
            compoundButton.setOnCheckedChangeListener(new C35730FqD(4, this, c32716Eah));
            return;
        }
        compoundButton.setVisibility(8);
        compoundButton.setOnClickListener(null);
    }
}
