package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class UFV extends AbstractC52922bZ {
    public boolean A00;
    public final UserSession A01;
    public final C47692L3z A02;
    public final C23031Ai A03;
    public final HashMap A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C0UO A08;

    public final void A08() {
        Object value;
        UQN A01;
        this.A00 = false;
        A02(C68030V6y.A00, this);
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
            UQN uqn = (UQN) value;
            Spannable spannable = uqn.A01;
            if (AbstractC001900j.A0T(spannable)) {
                spannable = new SpannableString("");
            }
            A01 = UQN.A01(spannable, uqn, null, null, null, 0, 16284, false, false, false, false);
        } while (!c05a.AIi(value, A01));
        A05(this, c05a);
    }

    public final void A0A(Spannable spannable, Hashtag hashtag, int i) {
        Object value;
        UQN A01;
        C14360o3.A0B(spannable, 2);
        C09530e4 A00 = AbstractC69931Vxw.A00(spannable, hashtag, '#', i);
        if (A00 != null) {
            C05A c05a = this.A07;
            do {
                value = c05a.getValue();
                A01 = UQN.A01((Spannable) A00.A00, (UQN) value, null, null, null, 0, 16319, false, false, false, false);
            } while (!c05a.AIi(value, A01));
            A03(this, ((Number) A00.A01).intValue() + 1);
        }
    }

    public /* synthetic */ UFV(UserSession userSession, C47692L3z c47692L3z) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC167017dG.A1R(userSession, A00);
        this.A02 = c47692L3z;
        this.A01 = userSession;
        this.A03 = A00;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        C16930sl c16930sl = C16930sl.A00;
        C008002u c008002u = new C008002u(new UQN(spannableStringBuilder, "", c16930sl, c16930sl, C16910sj.A00, 0, false, false, false, false, false, false, false, false));
        this.A07 = c008002u;
        this.A08 = c008002u;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A05 = c24721Ip;
        this.A06 = AbstractC07080Za.A03(c24721Ip);
        this.A04 = new HashMap();
        ((InterfaceC169517hR) c47692L3z.A05.getValue()).EYJ(new C71022Wmd(this, 1));
        ((C24036AlV) c47692L3z.A04.getValue()).A00 = new B8U(this, 5);
    }

    public static final String A00(CharSequence charSequence, char c, int i) {
        int i2 = i - 1;
        for (int i3 = i2; -1 < i3 && charSequence.charAt(i3) != ' ' && charSequence.charAt(i3) != '\n'; i3--) {
            if (charSequence.charAt(i3) == c) {
                return charSequence.subSequence(i3 + 1, i2 + 1).toString();
            }
        }
        return null;
    }

    public static final void A03(UFV ufv, int i) {
        A02(new C218129kk(((UQN) ufv.A07.getValue()).A01, i), ufv);
    }

    public static final void A04(UFV ufv, C5QL c5ql) {
        Spannable spannableString;
        Object value;
        C16930sl c16930sl;
        String str = c5ql.A00;
        if (str != null && !AbstractC001900j.A0T(str)) {
            spannableString = WE0.A00(null, c5ql, false);
        } else {
            spannableString = new SpannableString("");
        }
        AbstractC69931Vxw.A01(spannableString);
        C05A c05a = ufv.A07;
        do {
            value = c05a.getValue();
            c16930sl = C16930sl.A00;
        } while (!c05a.AIi(value, new UQN(spannableString, "", c16930sl, c16930sl, C16910sj.A00, 0, false, false, false, false, false, false, false, false)));
        A02(new C218129kk(spannableString, spannableString.length()), ufv);
    }

    public static final boolean A06(UFV ufv) {
        return AbstractC167007dF.A1Q(((UQN) ufv.A07.getValue()).A05.size(), 20);
    }

    public final void A07() {
        Object value;
        int i = this.A03.A01.getInt("story_quick_caption_dogfooding_nux_shown_count", 0);
        UserSession userSession = this.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36320180485365883L) && C1C0.A00(userSession) && i < 2) {
            A02(V71.A00, this);
            AbstractC167007dF.A18(AbstractC23021Ah.A00(userSession).A01, "story_quick_caption_dogfooding_nux_shown_count", i + 1);
        }
        C05A c05a = this.A07;
        if (!((UQN) c05a.getValue()).A0B) {
            A02(C68031V6z.A00, this);
        }
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, UQN.A01(null, (UQN) value, null, null, null, 0, 16382, true, false, false, false)));
        A05(this, c05a);
    }

    public final void A09() {
        Object value;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        C16930sl c16930sl;
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
            z = ((UQN) value).A0A;
            spannableStringBuilder = new SpannableStringBuilder("");
            c16930sl = C16930sl.A00;
        } while (!c05a.AIi(value, new UQN(spannableStringBuilder, "", c16930sl, c16930sl, C16910sj.A00, 0, z, false, false, false, false, false, false, false)));
        A05(this, c05a);
    }

    public static final void A01(Spannable spannable, UFV ufv, User user, int i) {
        C09530e4 A00;
        Object value;
        UQN A01;
        if (A06(ufv) && (A00 = AbstractC69931Vxw.A00(spannable, user, '@', i)) != null) {
            C05A c05a = ufv.A07;
            do {
                value = c05a.getValue();
                UQN uqn = (UQN) value;
                Spannable spannable2 = (Spannable) A00.A00;
                java.util.Set A0j = AbstractC001800i.A0j(uqn.A05);
                A0j.add(user.getId());
                A01 = UQN.A01(spannable2, uqn, null, null, A0j, 0, 8127, false, false, false, false);
            } while (!c05a.AIi(value, A01));
            A03(ufv, ((Number) A00.A01).intValue() + 1);
            VWS.A00(ufv.A02.A01).A01(user);
        }
    }

    public static final void A02(VIW viw, UFV ufv) {
        C141796aw A00 = AbstractC141776au.A00(ufv);
        C12T c12t = C12P.A00;
        AbstractC23641Du.A05(AnonymousClass131.A00.A06(), new C25023B5e(viw, ufv, null, 11), A00);
    }

    public static void A05(UFV ufv, C05A c05a) {
        A03(ufv, ((UQN) c05a.getValue()).A01.length());
    }
}
