package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.FPl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34676FPl {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC58045PoW A02;

    public C34676FPl(Context context, UserSession userSession, InterfaceC58045PoW interfaceC58045PoW) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = interfaceC58045PoW;
    }

    public final OEQ A00() {
        Context context = this.A00;
        String A0p = AbstractC166997dE.A0p(context, 2131959675);
        String A0p2 = AbstractC166997dE.A0p(context, 2131959676);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0p);
        AnonymousClass773.A05(A0H, new KXT(this, AbstractC31173DnH.A01(context)), A0p2);
        return new OEQ(new OAI(new DialogInterfaceOnClickListenerC55319Ogh(this, 63), null, 2131959677), new OAI(new DialogInterfaceOnClickListenerC55319Ogh(this, 64), null, 2131959674), null, null, SpannableString.valueOf(A0H), 2131959678, 2131959678);
    }
}
