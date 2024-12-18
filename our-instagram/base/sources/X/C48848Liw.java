package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Liw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48848Liw implements C79O {
    public final /* synthetic */ AnonymousClass795 A00;

    public /* synthetic */ C48848Liw(AnonymousClass795 anonymousClass795) {
        this.A00 = anonymousClass795;
    }

    @Override // X.C79O
    public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
        SpannableStringBuilder append;
        String string;
        C83403nh c83403nh = c160787Im.A0e;
        AnonymousClass442 A0P = c83403nh.A0P();
        A0P.getClass();
        String str = A0P.A0T;
        str.getClass();
        String str2 = A0P.A0R;
        str2.getClass();
        C2EY c2ey = C2EY.A1i;
        String str3 = A0P.A0U;
        String str4 = A0P.A0Q;
        Boolean valueOf = Boolean.valueOf(A0P.A05());
        boolean A02 = AbstractC13620mo.A02(context);
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        if (A02) {
            append = A01.append((CharSequence) context.getString(2131959374));
            string = " 📎";
        } else {
            append = A01.append((CharSequence) "📎 ");
            string = context.getString(2131959374);
        }
        AnonymousClass442 anonymousClass442 = new AnonymousClass442(null, null, null, null, null, null, null, null, null, null, null, null, c2ey, null, null, null, valueOf, str2, null, str, str4, str3, append.append((CharSequence) string).toString(), null, null, 0L);
        User user = c160787Im.A0K;
        String A03 = anonymousClass442.A03();
        A03.getClass();
        boolean A012 = C4GU.A01(c83403nh.A1F);
        boolean A0E = AbstractC13670mt.A0E(anonymousClass442.A03());
        C7QL A013 = C7QK.A01(userSession, anonymousClass988, c160787Im, c7im, anonymousClass442, c2ey);
        return new AnonymousClass781(AnonymousClass541.A0J, C7QM.A02(userSession, c160787Im, anonymousClass442), A013, A03, AbstractC25231BEo.A0t(user), A012, A0E, c83403nh.A2O, AnonymousClass795.A0I(userSession, user, AbstractC167007dF.A1N(c160787Im.A00)));
    }
}
