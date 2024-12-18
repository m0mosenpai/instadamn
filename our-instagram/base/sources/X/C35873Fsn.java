package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.Fsn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35873Fsn implements C2n2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C35873Fsn(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = obj4;
        this.A05 = z;
    }

    @Override // X.C2n2
    public final Object apply(Object obj) {
        String str;
        int i = this.A00;
        Context context = (Context) this.A01;
        if (i != 0) {
            C38321qM c38321qM = (C38321qM) this.A02;
            UserSession userSession = (UserSession) this.A03;
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A04;
            boolean z = this.A05;
            String str2 = (String) obj;
            Resources resources = context.getResources();
            int i2 = 2131971187;
            if (c38321qM.A5P()) {
                i2 = 2131971189;
            }
            String string = resources.getString(i2);
            String format = new SimpleDateFormat("MMM d, yyyy").format(new Date(c38321qM.A1B() * 1000));
            int i3 = 2131971192;
            if (c38321qM.A5P()) {
                i3 = 2131971194;
            }
            String A0r = AbstractC166997dE.A0r(resources, format, i3);
            User A14 = AbstractC25226BEj.A14(c38321qM);
            if (A14 != null && !AbstractC13670mt.A0B(A14.getUsername())) {
                str = AbstractC166997dE.A0r(resources, AnonymousClass001.A0R("@", A14.getUsername()), 2131971180);
            } else {
                str = null;
            }
            String A38 = c38321qM.A38();
            Locale locale = Locale.ROOT;
            new LLI(context, interfaceC11380iw, userSession, new C36748GHr(interfaceC11380iw, userSession, c38321qM, str2, 1, z), str2, A38, string, A0r.toUpperCase(locale), str.toUpperCase(locale), false).A05();
            return null;
        }
        UserSession userSession2 = (UserSession) this.A02;
        InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A03;
        Hashtag hashtag = (Hashtag) this.A04;
        String str3 = (String) obj;
        new LLI(context, interfaceC11380iw2, userSession2, new C36748GHr(interfaceC11380iw2, userSession2, hashtag, str3, 3, this.A05), str3, hashtag.getId(), context.getResources().getString(2131971184), AnonymousClass001.A0R("#", hashtag.getName().toUpperCase(Locale.ROOT)), null, false).A05();
        return null;
    }
}
