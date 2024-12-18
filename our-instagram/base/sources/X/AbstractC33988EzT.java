package X;

import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EzT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33988EzT {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        int i = 1;
        Object A02 = c6fw.A02();
        AbstractC25225BEi.A1S(A02);
        String str = (String) A02;
        Object obj = c6fw.A00.get(2);
        if (obj != null) {
            i = AbstractC166987dD.A0H(obj);
        }
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        Fragment A022 = C6BQ.A02(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C1VE c1ve = C1VE.A02;
        if (c1ve != null) {
            if (i == 0) {
                C189478aR A00 = AbstractC35219FgC.A00(A04, A0W, c1ve, null);
                C1VE.A00(c1ve);
                A00.A02(A04, new C33200Ekn());
            } else {
                long A023 = AbstractC31175DnJ.A02(A0W);
                C1VE.A00(c1ve);
                C33206Ekt c33206Ekt = new C33206Ekt();
                C14360o3.A0C(c33206Ekt, "null cannot be cast to non-null type com.instagram.wellbeing.timespent.fragment.TakeABreakMenuFragment");
                BitmapDrawable A002 = AE1.A00(A04, R.drawable.instagram_clock_dotted_pano_outline_24);
                AbstractC167007dF.A1K(A0B, A0W);
                C14360o3.A0B(A04, 2);
                AbstractC167007dF.A1J(A04, 4, str);
                C1VE.A00(c1ve).A02(A04, A022, A04, A0W, new GH4(A04, A002, A022, A04, A0B, A0W, null, str, A023, false), c33206Ekt).A02(A04, c33206Ekt);
            }
            if (A022 instanceof C114485Es) {
                long A003 = C461529z.A00();
                EnumC33408Epf enumC33408Epf = EnumC33408Epf.A0I;
                long A07 = AbstractC31174DnI.A07(A0W);
                C14360o3.A0B(A0W, 0);
                C461329x.A02(A0W, enumC33408Epf, C05F.A1F, null, Long.valueOf(A003), Long.valueOf(A07), null, null);
            }
        }
        return null;
    }
}
