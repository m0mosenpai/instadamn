package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.NXx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52788NXx extends AnonymousClass522 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52788NXx(Activity activity, Context context, UserSession userSession, String str, int i) {
        super(Integer.valueOf(i));
        this.A04 = str;
        this.A03 = userSession;
        this.A02 = context;
        this.A01 = activity;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.A00 != 0) {
            C63397SjR A0y = AbstractC25228BEl.A0y((Context) this.A01, (UserSession) this.A02, (C2Fb) this.A03, this.A04);
            A0y.A0S = C52121N4u.__redex_internal_original_name;
            A0y.A0A();
            return;
        }
        String str = this.A04;
        UserSession userSession = (UserSession) this.A03;
        C55218Oeh.A07((Activity) this.A01, (Context) this.A02, userSession, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52788NXx(Activity activity, UserSession userSession, C2Fb c2Fb, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = activity;
        this.A02 = userSession;
        this.A04 = str;
        this.A03 = c2Fb;
    }
}
