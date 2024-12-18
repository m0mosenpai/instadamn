package X;

import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.EzU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33989EzU {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC33408Epf enumC33408Epf;
        Object A03 = c6fw.A03(1);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        int A0D = AbstractC25230BEn.A0D(c6fw.A00(), "null cannot be cast to non-null type kotlin.Number");
        Object obj = c6fw.A00.get(3);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Number");
        AbstractC25225BEi.A1R(obj);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        Fragment A02 = C6BQ.A02(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        FragmentActivity A042 = C6BQ.A04(c6fq);
        C1VE c1ve = C1VE.A02;
        long A022 = AbstractC31175DnJ.A02(A0W);
        BitmapDrawable A00 = AE1.A00(A04, R.drawable.instagram_clock_dotted_pano_outline_24);
        EnumC33408Epf[] values = EnumC33408Epf.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC33408Epf = values[i];
                if (C14360o3.A0K(enumC33408Epf.name(), AbstractC166997dE.A10(Locale.ROOT, str))) {
                    break;
                }
                i++;
            } else {
                enumC33408Epf = EnumC33408Epf.A0I;
                break;
            }
        }
        if (c1ve != null) {
            if (A0D != 0) {
                if (A0D != 1) {
                    C0f5 AEp = C18950wb.A01.AEp("IGBloksActionNavigationOpenTimeReminderSettingV2Impl_evaluate(): Invalid reminder type", 817892914);
                    AEp.ABU("reminder type", A0D);
                    AEp.report();
                    return null;
                }
                C1VE.A00(c1ve);
                C33206Ekt c33206Ekt = new C33206Ekt();
                C14360o3.A0C(c33206Ekt, "null cannot be cast to non-null type com.instagram.wellbeing.timespent.fragment.TakeABreakMenuFragment");
                C14360o3.A0B(A0B, 0);
                AbstractC167007dF.A1D(A0W, 1, A04);
                AbstractC167007dF.A1J(A042, 4, str);
                C1VE.A00(c1ve).A02(A04, A02, A042, A0W, new GH4(A04, A00, A02, A042, A0B, A0W, null, str, A022, true), c33206Ekt).A03(A04, c33206Ekt);
                C461329x.A05(A0W, enumC33408Epf, "take_break", C461529z.A00(), AbstractC31174DnI.A07(A0W));
                return null;
            }
            C189478aR A002 = AbstractC35219FgC.A00(A04, A0W, c1ve, null);
            C1VE.A00(c1ve);
            A002.A03(A04, new C33200Ekn());
            C461329x.A05(A0W, enumC33408Epf, "daily_limit", C461529z.A00(), AbstractC31174DnI.A07(A0W));
            return null;
        }
        return null;
    }
}
