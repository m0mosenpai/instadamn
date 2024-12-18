package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.math.BigInteger;

/* renamed from: X.EjN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33119EjN extends AbstractC32533EUj {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EnumC33510Erj A01;
    public final /* synthetic */ EnumC33500ErZ A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33119EjN(Context context, AbstractC10360h2 abstractC10360h2, EnumC33510Erj enumC33510Erj, EnumC33500ErZ enumC33500ErZ, UserSession userSession, Integer num, String str, boolean z) {
        super(abstractC10360h2);
        this.A01 = enumC33510Erj;
        this.A00 = context;
        this.A04 = num;
        this.A05 = str;
        this.A03 = userSession;
        this.A02 = enumC33500ErZ;
        this.A06 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(912656892);
        EnumC33510Erj enumC33510Erj = this.A01;
        UserSession userSession = this.A03;
        AbstractC35249Fgi.A01(enumC33510Erj, this.A02, userSession);
        Context context = this.A00;
        String A0p = AbstractC166997dE.A0p(context, 2131964654);
        User A10 = AbstractC166987dD.A10(userSession);
        Integer num = this.A04;
        String username = A10.getUsername();
        android.net.Uri A0B = AbstractC31174DnI.A0B(AbstractC31175DnJ.A04("https://www.instagram.com/invites/contact/").appendQueryParameter("utm_source", AbstractC58317Pt9.A00(818)).appendQueryParameter("utm_medium", AbstractC34302FAw.A00(num)), "utm_content", new BigInteger(A10.getId()).toString(36));
        C14360o3.A07(A0B);
        String A0t = AbstractC31174DnI.A0t(context, username, A0B.toString(), 2131964653);
        C14360o3.A07(A0t);
        FYI.A00(context, num, A0p, A0t, this.A05);
        C0f9.A0A(1497154508, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(891465514);
        C32183ECe c32183ECe = (C32183ECe) obj;
        int A0N = AbstractC167017dG.A0N(c32183ECe, 818376719);
        EnumC33510Erj enumC33510Erj = this.A01;
        UserSession userSession = this.A03;
        AbstractC35249Fgi.A02(enumC33510Erj, this.A02, userSession, c32183ECe.A00, this.A06);
        FYI.A00(this.A00, this.A04, c32183ECe.A01, c32183ECe.A00, this.A05);
        C0f9.A0A(-939001480, A0N);
        C0f9.A0A(265984311, A03);
    }
}
