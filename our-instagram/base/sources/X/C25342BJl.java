package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BJl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25342BJl {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C25342BJl(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    public final void A00(C51755Mte c51755Mte, C25922BdP c25922BdP) {
        AbstractC167017dG.A1N(c25922BdP, c51755Mte);
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        TextView textView = c25922BdP.A00;
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(context.getString(2131966000));
        A0H.setSpan(new C27281C2g(c51755Mte, interfaceC11380iw, context.getColor(AbstractC53242c7.A06(context))), 0, A0H.length(), 18);
        AbstractC25227BEk.A11(textView);
        textView.setHighlightColor(context.getColor(R.color.fds_transparent));
        textView.setText(AbstractC25225BEi.A0H(context.getString(2131956506)).append((CharSequence) " ").append((CharSequence) A0H));
        AbstractC56952jT.A01(textView);
    }
}
