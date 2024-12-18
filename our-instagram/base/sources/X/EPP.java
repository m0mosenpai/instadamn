package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EPP extends EPQ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C2Fb A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EPP(Context context, C012804r c012804r, UserSession userSession, C2Fb c2Fb, Integer num, String str, int i) {
        super(c012804r, Integer.valueOf(i), num, str);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = c2Fb;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC31177DnL.A0u(this.A00, this.A01, this.A02, MSV.A00(32));
    }
}
