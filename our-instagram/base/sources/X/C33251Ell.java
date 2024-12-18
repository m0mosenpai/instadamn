package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ell, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33251Ell extends AnonymousClass772 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33251Ell(FragmentActivity fragmentActivity, W65 w65, UserSession userSession, String str, String str2, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A02 = userSession;
        this.A03 = w65;
        this.A04 = str;
        this.A01 = fragmentActivity;
        this.A05 = str2;
    }

    public static void A00(C33251Ell c33251Ell, Object obj, Object obj2, String str) {
        if (obj == obj2) {
            new C7F3((UserSession) c33251Ell.A03).A09(str);
        } else {
            if (obj != C05F.A01) {
                return;
            }
            new C7F3((UserSession) c33251Ell.A03).A0A(c33251Ell.A05, c33251Ell.A04, str);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        Context context;
        UserSession userSession;
        String A04;
        C2Fb c2Fb;
        switch (this.A00) {
            case 0:
                UserSession userSession2 = (UserSession) this.A02;
                C70399WUb.A00(userSession2).A0G(((W65) this.A03).A01, this.A04);
                A0y = AbstractC25228BEl.A0y((Context) this.A01, userSession2, C2Fb.A35, this.A05);
                A0y.A0S = "promote";
                A0y.A0A();
                return;
            case 1:
                A00(this, this.A02, C05F.A00, "ai_terms");
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                A04 = C18U.A04(C06090Tz.A05, userSession, 36883353779503614L);
                c2Fb = C2Fb.A0L;
                A0y = AbstractC25228BEl.A0y(context, userSession, c2Fb, A04);
                A0y.A0A();
                return;
            case 2:
                A00(this, this.A02, C05F.A00, "ai_at_meta");
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                A04 = C18U.A04(C06090Tz.A05, userSession, 36883353779372540L);
                c2Fb = C2Fb.A0I;
                A0y = AbstractC25228BEl.A0y(context, userSession, c2Fb, A04);
                A0y.A0A();
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33251Ell(Context context, UserSession userSession, Integer num, String str, String str2, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A02 = num;
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = context;
    }
}
