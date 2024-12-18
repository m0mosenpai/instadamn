package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.Lov, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49178Lov implements InterfaceC50437MOr {
    @Override // X.InterfaceC50437MOr
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ALW(Context context, C99E c99e, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C7IM c7im, MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, MsysThreadSubtype msysThreadSubtype, String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        String string;
        int i2;
        SpannableString spannableString;
        String str2;
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A0a(1, userSession, anonymousClass988, messagingUser, interfaceC50520MRx);
        AbstractC167017dG.A1U(c7ql, c7im);
        C14360o3.A0B(msysThreadSubtype, 12);
        int BSl = interfaceC50520MRx.BSl(i);
        boolean z5 = false;
        if (BSl != -2) {
            if (BSl != -1) {
                if (BSl != 5) {
                    if (!LLJ.A00.A06(interfaceC50520MRx, i)) {
                        string = context.getString(2131976218);
                        i2 = 2131976217;
                    }
                } else {
                    string = null;
                    str2 = InterfaceC50520MRx.A01(c99e, interfaceC50520MRx, i);
                    spannableString = AbstractC43592JPx.A07(str2);
                    Boolean valueOf = Boolean.valueOf(z5);
                    MessageIdentifier messageIdentifier = new MessageIdentifier(interfaceC50520MRx.BSx(i), String.valueOf(interfaceC50520MRx.BOG(i)));
                    long C8h = interfaceC50520MRx.C8h(i);
                    return new KTE(new C7QX(null, new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), C7P3.A0S, C2EY.A1O, messageIdentifier, null, null, C8h, false, false, false, InterfaceC50520MRx.A02(messagingUser, interfaceC50520MRx, i), false), c7ql, valueOf, spannableString, string, null, false);
                }
            }
            string = context.getString(2131968421);
            String A0p = AbstractC166997dE.A0p(context, 2131968419);
            String A0g = AnonymousClass001.A0g(A0p, System.lineSeparator(), AbstractC166997dE.A0p(context, 2131968420));
            C14360o3.A07(A0g);
            spannableString = AbstractC43592JPx.A07(A0g);
            spannableString.setSpan(new ForegroundColorSpan(AbstractC53242c7.A0F(context, R.attr.igds_color_link)), A0p.length(), A0g.length(), 33);
            z5 = true;
            Boolean valueOf2 = Boolean.valueOf(z5);
            MessageIdentifier messageIdentifier2 = new MessageIdentifier(interfaceC50520MRx.BSx(i), String.valueOf(interfaceC50520MRx.BOG(i)));
            long C8h2 = interfaceC50520MRx.C8h(i);
            return new KTE(new C7QX(null, new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), C7P3.A0S, C2EY.A1O, messageIdentifier2, null, null, C8h2, false, false, false, InterfaceC50520MRx.A02(messagingUser, interfaceC50520MRx, i), false), c7ql, valueOf2, spannableString, string, null, false);
        }
        string = context.getString(2131957603);
        i2 = 2131957602;
        str2 = context.getString(i2);
        spannableString = AbstractC43592JPx.A07(str2);
        Boolean valueOf22 = Boolean.valueOf(z5);
        MessageIdentifier messageIdentifier22 = new MessageIdentifier(interfaceC50520MRx.BSx(i), String.valueOf(interfaceC50520MRx.BOG(i)));
        long C8h22 = interfaceC50520MRx.C8h(i);
        return new KTE(new C7QX(null, new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), C7P3.A0S, C2EY.A1O, messageIdentifier22, null, null, C8h22, false, false, false, InterfaceC50520MRx.A02(messagingUser, interfaceC50520MRx, i), false), c7ql, valueOf22, spannableString, string, null, false);
    }
}
