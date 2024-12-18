package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Jcm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43999Jcm extends AbstractC66422zJ {
    public final MQH A00;
    public final UserSession A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.disclaimer_title_row, viewGroup, false);
        return new C44707Jqq(inflate, AbstractC31176DnK.A0T(inflate, R.id.disclaimer), AbstractC25231BEo.A0d(inflate, R.id.title), AbstractC25231BEo.A0d(inflate, R.id.header_action_button));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C43960Jc9 c43960Jc9 = (C43960Jc9) interfaceC66482zP;
        C44707Jqq c44707Jqq = (C44707Jqq) c3oo;
        AbstractC167007dF.A1K(c43960Jc9, c44707Jqq);
        Context A05 = AbstractC31172DnG.A05(c44707Jqq);
        AbstractC166987dD.A1P(A05, c44707Jqq.A02, c43960Jc9.A00);
        IgTextView igTextView = c44707Jqq.A01;
        Integer num = c43960Jc9.A01;
        if (num != null) {
            str = A05.getString(num.intValue());
        } else {
            str = null;
        }
        igTextView.setText(str);
        AbstractC166987dD.A1O(A05, igTextView, C1QI.A01(A05));
        igTextView.setVisibility(AbstractC167007dF.A05(c43960Jc9.A04 ? 1 : 0));
        boolean z = c43960Jc9.A05;
        IgSimpleImageView igSimpleImageView = c44707Jqq.A00;
        if (z) {
            igSimpleImageView.setVisibility(0);
            ViewOnClickListenerC48073LPy.A00(igSimpleImageView, 52, this);
        } else {
            igSimpleImageView.setVisibility(8);
        }
        C0fQ.A00(new LOz(9, this, c43960Jc9), igTextView);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C43960Jc9.class;
    }

    public C43999Jcm(UserSession userSession, MQH mqh) {
        AbstractC167017dG.A1P(userSession, mqh);
        this.A01 = userSession;
        this.A00 = mqh;
    }
}
