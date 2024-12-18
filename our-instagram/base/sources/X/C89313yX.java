package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.EnumSet;

/* renamed from: X.3yX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89313yX {
    public final UserSession A00;
    public final InterfaceC89303yW A01;

    public C89313yX(UserSession userSession, InterfaceC89303yW interfaceC89303yW) {
        C14360o3.A0B(interfaceC89303yW, 2);
        this.A00 = userSession;
        this.A01 = interfaceC89303yW;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C51760Mtj A00(Context context, C38321qM c38321qM, C75113Zb c75113Zb) {
        String str;
        String str2;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        C71313Hs A00 = C71313Hs.A00(this.A00);
        C14360o3.A07(A00);
        User A2D = c38321qM.A2D();
        if (A2D != null) {
            str = A2D.getUsername();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C38302Gsl c38302Gsl = new C38302Gsl(A00, this, c38321qM, c75113Zb);
            String string = context.getString(2131974337);
            C14360o3.A07(string);
            EnumSet enumSet = AbstractC75103Za.A00;
            spannableStringBuilder.append((CharSequence) string);
            AbstractC75103Za.A0C(spannableStringBuilder, c38302Gsl, "{username}", str);
            str2 = spannableStringBuilder;
        } else {
            str = null;
            str2 = "";
        }
        DRQ drq = new DRQ(A00, 19);
        return new C51760Mtj(37, new C51760Mtj(36, new C57262Pbk(str2, c75113Zb, str, 15), new C30487DbW(24, A00, this, c38321qM), drq), c38321qM.A1a(), str2);
    }
}
