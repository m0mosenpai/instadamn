package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.OKo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54813OKo {
    public final Context A00;
    public final UserSession A01;
    public final MonetizationRepository A02;
    public final InterfaceC09390do A03;

    public final SpannableStringBuilder A00(InterfaceC57962Pn8 interfaceC57962Pn8) {
        String A0p;
        int i;
        boolean A06 = C18U.A06(C06090Tz.A06, this.A01, 36319076678769575L);
        Context context = this.A00;
        if (A06) {
            A0p = AbstractC166997dE.A0p(context, 2131972000);
            i = 2131972003;
        } else {
            A0p = AbstractC166997dE.A0p(context, 2131964206);
            i = 2131966870;
        }
        String A0p2 = AbstractC166997dE.A0p(context, i);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0p);
        AnonymousClass773.A05(A0H, new C52789NXy(interfaceC57962Pn8, "https://help.instagram.com/2635536099905516", AbstractC31174DnI.A02(context)), A0p2);
        return A0H;
    }

    public final SpannableStringBuilder A01(InterfaceC57962Pn8 interfaceC57962Pn8, String str, boolean z) {
        String A0p;
        int i;
        boolean A06 = C18U.A06(C06090Tz.A06, this.A01, 36319076678769575L);
        Context context = this.A00;
        if (A06) {
            int i2 = 2131972002;
            if (z) {
                i2 = 2131972001;
            }
            A0p = AbstractC166997dE.A0p(context, i2);
            i = 2131972004;
        } else {
            int i3 = 2131964209;
            if (z) {
                i3 = 2131964207;
            }
            A0p = AbstractC166997dE.A0p(context, i3);
            i = 2131965052;
        }
        String A0p2 = AbstractC166997dE.A0p(context, i);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0p);
        AnonymousClass773.A05(A0H, new C52789NXy(interfaceC57962Pn8, str, AbstractC31174DnI.A02(context)), A0p2);
        return A0H;
    }

    public C54813OKo(Context context, UserSession userSession, MonetizationRepository monetizationRepository) {
        AbstractC167017dG.A1Q(userSession, monetizationRepository);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = monetizationRepository;
        this.A03 = C57526Pg0.A00(this, 29);
    }
}
