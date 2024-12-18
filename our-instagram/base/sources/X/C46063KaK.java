package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.KaK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46063KaK extends AnonymousClass522 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46063KaK(Context context, UserSession userSession, int i) {
        super(Integer.valueOf(i));
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC92944En.A05(this.A00, this.A01);
    }
}
