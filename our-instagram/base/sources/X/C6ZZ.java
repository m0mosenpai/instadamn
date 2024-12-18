package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6ZZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZZ extends C6ZL {
    public final Context A00;
    public final C41181vS A01;
    public final C6eI A02;
    public final InterfaceC144596ff A03;
    public final User A04;
    public final C145726hV A05;
    public final C3G2 A06;

    public static final SpannableStringBuilder A00(C6ZZ c6zz) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        User user = c6zz.A04;
        if (c6zz.A09() && user != null && c6zz.A02.A05 != null) {
            String CAk = user.A03.CAk();
            if (CAk != null) {
                spannableStringBuilder.append((CharSequence) CAk);
                if (user.isVerified() && c6zz.A06.A00()) {
                    C85963sQ.A07(c6zz.A00, spannableStringBuilder, false);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return spannableStringBuilder;
    }

    public C6ZZ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C3G2 c3g2, C6eI c6eI, InterfaceC144596ff interfaceC144596ff, C145726hV c145726hV) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = context;
        this.A02 = c6eI;
        this.A01 = c41181vS;
        this.A03 = interfaceC144596ff;
        this.A06 = c3g2;
        this.A05 = c145726hV;
        this.A04 = c41181vS.A0i;
    }
}
