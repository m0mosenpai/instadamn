package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.Frd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35801Frd implements InterfaceC48212Jk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ C15370ps A07;
    public final /* synthetic */ boolean A08;

    public C35801Frd(Context context, UserSession userSession, Integer num, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, C15370ps c15370ps, int i, boolean z) {
        this.A07 = c15370ps;
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = num;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = interfaceC16660sJ;
        this.A08 = z;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        String string;
        C15370ps c15370ps = this.A07;
        Context context = this.A01;
        UserSession userSession = this.A02;
        int i = this.A00;
        Integer num = this.A03;
        String str = this.A05;
        String str2 = this.A04;
        boolean A1a = AbstractC31175DnJ.A1a(num);
        String A0q = AbstractC166997dE.A0q(context.getResources(), 2131966456);
        String A0q2 = AbstractC166997dE.A0q(context.getResources(), 2131966455);
        String A0q3 = AbstractC166997dE.A0q(context.getResources(), 2131966460);
        String A0q4 = AbstractC166997dE.A0q(context.getResources(), 2131966458);
        String A0q5 = AbstractC166997dE.A0q(context.getResources(), 2131966459);
        Integer num2 = C05F.A0C;
        Resources resources = context.getResources();
        if (num == num2) {
            string = AnonymousClass001.A0g(resources.getString(2131966452, A0q3, A0q4, A0q5), "\n\n", AbstractC166997dE.A0r(context.getResources(), A0q, 2131966453));
        } else {
            string = resources.getString(2131966454, A0q, A0q2);
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(string);
        AnonymousClass773.A04(A0H, new C33253Eln(context, userSession, AbstractC167007dF.A09(context, i), A1a ? 1 : 0), A0q3);
        AnonymousClass773.A04(A0H, new C33253Eln(context, userSession, AbstractC167007dF.A09(context, i), 2), A0q4);
        AnonymousClass773.A04(A0H, new C33253Eln(context, userSession, AbstractC167007dF.A09(context, i), 3), A0q5);
        AnonymousClass773.A04(A0H, new C33251Ell(context, userSession, num, str, str2, AbstractC167007dF.A09(context, i), A1a ? 1 : 0), A0q);
        AnonymousClass773.A04(A0H, new C33251Ell(context, userSession, num, str, str2, AbstractC167007dF.A09(context, i), 2), A0q2);
        c15370ps.A00 = A0H;
        this.A06.invoke(A0H);
        if (this.A08) {
            AbstractC34047F1a.A00(userSession);
        }
    }
}
