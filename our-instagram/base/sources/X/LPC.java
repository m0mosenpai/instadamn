package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class LPC implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C25814BbV A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC60442pS A03;

    public LPC(Context context, C25814BbV c25814BbV, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A01 = c25814BbV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1117566155);
        Context context = this.A00;
        UserSession userSession = this.A02;
        C14360o3.A0A(view);
        C25814BbV c25814BbV = this.A01;
        View findViewById = view.findViewById(R.id.threads_crossposting_toggle_text);
        String A0q = AbstractC166997dE.A0q(context.getResources(), 2131975522);
        String A0q2 = AbstractC166997dE.A0q(context.getResources(), 2131975524);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC166997dE.A0r(context.getResources(), A0q2, 2131975523));
        int A08 = AbstractC001900j.A08(A0H, A0q2, 0, false);
        boolean z = false;
        if (A08 >= 0) {
            z = true;
        }
        String A00 = AbstractC111324zv.A00(3532);
        if (z) {
            Pattern pattern = AbstractC13670mt.A06;
            int length = A0q2.length();
            if (length >= 0) {
                A0H.setSpan(new StyleSpan(1), A08, length + A08, 33);
                C8QJ c8qj = new C8QJ(context, userSession, null, false);
                c8qj.A02(AbstractC16960so.A1Q(new C199928sw(null, null, null, new C49481Ltu(findViewById, c25814BbV, A0q, 0), null, A0q, 0, 0, 0, false, false, false, true, false, false, false), new C199928sw(null, null, null, new C49482Ltv(0, A0H, c25814BbV, findViewById), null, AbstractC166987dD.A19(A0H), 0, 0, 0, false, false, false, true, false, false, false)));
                c8qj.showAsDropDown(view);
                C0f9.A0C(-688152511, A05);
                return;
            }
            throw AbstractC166987dD.A14(A00);
        }
        throw AbstractC166987dD.A14(A00);
    }
}
