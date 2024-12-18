package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.Ezr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34012Ezr {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC33408Epf enumC33408Epf;
        long j;
        long j2;
        EnumC456327x enumC456327x;
        Object A03 = c6fw.A03(1);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        int A0D = AbstractC25230BEn.A0D(c6fw.A00(), "null cannot be cast to non-null type kotlin.Number");
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A03(3), "null cannot be cast to non-null type kotlin.Number");
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        FragmentActivity A042 = C6BQ.A04(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        Fragment A01 = C6BQ.A01(c6fq);
        EnumC33408Epf[] values = EnumC33408Epf.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC33408Epf = values[i];
                if (enumC33408Epf.name().equals(AbstractC166997dE.A10(Locale.ROOT, str))) {
                    break;
                }
                i++;
            } else {
                enumC33408Epf = EnumC33408Epf.A0K;
                break;
            }
        }
        if (C18U.A06(AbstractC25225BEi.A0j(A0W, 0), A0W, 36313712264546513L)) {
            j = 1;
        } else {
            j = 60;
        }
        long j3 = A0D2 / 60;
        long j4 = j3 * j;
        if (A0D != 0) {
            if (A0D == 1) {
                long A02 = AbstractC31175DnJ.A02(A0W);
                boolean A0K = C14360o3.A0K(str, "ig_setting_shortcuts");
                j2 = 0;
                if (A02 > 0 && !A0K) {
                    Drawable drawable = A04.getDrawable(R.drawable.instagram_clock_dotted_pano_outline_24);
                    C146106i8 A0K2 = AbstractC31171DnF.A0K();
                    AbstractC25226BEj.A1N(A04, A0K2, 2131975209);
                    A0K2.A09(C56352iT.A0t.A03(A042).A0Q());
                    AbstractC31175DnJ.A0l(A04, A0K2, 2131961561);
                    A0K2.A0A(new C36516G8o(0, A042, A0B, A0W));
                    if (drawable != null) {
                        A0K2.A08(drawable, A04.getColor(AbstractC53242c7.A05(A04)));
                    }
                    A0K2.A02();
                    A0K2.A0L = true;
                    A0K2.A06();
                    AbstractC31178DnM.A1S(A0K2);
                    AbstractC31178DnM.A1O(A0W, null, C05F.A0D, AbstractC31174DnI.A07(A0W));
                } else {
                    new C29W(A0W).A03(A01, j4);
                    long A022 = AbstractC31175DnJ.A02(A0W);
                    C455127l.A03(A0W).A0S();
                    if (!A0K) {
                        AbstractC35219FgC.A03(A04, A042, A0B, A0W, str, (A022 / j) * 60);
                    }
                    enumC456327x = EnumC456327x.A0B;
                }
            }
            return null;
        }
        new C29W(A0W).A02(A01, j4);
        C146106i8 A0K3 = AbstractC31171DnF.A0K();
        A0K3.A0D = AbstractC167007dF.A0f(A04, AbstractC35189Ffh.A02(AbstractC166997dE.A0M(A04), j4), 2131957449);
        A0K3.A09(C56352iT.A0t.A03(A042).A0Q());
        A0K3.A06();
        AbstractC31178DnM.A1S(A0K3);
        j3 = C461529z.A00();
        j2 = 0;
        enumC456327x = EnumC456327x.A03;
        C461329x.A06(A0W, enumC33408Epf, enumC456327x.A00, j3, j2, AbstractC31174DnI.A07(A0W));
        return null;
    }
}
