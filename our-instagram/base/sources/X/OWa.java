package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Date;

/* loaded from: classes9.dex */
public final class OWa {
    public C189478aR A00;
    public final Context A01;
    public final InterfaceC58115Ppe A02;
    public final boolean A03;
    public final boolean A04;
    public final Activity A05;
    public final UserSession A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.Context] */
    public OWa(Activity activity, UserSession userSession, InterfaceC58115Ppe interfaceC58115Ppe, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(userSession, 2);
        this.A05 = activity;
        this.A06 = userSession;
        this.A07 = str;
        this.A0A = z;
        this.A04 = z2;
        this.A08 = str2;
        this.A02 = interfaceC58115Ppe;
        this.A09 = z3;
        this.A03 = z4;
        this.A01 = z3 ? AbstractC53172bz.A01(activity) : activity;
    }

    private final C189448aO A00(String str, boolean z) {
        C189448aO A0y = AbstractC25225BEi.A0y(this.A06);
        A0y.A0k = z;
        A0y.A0q = !z;
        A0y.A1O = z;
        A0y.A11 = z;
        if (str == null) {
            str = this.A07;
        }
        A0y.A0d = str;
        C56766PHj.A00(A0y, this, 3);
        if (this.A09) {
            EnumC60792q3 enumC60792q3 = EnumC60792q3.A03;
            C14360o3.A0B(enumC60792q3, 0);
            A0y.A0O = enumC60792q3;
        }
        return A0y;
    }

    public final void A01() {
        AbstractC167007dF.A16(this.A00);
    }

    public final void A02(Boolean bool, String str, Date date, Date date2, Date date3, boolean z) {
        C189478aR A00;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean(AbstractC43591JPw.A00(367), this.A0A);
        A0b.putSerializable(AbstractC43591JPw.A00(366), date);
        A0b.putSerializable(AbstractC43591JPw.A00(364), date2);
        A0b.putSerializable(AbstractC43591JPw.A00(363), date3);
        boolean z2 = this.A04;
        A0b.putSerializable(AbstractC43591JPw.A00(368), Boolean.valueOf(z2));
        boolean z3 = this.A03;
        A0b.putSerializable("extra_show_clear_button", Boolean.valueOf(z3));
        A0b.putString(AbstractC43591JPw.A00(365), this.A08);
        V1G v1g = new V1G();
        v1g.setArguments(A0b);
        v1g.A03 = this.A02;
        if (this.A09) {
            v1g.setDayNightMode(EnumC60792q3.A03);
        }
        boolean A1Z = AbstractC166997dE.A1Z(bool, true);
        C189448aO A002 = A00(str, z);
        if (A1Z) {
            if (z2) {
                Context context = this.A01;
                A002.A0P = new A7S(AbstractC167007dF.A09(context, R.attr.igds_color_primary_button), AbstractC167007dF.A09(context, R.attr.igds_color_selected_text_background));
                C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
                c189458aP.A06 = context.getString(2131961124);
                c189458aP.A05 = new ViewOnClickListenerC55460OkF(v1g, 34);
                c189458aP.A0A = true;
                A002.A07(c189458aP.A00());
            }
            if (z3) {
                A002.A0h = this.A01.getString(2131955185);
                A002.A0L = new ViewOnClickListenerC55460OkF(v1g, 35);
            }
            A00 = A002.A00();
        } else {
            if (z2) {
                MSW.A1L(this.A01, A002, 2131961124);
                A002.A0K = new ViewOnClickListenerC55460OkF(v1g, 32);
            }
            if (z3) {
                A002.A0h = this.A01.getString(2131955185);
                A002.A0L = new ViewOnClickListenerC55460OkF(v1g, 33);
            }
            A00 = A002.A00();
            if (z2) {
                A00.A0R(true, z3);
            }
        }
        this.A00 = A00;
        C189478aR.A00(this.A05, this.A01, v1g, A00, null);
    }
}
