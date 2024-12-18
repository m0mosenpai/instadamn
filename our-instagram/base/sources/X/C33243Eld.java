package X;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eld, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33243Eld extends C36731GHa {
    public final Context A00;
    public final CompoundButton.OnCheckedChangeListener A01;
    public final Fragment A02;
    public final UserSession A03;
    public final C35033Fc6 A04;
    public final String A05;
    public final C13920nI A06;
    public final C23031Ai A07;

    public C33243Eld(Context context, Fragment fragment, UserSession userSession, C13920nI c13920nI, C23031Ai c23031Ai, C35033Fc6 c35033Fc6, CharSequence charSequence, String str, boolean z) {
        super((CompoundButton.OnCheckedChangeListener) null, charSequence, z);
        C35745Fqd c35745Fqd = new C35745Fqd(this, 44);
        this.A01 = c35745Fqd;
        this.A05 = str;
        this.A08 = c35745Fqd;
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = fragment;
        this.A04 = c35033Fc6;
        this.A07 = c23031Ai;
        this.A06 = c13920nI;
        if (C18U.A06(C06090Tz.A05, userSession, 36315980007214946L) && new C71603Jf(userSession).A07(AbstractC31177DnL.A06())) {
            this.A0D = true;
            this.A0E = true;
        }
    }

    public static void A00(CompoundButton compoundButton, C33243Eld c33243Eld, String str) {
        double d;
        C23031Ai c23031Ai;
        long currentTimeMillis;
        boolean equals = str.equals("cancel");
        C35033Fc6 c35033Fc6 = c33243Eld.A04;
        String str2 = c33243Eld.A05;
        c35033Fc6.A01(str2, str, "toggle");
        if (equals) {
            c23031Ai = c33243Eld.A07;
            currentTimeMillis = -1;
        } else {
            if ("15_minutes".equals(str)) {
                d = 0.25d;
            } else if ("1_hour".equals(str)) {
                d = 1.0d;
            } else if ("2_hour".equals(str)) {
                d = 2.0d;
            } else if ("4_hour".equals(str)) {
                d = 4.0d;
            } else if ("8_hour".equals(str)) {
                d = 8.0d;
            } else {
                d = 0.0d;
            }
            c23031Ai = c33243Eld.A07;
            currentTimeMillis = System.currentTimeMillis() + ((long) (d * 60.0d * 60.0d * 1000.0d));
        }
        c23031Ai.A0k(currentTimeMillis);
        Context context = c33243Eld.A00;
        Fragment fragment = c33243Eld.A02;
        C08790ch A00 = AbstractC018607g.A00(fragment);
        C1ON A01 = FXB.A01(c33243Eld.A03, str2, str);
        A01.A00 = new C33114EjI(compoundButton, fragment.mFragmentManager, c33243Eld, str, equals);
        C1GJ.A00(context, A00, A01);
    }
}
