package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.F2m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34084F2m {
    public static final void A00(Context context, UserSession userSession, IgTextView igTextView, InterfaceC37092GWb interfaceC37092GWb) {
        AbstractC25233BEq.A0v(0, userSession, igTextView, interfaceC37092GWb);
        if (interfaceC37092GWb instanceof E99) {
            E99 e99 = (E99) interfaceC37092GWb;
            String A0p = AbstractC166997dE.A0p(context, e99.A01);
            AbstractC25227BEk.A11(igTextView);
            SpannableStringBuilder A07 = AbstractC31178DnM.A07(context, A0p, e99.A00);
            AnonymousClass773.A04(A07, new C33264Ely(context, userSession, interfaceC37092GWb, AbstractC31174DnI.A02(context)), A0p);
            igTextView.setText(A07);
            if (AbstractC56862jK.A00(igTextView.getContext())) {
                ViewOnClickListenerC35684FpJ.A00(igTextView, context, userSession, interfaceC37092GWb, 19);
                return;
            }
            return;
        }
        if (interfaceC37092GWb instanceof E98) {
            igTextView.setText(BHX.A00(context, ((E98) interfaceC37092GWb).A00));
            return;
        }
        throw B4Z.A00();
    }
}
